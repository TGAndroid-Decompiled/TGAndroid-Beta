package yh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import zh.j5;
public final class e4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f50263a;
    public final j5 f50264b;
    public final t3 f50265c;
    public x3 d;
    public boolean f50266e;

    public e4(int i10, long j3) {
        this.f50263a = i10;
        j5 j5Var = new j5(i10, 0L, false);
        this.f50264b = j5Var;
        j5Var.f52105p = j3;
        t3 t3Var = new t3(j3, i10, new org.telegram.ui.web.b1(this, 19));
        t3Var.f50572s = true;
        this.f50265c = t3Var;
    }

    public final void a() {
        if (this.f50266e) {
            return;
        }
        NotificationCenter.getInstance(this.f50263a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f50264b.a();
        this.f50265c.g(false);
        this.f50266e = true;
    }

    public final void b() {
        if (!this.f50266e) {
            return;
        }
        NotificationCenter.getInstance(this.f50263a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        j5 j5Var = this.f50264b;
        if (j5Var.f52102m != -1) {
            ConnectionsManager.getInstance(j5Var.f52092a).cancelRequest(j5Var.f52102m, true);
            j5Var.f52102m = -1;
        }
        j5Var.f52098i = false;
        this.f50265c.f();
        this.f50266e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x3 x3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f50264b && (x3Var = this.d) != null) {
            x3Var.run();
        }
    }
}
