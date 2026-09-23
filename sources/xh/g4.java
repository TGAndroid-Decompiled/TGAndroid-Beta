package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.l5;
public final class g4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f45829a;
    public final l5 f45830b;
    public final v3 f45831c;
    public z3 d;
    public boolean e;

    public g4(int i10, long j3) {
        this.f45829a = i10;
        l5 l5Var = new l5(i10, 0L, false);
        this.f45830b = l5Var;
        l5Var.f47341p = j3;
        v3 v3Var = new v3(j3, i10, new ii.q1(this, 22));
        v3Var.f46137s = true;
        this.f45831c = v3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f45829a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f45830b.a();
        this.f45831c.g(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f45829a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        l5 l5Var = this.f45830b;
        if (l5Var.f47338m != -1) {
            ConnectionsManager.getInstance(l5Var.f47329a).cancelRequest(l5Var.f47338m, true);
            l5Var.f47338m = -1;
        }
        l5Var.f47334i = false;
        this.f45831c.f();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z3 z3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f45830b && (z3Var = this.d) != null) {
            z3Var.run();
        }
    }
}
