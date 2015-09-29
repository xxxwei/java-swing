import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private TextPanel textPanel;
    private Toolbar toolbar;
    
    public MainFrame() {
        super("Hello World");
        setSize(600, 500);
        setLayout(new BorderLayout());
        textPanel = new TextPanel();
        toolbar = new Toolbar();
        toolbar.setTextPanel(textPanel);
        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
