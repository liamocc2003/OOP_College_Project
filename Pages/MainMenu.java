package Pages;

import javax.swing.*;
import java.awt.*;

public class MainMenu {

    JFrame jFrameWindow;
    FlowLayout flowLayout;
    JLabel titleLabel;
    JButton registerMemberButton;
    JButton viewMembers;

    public MainMenu(){
        jFrameWindow=new JFrame("Gym System");
        flowLayout=new FlowLayout(FlowLayout.CENTER);
        jFrameWindow.setLayout(flowLayout);
        jFrameWindow.setSize(300,350);
        jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        titleLabel=new JLabel("Gym System");
        jFrameWindow.add(titleLabel);

        registerMemberButton=new JButton("Register Member");
        jFrameWindow.add(registerMemberButton);

        viewMembers=new JButton("View Members");
        jFrameWindow.add(viewMembers);

        jFrameWindow.setVisible(true);
    }
    public static void main(String[] args) {
        MainMenu mainMenu=new MainMenu();
    }
}
