package gpapack;

import java.util.Scanner;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GpaCalculator
{
  JFrame frame;
    JInternalFrame jInternalFrame;
    JLabel headingLabel, stuNameLabel, stuIdLabel, sessionLabel,
    courseLabel1, courseLabel2, courseLabel3, courseLabel4,
    courseLabel5, courseLabel6;
    JCheckBox eveningCheckbox, morningCheckbox;
    JTextField course1, course2, course3, course4, course5, course6,
    stuNameTf, stuIdTf;
    JList creditList1, creditList2, creditList3, creditList4, creditList5,
    creditList6;
    JButton calculate, clear, cancel;

    public void GUI()
    {
        frame = new JFrame("GPA Calculator");
        //frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        headingLabel = new JLabel("GPA Calculator");
        headingLabel.setBounds(10, 10, 200, 20);

        stuNameLabel = new JLabel("Student Name");
        stuNameLabel.setBounds(30, 30, 100, 20);

        stuNameTf = new JTextField();
        stuNameTf.setBounds(130, 30, 100, 20);

        stuIdLabel = new JLabel("ID");
        stuIdLabel.setBounds(270, 30, 20, 20);

        stuIdTf = new JTextField();
        stuIdTf.setBounds(290, 30, 100, 20);

        studentTypeLabel = new JLabel("Student Type");
        sessionLabel.setBounds(30, 60, 80, 20);

        fulltimeCheckbox = new JCheckBox("Full-time");
        eveningCheckbox.setBounds(110, 60, 80, 20);

        parttimeCheckbox = new JCheckBox("Part-time");
        morningCheckbox.setBounds(200, 60, 80, 20);

        courseLabel1 = new JLabel("Course1");
        courseLabel1.setBounds(30, 120, 60, 20);

        course1 = new JTextField();
        course1.setBounds(90, 120, 100, 20);

        creditList1 = new JList();
        creditList1.setBounds(120, 120, 100, 20);

        courseLabel2 = new JLabel("Course2");
        courseLabel2.setBounds(200, 120, 60, 20);

        course2 = new JTextField();
        course2.setBounds(260, 120, 100, 20);

        creditList2 = new JList();
        creditList2.setBounds(290, 120, 100, 20);

        courseLabel3 = new JLabel("Course3");
        courseLabel3.setBounds(30, 150, 60, 20);

        course3 = new JTextField();
        course3.setBounds(90, 150, 100, 20);

        creditList3 = new JList();
        creditList3.setBounds(120, 120, 100, 20);

        courseLabel4 = new JLabel("Course4");
        courseLabel4.setBounds(200, 150, 60, 20);

        course4 = new JTextField();
        course4.setBounds(260, 150, 100, 20);

        creditList4 = new JList();
        creditList4.setBounds(320, 120, 100, 20);

        courseLabel5 = new JLabel("Course5");
        courseLabel5.setBounds(30, 180, 60, 20);

        course5 = new JTextField();
        course5.setBounds(90, 180, 100, 20);

        creditList5 = new JList();
        creditList5.setBounds(120, 120, 100, 20);

        courseLabel6 = new JLabel("Course6");
        courseLabel6.setBounds(200, 180, 60, 20);

        course6 = new JTextField();
        course6.setBounds(260, 180, 100, 20);

        creditList6 = new JList();
        creditList6.setBounds(320, 120, 100, 20);

        calculate = new JButton("Calculate");
        calculate.setBounds(80, 230, 100, 20);
        calculate.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                displayStudentInfo();
            }
        });

        clear = new JButton("Clear");
        clear.setBounds(190, 230, 80, 20);
        clear.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                resetFields();
            }
        });

        cancel = new JButton("Cancel");
        cancel.setBounds(280, 230, 80, 20);
        cancel.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                closeFrame();
            }
        });

        frame.add(headingLabel);
        frame.add(stuNameLabel);
        frame.add(stuNameTf);
        frame.add(stuIdLabel);
        frame.add(stuIdTf);
        frame.add(studentTypeLabel);
        frame.add(fulltimeCheckbox);
        frame.add(parttimeCheckbox);
        frame.add(courseLabel1);
        frame.add(course1);
        frame.add(creditList1);
        frame.add(courseLabel2);
        frame.add(course2);
        frame.add(creditList2);
        frame.add(courseLabel3);
        frame.add(course3);
        frame.add(creditList3);
        frame.add(courseLabel4);
        frame.add(course4);
        frame.add(creditList4);
        frame.add(courseLabel5);
        frame.add(course5);
        frame.add(creditList5);
        frame.add(courseLabel6);
        frame.add(course6);
        frame.add(creditList6);
        frame.add(calculate);
        frame.add(clear);
        frame.add(cancel);

        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,400);
    }
    public JCheckBox checkboxName()
    {
        JCheckBox ckbox = null;
        if(eveningCheckbox.isSelected())
        {
            ckbox = eveningCheckbox;
        }
        else if(morningCheckbox.isSelected())
        {
            ckbox = morningCheckbox;
        }

        return ckbox;
    }
    public String getGPA()
    {
        double A = 0, B = 0, C = 0, D = 0, F = 0;
        double avg = 0, total= 0;
        String gpa = "";
        String grade = "";
        String c1 = course1.getText();
        String c2 = course2.getText();
        String c3 = course3.getText();
        String c4 = course4.getText();
        String c5 = course5.getText();
        String c6 = course6.getText();

        if(c1.equalsIgnoreCase("a")
                || c2.equalsIgnoreCase("a")
                || c3.equalsIgnoreCase("a")
                || c4.equalsIgnoreCase("a")
                || c5.equalsIgnoreCase("a")
                || c6.equalsIgnoreCase("a"))
        {
            A = 4;
        }
        else if(c1.equalsIgnoreCase("b")
                || c2.equalsIgnoreCase("b")
                || c3.equalsIgnoreCase("b")
                || c4.equalsIgnoreCase("b")
                || c5.equalsIgnoreCase("b")
                || c6.equalsIgnoreCase("b"))
        {
            B = 3;
        }
        else if(c1.equalsIgnoreCase("c")
                || c2.equalsIgnoreCase("c")
                || c3.equalsIgnoreCase("c")
                || c4.equalsIgnoreCase("c")
                || c5.equalsIgnoreCase("c")
                || c6.equalsIgnoreCase("c"))
        {
            C = 2;
        }
        else if(c1.equalsIgnoreCase("d")
                || c2.equalsIgnoreCase("d")
                || c3.equalsIgnoreCase("d")
                || c4.equalsIgnoreCase("d")
                || c5.equalsIgnoreCase("d")
                || c6.equalsIgnoreCase("d"))
        {
            D = 1;
        }
        else if(c1.equalsIgnoreCase("f")
                || c2.equalsIgnoreCase("f")
                || c3.equalsIgnoreCase("f")
                || c4.equalsIgnoreCase("f")
                || c5.equalsIgnoreCase("f")
                || c6.equalsIgnoreCase("f"))
        {
            F = 0;
        }

        avg = A+B+C+D+F;

        System.out.println("Your GPA is: " + gpa);
        return gpa;

    }
    public void displayStudentInfo()
      {
          jInternalFrame = new JInternalFrame("Student Info", true, true, true, true);
          jInternalFrame.setBounds(50, 50, 400, 250);
          jInternalFrame.setVisible(true);

          String stuName = stuNameTf.getText();
          String stuId = stuIdTf.getText();
          String checkboxValue = checkboxName().getText();
          String stuGpaValue = getGPA();

          JLabel stuNameLabel = new JLabel("Name");
          JLabel name = new JLabel();
          name.setText(stuName);
          stuNameLabel.setBounds(20, 20, 80, 20);
          name.setBounds(130, 20, 150, 20);

          JLabel stuIdLabel = new JLabel("ID");
          JLabel id = new JLabel();
          id.setText(stuId);
          stuIdLabel.setBounds(20, 40, 30, 20);
          id.setBounds(130, 40, 100, 20);

          JLabel ckLabel = new JLabel("Student Type");
          JLabel ckValue = new JLabel();
          ckValue.setText(checkboxValue);
          ckLabel.setBounds(20, 60, 80, 20);
          ckValue.setBounds(130, 60, 100, 20);

          JLabel gpLabel = new JLabel("GPA");
          JLabel gpValue = new JLabel();
          gpValue.setText(stuGpaValue);
          gpLabel.setBounds(20, 100, 30, 20);
          gpValue.setBounds(130, 100, 20, 20);

          jInternalFrame.add(stuNameLabel);
          jInternalFrame.add(name);
          jInternalFrame.add(stuIdLabel);
          jInternalFrame.add(id);
          jInternalFrame.add(ckLabel);
          jInternalFrame.add(ckValue);
          jInternalFrame.add(gpLabel);
          jInternalFrame.add(gpValue);

          desktop.add(jInternalFrame);
          frame.setContentPane(desktop);
          desktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
      }

      public void resetFields()
      {
          stuNameTf.setText("");
          stuIdTf.setText("");
          course1.setText("");
          course2.setText("");
          course3.setText("");
          course4.setText("");
          course5.setText("");
          course6.setText("");
      }

      public void closeFrame()
      {
          frame.dispose();
      }
      public static void main(String args[])
      {
          GpaCalculator cal = new GpaCalculator();
          cal.GUI();
      }
}
