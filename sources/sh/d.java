package sh;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.d2;
public final class d implements MessagesStorage.LongCallback {
    public final int f44325a;
    public final d2 f44326b;
    public final long f44327c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, d2 d2Var, long j10, boolean z4, int i10) {
        this.f44325a = i10;
        this.e = notificationCenterDelegate;
        this.f44326b = d2Var;
        this.f44327c = j10;
        this.d = z4;
    }

    @Override
    public final void run(long j10) {
        switch (this.f44325a) {
            case 0:
                g gVar = (g) this.e;
                gVar.getClass();
                this.f44326b.dismiss();
                if (j10 != 0) {
                    gVar.f44339a = -j10;
                    gVar.f44340b = gVar.getMessagesController().getChat(Long.valueOf(j10));
                    gVar.W(this.f44327c, this.d);
                    return;
                }
                return;
            default:
                i0.p((i0) this.e, this.f44326b, this.f44327c, this.d, j10);
                return;
        }
    }
}
