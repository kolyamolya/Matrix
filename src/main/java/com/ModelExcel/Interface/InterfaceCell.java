package com.ModelExcel.Interface;

import org.apache.poi.ss.usermodel.Cell;

import com.ModelExcel.Cell.AbstractStringCell;

public interface InterfaceCell {
	
		
	public Cell getCell();
	public void setCell(Cell cell);
	
	public String getValue();
	public void setValue(String value);
	
	public void checkValue();
	
	public AbstractStringCell getStructure();
	public AbstractStringCell getStructure(Cell cell);
	
	public String getName();
	public void setName(String name);
	
	public int getIndex();
	public void setIndex(int index);
	
	
}
