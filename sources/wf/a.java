package wf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f48926a;
    public final c f48927b;

    public a(c cVar, int i10) {
        this.f48926a = i10;
        this.f48927b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f48926a) {
            case 0:
                this.f48927b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f48927b.f48935c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
