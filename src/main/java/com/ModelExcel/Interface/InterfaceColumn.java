package com.ModelExcel.Interface;

import java.util.ArrayList;
import java.util.List;


import com.ModelExcel.Cell.AbstractStringCell;

public interface InterfaceColumn {
	
	public String getName();
	public void setName(String name);
	
	public int getIndex();
	public void setIndex(int index);
		
	public void setArrayCell(List<AbstractStringCell> cells);
	public ArrayList<AbstractStringCell> getCells();
	
	public void addCells(AbstractStringCell cell);
		
	
	
	public AbstractStringCell getCell();
	
	
}
