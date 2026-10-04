package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.k5;
public final class g4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f49962a;
    public final k5 f49963b;
    public final v3 f49964c;
    public z3 d;
    public boolean f49965e;

    public g4(int i10, long j3) {
        this.f49962a = i10;
        k5 k5Var = new k5(i10, 0L, false);
        this.f49963b = k5Var;
        k5Var.f51531p = j3;
        v3 v3Var = new v3(j3, i10, new ii.q1(this, 22));
        v3Var.f50288s = true;
        this.f49964c = v3Var;
    }

    public final void a() {
        if (this.f49965e) {
            return;
        }
        NotificationCenter.getInstance(this.f49962a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f49963b.a();
        this.f49964c.g(false);
        this.f49965e = true;
    }

    public final void b() {
        if (!this.f49965e) {
            return;
        }
        NotificationCenter.getInstance(this.f49962a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        k5 k5Var = this.f49963b;
        if (k5Var.f51528m != -1) {
            ConnectionsManager.getInstance(k5Var.f51518a).cancelRequest(k5Var.f51528m, true);
            k5Var.f51528m = -1;
        }
        k5Var.f51524i = false;
        this.f49964c.f();
        this.f49965e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z3 z3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f49963b && (z3Var = this.d) != null) {
            z3Var.run();
        }
    }
}
