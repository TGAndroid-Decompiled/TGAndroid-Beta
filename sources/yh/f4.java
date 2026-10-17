package yh;

import ai.x9;
import org.telegram.messenger.NotificationCenter;
public final class f4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f50260a;
    public final x9 f50261b;
    public final t3 f50262c;
    public y3 d;
    public boolean e;

    public f4(int i10, long j10) {
        this.f50260a = i10;
        x9 x9Var = new x9(i10, 0L, false);
        this.f50261b = x9Var;
        x9Var.f2452p = j10;
        t3 t3Var = new t3(j10, i10, new ig.l0(this, 28));
        t3Var.f50548s = true;
        this.f50262c = t3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f50260a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f50261b.a();
        this.f50262c.g(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f50260a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f50261b.f();
        this.f50262c.f();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        y3 y3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f50261b && (y3Var = this.d) != null) {
            y3Var.run();
        }
    }
}
