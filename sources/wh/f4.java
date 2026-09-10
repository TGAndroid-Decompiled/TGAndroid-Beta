package wh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import xh.n5;
public final class f4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f44092a;
    public final n5 f44093b;
    public final u3 f44094c;
    public y3 d;
    public boolean e;

    public f4(int i10, long j3) {
        this.f44092a = i10;
        n5 n5Var = new n5(i10, 0L, false);
        this.f44093b = n5Var;
        n5Var.f45765p = j3;
        u3 u3Var = new u3(j3, i10, new org.telegram.ui.web.y1(this, 15));
        u3Var.f44383s = true;
        this.f44094c = u3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f44092a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f44093b.a();
        this.f44094c.g(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f44092a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        n5 n5Var = this.f44093b;
        if (n5Var.f45762m != -1) {
            ConnectionsManager.getInstance(n5Var.f45753a).cancelRequest(n5Var.f45762m, true);
            n5Var.f45762m = -1;
        }
        n5Var.f45758i = false;
        this.f44094c.f();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        y3 y3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f44093b && (y3Var = this.d) != null) {
            y3Var.run();
        }
    }
}
