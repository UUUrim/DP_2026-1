package hw.ch16;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;
    private ColleagueLabel statusLabel;  // [2-1] 필드 추가
 
    
    public LoginFrame(String title) {
        super(title);
 
        setBackground(Color.lightGray);
        setLayout(new GridLayout(5, 2));
        createColleagues();
        
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);
        add(statusLabel);   // [2-2] 마지막 행에 배치
 
        colleagueChanged();
 
        pack();
        setVisible(true);
    }
 
    @Override
    public void createColleagues() {
        // CheckBox
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login", g, false);
 
        // TextField
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*');
 
        // Button
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");
 
        // [2-2] StatusLabel 생성 (초기 텍스트: 로그인 불가)
        statusLabel = new ColleagueLabel("● 로그인 불가");
        statusLabel.setForeground(Color.gray);
 
        // Mediator를 설정한다
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);
        statusLabel.setMediator(this);  // [2-2] Mediator 등록
 
        // Listener 설정
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }
 
    // Colleage의 상태가 바뀌면 호출된다
    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()) {
            // 게스트 로그인
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
            statusLabel.setColleagueEnabled(true);   // [2-3] OK 활성 → 로그인 가능
        } else {
            // 사용자 로그인
            textUser.setColleagueEnabled(true);
            userpassChanged();
        }
    }
 
    private void userpassChanged() {
        if (textUser.getText().length() > 0) {
            textPass.setColleagueEnabled(true);
            if (textUser.getText().length() >= 4 && textPass.getText().length() >= 4) {
                buttonOk.setColleagueEnabled(true);
                statusLabel.setColleagueEnabled(true);   // [2-3] OK 활성 → 로그인 가능
            } else {
                buttonOk.setColleagueEnabled(false);
                statusLabel.setColleagueEnabled(false);  // [2-3] OK 비활성 → 로그인 불가
            }
        } else {
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(false);
            statusLabel.setColleagueEnabled(false);      // [2-3] OK 비활성 → 로그인 불가
        }
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
