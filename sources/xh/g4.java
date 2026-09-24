package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.k5;
public final class g4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f46143a;
    public final k5 f46144b;
    public final v3 f46145c;
    public z3 d;
    public boolean e;

    public g4(int i10, long j3) {
        this.f46143a = i10;
        k5 k5Var = new k5(i10, 0L, false);
        this.f46144b = k5Var;
        k5Var.f47605p = j3;
        v3 v3Var = new v3(j3, i10, new ii.q1(this, 22));
        v3Var.f46451s = true;
        this.f46145c = v3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f46143a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f46144b.a();
        this.f46145c.g(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f46143a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        k5 k5Var = this.f46144b;
        if (k5Var.f47602m != -1) {
            ConnectionsManager.getInstance(k5Var.f47593a).cancelRequest(k5Var.f47602m, true);
            k5Var.f47602m = -1;
        }
        k5Var.f47598i = false;
        this.f46145c.f();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z3 z3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f46144b && (z3Var = this.d) != null) {
            z3Var.run();
        }
    }
}
