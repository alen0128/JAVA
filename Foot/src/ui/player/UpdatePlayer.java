/*
 * UpdatePlayer.java
 *
 * Created on __DATE__, __TIME__
 */

package ui.player;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import service.PlayerService;
import domain.Player;

/**
 * 
 * @author __USER__
 */
public class UpdatePlayer extends javax.swing.JDialog {

	/** Creates new form UpdatePlayer */
	public UpdatePlayer() {
		ps = new PlayerService();
		teamlist = ps.getTeam();
		initComponents();
	}

	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jComboBox1 = new javax.swing.JComboBox();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jTextFieldName = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jTextFieldNumber = new javax.swing.JTextField();
		jSeparator1 = new javax.swing.JSeparator();
		jLabel8 = new javax.swing.JLabel();
		jComboBox2 = new javax.swing.JComboBox();
		jLabel9 = new javax.swing.JLabel();
		jTextFieldWeight = new javax.swing.JTextField();
		jTextFieldWeight.setText("0");
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jTextFieldHeight = new javax.swing.JTextField();
		jTextFieldHeight.setText("0");
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		// jButtonBirthdate = new javax.swing.JButton();
		jButtonUpdate = new javax.swing.JButton();
		jButtonBack = new javax.swing.JButton();
		// jTextFieldPosition = new javax.swing.JTextField();
		jButtonDate = new ui.common.DateChooserJButton();

		// setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u7403\u5458\u53d8\u66f4");

		jLabel1.setText("\u7ea2\u8272\u661f\u53f7\u4e3a\u5fc5\u586b\u9879\u76ee\uff0c\u586b\u5b8c\u4e4b\u540e\u6309\u56de\u8f66");

		jLabel2.setText("\u6240\u5728\u7403\u961f");

		jLabel3.setForeground(new java.awt.Color(255, 0, 51));
		jLabel3.setText("*");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(
				convertToString()));
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}

			private void jComboBox1ActionPerformed(ActionEvent evt) {
				teamname = (String) jComboBox1.getSelectedItem();
			}
		});

		jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"", "守门员", "前锋", "前卫", "后卫" }));
		jComboBox2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox2ActionPerformed(evt);
			}

			private void jComboBox2ActionPerformed(ActionEvent evt) {
				position = (String) jComboBox2.getSelectedItem();
			}
		});

		jLabel4.setText("\u7403\u5458\u59d3\u540d");

		jLabel5.setForeground(new java.awt.Color(255, 0, 51));
		jLabel5.setText("*");

		jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldNameActionPerformed(evt);
			}

			private void jTextFieldNameActionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub

			}
		});

		jLabel6.setText("\u8eab\u80cc\u53f7\u7801");

		jLabel7.setForeground(new java.awt.Color(255, 0, 51));
		jLabel7.setText("*");

		jTextFieldNumber.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldNumberActionPerformed(evt);
			}

			private void jTextFieldNumberActionPerformed(ActionEvent evt) {
				name = jTextFieldName.getText();
				number = jTextFieldNumber.getText();
				res = ps.displayPlayerByNameAndNumber(teamname, name, number);

				if (res.size() == 0) {
					JOptionPane.showMessageDialog(null, "无此人信息", "提示",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "查询成功", "提示",
							JOptionPane.INFORMATION_MESSAGE);

					jComboBox2.setSelectedItem(res.get(0).position);
					jTextFieldWeight.setText(res.get(0).weight);
					jTextFieldHeight.setText(res.get(0).height);
					jButtonDate.setText(res.get(0).birthdate);
				}

			}
		});

		jLabel8.setText("\u573a\u4e0a\u4f4d\u7f6e");

		jLabel9.setText("\u4f53\u91cd");

		jLabel10.setText("kg");

		jLabel11.setText("\u8eab\u9ad8");

		jLabel12.setText("cm");

		jLabel13.setText("\u51fa\u751f\u5e74\u6708\u65e5");

		jButtonUpdate.setText("\u66f4\u6539");
		jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonUpdateActionPerformed(evt);
			}

			private void jButtonUpdateActionPerformed(ActionEvent evt) {
				name = jTextFieldName.getText();
				number = jTextFieldNumber.getText();
				res = ps.displayPlayerByNameAndNumber(teamname, name, number);
				if (res.size() == 0) {
					JOptionPane.showMessageDialog(null, "无此人信息", "提示",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "查询成功", "提示",
							JOptionPane.INFORMATION_MESSAGE);
					jComboBox2.setSelectedItem(res.get(0).position);
					jTextFieldWeight.setText(res.get(0).weight);
					jTextFieldHeight.setText(res.get(0).height);
					jButtonDate.setText(res.get(0).birthdate);

					ps.deletePlayerByNameAndNumber(teamname, name, number);
					name = jTextFieldName.getText();
					number = jTextFieldNumber.getText();
					teamname = (String) jComboBox1.getSelectedItem();
					String height = jTextFieldHeight.getText();
					String weight = jTextFieldWeight.getText();
					String birthdate = jButtonDate.getText();
					String position = (String) jComboBox2.getSelectedItem();
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

					if (flag_h == false) {
						JOptionPane.showMessageDialog(null, "身高不能填写非数字字符",
								"提示", JOptionPane.INFORMATION_MESSAGE);
					} else if (flag_w == false) {
						JOptionPane.showMessageDialog(null, "体重不能填写非数字字符",
								"提示", JOptionPane.INFORMATION_MESSAGE);
					} else if (teamname.isEmpty()) {
						JOptionPane.showMessageDialog(null, "必须填写姓名", "提示",
								JOptionPane.INFORMATION_MESSAGE);
					} else if (number.isEmpty()) {
						JOptionPane.showMessageDialog(null, "必须填写衣服号码", "提示",
								JOptionPane.INFORMATION_MESSAGE);
					} else if (name.isEmpty()) {
						JOptionPane.showMessageDialog(null, "必须填写所在球队", "提示",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						ps.addPlayer(name, position, number, teamname,
								Integer.parseInt(height),
								Integer.parseInt(weight), birthdate);
						JOptionPane.showMessageDialog(null, "更新成功", "提示",
								JOptionPane.INFORMATION_MESSAGE);
					}
				}

				jTextFieldName.setText("");
				jTextFieldNumber.setText("");
				jTextFieldHeight.setText("0");
				jTextFieldWeight.setText("0");
				jComboBox1.setSelectedItem("");
				jComboBox2.setSelectedItem("");
				jButtonDate.setText("");
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
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addContainerGap()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel2)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jLabel3)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jComboBox1,
																										0,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE))
																				.addComponent(
																						jLabel1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						224,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel4)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jLabel5)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jTextFieldName,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										92,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										jLabel6)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jLabel7)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jTextFieldNumber,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										92,
																										javax.swing.GroupLayout.PREFERRED_SIZE))))
												.addComponent(
														jSeparator1,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														400, Short.MAX_VALUE)
												.addGroup(
														layout.createSequentialGroup()
																.addContainerGap()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																												.addComponent(
																														jButtonUpdate)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		jLabel8)
																																.addGap(18,
																																		18,
																																		18)
																																.addComponent(
																																		jComboBox2,
																																		// jTextFieldPosition,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		90,
																																		javax.swing.GroupLayout.PREFERRED_SIZE)))
																								.addGap(70,
																										70,
																										70)
																								.addComponent(
																										jLabel9)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jTextFieldWeight,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										49,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										jLabel10)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																										57,
																										Short.MAX_VALUE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel11)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jTextFieldHeight,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										49,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jLabel12)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jLabel13,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										73,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										// jButtonBirthdate,
																										jButtonDate,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										192,
																										Short.MAX_VALUE))))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(202,
																		202,
																		202)
																.addComponent(
																		jButtonBack)))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jLabel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										25,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														30,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel3)
												.addComponent(
														jComboBox1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														30,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel5)
												.addComponent(
														jTextFieldName,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel7)
												.addComponent(
														jLabel6,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														30,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextFieldNumber,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jSeparator1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										10,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel8,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														30,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jComboBox2,
														// jTextFieldPosition,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel9,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														30,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextFieldWeight,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel10,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														30,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel11,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														30,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextFieldHeight,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel12,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														30,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel13,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														30,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														// jButtonBirthdate,
														jButtonDate,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														26,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(35, 35, 35)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButtonBack)
												.addComponent(jButtonUpdate))
								.addContainerGap(45, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>
		// GEN-END:initComponents

	private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
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
				new UpdatePlayer().setVisible(true);
			}
		});
	}

	// GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButtonBack;
	// private javax.swing.JButton jButtonBirthdate;
	private javax.swing.JButton jButtonUpdate;
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
	private javax.swing.JSeparator jSeparator1;
	// private javax.swing.JTextField jTextFieldPosition;
	private javax.swing.JTextField jTextFieldHeight;
	private javax.swing.JTextField jTextFieldName;
	private javax.swing.JTextField jTextFieldNumber;
	private javax.swing.JTextField jTextFieldWeight;

	private ui.common.DateChooserJButton jButtonDate;
	private List<Player> res = new ArrayList<Player>();
	private List<String> teamlist = new ArrayList<String>();
	private PlayerService ps = null;
	private String teamname, name, number, position;
	// End of variables declaration//GEN-END:variables

}