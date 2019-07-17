package com.Matrix.ModelMonthlyReport.Cell;

import org.apache.poi.ss.usermodel.Cell;

import com.ModelExcel.Cell.AbstractStringCell;

public class TypeClient extends AbstractStringCell {

	private final String lessor = "Лизингодатель";
	private final String lessee = "Лизингополучатель";

	public TypeClient() {
	}

	public TypeClient(Cell cell) {
		super(cell);
	}

	public TypeClient(String value) {
		super(value);
	}

	public void checkValue() {
		// TODO Auto-generated method stub

	}

	public AbstractStringCell getStructure() {
		
		if(value.contains(lessee)) {
			Lessee lesee = new Lessee(value);
			return lesee;
		} else if (value.contains(lessor)) {
			Lessor lessor = new Lessor(value);
			return lessor;
		}
		
		return null;
	}

	public AbstractStringCell getStructure(Cell cell) {

		TypeClient typeClient = new TypeClient(cell);

		if (typeClient.getValue().contains(lessee)) {
			Lessee lesee = new Lessee(cell);
			return lesee;
		} else if (typeClient.getValue().contains(lessor)) {
			Lessor lessor = new Lessor(cell);
			return lessor;
		} else {
			return typeClient;
		}

	}

	public class Lessor extends TypeClient {
		
		public Lessor(String value) {
			super(value);
		}
		
		public Lessor(Cell cell) {
			super(cell);
		}

	}

	public class Lessee extends TypeClient {
		
		public Lessee(String value) {
			super(value);
		}
		
		public Lessee(Cell cell) {
			super(cell);
		}

	}

}
