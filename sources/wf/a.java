package wf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f48974a;
    public final c f48975b;

    public a(c cVar, int i10) {
        this.f48974a = i10;
        this.f48975b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f48974a) {
            case 0:
                this.f48975b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f48975b.f48983c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
