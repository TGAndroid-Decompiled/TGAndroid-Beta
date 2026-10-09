package u2;

import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.mk;
import org.telegram.ui.Components.rz;
import org.telegram.ui.ea;
import qg.x1;
public final class j implements j0, n2.k {
    public final Object f48608a;
    public a5.a f48609b;
    public n2.j f48610c;
    public final l d;

    public j(l lVar, Object obj) {
        this.d = lVar;
        this.f48609b = lVar.b(null);
        this.f48610c = new n2.j(lVar.d.f16520c, 0, null);
        this.f48608a = obj;
    }

    @Override
    public final void a(int i10, f0 f0Var, int i11) {
        if (l(i10, f0Var)) {
            this.f48610c.c(i11);
        }
    }

    @Override
    public final void b(int i10, f0 f0Var, Exception exc) {
        if (l(i10, f0Var)) {
            this.f48610c.d(exc);
        }
    }

    @Override
    public final void c(int i10, f0 f0Var, b0 b0Var) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f48609b;
            b0 m10 = m(b0Var, f0Var);
            f0 f0Var2 = (f0) aVar.f300c;
            f0Var2.getClass();
            aVar.k(new rz(aVar, f0Var2, m10, 11));
        }
    }

    @Override
    public final void d(int i10, f0 f0Var, b0 b0Var) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f48609b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.k(new x1(11, aVar, m10));
        }
    }

    @Override
    public final void e(int i10, f0 f0Var, t tVar, b0 b0Var) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f48609b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.k(new h0(aVar, tVar, m10, 0));
        }
    }

    @Override
    public final void f(int i10, f0 f0Var, t tVar, b0 b0Var, IOException iOException, boolean z10) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f48609b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.k(new mk(aVar, tVar, m10, iOException, z10));
        }
    }

    @Override
    public final void g(int i10, f0 f0Var) {
        if (l(i10, f0Var)) {
            this.f48610c.e();
        }
    }

    @Override
    public final void h(int i10, f0 f0Var, t tVar, b0 b0Var, int i11) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f48609b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.k(new ea(aVar, tVar, m10, i11, 10));
        }
    }

    @Override
    public final void i(int i10, f0 f0Var) {
        if (l(i10, f0Var)) {
            this.f48610c.b();
        }
    }

    @Override
    public final void j(int i10, f0 f0Var, t tVar, b0 b0Var) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f48609b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.k(new h0(aVar, tVar, m10, 1));
        }
    }

    @Override
    public final void k(int i10, f0 f0Var) {
        if (l(i10, f0Var)) {
            this.f48610c.a();
        }
    }

    public final boolean l(int i10, f0 f0Var) {
        f0 f0Var2;
        Object obj = this.f48608a;
        l lVar = this.d;
        if (f0Var != null) {
            f0Var2 = lVar.u(obj, f0Var);
            if (f0Var2 == null) {
                return false;
            }
        } else {
            f0Var2 = null;
        }
        int w10 = lVar.w(i10, obj);
        a5.a aVar = this.f48609b;
        if (aVar.f299b != w10 || !Objects.equals((f0) aVar.f300c, f0Var2)) {
            this.f48609b = new a5.a((CopyOnWriteArrayList) lVar.f48509c.d, w10, f0Var2, 21);
        }
        n2.j jVar = this.f48610c;
        if (jVar.f16518a != w10 || !Objects.equals(jVar.f16519b, f0Var2)) {
            this.f48610c = new n2.j(lVar.d.f16520c, w10, f0Var2);
            return true;
        }
        return true;
    }

    public final b0 m(b0 b0Var, f0 f0Var) {
        long j3 = b0Var.f48548f;
        l lVar = this.d;
        Object obj = this.f48608a;
        long v = lVar.v(obj, j3);
        long j10 = b0Var.f48549g;
        long v9 = lVar.v(obj, j10);
        if (v == j3 && v9 == j10) {
            return b0Var;
        }
        return new b0(b0Var.f48544a, b0Var.f48545b, b0Var.f48546c, b0Var.d, b0Var.f48547e, v, v9);
    }
}
