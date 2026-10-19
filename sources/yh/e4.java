package yh;

import ai.y9;
import org.telegram.messenger.NotificationCenter;
public final class e4 implements NotificationCenter.NotificationCenterDelegate {
    public final int f50226a;
    public final y9 f50227b;
    public final s3 f50228c;
    public x3 d;
    public boolean e;

    public e4(int i10, long j10) {
        this.f50226a = i10;
        y9 y9Var = new y9(i10, 0L, false);
        this.f50227b = y9Var;
        y9Var.f2508p = j10;
        s3 s3Var = new s3(j10, i10, new ig.l0(this, 28));
        s3Var.f50514s = true;
        this.f50228c = s3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f50226a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f50227b.a();
        this.f50228c.g(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        NotificationCenter.getInstance(this.f50226a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f50227b.f();
        this.f50228c.f();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x3 x3Var;
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f50227b && (x3Var = this.d) != null) {
            x3Var.run();
        }
    }
}
