package vh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.i6;
public final class z1 implements Runnable {
    public final int f46420a;
    public final Object f46421b;

    public z1(Object obj, int i10) {
        this.f46420a = i10;
        this.f46421b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f46420a;
        Object obj = this.f46421b;
        switch (i10) {
            case 0:
                ((d2) obj).c();
                return;
            case 1:
                ((xg.b) obj).invalidate();
                return;
            case 2:
                yg.c cVar = (yg.c) obj;
                GroupCallMessage groupCallMessage = cVar.E;
                if (groupCallMessage != null) {
                    cVar.f47320a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.f47321b.a(cVar.E.isSendError(), true);
                    return;
                }
                return;
            default:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (i6) obj, Boolean.TRUE, null, -1);
                return;
        }
    }
}
