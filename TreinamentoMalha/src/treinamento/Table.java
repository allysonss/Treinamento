package treinamento;

import java.awt.Dimension;

import tecgraf.javautils.gui.table.SortableTable;

public class Table extends SortableTable {

	private static final long serialVersionUID = 1L;
	
	public Table() {
		this.setModel(new TableModel());
		this.setFillsViewportHeight(true);
		this.setPreferredScrollableViewportSize(new Dimension(500, 50));
		this.getTableHeader().setReorderingAllowed(false);
	}
} 
