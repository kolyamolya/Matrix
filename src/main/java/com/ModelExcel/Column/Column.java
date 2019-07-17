package com.ModelExcel.Column;

import java.util.ArrayList;
import java.util.List;


import com.ModelExcel.Cell.AbstractStringCell;
import com.ModelExcel.Interface.InterfaceColumn;

public class Column implements InterfaceColumn {

	private String name;
	private int index;

	private ArrayList<AbstractStringCell> cells = new ArrayList<AbstractStringCell>();

	private AbstractStringCell cell;

	public Column(String name, AbstractStringCell cell) {
		this.cell = cell;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setArrayCell(ArrayList<AbstractStringCell> cells) {
		this.cells = cells;

	}

	public ArrayList<AbstractStringCell> getCells() {
		return cells;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void addCells(AbstractStringCell cellEx) {
		cells.add(cellEx);
	}

	public void setArrayCell(List<AbstractStringCell> cells) {
	}

	public AbstractStringCell getCell() {
		return cell;
	}

}
