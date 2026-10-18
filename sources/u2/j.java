package u2;

import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.hk;
import org.telegram.ui.Components.ry;
import org.telegram.ui.ha;
public final class j implements j0, n2.l {
    public final Object f47383a;
    public a5.a f47384b;
    public n2.k f47385c;
    public final l d;

    public j(l lVar, Object obj) {
        this.d = lVar;
        this.f47384b = lVar.b(null);
        this.f47385c = new n2.k(lVar.d.f17062c, 0, null);
        this.f47383a = obj;
    }

    @Override
    public final void a(int i10, f0 f0Var, int i11) {
        if (l(i10, f0Var)) {
            this.f47385c.c(i11);
        }
    }

    @Override
    public final void b(int i10, f0 f0Var, Exception exc) {
        if (l(i10, f0Var)) {
            this.f47385c.d(exc);
        }
    }

    @Override
    public final void c(int i10, f0 f0Var, oa.d dVar) {
        if (l(i10, f0Var)) {
            this.f47385c.a(dVar);
        }
    }

    @Override
    public final void d(int i10, f0 f0Var, b0 b0Var) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f47384b;
            b0 m10 = m(b0Var, f0Var);
            f0 f0Var2 = (f0) aVar.f281c;
            f0Var2.getClass();
            aVar.l(new ry(aVar, f0Var2, m10, 12));
        }
    }

    @Override
    public final void e(int i10, f0 f0Var, b0 b0Var) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f47384b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.l(new org.telegram.ui.web.m(12, aVar, m10));
        }
    }

    @Override
    public final void f(int i10, f0 f0Var, t tVar, b0 b0Var) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f47384b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.l(new h0(aVar, tVar, m10, 0));
        }
    }

    @Override
    public final void g(int i10, f0 f0Var, t tVar, b0 b0Var, IOException iOException, boolean z10) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f47384b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.l(new hk(aVar, tVar, m10, iOException, z10));
        }
    }

    @Override
    public final void h(int i10, f0 f0Var) {
        if (l(i10, f0Var)) {
            this.f47385c.e();
        }
    }

    @Override
    public final void i(int i10, f0 f0Var, t tVar, b0 b0Var, int i11) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f47384b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.l(new ha(aVar, tVar, m10, i11, 9));
        }
    }

    @Override
    public final void j(int i10, f0 f0Var) {
        if (l(i10, f0Var)) {
            this.f47385c.b();
        }
    }

    @Override
    public final void k(int i10, f0 f0Var, t tVar, b0 b0Var) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f47384b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.l(new h0(aVar, tVar, m10, 1));
        }
    }

    public final boolean l(int i10, f0 f0Var) {
        f0 f0Var2;
        Object obj = this.f47383a;
        l lVar = this.d;
        if (f0Var != null) {
            f0Var2 = lVar.u(obj, f0Var);
            if (f0Var2 == null) {
                return false;
            }
        } else {
            f0Var2 = null;
        }
        int w9 = lVar.w(i10, obj);
        a5.a aVar = this.f47384b;
        if (aVar.f280b != w9 || !Objects.equals((f0) aVar.f281c, f0Var2)) {
            this.f47384b = new a5.a((CopyOnWriteArrayList) lVar.f47293c.d, w9, f0Var2, 21);
        }
        n2.k kVar = this.f47385c;
        if (kVar.f17060a != w9 || !Objects.equals(kVar.f17061b, f0Var2)) {
            this.f47385c = new n2.k(lVar.d.f17062c, w9, f0Var2);
            return true;
        }
        return true;
    }

    public final b0 m(b0 b0Var, f0 f0Var) {
        long j10 = b0Var.f47307f;
        l lVar = this.d;
        Object obj = this.f47383a;
        long v = lVar.v(obj, j10);
        long j11 = b0Var.f47308g;
        long v10 = lVar.v(obj, j11);
        if (v == j10 && v10 == j11) {
            return b0Var;
        }
        return new b0(b0Var.f47304a, b0Var.f47305b, b0Var.f47306c, b0Var.d, b0Var.e, v, v10);
    }
}
