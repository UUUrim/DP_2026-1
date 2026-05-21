package hw.ch19;

public class ClosingState implements State {
    private static ClosingState singleton = new ClosingState();

    private ClosingState() {			// 생성자는 private
    }

    public static State getInstance() {		// 유일한 인스턴스를 얻는다
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {	// 시간 설정 
        if (hour < 17) {
            context.changeState(DayState.getInstance());
        } else if (20 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {		// 금고 사용 
        context.callSecurityCenter("마감 금고 점검");
    }

    @Override
    public void doAlarm(Context context) {              // 비상벨 
        context.callSecurityCenter("비상벨(마감)");
        context.changeState(UrgentState.getInstance());
    }

    @Override
    public void doPhone(Context context) {              // 일반 통화 
        context.callSecurityCenter("record ... 퇴근 확인 통화(마감)");
    }

    @Override
    public String toString() {			// 문자열 표현 
        return "[마감]";
    }
    
}
