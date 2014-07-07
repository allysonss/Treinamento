package treinamento;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {

	private ArrayList<Rota> dataList;
	private String[] columns;
	
	public TableModel() {
		this.dataList = new ArrayList<Rota>();
		setColumns(createColumns());
	}

	public TableModel(ArrayList<Rota> dataList) {
		this.dataList = dataList;
		setColumns(createColumns());
	}

	private void setColumns(String[] columns) {
		this.columns = columns;
	}

	private String[] createColumns() {
		String[] columns = { "ID", "Local", "Grupamento", "Lote Mínimo", "Validade" };
		return columns;
	}

	public String getColumnName(int column) {
		return columns[column];
	}

	@Override
	public int getColumnCount() {
		return columns.length;
	}
	
	@Override
	public int getRowCount() {
		return dataList.size();
	}

	@Override
	public String getValueAt(int rowIndex, int columnIndex) {
		// TODO
		Rota rota = dataList.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return Integer.toString(rowIndex);
		case 1:
			return rota.getLocal();
		case 2:
			return rota.getGrupamento();
		case 3:
			return rota.getLoteMin();
		case 4:
			return rota.getValidade();
		default:
			return null;
		}
	}
	
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case 0:
			return String.class;
		case 1:
			return String.class;
		case 2:
			return String.class;
		case 3:
			return String.class;
		case 4:
			return String.class;
		default:
			return null;
		}
	}

}
