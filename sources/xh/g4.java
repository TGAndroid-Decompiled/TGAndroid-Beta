package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.l5;
public final class g4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f46198a;
    public final l5 f46199b;
    public final v3 f46200c;
    public z3 d;
    public boolean e;

    public g4(int i10, long j3) {
        this.f46198a = i10;
        l5 l5Var = new l5(i10, 0L, false);
        this.f46199b = l5Var;
        l5Var.f47715p = j3;
        v3 v3Var = new v3(j3, i10, new org.telegram.ui.web.b1(this, 19));
        v3Var.f46506s = true;
        this.f46200c = v3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f46198a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f46199b.a();
        this.f46200c.g(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f46198a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        l5 l5Var = this.f46199b;
        if (l5Var.f47712m != -1) {
            ConnectionsManager.getInstance(l5Var.f47703a).cancelRequest(l5Var.f47712m, true);
            l5Var.f47712m = -1;
        }
        l5Var.f47708i = false;
        this.f46200c.f();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z3 z3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f46199b && (z3Var = this.d) != null) {
            z3Var.run();
        }
    }
}
