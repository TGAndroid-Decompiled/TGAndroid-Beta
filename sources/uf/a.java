package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f47051a;
    public final c f47052b;

    public a(c cVar, int i10) {
        this.f47051a = i10;
        this.f47052b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f47051a) {
            case 0:
                this.f47052b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f47052b.f47060c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
