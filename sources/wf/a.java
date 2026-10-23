package wf;

import org.telegram.messenger.NotificationCenter;
public final class a implements Runnable {
    public final int f49375a;
    public final c f49376b;

    public a(c cVar, int i10) {
        this.f49375a = i10;
        this.f49376b = cVar;
    }

    @Override
    public final void run() {
        switch (this.f49375a) {
            case 0:
                this.f49376b.g(false);
                return;
            default:
                NotificationCenter.getInstance(this.f49376b.f49384c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                return;
        }
    }
}
