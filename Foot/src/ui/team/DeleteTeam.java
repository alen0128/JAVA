/*
 * DeleteTeam.java
 *
 * Created on __DATE__, __TIME__
 */

package ui.team;

import service.TeamService;
import domain.Team;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class DeleteTeam extends javax.swing.JFrame {
	public DeleteTeam() {
		initComponents();
		ts = new TeamService();
	}

	// GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jTextName = new javax.swing.JTextField();
		jTextMasterplace = new javax.swing.JTextField();
		jTextMasterplace.setEditable(false);
		jTextCoach = new javax.swing.JTextField();
		jTextCoach.setEditable(false);
		jButtonDelete = new javax.swing.JButton();
		jButtonBack = new javax.swing.JButton();

		// setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u5220\u9664\u7403\u961f");

		jLabel1.setFont(new java.awt.Font("YouYuan", 0, 18));
		jLabel1.setText("\u7403\u961f\u540d\u79f0");

		jLabel2.setFont(new java.awt.Font("YouYuan", 0, 18));
		jLabel2.setText("\u7403\u961f\u4e3b\u573a");

		jLabel3.setFont(new java.awt.Font("YouYuan", 0, 18));
		jLabel3.setText("\u4e3b\u6559\u7ec3");

		jTextName.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String name = jTextName.getText();
				res = ts.findTeam(name);

				if (res.isEmpty()) {
					JOptionPane.showMessageDialog(null, "无此信息,无法删除", "提示",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "信息存在，可进行删除", "提示",
							JOptionPane.INFORMATION_MESSAGE);
					jTextMasterplace.setText(res.get(0).masterplace);
					jTextCoach.setText(res.get(0).coach);
				}
			}
		});

		jButtonDelete.setFont(new java.awt.Font("YouYuan", 0, 18));
		jButtonDelete.setText("\u5220\u9664");
		jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				String name = jTextName.getText();
				res = ts.findTeam(name);
				if (res.isEmpty()) {
					JOptionPane.showMessageDialog(null, "无此信息,无法删除", "提示",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "信息存在，可进行删除", "提示",
							JOptionPane.INFORMATION_MESSAGE);
					jTextMasterplace.setText(res.get(0).masterplace);
					jTextCoach.setText(res.get(0).coach);
					ts.deleteTeam(name);

					JOptionPane.showMessageDialog(null, "删除成功", "提示",
							JOptionPane.INFORMATION_MESSAGE);
				}
				jTextName.setText("");
				jTextMasterplace.setText("");
				jTextCoach.setText("");
			}
		});

		jButtonBack.setFont(new java.awt.Font("YouYuan", 0, 18));
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
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(24, 24,
																		24)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										99,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jTextMasterplace,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										153,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										99,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jTextName,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										153,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel3,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										99,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jTextCoach,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										153,
																										javax.swing.GroupLayout.PREFERRED_SIZE))))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(37, 37,
																		37)
																.addComponent(
																		jButtonDelete,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		97,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addComponent(
																		jButtonBack,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		97,
																		javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(59, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(24, 24, 24)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														34,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextName,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														25,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														34,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextMasterplace,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														25,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														34,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jTextCoach,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														25,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										53, Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jButtonDelete,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														35,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jButtonBack,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														35,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(50, 50, 50)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>
		// GEN-END:initComponents

	private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	// GEN-END:initComponents

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new DeleteTeam().setVisible(true);
			}
		});
	}

	// GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButtonBack;
	private javax.swing.JButton jButtonDelete;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JTextField jTextCoach;
	private javax.swing.JTextField jTextMasterplace;
	private javax.swing.JTextField jTextName;
	private service.TeamService ts = null;
	private List<Team> res;
}