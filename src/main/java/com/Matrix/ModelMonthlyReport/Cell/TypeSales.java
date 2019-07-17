package com.Matrix.ModelMonthlyReport.Cell;

import org.apache.poi.ss.usermodel.Cell;

import com.ModelExcel.Cell.AbstractStringCell;

public class TypeSales extends AbstractStringCell {
		
	private final String PREDORPORT = "Предрапорт"; 
	private final String DEMO = "Демо"; 
	private final String FLEET = "Флит"; 
	private final String LEASING = "Лизинг"; 
	private final String REPLACEMENT = "Подменный";
	
	public TypeSales() {};
	
	public TypeSales(String value) {
		super(value);
	}
	
	public TypeSales(Cell cell) {
		super(cell);
	}

	public void checkValue() {
		// TODO Auto-generated method stub

	}
	
	public AbstractStringCell getStructure() {
		if(value.contains(LEASING)) {
			Leasing leasing = new Leasing(value);
			return leasing;
		} else if(value.contains(DEMO)) {
			Demo demo = new Demo(value);
			return demo;
		} else if(value.contains(FLEET)) {
			Fleet fleet = new Fleet(value);
			return fleet;
		} else if(value.contains(PREDORPORT)) {
			Predorport predorport = new Predorport(value);
			return predorport;
		} else if(value.contains(REPLACEMENT)) {
			Replacement replacement = new Replacement(value);
			return replacement;
		}
		
		return null;
	}

	public AbstractStringCell getStructure(Cell cell) {
		
		TypeSales typeSales = new TypeSales(cell);
		
		if(typeSales.getValue().contains(PREDORPORT)){
			Predorport predorport = new Predorport(cell);
			return predorport;
		} else if (typeSales.getValue().contains(DEMO)) {
			Demo demo = new Demo(cell);
			return demo;
		} else if (typeSales.getValue().contains(FLEET)) {
			Fleet fleet = new Fleet(cell);
			return fleet;
		} else if (typeSales.getValue().contains(LEASING)) {
			Leasing leasing = new Leasing(cell);
			return leasing;
		} else if (typeSales.getValue().contains(REPLACEMENT)) {
			Replacement replacement = new Replacement(cell);
			return replacement;
		} else {
			return typeSales;
		}
		
		
	}
	
	
	
	
	public class Predorport extends TypeSales {
		
		public Predorport(String value) {
			super(value);
		}
		
		public Predorport(Cell cell) {
			super(cell);
			// TODO Auto-generated constructor stub
		}

	}
	
	public class Demo extends TypeSales {
		
		public Demo(String value) {
			super(value);
		}
		
		public Demo(Cell cell) {
			super(cell);
			// TODO Auto-generated constructor stub
		}
		
	}
	
	public class Fleet extends TypeSales {
		
		public Fleet(String value) {
			super(value);
		}
		
		
		public Fleet(Cell cell) {
			super(cell);
			// TODO Auto-generated constructor stub
		}
		
	}
	
	public class Leasing extends TypeSales {
		
		public Leasing(String value) {
			super(value);
		}
		
				
		public Leasing(Cell cell) {
			super(cell);
			// TODO Auto-generated constructor stub
		}
		
	}
	
	public class Replacement extends TypeSales {
		
		public Replacement(String value) {
			super(value);
		}
		
		public Replacement(Cell cell) {
			super(cell);
			// TODO Auto-generated constructor stub
		}
		
	}

	
}
