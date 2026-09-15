package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f43688a;
    public final c f43689b;

    public a(c cVar, int i10) {
        this.f43688a = i10;
        this.f43689b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f43688a) {
            case 0:
                this.f43689b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f43689b.f43697c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
