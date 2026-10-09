package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.e5;
public final class g4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f51252a;
    public final e5 f51253b;
    public final v3 f51254c;
    public z3 d;
    public boolean f51255e;

    public g4(int i10, long j3) {
        this.f51252a = i10;
        e5 e5Var = new e5(i10, 0L, false);
        this.f51253b = e5Var;
        e5Var.f52444p = j3;
        v3 v3Var = new v3(j3, i10, new ii.q1(this, 22));
        v3Var.f51566s = true;
        this.f51254c = v3Var;
    }

    public final void a() {
        if (this.f51255e) {
            return;
        }
        NotificationCenter.getInstance(this.f51252a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f51253b.a();
        this.f51254c.g(false);
        this.f51255e = true;
    }

    public final void b() {
        if (!this.f51255e) {
            return;
        }
        NotificationCenter.getInstance(this.f51252a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        e5 e5Var = this.f51253b;
        if (e5Var.f52441m != -1) {
            ConnectionsManager.getInstance(e5Var.f52431a).cancelRequest(e5Var.f52441m, true);
            e5Var.f52441m = -1;
        }
        e5Var.f52437i = false;
        this.f51254c.f();
        this.f51255e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z3 z3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f51253b && (z3Var = this.d) != null) {
            z3Var.run();
        }
    }
}
