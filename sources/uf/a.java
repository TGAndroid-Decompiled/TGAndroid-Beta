package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f44016a;
    public final d f44017b;

    public a(d dVar, int i10) {
        this.f44016a = i10;
        this.f44017b = dVar;
    }

    @Override
    public final void run() {
        switch (this.f44016a) {
            case 0:
                this.f44017b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f44017b.f44028c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
