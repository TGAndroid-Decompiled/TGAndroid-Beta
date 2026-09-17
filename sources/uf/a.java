package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f43711a;
    public final c f43712b;

    public a(c cVar, int i10) {
        this.f43711a = i10;
        this.f43712b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f43711a) {
            case 0:
                this.f43712b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f43712b.f43720c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
