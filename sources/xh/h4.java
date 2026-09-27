package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.k5;
public final class h4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f46232a;
    public final k5 f46233b;
    public final w3 f46234c;
    public a4 d;
    public boolean e;

    public h4(int i10, long j3) {
        this.f46232a = i10;
        k5 k5Var = new k5(i10, 0L, false);
        this.f46233b = k5Var;
        k5Var.f47670p = j3;
        w3 w3Var = new w3(j3, i10, new ii.q1(this, 22));
        w3Var.f46540s = true;
        this.f46234c = w3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f46232a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f46233b.a();
        this.f46234c.g(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f46232a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        k5 k5Var = this.f46233b;
        if (k5Var.f47667m != -1) {
            ConnectionsManager.getInstance(k5Var.f47658a).cancelRequest(k5Var.f47667m, true);
            k5Var.f47667m = -1;
        }
        k5Var.f47663i = false;
        this.f46234c.f();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a4 a4Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f46233b && (a4Var = this.d) != null) {
            a4Var.run();
        }
    }
}
