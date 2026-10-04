package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f47622a;
    public final c f47623b;

    public a(c cVar, int i10) {
        this.f47622a = i10;
        this.f47623b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f47622a) {
            case 0:
                this.f47623b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f47623b.f47631c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
