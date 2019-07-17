package com.Matrix.ModelMonthlyReport.Row;

import java.io.Serializable;

import com.Matrix.ModelMonthlyReport.Cell.CategorySales;
import com.Matrix.ModelMonthlyReport.Cell.MiddleName;
import com.Matrix.ModelMonthlyReport.Cell.Name;
import com.Matrix.ModelMonthlyReport.Cell.NameOrganization;
import com.Matrix.ModelMonthlyReport.Cell.StatusAuto;
import com.Matrix.ModelMonthlyReport.Cell.StatusClient;
import com.Matrix.ModelMonthlyReport.Cell.Surname;
import com.Matrix.ModelMonthlyReport.Cell.TypeClient;
import com.Matrix.ModelMonthlyReport.Cell.TypeSales;

public class RowCheck implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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

	public NameOrganization getOrganization() {
		return organization;
	}

	public CategorySales getCategorySales() {
		return categorySales;
	}

	public TypeSales getTypeSales_1() {
		return typeSales_1;
	}

	public TypeSales getTypeSales_2() {
		return typeSales_2;
	}

	public StatusAuto getStatusAuto() {
		return statusAuto;
	}

	public StatusClient getStatusClient() {
		return statusClient;
	}

	public TypeClient getTypeClient() {
		return typeClient;
	}

	public Surname getSurname_KO() {
		return surname_KO;
	}

	public Name getName_KO() {
		return name_KO;
	}

	public MiddleName getMiddleName_KO() {
		return middleName_KO;
	}

	public Surname getSurname_VO() {
		return surname_VO;
	}

	public Name getName_VO() {
		return name_VO;
	}

	public MiddleName getMiddleName_VO() {
		return middleName_VO;
	}

	public void setOrganization(NameOrganization organization) {
		this.organization = organization;
	}

	public void setCategorySales(CategorySales categorySales) {
		this.categorySales = categorySales;
	}

	public void setTypeSales_1(TypeSales typeSales_1) {
		this.typeSales_1 = typeSales_1;
	}

	public void setTypeSales_2(TypeSales typeSales_2) {
		this.typeSales_2 = typeSales_2;
	}

	public void setStatusAuto(StatusAuto statusAuto) {
		this.statusAuto = statusAuto;
	}

	public void setStatusClient(StatusClient statusClient) {
		this.statusClient = statusClient;
	}

	public void setTypeClient(TypeClient typeClient) {
		this.typeClient = typeClient;
	}

	public void setSurname_KO(Surname surname_KO) {
		this.surname_KO = surname_KO;
	}

	public void setName_KO(Name name_KO) {
		this.name_KO = name_KO;
	}

	public void setMiddleName_KO(MiddleName middleName_KO) {
		this.middleName_KO = middleName_KO;
	}

	public void setSurname_VO(Surname surname_VO) {
		this.surname_VO = surname_VO;
	}

	public void setName_VO(Name name_VO) {
		this.name_VO = name_VO;
	}

	public void setMiddleName_VO(MiddleName middleName_VO) {
		this.middleName_VO = middleName_VO;
	}

}
