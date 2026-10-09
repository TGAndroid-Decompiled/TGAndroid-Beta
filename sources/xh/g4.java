package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.e5;
public final class g4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f51254a;
    public final e5 f51255b;
    public final v3 f51256c;
    public z3 d;
    public boolean f51257e;

    public g4(int i10, long j3) {
        this.f51254a = i10;
        e5 e5Var = new e5(i10, 0L, false);
        this.f51255b = e5Var;
        e5Var.f52446p = j3;
        v3 v3Var = new v3(j3, i10, new ii.q1(this, 22));
        v3Var.f51568s = true;
        this.f51256c = v3Var;
    }

    public final void a() {
        if (this.f51257e) {
            return;
        }
        NotificationCenter.getInstance(this.f51254a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f51255b.a();
        this.f51256c.g(false);
        this.f51257e = true;
    }

    public final void b() {
        if (!this.f51257e) {
            return;
        }
        NotificationCenter.getInstance(this.f51254a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        e5 e5Var = this.f51255b;
        if (e5Var.f52443m != -1) {
            ConnectionsManager.getInstance(e5Var.f52433a).cancelRequest(e5Var.f52443m, true);
            e5Var.f52443m = -1;
        }
        e5Var.f52439i = false;
        this.f51256c.f();
        this.f51257e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z3 z3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f51255b && (z3Var = this.d) != null) {
            z3Var.run();
        }
    }
}
