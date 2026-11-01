package u2;

import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.tm;
public final class j implements k0, n2.k {
    public final Object f49912a;
    public a5.a f49913b;
    public n2.j f49914c;
    public final l d;

    public j(l lVar, Object obj) {
        this.d = lVar;
        this.f49913b = lVar.b(null);
        this.f49914c = new n2.j(lVar.d.f13464c, 0, null);
        this.f49912a = obj;
    }

    @Override
    public final void B(int i10, g0 g0Var, u uVar, c0 c0Var, IOException iOException, boolean z10) {
        if (a(i10, g0Var)) {
            a5.a aVar = this.f49913b;
            c0 c10 = c(c0Var, g0Var);
            aVar.getClass();
            aVar.k(new tm(aVar, uVar, c10, iOException, z10));
        }
    }

    @Override
    public final void E(int i10, g0 g0Var) {
        if (a(i10, g0Var)) {
            this.f49914c.e();
        }
    }

    @Override
    public final void G(int i10, g0 g0Var, u uVar, c0 c0Var, int i11) {
        if (a(i10, g0Var)) {
            a5.a aVar = this.f49913b;
            c0 c10 = c(c0Var, g0Var);
            aVar.getClass();
            aVar.k(new mg.i0(aVar, uVar, c10, i11, 11));
        }
    }

    @Override
    public final void J(int i10, g0 g0Var) {
        if (a(i10, g0Var)) {
            this.f49914c.b();
        }
    }

    @Override
    public final void L(int i10, g0 g0Var, u uVar, c0 c0Var) {
        if (a(i10, g0Var)) {
            a5.a aVar = this.f49913b;
            c0 c10 = c(c0Var, g0Var);
            aVar.getClass();
            aVar.k(new i0(aVar, uVar, c10, 1));
        }
    }

    public final boolean a(int i10, g0 g0Var) {
        g0 g0Var2;
        Object obj = this.f49912a;
        l lVar = this.d;
        if (g0Var != null) {
            g0Var2 = lVar.u(obj, g0Var);
            if (g0Var2 == null) {
                return false;
            }
        } else {
            g0Var2 = null;
        }
        int w9 = lVar.w(i10, obj);
        a5.a aVar = this.f49913b;
        if (aVar.f281b != w9 || !Objects.equals((g0) aVar.f282c, g0Var2)) {
            this.f49913b = new a5.a((CopyOnWriteArrayList) lVar.f49833c.d, w9, g0Var2, 22);
        }
        n2.j jVar = this.f49914c;
        if (jVar.f13462a != w9 || !Objects.equals(jVar.f13463b, g0Var2)) {
            this.f49914c = new n2.j(lVar.d.f13464c, w9, g0Var2);
            return true;
        }
        return true;
    }

    @Override
    public final void b(int i10, g0 g0Var, int i11) {
        if (a(i10, g0Var)) {
            this.f49914c.c(i11);
        }
    }

    public final c0 c(c0 c0Var, g0 g0Var) {
        long j10 = c0Var.f49852f;
        l lVar = this.d;
        Object obj = this.f49912a;
        long v = lVar.v(obj, j10);
        long j11 = c0Var.f49853g;
        long v10 = lVar.v(obj, j11);
        if (v == j10 && v10 == j11) {
            return c0Var;
        }
        return new c0(c0Var.f49849a, c0Var.f49850b, c0Var.f49851c, c0Var.d, c0Var.e, v, v10);
    }

    @Override
    public final void j(int i10, g0 g0Var, Exception exc) {
        if (a(i10, g0Var)) {
            this.f49914c.d(exc);
        }
    }

    @Override
    public final void l(int i10, g0 g0Var, oa.d dVar) {
        if (a(i10, g0Var)) {
            this.f49914c.a(dVar);
        }
    }

    @Override
    public final void n(int i10, g0 g0Var, c0 c0Var) {
        if (a(i10, g0Var)) {
            a5.a aVar = this.f49913b;
            c0 c10 = c(c0Var, g0Var);
            g0 g0Var2 = (g0) aVar.f282c;
            g0Var2.getClass();
            aVar.k(new q5.a(aVar, g0Var2, c10, 7));
        }
    }

    @Override
    public final void r(int i10, g0 g0Var, c0 c0Var) {
        if (a(i10, g0Var)) {
            a5.a aVar = this.f49913b;
            c0 c10 = c(c0Var, g0Var);
            aVar.getClass();
            aVar.k(new org.telegram.ui.web.k0(22, aVar, c10));
        }
    }

    @Override
    public final void t(int i10, g0 g0Var, u uVar, c0 c0Var) {
        if (a(i10, g0Var)) {
            a5.a aVar = this.f49913b;
            c0 c10 = c(c0Var, g0Var);
            aVar.getClass();
            aVar.k(new i0(aVar, uVar, c10, 0));
        }
    }
}
