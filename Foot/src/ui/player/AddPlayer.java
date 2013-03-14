/*
 * AddPlayer.java
 *
 * Created on __DATE__, __TIME__
 */

package ui.player;

import service.PlayerService;
import ui.common.DateChooserJButton;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import domain.Player;

public class AddPlayer extends javax.swing.JDialog {
	public AddPlayer() {
		ps = new PlayerService();
		teamlist = ps.getTeam();
		initComponents();
	}

	private void initComponents() {
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jTextFieldName = new javax.swing.JTextField();
		jComboBox1 = new javax.swing.JComboBox();
		jLabel5 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jComboBox2 = new javax.swing.JComboBox();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jTextFieldHeight = new javax.swing.JTextField();
		jTextFieldHeight.setText("0");
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jTextFieldWeight = new javax.swing.JTextField();
		jTextFieldWeight.setText("0");
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jButtonAdd = new javax.swing.JButton();
		jButtonBack = new javax.swing.JButton();
		jButtonDate = new ui.common.DateChooserJButton();

		// setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u6dfb\u52a0\u7403\u5458");

		jLabel1.setForeground(new java.awt.Color(255, 51, 51));
		jLabel1.setText("\u5e26\u7ea2\u8272\u661f\u53f7\u7684\u4e3a\u5fc5\u586b\u9879\u76ee");

		jLabel2.setText("\u7403\u5458\u59d3\u540d");

		jLabel3.setText("\u573a\u4e0a\u4f4d\u7f6e");

		jLabel4.setForeground(new java.awt.Color(255, 51, 51));
		jLabel4.setText("*");

		jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldNameActionPerformed(evt);
			}
		});

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"", "守门员", "前锋", "前卫", "后卫" }));

		jLabel5.setText("\u8eab\u80cc\u53f7\u7801");

		jLabel6.setForeground(new java.awt.Color(255, 51, 51));
		jLabel6.setText("*");

		jLabel7.setText("\u6240\u5728\u7403\u961f");

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(
				convertToString()));

		jLabel8.setForeground(new java.awt.Color(255, 51, 51));
		jLabel8.setText("*");

		jLabel9.setText("\u8eab\u9ad8");

		jLabel10.setText("cm");

		jLabel11.setText("\u4f53\u91cd");

		jLabel12.setText("kg");

		jLabel13.setText("\u51fa\u751f\u5e74\u6708\u65e5");

		jButtonAdd.setText("\u6dfb\u52a0");
		jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAddActionPerformed(evt);
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
								.addGap(91, 91, 91)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jLabel1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														144,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																				.addComponent(
																						jLabel7,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						jLabel3,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						jLabel2,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addComponent(
																						jComboBox2,
																						0,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jComboBox1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										jLabel5,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										50,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jTextField2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										59,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addComponent(
																						jTextFieldName,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						191,
																						Short.MAX_VALUE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel8,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						21,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jLabel6,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						21,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jLabel4,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						21,
																						javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
																.addGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		layout.createSequentialGroup()
																				.addComponent(
																						jLabel9)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(
																						jTextFieldHeight,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						59,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(
																						jLabel10)
																				.addGap(26,
																						26,
																						26)
																				.addComponent(
																						jLabel11)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(
																						jTextFieldWeight,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						59,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(
																						jLabel12))
																.addGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		layout.createSequentialGroup()
																				.addGroup(
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																								.addComponent(
																										jButtonAdd)
																								.addComponent(
																										jLabel13,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										72,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addGroup(
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																								.addComponent(
																										jButtonDate,
																										0,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE)
																								.addComponent(
																										jButtonBack)))))
								.addContainerGap(24, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										29,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														35,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel4)
												.addComponent(
														jTextFieldName,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														35,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jComboBox1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel6)
												.addComponent(
														jLabel5,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														35,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel7,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														35,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jComboBox2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel8))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel9,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														35,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextFieldHeight,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel10,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														35,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel11,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														35,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextFieldWeight,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel12,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														35,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel13,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														35,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButtonDate,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButtonAdd)
												.addComponent(jButtonBack))
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>

	private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {
		String name = jTextFieldName.getText();
		String position = (String) jComboBox1.getSelectedItem();
		String number = jTextField2.getText();
		String teamname = (String) jComboBox2.getSelectedItem();
		String height = jTextFieldHeight.getText();
		String weight = jTextFieldWeight.getText();
		String birthdate = jButtonDate.getText();
		res = ps.displayPlayerByNameAndNumber(teamname, name, number);

		boolean flag_h = true;
		for (int i = 0; i < height.length(); ++i) {
			if (height.charAt(i) < '0' || height.charAt(i) > '9') {
				flag_h = false;
				break;
			}
		}
		boolean flag_w = true;
		for (int i = 0; i < weight.length(); ++i) {
			if (weight.charAt(i) < '0' || weight.charAt(i) > '9') {
				flag_w = false;
				break;
			}
		}

		boolean flag_r = true;
		if (flag_h == false) {
			JOptionPane.showMessageDialog(null, "身高不能填写非数字字符", "提示",
					JOptionPane.INFORMATION_MESSAGE);
			jTextFieldHeight.setText("0");
			flag_r = false;
		} else if (flag_w == false) {
			JOptionPane.showMessageDialog(null, "体重不能填写非数字字符", "提示",
					JOptionPane.INFORMATION_MESSAGE);
			jTextFieldWeight.setText("0");
			flag_r = false;
		} else if (name.isEmpty()) {
			JOptionPane.showMessageDialog(null, "必须填写姓名", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (number.isEmpty()) {
			JOptionPane.showMessageDialog(null, "必须填写衣服号码", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (teamname.isEmpty()) {
			JOptionPane.showMessageDialog(null, "必须填写所在球队", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (!res.isEmpty()) {
			JOptionPane.showMessageDialog(null, "添加失败,该球员已存在", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			ps.addPlayer(name, position, number, teamname,
					Integer.parseInt(height), Integer.parseInt(weight),
					birthdate);
			JOptionPane.showMessageDialog(null, "添加成功", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		}

		if (flag_r) {
			jTextFieldName.setText("");
			jTextField2.setText("");
			jTextFieldHeight.setText("0");
			jTextFieldWeight.setText("0");
			jComboBox1.setSelectedItem("");
			jComboBox2.setSelectedItem("");
			jButtonDate.setText("");
		}
	}

	private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling co
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
				new AddPlayer().setVisible(true);
			}
		});
	}

	private javax.swing.JButton jButtonAdd;
	private javax.swing.JButton jButtonBack;
	private javax.swing.JComboBox jComboBox1;
	private javax.swing.JComboBox jComboBox2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextFieldHeight;
	private javax.swing.JTextField jTextFieldName;
	private javax.swing.JTextField jTextFieldWeight;

	private ui.common.DateChooserJButton jButtonDate;
	private List<String> teamlist = new ArrayList<String>();
	private List<Player> res = new ArrayList<Player>();
	private PlayerService ps = null;
	// End of variables declaration//GEN-END:variables

}