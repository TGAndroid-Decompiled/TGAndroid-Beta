package ph;

import org.telegram.messenger.at;
import org.telegram.messenger.vs;
import rh.v5;
public final class p3 implements vs {
    public final int f45280a;
    public final v5 f45281b;
    public final h3 f45282c;
    public l3 d;
    public boolean e;

    public p3(int i10, long j10) {
        this.f45280a = i10;
        v5 v5Var = new v5(i10, 0L, false);
        this.f45281b = v5Var;
        v5Var.f47600p = j10;
        h3 h3Var = new h3(i10, j10, new h1(this, 2));
        h3Var.f45115s = true;
        this.f45282c = h3Var;
    }

    public final void a() {
        if (this.e) {
            return;
        }
        at.f(this.f45280a).c(this, at.G3);
        this.f45281b.b();
        this.f45282c.g(false);
        this.e = true;
    }

    public final void b() {
        if (!this.e) {
            return;
        }
        at.f(this.f45280a).n(this, at.G3);
        this.f45281b.f();
        this.f45282c.f();
        this.e = false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        l3 l3Var;
        if (i10 == at.G3 && objArr[1] == this.f45281b && (l3Var = this.d) != null) {
            l3Var.run();
        }
    }
}
