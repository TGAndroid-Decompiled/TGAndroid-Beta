package xg;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.i6;
public final class a implements Runnable {
    public final int f46973a;
    public final Object f46974b;

    public a(Object obj, int i10) {
        this.f46973a = i10;
        this.f46974b = obj;
    }

    @Override
    public final void run() {
        int i10 = this.f46973a;
        Object obj = this.f46974b;
        switch (i10) {
            case 0:
                ((c) obj).invalidate();
                return;
            case 1:
                yg.c cVar = (yg.c) obj;
                GroupCallMessage groupCallMessage = cVar.E;
                if (groupCallMessage != null) {
                    cVar.f47256a.a(groupCallMessage.isSendDelayed(), true);
                    cVar.f47257b.a(cVar.E.isSendError(), true);
                    return;
                }
                return;
            default:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, (i6) obj, Boolean.TRUE, null, -1);
                return;
        }
    }
}
