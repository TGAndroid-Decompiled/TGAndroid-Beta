package wf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f47541a;
    public final c f47542b;

    public a(c cVar, int i10) {
        this.f47541a = i10;
        this.f47542b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f47541a) {
            case 0:
                this.f47542b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f47542b.f47550c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
