package isu.emergencyroom;

import isu.emergencyroom.queue.LinkedPriorityQueue;
import javax.swing.JOptionPane;

/**
 * Emergency Room Managing Program
 * @author Adam Vanderneut
 */
public class ERGUI extends javax.swing.JFrame {

    LinkedPriorityQueue queue;
    
    public ERGUI() {
	queue = new LinkedPriorityQueue(3);
	
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupCondition = new javax.swing.ButtonGroup();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        pnlCondition = new javax.swing.JPanel();
        rdbFair = new javax.swing.JRadioButton();
        rdbSerious = new javax.swing.JRadioButton();
        rdbCritical = new javax.swing.JRadioButton();
        btnSchedule = new javax.swing.JButton();
        btnTreatNext = new javax.swing.JButton();
        btnTreatAll = new javax.swing.JButton();
        scrOutput = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setText("Patient Name");

        pnlCondition.setBorder(javax.swing.BorderFactory.createTitledBorder("Condition"));

        groupCondition.add(rdbFair);
        rdbFair.setSelected(true);
        rdbFair.setText("Fair Condition");

        groupCondition.add(rdbSerious);
        rdbSerious.setText("Serious Condition");

        groupCondition.add(rdbCritical);
        rdbCritical.setText("Critical Condition");

        btnSchedule.setText("Schedule");
        btnSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConditionLayout = new javax.swing.GroupLayout(pnlCondition);
        pnlCondition.setLayout(pnlConditionLayout);
        pnlConditionLayout.setHorizontalGroup(
            pnlConditionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConditionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlConditionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConditionLayout.createSequentialGroup()
                        .addComponent(rdbFair, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(rdbSerious))
                    .addGroup(pnlConditionLayout.createSequentialGroup()
                        .addComponent(rdbCritical, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btnSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        pnlConditionLayout.setVerticalGroup(
            pnlConditionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConditionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConditionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbFair)
                    .addComponent(rdbSerious))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlConditionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbCritical)
                    .addComponent(btnSchedule))
                .addContainerGap())
        );

        btnTreatNext.setText("Treat Next");
        btnTreatNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreatNextActionPerformed(evt);
            }
        });

        btnTreatAll.setText("Treat All");
        btnTreatAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreatAllActionPerformed(evt);
            }
        });

        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        scrOutput.setViewportView(txtOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCondition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTreatNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTreatAll)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrOutput))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTreatNext)
                    .addComponent(btnTreatAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleActionPerformed
        // Get name and Priority
	String name = txtName.getText();
	int priority;
	if (rdbCritical.isSelected()) {
	    priority = 0;
	} else if (rdbSerious.isSelected()) {
	    priority = 1;
	} else {
	    priority = 2;
	}
	
	// Put in patient object
	Patient p = new Patient(name, priority);
	
	// Add to Queue
	queue.enqueue(p, priority);
	
	txtOutput.append("\n" + p.toString());
    }//GEN-LAST:event_btnScheduleActionPerformed

    private void btnTreatNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreatNextActionPerformed
        try {
            txtOutput.append("\n" + queue.dequeue().toString() + " has been treated...");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No more patients to treat");
        }
    }//GEN-LAST:event_btnTreatNextActionPerformed

    private void btnTreatAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreatAllActionPerformed
        try {
	    while(true) {
                txtOutput.append("\n" + queue.dequeue().toString() + " has been treated...");
            }
	} catch (Exception e) {
            // Kind of hacky, but it works.
	    JOptionPane.showMessageDialog(this, "All patients have been treated");
	}
    }//GEN-LAST:event_btnTreatAllActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ERGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ERGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ERGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ERGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
	    new ERGUI().setVisible(true);
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSchedule;
    private javax.swing.JButton btnTreatAll;
    private javax.swing.JButton btnTreatNext;
    private javax.swing.ButtonGroup groupCondition;
    private javax.swing.JLabel lblName;
    private javax.swing.JPanel pnlCondition;
    private javax.swing.JRadioButton rdbCritical;
    private javax.swing.JRadioButton rdbFair;
    private javax.swing.JRadioButton rdbSerious;
    private javax.swing.JScrollPane scrOutput;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
}
