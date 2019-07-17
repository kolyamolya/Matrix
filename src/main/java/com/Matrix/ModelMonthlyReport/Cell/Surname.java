package com.Matrix.ModelMonthlyReport.Cell;

import org.apache.poi.ss.usermodel.Cell;

import com.ModelExcel.Cell.AbstractStringCell;

public class Surname extends AbstractStringCell {
	
	public Surname() {}
	
	public String value = "Пусто";
	
	public Surname(Cell cell) {
		super(cell);
	}
	
	public Surname(String value) {
		super(value);
	}
	
	public void checkValue() {
			
	}

	public AbstractStringCell getStructure() {
		// TODO Auto-generated method stub
		return null;
	}

	public AbstractStringCell getStructure(Cell cell) {
		// TODO Auto-generated method stub
		return null;
	}

}
