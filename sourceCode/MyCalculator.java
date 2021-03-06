/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sourceCode;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author user
 */
public class MyCalculator extends javax.swing.JFrame {

    /**
     * Creates new form MyCalculator
     */
    
    double num;
    double ans = 0;
    int calculation;

    public MyCalculator() {
        initComponents();
        
        jRadioButton1.setEnabled(false);
    }
    
    public void arithmetic_operation() {
        long startTime = System.currentTimeMillis();
        String equation = jLabel4.getText() +Double.parseDouble(jTextField1.getText());
        System.out.println(equation);
        List<String> eq = new LinkedList<>(Arrays.asList(equation.split("[+X/-]+")));
        List<String> op = new LinkedList<>(Arrays.asList(equation.split("[1234567890]+")));

        System.out.println(eq.toString());
        System.out.println(op.toString());
        double temp = 0;
        int count = (int) op.stream()
                .filter(i -> i.equals("X") || i.equals("/"))
                .count();

        op.removeAll(Collections.singleton(""));
        op.removeAll(Collections.singleton(" "));
        op.removeAll(Collections.singleton("."));

        System.out.println(op.toString());

        for (int z = 0; z < op.size();) {
            if (op.contains("X") || op.contains("/")) {
                for (int i = 0; i < op.size(); i++) {
                    if (op.get(i).equals("X")) {
                        temp = Double.parseDouble(eq.get(i)) * Double.parseDouble(eq.get(i + 1));
                        eq.set(i, String.valueOf(temp));
                        eq.remove(i+1);
                        op.remove(i);
                        System.out.println(eq.toString());
                        System.out.println(op.toString());
                        break;

                    } else if (op.get(i).equals("/")) {
                        temp = Double.parseDouble(eq.get(i)) / Double.parseDouble(eq.get(i + 1));
                        eq.set(i, String.valueOf(temp));
                        eq.remove(i + 1);
                        op.remove(i);
                        System.out.println(eq.toString());
                        break;
                    }

                    System.out.println(op.toString());

                }
            } else {
                for (int j = 0; j < op.size(); j++) {
                    if (op.get(j).equals("+")) {
                        temp = Double.parseDouble(eq.get(j)) + Double.parseDouble(eq.get(j + 1));
                        op.remove(j);
                        eq.set(j, String.valueOf(temp));
                        eq.remove(j + 1);
                        System.out.println(eq.toString());
                        break;

                    } else if (op.get(j).equals("-")) {
                        temp = Double.parseDouble(eq.get(j)) - Double.parseDouble(eq.get(j + 1));
                        op.remove(j);
                        eq.set(j, String.valueOf(temp));
                        eq.remove(j + 1);
                        System.out.println(eq.toString());
                        break;

                    }
                }
            }

        }
        System.out.println(eq.toString());
        ans = Double.parseDouble(eq.get(0));

        long endTime = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.println("Execution time is " + formatter.format((endTime - startTime) / 1000d) + " seconds");
    }



    public void disable(){
        jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(false);
        jTextField1.setEnabled(false);
        a0Button.setEnabled(false);
        a1Button.setEnabled(false);
        a2Button.setEnabled(false);
        a3Button.setEnabled(false);
        a4Button.setEnabled(false);
        a5Button.setEnabled(false);
        a6Button.setEnabled(false);
        a7Button.setEnabled(false);
        a8Button.setEnabled(false);
        a9Button.setEnabled(false);
        MultiplyButton.setEnabled(false);
        DivideButton.setEnabled(false);
        MinusButton.setEnabled(false);
        PlusButton.setEnabled(false);
        BackSpaceButton.setEnabled(false);
        ClearButton.setEnabled(false);
        EqualsButton.setEnabled(false);
        jTextField1.setText("");
        
    }
    
    public void enabled(){
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(true);        
        jTextField1.setEnabled(true);
        a0Button.setEnabled(true);
        a1Button.setEnabled(true);
        a2Button.setEnabled(true);
        a3Button.setEnabled(true);
        a4Button.setEnabled(true);
        a5Button.setEnabled(true);
        a6Button.setEnabled(true);
        a7Button.setEnabled(true);
        a8Button.setEnabled(true);
        a9Button.setEnabled(true);
        MultiplyButton.setEnabled(true);
        DivideButton.setEnabled(true);
        MinusButton.setEnabled(true);
        PlusButton.setEnabled(true);
        BackSpaceButton.setEnabled(true);
        ClearButton.setEnabled(true);
        EqualsButton.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        BackSpaceButton = new javax.swing.JButton();
        a7Button = new javax.swing.JButton();
        a8Button = new javax.swing.JButton();
        a9Button = new javax.swing.JButton();
        PlusButton = new javax.swing.JButton();
        a4Button = new javax.swing.JButton();
        a5Button = new javax.swing.JButton();
        a6Button = new javax.swing.JButton();
        MinusButton = new javax.swing.JButton();
        a1Button = new javax.swing.JButton();
        a2Button = new javax.swing.JButton();
        a3Button = new javax.swing.JButton();
        a0Button = new javax.swing.JButton();
        EqualsButton = new javax.swing.JButton();
        MultiplyButton = new javax.swing.JButton();
        DivideButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(500, 250));
        setType(java.awt.Window.Type.UTILITY);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton1.setText("ON");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton2.setText("OFF");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        BackSpaceButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BackSpaceButton.setText("<--");
        BackSpaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackSpaceButtonActionPerformed(evt);
            }
        });

        a7Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a7Button.setText("7");
        a7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a7ButtonActionPerformed(evt);
            }
        });

        a8Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a8Button.setText("8\n");
        a8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a8ButtonActionPerformed(evt);
            }
        });

        a9Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a9Button.setText("9");
        a9Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a9ButtonActionPerformed(evt);
            }
        });

        PlusButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PlusButton.setText("+");
        PlusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusButtonActionPerformed(evt);
            }
        });

        a4Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a4Button.setText("4");
        a4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ButtonActionPerformed(evt);
            }
        });

        a5Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a5Button.setText("5");
        a5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a5ButtonActionPerformed(evt);
            }
        });

        a6Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a6Button.setText("6");
        a6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6ButtonActionPerformed(evt);
            }
        });

        MinusButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MinusButton.setText("-");
        MinusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusButtonActionPerformed(evt);
            }
        });

        a1Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a1Button.setText("1");
        a1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ButtonActionPerformed(evt);
            }
        });

        a2Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a2Button.setText("2");
        a2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ButtonActionPerformed(evt);
            }
        });

        a3Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a3Button.setText("3");
        a3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ButtonActionPerformed(evt);
            }
        });

        a0Button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a0Button.setText("0");
        a0Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a0ButtonActionPerformed(evt);
            }
        });

        EqualsButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EqualsButton.setText("=");
        EqualsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualsButtonActionPerformed(evt);
            }
        });

        MultiplyButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MultiplyButton.setText("x");
        MultiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplyButtonActionPerformed(evt);
            }
        });

        DivideButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DivideButton.setText("/");
        DivideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivideButtonActionPerformed(evt);
            }
        });

        ClearButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ClearButton.setText("C");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("1+");

        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 50, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(a0Button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(a4Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(a7Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(a1Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(a5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(a2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(a8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(8, 8, 8)))
                                        .addComponent(a6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(MultiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(DivideButton, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                            .addComponent(a3Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(a9Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(PlusButton, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                        .addComponent(MinusButton, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                        .addComponent(EqualsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                        .addComponent(BackSpaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addGap(1, 1, 1)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackSpaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MultiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DivideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MinusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a0Button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(EqualsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        enabled();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        disable();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void BackSpaceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackSpaceButtonActionPerformed
        // TODO add your handling code here:
        int length = jTextField1.getText().length();
        int number = jTextField1.getText().length()-1;
        String store;
        
        if(length > 0){
            StringBuilder back = new StringBuilder(jTextField1.getText());
            back.deleteCharAt(number);
            store = back.toString();
            jTextField1.setText(store);
        }
    }//GEN-LAST:event_BackSpaceButtonActionPerformed

    private void a7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a7ButtonActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"7");
    }//GEN-LAST:event_a7ButtonActionPerformed

    private void a8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a8ButtonActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"8");
    }//GEN-LAST:event_a8ButtonActionPerformed

    private void a9ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a9ButtonActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"9");
    }//GEN-LAST:event_a9ButtonActionPerformed

    private void PlusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusButtonActionPerformed
        // TODO add your handling code here:
        num = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        jLabel4.setText(jLabel4.getText() + num + "+");
    }//GEN-LAST:event_PlusButtonActionPerformed

    private void a4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ButtonActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"4");
    }//GEN-LAST:event_a4ButtonActionPerformed

    private void a5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a5ButtonActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"5");
    }//GEN-LAST:event_a5ButtonActionPerformed

    private void a6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a6ButtonActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"6");
    }//GEN-LAST:event_a6ButtonActionPerformed

    private void MinusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusButtonActionPerformed
        // TODO add your handling code here:
        num = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        jLabel4.setText(jLabel4.getText() + num + "-");
    }//GEN-LAST:event_MinusButtonActionPerformed

    private void a1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ButtonActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"1");
    }//GEN-LAST:event_a1ButtonActionPerformed

    private void a2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ButtonActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"2");
    }//GEN-LAST:event_a2ButtonActionPerformed

    private void a3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ButtonActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"3");
    }//GEN-LAST:event_a3ButtonActionPerformed

    private void a0ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a0ButtonActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(jTextField1.getText()+"0");
    }//GEN-LAST:event_a0ButtonActionPerformed

    private void EqualsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualsButtonActionPerformed
        // TODO add your handling code here:
        arithmetic_operation();
        jLabel4.setText("");
        jTextField1.setText(String.valueOf(ans));
    }//GEN-LAST:event_EqualsButtonActionPerformed

    private void MultiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplyButtonActionPerformed
        // TODO add your handling code here:
        num = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        jLabel4.setText(jLabel4.getText() + num + "X");
    }//GEN-LAST:event_MultiplyButtonActionPerformed

    private void DivideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivideButtonActionPerformed
        // TODO add your handling code here:
        num = Double.parseDouble(jTextField1.getText());
        jTextField1.setText("");
        jLabel4.setText(jLabel4.getText() + num + "/");
    }//GEN-LAST:event_DivideButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jLabel4.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MyCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackSpaceButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DivideButton;
    private javax.swing.JButton EqualsButton;
    private javax.swing.JButton MinusButton;
    private javax.swing.JButton MultiplyButton;
    private javax.swing.JButton PlusButton;
    private javax.swing.JButton a0Button;
    private javax.swing.JButton a1Button;
    private javax.swing.JButton a2Button;
    private javax.swing.JButton a3Button;
    private javax.swing.JButton a4Button;
    private javax.swing.JButton a5Button;
    private javax.swing.JButton a6Button;
    private javax.swing.JButton a7Button;
    private javax.swing.JButton a8Button;
    private javax.swing.JButton a9Button;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
