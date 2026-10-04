package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.k5;
public final class g4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f49963a;
    public final k5 f49964b;
    public final v3 f49965c;
    public z3 d;
    public boolean f49966e;

    public g4(int i10, long j3) {
        this.f49963a = i10;
        k5 k5Var = new k5(i10, 0L, false);
        this.f49964b = k5Var;
        k5Var.f51532p = j3;
        v3 v3Var = new v3(j3, i10, new ii.q1(this, 22));
        v3Var.f50289s = true;
        this.f49965c = v3Var;
    }

    public final void a() {
        if (this.f49966e) {
            return;
        }
        NotificationCenter.getInstance(this.f49963a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f49964b.a();
        this.f49965c.g(false);
        this.f49966e = true;
    }

    public final void b() {
        if (!this.f49966e) {
            return;
        }
        NotificationCenter.getInstance(this.f49963a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        k5 k5Var = this.f49964b;
        if (k5Var.f51529m != -1) {
            ConnectionsManager.getInstance(k5Var.f51519a).cancelRequest(k5Var.f51529m, true);
            k5Var.f51529m = -1;
        }
        k5Var.f51525i = false;
        this.f49965c.f();
        this.f49966e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z3 z3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f49964b && (z3Var = this.d) != null) {
            z3Var.run();
        }
    }
}
