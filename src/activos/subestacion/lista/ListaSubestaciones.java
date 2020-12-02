package activos.subestacion.lista;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import db.JDBCConnection;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultRowSorter;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import misc.TableCellListener;

/**
 * Vista de la lista de subestaciones.
 * @author david
 */
public class ListaSubestaciones extends javax.swing.JPanel {
	private ModeloLista modelo;
	private DefaultTableModel modeloTabla;
	private final TableRowSorter<TableModel> rowSorterSube;
	
    /** Creates new form ListaSubestaciones */
    public ListaSubestaciones(JDBCConnection conn) {
    	modelo = new ModeloLista(conn);
    	
        initComponents();
        setTable();
        rowSorterSube  = new TableRowSorter<>(tablaSubs.getModel());
        TestTableSortFilter(rowSorterSube);
    }
    
    
    private void TestTableSortFilter(TableRowSorter sorter) {
    	tablaSubs.setRowSorter(sorter);
    	filterTxt.getDocument().addDocumentListener(new DocumentListener(){

    		@Override
    		public void insertUpdate(DocumentEvent e) {
    			String text = filterTxt.getText();

    			if (text.trim().length() == 0) {
    				sorter.setRowFilter(null);
    			} else {
    				sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
    			}
    		}

    		@Override
    		public void removeUpdate(DocumentEvent e) {
    			String text = filterTxt.getText();

    			if (text.trim().length() == 0) {
    				sorter.setRowFilter(null);
    			} else {
    				sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
    			}
    		}

    		@Override
    		public void changedUpdate(DocumentEvent e) {
    			throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    		}

    	});
    }
    private void setTable() {
    	modeloTabla = new DefaultTableModel(
        		modelo.convertData(),
        		new String[] {"Identificador", "Nombre", "Responsable", "Ciudad", "Dirección", "En funcionamiento"}
        		);
        
        tablaSubs.setModel(modeloTabla);
        
		
		  Action action = new AbstractAction() { public void
		  actionPerformed(ActionEvent e) { TableCellListener tcl = (TableCellListener)
		  e.getSource(); if (isCellEditable(tcl.getRow(), tcl.getColumn())) {
		  modelo.updateData( tcl.getColumn(),
		  String.valueOf(tablaSubs.getValueAt(tcl.getRow(), 0)),
		  String.valueOf(tcl.getNewValue())); modeloTabla.fireTableDataChanged(); }
		  
		  } }; TableCellListener tcl = new TableCellListener(tablaSubs, action);
		 
        
    }
    
    private boolean isCellEditable(int row, int col) {
    	if (col == 0) {
    		return false;
    	}
    	return true;
    }
   

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings({ "unchecked", "serial" })
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSubs = new javax.swing.JTable();
        refreshBtn = new javax.swing.JButton();
        filterTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        jLabel1.setText("Subestaciones existentes");

        tablaSubs.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        tablaSubs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Ciudad", "Dirección", "Responsable", "En funcionamiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaSubs);

        refreshBtn.setFont(new java.awt.Font("SF Pro Display", 0, 12)); // NOI18N
        refreshBtn.setText("Refrescar");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        filterTxt.setFont(new java.awt.Font("SF Pro Rounded", 0, 14)); // NOI18N
        filterTxt.setToolTipText("Filtrar información");


        jLabel2.setFont(new java.awt.Font("SF Pro Rounded", 0, 14)); // NOI18N
        jLabel2.setText("Filtrar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(filterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(233, 233, 233)
                            .addComponent(jLabel1)
                            .addGap(41, 41, 41)
                            .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(144, 144, 144))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(refreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filterTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


	private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
		
    	//modeloTabla.setRowCount(0);
    	
    	//setTable();
    	DefaultTableModel test = new DefaultTableModel(modelo.convertData(),
    			new String[] {"Identificador", "Nombre", "Responsable", "Ciudad", "Dirección", "En funcionamiento"} );
    	
    	tablaSubs.setModel(test);
		
    	modeloTabla.fireTableDataChanged();
    	
        TestTableSortFilter(new TableRowSorter<>(tablaSubs.getModel()));
    
    }//GEN-LAST:event_refreshBtnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField filterTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTable tablaSubs;
    // End of variables declaration//GEN-END:variables

}