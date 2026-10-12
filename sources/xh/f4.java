package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.f5;
public final class f4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f51475a;
    public final f5 f51476b;
    public final u3 f51477c;
    public y3 d;
    public boolean f51478e;

    public f4(int i10, long j3) {
        this.f51475a = i10;
        f5 f5Var = new f5(i10, 0L, false);
        this.f51476b = f5Var;
        f5Var.f52759p = j3;
        u3 u3Var = new u3(j3, i10, new ii.q1(this, 22));
        u3Var.f51788s = true;
        this.f51477c = u3Var;
    }

    public final void a() {
        if (this.f51478e) {
            return;
        }
        NotificationCenter.getInstance(this.f51475a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f51476b.a();
        this.f51477c.g(false);
        this.f51478e = true;
    }

    public final void b() {
        if (!this.f51478e) {
            return;
        }
        NotificationCenter.getInstance(this.f51475a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        f5 f5Var = this.f51476b;
        if (f5Var.f52756m != -1) {
            ConnectionsManager.getInstance(f5Var.f52746a).cancelRequest(f5Var.f52756m, true);
            f5Var.f52756m = -1;
        }
        f5Var.f52752i = false;
        this.f51477c.f();
        this.f51478e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        y3 y3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f51476b && (y3Var = this.d) != null) {
            y3Var.run();
        }
    }
}
