package th;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.d2;
public final class d implements MessagesStorage.LongCallback {
    public final int f48103a;
    public final d2 f48104b;
    public final long f48105c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f48106e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, d2 d2Var, long j10, boolean z4, int i10) {
        this.f48103a = i10;
        this.f48106e = notificationCenterDelegate;
        this.f48104b = d2Var;
        this.f48105c = j10;
        this.d = z4;
    }

    @Override
    public final void run(long j10) {
        switch (this.f48103a) {
            case 0:
                g gVar = (g) this.f48106e;
                gVar.getClass();
                this.f48104b.dismiss();
                if (j10 != 0) {
                    gVar.f48119a = -j10;
                    gVar.f48120b = gVar.getMessagesController().getChat(Long.valueOf(j10));
                    gVar.W(this.f48105c, this.d);
                    return;
                }
                return;
            default:
                i0.p((i0) this.f48106e, this.f48104b, this.f48105c, this.d, j10);
                return;
        }
    }
}
