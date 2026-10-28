package zh;

import bi.t9;
import org.telegram.messenger.NotificationCenter;
public final class f4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f53031a;
    public final t9 f53032b;
    public final u3 f53033c;
    public y3 d;
    public boolean e;

    public f4(int i10, long j10) {
        this.f53031a = i10;
        t9 t9Var = new t9(i10, 0L, false);
        this.f53032b = t9Var;
        t9Var.f5475p = j10;
        u3 u3Var = new u3(j10, i10, new l1(this, 2));
        u3Var.f53338s = true;
        this.f53033c = u3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f53031a).addWeakObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f53032b.b();
        this.f53033c.g(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f53031a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f53032b.a();
        this.f53033c.a();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        y3 y3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f53032b && (y3Var = this.d) != null) {
            y3Var.run();
        }
    }
}
