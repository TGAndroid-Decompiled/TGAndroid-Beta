package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.l5;
public final class g4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f46177a;
    public final l5 f46178b;
    public final v3 f46179c;
    public z3 d;
    public boolean e;

    public g4(int i10, long j3) {
        this.f46177a = i10;
        l5 l5Var = new l5(i10, 0L, false);
        this.f46178b = l5Var;
        l5Var.f47694p = j3;
        v3 v3Var = new v3(j3, i10, new org.telegram.ui.web.b1(this, 19));
        v3Var.f46485s = true;
        this.f46179c = v3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f46177a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f46178b.a();
        this.f46179c.g(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f46177a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        l5 l5Var = this.f46178b;
        if (l5Var.f47691m != -1) {
            ConnectionsManager.getInstance(l5Var.f47682a).cancelRequest(l5Var.f47691m, true);
            l5Var.f47691m = -1;
        }
        l5Var.f47687i = false;
        this.f46179c.f();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z3 z3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f46178b && (z3Var = this.d) != null) {
            z3Var.run();
        }
    }
}
