package yh;

import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
public final class g implements Runnable {
    public final int f54491a;
    public final l f54492b;

    public g(l lVar, int i10) {
        this.f54491a = i10;
        this.f54492b = lVar;
    }

    @Override
    public final void run() {
        int i10 = this.f54491a;
        l lVar = this.f54492b;
        switch (i10) {
            case 0:
                l.a0(lVar);
                return;
            default:
                zs notificationCenter = lVar.getNotificationCenter();
                int i11 = vp.D8;
                notificationCenter.k(2, 8192);
                return;
        }
    }
}
