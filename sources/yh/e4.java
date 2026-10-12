package yh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import zh.f5;
public final class e4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f48849a;
    public final f5 f48850b;
    public final t3 f48851c;
    public x3 d;
    public boolean e;

    public e4(int i10, long j10) {
        this.f48849a = i10;
        f5 f5Var = new f5(i10, 0L, false);
        this.f48850b = f5Var;
        f5Var.f50513p = j10;
        t3 t3Var = new t3(j10, i10, new ji.p1(this, 22));
        t3Var.f49144s = true;
        this.f48851c = t3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f48849a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f48850b.a();
        this.f48851c.g(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f48849a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        f5 f5Var = this.f48850b;
        if (f5Var.f50510m != -1) {
            ConnectionsManager.getInstance(f5Var.f50501a).cancelRequest(f5Var.f50510m, true);
            f5Var.f50510m = -1;
        }
        f5Var.f50506i = false;
        this.f48851c.f();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x3 x3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f48850b && (x3Var = this.d) != null) {
            x3Var.run();
        }
    }
}
