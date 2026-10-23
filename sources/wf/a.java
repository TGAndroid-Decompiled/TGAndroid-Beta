package wf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f48937a;
    public final c f48938b;

    public a(c cVar, int i10) {
        this.f48937a = i10;
        this.f48938b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f48937a) {
            case 0:
                this.f48938b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f48938b.f48946c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
