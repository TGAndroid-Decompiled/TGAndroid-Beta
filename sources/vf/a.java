package vf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f49784a;
    public final c f49785b;

    public a(c cVar, int i10) {
        this.f49784a = i10;
        this.f49785b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f49784a) {
            case 0:
                this.f49785b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f49785b.f49793c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
