package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.f5;
public final class g4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f51375a;
    public final f5 f51376b;
    public final v3 f51377c;
    public z3 d;
    public boolean f51378e;

    public g4(int i10, long j3) {
        this.f51375a = i10;
        f5 f5Var = new f5(i10, 0L, false);
        this.f51376b = f5Var;
        f5Var.f52644p = j3;
        v3 v3Var = new v3(j3, i10, new ii.q1(this, 22));
        v3Var.f51689s = true;
        this.f51377c = v3Var;
    }

    public final void a() {
        if (this.f51378e) {
            return;
        }
        NotificationCenter.getInstance(this.f51375a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f51376b.a();
        this.f51377c.g(false);
        this.f51378e = true;
    }

    public final void b() {
        if (!this.f51378e) {
            return;
        }
        NotificationCenter.getInstance(this.f51375a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        f5 f5Var = this.f51376b;
        if (f5Var.f52641m != -1) {
            ConnectionsManager.getInstance(f5Var.f52631a).cancelRequest(f5Var.f52641m, true);
            f5Var.f52641m = -1;
        }
        f5Var.f52637i = false;
        this.f51377c.f();
        this.f51378e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z3 z3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f51376b && (z3Var = this.d) != null) {
            z3Var.run();
        }
    }
}
