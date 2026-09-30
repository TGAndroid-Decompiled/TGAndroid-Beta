package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.k5;
public final class g4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f46159a;
    public final k5 f46160b;
    public final v3 f46161c;
    public z3 d;
    public boolean e;

    public g4(int i10, long j3) {
        this.f46159a = i10;
        k5 k5Var = new k5(i10, 0L, false);
        this.f46160b = k5Var;
        k5Var.f47618p = j3;
        v3 v3Var = new v3(j3, i10, new ii.q1(this, 22));
        v3Var.f46467s = true;
        this.f46161c = v3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f46159a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f46160b.a();
        this.f46161c.g(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f46159a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        k5 k5Var = this.f46160b;
        if (k5Var.f47615m != -1) {
            ConnectionsManager.getInstance(k5Var.f47606a).cancelRequest(k5Var.f47615m, true);
            k5Var.f47615m = -1;
        }
        k5Var.f47611i = false;
        this.f46161c.f();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z3 z3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f46160b && (z3Var = this.d) != null) {
            z3Var.run();
        }
    }
}
