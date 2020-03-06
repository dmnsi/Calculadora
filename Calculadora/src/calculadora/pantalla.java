package calculadora;

//VARIABLES
public class pantalla extends javax.swing.JFrame {
    private final int MAX_LENGTH_DISPLAY = 22;
    String numeroActual = "";
    String numeroAnterior = "0";
    String operacion = "";
    boolean borrarPantalla = false;
   
   
    public pantalla() {
        initComponents();
        setPantalla("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPantalla = new javax.swing.JTextField();
        btnSuma = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnComa = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnMasMenos = new javax.swing.JButton();
        txtPantalla2 = new javax.swing.JTextField();
        btnCE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULADORA V1.0");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 51, 51));

        txtPantalla.setBackground(new java.awt.Color(0, 0, 0));
        txtPantalla.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        txtPantalla.setForeground(new java.awt.Color(51, 255, 204));
        txtPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPantalla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSuma.setBackground(new java.awt.Color(51, 51, 51));
        btnSuma.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSuma.setForeground(new java.awt.Color(255, 255, 255));
        btnSuma.setText("+");
        btnSuma.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnSuma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSuma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSumaMouseClicked(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(51, 51, 51));
        btnIgual.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setText("=");
        btnIgual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnIgual.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIgualMouseClicked(evt);
            }
        });

        btnResta.setBackground(new java.awt.Color(51, 51, 51));
        btnResta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnResta.setForeground(new java.awt.Color(255, 255, 255));
        btnResta.setText("-");
        btnResta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnResta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnResta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRestaMouseClicked(evt);
            }
        });

        btnMultiplicacion.setBackground(new java.awt.Color(51, 51, 51));
        btnMultiplicacion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMultiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplicacion.setText("*");
        btnMultiplicacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnMultiplicacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMultiplicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMultiplicacionMouseClicked(evt);
            }
        });

        btnDivision.setBackground(new java.awt.Color(51, 51, 51));
        btnDivision.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(255, 255, 255));
        btnDivision.setText("/");
        btnDivision.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnDivision.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDivision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDivisionMouseClicked(evt);
            }
        });

        btnCuatro.setBackground(new java.awt.Color(102, 102, 102));
        btnCuatro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCuatro.setForeground(new java.awt.Color(255, 255, 255));
        btnCuatro.setText("4");
        btnCuatro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnCuatro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });

        btnCinco.setBackground(new java.awt.Color(102, 102, 102));
        btnCinco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCinco.setForeground(new java.awt.Color(255, 255, 255));
        btnCinco.setText("5");
        btnCinco.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnCinco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnSeis.setBackground(new java.awt.Color(102, 102, 102));
        btnSeis.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSeis.setForeground(new java.awt.Color(255, 255, 255));
        btnSeis.setText("6");
        btnSeis.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnSeis.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnUno.setBackground(new java.awt.Color(102, 102, 102));
        btnUno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnUno.setForeground(new java.awt.Color(255, 255, 255));
        btnUno.setText("1");
        btnUno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnUno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });

        btnDos.setBackground(new java.awt.Color(102, 102, 102));
        btnDos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDos.setForeground(new java.awt.Color(255, 255, 255));
        btnDos.setText("2");
        btnDos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnDos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });

        btnTres.setBackground(new java.awt.Color(102, 102, 102));
        btnTres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTres.setForeground(new java.awt.Color(255, 255, 255));
        btnTres.setText("3");
        btnTres.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnTres.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnSiete.setBackground(new java.awt.Color(102, 102, 102));
        btnSiete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSiete.setForeground(new java.awt.Color(255, 255, 255));
        btnSiete.setText("7");
        btnSiete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnSiete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });

        btnOcho.setBackground(new java.awt.Color(102, 102, 102));
        btnOcho.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnOcho.setForeground(new java.awt.Color(255, 255, 255));
        btnOcho.setText("8");
        btnOcho.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnOcho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });

        btnNueve.setBackground(new java.awt.Color(102, 102, 102));
        btnNueve.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnNueve.setForeground(new java.awt.Color(255, 255, 255));
        btnNueve.setText("9");
        btnNueve.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnNueve.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });

        btnCero.setBackground(new java.awt.Color(102, 102, 102));
        btnCero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCero.setForeground(new java.awt.Color(255, 255, 255));
        btnCero.setText("0");
        btnCero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnCero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });

        btnComa.setBackground(new java.awt.Color(51, 51, 51));
        btnComa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnComa.setForeground(new java.awt.Color(255, 255, 255));
        btnComa.setText(".");
        btnComa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnComa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnComa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComaMouseClicked(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(51, 51, 51));
        btnClear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Back");
        btnClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        btnRaiz.setBackground(new java.awt.Color(51, 51, 51));
        btnRaiz.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnRaiz.setForeground(new java.awt.Color(255, 255, 255));
        btnRaiz.setText("R");
        btnRaiz.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnRaiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRaizMouseClicked(evt);
            }
        });

        btnMasMenos.setBackground(new java.awt.Color(51, 51, 51));
        btnMasMenos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnMasMenos.setForeground(new java.awt.Color(255, 255, 255));
        btnMasMenos.setText("+/-");
        btnMasMenos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnMasMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMasMenosMouseClicked(evt);
            }
        });

        txtPantalla2.setBackground(new java.awt.Color(0, 0, 0));
        txtPantalla2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtPantalla2.setForeground(new java.awt.Color(51, 255, 204));
        txtPantalla2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPantalla2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCE.setBackground(new java.awt.Color(51, 51, 51));
        btnCE.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCE.setForeground(new java.awt.Color(255, 255, 255));
        btnCE.setText("CE");
        btnCE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(204, 204, 204), null, null));
        btnCE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCEMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnCinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtPantalla2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSeis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnUno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCuatro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSiete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMasMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnComa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPantalla2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnComa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMasMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // PANTALLA 
    private void setPantalla(String text){
        txtPantalla.setText(text);
    }

    private String getPantalla(){
        return txtPantalla.getText();
    }
    
    // METODO BORRAR TODO
    private void borrarTotal(){
        setPantalla("0");
        numeroAnterior = "0";
        numeroActual = "";
        operacion = "";
        borrarPantalla = false;
    }
    
    // METODO BORRAR PARCIAL
    private void borrarActual(){
        double auxiliar = Double.parseDouble(getPantalla());
        if(auxiliar != 0){
            String auxiliar2 = Double.toString(auxiliar);
            int borrar = auxiliar2.length()-1;
            int trobat = auxiliar2.indexOf(".");
            if(trobat != -1){
                String sub = auxiliar2.substring(trobat+1, trobat+2);
                if ((sub.compareTo("0") == 0)&&(auxiliar2.length() == trobat+2)){
                    borrar = borrar -2;
                }
            }
            numeroAnterior = auxiliar2.substring(0, borrar);
            if(numeroAnterior.compareTo("") == 0){
                numeroAnterior = "0";
            }
            setPantalla(numeroAnterior);
            numeroActual = numeroAnterior;
            numeroAnterior = "0";
            operacion = "";
            borrarPantalla = false;
        }
        operacion = "";
    }
    
    // METODO ERROR
    private void error(){
        setPantalla("Error");
        numeroAnterior = "0";
        numeroActual = "";
        operacion = "";
        borrarPantalla = true;
    }
    
    // METODO DE CALCULOS
    private void esperarSiguiente(String entrada) {
        int opcion = 0;
        int ultimaOperacion = 0;
        opcion = operacionSiguiente(entrada);
        ultimaOperacion = operacionSiguiente(operacion);
        if((numeroActual.compareTo("") == 0)&&(opcion != -1)&&(ultimaOperacion != -1)){
            ultimaOperacion = opcion;
            operacion = entrada;
            opcion = 0;
            entrada = "";
        }
        if(opcion == -1){
            if(entrada.compareTo("") != 0){
                if((numeroActual.lastIndexOf(".") == -1)||(entrada.compareTo(".") != 0)){
                    if(entrada.compareTo("signo") != 0){
                        if(borrarPantalla){
                            setPantalla("0");
                        }
                        else{
                            numeroActual = getPantalla();
                        }
                        if(numeroActual.length() < MAX_LENGTH_DISPLAY){
                            if((numeroActual.indexOf("0") == 0)&&(entrada.compareTo(".") != 0)&&(numeroActual.lastIndexOf(".") == -1)){
                                numeroActual = numeroActual.substring(1);
                            }
                            numeroActual += entrada;
                        }
                        setPantalla(numeroActual);
                    }
                }
            }
        }
        else{
            if((operacion.compareTo("") == 0)&&(entrada.compareTo("=") != 0)){
                operacion = entrada;
                borrarPantalla = true;
                numeroAnterior = getPantalla();
                numeroActual = "";
            }
            else{
                double memoria1 = 0, memoria2 = 0;
                switch (ultimaOperacion){
                    case 1:
                        memoria2 = Double.parseDouble(numeroActual);
                        memoria1 = Double.parseDouble(numeroAnterior)+memoria2;
                        numeroAnterior = Double.toString(memoria1);
                        numeroActual = "";
                        borrarPantalla = true;
                        if(entrada.compareTo("=") == 0){
                            operacion = "";
                        }
                        else{
                            operacion = entrada;
                        }
                        setPantalla(numeroAnterior);
                        break;
                    case 2:
                        memoria2 = Double.parseDouble(numeroActual);
                        memoria1 = Double.parseDouble(numeroAnterior)-memoria2;
                        numeroAnterior = Double.toString(memoria1);
                        numeroActual = "";
                        borrarPantalla = true;
                        if(entrada.compareTo("=") == 0){
                            operacion = "";
                        }
                        else{
                            operacion = entrada;
                        }
                        setPantalla(numeroAnterior);
                        break;
                    case 3:
                        memoria2 = Double.parseDouble(numeroActual);
                        memoria1 = Double.parseDouble(numeroAnterior)*memoria2;
                        numeroAnterior = Double.toString(memoria1);
                        numeroActual = "";
                        borrarPantalla = true;
                        if(entrada.compareTo("=") == 0){
                            operacion = "";
                        }
                        else{
                            operacion = entrada;
                        }
                        setPantalla(numeroAnterior);
                        break;
                    case 4:
                        memoria2 = Double.parseDouble(numeroActual);
                        double memoriaActual = memoria2;
                        if(memoriaActual != 0){
                            memoria1 = Double.parseDouble(numeroAnterior)/memoriaActual;
                            numeroAnterior = Double.toString(memoria1);
                            numeroActual = "";
                            borrarPantalla = true;
                            if(entrada.compareTo("=") == 0){
                                operacion = "";
                            }
                            else{
                                operacion = entrada;
                            }
                            setPantalla(numeroAnterior);
                        }
                        else{
                            error();
                        }
                        break;
                    case 5:
                        if(numeroActual.compareTo("") == 0){
                            numeroActual = numeroAnterior;
                        }
                        memoria2 = Double.parseDouble(numeroActual);
                        memoria1 = Math.sqrt(memoria2);
                        numeroAnterior = Double.toString(memoria1);
                        numeroActual = "";
                        borrarPantalla = true;
                        operacion = "";
                        setPantalla(numeroAnterior);
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        borrarTotal();
                        break;
                    case 10:
                        borrarActual();
                        break;
                }
            }
        }
    }
    
    // METODO RECONOCIMIENTO DE CALCULOS
    private int operacionSiguiente(String entrada){
        if(entrada.compareTo("+") == 0){
            return 1;
        }
        else if(entrada.compareTo("-") == 0){
            return 2;
        }
        else if(entrada.compareTo("*") == 0){
            return 3;
        }
        else if(entrada.compareTo("/") == 0){
            return 4;
        }    
        else if(entrada.compareTo("sqrt") == 0){
            operacion = "sqrt";
            return 5;
        }
        else if(entrada.compareTo("=") == 0){
            return 8;
        }
        else if(entrada.compareTo("CE") == 0){
            operacion = "CE";
            return 9;
        }
        else if(entrada.compareTo("BACK") == 0){
            operacion = "BACK";
            return 10;
        }
        else if(entrada.compareTo("signo") == 0){
            double aux = 0;
            if(numeroActual.compareTo("") == 0){
                numeroActual = numeroAnterior;
            }    
            if(numeroActual.compareTo("") != 0){
                aux = Double.parseDouble(numeroActual);
            }  
            if(aux != 0){
                aux = -aux;
                numeroActual = Double.toString(aux);
                setPantalla(numeroActual);
            }
            return -1;
        }
        else{
            return -1;
        }
    }
    
    // BOTONES NUMERICOS
    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
           esperarSiguiente("0");
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        esperarSiguiente("1");
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        esperarSiguiente("2");
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        esperarSiguiente("3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        esperarSiguiente("4");
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        esperarSiguiente("5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        esperarSiguiente("6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        esperarSiguiente("7");
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        esperarSiguiente("8");
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        esperarSiguiente("9");
    }//GEN-LAST:event_btnNueveActionPerformed

    // BOTON SUMA
    private void btnSumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumaMouseClicked
        esperarSiguiente("+");
        txtPantalla2.setText ("+");
    }//GEN-LAST:event_btnSumaMouseClicked
    
    // BOTON DIVISION
    private void btnDivisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDivisionMouseClicked
        esperarSiguiente("/");
        txtPantalla2.setText ("/");
    }//GEN-LAST:event_btnDivisionMouseClicked
    
    // BOTON MULTIPLICACION
    private void btnMultiplicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultiplicacionMouseClicked
        esperarSiguiente("*");    
        txtPantalla2.setText ("X");
    }//GEN-LAST:event_btnMultiplicacionMouseClicked
    
    // BOTON RESTA 
    private void btnRestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestaMouseClicked
        esperarSiguiente("-");
        txtPantalla2.setText ("-");
    }//GEN-LAST:event_btnRestaMouseClicked
    
    // BOTON IGUAL
    private void btnIgualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIgualMouseClicked
        esperarSiguiente("=");
        txtPantalla2.setText ("=");
    }//GEN-LAST:event_btnIgualMouseClicked
        
    // BOTON PUNTO
    private void btnComaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComaMouseClicked
        esperarSiguiente(".");
    }//GEN-LAST:event_btnComaMouseClicked
    
    // BOTON C
    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        esperarSiguiente("BACK");
        txtPantalla2.setText ("");
    }//GEN-LAST:event_btnClearMouseClicked
    
    // BOTON RAIZ
    private void btnRaizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRaizMouseClicked
        esperarSiguiente("sqrt");
        txtPantalla2.setText ("RAIZ");
    }//GEN-LAST:event_btnRaizMouseClicked
    
    // BOTON +/- 
    private void btnMasMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasMenosMouseClicked
        esperarSiguiente("signo");
    }//GEN-LAST:event_btnMasMenosMouseClicked
    
    // BOTON CE
    private void btnCEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCEMouseClicked
        esperarSiguiente("CE");
        txtPantalla2.setText ("");
    }//GEN-LAST:event_btnCEMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnComa;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMasMenos;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JTextField txtPantalla;
    private javax.swing.JTextField txtPantalla2;
    // End of variables declaration//GEN-END:variables
}
