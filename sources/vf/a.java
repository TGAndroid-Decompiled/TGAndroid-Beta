package vf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f49548a;
    public final c f49549b;

    public a(c cVar, int i10) {
        this.f49548a = i10;
        this.f49549b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f49548a) {
            case 0:
                this.f49549b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f49549b.f49557c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
