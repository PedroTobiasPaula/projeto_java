/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestao_ti2.pkg0;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class pag1 extends javax.swing.JFrame {

    static String driverJDBC = "org.gjt.mm.mysql.Driver";
    static String url = "jdbc:mysql://localhost:3306/gestao_ti";
    static String user = "root";
    static String senha = "pedro1007";
    Connection conexao;

    public pag1() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        try {
            Class.forName(driverJDBC);
            System.out.println("Driver carregado com sucesso.");
        } catch (Exception e) {
            System.out.println("Falha no carregamento do driver.");
        } //Fim do carregamento do driver
        try {
            conexao = DriverManager.getConnection(url, user, senha);
            System.out.println("Conexão realizada com sucesso.");
        } catch (Exception e) {
            System.out.println("Falha na conexão com o BD.");
        } //Fim do estabelecimento da conexão
        listarItens();
        listarCategoria();
        buscarNomeMovimentacao();
        buscarNomeCategoria();
        buscarBPsMovi();
        ListarBPs();
    } //Fim construtor

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        tfEstado = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lblDesc = new javax.swing.JLabel();
        tfDesc = new javax.swing.JTextField();
        btnCadastro = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblCategorias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabeleItens = new javax.swing.JTable();
        lblDesc1 = new javax.swing.JLabel();
        tfBP = new javax.swing.JTextField();
        lblDesc2 = new javax.swing.JLabel();
        tfHora = new javax.swing.JTextField();
        lblCategoria1 = new javax.swing.JLabel();
        tfData = new javax.swing.JTextField();
        lblCategoria2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtCategoria = new javax.swing.JTable();
        lblMovimentação = new javax.swing.JLabel();
        lblCategoriaDesc = new javax.swing.JLabel();
        tfDescCat = new javax.swing.JTextField();
        tfDescMovimentacao = new javax.swing.JTextField();
        btnCadastroCategoria = new javax.swing.JButton();
        lblNomeLocalMovi = new javax.swing.JLabel();
        lblNome3 = new javax.swing.JLabel();
        lblCadCategoria = new javax.swing.JLabel();
        lblMovimentação1 = new javax.swing.JLabel();
        tfDataMovi = new javax.swing.JTextField();
        lblNome4 = new javax.swing.JLabel();
        tfNomeMovimentacao = new javax.swing.JTextField();
        btnCadastroMovimentacao = new javax.swing.JButton();
        jcbCategoria = new javax.swing.JComboBox<>();
        jcbObra = new javax.swing.JComboBox<>();
        lblNomeCategoria1 = new javax.swing.JLabel();
        tfNomeCat1 = new javax.swing.JTextField();
        lblCategoria3 = new javax.swing.JLabel();
        tfLocalMovi1 = new javax.swing.JTextField();
        lblCadCategoria1 = new javax.swing.JLabel();
        btnCadastroMovi = new javax.swing.JButton();
        jcBPsMovi = new javax.swing.JComboBox<>();
        jcListaBPs = new javax.swing.JComboBox<>();
        jADD = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtBPs = new javax.swing.JTable();
        lblMovimentacao = new javax.swing.JLabel();
        jcTipo = new javax.swing.JComboBox<>();
        lblNomeCategoria2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEstadoActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNome.setText("Nome");
        lblNome.setToolTipText("");

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCategoria.setText("Categoria");

        lblQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblQuantidade.setText("Estado");

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        lblDesc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDesc.setText("Descriçao");
        lblDesc.setToolTipText("");

        tfDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescActionPerformed(evt);
            }
        });

        btnCadastro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastro.setText("Cadastrar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jtTabeleItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "DESCRIÇÃO", "CATEGORIA", "ID OBRA", "HORA", "BP", "OBRA", "ESTADO"
            }
        ));
        jtTabeleItens.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jtTabeleItensComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(jtTabeleItens);

        lblDesc1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDesc1.setText("BP");
        lblDesc1.setToolTipText("");

        tfBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBPActionPerformed(evt);
            }
        });

        lblDesc2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDesc2.setText("OBRA");
        lblDesc2.setToolTipText("");

        tfHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHoraActionPerformed(evt);
            }
        });

        lblCategoria1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCategoria1.setText("ID Movimentação");

        tfData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataActionPerformed(evt);
            }
        });

        lblCategoria2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCategoria2.setText("Data");

        jtCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOME", "DESCRIÇÃO"
            }
        ));
        jScrollPane2.setViewportView(jtCategoria);

        lblMovimentação.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMovimentação.setText("Cadastro Item");
        lblMovimentação.setToolTipText("");

        lblCategoriaDesc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCategoriaDesc.setText("Descriçao");
        lblCategoriaDesc.setToolTipText("");

        tfDescCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescCatActionPerformed(evt);
            }
        });

        tfDescMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescMovimentacaoActionPerformed(evt);
            }
        });

        btnCadastroCategoria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastroCategoria.setText("Cadastrar");
        btnCadastroCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroCategoriaActionPerformed(evt);
            }
        });

        lblNomeLocalMovi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNomeLocalMovi.setText("Local");
        lblNomeLocalMovi.setToolTipText("");

        lblNome3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNome3.setText("Descrição");
        lblNome3.setToolTipText("");

        lblCadCategoria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCadCategoria.setText("Criar Movimentação");
        lblCadCategoria.setToolTipText("");

        lblMovimentação1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMovimentação1.setText("Cadastro Obra");
        lblMovimentação1.setToolTipText("");

        tfDataMovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataMoviActionPerformed(evt);
            }
        });

        lblNome4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNome4.setText("Nome");
        lblNome4.setToolTipText("");

        tfNomeMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeMovimentacaoActionPerformed(evt);
            }
        });

        btnCadastroMovimentacao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastroMovimentacao.setText("Cadastrar");
        btnCadastroMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroMovimentacaoActionPerformed(evt);
            }
        });

        jcbCategoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jcbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCategoriaActionPerformed(evt);
            }
        });

        jcbObra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jcbObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbObraActionPerformed(evt);
            }
        });

        lblNomeCategoria1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNomeCategoria1.setText("Nome");
        lblNomeCategoria1.setToolTipText("");

        tfNomeCat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeCat1ActionPerformed(evt);
            }
        });

        lblCategoria3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCategoria3.setText("Data");

        tfLocalMovi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLocalMovi1ActionPerformed(evt);
            }
        });

        lblCadCategoria1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCadCategoria1.setText("Cadastro Categoria");
        lblCadCategoria1.setToolTipText("");

        btnCadastroMovi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastroMovi.setText("Cadastrar");
        btnCadastroMovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroMoviActionPerformed(evt);
            }
        });

        jcBPsMovi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jcBPsMovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcBPsMoviActionPerformed(evt);
            }
        });

        jcListaBPs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jcListaBPs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcListaBPsActionPerformed(evt);
            }
        });

        jADD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jADD.setText("Adicionar");
        jADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jADDActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Finalizar");

        jtBPs.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtBPs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "BPs"
            }
        ));
        jScrollPane3.setViewportView(jtBPs);

        lblMovimentacao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMovimentacao.setText("Itens da Movimentação");
        lblMovimentacao.setToolTipText("");

        jcTipo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jcTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "categoria", "obra" }));

        lblNomeCategoria2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNomeCategoria2.setText("Tipo");
        lblNomeCategoria2.setToolTipText("");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addComponent(lblMovimentação, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(140, 140, 140))
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(menuLayout.createSequentialGroup()
                                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblCategoria3, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                            .addComponent(lblNomeLocalMovi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tfLocalMovi1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(tfDataMovi, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnCadastroMovi, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 123, Short.MAX_VALUE)
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                                        .addComponent(jADD)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jcListaBPs, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcBPsMovi, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblMovimentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(2, 2, 2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                        .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblCategoria2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lblNomeCategoria1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addGroup(menuLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(lblNomeCategoria2, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(menuLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblCategoriaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCategoria1))
                            .addGroup(menuLayout.createSequentialGroup()
                                .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDesc2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(menuLayout.createSequentialGroup()
                                .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(menuLayout.createSequentialGroup()
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDesc1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnCadastroCategoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfDescCat, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNomeCat1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(jcTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNome3, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCategorias)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfHora, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfDesc)
                                .addComponent(jcbObra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfBP)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMovimentação1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                .addComponent(btnCadastroMovimentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(tfDescMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNomeMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addGap(124, 124, 124)
                    .addComponent(lblCadCategoria1, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addGap(1748, 1748, 1748)))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMovimentação, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDesc1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfBP, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDesc2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcbObra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfHora, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCadastro)
                                    .addComponent(btnLimpar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMovimentação1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(menuLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(lblCategorias))
                                    .addGroup(menuLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfNomeMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(menuLayout.createSequentialGroup()
                                        .addComponent(lblNome4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jcTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblNomeCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDescMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNomeCat1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNomeCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastroMovimentacao)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDescCat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCategoriaDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCadastroCategoria)))))
                .addGap(18, 18, 18)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCadCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMovimentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeLocalMovi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfLocalMovi1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcBPsMovi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCategoria3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDataMovi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14))
                            .addGroup(menuLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcListaBPs)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jADD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCadastroMovi)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(298, 298, 298))
            .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuLayout.createSequentialGroup()
                    .addGap(325, 325, 325)
                    .addComponent(lblCadCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(507, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEstadoActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        String instSQL = "insert into iten (nome, descricao, categoria_nome,data_criação, BP, obra_nome, estado, id_movi) values (?,?,?,?,?,?,?,?);";

        try {
            PreparedStatement ps = conexao.prepareStatement(instSQL);
            ps.setString(1, tfNome.getText());
            ps.setString(2, tfDesc.getText());
            String value2 = jcbCategoria.getSelectedItem().toString();
            ps.setString(3, value2);
            ps.setString(4, tfData.getText());
            ps.setString(5, tfHora.getText());
            ps.setString(6, tfBP.getText());
            String value = jcbObra.getSelectedItem().toString();
            ps.setString(7, value);
            ps.setString(8, tfEstado.getText());
            ps.execute();
            btnLimpar.doClick();
            System.out.println("Cadastro realizado com sucesso.");
            JOptionPane.showMessageDialog(null,
                    "Cadastro realizado com sucesso.",
                    "Realização de cadastro",
                    JOptionPane.INFORMATION_MESSAGE);
            ListarBPs();
            listarItens();
        } catch (Exception e) {
            System.out.println("Falha no cadastro - "
                    + e.toString());
            JOptionPane.showMessageDialog(null,
                    "Falha no cadastro - " + e.toString(),
                    "Realização de cadastro",
                    JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        tfNome.setText(null);

        tfBP.setText(null);
        tfDesc.setText(null);

    }//GEN-LAST:event_btnLimparActionPerformed

    private void jtTabeleItensComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jtTabeleItensComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTabeleItensComponentAdded

    private void tfBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBPActionPerformed

    private void tfHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHoraActionPerformed

    private void tfDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDataActionPerformed

    private void tfDescCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescCatActionPerformed

    private void tfDescMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescMovimentacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescMovimentacaoActionPerformed

    private void btnCadastroCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroCategoriaActionPerformed
        String instSQL = "insert into ? (nome, descricao) values (?,?);";

        try {
            PreparedStatement ps = conexao.prepareStatement(instSQL);
            String value = jcTipo.getSelectedItem().toString();
            ps.setString(1, value);
            ps.setString(2, tfDataMovi.getText());
            ps.setString(3, tfDescCat.getText());
            ps.execute();
            System.out.println("Cadastro realizado com sucesso.");
            JOptionPane.showMessageDialog(null,
                    "Cadastro realizado com sucesso.",
                    "Realização de cadastro",
                    JOptionPane.INFORMATION_MESSAGE);

            listarCategoria();
            buscarNomeCategoria();
        } catch (Exception e) {
            System.out.println("Falha no cadastro - "
                    + e.toString());
            JOptionPane.showMessageDialog(null,
                    "Falha no cadastro - " + e.toString(),
                    "Realização de cadastro",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnCadastroCategoriaActionPerformed

    private void tfDataMoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataMoviActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDataMoviActionPerformed

    private void tfNomeMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeMovimentacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeMovimentacaoActionPerformed

    private void btnCadastroMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroMovimentacaoActionPerformed
        String instSQL = "insert into obra (nome, descricao) values (?,?);";

        try {
            PreparedStatement ps = conexao.prepareStatement(instSQL);
            ps.setString(1, tfNomeMovimentacao.getText());
            ps.setString(2, tfDescMovimentacao.getText());
            ps.execute();
            System.out.println("Cadastro realizado com sucesso.");
            JOptionPane.showMessageDialog(null,
                    "Cadastro realizado com sucesso.",
                    "Realização de cadastro",
                    JOptionPane.INFORMATION_MESSAGE);
            listarCategoria();
            buscarNomeMovimentacao();
        } catch (Exception e) {
            System.out.println("Falha no cadastro - "
                    + e.toString());
            JOptionPane.showMessageDialog(null,
                    "Falha no cadastro - " + e.toString(),
                    "Realização de cadastro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastroMovimentacaoActionPerformed

    private void jcbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCategoriaActionPerformed

    }//GEN-LAST:event_jcbCategoriaActionPerformed

    private void jcbObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbObraActionPerformed

    private void tfNomeCat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeCat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeCat1ActionPerformed

    private void tfLocalMovi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLocalMovi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLocalMovi1ActionPerformed

    private void btnCadastroMoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroMoviActionPerformed

        String instSQL = "insert into movimentacao (nome, data) values (?,?);";

        try {
            PreparedStatement ps = conexao.prepareStatement(instSQL);
            ps.setString(1, tfLocalMovi1.getText());
            ps.setString(2, tfDataMovi.getText());
            ps.execute();
            System.out.println("Cadastro realizado com sucesso.");
            JOptionPane.showMessageDialog(null,
                    "Cadastro realizado com sucesso.",
                    "Realização de cadastro",
                    JOptionPane.INFORMATION_MESSAGE);
            buscarBPsMovi();
            listarCategoria();
            buscarNomeMovimentacao();
        } catch (Exception e) {
            System.out.println("Falha no cadastro - "
                    + e.toString());
            JOptionPane.showMessageDialog(null,
                    "Falha no cadastro - " + e.toString(),
                    "Realização de cadastro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastroMoviActionPerformed

    private void jcBPsMoviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcBPsMoviActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcBPsMoviActionPerformed

    private void jcListaBPsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcListaBPsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcListaBPsActionPerformed

    private void jADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jADDActionPerformed
        adicionarArray();

    }//GEN-LAST:event_jADDActionPerformed

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
            java.util.logging.Logger.getLogger(pag1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pag1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pag1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pag1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pag1().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnCadastroCategoria;
    private javax.swing.JButton btnCadastroMovi;
    private javax.swing.JButton btnCadastroMovimentacao;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton jADD;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jcBPsMovi;
    private javax.swing.JComboBox<String> jcListaBPs;
    private javax.swing.JComboBox<String> jcTipo;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JComboBox<String> jcbObra;
    private javax.swing.JTable jtBPs;
    private javax.swing.JTable jtCategoria;
    private javax.swing.JTable jtTabeleItens;
    private javax.swing.JLabel lblCadCategoria;
    private javax.swing.JLabel lblCadCategoria1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCategoria1;
    private javax.swing.JLabel lblCategoria2;
    private javax.swing.JLabel lblCategoria3;
    private javax.swing.JLabel lblCategoriaDesc;
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblDesc1;
    private javax.swing.JLabel lblDesc2;
    private javax.swing.JLabel lblMovimentacao;
    private javax.swing.JLabel lblMovimentação;
    private javax.swing.JLabel lblMovimentação1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome3;
    private javax.swing.JLabel lblNome4;
    private javax.swing.JLabel lblNomeCategoria1;
    private javax.swing.JLabel lblNomeCategoria2;
    private javax.swing.JLabel lblNomeLocalMovi;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JPanel menu;
    private javax.swing.JTextField tfBP;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfDataMovi;
    private javax.swing.JTextField tfDesc;
    private javax.swing.JTextField tfDescCat;
    private javax.swing.JTextField tfDescMovimentacao;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfHora;
    private javax.swing.JTextField tfLocalMovi1;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNomeCat1;
    private javax.swing.JTextField tfNomeMovimentacao;
    // End of variables declaration//GEN-END:variables
        public ArrayList<itenDAO> getItens() {

        ResultSet rs = null;
        String instSQL = "SELECT * FROM iten order by id;";
        String result = "";

        ArrayList<itenDAO> itens = new ArrayList<itenDAO>();

        try {
            Statement st = conexao.createStatement();
            rs = st.executeQuery(instSQL);
            System.out.println("Consulta realizada com sucesso.");
            while (rs.next()) {
                itenDAO lista = new itenDAO();
                lista.setId(rs.getInt("id"));
                lista.setNome(rs.getString("nome"));
                lista.setDescricao(rs.getString("descricao"));
                lista.setCategoria(rs.getString("categoria_nome"));

                lista.setData_criacao(rs.getString("data_criacao"));
                lista.setId_movi(rs.getString("id_movi"));
                lista.setBP(rs.getString("BP"));
                lista.setMovimentacao_nome(rs.getString("obra_nome"));
                lista.setEstado(rs.getString("estado"));
                itens.add(lista);

            }
        } catch (Exception e) {
            System.out.println("Falha na consulta - "
                    + e.toString());
            JOptionPane.showMessageDialog(null,
                    "Falha na consulta - " + e.toString(),
                    "Realização de consulta de registros.",
                    JOptionPane.ERROR_MESSAGE);
        }
        return itens;
    }

    private void listarItens() {
        try {
            itenDAO itens = new itenDAO();

            DefaultTableModel model = (DefaultTableModel) jtTabeleItens.getModel();
            model.setNumRows(0);
            ArrayList<itenDAO> tabela = getItens();

            for (int num = 0; num < tabela.size(); num++) {
                model.addRow(new Object[]{
                    tabela.get(num).getId(),
                    tabela.get(num).getNome(),
                    tabela.get(num).getDescricao(),
                    tabela.get(num).getCategoria(),
                    tabela.get(num).getData_criacao(),
                    tabela.get(num).getId_movi(),
                    tabela.get(num).getBP(),
                    tabela.get(num).getMovimentacao_nome(),
                    tabela.get(num).getEstado()

                });
            }
        } catch (Exception e) {
            JOptionPane.showInputDialog(null, "listar falhou: " + e);
        }

    }

    public ArrayList<CategoriaDAO> getCategoria() {

        ResultSet rs = null;
        String instSQL = "SELECT * FROM categoria";
        String result = "";

        ArrayList<CategoriaDAO> cate = new ArrayList<CategoriaDAO>();

        try {
            Statement st = conexao.createStatement();
            rs = st.executeQuery(instSQL);
            System.out.println("Consulta realizada com sucesso.");
            while (rs.next()) {
                CategoriaDAO cat = new CategoriaDAO();
                cat.setId(rs.getInt("id"));
                cat.setNome(rs.getString("nome"));
                cat.setDescricao(rs.getString("descricao"));

                cate.add(cat);

            }
        } catch (Exception e) {
            System.out.println("Falha na consulta - "
                    + e.toString());
            JOptionPane.showMessageDialog(null,
                    "Falha na consulta - " + e.toString(),
                    "Realização de consulta de registros.",
                    JOptionPane.ERROR_MESSAGE);
        }
        return cate;
    }

    private void listarCategoria() {
        try {
            CategoriaDAO cate = new CategoriaDAO();

            DefaultTableModel model = (DefaultTableModel) jtCategoria.getModel();
            model.setNumRows(0);
            ArrayList<CategoriaDAO> tabela = getCategoria();

            for (int num = 0; num < tabela.size(); num++) {
                model.addRow(new Object[]{
                    tabela.get(num).getId(),
                    tabela.get(num).getNome(),
                    tabela.get(num).getDescricao()

                });
            }
        } catch (Exception e) {
            JOptionPane.showInputDialog(null, "listar falhou: " + e);
        }
    }

    public void buscarNomeMovimentacao() {

        ResultSet rs = null;
        String instSQL = "SELECT nome FROM obra;";
        String result = "";

        try {
            Statement st = conexao.createStatement();
            rs = st.executeQuery(instSQL);

            while (rs.next()) {
                String name = rs.getString("nome");
                jcbObra.addItem(name);
            }
        } catch (Exception e) {

        }

    }

    public void buscarNomeCategoria() {

        ResultSet rs = null;
        String instSQL = "SELECT nome FROM categoria;";
        String result = "";

        try {
            Statement st = conexao.createStatement();
            rs = st.executeQuery(instSQL);

            while (rs.next()) {
                String name = rs.getString("nome");
                jcbCategoria.addItem(name);
            }
        } catch (Exception e) {

        }

    }

    public void buscarBPsMovi() {

        ResultSet rs = null;
        String instSQL = "SELECT nome, data FROM movimentacao;";
        String result = "";

        try {
            Statement st = conexao.createStatement();
            rs = st.executeQuery(instSQL);

            while (rs.next()) {
                String name = rs.getString("nome");
                String data = rs.getString("data");
                jcBPsMovi.addItem(name + '-' + data);

            }
        } catch (Exception e) {

        }
    }

    public void ListarBPs() {

        ResultSet rs = null;
        String instSQL = "SELECT BP FROM iten;";
        String result = "";

        try {
            Statement st = conexao.createStatement();
            rs = st.executeQuery(instSQL);

            while (rs.next()) {
                String BP = rs.getString("BP");
                jcListaBPs.addItem(BP);

            }
        } catch (Exception e) {

        }
    }
    public  void adicionarArray(){
        ArrayList<String> vetor = new ArrayList<String>();
        int i;
        
        String value = jcListaBPs.getSelectedItem().toString();
        
        jADD.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                vetor.add(value);
                System.out.println("Valores no vetor: " + vetor);

               
            }
        });
    }
}
