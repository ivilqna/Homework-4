package fmi.informatics.gui;

import javax.swing.table.AbstractTableModel;

import fmi.informatics.extending.Person;

// ��������� ���� PersonDataModel

public class PersonDataModel extends AbstractTableModel {

	private static final long serialVersionUID = 1L;

	private Person[] people;

// constructor

	public PersonDataModel(Person[] people) {

		this.people = people;

	}

	@Override

	public int getColumnCount() {

		return 8; // ���� ������ � ���������

	}

	@Override

	public int getRowCount() {

		return people.length; // ���� ������ � ���������

	}

	@Override

	public Object getValueAt(int rowIndex, int columnIndex) {

		switch (columnIndex) {

		case 0:

			return people[rowIndex].getName();

		case 1:

			return people[rowIndex].getEgn();

		case 2:

			return people[rowIndex].getAge();

		case 3:

			return people[rowIndex].getHeight();

		case 4:

			return people[rowIndex].getWeight();

		case 5:

			return people[rowIndex].getTitle();

		case 6:

			return people[rowIndex].getFacNum();

		case 7:

			return people[rowIndex].getType();

		}

		return null;

	}

	@Override

	public String getColumnName(int column) {

		switch (column) {

		case 0:

			return "���";

		case 1:

			return "���";

		case 2:

			return "������";

		case 3:

			return "��������";

		case 4:

			return "�����";

		case 5:

			return "�����";

		case 6:

			return "���.�����";

		case 7:

			return "���";

		default:

			return super.getColumnName(column);

		}

	}

}
