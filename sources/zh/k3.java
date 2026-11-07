package zh;

import bi.v9;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
public final class k3 implements ls {
    public final int f60328a;
    public final v9 f60329b;
    public final d3 f60330c;
    public h3 d;
    public boolean f60331e;

    public k3(int i7, long j3) {
        this.f60328a = i7;
        v9 v9Var = new v9(i7, 0L, false);
        this.f60329b = v9Var;
        v9Var.f4919p = j3;
        d3 d3Var = new d3(i7, j3, new xg.a(this, 5));
        d3Var.f60194s = true;
        this.f60330c = d3Var;
    }

    public final void a() {
        if (this.f60331e) {
            return;
        }
        qs.f(this.f60328a).c(this, qs.G3);
        this.f60329b.a();
        this.f60330c.g(false);
        this.f60331e = true;
    }

    public final void b() {
        if (!this.f60331e) {
            return;
        }
        qs.f(this.f60328a).n(this, qs.G3);
        this.f60329b.f();
        this.f60330c.f();
        this.f60331e = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        h3 h3Var;
        if (i7 == qs.G3 && objArr[1] == this.f60329b && (h3Var = this.d) != null) {
            h3Var.run();
        }
    }
}
