package yh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import zh.j5;
public final class e4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f50264a;
    public final j5 f50265b;
    public final t3 f50266c;
    public x3 d;
    public boolean f50267e;

    public e4(int i10, long j3) {
        this.f50264a = i10;
        j5 j5Var = new j5(i10, 0L, false);
        this.f50265b = j5Var;
        j5Var.f52106p = j3;
        t3 t3Var = new t3(j3, i10, new org.telegram.ui.web.b1(this, 19));
        t3Var.f50573s = true;
        this.f50266c = t3Var;
    }

    public final void a() {
        if (this.f50267e) {
            return;
        }
        NotificationCenter.getInstance(this.f50264a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f50265b.a();
        this.f50266c.g(false);
        this.f50267e = true;
    }

    public final void b() {
        if (!this.f50267e) {
            return;
        }
        NotificationCenter.getInstance(this.f50264a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        j5 j5Var = this.f50265b;
        if (j5Var.f52103m != -1) {
            ConnectionsManager.getInstance(j5Var.f52093a).cancelRequest(j5Var.f52103m, true);
            j5Var.f52103m = -1;
        }
        j5Var.f52099i = false;
        this.f50266c.f();
        this.f50267e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x3 x3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f50265b && (x3Var = this.d) != null) {
            x3Var.run();
        }
    }
}
