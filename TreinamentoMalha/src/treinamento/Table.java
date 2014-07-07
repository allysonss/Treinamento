package treinamento;

import java.util.ArrayList;

import tecgraf.javautils.gui.table.SortableTable;

public class Table extends SortableTable {

	private SortableTable table;
	private ArrayList<Rota> dataList;
	
	public Table() {
		creatingRoutes();
		table = new SortableTable(new TableModel(dataList));
	}
	
	private void creatingRoutes() {
		dataList = new ArrayList<Rota>();
		Rota rota1 = new Rota("Exterior - TA MUCURIPE", "GLP Energ (1) mil t", "10.5", "10/10/2010");
		Rota rota2 = new Rota("Exterior - TA SANTOS", "GLP (99) mil t", "11.5", "10/10/2020");
		Rota rota3 = new Rota("Exterior - TA CABEDELO", "DIESEL (50) mil m³", "20", "10/10/2030");
		dataList.add(rota1);
		dataList.add(rota2);
		dataList.add(rota3);
	}
}
