package yh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import zh.j5;
public final class e4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f50293a;
    public final j5 f50294b;
    public final t3 f50295c;
    public x3 d;
    public boolean f50296e;

    public e4(int i10, long j3) {
        this.f50293a = i10;
        j5 j5Var = new j5(i10, 0L, false);
        this.f50294b = j5Var;
        j5Var.f52137p = j3;
        t3 t3Var = new t3(j3, i10, new org.telegram.ui.web.b1(this, 19));
        t3Var.f50602s = true;
        this.f50295c = t3Var;
    }

    public final void a() {
        if (this.f50296e) {
            return;
        }
        NotificationCenter.getInstance(this.f50293a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f50294b.a();
        this.f50295c.g(false);
        this.f50296e = true;
    }

    public final void b() {
        if (!this.f50296e) {
            return;
        }
        NotificationCenter.getInstance(this.f50293a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        j5 j5Var = this.f50294b;
        if (j5Var.f52134m != -1) {
            ConnectionsManager.getInstance(j5Var.f52124a).cancelRequest(j5Var.f52134m, true);
            j5Var.f52134m = -1;
        }
        j5Var.f52130i = false;
        this.f50295c.f();
        this.f50296e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x3 x3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f50294b && (x3Var = this.d) != null) {
            x3Var.run();
        }
    }
}
