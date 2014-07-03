package treinamento;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {

	private TableModel tableModel;
	
	public TableModel() {
		tableModel = new TableModel();
	}
	
	@Override
	public int getColumnCount() {
		return 5;
	}

	@Override
	public int getRowCount() {
		return 4;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
