package yh;

import org.telegram.messenger.at;
import org.telegram.messenger.wp;
public final class g implements Runnable {
    public final int f54495a;
    public final l f54496b;

    public g(l lVar, int i10) {
        this.f54495a = i10;
        this.f54496b = lVar;
    }

    @Override
    public final void run() {
        int i10 = this.f54495a;
        l lVar = this.f54496b;
        switch (i10) {
            case 0:
                l.b0(lVar);
                return;
            default:
                at notificationCenter = lVar.getNotificationCenter();
                int i11 = wp.D8;
                notificationCenter.k(2, 8192);
                return;
        }
    }
}
