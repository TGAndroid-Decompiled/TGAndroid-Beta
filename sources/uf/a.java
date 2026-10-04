package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f47614a;
    public final c f47615b;

    public a(c cVar, int i10) {
        this.f47614a = i10;
        this.f47615b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f47614a) {
            case 0:
                this.f47615b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f47615b.f47623c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
