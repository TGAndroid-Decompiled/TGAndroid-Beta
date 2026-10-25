package xf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f51734a;
    public final c f51735b;

    public a(c cVar, int i10) {
        this.f51734a = i10;
        this.f51735b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f51734a) {
            case 0:
                this.f51735b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f51735b.f51743c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
