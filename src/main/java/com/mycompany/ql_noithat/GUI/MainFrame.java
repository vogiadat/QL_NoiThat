package com.mycompany.ql_noithat.GUI;

import com.mycompany.ql_noithat.DAL.DB;
import java.sql.Connection;

public class MainFrame extends javax.swing.JFrame {

	private Connection conn;
	
	public MainFrame() {
		initComponents();
		conn = DB.getConnect();
		setExtendedState(MAXIMIZED_BOTH);
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                mainPanel = new javax.swing.JTabbedPane();
                panel_Supplier = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                btn_refleshSupplier = new javax.swing.JButton();
                infoSupplier = new javax.swing.JPanel();
                btn_deleteSupplier = new javax.swing.JButton();
                btn_editSupplier = new javax.swing.JButton();
                btn_addSupplier = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                jSeparator1 = new javax.swing.JSeparator();
                jLabel2 = new javax.swing.JLabel();
                txt_SupplierID = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                txt_SupplierName = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                txt_ContactName = new javax.swing.JTextField();
                jLabel6 = new javax.swing.JLabel();
                txt_ContactEmail = new javax.swing.JTextField();
                jLabel7 = new javax.swing.JLabel();
                txt_ContactPhone = new javax.swing.JTextField();
                jLabel8 = new javax.swing.JLabel();
                txt_Address = new javax.swing.JTextField();
                txt_City = new javax.swing.JTextField();
                jLabel9 = new javax.swing.JLabel();
                txt_State = new javax.swing.JTextField();
                jLabel10 = new javax.swing.JLabel();
                txt_PostalCode = new javax.swing.JTextField();
                jLabel11 = new javax.swing.JLabel();
                txt_Contry = new javax.swing.JTextField();
                jLabel12 = new javax.swing.JLabel();
                tableSuplier = new javax.swing.JScrollPane();
                listSupplier = new javax.swing.JTable();
                txt_searchSupplier = new javax.swing.JTextField();
                btn_searchSupplier = new javax.swing.JButton();
                panel_Category = new javax.swing.JPanel();
                jPanel3 = new javax.swing.JPanel();
                tableCategory = new javax.swing.JScrollPane();
                listCategory = new javax.swing.JTable();
                infoCategory = new javax.swing.JPanel();
                jLabel14 = new javax.swing.JLabel();
                txt_CategoryId = new javax.swing.JTextField();
                txt_CategoryName = new javax.swing.JTextField();
                jLabel15 = new javax.swing.JLabel();
                btn_editCategory = new javax.swing.JButton();
                btn_addCategory = new javax.swing.JButton();
                btn_deleteCategory = new javax.swing.JButton();
                jSeparator4 = new javax.swing.JSeparator();
                jLabel18 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();
                btn_refleshCategory = new javax.swing.JButton();
                txt_searchCategory = new javax.swing.JTextField();
                btn_seachCategory = new javax.swing.JButton();
                panel_Product = new javax.swing.JPanel();
                jLabel16 = new javax.swing.JLabel();
                btn_refleshProduct = new javax.swing.JButton();
                tableProduct = new javax.swing.JScrollPane();
                listProduct = new javax.swing.JTable();
                infoProduct = new javax.swing.JPanel();
                jLabel17 = new javax.swing.JLabel();
                jSeparator3 = new javax.swing.JSeparator();
                jLabel19 = new javax.swing.JLabel();
                txt_ProductId = new javax.swing.JTextField();
                jLabel20 = new javax.swing.JLabel();
                txt_ProductName = new javax.swing.JTextField();
                jLabel21 = new javax.swing.JLabel();
                txt_CategoryProduct = new javax.swing.JTextField();
                jLabel22 = new javax.swing.JLabel();
                txt_ProductPrice = new javax.swing.JTextField();
                jLabel23 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                txt_ProductDesc = new javax.swing.JTextArea();
                btn_editProduct = new javax.swing.JButton();
                txt_addProduct = new javax.swing.JButton();
                btn_deleteProduct = new javax.swing.JButton();
                btn_searchProduct = new javax.swing.JButton();
                txt_searchProduct = new javax.swing.JTextField();
                menuPanel = new javax.swing.JMenuBar();
                menu_File = new javax.swing.JMenu();
                jSeparator2 = new javax.swing.JPopupMenu.Separator();
                btn_exit = new javax.swing.JMenuItem();
                jMenu2 = new javax.swing.JMenu();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);

                jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(51, 51, 51));
                jLabel1.setText("Nhà Sản Xuất");

                btn_refleshSupplier.setText("Làm Mới");
                btn_refleshSupplier.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_refleshSupplierActionPerformed(evt);
                        }
                });

                infoSupplier.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                infoSupplier.setPreferredSize(new java.awt.Dimension(500, 601));

                btn_deleteSupplier.setText("Xóa");
                btn_deleteSupplier.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_deleteSupplierActionPerformed(evt);
                        }
                });

                btn_editSupplier.setText("Sửa");
                btn_editSupplier.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_editSupplierActionPerformed(evt);
                        }
                });

                btn_addSupplier.setText("Thêm");
                btn_addSupplier.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_addSupplierActionPerformed(evt);
                        }
                });

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel3.setText("Mã NSX");

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("Thông Tin");

                txt_SupplierID.setEditable(false);

                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel4.setText("Tên NSX");

                jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel5.setText("Tên Quản Lý");

                jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel6.setText("Email");

                jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel7.setText("Số Điện Thoại");

                jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel8.setText("Địa Chỉ");

                jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel9.setText("Thành Phố");

                jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel10.setText("Quận");

                jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel11.setText("Mã Bưu Điện");

                jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel12.setText("Quốc Gia");

                javax.swing.GroupLayout infoSupplierLayout = new javax.swing.GroupLayout(infoSupplier);
                infoSupplier.setLayout(infoSupplierLayout);
                infoSupplierLayout.setHorizontalGroup(
                        infoSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(infoSupplierLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(infoSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(infoSupplierLayout.createSequentialGroup()
                                                .addComponent(btn_editSupplier)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_addSupplier)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                                                .addComponent(btn_deleteSupplier))
                                        .addComponent(txt_SupplierID)
                                        .addComponent(txt_SupplierName)
                                        .addComponent(txt_ContactName)
                                        .addComponent(txt_ContactEmail)
                                        .addComponent(txt_ContactPhone)
                                        .addComponent(txt_Address)
                                        .addComponent(txt_City)
                                        .addComponent(txt_State)
                                        .addComponent(txt_PostalCode)
                                        .addComponent(txt_Contry)
                                        .addGroup(infoSupplierLayout.createSequentialGroup()
                                                .addGroup(infoSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel11)
                                                        .addComponent(jLabel12))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                infoSupplierLayout.setVerticalGroup(
                        infoSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(infoSupplierLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(2, 2, 2)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_SupplierID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_SupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ContactName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ContactEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ContactPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_PostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Contry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(infoSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_editSupplier)
                                        .addComponent(btn_addSupplier)
                                        .addComponent(btn_deleteSupplier))
                                .addContainerGap())
                );

                tableSuplier.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

                listSupplier.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null, null},
                                {null, null, null, null, null, null, null, null, null, null}
                        },
                        new String [] {
                                "Mã NSX", "Tên NSX", "Tên Quản Lý", "Email", "Số Điện Thoại", "Địa Chỉ", "Thành Phố", "Quận", "Mã Bưu Điện", "Quốc Gia"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, true, true, true, true, true, true, true, true, true
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tableSuplier.setViewportView(listSupplier);

                btn_searchSupplier.setText("Tìm Kiếm");

                javax.swing.GroupLayout panel_SupplierLayout = new javax.swing.GroupLayout(panel_Supplier);
                panel_Supplier.setLayout(panel_SupplierLayout);
                panel_SupplierLayout.setHorizontalGroup(
                        panel_SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_SupplierLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel_SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel_SupplierLayout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_refleshSupplier)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_searchSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_searchSupplier))
                                        .addComponent(tableSuplier))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );
                panel_SupplierLayout.setVerticalGroup(
                        panel_SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_SupplierLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel_SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(btn_refleshSupplier)
                                        .addComponent(txt_searchSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_searchSupplier))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_SupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tableSuplier)
                                        .addComponent(infoSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE))
                                .addContainerGap())
                );

                mainPanel.addTab("NSX", panel_Supplier);

                jPanel3.setLayout(new java.awt.GridLayout());

                listCategory.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null},
                                {null, null},
                                {null, null},
                                {null, null}
                        },
                        new String [] {
                                "Mã Danh Mục", "Tên Danh Mục"
                        }
                ));
                tableCategory.setViewportView(listCategory);

                jPanel3.add(tableCategory);

                infoCategory.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

                jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel14.setText("Mã Danh Mục");

                jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel15.setText("Tên Danh Mục");

                btn_editCategory.setText("Sửa");

                btn_addCategory.setText("Thêm");

                btn_deleteCategory.setText("Xóa");

                jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel18.setText("Thông Tin");

                javax.swing.GroupLayout infoCategoryLayout = new javax.swing.GroupLayout(infoCategory);
                infoCategory.setLayout(infoCategoryLayout);
                infoCategoryLayout.setHorizontalGroup(
                        infoCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(infoCategoryLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(infoCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_CategoryId)
                                        .addComponent(txt_CategoryName)
                                        .addGroup(infoCategoryLayout.createSequentialGroup()
                                                .addGroup(infoCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel14)
                                                        .addComponent(jLabel15))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(infoCategoryLayout.createSequentialGroup()
                                                .addComponent(btn_editCategory)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_addCategory)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn_deleteCategory)))
                                .addContainerGap())
                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                );
                infoCategoryLayout.setVerticalGroup(
                        infoCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(infoCategoryLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(2, 2, 2)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_CategoryId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_CategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 602, Short.MAX_VALUE)
                                .addGroup(infoCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_editCategory)
                                        .addComponent(btn_addCategory)
                                        .addComponent(btn_deleteCategory))
                                .addContainerGap())
                );

                jPanel3.add(infoCategory);

                jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
                jLabel13.setForeground(new java.awt.Color(51, 51, 51));
                jLabel13.setText("Danh Sách Danh Mục");

                btn_refleshCategory.setText("Làm Mới");

                btn_seachCategory.setText("Tìm Kiếm");

                javax.swing.GroupLayout panel_CategoryLayout = new javax.swing.GroupLayout(panel_Category);
                panel_Category.setLayout(panel_CategoryLayout);
                panel_CategoryLayout.setHorizontalGroup(
                        panel_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_CategoryLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panel_CategoryLayout.createSequentialGroup()
                                                .addComponent(btn_refleshCategory)
                                                .addGap(229, 229, 229)
                                                .addComponent(txt_searchCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_seachCategory)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                panel_CategoryLayout.setVerticalGroup(
                        panel_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_CategoryLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_refleshCategory)
                                        .addComponent(txt_searchCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_seachCategory))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                mainPanel.addTab("Danh Mục", panel_Category);

                jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
                jLabel16.setForeground(new java.awt.Color(51, 51, 51));
                jLabel16.setText("Danh Sách Sản Phẩm");

                btn_refleshProduct.setText("Làm Mới");

                listProduct.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null}
                        },
                        new String [] {
                                "Mã Sản Phẩm", "Tên Sản Phẩm", "Mã Danh Mục", "Giá", "Ghi Chú"
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false, false, true, true
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tableProduct.setViewportView(listProduct);

                infoProduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

                jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel17.setText("Thông Tin");

                jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel19.setText("Mã Sản Phẩm");

                txt_ProductId.setEditable(false);

                jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel20.setText("Tên Sản Phẩm");

                jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel21.setText("Mã Danh Mục");

                jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel22.setText("Giá");

                jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jLabel23.setText("Ghi Chú");

                txt_ProductDesc.setColumns(20);
                txt_ProductDesc.setRows(5);
                jScrollPane1.setViewportView(txt_ProductDesc);

                btn_editProduct.setText("Sửa");

                txt_addProduct.setText("Thêm");

                btn_deleteProduct.setText("Xóa");

                javax.swing.GroupLayout infoProductLayout = new javax.swing.GroupLayout(infoProduct);
                infoProduct.setLayout(infoProductLayout);
                infoProductLayout.setHorizontalGroup(
                        infoProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(infoProductLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(infoProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                                        .addComponent(txt_ProductId)
                                        .addComponent(txt_ProductName)
                                        .addComponent(txt_CategoryProduct)
                                        .addComponent(txt_ProductPrice)
                                        .addGroup(infoProductLayout.createSequentialGroup()
                                                .addGroup(infoProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel19)
                                                        .addComponent(jLabel20)
                                                        .addComponent(jLabel21)
                                                        .addComponent(jLabel22)
                                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(infoProductLayout.createSequentialGroup()
                                                .addComponent(btn_editProduct)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_addProduct)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn_deleteProduct)))
                                .addContainerGap())
                );
                infoProductLayout.setVerticalGroup(
                        infoProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(infoProductLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(2, 2, 2)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_CategoryProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                                .addGroup(infoProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_editProduct)
                                        .addComponent(txt_addProduct)
                                        .addComponent(btn_deleteProduct))
                                .addContainerGap())
                );

                btn_searchProduct.setText("Tìm Kiếm");

                javax.swing.GroupLayout panel_ProductLayout = new javax.swing.GroupLayout(panel_Product);
                panel_Product.setLayout(panel_ProductLayout);
                panel_ProductLayout.setHorizontalGroup(
                        panel_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_ProductLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panel_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panel_ProductLayout.createSequentialGroup()
                                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(908, 908, 908))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ProductLayout.createSequentialGroup()
                                                .addGroup(panel_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(panel_ProductLayout.createSequentialGroup()
                                                                .addComponent(btn_refleshProduct)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(txt_searchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btn_searchProduct))
                                                        .addComponent(tableProduct))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(infoProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
                );
                panel_ProductLayout.setVerticalGroup(
                        panel_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_ProductLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_refleshProduct)
                                        .addComponent(btn_searchProduct)
                                        .addComponent(txt_searchProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(infoProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tableProduct))
                                .addContainerGap())
                );

                mainPanel.addTab("Sản Phẩm", panel_Product);

                menu_File.setText("File");

                btn_userInfo.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_userInfoActionPerformed(evt);
                        }
                });
                if (DB.user.equalsIgnoreCase("sys as sysdba")) {
                        btn_userInfo.setText("SYS");
                }else {
                        btn_userInfo.setText(DB.user.toUpperCase());
                }
                menu_File.add(btn_userInfo);
                menu_File.add(jSeparator2);

                btn_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
                btn_exit.setText("Exit");
                btn_exit.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btn_exitActionPerformed(evt);
                        }
                });
                menu_File.add(btn_exit);

                menuPanel.add(menu_File);

                jMenu2.setText("Edit");
                menuPanel.add(jMenu2);

                setJMenuBar(menuPanel);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 980, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
		this.dispose();
        }//GEN-LAST:event_btn_exitActionPerformed

        private void btn_editSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editSupplierActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_btn_editSupplierActionPerformed

        private void btn_addSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addSupplierActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_btn_addSupplierActionPerformed

        private void btn_deleteSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteSupplierActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_btn_deleteSupplierActionPerformed

        private void btn_refleshSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refleshSupplierActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_btn_refleshSupplierActionPerformed

        private void btn_userInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userInfoActionPerformed
        }//GEN-LAST:event_btn_userInfoActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btn_addCategory;
        private javax.swing.JButton btn_addSupplier;
        private javax.swing.JButton btn_deleteCategory;
        private javax.swing.JButton btn_deleteProduct;
        private javax.swing.JButton btn_deleteSupplier;
        private javax.swing.JButton btn_editCategory;
        private javax.swing.JButton btn_editProduct;
        private javax.swing.JButton btn_editSupplier;
        private javax.swing.JMenuItem btn_exit;
        private javax.swing.JButton btn_refleshCategory;
        private javax.swing.JButton btn_refleshProduct;
        private javax.swing.JButton btn_refleshSupplier;
        private javax.swing.JButton btn_seachCategory;
        private javax.swing.JButton btn_searchProduct;
        private javax.swing.JButton btn_searchSupplier;
        private final javax.swing.JMenuItem btn_userInfo = new javax.swing.JMenuItem();
        private javax.swing.JPanel infoCategory;
        private javax.swing.JPanel infoProduct;
        private javax.swing.JPanel infoSupplier;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel17;
        private javax.swing.JLabel jLabel18;
        private javax.swing.JLabel jLabel19;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel20;
        private javax.swing.JLabel jLabel21;
        private javax.swing.JLabel jLabel22;
        private javax.swing.JLabel jLabel23;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JMenu jMenu2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JPopupMenu.Separator jSeparator2;
        private javax.swing.JSeparator jSeparator3;
        private javax.swing.JSeparator jSeparator4;
        private javax.swing.JTable listCategory;
        private javax.swing.JTable listProduct;
        private javax.swing.JTable listSupplier;
        private javax.swing.JTabbedPane mainPanel;
        private javax.swing.JMenuBar menuPanel;
        private javax.swing.JMenu menu_File;
        private javax.swing.JPanel panel_Category;
        private javax.swing.JPanel panel_Product;
        private javax.swing.JPanel panel_Supplier;
        private javax.swing.JScrollPane tableCategory;
        private javax.swing.JScrollPane tableProduct;
        private javax.swing.JScrollPane tableSuplier;
        private javax.swing.JTextField txt_Address;
        private javax.swing.JTextField txt_CategoryId;
        private javax.swing.JTextField txt_CategoryName;
        private javax.swing.JTextField txt_CategoryProduct;
        private javax.swing.JTextField txt_City;
        private javax.swing.JTextField txt_ContactEmail;
        private javax.swing.JTextField txt_ContactName;
        private javax.swing.JTextField txt_ContactPhone;
        private javax.swing.JTextField txt_Contry;
        private javax.swing.JTextField txt_PostalCode;
        private javax.swing.JTextArea txt_ProductDesc;
        private javax.swing.JTextField txt_ProductId;
        private javax.swing.JTextField txt_ProductName;
        private javax.swing.JTextField txt_ProductPrice;
        private javax.swing.JTextField txt_State;
        private javax.swing.JTextField txt_SupplierID;
        private javax.swing.JTextField txt_SupplierName;
        private javax.swing.JButton txt_addProduct;
        private javax.swing.JTextField txt_searchCategory;
        private javax.swing.JTextField txt_searchProduct;
        private javax.swing.JTextField txt_searchSupplier;
        // End of variables declaration//GEN-END:variables
}
