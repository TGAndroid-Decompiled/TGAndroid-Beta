package x2;

import a8.wa;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.gr;
import org.telegram.ui.am;
public final class j implements j0, q2.k {
    public final Object f58380a;
    public wa f58381b;
    public q2.j f58382c;
    public final l d;

    public j(l lVar, Object obj) {
        this.d = lVar;
        this.f58381b = lVar.b(null);
        this.f58382c = new q2.j(lVar.d.f53750c, 0, null);
        this.f58380a = obj;
    }

    @Override
    public final void A(int i7, f0 f0Var, t tVar, b0 b0Var) {
        if (a(i7, f0Var)) {
            wa waVar = this.f58381b;
            b0 c10 = c(b0Var, f0Var);
            waVar.getClass();
            waVar.i(new h0(waVar, tVar, c10, 1));
        }
    }

    @Override
    public final void E(int i7, f0 f0Var, b0 b0Var) {
        if (a(i7, f0Var)) {
            wa waVar = this.f58381b;
            b0 c10 = c(b0Var, f0Var);
            f0 f0Var2 = (f0) waVar.f701c;
            f0Var2.getClass();
            waVar.i(new gr(waVar, f0Var2, c10, 16));
        }
    }

    @Override
    public final void G(int i7, f0 f0Var, t tVar, b0 b0Var) {
        if (a(i7, f0Var)) {
            wa waVar = this.f58381b;
            b0 c10 = c(b0Var, f0Var);
            waVar.getClass();
            waVar.i(new h0(waVar, tVar, c10, 0));
        }
    }

    @Override
    public final void I(int i7, f0 f0Var, t tVar, b0 b0Var, int i10) {
        if (a(i7, f0Var)) {
            wa waVar = this.f58381b;
            b0 c10 = c(b0Var, f0Var);
            waVar.getClass();
            waVar.i(new bg.f0(waVar, tVar, c10, i10, 11));
        }
    }

    @Override
    public final void K(int i7, f0 f0Var, Exception exc) {
        if (a(i7, f0Var)) {
            this.f58382c.d(exc);
        }
    }

    @Override
    public final void N(int i7, f0 f0Var, int i10) {
        if (a(i7, f0Var)) {
            this.f58382c.c(i10);
        }
    }

    public final boolean a(int i7, f0 f0Var) {
        f0 f0Var2;
        Object obj = this.f58380a;
        l lVar = this.d;
        if (f0Var != null) {
            f0Var2 = lVar.u(obj, f0Var);
            if (f0Var2 == null) {
                return false;
            }
        } else {
            f0Var2 = null;
        }
        int w10 = lVar.w(i7, obj);
        wa waVar = this.f58381b;
        if (waVar.f700b != w10 || !Objects.equals((f0) waVar.f701c, f0Var2)) {
            this.f58381b = new wa((CopyOnWriteArrayList) lVar.f58280c.d, w10, f0Var2);
        }
        q2.j jVar = this.f58382c;
        if (jVar.f53748a != w10 || !Objects.equals(jVar.f53749b, f0Var2)) {
            this.f58382c = new q2.j(lVar.d.f53750c, w10, f0Var2);
            return true;
        }
        return true;
    }

    @Override
    public final void b(int i7, f0 f0Var, qb.a aVar) {
        if (a(i7, f0Var)) {
            this.f58382c.a(aVar);
        }
    }

    public final b0 c(b0 b0Var, f0 f0Var) {
        long j3 = b0Var.f58319f;
        l lVar = this.d;
        Object obj = this.f58380a;
        long v = lVar.v(obj, j3);
        long j10 = b0Var.f58320g;
        long v10 = lVar.v(obj, j10);
        if (v == j3 && v10 == j10) {
            return b0Var;
        }
        return new b0(b0Var.f58315a, b0Var.f58316b, b0Var.f58317c, b0Var.d, b0Var.f58318e, v, v10);
    }

    @Override
    public final void d(int i7, f0 f0Var, b0 b0Var) {
        if (a(i7, f0Var)) {
            wa waVar = this.f58381b;
            b0 c10 = c(b0Var, f0Var);
            waVar.getClass();
            waVar.i(new org.telegram.ui.web.a0(24, waVar, c10));
        }
    }

    @Override
    public final void r(int i7, f0 f0Var, t tVar, b0 b0Var, IOException iOException, boolean z9) {
        if (a(i7, f0Var)) {
            wa waVar = this.f58381b;
            b0 c10 = c(b0Var, f0Var);
            waVar.getClass();
            waVar.i(new am(waVar, tVar, c10, iOException, z9));
        }
    }

    @Override
    public final void w(int i7, f0 f0Var) {
        if (a(i7, f0Var)) {
            this.f58382c.b();
        }
    }

    @Override
    public final void z(int i7, f0 f0Var) {
        if (a(i7, f0Var)) {
            this.f58382c.e();
        }
    }
}
