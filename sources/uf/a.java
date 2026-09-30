package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f44081a;
    public final c f44082b;

    public a(c cVar, int i10) {
        this.f44081a = i10;
        this.f44082b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f44081a) {
            case 0:
                this.f44082b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f44082b.f44090c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
