import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rysowanie extends JFrame {
    public rysowanie()
    {
        this.setTitle("Rysowanie");
        this.setBounds(250, 300 ,500,500);

        this.getContentPane().add(panelDoRysowania);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new rysowanie().setVisible(true);
    }

    private PanelRysowiak panelDoRysowania = new PanelRysowiak();
}

class PanelRysowiak extends JPanel implements ActionListener
{
    JButton przycisk = new JButton("Przycisk");
    public PanelRysowiak()
    {
        super();
        przycisk.addActionListener(this);
        add(przycisk);

    }

        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);

            g.drawString("Zakręcony neko", 70, 40);
            g.drawImage(new ImageIcon("giphy.gif").getImage(), 40, 80, 200,200,null);
            g.drawRect(40,80,200,200);
            g.drawLine(240,60,40,60);
            g.drawLine(300,300,240,60);
            g.drawLine(5,300,40,60);
            g.drawLine(5,300,300,300);


            Graphics2D g2 = (Graphics2D)g;
        }
        public static int i = 0;
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Przycisk")) {
            myMethod();
        }
    }

    public void myMethod() {
        JOptionPane.showMessageDialog(this, "Zadanko zrobione");
    }
}
