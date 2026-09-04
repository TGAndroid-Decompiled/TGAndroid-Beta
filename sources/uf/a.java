package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f47023a;
    public final c f47024b;

    public a(c cVar, int i10) {
        this.f47023a = i10;
        this.f47024b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f47023a) {
            case 0:
                this.f47024b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f47024b.f47032c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
