package u2;

import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.zj;
import org.telegram.ui.Components.s50;
import org.telegram.ui.da;
public final class j implements k0, n2.l {
    public final Object f43664a;
    public a5.a f43665b;
    public n2.k f43666c;
    public final l d;

    public j(l lVar, Object obj) {
        this.d = lVar;
        this.f43665b = lVar.b(null);
        this.f43666c = new n2.k(lVar.d.f15120c, 0, null);
        this.f43664a = obj;
    }

    @Override
    public final void a(int i10, f0 f0Var, int i11) {
        if (l(i10, f0Var)) {
            this.f43666c.c(i11);
        }
    }

    @Override
    public final void b(int i10, f0 f0Var, Exception exc) {
        if (l(i10, f0Var)) {
            this.f43666c.d(exc);
        }
    }

    @Override
    public final void c(int i10, f0 f0Var, b0 b0Var) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f43665b;
            b0 m10 = m(b0Var, f0Var);
            f0 f0Var2 = (f0) aVar.f278c;
            f0Var2.getClass();
            aVar.j(new s50(aVar, f0Var2, m10, 10));
        }
    }

    @Override
    public final void d(int i10, f0 f0Var, b0 b0Var) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f43665b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.j(new s5.e(7, aVar, m10));
        }
    }

    @Override
    public final void e(int i10, f0 f0Var, t tVar, b0 b0Var) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f43665b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.j(new h0(aVar, tVar, m10, 0));
        }
    }

    @Override
    public final void f(int i10, f0 f0Var, t tVar, b0 b0Var, IOException iOException, boolean z10) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f43665b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.j(new zj(aVar, tVar, m10, iOException, z10));
        }
    }

    @Override
    public final void g(int i10, f0 f0Var) {
        if (l(i10, f0Var)) {
            this.f43666c.e();
        }
    }

    @Override
    public final void h(int i10, f0 f0Var, t tVar, b0 b0Var, int i11) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f43665b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.j(new da(aVar, tVar, m10, i11, 10));
        }
    }

    @Override
    public final void i(int i10, f0 f0Var) {
        if (l(i10, f0Var)) {
            this.f43666c.b();
        }
    }

    @Override
    public final void j(int i10, f0 f0Var, t tVar, b0 b0Var) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f43665b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.j(new h0(aVar, tVar, m10, 1));
        }
    }

    @Override
    public final void k(int i10, f0 f0Var) {
        if (l(i10, f0Var)) {
            this.f43666c.a();
        }
    }

    public final boolean l(int i10, f0 f0Var) {
        f0 f0Var2;
        Object obj = this.f43664a;
        l lVar = this.d;
        if (f0Var != null) {
            f0Var2 = lVar.u(obj, f0Var);
            if (f0Var2 == null) {
                return false;
            }
        } else {
            f0Var2 = null;
        }
        int w10 = lVar.w(i10, obj);
        a5.a aVar = this.f43665b;
        if (aVar.f277b != w10 || !Objects.equals((f0) aVar.f278c, f0Var2)) {
            this.f43665b = new a5.a((CopyOnWriteArrayList) lVar.f43571c.d, w10, f0Var2, 20);
        }
        n2.k kVar = this.f43666c;
        if (kVar.f15118a != w10 || !Objects.equals(kVar.f15119b, f0Var2)) {
            this.f43666c = new n2.k(lVar.d.f15120c, w10, f0Var2);
            return true;
        }
        return true;
    }

    public final b0 m(b0 b0Var, f0 f0Var) {
        long j3 = b0Var.f43607f;
        l lVar = this.d;
        Object obj = this.f43664a;
        long v = lVar.v(obj, j3);
        long j10 = b0Var.f43608g;
        long v9 = lVar.v(obj, j10);
        if (v == j3 && v9 == j10) {
            return b0Var;
        }
        return new b0(b0Var.f43604a, b0Var.f43605b, b0Var.f43606c, b0Var.d, b0Var.e, v, v9);
    }
}
