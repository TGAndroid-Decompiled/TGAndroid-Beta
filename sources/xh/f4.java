package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.m5;
public final class f4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f45863a;
    public final m5 f45864b;
    public final u3 f45865c;
    public y3 d;
    public boolean e;

    public f4(int i10, long j3) {
        this.f45863a = i10;
        m5 m5Var = new m5(i10, 0L, false);
        this.f45864b = m5Var;
        m5Var.f47410p = j3;
        u3 u3Var = new u3(j3, i10, new org.telegram.ui.web.b1(this, 19));
        u3Var.f46154s = true;
        this.f45865c = u3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f45863a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f45864b.a();
        this.f45865c.g(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f45863a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        m5 m5Var = this.f45864b;
        if (m5Var.f47407m != -1) {
            ConnectionsManager.getInstance(m5Var.f47398a).cancelRequest(m5Var.f47407m, true);
            m5Var.f47407m = -1;
        }
        m5Var.f47403i = false;
        this.f45865c.f();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        y3 y3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f45864b && (y3Var = this.d) != null) {
            y3Var.run();
        }
    }
}
