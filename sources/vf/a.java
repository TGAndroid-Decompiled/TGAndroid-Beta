package vf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f49592a;
    public final c f49593b;

    public a(c cVar, int i10) {
        this.f49592a = i10;
        this.f49593b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f49592a) {
            case 0:
                this.f49593b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f49593b.f49601c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
