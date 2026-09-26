package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f43972a;
    public final c f43973b;

    public a(c cVar, int i10) {
        this.f43972a = i10;
        this.f43973b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f43972a) {
            case 0:
                this.f43973b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f43973b.f43981c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
