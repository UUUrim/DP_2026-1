package hw.ch16;

import java.awt.Color;
import java.awt.Label;
 
public class ColleagueLabel extends Label implements Colleague {
    private Mediator mediator;
 
    public ColleagueLabel(String caption) {
        super(caption);
    }
 
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
 
    // 활성/비활성을 지시
    @Override
    public void setColleagueEnabled(boolean enabled) {
        if (enabled) {
            setText("● 로그인 가능");
            setForeground(Color.blue);
        } else {
            setText("● 로그인 불가");
            setForeground(Color.gray);
        }
    }
}