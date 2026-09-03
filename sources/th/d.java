package th;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.d2;
public final class d implements MessagesStorage.LongCallback {
    public final int f48139a;
    public final d2 f48140b;
    public final long f48141c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f48142e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, d2 d2Var, long j10, boolean z4, int i10) {
        this.f48139a = i10;
        this.f48142e = notificationCenterDelegate;
        this.f48140b = d2Var;
        this.f48141c = j10;
        this.d = z4;
    }

    @Override
    public final void run(long j10) {
        switch (this.f48139a) {
            case 0:
                g gVar = (g) this.f48142e;
                gVar.getClass();
                this.f48140b.dismiss();
                if (j10 != 0) {
                    gVar.f48155a = -j10;
                    gVar.f48156b = gVar.getMessagesController().getChat(Long.valueOf(j10));
                    gVar.W(this.f48141c, this.d);
                    return;
                }
                return;
            default:
                i0.p((i0) this.f48142e, this.f48140b, this.f48141c, this.d, j10);
                return;
        }
    }
}
