package uf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f47629a;
    public final c f47630b;

    public a(c cVar, int i10) {
        this.f47629a = i10;
        this.f47630b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f47629a) {
            case 0:
                this.f47630b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f47630b.f47638c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
