package com.Matrix.ModelMonthlyReport.Cell;

import org.apache.poi.ss.usermodel.Cell;

import com.ModelExcel.Cell.AbstractStringCell;

public class StatusClient extends AbstractStringCell {
	
	private final String Owner = "Владелец";
	private final String Driver = "Водитель";
	
	public StatusClient() {}
	
	public StatusClient(Cell cell) {
		super(cell);
	}
	
	public StatusClient(String value) {
		super(value);
	}
	
	public AbstractStringCell getStructure() {
		// TODO Auto-generated method stub
		return null;
	}

	public AbstractStringCell getStructure(Cell cell) {
		
		StatusAuto statusAuto = new StatusAuto(cell);
		
		if(statusAuto.getValue().contains(Owner)) {
			Owner owner = new Owner(cell);
			return owner;
		} else if(statusAuto.getValue().contains(Driver)) {
			Driver driver = new Driver(cell);
			return driver;
		} else {
			return statusAuto;
		}
		
		
		
	}
		
	
	public void checkValue() {
		// TODO Auto-generated method stub
		
	}
	
	public class Owner extends StatusClient {

		public Owner(Cell cell) {
			super(cell);
		}
	}
	
	public class Driver extends StatusClient {

		public Driver(Cell cell) {
			super(cell);
		}
		
	}


	
}
