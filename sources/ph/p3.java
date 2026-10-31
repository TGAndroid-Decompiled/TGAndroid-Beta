package ph;

import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import rh.v5;
public final class p3 implements us {
    public final int f45269a;
    public final v5 f45270b;
    public final h3 f45271c;
    public l3 d;
    public boolean e;

    public p3(int i10, long j10) {
        this.f45269a = i10;
        v5 v5Var = new v5(i10, 0L, false);
        this.f45270b = v5Var;
        v5Var.f47586p = j10;
        h3 h3Var = new h3(i10, j10, new h1(this, 2));
        h3Var.f45104s = true;
        this.f45271c = h3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        zs.f(this.f45269a).c(this, zs.G3);
        this.f45270b.b();
        this.f45271c.g(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        zs.f(this.f45269a).n(this, zs.G3);
        this.f45270b.f();
        this.f45271c.f();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        l3 l3Var;
        if (i10 == zs.G3 && objArr[1] == this.f45270b && (l3Var = this.d) != null) {
            l3Var.run();
        }
    }
}
