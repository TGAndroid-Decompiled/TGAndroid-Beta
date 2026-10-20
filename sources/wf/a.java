package wf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f48933a;
    public final c f48934b;

    public a(c cVar, int i10) {
        this.f48933a = i10;
        this.f48934b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f48933a) {
            case 0:
                this.f48934b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f48934b.f48942c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
