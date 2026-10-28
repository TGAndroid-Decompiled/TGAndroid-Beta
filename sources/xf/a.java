package xf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f51795a;
    public final c f51796b;

    public a(c cVar, int i10) {
        this.f51795a = i10;
        this.f51796b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f51795a) {
            case 0:
                this.f51796b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f51796b.f51804c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
