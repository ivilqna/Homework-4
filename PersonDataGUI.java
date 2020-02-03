package fmi.informatics.gui;

import java.awt.BorderLayout;

import java.awt.Container;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JScrollPane;

import javax.swing.JTable;

import fmi.informatics.extending.Person;

import fmi.informatics.extending.Professor;

import fmi.informatics.extending.Student;

// ��������� ���� PersonDataGUI

public class PersonDataGUI {

	private static Person[] people;

	JTable table;

	PersonDataModel personDataModel;

	public static void main(String[] args) {

		getPeople();

		PersonDataGUI gui = new PersonDataGUI();

		gui.createAndShowGUI();

	}

	public static void getPeople() {

		people = new Person[16];

		for (int i = 0; i < 4; i++) {

			Person student = Student.StudentGenerator.make();

			people[i] = student;

		}

		for (int i = 4; i < 8; i++) {

			Person professor = Professor.ProfessorGenerator.make();

			people[i] = professor;

		}

		for (int i = 8; i < 12; i++) {

			Person student = Student.StudentGenerator.make();

			people[i] = student;

		}

		for (int i = 12; i < 16; i++) {

			Person professor = Professor.ProfessorGenerator.make();

			people[i] = professor;

		}

	}

	public void createAndShowGUI() {

		JFrame frame = new JFrame("������� � ����� �� ����");

		frame.setSize(800, 500);

		JLabel label = new JLabel("������ � �����������", JLabel.CENTER);

		personDataModel = new PersonDataModel(people);

		table = new JTable(personDataModel);

		JScrollPane scrollPane = new JScrollPane(table);

		Container container = frame.getContentPane();

		container.setLayout(new BorderLayout());

		container.add(label, BorderLayout.NORTH);

		container.add(scrollPane, BorderLayout.CENTER);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);

	}

}
