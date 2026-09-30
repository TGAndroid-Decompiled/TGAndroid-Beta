package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f43975a;
    public final c f43976b;

    public a(c cVar, int i10) {
        this.f43975a = i10;
        this.f43976b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f43975a) {
            case 0:
                this.f43976b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f43976b.f43984c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
