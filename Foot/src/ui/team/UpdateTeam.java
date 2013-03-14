/*
 * UpdateVie.java
 *
 * Created on __DATE__, __TIME__
 */

package ui.team;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import domain.Team;
import service.TeamService;
import java.util.List;

public class UpdateTeam extends javax.swing.JFrame {

	public UpdateTeam() {
		ts = new TeamService();
		initComponents();
	}

	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jTextName = new javax.swing.JTextField();
		jTextMasterplace = new javax.swing.JTextField();
		jTextName1 = new javax.swing.JTextField();
		jTextCoach = new javax.swing.JTextField();
		jButtonUpdate = new javax.swing.JButton();
		jButtonBack = new javax.swing.JButton();

		// setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u66f4\u65b0\u4fe1\u606f");

		jLabel1.setText("\u539f\u7403\u961f\u540d\u79f0");

		jLabel2.setText("\u65b0\u7403\u961f\u540d\u79f0");

		jLabel3.setText("\u7403\u961f\u4e3b\u573a");

		jLabel4.setText("\u4e3b\u6559\u7ec3");

		jTextName.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextNameActionPerformed(evt);
			}
		});

		jTextMasterplace.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextMasterplaceActionPerformed(evt);
			}
		});

		jTextName1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextName1ActionPerformed(evt);
			}
		});

		jTextCoach.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextCoachActionPerformed(evt);
			}
		});

		jButtonUpdate.setText("\u66f4\u65b0");
		jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonUpdateActionPerformed(evt);
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
								.addGap(22, 22, 22)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jLabel1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		96,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jTextName))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jLabel2,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														96,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addComponent(
																														jLabel3,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														96,
																														javax.swing.GroupLayout.PREFERRED_SIZE))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												false)
																												.addComponent(
																														jTextMasterplace)
																												.addComponent(
																														jTextName1,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														143,
																														Short.MAX_VALUE)))
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.LEADING,
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																												.addComponent(
																														jButtonUpdate)
																												.addComponent(
																														jLabel4,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														96,
																														javax.swing.GroupLayout.PREFERRED_SIZE))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																												.addComponent(
																														jTextCoach,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														143,
																														Short.MAX_VALUE)
																												.addComponent(
																														jButtonBack))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
								.addContainerGap(70, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														32,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextName,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														32,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextName1,
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
														32,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextMasterplace,
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
														32,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextCoach,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(42, 42, 42)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButtonUpdate)
												.addComponent(jButtonBack))
								.addContainerGap(28, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>
		// GEN-END:initComponents

	private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {
		String name = jTextName.getText();
		String name1 = jTextName1.getText();
		String masterplace = jTextMasterplace.getText();
		String coach = jTextCoach.getText();
		res = ts.findTeam(name);

		if (res.isEmpty()) {
			JOptionPane.showMessageDialog(null, "球队不存在", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (name1.isEmpty()) {
			JOptionPane.showMessageDialog(null, "新球队名称不能为空", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else if ((res = ts.findTeam(name1)).isEmpty() == false
				&& !(res = ts.findTeam(name1)).get(0).getName().equals(name)) {
			JOptionPane.showMessageDialog(null, "新球队名称已存在", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			// ts.deleteTeam(name);
			// ts.addTeam(name1, masterplace, coach);
			ts.updateTeam(name, name1, masterplace, coach);
			JOptionPane.showMessageDialog(null, "更新成功", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		}

		jTextName.setText("");
		jTextName1.setText("");
		jTextMasterplace.setText("");
		jTextCoach.setText("");
	}

	private void jTextCoachActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextMasterplaceActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextName1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextNameActionPerformed(java.awt.event.ActionEvent evt) {
		String name = jTextName.getText();
		res = ts.findTeam(name);

		if (res.isEmpty()) {
			JOptionPane.showMessageDialog(null, "无该球队信息,无法更新", "提示",
					JOptionPane.INFORMATION_MESSAGE);
			jTextName.setText("");
		} else {
			JOptionPane.showMessageDialog(null, "查找成功，可进行更新", "提示",
					JOptionPane.INFORMATION_MESSAGE);
			jTextMasterplace.setText(res.get(0).masterplace);
			jTextCoach.setText(res.get(0).coach);
		}
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UpdateTeam().setVisible(true);
			}
		});
	}

	// GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButtonBack;
	private javax.swing.JButton jButtonUpdate;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JTextField jTextCoach;
	private javax.swing.JTextField jTextMasterplace;
	private javax.swing.JTextField jTextName;
	private javax.swing.JTextField jTextName1;
	private service.TeamService ts = null;
	private java.util.List<Team> res = null;
}