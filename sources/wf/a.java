package wf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f48936a;
    public final c f48937b;

    public a(c cVar, int i10) {
        this.f48936a = i10;
        this.f48937b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f48936a) {
            case 0:
                this.f48937b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f48937b.f48945c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
