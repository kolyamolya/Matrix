package com.Matrix.ModelMonthlyReport.Cell;

import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;

import com.ModelExcel.Cell.AbstractStringCell;

public class NameOrganization extends AbstractStringCell {

	private String statusOrganization = "";

	private List<String> leasing = Arrays.asList("ООО МЭЙДЖОР ПРОФИ", "ООО ЛИЗПЛАН", "Лизинг", "ООО КАРКАДЕ", "КАРКАДЕ", "ЕВРОПЛАН", "АО ЛК ЕВРОПЛАН", "ООО АЛЬФАМОБИЛЬ", "ООО ГПБЛ-СТАНДАРТ", "ООО АЛД АВТОМОТИВ", "АРВАЛ");

	private List<String> delaer = Arrays.asList("2625", "2628", "2651", "2654", "2660", "2669", "2688", "2702", "2711", "2714", "2724", "2726", "2732", "2737", "2741", "2742", "2750", "2752", "2755", "2756", "2757", "2761", "2762", "2763", "2764",
			"2765", "2766", "2768", "2769", "2770", "2771", "2774", "2776", "2758", "2772", "ОБУХОВ-УРАЛ", "СВИД-МОБИЛЬ", "VOLVO CAR ЯРОСЛАВЛЬ", "INCHCAPE ЦЕНТР", "INCHCAPE ЮГ", "INCHCAPE ВОСТОК", "VOLVO CAR ОБУХОВ", "АВТОБИОГРАФИЯ", "ДОН-МОТОРС",
			"БОВИД", "АВТОПОЛЕ", "ПРЕМЬЕР-ИРКУТСК", "MAJOR", "АВТОГРАД", "МОТОР ЛЕНД", "Вольво Кар М1", "VOLVO CAR ГОРКИ", "VOLVO CAR КОПТЕВО", "VOLVO CAR САРАТОВ", "VOLVO CAR БЕЛГОРОД", "VOLVO CAR ИЖЕВСК", "VOLVO CAR КРАСНОЛЕСЬЕ",
			"Volvo Car Мурманск", "ВОЛЬВО КАР ТУЛА", "БЦР МОТОРС", "VOLVO CAR ТУЛЬСКАЯ", "Volvo Car Кубань", "VOLVO CAR МИНСК", "Элитавто 21 век", "НОРД-АВТО", "VOLVO CAR АЛМАТЫ", "VOLVO CAR АВИЛОН", "VOLVO CAR КРАСНОЯРСК", "VOLVO CAR АВТОЛИДЕР",
			"ВОЛЬВО КАР САМАРА", "VOLVO CAR АЛТУФЬЕВО", "VOLVO CAR СУЗДАЛЬСКИЙ", "ЭЛИТАВТО XXI ВЕК", "VOLVO CAR ФЭМИЛИ", "OBUKHOV-URAL", "SWED-MOBIL", "VOLVO CAR YAROSLAVL", "INCHCAPE", "VOLVO CAR OBUKHOV", "AUTOBYOGRAPHY", "DON-MOTORS", "BOVID",
			"AVTOPOLE", "PREMIER IRKUTSK", "AUTOGRAD", "MOTOR LAND", "Premier Auto", "VOLVO CAR GORKI", "VOLVO CAR KOPTEVO", "VOLVO CAR Saratov", "VOLVO CAR BELGOROD", "VOLVO CAR IZHEVSK", "VOLVO CAR KRASNOLESYE", "ООО Компания Арена",
			"VOLVO CAR TULA", "BCR MOTORS", "VOLVO CAR TULSKAYA", "Volvo Car Kuban", "VOLVO CAR МINSK", "Eliteauto XXI Vek", "NORD-AVTO", "VOLVO CAR ALMATY", "VOLVO CAR AVILON", "VOLVO CAR KRASNOYARSK", "VOLVO CAR AUTOLEADER", "VOLVO CAR SAMARA",
			"VOLVO CAR ALTUFYEVO", "VOLVO CAR SUZDALSKY", "ELITAUTO XXI VEK", "VOLVO CAR FAMILY", "ООО Обухов-Урал", "ООО Свид-Мобиль", "ООО Великан Ярославль", "ООО Муса Моторс В", "ООО Обухов Автоцентр", "ООО Автобиография", "ООО Дон-Моторс",
			"ООО Бовид", "ООО Автополе Карс", "ООО ВЦ-Иркутск", "ООО Мэйджор Авто Центр", "ООО  Мэйджор Авто", "ООО Мейджор Авто Центр", "ООО Автоград Люкс", "ООО Сократ", "Премьер Авто", "ООО ДАТ Р", "ООО Фаворит Моторс Северо-запад",
			"Автофорум-Север ООО", "ООО Фортуна-Авто", "ООО Лео Смарт Авто", "ООО Авто Плюс Краснолесье", "ООО СКАНДИНАВИ", "ООО ПремиумАвто-НН", "АВТОТЕМП АО", "АО АВТОТЕМП", "Темп Авто ФКДД", "ЗАО Элитавто", "ЗАОЭлитавто", "ООО НОРД-АВТО Трейд",
			"ТОО Скандинавиан Моторс", "АО Авилон Автомобильная Группа", "АО Авилон АГ", "АО Авилон", "Авилон АГ", "ООО Янтарь", "ООО Автолидер-Восток", "ООО Самара-Авто", "ООО Дилерский центр Алтуфьево", "ООО Смольнинский", "ООО Карс Фэмили",
			"Velikan Yaroslavl", "Musa Motors V", "Obukhov Avtocenter", "Avtopole Cars", "VC-Irkutsk", "Major Auto Centre", "Autograd Lux", "Sokrat", "DAT R", "Favorit Motors Severo-zapad", "Avtoforum-Sever OOO", "Fortuna-Avto", "Leo Smart Avto",
			"Auto Plus Krasnolesye", "Company Arena", "SCANDINAVI", "PremiumAvto-NN", "JSC AVTOTEMP", "Temp Avto FKDD LLC", "Eliteauto ZAO", "ZAOEliteauto", "NORD-AVTO Trade", "LLP Scandinavian Motors", "JSC Avilon Avtomobilnaya Gruppa", "Yantar",
			"Autoleader-Vostok", "Samara-Auto", "Dilerskiy centr Altufyevo", "Smolninsky", "CJSC Eliteauto", "Cars Family", "ООО ДЦ Алтуфьево", "ООО Солт");

	private List<String> organization = Arrays.asList("ООО", "ЗАО", "ОАО", "ИП", "АО", "СПАО", "ЧТУП");

	public NameOrganization() {
	}

	public NameOrganization(Cell cell) {
		super(cell);
	}

	public NameOrganization(String value) {
		super(value);
	}

	public void checkValue() {
		// TODO Auto-generated method stub

	}

	public String statusOrganizationProperty() {
		return statusOrganization;
	}

	public void setStatusOrganization(String statusOrganization) {
		this.statusOrganization = statusOrganization;
	}

	public String getStatusOrganization() {
		if (statusOrganization == "") {
			if (getCell() != null) {

				NameOrganization org = new NameOrganization(getCell());

				if (isLeasing(org)) {
					Leasing leasing = new Leasing(cell);
					return leasing.getStatusOrganization();
				} else if (isDealer(org)) {
					Dealer dealer = new Dealer(cell);
					return dealer.getStatusOrganization();
				} else if (isOrganization(org)) {
					Organization organization = new Organization(cell);
					return organization.getStatusOrganization();
				} else {
					return "";
				}

			} else {
				return statusOrganization;
			}

		} else
			return statusOrganization;

	}

	public AbstractStringCell getStructure() {
		if (isLeasing()) {
			Leasing leasing = new Leasing(cell);
			return leasing;
		} else if (isDealer()) {
			Dealer dealer = new Dealer(cell);
			return dealer;
		} else if (isOrganization()) {
			Organization organization = new Organization(cell);
			return organization;
		}
		return null;
	}

	public AbstractStringCell getStructure(Cell cell) {
		NameOrganization org = new NameOrganization(cell);

		if (isLeasing(org)) {
			Leasing leasing = new Leasing(cell);
			return leasing;
		} else if (isDealer(org)) {
			Dealer dealer = new Dealer(cell);
			return dealer;
		} else if (isOrganization(org)) {
			Organization organization = new Organization(cell);
			return organization;
		}

		return org;
	}

	private boolean isLeasing(NameOrganization org) {
		if (!org.getValue().isEmpty()) {
			for (String val : leasing) {
				if (org.deleteDigAndSpac().contains(deleteDigAndSpac(val))) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isDealer(NameOrganization org) {
		if (!org.getValue().isEmpty()) {
			for (String val : delaer) {
				if (org.deleteDigAndSpac().contains(deleteDigAndSpac(val))) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isOrganization(NameOrganization org) {
		if (!org.getValue().isEmpty()) {
			for (String val : organization) {
				if (org.deleteDigAndSpac().contains(deleteDigAndSpac(val))) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isLeasing() {
		if (!value.isEmpty()) {
			for (String val : leasing) {
				if (deleteDigAndSpac().contains(deleteDigAndSpac(val))) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isDealer() {
		if (!value.isEmpty()) {
			for (String val : delaer) {
				if (deleteDigAndSpac().contains(deleteDigAndSpac(val))) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isOrganization() {
		if (!value.isEmpty()) {
			for (String val : organization) {
				if (deleteDigAndSpac().contains(deleteDigAndSpac(val))) {
					return true;
				}
			}
		}
		return false;
	}

	public class Leasing extends NameOrganization {

		private String statusOrganization = "Лизинг";

		public Leasing(Cell cell) {
			super(cell);
		}

		public String getStatusOrganization() {
			return statusOrganization;
		}
	}

	public class Dealer extends NameOrganization {

		private String statusOrganization = "Дилер";

		public Dealer(Cell cell) {
			super(cell);
		}

		public String getStatusOrganization() {
			return statusOrganization;
		}
	}

	public class Organization extends NameOrganization {

		private String statusOrganization = "Организация";

		public Organization(Cell cell) {
			super(cell);
		}

		public String getStatusOrganization() {
			return statusOrganization;
		}

	}

}
