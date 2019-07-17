package com.Matrix.ModelMonthlyReport.Cell;

import org.apache.poi.ss.usermodel.Cell;

import com.ModelExcel.Cell.AbstractStringCell;

public class Comment extends AbstractStringCell {
	
	public Comment() {}
	
	public Comment(Cell cell) {
		super(cell);
	}
	
	public Comment(String value) {
		
		super(value);
		
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void checkValue() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AbstractStringCell getStructure() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractStringCell getStructure(Cell cell) {
		// TODO Auto-generated method stub
		return null;
	}

}
