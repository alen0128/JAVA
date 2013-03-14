/*
 * MainView.java
 *
 * Created on __DATE__, __TIME__
 */

package ui.team;

import java.awt.event.ActionEvent;

import ui.match.AddMatch;
import ui.match.StaticInfo;
import ui.player.PlayerView;

public class MainView extends javax.swing.JFrame {
	public MainView() {
		initComponents();
	}

	// GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jTeam = new javax.swing.JButton();
		jMember = new javax.swing.JButton();
		jCompetition = new javax.swing.JButton();
		jStatic = new javax.swing.JButton();
		jExit = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u8db3\u7403\u7ba1\u7406\u7cfb\u7edf");
		setBounds(new java.awt.Rectangle(300, 300, 0, 0));
		setLocationByPlatform(true);

		jTeam.setText("\u7403\u961f\u7ba1\u7406");
		jTeam.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTeamActionPerformed(evt);
			}
		});

		jMember.setText("\u7403\u5458\u7ba1\u7406");
		jMember.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMemberActionPerformed(evt);
			}
		});

		jCompetition.setText("\u6bd4\u8d5b\u60c5\u51b5");
		jCompetition.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCompetitionActionPerformed(evt);
			}
		});

		jStatic.setText("\u7edf\u8ba1\u4fe1\u606f");
		jStatic.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jStaticActionPerformed(evt);
			}
		});

		jExit.setText("\u9000\u51fa");
		jExit.setName("");
		jExit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jExitActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(43, 43, 43)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addComponent(
														jCompetition,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														jTeam,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														127, Short.MAX_VALUE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										77, Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addComponent(
														jStatic,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														jMember,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														129, Short.MAX_VALUE))
								.addGap(24, 24, 24))
				.addGroup(
						layout.createSequentialGroup()
								.addGap(145, 145, 145)
								.addComponent(jExit,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										129,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(126, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(52, 52, 52)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTeam,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														41,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jMember,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														41,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(39, 39, 39)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jCompetition,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														41,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jStatic,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														41,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(43, 43, 43)
								.addComponent(jExit,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										41,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(43, Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>

	private void jExitActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void jTeamActionPerformed(java.awt.event.ActionEvent evt) {
		(new TeamView()).setVisible(true);
	}

	private void jMemberActionPerformed(java.awt.event.ActionEvent evt) {
		(new PlayerView()).setVisible(true);
	}

	private void jCompetitionActionPerformed(java.awt.event.ActionEvent evt) {
		(new AddMatch(null, true)).setVisible(true);
	}

	private void jStaticActionPerformed(ActionEvent evt) {
		(new StaticInfo()).setVisible(true);
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainView().setVisible(true);
			}
		});
	}

	// GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jCompetition;
	private javax.swing.JButton jExit;
	private javax.swing.JButton jMember;
	private javax.swing.JButton jStatic;
	private javax.swing.JButton jTeam;
	// End of variables declaration//GEN-END:variables

}