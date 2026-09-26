package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f43973a;
    public final c f43974b;

    public a(c cVar, int i10) {
        this.f43973a = i10;
        this.f43974b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f43973a) {
            case 0:
                this.f43974b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f43974b.f43982c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
