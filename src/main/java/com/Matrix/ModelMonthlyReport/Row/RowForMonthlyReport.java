package com.Matrix.ModelMonthlyReport.Row;

import com.Matrix.ModelMonthlyReport.Cell.CategorySales;
import com.Matrix.ModelMonthlyReport.Cell.MiddleName;
import com.Matrix.ModelMonthlyReport.Cell.Name;
import com.Matrix.ModelMonthlyReport.Cell.NameOrganization;
import com.Matrix.ModelMonthlyReport.Cell.StatusAuto;
import com.Matrix.ModelMonthlyReport.Cell.StatusClient;
import com.Matrix.ModelMonthlyReport.Cell.Surname;
import com.Matrix.ModelMonthlyReport.Cell.TypeClient;
import com.Matrix.ModelMonthlyReport.Cell.TypeSales;
import com.ModelExcel.Column.Column;
import com.ModelExcel.Row.MyRow;

public class RowForMonthlyReport extends MyRow {

	NameOrganization organization = new NameOrganization();
	CategorySales categorySales = new CategorySales();
	TypeSales typeSales_1 = new TypeSales();
	TypeSales typeSales_2 = new TypeSales();
	StatusAuto statusAuto = new StatusAuto();
	StatusClient statusClient = new StatusClient();
	TypeClient typeClient = new TypeClient();

	Surname surname_KO = new Surname();
	Name name_KO = new Name();
	MiddleName middleName_KO = new MiddleName();

	Surname surname_VO = new Surname();
	Name name_VO = new Name();
	MiddleName middleName_VO = new MiddleName();

	Column nameOrganization_Column = new Column("Название организации", organization);
	Column categorySales_Column = new Column("Категория сделки", categorySales);
	Column typeSales_1_Column = new Column("Тип продажи 1", typeSales_1);
	Column typeSales_2_Column = new Column("Тип продажи 2 (продажа конечному потребителю)", typeSales_2);
	Column statusAuto_Column = new Column("Статус а/м (Новый / С пробегом / Продажа предрапорта)", statusAuto);
	Column statusClient_Column = new Column("Статус клиента (Владелец / Водитель)", statusClient);
	Column typeClient_Column = new Column("Тип клиента (лизингодатель / лизингополучатель)", typeClient);

	Column surname_KO_Column = new Column("Фамилия_КО", surname_KO);
	Column name_KO_Column = new Column("Имя_КО", name_KO);
	Column middleName_KO_Column = new Column("Отчество_КО", middleName_KO);

	Column surname_VO_Column = new Column("Фамилия_ВО", surname_VO);
	Column name_VO_Column = new Column("Имя_ВО", name_VO);
	Column middleName_VO_Column = new Column("Отчество_ВО", middleName_VO);

	public RowForMonthlyReport() {

		addColumn(nameOrganization_Column);
		addColumn(categorySales_Column);
		addColumn(typeSales_1_Column);
		addColumn(typeSales_2_Column);
		addColumn(statusAuto_Column);
		addColumn(statusClient_Column);

		addColumn(surname_KO_Column);
		addColumn(name_KO_Column);
		addColumn(middleName_KO_Column);

		addColumn(surname_VO_Column);
		addColumn(name_VO_Column);
		addColumn(middleName_VO_Column);

		addColumn(typeClient_Column);
	}

}
