package wf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f48949a;
    public final c f48950b;

    public a(c cVar, int i10) {
        this.f48949a = i10;
        this.f48950b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f48949a) {
            case 0:
                this.f48950b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f48950b.f48958c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
