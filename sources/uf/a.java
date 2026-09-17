package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f47052a;
    public final c f47053b;

    public a(c cVar, int i10) {
        this.f47052a = i10;
        this.f47053b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f47052a) {
            case 0:
                this.f47053b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f47053b.f47061c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
