package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f43716a;
    public final c f43717b;

    public a(c cVar, int i10) {
        this.f43716a = i10;
        this.f43717b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f43716a) {
            case 0:
                this.f43717b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f43717b.f43725c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
