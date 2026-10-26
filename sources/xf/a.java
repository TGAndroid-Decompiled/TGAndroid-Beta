package xf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f51737a;
    public final c f51738b;

    public a(c cVar, int i10) {
        this.f51737a = i10;
        this.f51738b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f51737a) {
            case 0:
                this.f51738b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f51738b.f51746c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
