package tf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f42123a;
    public final c f42124b;

    public a(c cVar, int i10) {
        this.f42123a = i10;
        this.f42124b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f42123a) {
            case 0:
                this.f42124b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f42124b.f42132c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
