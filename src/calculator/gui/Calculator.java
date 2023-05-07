package calculator.gui;

public class Calculator extends javax.swing.JFrame {

    // <editor-fold defaultstate="collapsed" desc="Constructor">        
    public Calculator() {
        initComponents();
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layoutPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        displayPanel = new javax.swing.JPanel();
        displayLabel = new javax.swing.JLabel();
        buttonsPanel = new javax.swing.JPanel();
        delRecentlyButton = new javax.swing.JButton();
        delAllButton = new javax.swing.JButton();
        delButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        nineButton = new javax.swing.JButton();
        eightButton = new javax.swing.JButton();
        sevenButton = new javax.swing.JButton();
        restButton = new javax.swing.JButton();
        sixButton = new javax.swing.JButton();
        fiveButton = new javax.swing.JButton();
        forButton = new javax.swing.JButton();
        threeButton = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        twoButton = new javax.swing.JButton();
        oneButton = new javax.swing.JButton();
        resultButton = new javax.swing.JButton();
        pointButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        changeSignButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        layoutPanel.setBackground(new java.awt.Color(204, 204, 204));
        layoutPanel.setPreferredSize(new java.awt.Dimension(300, 400));

        titlePanel.setBackground(new java.awt.Color(204, 204, 204));

        titleLabel.setBackground(new java.awt.Color(255, 255, 255));
        titleLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titleLabel.setText("Standard");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        displayPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        displayLabel.setBackground(new java.awt.Color(255, 255, 255));
        displayLabel.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        displayLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        displayLabel.setText("0");

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        buttonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonsPanel.setMaximumSize(new java.awt.Dimension(73, 23));
        buttonsPanel.setMinimumSize(new java.awt.Dimension(73, 23));
        buttonsPanel.setPreferredSize(new java.awt.Dimension(73, 23));

        delRecentlyButton.setBackground(new java.awt.Color(255, 255, 255));
        delRecentlyButton.setText("CE");
        delRecentlyButton.setFocusPainted(false);
        delRecentlyButton.setMaximumSize(new java.awt.Dimension(73, 23));
        delRecentlyButton.setMinimumSize(new java.awt.Dimension(73, 23));
        delRecentlyButton.setPreferredSize(new java.awt.Dimension(73, 23));

        delAllButton.setBackground(new java.awt.Color(255, 255, 255));
        delAllButton.setText("C");
        delAllButton.setFocusPainted(false);
        delAllButton.setMaximumSize(new java.awt.Dimension(73, 23));
        delAllButton.setMinimumSize(new java.awt.Dimension(73, 23));
        delAllButton.setPreferredSize(new java.awt.Dimension(73, 23));

        delButton.setBackground(new java.awt.Color(255, 255, 255));
        delButton.setText("DEL");
        delButton.setFocusPainted(false);

        divideButton.setBackground(new java.awt.Color(255, 255, 255));
        divideButton.setText("÷");
        divideButton.setFocusPainted(false);

        multiplyButton.setBackground(new java.awt.Color(255, 255, 255));
        multiplyButton.setText("x");
        multiplyButton.setFocusPainted(false);

        nineButton.setBackground(new java.awt.Color(255, 255, 255));
        nineButton.setText("9");
        nineButton.setFocusPainted(false);
        nineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineButtonActionPerformed(evt);
            }
        });

        eightButton.setBackground(new java.awt.Color(255, 255, 255));
        eightButton.setText("8");
        eightButton.setFocusPainted(false);
        eightButton.setMaximumSize(new java.awt.Dimension(73, 23));
        eightButton.setMinimumSize(new java.awt.Dimension(73, 23));
        eightButton.setPreferredSize(new java.awt.Dimension(73, 23));

        sevenButton.setBackground(new java.awt.Color(255, 255, 255));
        sevenButton.setText("7");
        sevenButton.setFocusPainted(false);
        sevenButton.setMaximumSize(new java.awt.Dimension(73, 23));
        sevenButton.setMinimumSize(new java.awt.Dimension(73, 23));
        sevenButton.setPreferredSize(new java.awt.Dimension(73, 23));

        restButton.setBackground(new java.awt.Color(255, 255, 255));
        restButton.setText("-");
        restButton.setFocusPainted(false);

        sixButton.setBackground(new java.awt.Color(255, 255, 255));
        sixButton.setText("6");
        sixButton.setFocusPainted(false);

        fiveButton.setBackground(new java.awt.Color(255, 255, 255));
        fiveButton.setText("5");
        fiveButton.setFocusPainted(false);
        fiveButton.setMaximumSize(new java.awt.Dimension(73, 23));
        fiveButton.setMinimumSize(new java.awt.Dimension(73, 23));
        fiveButton.setPreferredSize(new java.awt.Dimension(73, 23));

        forButton.setBackground(new java.awt.Color(255, 255, 255));
        forButton.setText("4");
        forButton.setFocusPainted(false);
        forButton.setMaximumSize(new java.awt.Dimension(73, 23));
        forButton.setMinimumSize(new java.awt.Dimension(73, 23));
        forButton.setPreferredSize(new java.awt.Dimension(73, 23));

        threeButton.setBackground(new java.awt.Color(255, 255, 255));
        threeButton.setText("3");
        threeButton.setFocusPainted(false);

        plusButton.setBackground(new java.awt.Color(255, 255, 255));
        plusButton.setText("+");
        plusButton.setFocusPainted(false);

        twoButton.setBackground(new java.awt.Color(255, 255, 255));
        twoButton.setText("2");
        twoButton.setFocusPainted(false);
        twoButton.setMaximumSize(new java.awt.Dimension(73, 23));
        twoButton.setMinimumSize(new java.awt.Dimension(73, 23));
        twoButton.setPreferredSize(new java.awt.Dimension(73, 23));

        oneButton.setBackground(new java.awt.Color(255, 255, 255));
        oneButton.setText("1");
        oneButton.setFocusPainted(false);
        oneButton.setMaximumSize(new java.awt.Dimension(73, 23));
        oneButton.setMinimumSize(new java.awt.Dimension(73, 23));
        oneButton.setPreferredSize(new java.awt.Dimension(73, 23));

        resultButton.setBackground(new java.awt.Color(255, 255, 255));
        resultButton.setText("=");
        resultButton.setFocusPainted(false);

        pointButton.setBackground(new java.awt.Color(255, 255, 255));
        pointButton.setText(".");
        pointButton.setFocusPainted(false);

        zeroButton.setBackground(new java.awt.Color(255, 255, 255));
        zeroButton.setText("0");
        zeroButton.setFocusPainted(false);
        zeroButton.setMaximumSize(new java.awt.Dimension(73, 23));
        zeroButton.setMinimumSize(new java.awt.Dimension(73, 23));
        zeroButton.setPreferredSize(new java.awt.Dimension(73, 23));

        changeSignButton.setBackground(new java.awt.Color(255, 255, 255));
        changeSignButton.setText("+/-");
        changeSignButton.setFocusPainted(false);
        changeSignButton.setMaximumSize(new java.awt.Dimension(73, 23));
        changeSignButton.setMinimumSize(new java.awt.Dimension(73, 23));
        changeSignButton.setPreferredSize(new java.awt.Dimension(73, 23));

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(twoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(threeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(changeSignButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pointButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(delRecentlyButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(forButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sixButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eightButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(multiplyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(restButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(divideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delRecentlyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(delAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sevenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eightButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(multiplyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(forButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(restButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sixButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(oneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(plusButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(changeSignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zeroButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pointButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layoutPanelLayout = new javax.swing.GroupLayout(layoutPanel);
        layoutPanel.setLayout(layoutPanelLayout);
        layoutPanelLayout.setHorizontalGroup(
            layoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addGroup(layoutPanelLayout.createSequentialGroup()
                        .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE))
                    .addComponent(displayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layoutPanelLayout.setVerticalGroup(
            layoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layoutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nineButtonActionPerformed

    // <editor-fold defaultstate="collapsed" desc="Main function">        
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Variables declaration">        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton changeSignButton;
    private javax.swing.JButton delAllButton;
    private javax.swing.JButton delButton;
    private javax.swing.JButton delRecentlyButton;
    private javax.swing.JLabel displayLabel;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton eightButton;
    private javax.swing.JButton fiveButton;
    private javax.swing.JButton forButton;
    private javax.swing.JPanel layoutPanel;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton nineButton;
    private javax.swing.JButton oneButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton pointButton;
    private javax.swing.JButton restButton;
    private javax.swing.JButton resultButton;
    private javax.swing.JButton sevenButton;
    private javax.swing.JButton sixButton;
    private javax.swing.JButton threeButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JButton twoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
