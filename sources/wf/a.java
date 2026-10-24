package wf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f49374a;
    public final c f49375b;

    public a(c cVar, int i10) {
        this.f49374a = i10;
        this.f49375b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f49374a) {
            case 0:
                this.f49375b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f49375b.f49383c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
