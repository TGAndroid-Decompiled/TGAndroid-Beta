package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.l5;
public final class g4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f49978a;
    public final l5 f49979b;
    public final v3 f49980c;
    public z3 d;
    public boolean f49981e;

    public g4(int i10, long j3) {
        this.f49978a = i10;
        l5 l5Var = new l5(i10, 0L, false);
        this.f49979b = l5Var;
        l5Var.f51594p = j3;
        v3 v3Var = new v3(j3, i10, new ii.q1(this, 22));
        v3Var.f50304s = true;
        this.f49980c = v3Var;
    }

    public final void a() {
        if (this.f49981e) {
            return;
        }
        NotificationCenter.getInstance(this.f49978a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f49979b.a();
        this.f49980c.g(false);
        this.f49981e = true;
    }

    public final void b() {
        if (!this.f49981e) {
            return;
        }
        NotificationCenter.getInstance(this.f49978a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        l5 l5Var = this.f49979b;
        if (l5Var.f51591m != -1) {
            ConnectionsManager.getInstance(l5Var.f51581a).cancelRequest(l5Var.f51591m, true);
            l5Var.f51591m = -1;
        }
        l5Var.f51587i = false;
        this.f49980c.f();
        this.f49981e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z3 z3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f49979b && (z3Var = this.d) != null) {
            z3Var.run();
        }
    }
}
