package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.k5;
public final class g4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f46156a;
    public final k5 f46157b;
    public final v3 f46158c;
    public z3 d;
    public boolean e;

    public g4(int i10, long j3) {
        this.f46156a = i10;
        k5 k5Var = new k5(i10, 0L, false);
        this.f46157b = k5Var;
        k5Var.f47615p = j3;
        v3 v3Var = new v3(j3, i10, new ii.q1(this, 22));
        v3Var.f46464s = true;
        this.f46158c = v3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f46156a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f46157b.a();
        this.f46158c.g(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f46156a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        k5 k5Var = this.f46157b;
        if (k5Var.f47612m != -1) {
            ConnectionsManager.getInstance(k5Var.f47603a).cancelRequest(k5Var.f47612m, true);
            k5Var.f47612m = -1;
        }
        k5Var.f47608i = false;
        this.f46158c.f();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z3 z3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f46157b && (z3Var = this.d) != null) {
            z3Var.run();
        }
    }
}
