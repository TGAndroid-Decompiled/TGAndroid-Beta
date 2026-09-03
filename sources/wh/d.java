package wh;

import org.telegram.messenger.NotificationCenter;
public final class d implements Runnable {
    public final int f49728a;
    public final long f49729b;
    public final NotificationCenter.NotificationCenterDelegate f49730c;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, int i10) {
        this.f49728a = i10;
        this.f49730c = notificationCenterDelegate;
        this.f49729b = j10;
    }

    @Override
    public final void run() {
        switch (this.f49728a) {
            case 0:
                q qVar = (q) this.f49730c;
                org.telegram.ui.Components.z4.M(qVar.f26590b.f29058c0.getParentActivity(), this.f49729b, new oh.h4(qVar, 25), qVar.f26589a);
                return;
            default:
                z1 z1Var = (z1) this.f49730c;
                org.telegram.ui.Components.z4.M(z1Var.getParentActivity(), this.f49729b, new org.telegram.ui.web.e0(z1Var, 20), z1Var.getResourceProvider());
                return;
        }
    }
}
