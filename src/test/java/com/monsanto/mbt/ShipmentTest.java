package com.monsanto.mbt;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class ShipmentTest {

    @Test
    public void testShipment_Sorted_By_Color(){
        //Implement your solution to get list of shipments
    	List<Shipment> sList = new Shipment().Shipment_Sorted_By_Color();
    	List<Widget> sampleWidgets = WidgetUtils.getSampleWidgets();
    	
    	int listSize=0;    	
    	for(Shipment s: sList) {
    		assertTrue("Shipment has Maximum 10 widgets", sList.size()<=10);
    		listSize += s.widget.size();
    	}
    	
    	assertEquals("Number of widgets in Shipment",sampleWidgets.size(), listSize);
    	
    	Widget firstWidget = sList.get(0).widget.get(0);
    	assertEquals("First serialnumber after order by color", 2, firstWidget.getSerialNumber());
    	
    }

    @Test
    public void testShipment_Sorted_By_Date(){
        
    	List<Shipment> sList = new Shipment().Shipment_Sorted_By_Date();
    	List<Widget> sampleWidgets = WidgetUtils.getSampleWidgets();
    	
    	int listSize=0;    	
    	for(Shipment s: sList) {
    		assertTrue("Shipment has Maximum 10 widgets", sList.size()<=10);
    		listSize += s.widget.size();
    	}
    	
    	assertEquals("Number of widgets in Shipment",sampleWidgets.size(), listSize);
    	
    	Widget firstWidget = sList.get(0).widget.get(0);
    	assertEquals("First serialnumber after order by Date", 9, firstWidget.getSerialNumber());

    }


}
