package bibloteca_201212764;

import java.util.Iterator;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Sistema1 extends javax.swing.JFrame {
    private DefaultTableModel  modelo1, modelo2;

    private String Datos[][] = {};
    private String[] Encabezado1 = {"ISBN", "Título","Autor", "Precio Unitario"};
    private String[] Encabezado2 = {"ISBN", "Título", "Cantidad", "Precio Unitario"};

    public Sistema1() {
        initComponents();
  
        setExtendedState(MAXIMIZED_BOTH);
        
            
        modelo1 = new DefaultTableModel(Datos, Encabezado1);
        tabla.setModel(modelo1);
        
        modelo2 = new  DefaultTableModel (Datos, Encabezado2);
        Tabla2.setModel(modelo2);    
        
        Tabla2.getSelectionModel().addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent lse) {
                double sub = 0;
                for(int i : Tabla2.getSelectedRows())
                    sub += Double.parseDouble( (String) modelo2.getValueAt(i, 2) ) * Double.parseDouble( (String) modelo2.getValueAt(i, 3) );
                campoSub.setText(sub+"");
            }
        });
    }

    public void cargar(){
        
        String AISBN = "1029345087";
        String ATitulo = "Cien Años de Soledad";
        String Aautor = "Gabriel Garcias Marquez";
        String APrecio = "4300";
        String Datos[] = {AISBN, ATitulo, Aautor, APrecio};
        modelo1.addRow(Datos);
        //-------------------------------------------------
        String BISBN = "9873602938";
        String BTitulo = "Don Quijote de la Mancha Part1";
        String Bautor = "Miguel de Cervantes Saavedra";
        String BPrecio = "12400";
        String BDatos[] = {BISBN, BTitulo, Bautor, BPrecio};
        modelo1.addRow(BDatos);
        //---------------------------------------------------
        String CISBN = "9873602938";
        String CTitulo = "Don Quijote de la Mancha Part2";
        String Cautor = "Miguel de Cervantes Saavedra";
        String CPrecio = "12600";
        String CDatos[] = {CISBN, CTitulo, Cautor, CPrecio};
        modelo1.addRow(CDatos);
        //---------------------------------------------------
        String DISBN = "4029382734";
        String DTitulo = "El Diario de Ana Frank";
        String Dautor = "Anne Frank";
        String DPrecio = "8700";
        String DDatos[] = {DISBN, DTitulo, Dautor, DPrecio};
        modelo1.addRow(DDatos);
        //---------------------------------------------------
        String EISBN = "1023435546";
        String ETitulo = "El Codigo Da Vinci";
        String Eautor = "Dan Brown";
        String EPrecio = "2300";
        String EDatos[] = {EISBN, ETitulo, Eautor, EPrecio};
        modelo1.addRow(EDatos);
        //---------------------------------------------------
        String FISBN = "1023435546";
        String FTitulo = "El Perfume";
        String Fautor = "Patrik Süskind";
        String FPrecio = "8700";
        String FDatos[] = {FISBN, FTitulo, Fautor, FPrecio};
        modelo1.addRow(FDatos);
        //---------------------------------------------------
        String GISBN = "1013145009";
        String GTitulo = "La mil y una noches";
        String Gautor = "Abu Abd-Allah Muhammad";
        String GPrecio = "23000";
        String GDatos[] = {GISBN, GTitulo, Gautor, GPrecio};
        modelo1.addRow(GDatos);
         //---------------------------------------------------
        String HISBN = "9043636036";
        String HTitulo = "La Metamorfosis";
        String Hautor = "Franz Kafka";
        String HPrecio = "8100";
        String HDatos[] = {HISBN, HTitulo, Hautor, HPrecio};
        modelo1.addRow(HDatos);
         //---------------------------------------------------
        String IISBN = "7906463200";
        String ITitulo = "El Secreto";
        String Iautor = "Rhonda Byrne";
        String IPrecio = "11800";
        String IDatos[] = {IISBN, ITitulo, Iautor, IPrecio};
        modelo1.addRow(IDatos);
         //---------------------------------------------------
        String jISBN = "7638900844";
        String jTitulo = "La Caverna";
        String jautor = "Jose Saramago";
        String jPrecio = "11800";
        String jDatos[] = {jISBN, jTitulo, jautor, jPrecio};
        modelo1.addRow(jDatos);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        Comprar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        AddBook = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        campoSub = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campoTotal = new javax.swing.JTextField();
        btnCalcular1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Libros");
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle Del Libros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 22), new java.awt.Color(51, 51, 51))); // NOI18N

        tabla.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ISBN", "Titulo", "Autor", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        Comprar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        Comprar.setText("Comprar Libro");
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });

        Borrar.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton1.setText("Cargar Libros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Comprar)
                    .addComponent(Borrar)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AddBook.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        AddBook.setText("Adicionar Libro");
        AddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBookActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle Del Carrito De Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 22), new java.awt.Color(51, 51, 51))); // NOI18N

        Tabla2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ISBN", "Titulo", "Cantidad", "Precio Unitario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabla2);

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel1.setText("SubTotal de Libro:");

        campoSub.setEditable(false);

        btnCalcular.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibloteca_201212764/Setup.png"))); // NOI18N
        btnCalcular.setText("Calcular Total");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jLabel2.setText("Costo de los Libros:");

        campoTotal.setEditable(false);

        btnCalcular1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnCalcular1.setText("Salir");
        btnCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcular1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(campoTotal))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addComponent(campoSub, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalcular1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(campoSub))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCalcular)
                            .addComponent(btnCalcular1))
                        .addContainerGap())))
        );

        jLabel3.setFont(new java.awt.Font("Serif", 0, 48)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibloteca_201212764/book (2).png"))); // NOI18N
        jLabel3.setText("Ventas de Libros");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibloteca_201212764/book (3).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddBook, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        int s = tabla.getSelectedRow();

        if(s==-1) 
           JOptionPane.showMessageDialog(this, "Seleccione el libro que desea comprar."); 
        else{
            int pos = buscarEnCarrito(s);
            if( pos != -1 ) {
                String cantidad = JOptionPane.showInputDialog("Ya se ha adquirido este libro. Ingrese la nueva cantidad que desea adquirir:");
                if(cantidad.equals("0"))
                    modelo2.removeRow(pos);
                else modelo2.setValueAt(cantidad, pos, 2);
                return;
            }
            String cantidad = JOptionPane.showInputDialog("Ingrese cantidad a comprar:");
            Object fila [] = new Object[modelo2.getColumnCount()];
            fila[0] = modelo1.getValueAt(s, 0); // ISBN.
            fila[1] = modelo1.getValueAt(s, 1); // Título.
            fila[3] = modelo1.getValueAt(s, 3); // Precio unitario.
            fila[2] = cantidad;
            modelo2.addRow(fila);
        }
    }//GEN-LAST:event_ComprarActionPerformed

    private int buscarEnCarrito(int s) {
        String ISBN = (String) modelo1.getValueAt(s, 0);
        String Titulo = (String) modelo1.getValueAt(s, 1);
        
        for(int i=0; i<modelo2.getRowCount(); ++i) {
            @SuppressWarnings("UseOfObsoleteCollectionType")
            Vector v = (Vector) modelo2.getDataVector().get(i);
            if(v.get(0).equals(ISBN) && v.get(1).equals(Titulo))
                return i;
        }
        return -1;        
    }
    
    private void AddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBookActionPerformed
        String ISBN = JOptionPane.showInputDialog("Ingrese el ISBN del libro:");
        String Titulo = JOptionPane.showInputDialog("Ingrese el Titulo del libro:");
        String autor= JOptionPane.showInputDialog("Ingrese el Autor del libro:");
        String Precio = JOptionPane.showInputDialog("Ingrese el precio del libro:");
       
        if( existeLibro(ISBN, Titulo) ) 
            JOptionPane.showMessageDialog(this, "El libro ya se encuentra registrado.");
        else {
            JOptionPane.showMessageDialog(this, "El libro se ha registrado correctamente.");        
            @SuppressWarnings("LocalVariableHidesMemberVariable")
            String Datos[] = {ISBN, Titulo, autor, Precio};
            modelo1.addRow(Datos);
        }
    }//GEN-LAST:event_AddBookActionPerformed

    private boolean existeLibro(String ISBN, String Titulo) {
        Iterator it = modelo1.getDataVector().iterator();
        while(it.hasNext()) {
            @SuppressWarnings("UseOfObsoleteCollectionType")
            Vector v = (Vector) it.next();
            if(v.get(0).equals(ISBN) && v.get(1).equals(Titulo))
                return true;
        }
        return false;
    }
    
    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        int s = tabla.getSelectedRow();
        if(s==-1) 
           JOptionPane.showMessageDialog(this,"Por favor seleccione una fila."); 
        else modelo1.removeRow(s);        
    }//GEN-LAST:event_BorrarActionPerformed

    private void btnCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcular1ActionPerformed

        dispose();
    }//GEN-LAST:event_btnCalcular1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cargar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double precio = 0;
        for(int i=0; i<modelo2.getRowCount(); ++i)
        precio += Double.parseDouble( (String) modelo2.getValueAt(i, 2) ) * Double.parseDouble( (String) modelo2.getValueAt(i, 3) );
        campoTotal.setText(precio+"");
    }//GEN-LAST:event_btnCalcularActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Sistema1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBook;
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Comprar;
    private javax.swing.JTable Tabla2;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCalcular1;
    private javax.swing.JTextField campoSub;
    private javax.swing.JTextField campoTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
