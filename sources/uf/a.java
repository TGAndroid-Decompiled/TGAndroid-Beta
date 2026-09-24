package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f43959a;
    public final c f43960b;

    public a(c cVar, int i10) {
        this.f43959a = i10;
        this.f43960b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f43959a) {
            case 0:
                this.f43960b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f43960b.f43968c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
