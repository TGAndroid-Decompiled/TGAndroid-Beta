package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f43990a;
    public final c f43991b;

    public a(c cVar, int i10) {
        this.f43990a = i10;
        this.f43991b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f43990a) {
            case 0:
                this.f43991b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f43991b.f43999c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
