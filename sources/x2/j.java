package x2;

import a8.xa;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.rm;
import org.telegram.ui.wc1;
import org.telegram.ui.zl;
public final class j implements k0, q2.k {
    public final Object f60111a;
    public xa f60112b;
    public q2.j f60113c;
    public final l d;

    public j(l lVar, Object obj) {
        this.d = lVar;
        this.f60112b = lVar.b(null);
        this.f60113c = new q2.j(lVar.d.f55761c, 0, null);
        this.f60111a = obj;
    }

    @Override
    public final void A(int i7, g0 g0Var, u uVar, c0 c0Var) {
        if (a(i7, g0Var)) {
            xa xaVar = this.f60112b;
            c0 d = d(c0Var, g0Var);
            xaVar.getClass();
            xaVar.i(new i0(xaVar, uVar, d, 1));
        }
    }

    @Override
    public final void C(int i7, g0 g0Var, c0 c0Var) {
        if (a(i7, g0Var)) {
            xa xaVar = this.f60112b;
            c0 d = d(c0Var, g0Var);
            g0 g0Var2 = (g0) xaVar.f714c;
            g0Var2.getClass();
            xaVar.i(new rm(xaVar, g0Var2, d, 17));
        }
    }

    @Override
    public final void G(int i7, g0 g0Var, u uVar, c0 c0Var) {
        if (a(i7, g0Var)) {
            xa xaVar = this.f60112b;
            c0 d = d(c0Var, g0Var);
            xaVar.getClass();
            xaVar.i(new i0(xaVar, uVar, d, 0));
        }
    }

    @Override
    public final void I(int i7, g0 g0Var, u uVar, c0 c0Var, int i10) {
        if (a(i7, g0Var)) {
            xa xaVar = this.f60112b;
            c0 d = d(c0Var, g0Var);
            xaVar.getClass();
            xaVar.i(new bg.g0(xaVar, uVar, d, i10, 11));
        }
    }

    @Override
    public final void K(int i7, g0 g0Var, Exception exc) {
        if (a(i7, g0Var)) {
            this.f60113c.d(exc);
        }
    }

    @Override
    public final void N(int i7, g0 g0Var, int i10) {
        if (a(i7, g0Var)) {
            this.f60113c.c(i10);
        }
    }

    public final boolean a(int i7, g0 g0Var) {
        g0 g0Var2;
        Object obj = this.f60111a;
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
        xa xaVar = this.f60112b;
        if (xaVar.f713b != w10 || !Objects.equals((g0) xaVar.f714c, g0Var2)) {
            this.f60112b = new xa((CopyOnWriteArrayList) lVar.f60025c.d, w10, g0Var2);
        }
        q2.j jVar = this.f60113c;
        if (jVar.f55759a != w10 || !Objects.equals(jVar.f55760b, g0Var2)) {
            this.f60113c = new q2.j(lVar.d.f55761c, w10, g0Var2);
            return true;
        }
        return true;
    }

    @Override
    public final void b(int i7, g0 g0Var, c0 c0Var) {
        if (a(i7, g0Var)) {
            xa xaVar = this.f60112b;
            c0 d = d(c0Var, g0Var);
            xaVar.getClass();
            xaVar.i(new wc1(27, xaVar, d));
        }
    }

    @Override
    public final void c(int i7, g0 g0Var, nb.a aVar) {
        if (a(i7, g0Var)) {
            this.f60113c.a(aVar);
        }
    }

    public final c0 d(c0 c0Var, g0 g0Var) {
        long j3 = c0Var.f60047f;
        l lVar = this.d;
        Object obj = this.f60111a;
        long v = lVar.v(obj, j3);
        long j10 = c0Var.f60048g;
        long v10 = lVar.v(obj, j10);
        if (v == j3 && v10 == j10) {
            return c0Var;
        }
        return new c0(c0Var.f60043a, c0Var.f60044b, c0Var.f60045c, c0Var.d, c0Var.f60046e, v, v10);
    }

    @Override
    public final void r(int i7, g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z10) {
        if (a(i7, g0Var)) {
            xa xaVar = this.f60112b;
            c0 d = d(c0Var, g0Var);
            xaVar.getClass();
            xaVar.i(new zl(xaVar, uVar, d, iOException, z10));
        }
    }

    @Override
    public final void w(int i7, g0 g0Var) {
        if (a(i7, g0Var)) {
            this.f60113c.b();
        }
    }

    @Override
    public final void z(int i7, g0 g0Var) {
        if (a(i7, g0Var)) {
            this.f60113c.e();
        }
    }
}
