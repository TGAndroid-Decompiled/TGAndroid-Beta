package wf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f48927a;
    public final c f48928b;

    public a(c cVar, int i10) {
        this.f48927a = i10;
        this.f48928b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f48927a) {
            case 0:
                this.f48928b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f48928b.f48936c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
