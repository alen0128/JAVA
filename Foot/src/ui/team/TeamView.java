/*
 * TeamView.java
 *
 * Created on __DATE__, __TIME__
 */

package ui.team;

public class TeamView extends javax.swing.JFrame {
	public TeamView() {
		initComponents();
	}

	// GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jAdd = new javax.swing.JButton();
		jChange = new javax.swing.JButton();
		jDelete = new javax.swing.JButton();
		jExit = new javax.swing.JButton();
		jDisplay = new javax.swing.JButton();

		// setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u7403\u961f\u7ba1\u7406");
		setBounds(new java.awt.Rectangle(300, 300, 0, 0));

		jAdd.setFont(new java.awt.Font("YouYuan", 0, 18));
		jAdd.setText("\u6dfb\u52a0\u7403\u961f");
		jAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jAddActionPerformed(evt);
			}
		});

		jChange.setFont(new java.awt.Font("YouYuan", 0, 18));
		jChange.setText("\u7403\u961f\u53d8\u66f4");
		jChange.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jChangeActionPerformed(evt);
			}
		});

		jDelete.setFont(new java.awt.Font("YouYuan", 0, 18));
		jDelete.setText("\u5220\u9664\u7403\u961f");
		jDelete.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jDeleteActionPerformed(evt);
			}
		});

		jExit.setFont(new java.awt.Font("YouYuan", 0, 18));
		jExit.setText("\u9000\u51fa");
		jExit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jExitActionPerformed(evt);
			}
		});

		jDisplay.setFont(new java.awt.Font("YouYuan", 0, 18));
		jDisplay.setText("\u663e\u793a\u7403\u961f");
		jDisplay.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jDisplayActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(66, Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jExit,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														143,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jDisplay,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														143,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jDelete,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														143,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jChange,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														143,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jAdd,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														143,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(60, 60, 60)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(jAdd,
								javax.swing.GroupLayout.PREFERRED_SIZE, 36,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jChange,
								javax.swing.GroupLayout.PREFERRED_SIZE, 35,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jDelete,
								javax.swing.GroupLayout.PREFERRED_SIZE, 36,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jDisplay,
								javax.swing.GroupLayout.PREFERRED_SIZE, 36,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jExit,
								javax.swing.GroupLayout.PREFERRED_SIZE, 36,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>

	private void jExitActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void jDisplayActionPerformed(java.awt.event.ActionEvent evt) {
		(new DisplayTeam()).setVisible(true);
	}

	private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {
		(new DeleteTeam()).setVisible(true);
	}

	private void jChangeActionPerformed(java.awt.event.ActionEvent evt) {
		(new UpdateTeam()).setVisible(true);
	}

	private void jAddActionPerformed(java.awt.event.ActionEvent evt) {
		AddTeam at = new AddTeam();
		at.setVisible(true);
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TeamView().setVisible(true);
			}
		});
	}

	// GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jAdd;
	private javax.swing.JButton jChange;
	private javax.swing.JButton jDelete;
	private javax.swing.JButton jDisplay;
	private javax.swing.JButton jExit;
	// End of variables declaration//GEN-END:variables

}