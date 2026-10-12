package vf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f49776a;
    public final c f49777b;

    public a(c cVar, int i10) {
        this.f49776a = i10;
        this.f49777b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f49776a) {
            case 0:
                this.f49777b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f49777b.f49785c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
