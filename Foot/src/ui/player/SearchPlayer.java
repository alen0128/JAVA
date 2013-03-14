/*
 * SearchPlayer.java
 *
 * Created on __DATE__, __TIME__
 */

package ui.player;

import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

import service.PlayerService;
import domain.Player;

public class SearchPlayer extends javax.swing.JDialog {
	public SearchPlayer(java.awt.Frame parent, boolean modal) {
		super(parent, modal);

		ps = new PlayerService();
		teamlist = ps.getTeam();

		initComponents();
		// printPlayerBySearch(res);
	}

	// GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jRadioButton1 = new javax.swing.JRadioButton();
		jRadioButton2 = new javax.swing.JRadioButton();
		jLabel1 = new javax.swing.JLabel();
		jTextFieldAgeFrom = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jTextFieldAgeTo = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jTextFieldHeightTo = new javax.swing.JTextField();
		jTextFieldHeightFrom = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jButtonBirFrom = new ui.common.DateChooserJButton();
		jButtonBirTo = new ui.common.DateChooserJButton();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jTextFieldWeightFrom = new javax.swing.JTextField();
		jLabel12 = new javax.swing.JLabel();
		jTextFieldWeightTo = new javax.swing.JTextField();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jComboBoxPosition = new javax.swing.JComboBox();
		jLabel15 = new javax.swing.JLabel();
		jComboBoxTeamList = new javax.swing.JComboBox();
		jButtonSearch = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButtonReset = new javax.swing.JButton();
		jButtonBack = new javax.swing.JButton();
		bg = new ButtonGroup();
		bg.add(jRadioButton1);
		bg.add(jRadioButton2);

		// setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("\u590d\u5408\u6761\u4ef6\u67e5\u8be2");

		jRadioButton1.setText("\u6309\u5e74\u9f84");

		jRadioButton2.setText("\u6309\u51fa\u751f\u65e5\u671f");

		jLabel1.setText("\u4ece");

		jLabel2.setText("\u5c81\u5230");

		jLabel3.setText("\u5c81");

		jLabel4.setText("\u8eab\u9ad8");

		jLabel5.setText("\u4ece");

		jLabel6.setText("cm\u5230");

		jLabel7.setText("cm");

		jLabel8.setText("\u4ece");

		jLabel9.setText("\u5230");

		jLabel10.setText("\u4f53\u91cd");

		jLabel11.setText("\u4ece");

		jLabel12.setText("kg\u5230");

		jLabel13.setText("kg");

		jLabel14.setText("\u573a\u4e0a\u4f4d\u7f6e");

		jComboBoxPosition.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "", "守门员", "前锋", "前卫", "后卫" }));
		jComboBoxPosition
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jComboBoxPositionActionPerformed(evt);
					}
				});

		jLabel15.setText("\u7403\u961f\u540d\u79f0");

		jComboBoxTeamList.setModel(new javax.swing.DefaultComboBoxModel(
				convertToString()));
		jComboBoxTeamList
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jComboBoxTeamListActionPerformed(evt);
					}
				});

		jButtonSearch.setText("\u5f00\u59cb\u67e5\u8be2");
		jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonSearchActionPerformed(evt);
			}
		});

		jButtonReset.setText("\u91cd\u7f6e");
		jButtonReset.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonResetActionPerformed(evt);
			}
		});

		jButtonBack.setText("\u8fd4\u56de");
		jButtonBack.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonBackActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jScrollPane1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		401,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addContainerGap())
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jRadioButton1)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										jLabel1)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jTextFieldAgeFrom,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										39,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jLabel2)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jTextFieldAgeTo,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										39,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jLabel3))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel4)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jLabel5)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jTextFieldHeightFrom,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										39,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jLabel6)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jTextFieldHeightTo,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										39,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jLabel7))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		jRadioButton2)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																.addComponent(
																																		jLabel8)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		jButtonBirFrom,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		117,
																																		javax.swing.GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		jLabel9))
																												.addGroup(
																														layout.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																false)
																																.addGroup(
																																		javax.swing.GroupLayout.Alignment.LEADING,
																																		layout.createSequentialGroup()
																																				.addComponent(
																																						jLabel15)
																																				.addPreferredGap(
																																						javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																				.addComponent(
																																						jComboBoxTeamList,
																																						0,
																																						javax.swing.GroupLayout.DEFAULT_SIZE,
																																						Short.MAX_VALUE))
																																.addGroup(
																																		javax.swing.GroupLayout.Alignment.LEADING,
																																		layout.createSequentialGroup()
																																				.addGroup(
																																						layout.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.TRAILING,
																																								false)
																																								.addGroup(
																																										javax.swing.GroupLayout.Alignment.LEADING,
																																										layout.createSequentialGroup()
																																												.addComponent(
																																														jLabel14)
																																												.addPreferredGap(
																																														javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																												.addComponent(
																																														jComboBoxPosition,
																																														0,
																																														javax.swing.GroupLayout.DEFAULT_SIZE,
																																														Short.MAX_VALUE))
																																								.addGroup(
																																										javax.swing.GroupLayout.Alignment.LEADING,
																																										layout.createSequentialGroup()
																																												.addComponent(
																																														jLabel10)
																																												.addGap(18,
																																														18,
																																														18)
																																												.addComponent(
																																														jLabel11)
																																												.addPreferredGap(
																																														javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																												.addComponent(
																																														jTextFieldWeightFrom,
																																														javax.swing.GroupLayout.PREFERRED_SIZE,
																																														39,
																																														javax.swing.GroupLayout.PREFERRED_SIZE)
																																												.addPreferredGap(
																																														javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																												.addComponent(
																																														jLabel12)))
																																				.addPreferredGap(
																																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																				.addComponent(
																																						jTextFieldWeightTo,
																																						javax.swing.GroupLayout.PREFERRED_SIZE,
																																						39,
																																						javax.swing.GroupLayout.PREFERRED_SIZE)
																																				.addPreferredGap(
																																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																				.addComponent(
																																						jLabel13))))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jButtonSearch,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														117,
																														Short.MAX_VALUE)
																												.addComponent(
																														jButtonBirTo,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														117,
																														javax.swing.GroupLayout.PREFERRED_SIZE))))
																.addContainerGap(
																		48,
																		Short.MAX_VALUE))))
				.addGroup(
						layout.createSequentialGroup()
								.addGap(66, 66, 66)
								.addComponent(jButtonReset,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										114,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										46, Short.MAX_VALUE)
								.addComponent(jButtonBack,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										111,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(89, 89, 89)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jRadioButton1)
																				.addComponent(
																						jLabel1)
																				.addComponent(
																						jTextFieldAgeFrom,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jLabel2)
																				.addComponent(
																						jTextFieldAgeTo,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jLabel3))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																								.addComponent(
																										jRadioButton2)
																								.addComponent(
																										jLabel8)
																								.addComponent(
																										jButtonBirFrom,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										24,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addComponent(
																						jButtonBirTo,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						24,
																						javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addComponent(
														jLabel9,
														javax.swing.GroupLayout.Alignment.TRAILING))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel4)
												.addComponent(jLabel5)
												.addComponent(
														jTextFieldHeightFrom,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel6)
												.addComponent(
														jTextFieldHeightTo,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel7))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel10)
												.addComponent(jLabel11)
												.addComponent(
														jTextFieldWeightFrom,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel12)
												.addComponent(
														jTextFieldWeightTo,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel13))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel14)
												.addComponent(
														jComboBoxPosition,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel15)
												.addComponent(
														jComboBoxTeamList,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButtonSearch))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										178,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										26, Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButtonReset)
												.addComponent(jButtonBack))
								.addContainerGap()));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>
		// GEN-END:initComponents

	private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {
		bg.clearSelection();
		jTextFieldAgeFrom.setText("");
		jTextFieldAgeTo.setText("");
		jTextFieldHeightTo.setText("");
		jTextFieldHeightFrom.setText("");
		jButtonBirFrom.setText("");
		jButtonBirTo.setText("");
		jTextFieldWeightFrom.setText("");
		jTextFieldWeightTo.setText("");
		jComboBoxPosition.setSelectedItem("");
		jComboBoxTeamList.setSelectedItem("");
		jTable1.setVisible(false);
	}

	private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {
		String heightfrom = jTextFieldHeightFrom.getText();
		String heightto = jTextFieldHeightTo.getText();
		String weightfrom = jTextFieldWeightFrom.getText();
		String weightto = jTextFieldWeightTo.getText();
		String birthdatefrom = "";
		String birthdateto = "";
		boolean flag = false;

		if (jRadioButton2.isSelected()) {
			birthdatefrom = jButtonBirFrom.getText();
			birthdateto = jButtonBirTo.getText();
		} else if (jRadioButton1.isSelected()) {
			if (jTextFieldAgeFrom.getText().isEmpty()
					|| jTextFieldAgeTo.getText().isEmpty()) {
				flag = true;
			} else {
				String yearfrom = jButtonBirFrom.getText().substring(0, 4);
				String yearto = jButtonBirTo.getText().substring(0, 4);
				int agefrom = Integer.parseInt(jTextFieldAgeFrom.getText());
				int ageto = Integer.parseInt(jTextFieldAgeTo.getText());
				yearfrom = String.valueOf(Integer.parseInt(yearfrom) - agefrom);
				yearto = String.valueOf(Integer.parseInt(yearto) - ageto);
				birthdatefrom = yearto;
				birthdatefrom += jButtonBirFrom.getText().substring(4);
				birthdateto = yearfrom;
				birthdateto += jButtonBirTo.getText().substring(4);
			}
		}

		if (flag) {
			JOptionPane.showMessageDialog(null, "请完整输入年龄", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			res = ps.searchPlayer(position, teamname, heightfrom, heightto,
					weightfrom, weightto, birthdatefrom, birthdateto, "", "");
			if (res == null) {
				JOptionPane.showMessageDialog(null, "请输入查询条件", "提示",
						JOptionPane.INFORMATION_MESSAGE);
			} else if (res.size() == 0) {
				JOptionPane.showMessageDialog(null, "无信息", "提示",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "查询成功", "提示",
						JOptionPane.INFORMATION_MESSAGE);
				jTable1.setVisible(true);
				printPlayerBySearch(res);
			}
		}
	}

	private void jComboBoxTeamListActionPerformed(java.awt.event.ActionEvent evt) {
		teamname = (String) jComboBoxTeamList.getSelectedItem();
	}

	private void jComboBoxPositionActionPerformed(java.awt.event.ActionEvent evt) {
		position = (String) jComboBoxPosition.getSelectedItem();
	}

	// GEN-END:initComponents

	public void printPlayerBySearch(List<Player> res) {
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
	}

	private String[] convertToString() {
		int index = 0;
		String[] data = new String[teamlist.size() + 1];

		data[index++] = "";
		for (int i = 0; i < teamlist.size(); ++i) {
			data[index++] = teamlist.get(i);
		}
		return data;
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				SearchPlayer dialog = new SearchPlayer(
						new javax.swing.JFrame(), true);
				dialog.addWindowListener(new java.awt.event.WindowAdapter() {
					public void windowClosing(java.awt.event.WindowEvent e) {
						System.exit(0);
					}
				});
				dialog.setVisible(true);
			}
		});
	}

	// GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButtonBack;
	// private javax.swing.JButton jButtonBirFrom;
	// private javax.swing.JButton jButtonBirTo;
	private javax.swing.JButton jButtonReset;
	private javax.swing.JButton jButtonSearch;
	private javax.swing.JComboBox jComboBoxPosition;
	private javax.swing.JComboBox jComboBoxTeamList;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JRadioButton jRadioButton2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextFieldAgeFrom;
	private javax.swing.JTextField jTextFieldAgeTo;
	private javax.swing.JTextField jTextFieldHeightFrom;
	private javax.swing.JTextField jTextFieldHeightTo;
	private javax.swing.JTextField jTextFieldWeightFrom;
	private javax.swing.JTextField jTextFieldWeightTo;

	private javax.swing.ButtonGroup bg;
	private PlayerService ps = null;
	private List<Player> res = new ArrayList<Player>();
	private List<String> teamlist = new ArrayList<String>();
	private ui.common.DateChooserJButton jButtonBirTo, jButtonBirFrom;
	private String teamname = "", position = "";
	// End of variables declaration//GEN-END:variables
}