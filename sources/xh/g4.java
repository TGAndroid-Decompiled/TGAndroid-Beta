package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.k5;
public final class g4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f49971a;
    public final k5 f49972b;
    public final v3 f49973c;
    public z3 d;
    public boolean f49974e;

    public g4(int i10, long j3) {
        this.f49971a = i10;
        k5 k5Var = new k5(i10, 0L, false);
        this.f49972b = k5Var;
        k5Var.f51537p = j3;
        v3 v3Var = new v3(j3, i10, new ii.q1(this, 22));
        v3Var.f50297s = true;
        this.f49973c = v3Var;
    }

    public final void a() {
        if (this.f49974e) {
            return;
        }
        NotificationCenter.getInstance(this.f49971a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f49972b.a();
        this.f49973c.g(false);
        this.f49974e = true;
    }

    public final void b() {
        if (!this.f49974e) {
            return;
        }
        NotificationCenter.getInstance(this.f49971a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        k5 k5Var = this.f49972b;
        if (k5Var.f51534m != -1) {
            ConnectionsManager.getInstance(k5Var.f51524a).cancelRequest(k5Var.f51534m, true);
            k5Var.f51534m = -1;
        }
        k5Var.f51530i = false;
        this.f49973c.f();
        this.f49974e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z3 z3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f49972b && (z3Var = this.d) != null) {
            z3Var.run();
        }
    }
}
