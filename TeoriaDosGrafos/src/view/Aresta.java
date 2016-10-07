/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import model.Aluno;
import model.Disciplina;

/**
 *
 * @author Sujajeb
 */
public class Aresta extends javax.swing.JDialog {

    java.awt.Frame pai;
    private DefaultTableModel modelo = new DefaultTableModel();
    private DefaultListModel model = new DefaultListModel();
    private List<Node> vertices = new ArrayList<Node>();
    private List<Disciplina> disciplinasAluno = Disciplina.getDisciplinas();
    private String xml1 = null;
    private String choose = null;

    public void setChoose(String choose) {
        this.choose = choose;
    }

    public String getChoose() {
        return choose;
    }

    /**
     * Creates new form FrmCadClienteModal
     */
    public Aresta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        pai = parent;

        initComponents();
        modelo.addColumn("Aluno");
        modelo.addColumn("Ano");
        modelo.addColumn("Disciplina");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        FileChooser = new javax.swing.JFileChooser();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaAlunos = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaVertices = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        PainelAresta = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        listaNode02 = new javax.swing.JComboBox<>();
        listaNode01 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeAresta = new javax.swing.JTextField();
        CriarAresta = new javax.swing.JButton();
        EditarAresta = new javax.swing.JButton();
        removerAresta = new javax.swing.JButton();
        limparTextoAresta = new javax.swing.JButton();
        PainelXML = new javax.swing.JPanel();
        abrirXML = new javax.swing.JButton();
        url = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        gerarXml = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        criarNo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nomeVertice = new javax.swing.JTextField();
        editarVertice = new javax.swing.JButton();
        removerVertice = new javax.swing.JButton();
        limparTextoVertice = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        FileChooser.setCurrentDirectory(new java.io.File("C:\\Users\\negro\\Desktop"));
        FileChooser.setDialogTitle("Esta é minha caixa aberta");
        FileChooser.setFileFilter(new MyCustomFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de alunos");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("Cadastro de Arestas");

        tabelaAlunos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 11))); // NOI18N
        tabelaAlunos.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        tabelaAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Ano", "Disciplina"
            }
        ));
        tabelaAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAlunosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaAlunos);

        listaVertices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaVerticesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaVertices);

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel8.setText("Lista de Vertices");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel9.setText("Lista de Arestas");

        PainelAresta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel7.setText("Selecione os Vertices da Aresta");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("2º Nó ");

        listaNode01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaNode01MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel4.setText("1º Nó ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setText("Nome Aresta");

        nomeAresta.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        CriarAresta.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        CriarAresta.setText("Criar Aresta");
        CriarAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarArestaActionPerformed(evt);
            }
        });

        EditarAresta.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        EditarAresta.setText("Editar");
        EditarAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        removerAresta.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        removerAresta.setText("Remover");
        removerAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerArestaActionPerformed(evt);
            }
        });

        limparTextoAresta.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        limparTextoAresta.setText("Limpar");
        limparTextoAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparTextoArestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelArestaLayout = new javax.swing.GroupLayout(PainelAresta);
        PainelAresta.setLayout(PainelArestaLayout);
        PainelArestaLayout.setHorizontalGroup(
            PainelArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelArestaLayout.createSequentialGroup()
                .addGroup(PainelArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelArestaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(16, 16, 16)
                        .addComponent(listaNode01, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelArestaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PainelArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelArestaLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(listaNode02, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))))
                .addGroup(PainelArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelArestaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelArestaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(nomeAresta, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(CriarAresta)
                .addContainerGap())
            .addGroup(PainelArestaLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelArestaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EditarAresta)
                .addGap(52, 52, 52)
                .addComponent(removerAresta)
                .addGap(44, 44, 44)
                .addComponent(limparTextoAresta)
                .addGap(29, 29, 29))
        );
        PainelArestaLayout.setVerticalGroup(
            PainelArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelArestaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelArestaLayout.createSequentialGroup()
                        .addGroup(PainelArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(listaNode01, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(8, 8, 8)
                        .addGroup(PainelArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(listaNode02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(CriarAresta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PainelArestaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(nomeAresta, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PainelArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditarAresta)
                    .addComponent(removerAresta)
                    .addComponent(limparTextoAresta))
                .addGap(30, 30, 30))
        );

        PainelArestaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {EditarAresta, limparTextoAresta, removerAresta});

        PainelXML.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        abrirXML.setBackground(new java.awt.Color(255, 204, 51));
        abrirXML.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        abrirXML.setText("Abrir XML");
        abrirXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirXMLActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel6.setText("Local do Arquivo");

        gerarXml.setBackground(new java.awt.Color(255, 51, 51));
        gerarXml.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        gerarXml.setText("Gerar XML");
        gerarXml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarXmlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelXMLLayout = new javax.swing.GroupLayout(PainelXML);
        PainelXML.setLayout(PainelXMLLayout);
        PainelXMLLayout.setHorizontalGroup(
            PainelXMLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelXMLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(PainelXMLLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PainelXMLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(abrirXML)
                    .addComponent(gerarXml, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PainelXMLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelXMLLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {abrirXML, gerarXml});

        PainelXMLLayout.setVerticalGroup(
            PainelXMLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelXMLLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(abrirXML)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gerarXml, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PainelXMLLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {abrirXML, gerarXml});

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        criarNo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        criarNo.setText("Criar Vértice");
        criarNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarNoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("Nome do Vértice:");

        editarVertice.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        editarVertice.setText("Editar");
        editarVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarVerticeActionPerformed(evt);
            }
        });

        removerVertice.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        removerVertice.setText("Remover");

        limparTextoVertice.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        limparTextoVertice.setText("Limpar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(editarVertice, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removerVertice))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nomeVertice, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(criarNo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(limparTextoVertice)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeVertice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(criarNo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removerVertice)
                    .addComponent(editarVertice, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(limparTextoVertice)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(96, 96, 96))))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(PainelAresta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelXML, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PainelXML, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelAresta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CriarArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarArestaActionPerformed
        // TODO add your handling code here:
        Aluno aluno = new Aluno();
        aluno.setNome(nomeAluno.getText());
        aluno.setAno((String) nomeAresta.getText());
        aluno.setDisciplina(disciplinasAluno.get(listaNode01.getSelectedIndex()));
        tabelaAlunos.setModel(modelo);
        modelo.addRow(new Object[]{nomeAluno.getText(), nomeAresta.getText(), aluno.getDisciplina().getNome()});
        alunos.add(aluno);
        nomeAluno.setText("");
        nomeAresta.setText("");
    }//GEN-LAST:event_CriarArestaActionPerformed

    private void limparTextoArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparTextoArestaActionPerformed
        // TODO add your handling code here:
        nomeAluno.setText("");
        nomeAresta.setText("");
    }//GEN-LAST:event_limparTextoArestaActionPerformed

    private void removerArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerArestaActionPerformed
        // TODO add your handling code here:
        int index = tabelaAlunos.getSelectedRow();
        if ((modelo.getRowCount() > 0) && (index >= 0)) {

            alunos.remove(index);
            Object remove;
            remove = modelo.getValueAt(index, 0);
            modelo.removeRow(index);
            nomeAluno.setText("");
            nomeAresta.setText("");
            JOptionPane.showMessageDialog(null, remove.toString() + " foi removido com sucesso ");

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma aluno ");
        }
    }//GEN-LAST:event_removerArestaActionPerformed

    private void listaNode01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaNode01MouseClicked
        // TODO add your handling code here:
        listaNode01.removeAllItems();
        disciplinasAluno = Disciplina.getDisciplinas();
        for (Disciplina obj : disciplinasAluno) {
            listaNode01.addItem(obj.getNome());
    }//GEN-LAST:event_listaNode01MouseClicked
    }
    private void tabelaAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAlunosMouseClicked
        // TODO add your handling code here:
        int index = tabelaAlunos.getSelectedRow();
        if ((modelo.getRowCount() > 0) && (index >= 0)) {
            nomeAluno.setText(alunos.get(index).getNome());
            nomeAresta.setText(alunos.get(index).getAno());
            nomeAluno.setText(alunos.get(index).getNome());
            listaNode01.removeAllItems();
            listaNode01.addItem(alunos.get(index).getDisciplina().getNome());
        }


    }//GEN-LAST:event_tabelaAlunosMouseClicked

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        // TODO add your handling code here:
        int index = tabelaAlunos.getSelectedRow();
        if ((modelo.getRowCount() > 0) && (index >= 0)) {

            alunos.get(index).setNome(nomeAluno.getText());
            alunos.get(index).setAno((String) nomeAresta.getText());
            alunos.get(index).setDisciplina(disciplinasAluno.get(listaNode01.getSelectedIndex()));
            tabelaAlunos.setModel(modelo);
            modelo.removeRow(index);
            modelo.insertRow(index, new Object[]{nomeAluno.getText(), nomeAresta.getText(), alunos.get(index).getDisciplina().getNome()});
            nomeAluno.setText("");
            nomeAresta.setText("");
            Object edit;
            edit = modelo.getValueAt(index, 0);

            JOptionPane.showMessageDialog(null, edit.toString() + " foi editado com sucesso ");

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma aluno ");
        }
    }//GEN-LAST:event_editarActionPerformed

    private void gerarXmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarXmlActionPerformed
        // TODO add your handling code here:
        JFileChooser arquivo = new JFileChooser();
        FileNameExtensionFilter filtroPDF = new FileNameExtensionFilter("Arquivos XML", "xml");
        arquivo.addChoosableFileFilter(filtroPDF);
        arquivo.setAcceptAllFileFilterUsed(false);
        if (arquivo.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            url.setText(arquivo.getSelectedFile().getAbsolutePath());
            choose = url.getText();

        }

        try {
            XStream xstream = new XStream(new DomDriver());
            String xml = xstream.toXML(alunos);
            System.out.println(xml);
            File file = new File(choose + ".xml");
            PrintWriter print = new PrintWriter(file);
            print.write(xml);
            print.flush();
            print.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Aresta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gerarXmlActionPerformed

    private void abrirXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirXMLActionPerformed
        JFileChooser arquivo = new JFileChooser();
        FileNameExtensionFilter filtroPDF = new FileNameExtensionFilter("Arquivos XML", "xml");
        arquivo.addChoosableFileFilter(filtroPDF);
        arquivo.setAcceptAllFileFilterUsed(false);
        if (arquivo.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            url.setText(arquivo.getSelectedFile().getAbsolutePath());
            choose = url.getText();

            try {
                // TODO add your handling code here:

                FileReader leitor = new FileReader(choose);

                XStream xstream = new XStream(new DomDriver());
                this.tabelaAlunos.setModel(modelo);

                while (modelo.getRowCount() > 0) {
                    modelo.removeRow(0);

                }
                alunos = (ArrayList) xstream.fromXML(leitor);

                for (Aluno inserir : alunos) {

                    modelo.addRow(new Object[]{inserir.getNome(), inserir.getAno(), inserir.getDisciplina().getNome()});
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Aresta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_abrirXMLActionPerformed

    private void criarNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarNoActionPerformed
        // TODO add your handling code here:
        Node no=new Node();
        no.setId(nomeVertice.getText());
        vertices.add(no);
        nomeVertice.setText("");
        
    }//GEN-LAST:event_criarNoActionPerformed

    private void editarVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarVerticeActionPerformed
        // TODO add your handling code here:
       listaVertices.setModel(model);
       String nome= nomeVertice.getText();
       for(Node no: vertices){
           if(no.getId().equals(nome))
         no.setId(nomeVertice.getText());
        nomeVertice.setText("");
       }
    }//GEN-LAST:event_editarVerticeActionPerformed

    private void listaVerticesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaVerticesMouseClicked
        // TODO add your handling code here:
        int index=listaVertices.getSelectedIndex();
        nomeVertice.setText(vertices.get(index).getId());
    }//GEN-LAST:event_listaVerticesMouseClicked

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
            java.util.logging.Logger.getLogger(Aresta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aresta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aresta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aresta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Aresta dialog = new Aresta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });

    }

    class MyCustomFilter extends javax.swing.filechooser.FileFilter {

        @Override
        public boolean accept(File file) {
            // Allow only directories, or files with ".txt" extension
            return file.isDirectory() || file.getAbsolutePath().endsWith(".xml");
        }

        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "Text documents (*.xml)";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CriarAresta;
    private javax.swing.JButton EditarAresta;
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JPanel PainelAresta;
    private javax.swing.JPanel PainelXML;
    private javax.swing.JButton abrirXML;
    private javax.swing.JButton criarNo;
    private javax.swing.JButton editarVertice;
    private javax.swing.JButton gerarXml;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton limparTextoAresta;
    private javax.swing.JButton limparTextoVertice;
    private javax.swing.JComboBox<String> listaNode01;
    private javax.swing.JComboBox<String> listaNode02;
    private javax.swing.JList<String> listaVertices;
    private javax.swing.JTextField nomeAresta;
    private javax.swing.JTextField nomeVertice;
    private javax.swing.JButton removerAresta;
    private javax.swing.JButton removerVertice;
    private javax.swing.JTable tabelaAlunos;
    private javax.swing.JTextField url;
    // End of variables declaration//GEN-END:variables
}
