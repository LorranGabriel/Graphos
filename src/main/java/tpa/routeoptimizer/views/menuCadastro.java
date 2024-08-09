/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tpa.routeoptimizer.views;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.LineBorder;
import tpa.routeoptimizer.lib.Aresta;
import tpa.routeoptimizer.lib.Grafo;
import tpa.routeoptimizer.lib.Vertice;
/**
 *
 * @author 20162bsi0325
 */

public class menuCadastro extends javax.swing.JFrame {
    public Grafo<String> grafo;

    public AddCity addCity;
    public AddRoute addRoute;
    public DistanceBetweenCitys distanceBetweenCitys;

    public WarningPopup warningPopup;

    /**
     * Creates new form menuCadastro
     */
    
    public menuCadastro() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        grafo = new Grafo<>();
        graphVizualizeField.setVisible(false);
        warningPopup = new WarningPopup();
        warningPopup.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        calcAGMButton = new javax.swing.JButton();
        addRouteButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        addCityButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        calcDistButton = new javax.swing.JButton();
        calcDistanceAGM = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        fileField = new javax.swing.JTextField();
        uploadFileButton = new javax.swing.JButton();
        feedbackLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        graphVizualizeField = new javax.swing.JTextArea();
        refreshButton = new javax.swing.JButton();
        saveGraphButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setPreferredSize(new java.awt.Dimension(270, 800));

        calcAGMButton.setBackground(new java.awt.Color(0, 0, 0));
        calcAGMButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        calcAGMButton.setForeground(new java.awt.Color(255, 255, 255));
        calcAGMButton.setText("CalculaAGM");
        calcAGMButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcAGMButtonMouseClicked(evt);
            }
        });

        addRouteButton.setBackground(new java.awt.Color(0, 0, 0));
        addRouteButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addRouteButton.setForeground(new java.awt.Color(255, 255, 255));
        addRouteButton.setText("Acrescentar Rota");
        addRouteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addRouteButtonMouseClicked(evt);
            }
        });
        addRouteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRouteButtonActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(56, 56, 56));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 3, 28)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sistema Acadêmico");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        addCityButton.setBackground(new java.awt.Color(0, 0, 0));
        addCityButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        addCityButton.setForeground(new java.awt.Color(255, 255, 255));
        addCityButton.setText("Adicionar Cidade");
        addCityButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCityButtonMouseClicked(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        calcDistButton.setBackground(new java.awt.Color(0, 0, 0));
        calcDistButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        calcDistButton.setForeground(new java.awt.Color(255, 255, 255));
        calcDistButton.setText("Calcula Distancia");
        calcDistButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcDistButtonMouseClicked(evt);
            }
        });

        calcDistanceAGM.setBackground(new java.awt.Color(0, 0, 0));
        calcDistanceAGM.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        calcDistanceAGM.setForeground(new java.awt.Color(255, 255, 255));
        calcDistanceAGM.setText("Calcula Distancia AGM");
        calcDistanceAGM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcDistanceAGMMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addRouteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addCityButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(calcDistButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calcAGMButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calcDistanceAGM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(addCityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addRouteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calcDistButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calcAGMButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calcDistanceAGM, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fileField.setText("entrada.txt");

        uploadFileButton.setText("Carregar arquivo...");
        uploadFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadFileButtonMouseClicked(evt);
            }
        });

        graphVizualizeField.setColumns(20);
        graphVizualizeField.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        graphVizualizeField.setRows(5);
        jScrollPane1.setViewportView(graphVizualizeField);

        refreshButton.setText("Atualizar");
        refreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshButtonMouseClicked(evt);
            }
        });

        saveGraphButton.setText("Salvar grapho");
        saveGraphButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveGraphButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(feedbackLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshButton)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(fileField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(uploadFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(saveGraphButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(166, 166, 166)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uploadFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveGraphButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(feedbackLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCityButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCityButtonMouseClicked
        if (grafo.checkIsEmpty()) {
            warningPopup.setVisible(true);
            uploadFileButton.setBorder(new LineBorder(Color.RED, 2)); 
        }else{
            addCity = new AddCity(grafo);
            addCity.setVisible(true);   
        }
    }//GEN-LAST:event_addCityButtonMouseClicked

    private void calcAGMButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcAGMButtonMouseClicked
        if (grafo.checkIsEmpty()) {
            warningPopup.setVisible(true);
            uploadFileButton.setBorder(new LineBorder(Color.RED, 2)); 

        }else{
            graphVizualizeField.setVisible(true);
            Grafo graphAGM = grafo.criarGrafoAGM();;
            graphVizualizeField.setText(graphAGM.formatarResultadoAGM(graphAGM));
            //graphVizualizeField.setText(grafo.calcularAGMStr());
        }
    }//GEN-LAST:event_calcAGMButtonMouseClicked

    private void addRouteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRouteButtonMouseClicked
        if (grafo.checkIsEmpty()) {
            warningPopup.setVisible(true);
            uploadFileButton.setBorder(new LineBorder(Color.RED, 2)); 

        }else{
            addRoute = new AddRoute(grafo);
            addRoute.setVisible(true);
        }
    }//GEN-LAST:event_addRouteButtonMouseClicked

    private void calcDistButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcDistButtonMouseClicked
        if (grafo.checkIsEmpty()) {
            warningPopup.setVisible(true);
            uploadFileButton.setBorder(new LineBorder(Color.RED, 2)); 

        }else{
            distanceBetweenCitys = new DistanceBetweenCitys(grafo);
            distanceBetweenCitys.setVisible(true);
        }
    }//GEN-LAST:event_calcDistButtonMouseClicked

    private void uploadFileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadFileButtonMouseClicked
        
        if (grafo.checkIsEmpty()){
            String fileName = this.fileField.getText();
            String relativePath = "src" + File.separator + fileName;
            File file = new File(relativePath);
            uploadFileButton.setBorder(UIManager.getBorder("Button.border"));

            String absolutePath = file.getAbsolutePath();

            try (BufferedReader reader = new BufferedReader(new FileReader(absolutePath))) {
                int numCidades = Integer.parseInt(reader.readLine().trim());

                ArrayList<String> cidades = new ArrayList<>();
                for (int i = 0; i < numCidades; i++) {
                    cidades.add(reader.readLine().trim().toLowerCase());
                }


                for (String cidade : cidades) {
                    System.out.println(cidade);
                    grafo.adicionarVertice(cidade);
                }
                float[][] matrizAdjacencia = new float[numCidades][numCidades];
                for (int i = 0; i < numCidades; i++) {
                    String[] valores = reader.readLine().split(",");
                    for (int j = 0; j < numCidades; j++) {
                        matrizAdjacencia[i][j] = Float.parseFloat(valores[j].trim());
                    }
                }

                for (int i = 0; i < numCidades; i++) {
                    for (int j = 0; j < numCidades; j++) {
                        if (matrizAdjacencia[i][j] > 0) {
                            grafo.adicionarAresta(cidades.get(i), cidades.get(j), matrizAdjacencia[i][j]);
                        }
                    }
                }
                feedbackLabel.setText("Grapho carregado com sucesso!");
                graphVizualizeField.setVisible(true);

                String graphVizualizer = grafo.imprimirGrafo();
                graphVizualizeField.setText(graphVizualizer);

            } catch (IOException e) {
                feedbackLabel.setText("Ocorreu um erro ao abrir o arquivo: "+absolutePath );
                graphVizualizeField.setVisible(false);
            }   
        }
    }//GEN-LAST:event_uploadFileButtonMouseClicked

    private void refreshButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshButtonMouseClicked
        graphVizualizeField.setVisible(true);

        String graphVizualizer = grafo.imprimirGrafo();
        graphVizualizeField.setText(graphVizualizer);
    }//GEN-LAST:event_refreshButtonMouseClicked

    private void saveGraphButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveGraphButtonMouseClicked
        // TODO add your handling code here:
    // TODO add your handling code here:
        String fileName = this.fileField.getText();
        String relativePath = "src" + File.separator + fileName;
        File file = new File(relativePath);

        String absolutePath = file.getAbsolutePath();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(absolutePath))) {
            ArrayList<String> vertices = grafo.obterVerticesValues();
            int numCidades = vertices.size();

            // Escreve o número de cidades
            writer.write(String.valueOf(numCidades));
            writer.newLine();

            // Escreve os nomes das cidades
            for (String vertice : vertices) {
                writer.write(vertice);
                writer.newLine();
            }

            // Cria a matriz de adjacência
            float[][] matrizAdjacencia = new float[numCidades][numCidades];
            for (int i = 0; i < numCidades; i++) {
                Vertice<String> vertice = grafo.obterVertice(vertices.get(i));
                if (vertice != null) {
                    for (Aresta<String> aresta : vertice.getDestinos()) {
                        int j = vertices.indexOf(aresta.getDestino().getValor());
                        matrizAdjacencia[i][j] = aresta.getPeso();
                    }
                }
            }

            // Escreve a matriz de adjacência
            for (int i = 0; i < numCidades; i++) {
                for (int j = 0; j < numCidades; j++) {
                    writer.write(String.valueOf(matrizAdjacencia[i][j]));
                    if (j < numCidades - 1) {
                        writer.write(",");
                    }
                }
                writer.newLine();
            }

            feedbackLabel.setText("Grafo salvo com sucesso!");
        } catch (IOException e) {
            feedbackLabel.setText("Ocorreu um erro ao salvar o arquivo: " + absolutePath);
        }
    }//GEN-LAST:event_saveGraphButtonMouseClicked

    private void addRouteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRouteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addRouteButtonActionPerformed

    private void calcDistanceAGMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcDistanceAGMMouseClicked
                // TODO add your handling code here:
        if (grafo.checkIsEmpty()) {
            warningPopup.setVisible(true);
            uploadFileButton.setBorder(new LineBorder(Color.RED, 2)); 
        }else{
            Grafo graphAGM = grafo.criarGrafoAGM();
            distanceBetweenCitys = new DistanceBetweenCitys(graphAGM);
            distanceBetweenCitys.setVisible(true);
        }
    }//GEN-LAST:event_calcDistanceAGMMouseClicked
   
    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCityButton;
    private javax.swing.JButton addRouteButton;
    private javax.swing.JButton calcAGMButton;
    private javax.swing.JButton calcDistButton;
    private javax.swing.JButton calcDistanceAGM;
    private javax.swing.JLabel feedbackLabel;
    private javax.swing.JTextField fileField;
    private javax.swing.JTextArea graphVizualizeField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveGraphButton;
    private javax.swing.JButton uploadFileButton;
    // End of variables declaration//GEN-END:variables


}
