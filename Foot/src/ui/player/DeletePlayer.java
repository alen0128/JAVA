/*
 * DeletePlayer.java
 *
 * Created on __DATE__, __TIME__
 */

package ui.player;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import domain.Player;
import service.PlayerService;

/**
 * 
 * @author __USER__
 */
public class DeletePlayer extends javax.swing.JFrame {

	public DeletePlayer() {
		ps = new PlayerService();
		teamlist = ps.getTeam();
		initComponents();
	}

	// GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
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
		jTextFieldPosition = new javax.swing.JTextField();
		jTextFieldPosition.setEditable(false);
		jLabel9 = new javax.swing.JLabel();
		jTextFieldWeight = new javax.swing.JTextField();
		jTextFieldWeight.setEditable(false);
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jTextFieldHeight = new javax.swing.JTextField();
		jTextFieldHeight.setEditable(false);
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jButtonBirthdate = new javax.swing.JButton();
		jButtonBirthdate.setEnabled(false);
		jButtonDelete = new javax.swing.JButton();
		jButtonBack = new javax.swing.JButton();

		// setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u5220\u9664\u7403\u5458");

		jLabel1.setText("\u7ea2\u8272\u661f\u53f7\u4e3a\u5fc5\u586b\u9879\u76ee");

		jLabel2.setText("\u6240\u5728\u7403\u961f");

		jLabel3.setForeground(new java.awt.Color(255, 51, 102));
		jLabel3.setText("*");

		jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(
				convertToString()));
		jComboBox1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBox1ActionPerformed(evt);
			}
		});

		jLabel4.setText("\u7403\u5458\u59d3\u540d");

		jLabel5.setForeground(new java.awt.Color(255, 51, 102));
		jLabel5.setText("*");

		jLabel6.setText("\u8eab\u80cc\u53f7\u7801");

		jLabel7.setForeground(new java.awt.Color(255, 51, 102));
		jLabel7.setText("*");

		jTextFieldNumber.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldNumberActionPerformed(evt);
			}
		});

		jLabel8.setText("\u573a\u4e0a\u4f4d\u7f6e");

		jLabel9.setText("\u4f53\u91cd");

		jLabel10.setText("kg");

		jLabel11.setText("\u8eab \u9ad8");

		jLabel12.setText("cm");

		jLabel13.setText("\u51fa\u751f\u5e74\u6708\u65e5");

		jButtonDelete.setText("\u5220\u9664");
		jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonDeleteActionPerformed(evt);
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
												.addComponent(
														jSeparator1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														326,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
																.addComponent(
																		jLabel1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		117,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGroup(
																		layout.createSequentialGroup()
																				.addComponent(
																						jLabel4,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						52,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(
																						jLabel5)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(
																						jTextFieldName,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						75,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addGap(18,
																						18,
																						18)
																				.addComponent(
																						jLabel6)
																				.addGap(5,
																						5,
																						5)
																				.addComponent(
																						jLabel7)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(
																						jTextFieldNumber,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						57,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGroup(
																		layout.createSequentialGroup()
																				.addComponent(
																						jLabel2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						52,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
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
																						Short.MAX_VALUE)))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel8,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		52,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jTextFieldPosition,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		69,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jLabel9)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jTextFieldWeight,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		42,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jLabel10))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel11,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		39,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(24,
																										24,
																										24)
																								.addComponent(
																										jButtonDelete)
																								.addGap(35,
																										35,
																										35)
																								.addComponent(
																										jButtonBack))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jTextFieldHeight,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										45,
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
																										69,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jButtonBirthdate,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										176,
																										javax.swing.GroupLayout.PREFERRED_SIZE)))))
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));
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
														27,
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
														27,
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
														27,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextFieldNumber,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
														27,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextFieldPosition,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel9,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														27,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextFieldWeight,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel10,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														27,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
																.addComponent(
																		jLabel11,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		27,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jTextFieldHeight,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jLabel12,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		27,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(
																		jLabel13,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		27,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(
														jButtonBirthdate,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														23,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(38, 38, 38)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButtonBack)
												.addComponent(jButtonDelete))
								.addContainerGap(48, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>
		// GEN-END:initComponents
		// GEN-END:initComponents

	private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
		teamname = (String) jComboBox1.getSelectedItem();
	}

	private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {
		name = jTextFieldName.getText();
		number = jTextFieldNumber.getText();
		if (teamname.isEmpty()) {
			JOptionPane.showMessageDialog(null, "删除失败,球队名称不能为空!", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (name.isEmpty()) {
			JOptionPane.showMessageDialog(null, "添加失败,球员名称不能为空!", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (number.isEmpty()) {
			JOptionPane.showMessageDialog(null, "必须填写场上位置", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			res = ps.displayPlayerByNameAndNumber(teamname, name, number);
			if (res.size() == 0) {
				JOptionPane.showMessageDialog(null, "无此人信息", "提示",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "查询成功", "提示",
						JOptionPane.INFORMATION_MESSAGE);

				ps.deletePlayerByNameAndNumber(teamname, name, number);
				JOptionPane.showMessageDialog(null, "删除成功", "提示",
						JOptionPane.INFORMATION_MESSAGE);

				jTextFieldPosition.setText(res.get(0).position);
				jTextFieldWeight.setText(res.get(0).weight);
				jTextFieldHeight.setText(res.get(0).height);
				jButtonBirthdate.setText(res.get(0).birthdate);
			}

			// ps.deletePlayerByNameAndNumber(teamname, name, number);
			// JOptionPane.showMessageDialog(null, "删除成功", "提示",
			// JOptionPane.INFORMATION_MESSAGE);
		}

		jTextFieldName.setText("");
		jTextFieldNumber.setText("");
		jTextFieldHeight.setText("");
		jTextFieldWeight.setText("");
		jTextFieldPosition.setText("");
		jButtonBirthdate.setText("");
		jComboBox1.setSelectedItem("");
	}

	private void jTextFieldNumberActionPerformed(java.awt.event.ActionEvent evt) {
		name = jTextFieldName.getText();
		number = jTextFieldNumber.getText();
		res = ps.displayPlayerByNameAndNumber(teamname, name, number);

		if (res.size() == 0) {
			JOptionPane.showMessageDialog(null, "无此人信息", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "查询成功", "提示",
					JOptionPane.INFORMATION_MESSAGE);

			jTextFieldPosition.setText(res.get(0).position);
			jTextFieldWeight.setText(res.get(0).weight);
			jTextFieldHeight.setText(res.get(0).height);
			jButtonBirthdate.setText(res.get(0).birthdate);
		}
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
				new DeletePlayer().setVisible(true);
			}
		});
	}

	// GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButtonBack;
	private javax.swing.JButton jButtonBirthdate;
	private javax.swing.JButton jButtonDelete;
	private javax.swing.JComboBox jComboBox1;
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
	private javax.swing.JTextField jTextFieldHeight;
	private javax.swing.JTextField jTextFieldName;
	private javax.swing.JTextField jTextFieldNumber;
	private javax.swing.JTextField jTextFieldPosition;
	private javax.swing.JTextField jTextFieldWeight;

	private List<Player> res = new ArrayList<Player>();
	private List<String> teamlist = new ArrayList<String>();
	private PlayerService ps = null;
	private String teamname = "", name = "", number = "";
	// End of variables declaration//GEN-END:variables
}