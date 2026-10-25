package u2;

import a8.ng;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.nk;
import org.telegram.ui.Components.qy;
import org.telegram.ui.zg1;
public final class j implements k0, n2.k {
    public final Object f49317a;
    public ng f49318b;
    public n2.j f49319c;
    public final l d;

    public j(l lVar, Object obj) {
        this.d = lVar;
        this.f49318b = lVar.b(null);
        this.f49319c = new n2.j(lVar.d.f18627c, 0, null);
        this.f49317a = obj;
    }

    @Override
    public final void a(int i10, g0 g0Var, int i11) {
        if (l(i10, g0Var)) {
            this.f49319c.c(i11);
        }
    }

    @Override
    public final void b(int i10, g0 g0Var, Exception exc) {
        if (l(i10, g0Var)) {
            this.f49319c.d(exc);
        }
    }

    @Override
    public final void c(int i10, g0 g0Var, c0 c0Var) {
        if (l(i10, g0Var)) {
            ng ngVar = this.f49318b;
            c0 m10 = m(c0Var, g0Var);
            g0 g0Var2 = (g0) ngVar.f640c;
            g0Var2.getClass();
            ngVar.k(new qy(ngVar, g0Var2, m10, 12));
        }
    }

    @Override
    public final void d(int i10, g0 g0Var, c0 c0Var) {
        if (l(i10, g0Var)) {
            ng ngVar = this.f49318b;
            c0 m10 = m(c0Var, g0Var);
            ngVar.getClass();
            ngVar.k(new zg1(17, ngVar, m10));
        }
    }

    @Override
    public final void e(int i10, g0 g0Var, u uVar, c0 c0Var) {
        if (l(i10, g0Var)) {
            ng ngVar = this.f49318b;
            c0 m10 = m(c0Var, g0Var);
            ngVar.getClass();
            ngVar.k(new i0(ngVar, uVar, m10, 0));
        }
    }

    @Override
    public final void f(int i10, g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z10) {
        if (l(i10, g0Var)) {
            ng ngVar = this.f49318b;
            c0 m10 = m(c0Var, g0Var);
            ngVar.getClass();
            ngVar.k(new nk(ngVar, uVar, m10, iOException, z10));
        }
    }

    @Override
    public final void g(int i10, g0 g0Var) {
        if (l(i10, g0Var)) {
            this.f49319c.e();
        }
    }

    @Override
    public final void h(int i10, g0 g0Var, u uVar, c0 c0Var, int i11) {
        if (l(i10, g0Var)) {
            ng ngVar = this.f49318b;
            c0 m10 = m(c0Var, g0Var);
            ngVar.getClass();
            ngVar.k(new ag.k0(ngVar, uVar, m10, i11, 10));
        }
    }

    @Override
    public final void i(int i10, g0 g0Var) {
        if (l(i10, g0Var)) {
            this.f49319c.b();
        }
    }

    @Override
    public final void j(int i10, g0 g0Var, u uVar, c0 c0Var) {
        if (l(i10, g0Var)) {
            ng ngVar = this.f49318b;
            c0 m10 = m(c0Var, g0Var);
            ngVar.getClass();
            ngVar.k(new i0(ngVar, uVar, m10, 1));
        }
    }

    @Override
    public final void k(int i10, g0 g0Var, pa.d dVar) {
        if (l(i10, g0Var)) {
            this.f49319c.a(dVar);
        }
    }

    public final boolean l(int i10, g0 g0Var) {
        g0 g0Var2;
        Object obj = this.f49317a;
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
        ng ngVar = this.f49318b;
        if (ngVar.f639b != w10 || !Objects.equals((g0) ngVar.f640c, g0Var2)) {
            this.f49318b = new ng((CopyOnWriteArrayList) lVar.f49238c.d, w10, g0Var2);
        }
        n2.j jVar = this.f49319c;
        if (jVar.f18625a != w10 || !Objects.equals(jVar.f18626b, g0Var2)) {
            this.f49319c = new n2.j(lVar.d.f18627c, w10, g0Var2);
            return true;
        }
        return true;
    }

    public final c0 m(c0 c0Var, g0 g0Var) {
        long j10 = c0Var.f49257f;
        l lVar = this.d;
        Object obj = this.f49317a;
        long v = lVar.v(obj, j10);
        long j11 = c0Var.f49258g;
        long v10 = lVar.v(obj, j11);
        if (v == j10 && v10 == j11) {
            return c0Var;
        }
        return new c0(c0Var.f49254a, c0Var.f49255b, c0Var.f49256c, c0Var.d, c0Var.e, v, v10);
    }
}
