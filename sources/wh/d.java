package wh;

import org.telegram.messenger.NotificationCenter;
public final class d implements Runnable {
    public final int f49691a;
    public final long f49692b;
    public final NotificationCenter.NotificationCenterDelegate f49693c;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j10, int i10) {
        this.f49691a = i10;
        this.f49693c = notificationCenterDelegate;
        this.f49692b = j10;
    }

    @Override
    public final void run() {
        switch (this.f49691a) {
            case 0:
                q qVar = (q) this.f49693c;
                org.telegram.ui.Components.z4.M(qVar.f26546b.f29040c0.getParentActivity(), this.f49692b, new oh.h4(qVar, 25), qVar.f26545a);
                return;
            default:
                z1 z1Var = (z1) this.f49693c;
                org.telegram.ui.Components.z4.M(z1Var.getParentActivity(), this.f49692b, new org.telegram.ui.web.e0(z1Var, 20), z1Var.getResourceProvider());
                return;
        }
    }
}
