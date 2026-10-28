package u2;

import a8.ng;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.ok;
import org.telegram.ui.Components.qy;
import org.telegram.ui.bh1;
public final class j implements k0, n2.k {
    public final Object f49355a;
    public ng f49356b;
    public n2.j f49357c;
    public final l d;

    public j(l lVar, Object obj) {
        this.d = lVar;
        this.f49356b = lVar.b(null);
        this.f49357c = new n2.j(lVar.d.f18626c, 0, null);
        this.f49355a = obj;
    }

    @Override
    public final void a(int i10, g0 g0Var, int i11) {
        if (l(i10, g0Var)) {
            this.f49357c.c(i11);
        }
    }

    @Override
    public final void b(int i10, g0 g0Var, Exception exc) {
        if (l(i10, g0Var)) {
            this.f49357c.d(exc);
        }
    }

    @Override
    public final void c(int i10, g0 g0Var, c0 c0Var) {
        if (l(i10, g0Var)) {
            ng ngVar = this.f49356b;
            c0 m10 = m(c0Var, g0Var);
            g0 g0Var2 = (g0) ngVar.f640c;
            g0Var2.getClass();
            ngVar.k(new qy(ngVar, g0Var2, m10, 12));
        }
    }

    @Override
    public final void d(int i10, g0 g0Var, c0 c0Var) {
        if (l(i10, g0Var)) {
            ng ngVar = this.f49356b;
            c0 m10 = m(c0Var, g0Var);
            ngVar.getClass();
            ngVar.k(new bh1(17, ngVar, m10));
        }
    }

    @Override
    public final void e(int i10, g0 g0Var, u uVar, c0 c0Var) {
        if (l(i10, g0Var)) {
            ng ngVar = this.f49356b;
            c0 m10 = m(c0Var, g0Var);
            ngVar.getClass();
            ngVar.k(new i0(ngVar, uVar, m10, 0));
        }
    }

    @Override
    public final void f(int i10, g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z10) {
        if (l(i10, g0Var)) {
            ng ngVar = this.f49356b;
            c0 m10 = m(c0Var, g0Var);
            ngVar.getClass();
            ngVar.k(new ok(ngVar, uVar, m10, iOException, z10));
        }
    }

    @Override
    public final void g(int i10, g0 g0Var) {
        if (l(i10, g0Var)) {
            this.f49357c.e();
        }
    }

    @Override
    public final void h(int i10, g0 g0Var, u uVar, c0 c0Var, int i11) {
        if (l(i10, g0Var)) {
            ng ngVar = this.f49356b;
            c0 m10 = m(c0Var, g0Var);
            ngVar.getClass();
            ngVar.k(new ag.k0(ngVar, uVar, m10, i11, 10));
        }
    }

    @Override
    public final void i(int i10, g0 g0Var) {
        if (l(i10, g0Var)) {
            this.f49357c.b();
        }
    }

    @Override
    public final void j(int i10, g0 g0Var, u uVar, c0 c0Var) {
        if (l(i10, g0Var)) {
            ng ngVar = this.f49356b;
            c0 m10 = m(c0Var, g0Var);
            ngVar.getClass();
            ngVar.k(new i0(ngVar, uVar, m10, 1));
        }
    }

    @Override
    public final void k(int i10, g0 g0Var, pa.d dVar) {
        if (l(i10, g0Var)) {
            this.f49357c.a(dVar);
        }
    }

    public final boolean l(int i10, g0 g0Var) {
        g0 g0Var2;
        Object obj = this.f49355a;
        l lVar = this.d;
        if (g0Var != null) {
            g0Var2 = lVar.u(obj, g0Var);
            if (g0Var2 == null) {
                return false;
            }
        } else {
            g0Var2 = null;
        }
        int w10 = lVar.w(i10, obj);
        ng ngVar = this.f49356b;
        if (ngVar.f639b != w10 || !Objects.equals((g0) ngVar.f640c, g0Var2)) {
            this.f49356b = new ng((CopyOnWriteArrayList) lVar.f49276c.d, w10, g0Var2);
        }
        n2.j jVar = this.f49357c;
        if (jVar.f18624a != w10 || !Objects.equals(jVar.f18625b, g0Var2)) {
            this.f49357c = new n2.j(lVar.d.f18626c, w10, g0Var2);
            return true;
        }
        return true;
    }

    public final c0 m(c0 c0Var, g0 g0Var) {
        long j10 = c0Var.f49295f;
        l lVar = this.d;
        Object obj = this.f49355a;
        long v = lVar.v(obj, j10);
        long j11 = c0Var.f49296g;
        long v10 = lVar.v(obj, j11);
        if (v == j10 && v10 == j11) {
            return c0Var;
        }
        return new c0(c0Var.f49292a, c0Var.f49293b, c0Var.f49294c, c0Var.d, c0Var.e, v, v10);
    }
}
