package wf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f48928a;
    public final c f48929b;

    public a(c cVar, int i10) {
        this.f48928a = i10;
        this.f48929b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f48928a) {
            case 0:
                this.f48929b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f48929b.f48937c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
