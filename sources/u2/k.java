package u2;

import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.kk;
import org.telegram.ui.Components.ry;
import org.telegram.ui.fa;
public final class k implements l0, n2.l {
    public final Object f47344a;
    public a5.a f47345b;
    public n2.k f47346c;
    public final m d;

    public k(m mVar, Object obj) {
        this.d = mVar;
        this.f47345b = mVar.b(null);
        this.f47346c = new n2.k(mVar.d.f17059c, 0, null);
        this.f47344a = obj;
    }

    @Override
    public final void a(int i10, g0 g0Var, int i11) {
        if (l(i10, g0Var)) {
            this.f47346c.c(i11);
        }
    }

    @Override
    public final void b(int i10, g0 g0Var, Exception exc) {
        if (l(i10, g0Var)) {
            this.f47346c.d(exc);
        }
    }

    @Override
    public final void c(int i10, g0 g0Var, oa.d dVar) {
        if (l(i10, g0Var)) {
            this.f47346c.a(dVar);
        }
    }

    @Override
    public final void d(int i10, g0 g0Var, c0 c0Var) {
        if (l(i10, g0Var)) {
            a5.a aVar = this.f47345b;
            c0 m10 = m(c0Var, g0Var);
            g0 g0Var2 = (g0) aVar.f282c;
            g0Var2.getClass();
            aVar.l(new ry(aVar, g0Var2, m10, 12));
        }
    }

    @Override
    public final void e(int i10, g0 g0Var, c0 c0Var) {
        if (l(i10, g0Var)) {
            a5.a aVar = this.f47345b;
            c0 m10 = m(c0Var, g0Var);
            aVar.getClass();
            aVar.l(new org.telegram.ui.web.m(12, aVar, m10));
        }
    }

    @Override
    public final void f(int i10, g0 g0Var, u uVar, c0 c0Var) {
        if (l(i10, g0Var)) {
            a5.a aVar = this.f47345b;
            c0 m10 = m(c0Var, g0Var);
            aVar.getClass();
            aVar.l(new i0(aVar, uVar, m10, 0));
        }
    }

    @Override
    public final void g(int i10, g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z10) {
        if (l(i10, g0Var)) {
            a5.a aVar = this.f47345b;
            c0 m10 = m(c0Var, g0Var);
            aVar.getClass();
            aVar.l(new kk(aVar, uVar, m10, iOException, z10));
        }
    }

    @Override
    public final void h(int i10, g0 g0Var) {
        if (l(i10, g0Var)) {
            this.f47346c.e();
        }
    }

    @Override
    public final void i(int i10, g0 g0Var, u uVar, c0 c0Var, int i11) {
        if (l(i10, g0Var)) {
            a5.a aVar = this.f47345b;
            c0 m10 = m(c0Var, g0Var);
            aVar.getClass();
            aVar.l(new fa(aVar, uVar, m10, i11, 9));
        }
    }

    @Override
    public final void j(int i10, g0 g0Var) {
        if (l(i10, g0Var)) {
            this.f47346c.b();
        }
    }

    @Override
    public final void k(int i10, g0 g0Var, u uVar, c0 c0Var) {
        if (l(i10, g0Var)) {
            a5.a aVar = this.f47345b;
            c0 m10 = m(c0Var, g0Var);
            aVar.getClass();
            aVar.l(new i0(aVar, uVar, m10, 1));
        }
    }

    public final boolean l(int i10, g0 g0Var) {
        g0 g0Var2;
        Object obj = this.f47344a;
        m mVar = this.d;
        if (g0Var != null) {
            g0Var2 = mVar.u(obj, g0Var);
            if (g0Var2 == null) {
                return false;
            }
        } else {
            g0Var2 = null;
        }
        int w9 = mVar.w(i10, obj);
        a5.a aVar = this.f47345b;
        if (aVar.f281b != w9 || !Objects.equals((g0) aVar.f282c, g0Var2)) {
            this.f47345b = new a5.a((CopyOnWriteArrayList) mVar.f47256c.d, w9, g0Var2, 21);
        }
        n2.k kVar = this.f47346c;
        if (kVar.f17057a != w9 || !Objects.equals(kVar.f17058b, g0Var2)) {
            this.f47346c = new n2.k(mVar.d.f17059c, w9, g0Var2);
            return true;
        }
        return true;
    }

    public final c0 m(c0 c0Var, g0 g0Var) {
        long j10 = c0Var.f47278f;
        m mVar = this.d;
        Object obj = this.f47344a;
        long v = mVar.v(obj, j10);
        long j11 = c0Var.f47279g;
        long v10 = mVar.v(obj, j11);
        if (v == j10 && v10 == j11) {
            return c0Var;
        }
        return new c0(c0Var.f47275a, c0Var.f47276b, c0Var.f47277c, c0Var.d, c0Var.e, v, v10);
    }
}
