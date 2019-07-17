package com.Matrix.ModelMonthlyReport.Row;

import com.Matrix.ModelMonthlyReport.Cell.CategorySales;
import com.Matrix.ModelMonthlyReport.Cell.Comment;
import com.Matrix.ModelMonthlyReport.Cell.CountVIN;
import com.Matrix.ModelMonthlyReport.Cell.MiddleName;
import com.Matrix.ModelMonthlyReport.Cell.Name;
import com.Matrix.ModelMonthlyReport.Cell.NameOrganization;
import com.Matrix.ModelMonthlyReport.Cell.StatusAuto;
import com.Matrix.ModelMonthlyReport.Cell.StatusClient;
import com.Matrix.ModelMonthlyReport.Cell.StatusConformity;
import com.Matrix.ModelMonthlyReport.Cell.Surname;
import com.Matrix.ModelMonthlyReport.Cell.TypeClient;
import com.Matrix.ModelMonthlyReport.Cell.TypeSales;
import com.Matrix.ModelMonthlyReport.Cell.VIN;
import com.ModelExcel.Row.MyRow;

public class RowForTable extends MyRow {

	StatusConformity statusConformity = new StatusConformity();
	VIN vin = new VIN();
	CountVIN countVin = new CountVIN();
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

	Comment comment = new Comment();

	public RowForTable() {

		organization.setName("Название организации");
		organization.setIndex(0);

		categorySales.setName("Категория сделки");
		categorySales.setIndex(48);

		typeSales_1.setName("Тип продажи 1");
		typeSales_1.setIndex(45);

		typeSales_2.setName("Тип продажи 2 (продажа конечному потребителю)");
		typeSales_2.setIndex(46);

		statusAuto.setName("Статус а/м (Новый / С пробегом / Продажа предрапорта)");
		statusAuto.setIndex(38);

		vin.setName("VIN");
		vin.setIndex(39);

		statusClient.setName("Статус клиента (Владелец / Водитель)");
		statusClient.setIndex(20);

		typeClient.setName("Тип клиента (лизингодатель / лизингополучатель)");
		typeClient.setIndex(49);

		surname_KO.setName("Фамилия_КО");
		surname_KO.setIndex(12);

		name_KO.setName("Имя_КО");
		name_KO.setIndex(13);

		middleName_KO.setName("Отчество_КО");
		middleName_KO.setIndex(14);

		surname_VO.setName("Фамилия_ВО");
		surname_VO.setIndex(21);

		name_VO.setName("Имя_ВО");
		name_VO.setIndex(22);

		middleName_VO.setName("Отчество_ВО");
		middleName_VO.setIndex(23);

		comment.setName("Комментарий");
		comment.setIndex(50);

	}

	public CountVIN getCountVin() {
		return countVin;
	}

	public void setCountVin(CountVIN countVin) {
		this.countVin = countVin;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public VIN getVin() {
		return vin;
	}

	public void setVin(VIN vin) {
		this.vin = vin;
	}

	public StatusConformity getStatusConformity() {
		return statusConformity;
	}

	public void setStatusConformity(StatusConformity statusConformity) {
		this.statusConformity = statusConformity;
	}

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
