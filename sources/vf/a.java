package vf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f49669a;
    public final c f49670b;

    public a(c cVar, int i10) {
        this.f49669a = i10;
        this.f49670b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f49669a) {
            case 0:
                this.f49670b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f49670b.f49678c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
