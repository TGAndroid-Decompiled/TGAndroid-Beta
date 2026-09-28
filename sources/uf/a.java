package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f43974a;
    public final c f43975b;

    public a(c cVar, int i10) {
        this.f43974a = i10;
        this.f43975b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f43974a) {
            case 0:
                this.f43975b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f43975b.f43983c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
