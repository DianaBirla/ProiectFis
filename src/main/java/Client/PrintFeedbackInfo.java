package Client;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PrintFeedbackInfo {
	private String titlu;
	private String feedback;
	
	ReaderFeedback rf=new ReaderFeedback();
	public void print(JTable table) {
		final int numar_fb=rf.get_number();	
		int index=0;
		while(index!=numar_fb)
		{
			index++;
			rf.get_feedback(index);
			titlu=rf.get_titlu();
			if(rf.get_feedback())
			{
				feedback="Respins";
			
			}
			else feedback="Acceptat";
			DefaultTableModel model = (DefaultTableModel)table.getModel();
			table.setRowHeight(50);
			table.setAutoscrolls(true);
			model.addRow(new Object []{titlu, feedback});
			
		}
		}

}
