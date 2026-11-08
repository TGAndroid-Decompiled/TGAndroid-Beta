package zh;

import bi.v9;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
public final class j3 implements ls {
    public final int f60406a;
    public final v9 f60407b;
    public final b3 f60408c;
    public f3 d;
    public boolean f60409e;

    public j3(int i7, long j3) {
        this.f60406a = i7;
        v9 v9Var = new v9(i7, 0L, false);
        this.f60407b = v9Var;
        v9Var.f4919p = j3;
        b3 b3Var = new b3(i7, j3, new xg.a(this, 5));
        b3Var.f60250s = true;
        this.f60408c = b3Var;
    }

    public final void a() {
        if (this.f60409e) {
            return;
        }
        qs.f(this.f60406a).c(this, qs.G3);
        this.f60407b.a();
        this.f60408c.g(false);
        this.f60409e = true;
    }

    public final void b() {
        if (!this.f60409e) {
            return;
        }
        qs.f(this.f60406a).n(this, qs.G3);
        this.f60407b.f();
        this.f60408c.f();
        this.f60409e = false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        f3 f3Var;
        if (i7 == qs.G3 && objArr[1] == this.f60407b && (f3Var = this.d) != null) {
            f3Var.run();
        }
    }
}
