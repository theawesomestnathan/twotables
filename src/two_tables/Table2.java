package two_tables;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Table2 {
	private JFrame frame;
	private JTable jt;
	
	Table2() {
		frame = new JFrame();

		String data[][] = { { "1", "Sam", "95000", "45", "Male", "Operations" }, 
							{ "2", "Bob", "80000", "21", "Male", "Support" }, 
							{ "3", "Anne", "125000", "25", "Female", "Analytics" },
							{ "4", "Julia", "73000", "30", "Female", "Analytics" }, 
							{ "5", "Matt", "155000", "33", "Male", "Sales" }, 
							{ "6", "Jeff", "112000", "27", "Male", "Operations" }, };
		String headers[] = { "e_id", "e_name", "e_salary", "e_age", "e_gender", "e_dept" };
		
		//DefaultTableModel
		DefaultTableModel tableModel = new DefaultTableModel();
		//DefaultTableModel will hold rows and columns
		//Table will hold the table model
		//scroll pane will hold the table
		//frame will display the sp
		
		jt = new JTable(tableModel); //rows, columns
		
		for (String ch : headers) {
			tableModel.addColumn(ch);
		}
		
		for (String rd[] : data) {
			tableModel.insertRow(tableModel.getRowCount(), rd);
		}
		
		
		JScrollPane sp = new JScrollPane(jt);
		sp.setBounds(30, 40, 700, 300);
		
//		jt.setBounds(30, 40, 200, 300);
		
		frame.add(sp);
		frame.setLayout(null);
		frame.setSize(800,400); 
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Table");
	}
}
