package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f47613a;
    public final c f47614b;

    public a(c cVar, int i10) {
        this.f47613a = i10;
        this.f47614b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f47613a) {
            case 0:
                this.f47614b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f47614b.f47622c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
