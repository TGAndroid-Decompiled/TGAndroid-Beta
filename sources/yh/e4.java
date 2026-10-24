package yh;

import ai.y9;
import org.telegram.messenger.NotificationCenter;
public final class e4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f50678a;
    public final y9 f50679b;
    public final s3 f50680c;
    public x3 d;
    public boolean e;

    public e4(int i10, long j10) {
        this.f50678a = i10;
        y9 y9Var = new y9(i10, 0L, false);
        this.f50679b = y9Var;
        y9Var.f2515p = j10;
        s3 s3Var = new s3(j10, i10, new ig.k0(this, 28));
        s3Var.f50980s = true;
        this.f50680c = s3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f50678a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f50679b.a();
        this.f50680c.g(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f50678a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f50679b.f();
        this.f50680c.f();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x3 x3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f50679b && (x3Var = this.d) != null) {
            x3Var.run();
        }
    }
}
