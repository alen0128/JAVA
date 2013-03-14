/*
 * AddMatch.java
 *
 * Created on __DATE__, __TIME__
 */

package ui.match;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import service.PlayerService;
import service.ScoreService;
import service.ShootService;
import domain.Player;
import domain.Score;
import domain.Shoot;

/**
 * 
 * @author __USER__
 */
public class AddMatch extends javax.swing.JDialog {

	/** Creates new form AddMatch */
	public AddMatch(java.awt.Frame parent, boolean modal) {
		super(parent, modal);

		shs = new ShootService();
		ss = new ScoreService();
		ps = new PlayerService();
		teamlist = ps.getTeam();

		initComponents();
	}

	// GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		// jButtonBirthdate = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jTextFieldCount = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jComboBoxTeamlist1 = new javax.swing.JComboBox();
		jLabel5 = new javax.swing.JLabel();
		jLabel5.setText("0");
		jLabel6 = new javax.swing.JLabel();
		jLabel6.setText("0");
		jLabel7 = new javax.swing.JLabel();
		jComboBoxPlayerList1 = new javax.swing.JComboBox();
		jLabel8 = new javax.swing.JLabel();
		jTextFieldTime1 = new javax.swing.JTextField();
		jButtonAdd1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextAreaPlayerName1 = new javax.swing.JTextArea();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextAreaTime1 = new javax.swing.JTextArea();
		jSeparator1 = new javax.swing.JSeparator();
		jComboBoxTeamlist2 = new javax.swing.JComboBox();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jComboBoxPlayerList2 = new javax.swing.JComboBox();
		jTextFieldTime2 = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		jButtonAdd2 = new javax.swing.JButton();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTextAreaPlayerName2 = new javax.swing.JTextArea();
		jScrollPane4 = new javax.swing.JScrollPane();
		jTextAreaTime2 = new javax.swing.JTextArea();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jButtonOK = new javax.swing.JButton();
		jButtonBack = new javax.swing.JButton();
		jButtonDate = new ui.common.DateChooserJButton();

		// setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("\u6bd4\u8d5b\u60c5\u51b5\u5f55\u5165");

		jLabel1.setText("\u6bd4\u8d5b\u65e5\u671f");

		jLabel2.setText("\u6bd4\u8d5b\u8f6e\u6b21");

		jTextFieldCount.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldCountActionPerformed(evt);
			}
		});

		jLabel3.setForeground(new java.awt.Color(255, 0, 51));
		jLabel3.setText("*");

		jLabel4.setText("\u4e3b\u961f");

		jComboBoxTeamlist1.setModel(new javax.swing.DefaultComboBoxModel(
				convertToString()));
		jComboBoxTeamlist1
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jComboBoxTeamlist1ActionPerformed(evt);
					}
				});

		jLabel5.setText("0");

		jLabel6.setText("0");

		jLabel7.setText("\u8fdb\u7403\u961f\u5458");

		jComboBoxPlayerList1
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jComboBoxPlayerList1ActionPerformed(evt);
					}
				});

		jLabel8.setText("\u8fdb\u7403\u65f6\u95f4");

		jButtonAdd1.setText("\u6dfb\u52a0");
		jButtonAdd1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAdd1ActionPerformed(evt);
			}
		});

		jTextAreaPlayerName1.setColumns(20);
		jTextAreaPlayerName1.setRows(5);
		jScrollPane1.setViewportView(jTextAreaPlayerName1);

		jTextAreaTime1.setColumns(20);
		jTextAreaTime1.setRows(5);
		jScrollPane2.setViewportView(jTextAreaTime1);

		jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

		jComboBoxTeamlist2.setModel(new javax.swing.DefaultComboBoxModel(
				convertToString()));
		jComboBoxTeamlist2
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jComboBoxTeamlist2ActionPerformed(evt);
					}
				});

		jLabel9.setText("\u5ba2\u961f");

		jLabel10.setText("\u8fdb\u7403\u961f\u5458");

		jComboBoxPlayerList2
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jComboBoxPlayerList2ActionPerformed(evt);
					}
				});

		jLabel11.setText("\u8fdb\u7403\u65f6\u95f4");

		jButtonAdd2.setText("\u6dfb\u52a0");
		jButtonAdd2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAdd2ActionPerformed(evt);
			}
		});

		jTextAreaPlayerName2.setColumns(20);
		jTextAreaPlayerName2.setRows(5);
		jScrollPane3.setViewportView(jTextAreaPlayerName2);

		jTextAreaTime2.setColumns(20);
		jTextAreaTime2.setRows(5);
		jScrollPane4.setViewportView(jTextAreaTime2);

		jLabel12.setForeground(new java.awt.Color(255, 0, 0));
		jLabel12.setText("\u9996\u5148\u6dfb\u52a0\u8fdb\u7403\u961f\u5458\u548c\u8fdb\u7403\u65f6\u95f4\uff0c\u6309\u4e0b\u6dfb\u52a0\u6309\u94ae\uff0c\u628a\u628a\u672c\u573a\u6bd4\u8d5b\u6240\u6709\u8fdb\u7403");

		jLabel13.setForeground(new java.awt.Color(255, 0, 0));
		jLabel13.setText("\u90fd\u6dfb\u52a0\u5b8c\u6210\uff0c\u4e0a\u65b9\u4f1a\u81ea\u52a8\u663e\u793a\u6bd4\u5206\uff0c\u6700\u540e\u6309\u786e\u5b9a\u6309\u94ae");

		jButtonOK.setText("\u786e\u5b9a");
		jButtonOK.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonOKActionPerformed(evt);
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
												.addComponent(jLabel12)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.LEADING,
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel13)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																										61,
																										Short.MAX_VALUE)
																								.addComponent(
																										jButtonOK)
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jButtonBack))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		jLabel1)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		// jButtonBirthdate,
																																		jButtonDate,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		125,
																																		javax.swing.GroupLayout.PREFERRED_SIZE))
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		jLabel4)
																																.addGap(29,
																																		29,
																																		29)
																																.addComponent(
																																		jComboBoxTeamlist1,
																																		0,
																																		125,
																																		Short.MAX_VALUE))
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		jLabel7)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		jComboBoxPlayerList1,
																																		0,
																																		125,
																																		Short.MAX_VALUE)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED))
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		jLabel8)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addGroup(
																																		layout.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																				.addComponent(
																																						jButtonAdd1)
																																				.addComponent(
																																						jTextFieldTime1,
																																						javax.swing.GroupLayout.DEFAULT_SIZE,
																																						125,
																																						Short.MAX_VALUE))
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED))
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		jScrollPane1,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		99,
																																		javax.swing.GroupLayout.PREFERRED_SIZE)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		jScrollPane2,
																																		javax.swing.GroupLayout.DEFAULT_SIZE,
																																		72,
																																		Short.MAX_VALUE)))
																								.addGap(26,
																										26,
																										26)
																								.addComponent(
																										jLabel5,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										28,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addGroup(
																														javax.swing.GroupLayout.Alignment.TRAILING,
																														layout.createSequentialGroup()
																																.addComponent(
																																		jLabel2)
																																.addGap(18,
																																		18,
																																		18)
																																.addComponent(
																																		jLabel3)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		jTextFieldCount,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		74,
																																		javax.swing.GroupLayout.PREFERRED_SIZE))
																												.addGroup(
																														layout.createSequentialGroup()
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		jSeparator1,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		javax.swing.GroupLayout.DEFAULT_SIZE,
																																		javax.swing.GroupLayout.PREFERRED_SIZE)
																																.addGap(2,
																																		2,
																																		2)
																																.addGroup(
																																		layout.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																				.addGroup(
																																						layout.createSequentialGroup()
																																								.addGap(11,
																																										11,
																																										11)
																																								.addComponent(
																																										jLabel6,
																																										javax.swing.GroupLayout.PREFERRED_SIZE,
																																										28,
																																										javax.swing.GroupLayout.PREFERRED_SIZE)
																																								.addPreferredGap(
																																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																								.addGroup(
																																										layout.createParallelGroup(
																																												javax.swing.GroupLayout.Alignment.LEADING)
																																												.addComponent(
																																														jTextFieldTime2,
																																														javax.swing.GroupLayout.DEFAULT_SIZE,
																																														184,
																																														Short.MAX_VALUE)
																																												.addComponent(
																																														jComboBoxPlayerList2,
																																														0,
																																														184,
																																														Short.MAX_VALUE)
																																												.addComponent(
																																														jComboBoxTeamlist2,
																																														0,
																																														184,
																																														Short.MAX_VALUE)
																																												.addGroup(
																																														layout.createSequentialGroup()
																																																.addComponent(
																																																		jScrollPane3,
																																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																																		99,
																																																		javax.swing.GroupLayout.PREFERRED_SIZE)
																																																.addPreferredGap(
																																																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																																.addComponent(
																																																		jScrollPane4,
																																																		javax.swing.GroupLayout.DEFAULT_SIZE,
																																																		73,
																																																		Short.MAX_VALUE))))
																																				.addGroup(
																																						javax.swing.GroupLayout.Alignment.TRAILING,
																																						layout.createSequentialGroup()
																																								.addPreferredGap(
																																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																								.addComponent(
																																										jButtonAdd2)
																																								.addGap(60,
																																										60,
																																										60)))))))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addComponent(
																						jLabel9)
																				.addComponent(
																						jLabel10)
																				.addComponent(
																						jLabel11))))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addGroup(
														javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup()
																.addGap(39, 39,
																		39)
																.addComponent(
																		jSeparator1,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		376,
																		Short.MAX_VALUE))
												.addGroup(
														javax.swing.GroupLayout.Alignment.LEADING,
														layout.createSequentialGroup()
																.addContainerGap()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.LEADING,
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																								.addComponent(
																										jLabel3)
																								.addComponent(
																										jTextFieldCount,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addComponent(
																										jLabel2,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE))
																				.addComponent(
																						jLabel1,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						// jButtonBirthdate,
																						jButtonDate,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						25,
																						Short.MAX_VALUE))
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(18,
																										18,
																										18)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																												.addComponent(
																														jLabel4)
																												.addComponent(
																														jComboBoxTeamlist1,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addComponent(
																														jLabel5))
																								.addGap(18,
																										18,
																										18)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																												.addComponent(
																														jLabel7)
																												.addComponent(
																														jComboBoxPlayerList1,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.PREFERRED_SIZE))
																								.addGap(18,
																										18,
																										18)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																												.addComponent(
																														jLabel8)
																												.addComponent(
																														jTextFieldTime1,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.PREFERRED_SIZE))
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jButtonAdd1)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												false)
																												.addComponent(
																														jScrollPane2,
																														javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jScrollPane1,
																														javax.swing.GroupLayout.Alignment.LEADING,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														202,
																														Short.MAX_VALUE)))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(18,
																										18,
																										18)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																												.addComponent(
																														jComboBoxTeamlist2,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addComponent(
																														jLabel6)
																												.addComponent(
																														jLabel9))
																								.addGap(18,
																										18,
																										18)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																												.addComponent(
																														jComboBoxPlayerList2,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addComponent(
																														jLabel10))
																								.addGap(18,
																										18,
																										18)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																												.addComponent(
																														jTextFieldTime2,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addComponent(
																														jLabel11))
																								.addGap(18,
																										18,
																										18)
																								.addComponent(
																										jButtonAdd2)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																												.addComponent(
																														jScrollPane3,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														202,
																														Short.MAX_VALUE)
																												.addComponent(
																														jScrollPane4,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														202,
																														Short.MAX_VALUE))))))
								.addGap(26, 26, 26)
								.addComponent(jLabel12)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel13)
												.addComponent(jButtonBack)
												.addComponent(jButtonOK))
								.addGap(25, 25, 25)));

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>
		// GEN-END:initComponents

	private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {
		if (teamname1.equals(teamname2)) {
			JOptionPane.showMessageDialog(null, "主客队名称不能相同", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (jTextFieldCount.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "必须填写比赛轮次", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (teamname1.isEmpty() || teamname2.isEmpty()) {
			JOptionPane.showMessageDialog(null, "球队名称不能为空", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			playerlist = ss.getPlayer(teamname2);
			jComboBoxPlayerList2.setModel(new javax.swing.DefaultComboBoxModel(
					convertToStringPlayerlist()));
			/* 积分榜 */
			String turn = jTextFieldCount.getText();
			int goal1 = Integer.parseInt(jLabel5.getText());
			int goal2 = Integer.parseInt(jLabel6.getText());
			int lost1 = goal2;
			int lost2 = goal1;
			int net1 = goal1 - lost1;
			int net2 = goal2 - lost2;

			res = ss.findScore(teamname1);

			if (goal1 > goal2) {
				ss.updateScore(teamname1, turn, String.valueOf(Integer
						.parseInt(res.get(0).getWon()) + 1), res.get(0)
						.getEven(), res.get(0).getBeaten(),
						String.valueOf(Integer.parseInt(res.get(0).getGoal())
								+ goal1), String.valueOf(Integer.parseInt(res
								.get(0).getLost()) + lost1), String
								.valueOf(Integer.parseInt(res.get(0).getNet())
										+ net1), res.get(0).getPoint() + 3);
				ss.updateScore(teamname2, turn, res.get(0).getWon(), res.get(0)
						.getEven(), String.valueOf(Integer.parseInt(res.get(0)
						.getBeaten()) + 1), String.valueOf(Integer.parseInt(res
						.get(0).getGoal()) + goal2), String.valueOf(Integer
						.parseInt(res.get(0).getLost()) + lost2), String
						.valueOf(Integer.parseInt(res.get(0).getNet()) + net2),
						res.get(0).getPoint() + 0);
			} else if (goal1 == goal2) {
				ss.updateScore(teamname1, turn, res.get(0).getWon(), String
						.valueOf(Integer.parseInt(res.get(0).getEven()) + 1),
						res.get(0).getBeaten(), String.valueOf(Integer
								.parseInt(res.get(0).getGoal()) + goal1),
						String.valueOf(Integer.parseInt(res.get(0).getLost())
								+ lost1), String.valueOf(Integer.parseInt(res
								.get(0).getNet()) + net1), res.get(0)
								.getPoint() + 1);
				ss.updateScore(teamname2, turn, res.get(0).getWon(), String
						.valueOf(Integer.parseInt(res.get(0).getEven()) + 1),
						res.get(0).getBeaten(), String.valueOf(Integer
								.parseInt(res.get(0).getGoal()) + goal2),
						String.valueOf(Integer.parseInt(res.get(0).getLost())
								+ lost2), String.valueOf(Integer.parseInt(res
								.get(0).getNet()) + net2), res.get(0)
								.getPoint() + 1);
			} else {
				ss.updateScore(teamname1, turn, res.get(0).getWon(), res.get(0)
						.getEven(), String.valueOf(Integer.parseInt(res.get(0)
						.getBeaten()) + 1), String.valueOf(Integer.parseInt(res
						.get(0).getGoal()) + goal1), String.valueOf(Integer
						.parseInt(res.get(0).getLost()) + lost1), String
						.valueOf(Integer.parseInt(res.get(0).getNet()) + net1),
						res.get(0).getPoint() + 0);
				ss.updateScore(teamname2, turn, String.valueOf(Integer
						.parseInt(res.get(0).getWon()) + 1), res.get(0)
						.getEven(), res.get(0).getBeaten(),
						String.valueOf(Integer.parseInt(res.get(0).getGoal())
								+ goal2), String.valueOf(Integer.parseInt(res
								.get(0).getLost()) + lost2), String
								.valueOf(Integer.parseInt(res.get(0).getNet())
										+ net2), res.get(0).getPoint() + 3);
			}
			JOptionPane.showMessageDialog(null, "添加成功", "提示",
					JOptionPane.INFORMATION_MESSAGE);

			// System.out.println("1111111111111111111111");
			/* 清屏 */
			jButtonDate.setText("");
			jTextFieldCount.setText("");
			jTextFieldTime1.setText("");
			jTextFieldTime2.setText("");
			jTextAreaPlayerName1.setText("");
			jTextAreaPlayerName2.setText("");
			jTextAreaTime1.setText("");
			jTextAreaTime2.setText("");
			// jComboBoxPlayerList1.setSelectedItem("");
			// jComboBoxPlayerList2.setSelectedItem("");
			jComboBoxTeamlist1.setSelectedItem("");
			jComboBoxTeamlist2.setSelectedItem("");
			jLabel5.setText("0");
			jLabel6.setText("0");
		}
	}

	private void jButtonAdd2ActionPerformed(java.awt.event.ActionEvent evt) {
		if (name2.isEmpty()) {
			JOptionPane.showMessageDialog(null, "请选择进球队员", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (jTextFieldTime2.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "请填写进球时间", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			++score2;
			jLabel6.setText(String.valueOf(score2));

			String time2 = jTextFieldTime2.getText();
			jTextAreaPlayerName2.append(playername2 + "\n");
			jTextAreaTime2.append(time2 + "\n");

			res_shoot = shs.findShoot(name2);
			if (res_shoot.isEmpty()) {
				shs.addShoot("0", name2, teamname2, number2, 1);
			} else {
				int tmp = res_shoot.get(0).getBallnumber();
				shs.updateShoot("0", name2, teamname2, number2, tmp + 1);
			}
		}
	}

	private void jButtonAdd1ActionPerformed(java.awt.event.ActionEvent evt) {
		if (name1.isEmpty()) {
			JOptionPane.showMessageDialog(null, "请选择进球队员", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else if (jTextFieldTime1.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "请填写进球时间", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			++score1;
			jLabel5.setText(String.valueOf(score1));

			String time1 = jTextFieldTime1.getText();
			jTextAreaPlayerName1.append(playername1 + "\n");
			jTextAreaTime1.append(time1 + "\n");

			res_shoot = shs.findShoot(name1);
			if (res_shoot.isEmpty()) {
				shs.addShoot("0", name1, teamname1, number1, 1);
			} else {
				int tmp = res_shoot.get(0).getBallnumber();
				shs.updateShoot("0", name1, teamname1, number1, tmp + 1);
			}
		}
	}

	private void jComboBoxPlayerList2ActionPerformed(
			java.awt.event.ActionEvent evt) {
		playername2 = (String) jComboBoxPlayerList2.getSelectedItem();
		if (playername2.isEmpty()) {
			JOptionPane.showMessageDialog(null, "队员名称不能为空", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			int index = playername2.lastIndexOf('-');
			name2 = playername2.substring(0, index);
			number2 = playername2.substring(index + 1);
		}
	}

	private void jComboBoxPlayerList1ActionPerformed(
			java.awt.event.ActionEvent evt) {
		playername1 = (String) jComboBoxPlayerList1.getSelectedItem();
		if (playername1.isEmpty()) {
			JOptionPane.showMessageDialog(null, "队员名称不能为空", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			int index = playername1.lastIndexOf('-');
			name1 = playername1.substring(0, index);
			number1 = playername1.substring(index + 1);
		}
	}

	private void jComboBoxTeamlist2ActionPerformed(
			java.awt.event.ActionEvent evt) {
		// System.out.println("aaaaaaaaaaaaaaaaaaaaa");
		teamname2 = (String) jComboBoxTeamlist2.getSelectedItem();
		res = ss.findScore(teamname2);
		if (res.isEmpty() && !teamname2.isEmpty()) {
			ss.addScore("0", teamname2, "0", jTextFieldCount.getText(), "0",
					"0", "0", "0", "0", 0);
		}

		res = ss.findScoreByJudge(teamname2, jTextFieldCount.getText());
		if (!res.isEmpty()) {
			JOptionPane.showMessageDialog(null, "该轮次已添加!", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			if ((!teamname1.isEmpty()) && teamname1.equals(teamname2)) {
				JOptionPane.showMessageDialog(null, "主客队名称不能相同", "提示",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				playerlist = ss.getPlayer(teamname2);
				jComboBoxPlayerList2
						.setModel(new javax.swing.DefaultComboBoxModel(
								convertToStringPlayerlist()));
			}
		}
	}

	private void jComboBoxTeamlist1ActionPerformed(
			java.awt.event.ActionEvent evt) {
		teamname1 = (String) jComboBoxTeamlist1.getSelectedItem();
		res = ss.findScore(teamname1);
		if (res.isEmpty() && !teamname1.isEmpty()) {
			ss.addScore("0", teamname1, "0", jTextFieldCount.getText(), "0",
					"0", "0", "0", "0", 0);
		}
		// System.out.println(res.size());
		res = ss.findScoreByJudge(teamname1, jTextFieldCount.getText());
		if (!res.isEmpty()) {
			JOptionPane.showMessageDialog(null, "该轮次已添加!", "提示",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			playerlist = ss.getPlayer(teamname1);
			jComboBoxPlayerList1.setModel(new javax.swing.DefaultComboBoxModel(
					convertToStringPlayerlist()));
		}
	}

	private void jTextFieldCountActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handlin
	}

	private String[] convertToStringPlayerlist() {
		int index = 0;
		String[] data = new String[playerlist.size() + 1];
		String temp = "";

		data[index++] = "";
		for (int i = 0; i < playerlist.size(); ++i) {
			temp = "";
			temp += playerlist.get(i).name;
			temp += "-";
			temp += playerlist.get(i).number;
			data[index++] = temp;
		}
		return data;
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

	public String getLineString(JTextArea area, int line) {
		Document doc = area.getDocument();
		try {
			int start = area.getLineStartOffset(line);
			int end = area.getLineEndOffset(line);
			return doc.getText(start, end - start);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				AddMatch dialog = new AddMatch(new javax.swing.JFrame(), true);
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
	private javax.swing.JButton jButtonAdd1;
	private javax.swing.JButton jButtonAdd2;
	private javax.swing.JButton jButtonBack;
	// private javax.swing.JButton jButtonBirthdate;
	private javax.swing.JButton jButtonOK;
	private javax.swing.JComboBox jComboBoxPlayerList1;
	private javax.swing.JComboBox jComboBoxPlayerList2;
	private javax.swing.JComboBox jComboBoxTeamlist1;
	private javax.swing.JComboBox jComboBoxTeamlist2;
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
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTextArea jTextAreaPlayerName1;
	private javax.swing.JTextArea jTextAreaPlayerName2;
	private javax.swing.JTextArea jTextAreaTime1;
	private javax.swing.JTextArea jTextAreaTime2;
	private javax.swing.JTextField jTextFieldCount;
	private javax.swing.JTextField jTextFieldTime1;
	private javax.swing.JTextField jTextFieldTime2;

	private ShootService shs = null;
	private PlayerService ps = null;
	private ScoreService ss = null;
	private List<Shoot> res_shoot = new ArrayList<Shoot>();
	private List<Score> res = new ArrayList<Score>();
	private List<String> teamlist = new ArrayList<String>();
	private List<Player> playerlist = new ArrayList<Player>();
	private ui.common.DateChooserJButton jButtonDate;
	private String teamname1 = "", teamname2 = "", playername1 = "",
			playername2 = "", number1 = "", number2 = "", name1 = "",
			name2 = "";
	private int score1 = 0, score2 = 0;
	// End of variables declaration//GEN-END:variables
}