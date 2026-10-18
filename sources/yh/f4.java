package yh;

import ai.y9;
import org.telegram.messenger.NotificationCenter;
public final class f4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f50285a;
    public final y9 f50286b;
    public final t3 f50287c;
    public y3 d;
    public boolean e;

    public f4(int i10, long j10) {
        this.f50285a = i10;
        y9 y9Var = new y9(i10, 0L, false);
        this.f50286b = y9Var;
        y9Var.f2502p = j10;
        t3 t3Var = new t3(j10, i10, new ig.l0(this, 28));
        t3Var.f50573s = true;
        this.f50287c = t3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f50285a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f50286b.a();
        this.f50287c.g(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f50285a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f50286b.f();
        this.f50287c.f();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        y3 y3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f50286b && (y3Var = this.d) != null) {
            y3Var.run();
        }
    }
}
