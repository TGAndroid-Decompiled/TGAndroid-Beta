package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.n5;
public final class f4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f45890a;
    public final n5 f45891b;
    public final u3 f45892c;
    public y3 d;
    public boolean e;

    public f4(int i10, long j3) {
        this.f45890a = i10;
        n5 n5Var = new n5(i10, 0L, false);
        this.f45891b = n5Var;
        n5Var.f47525p = j3;
        u3 u3Var = new u3(j3, i10, new org.telegram.ui.web.b1(this, 19));
        u3Var.f46181s = true;
        this.f45892c = u3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f45890a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f45891b.a();
        this.f45892c.g(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f45890a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        n5 n5Var = this.f45891b;
        if (n5Var.f47522m != -1) {
            ConnectionsManager.getInstance(n5Var.f47513a).cancelRequest(n5Var.f47522m, true);
            n5Var.f47522m = -1;
        }
        n5Var.f47518i = false;
        this.f45892c.f();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        y3 y3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f45891b && (y3Var = this.d) != null) {
            y3Var.run();
        }
    }
}
