package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f47024a;
    public final c f47025b;

    public a(c cVar, int i10) {
        this.f47024a = i10;
        this.f47025b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f47024a) {
            case 0:
                this.f47025b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f47025b.f47033c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
