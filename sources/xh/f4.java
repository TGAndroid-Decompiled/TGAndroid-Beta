package xh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import yh.f5;
public final class f4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f51467a;
    public final f5 f51468b;
    public final u3 f51469c;
    public y3 d;
    public boolean f51470e;

    public f4(int i10, long j3) {
        this.f51467a = i10;
        f5 f5Var = new f5(i10, 0L, false);
        this.f51468b = f5Var;
        f5Var.f52747p = j3;
        u3 u3Var = new u3(j3, i10, new ii.q1(this, 22));
        u3Var.f51780s = true;
        this.f51469c = u3Var;
    }

    public final void a() {
        if (this.f51470e) {
            return;
        }
        NotificationCenter.getInstance(this.f51467a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f51468b.a();
        this.f51469c.g(false);
        this.f51470e = true;
    }

    public final void b() {
        if (!this.f51470e) {
            return;
        }
        NotificationCenter.getInstance(this.f51467a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        f5 f5Var = this.f51468b;
        if (f5Var.f52744m != -1) {
            ConnectionsManager.getInstance(f5Var.f52734a).cancelRequest(f5Var.f52744m, true);
            f5Var.f52744m = -1;
        }
        f5Var.f52740i = false;
        this.f51469c.f();
        this.f51470e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        y3 y3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f51468b && (y3Var = this.d) != null) {
            y3Var.run();
        }
    }
}
