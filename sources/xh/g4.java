package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.f5;
public final class g4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f51341a;
    public final f5 f51342b;
    public final v3 f51343c;
    public z3 d;
    public boolean f51344e;

    public g4(int i10, long j3) {
        this.f51341a = i10;
        f5 f5Var = new f5(i10, 0L, false);
        this.f51342b = f5Var;
        f5Var.f52610p = j3;
        v3 v3Var = new v3(j3, i10, new ii.q1(this, 22));
        v3Var.f51655s = true;
        this.f51343c = v3Var;
    }

    public final void a() {
        if (this.f51344e) {
            return;
        }
        NotificationCenter.getInstance(this.f51341a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f51342b.a();
        this.f51343c.g(false);
        this.f51344e = true;
    }

    public final void b() {
        if (!this.f51344e) {
            return;
        }
        NotificationCenter.getInstance(this.f51341a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        f5 f5Var = this.f51342b;
        if (f5Var.f52607m != -1) {
            ConnectionsManager.getInstance(f5Var.f52597a).cancelRequest(f5Var.f52607m, true);
            f5Var.f52607m = -1;
        }
        f5Var.f52603i = false;
        this.f51343c.f();
        this.f51344e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z3 z3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f51342b && (z3Var = this.d) != null) {
            z3Var.run();
        }
    }
}
