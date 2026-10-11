package vf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f49635a;
    public final c f49636b;

    public a(c cVar, int i10) {
        this.f49635a = i10;
        this.f49636b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f49635a) {
            case 0:
                this.f49636b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f49636b.f49644c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
