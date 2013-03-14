/*
 * DisplayPlayer.java
 *
 * Created on __DATE__, __TIME__
 */

package ui.player;

import domain.Player;
import service.PlayerService;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class DisplayPlayer extends javax.swing.JDialog {
	public DisplayPlayer() {
		ps = new PlayerService();
		teamlist = ps.getTeam();

		initComponents();
		res = ps.displayPlayerByAll();
		printPlayer(res);

	}

	private void initComponents() {
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jPanel2 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jComboBox2 = new javax.swing.JComboBox();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTable3 = new javax.swing.JTable();
		jPanel3 = new javax.swing.JPanel();
		jRadioButton1 = new javax.swing.JRadioButton();
		jRadioButton2 = new javax.swing.JRadioButton();
		jLabel3 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		// jButton1 = new javax.swing.JButton();
		jLabel7 = new javax.swing.JLabel();
		// jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jScrollPane4 = new javax.swing.JScrollPane();
		jTable4 = new javax.swing.JTable();
		jPanel4 = new javax.swing.JPanel();
		jLabel8 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jCheckBox1 = new javax.swing.JCheckBox();
		jButton4 = new javax.swing.JButton();
		jScrollPane5 = new javax.swing.JScrollPane();
		jTable5 = new javax.swing.JTable();
		jButtonBirFrom = new ui.common.DateChooserJButton();
		jButtonBirTo = new ui.common.DateChooserJButton();
		bg = new ButtonGroup();
		bg.add(jRadioButton1);
		bg.add(jRadioButton2);

		// setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u663e\u793a\u7403\u5458");

		jLabel1.setText("\u7403\u961f\u540d\u79f0");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(
				convertToString()));
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String teamname = (String) jComboBox1.getSelectedItem();
				res = ps.displayPlayerByTeam(teamname);
				printPlayerByTeam(res);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																349,
																Short.MAX_VALUE)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				68,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jComboBox1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				155,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																28,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jComboBox1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addComponent(
												jScrollPane2,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												167, Short.MAX_VALUE)
										.addContainerGap()));

		jTabbedPane1.addTab("\u6309\u7403\u961f\u5206", jPanel1);

		jLabel2.setText("\u573a\u4e0a\u4f4d\u7f6e");

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"", "守门员", "前锋", "前卫", "后卫" }));
		jComboBox2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String position = (String) jComboBox2.getSelectedItem();

				res = ps.displayPlayerByPosition(position);
				printPlayerByPosition(res);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane3,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																349,
																Short.MAX_VALUE)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				69,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				jComboBox2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				158,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																30,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jComboBox2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jScrollPane3,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												169, Short.MAX_VALUE)
										.addContainerGap()));

		jTabbedPane1.addTab("\u6309\u4f4d\u7f6e\u5206", jPanel2);

		jRadioButton1.setText("\u6309\u5e74\u9f84");

		jRadioButton2.setText("\u6309\u51fa\u751f\u65e5\u671f");

		jLabel3.setText("\u4ece");

		jLabel4.setText("\u5c81\u5230");

		jLabel5.setText("\u5c81");

		jLabel6.setText("\u4ece");

		jButtonBirFrom.setText("");

		jLabel7.setText("\u5230");

		jButtonBirTo.setText("");

		jButton3.setText("\u5f00\u59cb\u67e5\u8be2");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jScrollPane4,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																349,
																Short.MAX_VALUE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jRadioButton1)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				jLabel3)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				34,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel4)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				42,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel5)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				45,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton3))
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jRadioButton2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jLabel6)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButtonBirFrom)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel7)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButtonBirTo)))
										.addContainerGap()));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jRadioButton1)
														.addComponent(jLabel3)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel4)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel5)
														.addComponent(jButton3))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jRadioButton2)
														.addComponent(jLabel6)
														.addComponent(
																jButtonBirFrom)
														.addComponent(jLabel7)
														.addComponent(
																jButtonBirTo))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane4,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												147, Short.MAX_VALUE)
										.addContainerGap()));

		jTabbedPane1.addTab("\u6309\u5e74\u9f84\u6bb5\u5206", jPanel3);

		jLabel8.setText("\u8f93\u5165\u59d3\u540d");

		jCheckBox1.setText("\u6a21\u7cca\u67e5\u8be2(\u6309\u59d3\u6c0f)");

		jButton4.setText("\u5f00\u59cb\u67e5\u8be2");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String name = jTextField3.getText();

				if (jCheckBox1.isSelected() == false) {
					res = ps.displayPlayerByName(name);
				} else {
					res = ps.displayPlayerByDimName(name);
				}

				printPlayerByName(res);
			}
		});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jScrollPane5,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																349,
																Short.MAX_VALUE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel4Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				54,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jTextField3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				81,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jCheckBox1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				jButton4)))
										.addContainerGap()));
		jPanel4Layout
				.setVerticalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel8,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																26,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jCheckBox1)
														.addComponent(jButton4))
										.addGap(18, 18, 18)
										.addComponent(
												jScrollPane5,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												169, Short.MAX_VALUE)
										.addContainerGap()));

		jTabbedPane1.addTab("\u6309\u59d3\u540d\u67e5\u627e", jPanel4);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jTabbedPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 378,
								Short.MAX_VALUE).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jTabbedPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 272,
								Short.MAX_VALUE).addContainerGap()));

		// pack();
		setSize(500, 600);
		setLocationRelativeTo(null);
	}// </editor-fold>

	protected void jButton3ActionPerformed(ActionEvent evt) {
		String birthdatefrom = jButtonBirFrom.getText();
		String birthdateto = jButtonBirTo.getText();

		if (jRadioButton2.isSelected()) {
			birthdatefrom = jButtonBirFrom.getText();
			birthdateto = jButtonBirTo.getText();
			res = ps.searchPlayer("", "", "", "", "", "", birthdatefrom,
					birthdateto, "", "");

			printPlayerByAge(res);
		} else if (jRadioButton1.isSelected()) {
			String yearfrom = jButtonBirFrom.getText().substring(0, 4);
			String yearto = jButtonBirTo.getText().substring(0, 4);

			String tmp_f = jTextField1.getText();
			String tmp_t = jTextField2.getText();
			boolean flag_f = true;
			for (int i = 0; i < tmp_f.length(); ++i) {
				if (tmp_f.charAt(i) < '0' || tmp_f.charAt(i) > '9') {
					flag_f = false;
					break;
				}
			}
			boolean flag_t = true;
			for (int i = 0; i < tmp_t.length(); ++i) {
				if (tmp_t.charAt(i) < '0' || tmp_t.charAt(i) > '9') {
					flag_t = false;
					break;
				}
			}

			if (flag_f == false || flag_t == false) {
				JOptionPane.showMessageDialog(null, "年龄不能填写非数字字符", "提示",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				int agefrom = Integer.parseInt(jTextField1.getText());
				int ageto = Integer.parseInt(jTextField2.getText());
				yearfrom = String.valueOf(Integer.parseInt(yearfrom) - agefrom);
				yearto = String.valueOf(Integer.parseInt(yearto) - ageto);
				birthdatefrom = yearfrom;
				birthdatefrom += jButtonBirFrom.getText().substring(4);
				birthdateto = yearto;
				birthdateto += jButtonBirTo.getText().substring(4);

				res = ps.searchPlayer("", "", "", "", "", "", birthdateto,
						birthdatefrom, "", "");

				printPlayerByAge(res);
			}
		} else {
			JOptionPane.showMessageDialog(null, "请选择查询条件", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

	public void printPlayer(List<Player> res) {
		String data[][] = new String[res.size()][7];
		int index = 0;

		for (Player t : res) {
			data[index][0] = t.getName();
			data[index][1] = t.getTeamname();
			data[index][2] = t.getNumber();
			data[index][3] = t.getPosition();
			data[index][4] = t.getHeight();
			data[index][5] = t.getWeight();
			data[index++][6] = t.getBirthdate();
		}

		jTable1.setModel(new javax.swing.table.DefaultTableModel(data,
				new String[] { "name", "teamname", "number", "position",
						"height", "weight", "birthdate" }));

		jScrollPane1.setViewportView(jTable1);
		jTabbedPane1.addTab("\u5168\u90e8\u7403\u5458", jScrollPane1);
	}

	public void printPlayerByTeam(List<Player> res) {
		String data[][] = new String[res.size()][7];
		int index = 0;

		for (Player t : res) {
			data[index][0] = t.getName();
			data[index][1] = t.getTeamname();
			data[index][2] = t.getNumber();
			data[index][3] = t.getPosition();
			data[index][4] = t.getHeight();
			data[index][5] = t.getWeight();
			data[index++][6] = t.getBirthdate();
		}

		jTable2.setModel(new javax.swing.table.DefaultTableModel(data,
				new String[] { "name", "teamname", "number", "position",
						"height", "weight", "birthdate" }));

		jScrollPane2.setViewportView(jTable2);
	}

	public void printPlayerByPosition(List<Player> res) {
		String data[][] = new String[res.size()][7];
		int index = 0;

		for (Player t : res) {
			data[index][0] = t.getName();
			data[index][1] = t.getTeamname();
			data[index][2] = t.getNumber();
			data[index][3] = t.getPosition();
			data[index][4] = t.getHeight();
			data[index][5] = t.getWeight();
			data[index++][6] = t.getBirthdate();
		}

		jTable3.setModel(new javax.swing.table.DefaultTableModel(data,
				new String[] { "name", "teamname", "number", "position",
						"height", "weight", "birthdate" }));

		jScrollPane3.setViewportView(jTable3);
	}

	public void printPlayerByName(List<Player> res) {
		String data[][] = new String[res.size()][7];
		int index = 0;

		for (Player t : res) {
			data[index][0] = t.getName();
			data[index][1] = t.getTeamname();
			data[index][2] = t.getNumber();
			data[index][3] = t.getPosition();
			data[index][4] = t.getHeight();
			data[index][5] = t.getWeight();
			data[index++][6] = t.getBirthdate();
		}

		jTable5.setModel(new javax.swing.table.DefaultTableModel(data,
				new String[] { "name", "teamname", "number", "position",
						"height", "weight", "birthdate" }));

		jScrollPane5.setViewportView(jTable5);
	}

	public void printPlayerByAge(List<Player> res) {
		String data[][] = new String[res.size()][7];
		int index = 0;

		for (Player t : res) {
			data[index][0] = t.getName();
			data[index][1] = t.getTeamname();
			data[index][2] = t.getNumber();
			data[index][3] = t.getPosition();
			data[index][4] = t.getHeight();
			data[index][5] = t.getWeight();
			data[index++][6] = t.getBirthdate();
		}

		jTable4.setModel(new javax.swing.table.DefaultTableModel(data,
				new String[] { "name", "teamname", "number", "position",
						"height", "weight", "birthdate" }));

		jScrollPane4.setViewportView(jTable4);
	}

	private String[] convertToString() {
		int index = 0;
		String[] data = new String[teamlist.size() + 1];

		// System.out.println(teamlist.size());
		data[index++] = "";
		for (int i = 0; i < teamlist.size(); ++i) {
			data[index++] = teamlist.get(i);
		}
		return data;
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new DisplayPlayer().setVisible(true);
			}
		});
	}

	// private javax.swing.JButton jButton1;
	// private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JRadioButton jRadioButton2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JScrollPane jScrollPane5;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JTable jTable3;
	private javax.swing.JTable jTable4;
	private javax.swing.JTable jTable5;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.ButtonGroup bg;

	private PlayerService ps = null;
	private List<Player> res = new ArrayList<Player>();
	private List<String> teamlist = new ArrayList<String>();
	private ui.common.DateChooserJButton jButtonBirTo, jButtonBirFrom;
	// End of variables declaration//GEN-END:variables

}