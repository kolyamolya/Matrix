package com.ModelExcel.Cell;

import java.io.Serializable;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;

import com.ModelExcel.Interface.InterfaceCell;

public abstract class AbstractStringCell implements InterfaceCell, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int index;
	
	private String statusOrganization = "";
	
	protected Cell cell;
	protected String value = "";

	public AbstractStringCell() {
	};
	
	
	public AbstractStringCell(Cell cell) {
		if (isNull(cell)) {
			this.value = "";
		} else if (cell.getCellType() == CellType.STRING) {
			this.cell = cell;
			this.value = cell.getStringCellValue();
		}
	}

	public AbstractStringCell(String value) {
		if (value == null) {
			this.value = "";
		} else {
			this.value = value;
		}
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Cell getCell() {
		return cell;
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
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public String getStatusOrganization() {
		return statusOrganization;
	}
	
	
	
	
	public void setCell(Cell cell) {
		if (isNull(cell)) {
			this.value = "";
		} else if (cell.getCellType() == CellType.STRING) {
			this.cell = cell;
			this.value = cell.getStringCellValue();
		}
	}

	public String deleteDigAndSpac() {
		if (value != null) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < value.length(); i++) {
				if (Character.isLetterOrDigit(value.charAt(i)))
					sb.append(value.charAt(i));
			}
			return sb.toString().toLowerCase();
		}
		return "Пусто";
	}

	public String deleteDigAndSpac(String val) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < val.length(); i++) {
			if (Character.isLetterOrDigit(val.charAt(i)))
				sb.append(val.charAt(i));
		}
		return sb.toString().toLowerCase();
	}

	private boolean isNull(Cell cell) {
		return cell == null || cell.getCellType() == CellType.BLANK || cell.getCellType() == CellType._NONE || cell.getCellType() == CellType.ERROR;
	}
}
