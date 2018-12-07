package com.monsanto.mbt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shipment {

	public List<Widget> widget = new ArrayList<Widget>();
	public List<Shipment> Shipment_Sorted_By_Color(){
		List<Widget> widgets = WidgetUtils.getSampleWidgets();
		
		Collections.sort(widgets, new Comparator<Widget>(){
		  public int compare(Widget w1, Widget w2){
		    return w1.getColor().toLowerCase().compareTo(w2.getColor().toLowerCase());
		  }
		});
		
		return getShipments(widgets);
	}
	
	public List<Shipment> Shipment_Sorted_By_Date(){
		List<Widget> widgets = WidgetUtils.getSampleWidgets();
		
		Collections.sort(widgets, new Comparator<Widget>(){
		  public int compare(Widget w1, Widget w2){
		    return w1.getProductionDate().compareTo(w2.getProductionDate());
		  }
		});
		
		return getShipments(widgets);
	}
	
	public List<Shipment> getShipments(List<Widget> widgets) {
		
		if(null == widgets || widgets.isEmpty()) return null;
		
		int fromIndex=0;		
		List<Shipment> shipList = new ArrayList<Shipment>();
		
		try {
			while(true) {
				Shipment shipment = new Shipment();
				int toIndex=fromIndex+10;
				if(toIndex > widgets.size()){
					shipment.widget=widgets.subList(fromIndex, widgets.size());
					shipList.add(shipment);
					break;
				}
				else {
					shipment.widget=widgets.subList(fromIndex, toIndex);
					shipList.add(shipment);
					fromIndex=toIndex;
				}				
			}
		}
		catch(IndexOutOfBoundsException e) {
			
		}
		
		return shipList;
	}
}
