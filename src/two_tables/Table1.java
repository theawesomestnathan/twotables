package two_tables;

import javax.swing.*;

public class Table1 {
	private JFrame frame;
	private JTable jt;
	
	Table1() {
		frame = new JFrame();

		String data[][] = { { "50", "18" }, { "75", "15" }, { "100", "12" }, { "150", "5" }, { "200", "4" } };
		String headers[] = { "Water Depth (meters)", "Temperature (°C)" };

		jt = new JTable(data, headers); //rows, columns
		
		JScrollPane sp = new JScrollPane(jt);
		sp.setBounds(5, 40, 290, 300);
		
//			jt.setBounds(30, 40, 200, 300);
		
		frame.add(sp);
		frame.setLayout(null);
		frame.setSize(300,400); 
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Water Temperatures at Various Depths");
	}
}
