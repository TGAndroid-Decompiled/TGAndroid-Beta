package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f43943a;
    public final d f43944b;

    public a(d dVar, int i10) {
        this.f43943a = i10;
        this.f43944b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f43943a) {
            case 0:
                this.f43944b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f43944b.f43955c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
