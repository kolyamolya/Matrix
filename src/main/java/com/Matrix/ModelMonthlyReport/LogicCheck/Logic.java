package com.Matrix.ModelMonthlyReport.LogicCheck;

import java.util.ArrayList;

import com.Matrix.ModelMonthlyReport.Row.RowCheck;
import com.Matrix.ModelMonthlyReport.Row.RowForTable;

public class Logic {

	ArrayList<RowCheck> rowChecks;
	
	public Logic() {}
	
	public Logic(ArrayList<RowCheck> rowChecks) {

		this.rowChecks = rowChecks;
	}

	public boolean checkMatrix(RowForTable rowForTable, RowCheck rowCheck) {

		return checkStructure(rowForTable, rowCheck) && checkCategorySales(rowForTable, rowCheck) && checkTypeSales_1(rowForTable, rowCheck) && checkTypeSales_2(rowForTable, rowCheck) && checkStatusAuto(rowForTable, rowCheck)
				&& checkStatusClient(rowForTable, rowCheck) && checkTypeClient(rowForTable, rowCheck) && check_KO(rowForTable, rowCheck) && check_VO(rowForTable, rowCheck);

	}
	
	public void checkCount(RowForTable rowForTable) {
		if(rowForTable.getCountVin().getCount() == 1 && rowForTable.getComment().getValue().isEmpty()) {
			rowForTable.getStatusConformity().setValue("Лизингополучатель не указан : " + rowForTable.getStatusConformity().getValue());
		}		
	}
	
	private boolean checkStructure(RowForTable rowForTable, RowCheck rowCheck) {
		return rowForTable.getOrganization().getStatusOrganization().equals(rowCheck.getOrganization().getStatusOrganization());
	}

	private boolean checkCategorySales(RowForTable rowForTable, RowCheck rowCheck) {
		return rowForTable.getCategorySales().getValue().equals(rowCheck.getCategorySales().getValue());
	}

	private boolean checkTypeSales_1(RowForTable rowForTable, RowCheck rowCheck) {
		return rowForTable.getTypeSales_1().getValue().equals(rowCheck.getTypeSales_1().getValue());
	}

	private boolean checkTypeSales_2(RowForTable rowForTable, RowCheck rowCheck) {
		return rowForTable.getTypeSales_2().getValue().equals(rowCheck.getTypeSales_2().getValue());
	}

	private boolean checkStatusAuto(RowForTable rowForTable, RowCheck rowCheck) {
		return rowForTable.getStatusAuto().getValue().equals(rowCheck.getStatusAuto().getValue());
	}

	private boolean checkStatusClient(RowForTable rowForTable, RowCheck rowCheck) {
		return rowForTable.getStatusClient().getValue().equals(rowCheck.getStatusClient().getValue());
	}

	private boolean checkTypeClient(RowForTable rowForTable, RowCheck rowCheck) {
		return rowForTable.getTypeClient().getValue().equals(rowCheck.getTypeClient().getValue());
	}

	private boolean check_KO(RowForTable rowForTable, RowCheck rowCheck) {

		if (rowCheck.getSurname_KO().getValue().isEmpty()) {
			if (rowForTable.getSurname_KO().getValue().isEmpty()) {
				return true;
			}
		} else if (!rowForTable.getSurname_KO().getValue().isEmpty()) {
			return true;
		} return false;

	}

	private boolean check_VO(RowForTable rowForTable, RowCheck rowCheck) {

		if (rowCheck.getSurname_VO().getValue().isEmpty()) {
			if (rowForTable.getSurname_VO().getValue().isEmpty()) {
				return true;
			}
		} else if (!rowForTable.getSurname_VO().getValue().isEmpty()) {
			return true;
		} return false;
	}

}
