package x2;

import a8.wa;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.hr;
import org.telegram.ui.yl;
public final class j implements k0, q2.k {
    public final Object f58363a;
    public wa f58364b;
    public q2.j f58365c;
    public final l d;

    public j(l lVar, Object obj) {
        this.d = lVar;
        this.f58364b = lVar.b(null);
        this.f58365c = new q2.j(lVar.d.f53739c, 0, null);
        this.f58363a = obj;
    }

    @Override
    public final void A(int i7, g0 g0Var, u uVar, c0 c0Var) {
        if (a(i7, g0Var)) {
            wa waVar = this.f58364b;
            c0 c10 = c(c0Var, g0Var);
            waVar.getClass();
            waVar.i(new i0(waVar, uVar, c10, 1));
        }
    }

    @Override
    public final void E(int i7, g0 g0Var, c0 c0Var) {
        if (a(i7, g0Var)) {
            wa waVar = this.f58364b;
            c0 c10 = c(c0Var, g0Var);
            g0 g0Var2 = (g0) waVar.f701c;
            g0Var2.getClass();
            waVar.i(new hr(waVar, g0Var2, c10, 16));
        }
    }

    @Override
    public final void G(int i7, g0 g0Var, u uVar, c0 c0Var) {
        if (a(i7, g0Var)) {
            wa waVar = this.f58364b;
            c0 c10 = c(c0Var, g0Var);
            waVar.getClass();
            waVar.i(new i0(waVar, uVar, c10, 0));
        }
    }

    @Override
    public final void I(int i7, g0 g0Var, u uVar, c0 c0Var, int i10) {
        if (a(i7, g0Var)) {
            wa waVar = this.f58364b;
            c0 c10 = c(c0Var, g0Var);
            waVar.getClass();
            waVar.i(new bg.f0(waVar, uVar, c10, i10, 11));
        }
    }

    @Override
    public final void K(int i7, g0 g0Var, Exception exc) {
        if (a(i7, g0Var)) {
            this.f58365c.d(exc);
        }
    }

    @Override
    public final void N(int i7, g0 g0Var, int i10) {
        if (a(i7, g0Var)) {
            this.f58365c.c(i10);
        }
    }

    public final boolean a(int i7, g0 g0Var) {
        g0 g0Var2;
        Object obj = this.f58363a;
        l lVar = this.d;
        if (g0Var != null) {
            g0Var2 = lVar.u(obj, g0Var);
            if (g0Var2 == null) {
                return false;
            }
        } else {
            g0Var2 = null;
        }
        int w10 = lVar.w(i7, obj);
        wa waVar = this.f58364b;
        if (waVar.f700b != w10 || !Objects.equals((g0) waVar.f701c, g0Var2)) {
            this.f58364b = new wa((CopyOnWriteArrayList) lVar.f58267c.d, w10, g0Var2);
        }
        q2.j jVar = this.f58365c;
        if (jVar.f53737a != w10 || !Objects.equals(jVar.f53738b, g0Var2)) {
            this.f58365c = new q2.j(lVar.d.f53739c, w10, g0Var2);
            return true;
        }
        return true;
    }

    @Override
    public final void b(int i7, g0 g0Var, qb.a aVar) {
        if (a(i7, g0Var)) {
            this.f58365c.a(aVar);
        }
    }

    public final c0 c(c0 c0Var, g0 g0Var) {
        long j3 = c0Var.f58310f;
        l lVar = this.d;
        Object obj = this.f58363a;
        long v = lVar.v(obj, j3);
        long j10 = c0Var.f58311g;
        long v10 = lVar.v(obj, j10);
        if (v == j3 && v10 == j10) {
            return c0Var;
        }
        return new c0(c0Var.f58306a, c0Var.f58307b, c0Var.f58308c, c0Var.d, c0Var.f58309e, v, v10);
    }

    @Override
    public final void d(int i7, g0 g0Var, c0 c0Var) {
        if (a(i7, g0Var)) {
            wa waVar = this.f58364b;
            c0 c10 = c(c0Var, g0Var);
            waVar.getClass();
            waVar.i(new org.telegram.ui.web.a0(24, waVar, c10));
        }
    }

    @Override
    public final void r(int i7, g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z9) {
        if (a(i7, g0Var)) {
            wa waVar = this.f58364b;
            c0 c10 = c(c0Var, g0Var);
            waVar.getClass();
            waVar.i(new yl(waVar, uVar, c10, iOException, z9));
        }
    }

    @Override
    public final void w(int i7, g0 g0Var) {
        if (a(i7, g0Var)) {
            this.f58365c.b();
        }
    }

    @Override
    public final void z(int i7, g0 g0Var) {
        if (a(i7, g0Var)) {
            this.f58365c.e();
        }
    }
}
