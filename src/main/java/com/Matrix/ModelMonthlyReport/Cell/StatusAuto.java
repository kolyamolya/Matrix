package com.Matrix.ModelMonthlyReport.Cell;

import org.apache.poi.ss.usermodel.Cell;

import com.ModelExcel.Cell.AbstractStringCell;

public class StatusAuto extends AbstractStringCell {

	private final String NEW = "Новый";
	private final String PREDORPORT = "Продажа предрапорта";
	private final String USED_CAR = "С пробегом";
	
	public StatusAuto() {};
	
	public StatusAuto(Cell cell) {
		super(cell);
	}

	public StatusAuto(String value) {
		super(value);
	}

	public void checkValue() {
		// TODO Auto-generated method stub

	}

	public AbstractStringCell getStructure() {
		if(value.contains(NEW)) {
			New newOnj = new New(value);
			return newOnj;
		} else if (value.contains(USED_CAR)) {
			UsedCar usedCar = new UsedCar(value);
			return usedCar;
		} else if (value.contains(PREDORPORT)) {
			SalesOfPredorport salesOfPredorport = new SalesOfPredorport(value);
			return salesOfPredorport;
		}
		return null;
	}

	public AbstractStringCell getStructure(Cell cell) {
		StatusAuto statusAuto = new StatusAuto(cell);
		if (statusAuto.getValue().contains(NEW)) {
			New newOnj = new New(cell);
			return newOnj;
		} else if (statusAuto.getValue().contains(USED_CAR)) {
			UsedCar usedCar = new UsedCar(cell);
			return usedCar;
		} else if (statusAuto.getValue().contains(PREDORPORT)) {
			SalesOfPredorport salesOfPredorport = new SalesOfPredorport(cell);
			return salesOfPredorport;
		} else {
			return statusAuto;
		}

	}

	public class New extends StatusAuto {
		
		public New(String value) {
			super(value);
		}
		
		public New(Cell cell) {
			super(cell);
			// TODO Auto-generated constructor stub
		}

	}

	public class SalesOfPredorport extends StatusAuto {
		
		public SalesOfPredorport(String value) {
			super(value);
		}
		
		public SalesOfPredorport(Cell cell) {
			super(cell);
			// TODO Auto-generated constructor stub
		}

	}

	public class UsedCar extends StatusAuto {
		
		public UsedCar(String value) {
			super(value);
		}
		
		public UsedCar(Cell cell) {
			super(cell);
			// TODO Auto-generated constructor stub
		}
	}

}
