package yh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import zh.j5;
public final class e4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f50292a;
    public final j5 f50293b;
    public final t3 f50294c;
    public x3 d;
    public boolean f50295e;

    public e4(int i10, long j3) {
        this.f50292a = i10;
        j5 j5Var = new j5(i10, 0L, false);
        this.f50293b = j5Var;
        j5Var.f52136p = j3;
        t3 t3Var = new t3(j3, i10, new org.telegram.ui.web.b1(this, 19));
        t3Var.f50601s = true;
        this.f50294c = t3Var;
    }

    public final void a() {
        if (this.f50295e) {
            return;
        }
        NotificationCenter.getInstance(this.f50292a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f50293b.a();
        this.f50294c.g(false);
        this.f50295e = true;
    }

    public final void b() {
        if (!this.f50295e) {
            return;
        }
        NotificationCenter.getInstance(this.f50292a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        j5 j5Var = this.f50293b;
        if (j5Var.f52133m != -1) {
            ConnectionsManager.getInstance(j5Var.f52123a).cancelRequest(j5Var.f52133m, true);
            j5Var.f52133m = -1;
        }
        j5Var.f52129i = false;
        this.f50294c.f();
        this.f50295e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x3 x3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f50293b && (x3Var = this.d) != null) {
            x3Var.run();
        }
    }
}
