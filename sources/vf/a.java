package vf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f49546a;
    public final c f49547b;

    public a(c cVar, int i10) {
        this.f49546a = i10;
        this.f49547b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f49546a) {
            case 0:
                this.f49547b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f49547b.f49555c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
