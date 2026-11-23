package x2;

import a8.xa;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.rm;
import org.telegram.ui.uc1;
import org.telegram.ui.zl;
public final class j implements k0, q2.k {
    public final Object f60240a;
    public xa f60241b;
    public q2.j f60242c;
    public final l d;

    public j(l lVar, Object obj) {
        this.d = lVar;
        this.f60241b = lVar.b(null);
        this.f60242c = new q2.j(lVar.d.f55884c, 0, null);
        this.f60240a = obj;
    }

    @Override
    public final void A(int i7, g0 g0Var, u uVar, c0 c0Var) {
        if (a(i7, g0Var)) {
            xa xaVar = this.f60241b;
            c0 b10 = b(c0Var, g0Var);
            xaVar.getClass();
            xaVar.g(new i0(xaVar, uVar, b10, 1));
        }
    }

    @Override
    public final void C(int i7, g0 g0Var, c0 c0Var) {
        if (a(i7, g0Var)) {
            xa xaVar = this.f60241b;
            c0 b10 = b(c0Var, g0Var);
            g0 g0Var2 = (g0) xaVar.f714c;
            g0Var2.getClass();
            xaVar.g(new rm(xaVar, g0Var2, b10, 17));
        }
    }

    @Override
    public final void G(int i7, g0 g0Var, u uVar, c0 c0Var) {
        if (a(i7, g0Var)) {
            xa xaVar = this.f60241b;
            c0 b10 = b(c0Var, g0Var);
            xaVar.getClass();
            xaVar.g(new i0(xaVar, uVar, b10, 0));
        }
    }

    @Override
    public final void I(int i7, g0 g0Var, u uVar, c0 c0Var, int i10) {
        if (a(i7, g0Var)) {
            xa xaVar = this.f60241b;
            c0 b10 = b(c0Var, g0Var);
            xaVar.getClass();
            xaVar.g(new bg.g0(xaVar, uVar, b10, i10, 11));
        }
    }

    @Override
    public final void K(int i7, g0 g0Var, Exception exc) {
        if (a(i7, g0Var)) {
            this.f60242c.d(exc);
        }
    }

    @Override
    public final void N(int i7, g0 g0Var, int i10) {
        if (a(i7, g0Var)) {
            this.f60242c.c(i10);
        }
    }

    public final boolean a(int i7, g0 g0Var) {
        g0 g0Var2;
        Object obj = this.f60240a;
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
        xa xaVar = this.f60241b;
        if (xaVar.f713b != w10 || !Objects.equals((g0) xaVar.f714c, g0Var2)) {
            this.f60241b = new xa((CopyOnWriteArrayList) lVar.f60154c.d, w10, g0Var2);
        }
        q2.j jVar = this.f60242c;
        if (jVar.f55882a != w10 || !Objects.equals(jVar.f55883b, g0Var2)) {
            this.f60242c = new q2.j(lVar.d.f55884c, w10, g0Var2);
            return true;
        }
        return true;
    }

    public final c0 b(c0 c0Var, g0 g0Var) {
        long j3 = c0Var.f60176f;
        l lVar = this.d;
        Object obj = this.f60240a;
        long v = lVar.v(obj, j3);
        long j10 = c0Var.f60177g;
        long v10 = lVar.v(obj, j10);
        if (v == j3 && v10 == j10) {
            return c0Var;
        }
        return new c0(c0Var.f60172a, c0Var.f60173b, c0Var.f60174c, c0Var.d, c0Var.f60175e, v, v10);
    }

    @Override
    public final void i(int i7, g0 g0Var, c0 c0Var) {
        if (a(i7, g0Var)) {
            xa xaVar = this.f60241b;
            c0 b10 = b(c0Var, g0Var);
            xaVar.getClass();
            xaVar.g(new uc1(27, xaVar, b10));
        }
    }

    @Override
    public final void l(int i7, g0 g0Var, nb.a aVar) {
        if (a(i7, g0Var)) {
            this.f60242c.a(aVar);
        }
    }

    @Override
    public final void r(int i7, g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z10) {
        if (a(i7, g0Var)) {
            xa xaVar = this.f60241b;
            c0 b10 = b(c0Var, g0Var);
            xaVar.getClass();
            xaVar.g(new zl(xaVar, uVar, b10, iOException, z10));
        }
    }

    @Override
    public final void w(int i7, g0 g0Var) {
        if (a(i7, g0Var)) {
            this.f60242c.b();
        }
    }

    @Override
    public final void z(int i7, g0 g0Var) {
        if (a(i7, g0Var)) {
            this.f60242c.e();
        }
    }
}
