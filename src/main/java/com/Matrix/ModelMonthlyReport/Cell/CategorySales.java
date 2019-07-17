package com.Matrix.ModelMonthlyReport.Cell;

import javax.swing.text.Element;

import org.apache.poi.ss.usermodel.Cell;

import com.ModelExcel.Cell.AbstractStringCell;

public class CategorySales extends AbstractStringCell {
	
	private final String A = "A";
	private final String A1 = "A1";
	private final String A2 = "A2";
	private final String B = "B";
	private final String C = "C";
	private final String D = "D";
	private final String E = "E";
	private final String G = "G";
	private final String P = "P";
	private final String V = "V";
	
	private String name = "Категория сделки";
	
	public CategorySales() {}
	
	public CategorySales(Cell cell) {
		super(cell);
	}

	public CategorySales(String value) {
		super(value);
	}

	public void checkValue() {
		// TODO Auto-generated method stub
	}

	public AbstractStringCell getStructure() {
		// TODO Auto-generated method stub
		return null;
	}

	public AbstractStringCell getStructure(Cell cell) {
		CategorySales categorySales = new CategorySales(cell);
		if(categorySales.getValue().contains(A)) {
			 A a = new A(cell);
			 return a;
		} else if (categorySales.getValue().contains(A1)) {
			A1 a1 = new A1(cell);
			return a1;
		} else if (categorySales.getValue().contains(A2)) {
			A2 a2 = new A2(cell);
			return a2;
		} else if (categorySales.getValue().contains(B)) {
			B b = new B(cell);
			return b;
		} else if (categorySales.getValue().contains(C)) {
			C c = new C(cell);
			return c;
		} else if(categorySales.getValue().contains(D)) {
			D d = new D(cell);
			return d;
		} else if(categorySales.getValue().contains(E)) {
			E e = new E(cell);
			return e;
		} else if (categorySales.getValue().contains(G)) {
			G g = new G(cell);
			return g;
		} else if (categorySales.getValue().contains(P)) {
			P p = new P(cell);
			return p;
		} else if (categorySales.getValue().contains(V)) {
			V v = new V(cell);
			return v;
		} else {
			return categorySales;
		}
		
	}

	public class A extends CategorySales {

		public A(Cell cell) {
			super(cell);
			// TODO Auto-generated constructor stub
		}

	}

	public class A1 extends CategorySales {

		public A1(Cell cell) {
			super(cell);
			// TODO Auto-generated constructor stub
		}

	}

	public class A2 extends CategorySales {

		public A2(Cell cell) {
			super(cell);
			// TODO Auto-generated constructor stub
		}

	}

	public class B extends CategorySales {

		public B(Cell cell) {
			super(cell);
			// TODO Auto-generated constructor stub
		}

	}

	public class C extends CategorySales {

		public C(Cell cell) {
			super(cell);
			// TODO Auto-generated constructor stub
		}

	}

	public class D extends CategorySales {

		public D(Cell cell) {
			super(cell);
			// TODO Auto-generated constructor stub
		}

	}

	public class E extends CategorySales {

		public E(Cell cell) {
			super(cell);
			// TODO Auto-generated constructor stub
		}

	}

	public class G extends CategorySales {

		public G(Cell cell) {
			super(cell);
			// TODO Auto-generated constructor stub
		}

	}

	public class P extends CategorySales {
		public P(Cell cell) {
			super(cell);
			// TODO Auto-generated constructor stub
		}
	}

	public class V extends CategorySales {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public V(Cell cell) {
			super(cell);
			// TODO Auto-generated constructor stub
		}
	}

}
