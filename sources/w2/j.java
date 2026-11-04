package w2;

import b8.kg;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.hr;
import org.telegram.ui.na1;
import org.telegram.ui.ul;
public final class j implements k0, p2.k {
    public final Object f57105a;
    public kg f57106b;
    public p2.j f57107c;
    public final l d;

    public j(l lVar, Object obj) {
        this.d = lVar;
        this.f57106b = lVar.b(null);
        this.f57107c = new p2.j(lVar.d.f53117c, 0, null);
        this.f57105a = obj;
    }

    @Override
    public final void A(int i3, g0 g0Var, Exception exc) {
        if (a(i3, g0Var)) {
            this.f57107c.d(exc);
        }
    }

    @Override
    public final void D(int i3, g0 g0Var, c0 c0Var) {
        if (a(i3, g0Var)) {
            kg kgVar = this.f57106b;
            c0 c2 = c(c0Var, g0Var);
            g0 g0Var2 = (g0) kgVar.f2723c;
            g0Var2.getClass();
            kgVar.j(new hr(kgVar, g0Var2, c2, 13));
        }
    }

    @Override
    public final void I(int i3, g0 g0Var) {
        if (a(i3, g0Var)) {
            this.f57107c.b();
        }
    }

    @Override
    public final void K(int i3, g0 g0Var, u uVar, c0 c0Var, int i10) {
        if (a(i3, g0Var)) {
            kg kgVar = this.f57106b;
            c0 c2 = c(c0Var, g0Var);
            kgVar.getClass();
            kgVar.j(new cg.e0(kgVar, uVar, c2, i10, 10));
        }
    }

    @Override
    public final void M(int i3, g0 g0Var, int i10) {
        if (a(i3, g0Var)) {
            this.f57107c.c(i10);
        }
    }

    public final boolean a(int i3, g0 g0Var) {
        g0 g0Var2;
        Object obj = this.f57105a;
        l lVar = this.d;
        if (g0Var != null) {
            g0Var2 = lVar.u(obj, g0Var);
            if (g0Var2 == null) {
                return false;
            }
        } else {
            g0Var2 = null;
        }
        int w10 = lVar.w(i3, obj);
        kg kgVar = this.f57106b;
        if (kgVar.f2722b != w10 || !Objects.equals((g0) kgVar.f2723c, g0Var2)) {
            this.f57106b = new kg((CopyOnWriteArrayList) lVar.f57019c.d, w10, g0Var2);
        }
        p2.j jVar = this.f57107c;
        if (jVar.f53115a != w10 || !Objects.equals(jVar.f53116b, g0Var2)) {
            this.f57107c = new p2.j(lVar.d.f53117c, w10, g0Var2);
            return true;
        }
        return true;
    }

    @Override
    public final void b(int i3, g0 g0Var) {
        if (a(i3, g0Var)) {
            this.f57107c.e();
        }
    }

    public final c0 c(c0 c0Var, g0 g0Var) {
        long j10 = c0Var.f57041f;
        l lVar = this.d;
        Object obj = this.f57105a;
        long v = lVar.v(obj, j10);
        long j11 = c0Var.f57042g;
        long v10 = lVar.v(obj, j11);
        if (v == j10 && v10 == j11) {
            return c0Var;
        }
        return new c0(c0Var.f57037a, c0Var.f57038b, c0Var.f57039c, c0Var.d, c0Var.f57040e, v, v10);
    }

    @Override
    public final void d(int i3, g0 g0Var, c0 c0Var) {
        if (a(i3, g0Var)) {
            kg kgVar = this.f57106b;
            c0 c2 = c(c0Var, g0Var);
            kgVar.getClass();
            kgVar.j(new na1(20, kgVar, c2));
        }
    }

    @Override
    public final void j(int i3, g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z10) {
        if (a(i3, g0Var)) {
            kg kgVar = this.f57106b;
            c0 c2 = c(c0Var, g0Var);
            kgVar.getClass();
            kgVar.j(new ul(kgVar, uVar, c2, iOException, z10));
        }
    }

    @Override
    public final void t(int i3, g0 g0Var, u uVar, c0 c0Var) {
        if (a(i3, g0Var)) {
            kg kgVar = this.f57106b;
            c0 c2 = c(c0Var, g0Var);
            kgVar.getClass();
            kgVar.j(new i0(kgVar, uVar, c2, 0));
        }
    }

    @Override
    public final void x(int i3, g0 g0Var, v7.s sVar) {
        if (a(i3, g0Var)) {
            this.f57107c.a(sVar);
        }
    }

    @Override
    public final void z(int i3, g0 g0Var, u uVar, c0 c0Var) {
        if (a(i3, g0Var)) {
            kg kgVar = this.f57106b;
            c0 c2 = c(c0Var, g0Var);
            kgVar.getClass();
            kgVar.j(new i0(kgVar, uVar, c2, 1));
        }
    }
}
