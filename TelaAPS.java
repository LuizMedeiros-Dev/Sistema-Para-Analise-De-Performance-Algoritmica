
package com.mycompany.imagemcarregar;

import static com.mycompany.imagemcarregar.Ordenacao.tempo;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;



public class TelaAPS extends javax.swing.JFrame {

   

   
    public TelaAPS() {
        PainelDegrade fundo = new PainelDegrade();
    setContentPane(fundo);
    fundo.setLayout(null);

    initComponents(); // monta a tela depois de definir o fundo

    buttonGroup1.add(jRadioButtonBubbleSort);
    buttonGroup1.add(jRadioButtonInsertionSort);
    buttonGroup1.add(jRadioButtonQuickSort);

        
    }
    
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButtonInsertionSort = new javax.swing.JRadioButton();
        jRadioButtonQuickSort = new javax.swing.JRadioButton();
        jButtonNovaPesquisa = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jRadioButtonBubbleSort = new javax.swing.JRadioButton();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelData = new javax.swing.JLabel();
        jLabelTipoDeBusca = new javax.swing.JLabel();
        jTextFieldTempoDaordenacao = new javax.swing.JTextField();
        jLabelTempoDaOrdenacao = new javax.swing.JLabel();
        jTextFieldData2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabelImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Imagens do Cerrado Goiano");
        setBackground(new java.awt.Color(255, 255, 255));

        jRadioButtonInsertionSort.setBackground(new java.awt.Color(95, 95, 95));
        jRadioButtonInsertionSort.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonInsertionSort.setText("Insertion Sort");
        jRadioButtonInsertionSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonInsertionSortActionPerformed(evt);
            }
        });

        jRadioButtonQuickSort.setBackground(new java.awt.Color(95, 95, 95));
        jRadioButtonQuickSort.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonQuickSort.setText("Quick sort");
        jRadioButtonQuickSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonQuickSortActionPerformed(evt);
            }
        });

        jButtonNovaPesquisa.setBackground(new java.awt.Color(95, 95, 95));
        jButtonNovaPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNovaPesquisa.setText("Nova Pesquisa");
        jButtonNovaPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovaPesquisaActionPerformed(evt);
            }
        });

        jButtonPesquisar.setBackground(new java.awt.Color(95, 95, 95));
        jButtonPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jRadioButtonBubbleSort.setBackground(new java.awt.Color(95, 95, 95));
        jRadioButtonBubbleSort.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonBubbleSort.setText("Bubble Sort");
        jRadioButtonBubbleSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBubbleSortActionPerformed(evt);
            }
        });

        jLabelID.setBackground(new java.awt.Color(105, 105, 105));
        jLabelID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID.setText("ID: ");

        jTextFieldID.setBackground(new java.awt.Color(125, 125, 125));
        jTextFieldID.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldID.setEnabled(false);
        jTextFieldID.setMargin(new java.awt.Insets(2, 16, 6, 14));
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jLabelCodigo.setBackground(new java.awt.Color(105, 105, 105));
        jLabelCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCodigo.setText("Código:");

        jTextFieldCodigo.setBackground(new java.awt.Color(125, 125, 125));
        jTextFieldCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        jLabelData.setBackground(new java.awt.Color(105, 105, 105));
        jLabelData.setForeground(new java.awt.Color(255, 255, 255));
        jLabelData.setText("Data:");

        jLabelTipoDeBusca.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipoDeBusca.setText("Tipos de busca");

        jTextFieldTempoDaordenacao.setBackground(new java.awt.Color(125, 125, 125));
        jTextFieldTempoDaordenacao.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldTempoDaordenacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTempoDaordenacaoActionPerformed(evt);
            }
        });

        jLabelTempoDaOrdenacao.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTempoDaOrdenacao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTempoDaOrdenacao.setText("Tempo da ordenação");

        jTextFieldData2.setBackground(new java.awt.Color(125, 125, 125));
        jTextFieldData2.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldData2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldData2ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(55, 55, 55));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Data", "Código"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(100, 100, 100));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButtonCadastrar.setBackground(new java.awt.Color(95, 95, 95));
        jButtonCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonAlterar.setBackground(new java.awt.Color(95, 95, 95));
        jButtonAlterar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setBackground(new java.awt.Color(95, 95, 95));
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabelImagem.setBackground(new java.awt.Color(55, 55, 55));
        jLabelImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImagemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCodigo)
                            .addComponent(jLabelID)
                            .addComponent(jLabelData)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldData2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(29, 29, 29)
                        .addComponent(jLabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelTipoDeBusca)
                                        .addGap(42, 42, 42))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jRadioButtonQuickSort, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jRadioButtonBubbleSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jRadioButtonInsertionSort, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                                        .addGap(20, 20, 20)))
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jTextFieldTempoDaordenacao, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelTempoDaOrdenacao, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNovaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelImagem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonNovaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButtonQuickSort))
                                        .addGap(6, 6, 6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelTipoDeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButtonBubbleSort)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonInsertionSort)
                                        .addGap(34, 34, 34)))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelTempoDaOrdenacao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldTempoDaordenacao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldData2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String escolhaOrdenacao = "null"; 
    private String ok;

    private void jRadioButtonInsertionSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonInsertionSortActionPerformed
        escolhaOrdenacao = "insertion";
        ok = "ok";
    }//GEN-LAST:event_jRadioButtonInsertionSortActionPerformed

    private void jTextFieldTempoDaordenacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTempoDaordenacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTempoDaordenacaoActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jRadioButtonBubbleSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBubbleSortActionPerformed
        escolhaOrdenacao = "bolha";
        ok = "ok";
        
       
    }//GEN-LAST:event_jRadioButtonBubbleSortActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        
        if(!(escolhaOrdenacao.equals("bolha") || escolhaOrdenacao.equals("insertion") || escolhaOrdenacao.equals("quick"))){
            JOptionPane.showMessageDialog(null,"Selecione um método de ordenação");
        }
        else{
            Connection conexao = null;
            String url = "jdbc:mysql://localhost:3306/imagem";
            String user = "root";
            String password = "";
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Data");
            modelo.addColumn("Codigo");
            if (ok.equalsIgnoreCase("ok")){
                try  {

                conexao = DriverManager.getConnection(url, user, password); 
                String sql = "SELECT id, dat, codigo FROM nomes order by codigo asc;";
                PreparedStatement ps = conexao.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();

                // Obtém o modelo da JTable existente

                  modelo = (DefaultTableModel) jTable1.getModel();       

                // Limpa a tabela antes de preencher
                modelo.setRowCount(0);

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String data = rs.getString("dat");
                    String codigo = rs.getString("codigo");

                    modelo.addRow(new Object[]{id, data, codigo});
                }
                conexao.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
            } 


            String escolha = escolhaOrdenacao;


            Ordenacao.numeros();

            int[] imagens = new int[Ordenacao.num.size()];
            for (int i = 0; i < Ordenacao.num.size(); i++) {
                imagens[i] = Ordenacao.num.get(i);
            }


            //String escolha="quick";
            String tempototal=tempo(escolha,imagens);
            jTextFieldTempoDaordenacao.setText(tempototal);

            }
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jRadioButtonQuickSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonQuickSortActionPerformed
        escolhaOrdenacao = "quick";
        ok = "ok";
    }//GEN-LAST:event_jRadioButtonQuickSortActionPerformed

    private void jTextFieldData2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldData2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldData2ActionPerformed

    private void jButtonNovaPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovaPesquisaActionPerformed
        jTextFieldTempoDaordenacao.setText(" ");
        String url = "jdbc:mysql://localhost:3306/imagem";
        String user = "root";
        String password = "";
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Data");
        modelo.addColumn("Codigo");

        try (Connection conexao = DriverManager.getConnection(url, user, password)) {

            String sql = "SELECT id, dat, codigo FROM nomes;";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            // Obtém o modelo da JTable existente
           
              modelo = (DefaultTableModel) jTable1.getModel();

        

            // Limpa a tabela antes de preencher
            modelo.setRowCount(0);

            while (rs.next()) {
                int id = rs.getInt("id");
                String data = rs.getString("dat");
                String codigo = rs.getString("codigo");

                modelo.addRow(new Object[]{id, data, codigo});
            }
            

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
    
        
    }//GEN-LAST:event_jButtonNovaPesquisaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            if (jTable1.getSelectedRow() != -1) {
            jTextFieldID.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            jTextFieldData2.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            jTextFieldCodigo.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha válida.");
        }
               try {
            //Transforma ID em inteiro
            int id = Integer.parseInt(jTextFieldID.getText());

            // Conexão com banco
            String url = "jdbc:mysql://localhost:3306/imagem";
            String user = "root";
            String password = "";

            // Usa driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(url, user, password);

            // Consulta: pegue a primeira imagem
            String sql = "SELECT imagem, dat FROM nomes WHERE id = ?";
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                //Pega a data do BD e exibe no label Data
                String data = rs.getString("dat");
                //                jTextFieldData.setText(data);
                jTextFieldData2.setText(data);

                // Lê os bytes da coluna BLOB
                byte[] bytesImagem = rs.getBytes("imagem");

                // Cria ImageIcon a partir dos bytes
                ImageIcon icon = new ImageIcon(bytesImagem);

                // Escala a imagem para caber no JLabel
                Image img = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
                icon = new ImageIcon(img);

                // Define no JLabel
                jLabelImagem.setIcon(icon);
            } else {
                jLabelImagem.setText("Nenhuma imagem encontrada.");
            }

            rs.close();
            stmt.close();
            conexao.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/image\n" +
"            Connection con = DriverManager.getConnection(\"jdbc:mysql://localhost:3306/m", "root", "");
            String sql = "INSERT INTO nomes (dat, codigo, imagem) VALUES (?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);

            // Pegando os valores da tela
            java.sql.Date data = java.sql.Date.valueOf(jTextFieldData2.getText());
            int codigo = Integer.parseInt(jTextFieldCodigo.getText());
            String caminhoImagem = jLabelImagem.getToolTipText();

            stmt.setDate(1, data);
            stmt.setInt(2, codigo);

            // Configura o campo da imagem
            if (caminhoImagem != null) {
                File imagemFile = new File(caminhoImagem);
                FileInputStream fis = new FileInputStream(imagemFile);
                stmt.setBinaryStream(3, fis, (int) imagemFile.length());
            } else {
                stmt.setNull(3, java.sql.Types.BLOB);
            }

            // Executa o INSERT só depois de configurar tudo
            stmt.executeUpdate();

            // Fecha recursos
            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(null, "Imagem cadastrada com sucesso!");

            // Atualiza a tabela
            readJTable();

        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + e.getMessage());
        }

    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
               
        if (jTable1.getSelectedRow() != -1) {
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/imagem", "root", "");
                String sql = "UPDATE nomes SET dat = ?, codigo = ?, imagem = ? WHERE id = ?";
                PreparedStatement stmt = con.prepareStatement(sql);

                java.sql.Date data = java.sql.Date.valueOf(jTextFieldData2.getText());
                int codigo = Integer.parseInt(jTextFieldCodigo.getText());
                int id = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);

                stmt.setDate(1, data);
                stmt.setInt(2, codigo);
                stmt.setInt(3, id);

                stmt.executeUpdate();
                stmt.close();
                con.close();

                JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");

                readJTable();

            } catch (Exception e) {
                //JOptionPane.showMessageDialog(null, "Erro ao alterar: " + e.getMessage());
            }
        } else {
           JOptionPane.showMessageDialog(null, "Selecione um registro para alterar.");
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
              if (jTable1.getSelectedRow() != -1) {
            try {
                int id = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/imagem", "root", "");
                String sql = "DELETE FROM nomes WHERE id = ?";
                PreparedStatement stmt = con.prepareStatement(sql);

                stmt.setInt(1, id);
                stmt.executeUpdate();

                stmt.close();
                con.close();

                JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");

                readJTable();

                // limpa os campos
                jTextFieldID.setText("");
                jTextFieldData2.setText("");
                jTextFieldCodigo.setText("");

            }
            catch (Exception e) {
                //JOptionPane.showMessageDialog(null, "Erro ao excluir: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um registro para excluir.");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jLabelImagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagemMouseClicked
                                               
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecione uma imagem");

        // filtro para mostrar apenas imagens
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Imagens (JPG, PNG, GIF)", "jpg", "jpeg", "png", "gif");
        fileChooser.setFileFilter(filter);

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            // Mostra a imagem no JLabel
            ImageIcon icon = new ImageIcon(file.getAbsolutePath());
            Image image = icon.getImage().getScaledInstance(jLabelImagem.getWidth(), jLabelImagem.getHeight(), Image.SCALE_SMOOTH);
            jLabelImagem.setIcon(new ImageIcon(image));

            // Salva o caminho da imagem (para usar no botão "Cadastrar")
            jLabelImagem.setToolTipText(file.getAbsolutePath());
        }
    }//GEN-LAST:event_jLabelImagemMouseClicked
    
    

    
  
    public static void main(String args[]) throws SQLException {
        
       
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAPS().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovaPesquisa;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JLabel jLabelTempoDaOrdenacao;
    private javax.swing.JLabel jLabelTipoDeBusca;
    private javax.swing.JRadioButton jRadioButtonBubbleSort;
    private javax.swing.JRadioButton jRadioButtonInsertionSort;
    private javax.swing.JRadioButton jRadioButtonQuickSort;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldData2;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldTempoDaordenacao;
    // End of variables declaration//GEN-END:variables

    private void readJTable() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}   

