package zh;

import bi.v9;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
public final class k3 implements ls {
    public final int f60426a;
    public final v9 f60427b;
    public final c3 f60428c;
    public g3 d;
    public boolean f60429e;

    public k3(int i7, long j3) {
        this.f60426a = i7;
        v9 v9Var = new v9(i7, 0L, false);
        this.f60427b = v9Var;
        v9Var.f4917p = j3;
        c3 c3Var = new c3(i7, j3, new xg.a(this, 4));
        c3Var.f60277s = true;
        this.f60428c = c3Var;
    }

    public final void a() {
        if (this.f60429e) {
            return;
        }
        qs.f(this.f60426a).c(this, qs.G3);
        this.f60427b.a();
        this.f60428c.g(false);
        this.f60429e = true;
    }

    public final void b() {
        if (!this.f60429e) {
            return;
        }
        qs.f(this.f60426a).n(this, qs.G3);
        this.f60427b.f();
        this.f60428c.f();
        this.f60429e = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        g3 g3Var;
        if (i7 == qs.G3 && objArr[1] == this.f60427b && (g3Var = this.d) != null) {
            g3Var.run();
        }
    }
}
