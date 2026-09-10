package u2;

import bi.t8;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.ta0;
public final class k implements m0, n2.k {
    public final Object f42361a;
    public a5.a f42362b;
    public n2.j f42363c;
    public final m d;

    public k(m mVar, Object obj) {
        this.d = mVar;
        this.f42362b = mVar.b(null);
        this.f42363c = new n2.j(mVar.d.f13736c, 0, null);
        this.f42361a = obj;
    }

    @Override
    public final void a(int i10, g0 g0Var, int i11) {
        if (l(i10, g0Var)) {
            this.f42363c.c(i11);
        }
    }

    @Override
    public final void b(int i10, g0 g0Var, Exception exc) {
        if (l(i10, g0Var)) {
            this.f42363c.d(exc);
        }
    }

    @Override
    public final void c(int i10, g0 g0Var, c0 c0Var) {
        if (l(i10, g0Var)) {
            a5.a aVar = this.f42362b;
            c0 m10 = m(c0Var, g0Var);
            g0 g0Var2 = (g0) aVar.f276c;
            g0Var2.getClass();
            aVar.g(new t8(aVar, g0Var2, m10, 3));
        }
    }

    @Override
    public final void d(int i10, g0 g0Var, c0 c0Var) {
        if (l(i10, g0Var)) {
            a5.a aVar = this.f42362b;
            c0 m10 = m(c0Var, g0Var);
            aVar.getClass();
            aVar.g(new m4.q0(10, aVar, m10));
        }
    }

    @Override
    public final void e(int i10, g0 g0Var, u uVar, c0 c0Var) {
        if (l(i10, g0Var)) {
            a5.a aVar = this.f42362b;
            c0 m10 = m(c0Var, g0Var);
            aVar.getClass();
            aVar.g(new i0(aVar, uVar, m10, 0));
        }
    }

    @Override
    public final void f(int i10, g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z10) {
        if (l(i10, g0Var)) {
            a5.a aVar = this.f42362b;
            c0 m10 = m(c0Var, g0Var);
            aVar.getClass();
            aVar.g(new j0(aVar, uVar, m10, iOException, z10));
        }
    }

    @Override
    public final void g(int i10, g0 g0Var) {
        if (l(i10, g0Var)) {
            this.f42363c.e();
        }
    }

    @Override
    public final void h(int i10, g0 g0Var, u uVar, c0 c0Var, int i11) {
        if (l(i10, g0Var)) {
            a5.a aVar = this.f42362b;
            c0 m10 = m(c0Var, g0Var);
            aVar.getClass();
            aVar.g(new ta0(aVar, uVar, m10, i11, 1));
        }
    }

    @Override
    public final void i(int i10, g0 g0Var) {
        if (l(i10, g0Var)) {
            this.f42363c.b();
        }
    }

    @Override
    public final void j(int i10, g0 g0Var, u uVar, c0 c0Var) {
        if (l(i10, g0Var)) {
            a5.a aVar = this.f42362b;
            c0 m10 = m(c0Var, g0Var);
            aVar.getClass();
            aVar.g(new i0(aVar, uVar, m10, 1));
        }
    }

    @Override
    public final void k(int i10, g0 g0Var) {
        if (l(i10, g0Var)) {
            this.f42363c.a();
        }
    }

    public final boolean l(int i10, g0 g0Var) {
        g0 g0Var2;
        Object obj = this.f42361a;
        m mVar = this.d;
        if (g0Var != null) {
            g0Var2 = mVar.u(obj, g0Var);
            if (g0Var2 == null) {
                return false;
            }
        } else {
            g0Var2 = null;
        }
        int w10 = mVar.w(i10, obj);
        a5.a aVar = this.f42362b;
        if (aVar.f275b != w10 || !Objects.equals((g0) aVar.f276c, g0Var2)) {
            this.f42362b = new a5.a((CopyOnWriteArrayList) mVar.f42268c.d, w10, g0Var2, 20);
        }
        n2.j jVar = this.f42363c;
        if (jVar.f13734a != w10 || !Objects.equals(jVar.f13735b, g0Var2)) {
            this.f42363c = new n2.j(mVar.d.f13736c, w10, g0Var2);
            return true;
        }
        return true;
    }

    public final c0 m(c0 c0Var, g0 g0Var) {
        long j3 = c0Var.f42285f;
        m mVar = this.d;
        Object obj = this.f42361a;
        long v = mVar.v(obj, j3);
        long j10 = c0Var.f42286g;
        long v9 = mVar.v(obj, j10);
        if (v == j3 && v9 == j10) {
            return c0Var;
        }
        return new c0(c0Var.f42282a, c0Var.f42283b, c0Var.f42284c, c0Var.d, c0Var.e, v, v9);
    }
}
