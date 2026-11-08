package zh;

import bi.v9;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
public final class j3 implements ls {
    public final int f60405a;
    public final v9 f60406b;
    public final b3 f60407c;
    public f3 d;
    public boolean f60408e;

    public j3(int i7, long j3) {
        this.f60405a = i7;
        v9 v9Var = new v9(i7, 0L, false);
        this.f60406b = v9Var;
        v9Var.f4919p = j3;
        b3 b3Var = new b3(i7, j3, new xg.a(this, 5));
        b3Var.f60249s = true;
        this.f60407c = b3Var;
    }

    public final void a() {
        if (this.f60408e) {
            return;
        }
        qs.f(this.f60405a).c(this, qs.G3);
        this.f60406b.a();
        this.f60407c.g(false);
        this.f60408e = true;
    }

    public final void b() {
        if (!this.f60408e) {
            return;
        }
        qs.f(this.f60405a).n(this, qs.G3);
        this.f60406b.f();
        this.f60407c.f();
        this.f60408e = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        f3 f3Var;
        if (i7 == qs.G3 && objArr[1] == this.f60406b && (f3Var = this.d) != null) {
            f3Var.run();
        }
    }
}
