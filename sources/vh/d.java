package vh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.tp0;
public final class d implements Runnable {
    public final int f45926a;
    public final long f45927b;
    public final NotificationCenter.NotificationCenterDelegate f45928c;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, int i10) {
        this.f45926a = i10;
        this.f45928c = notificationCenterDelegate;
        this.f45927b = j10;
    }

    @Override
    public final void run() {
        switch (this.f45926a) {
            case 0:
                q qVar = (q) this.f45928c;
                org.telegram.ui.Components.z4.M(qVar.f24282b.f26685c0.getParentActivity(), this.f45927b, new tp0(qVar, 20), qVar.f24281a);
                return;
            default:
                y1 y1Var = (y1) this.f45928c;
                org.telegram.ui.Components.z4.M(y1Var.getParentActivity(), this.f45927b, new o3.c(y1Var, 26), y1Var.getResourceProvider());
                return;
        }
    }
}
