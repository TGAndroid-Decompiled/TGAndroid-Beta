package zh;

import bi.v9;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
public final class k3 implements ls {
    public final int f60428a;
    public final v9 f60429b;
    public final c3 f60430c;
    public g3 d;
    public boolean f60431e;

    public k3(int i7, long j3) {
        this.f60428a = i7;
        v9 v9Var = new v9(i7, 0L, false);
        this.f60429b = v9Var;
        v9Var.f4918p = j3;
        c3 c3Var = new c3(i7, j3, new xg.a(this, 4));
        c3Var.f60279s = true;
        this.f60430c = c3Var;
    }

    public final void a() {
        if (this.f60431e) {
            return;
        }
        qs.f(this.f60428a).c(this, qs.G3);
        this.f60429b.a();
        this.f60430c.g(false);
        this.f60431e = true;
    }

    public final void b() {
        if (!this.f60431e) {
            return;
        }
        qs.f(this.f60428a).n(this, qs.G3);
        this.f60429b.f();
        this.f60430c.f();
        this.f60431e = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        g3 g3Var;
        if (i7 == qs.G3 && objArr[1] == this.f60429b && (g3Var = this.d) != null) {
            g3Var.run();
        }
    }
}
