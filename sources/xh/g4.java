package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.e5;
public final class g4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f51298a;
    public final e5 f51299b;
    public final v3 f51300c;
    public z3 d;
    public boolean f51301e;

    public g4(int i10, long j3) {
        this.f51298a = i10;
        e5 e5Var = new e5(i10, 0L, false);
        this.f51299b = e5Var;
        e5Var.f52490p = j3;
        v3 v3Var = new v3(j3, i10, new ii.q1(this, 22));
        v3Var.f51612s = true;
        this.f51300c = v3Var;
    }

    public final void a() {
        if (this.f51301e) {
            return;
        }
        NotificationCenter.getInstance(this.f51298a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f51299b.a();
        this.f51300c.g(false);
        this.f51301e = true;
    }

    public final void b() {
        if (!this.f51301e) {
            return;
        }
        NotificationCenter.getInstance(this.f51298a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        e5 e5Var = this.f51299b;
        if (e5Var.f52487m != -1) {
            ConnectionsManager.getInstance(e5Var.f52477a).cancelRequest(e5Var.f52487m, true);
            e5Var.f52487m = -1;
        }
        e5Var.f52483i = false;
        this.f51300c.f();
        this.f51301e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z3 z3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f51299b && (z3Var = this.d) != null) {
            z3Var.run();
        }
    }
}
