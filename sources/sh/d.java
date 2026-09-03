package sh;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.d2;
public final class d implements MessagesStorage.LongCallback {
    public final int f44390a;
    public final d2 f44391b;
    public final long f44392c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, d2 d2Var, long j10, boolean z4, int i10) {
        this.f44390a = i10;
        this.e = notificationCenterDelegate;
        this.f44391b = d2Var;
        this.f44392c = j10;
        this.d = z4;
    }

    @Override
    public final void run(long j10) {
        switch (this.f44390a) {
            case 0:
                g gVar = (g) this.e;
                gVar.getClass();
                this.f44391b.dismiss();
                if (j10 != 0) {
                    gVar.f44404a = -j10;
                    gVar.f44405b = gVar.getMessagesController().getChat(Long.valueOf(j10));
                    gVar.W(this.f44392c, this.d);
                    return;
                }
                return;
            default:
                i0.p((i0) this.e, this.f44391b, this.f44392c, this.d, j10);
                return;
        }
    }
}
