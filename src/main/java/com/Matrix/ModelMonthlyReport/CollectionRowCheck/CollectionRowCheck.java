package com.Matrix.ModelMonthlyReport.CollectionRowCheck;

import java.io.Serializable;
import java.util.ArrayList;

import com.Matrix.ModelMonthlyReport.Row.RowCheck;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CollectionRowCheck implements Serializable {

	private ObservableList<RowCheck> rowCheckList = FXCollections.observableArrayList();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void add(RowCheck rowCheck) {
		rowCheckList.add(rowCheck);
	}

	public void delete(RowCheck rowCheck) {
		rowCheckList.remove(rowCheck);
	}

	public ObservableList<RowCheck> getRowCheckList() {
		return rowCheckList;
	}
	
	public void setRowCheckList(ArrayList<RowCheck> rowCheckList) {
		this.rowCheckList = FXCollections.observableArrayList(rowCheckList);
	}
	
}
