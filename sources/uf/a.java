package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f43636a;
    public final c f43637b;

    public a(c cVar, int i10) {
        this.f43636a = i10;
        this.f43637b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f43636a) {
            case 0:
                this.f43637b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f43637b.f43645c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
