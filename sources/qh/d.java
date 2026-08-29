package qh;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.c2;
public final class d implements MessagesStorage.LongCallback {
    public final int f46684a;
    public final c2 f46685b;
    public final long f46686c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f46687e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, c2 c2Var, long j10, boolean z10, int i10) {
        this.f46684a = i10;
        this.f46687e = notificationCenterDelegate;
        this.f46685b = c2Var;
        this.f46686c = j10;
        this.d = z10;
    }

    @Override
    public final void run(long j10) {
        switch (this.f46684a) {
            case 0:
                g gVar = (g) this.f46687e;
                gVar.getClass();
                this.f46685b.dismiss();
                if (j10 != 0) {
                    gVar.f46700a = -j10;
                    gVar.f46701b = gVar.getMessagesController().getChat(Long.valueOf(j10));
                    gVar.W(this.f46686c, this.d);
                    return;
                }
                return;
            default:
                i0.p((i0) this.f46687e, this.f46685b, this.f46686c, this.d, j10);
                return;
        }
    }
}
