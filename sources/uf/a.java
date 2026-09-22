package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f44011a;
    public final c f44012b;

    public a(c cVar, int i10) {
        this.f44011a = i10;
        this.f44012b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f44011a) {
            case 0:
                this.f44012b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f44012b.f44020c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
