package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f43684a;
    public final c f43685b;

    public a(c cVar, int i10) {
        this.f43684a = i10;
        this.f43685b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f43684a) {
            case 0:
                this.f43685b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f43685b.f43693c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
