package u2;

import bi.t2;
import di.s7;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.ua0;
public final class j implements k0, n2.k {
    public final Object f46735a;
    public a5.a f46736b;
    public n2.j f46737c;
    public final l d;

    public j(l lVar, Object obj) {
        this.d = lVar;
        this.f46736b = lVar.b(null);
        this.f46737c = new n2.j(lVar.d.f16429c, 0, null);
        this.f46735a = obj;
    }

    @Override
    public final void a(int i10, f0 f0Var, int i11) {
        if (l(i10, f0Var)) {
            this.f46737c.c(i11);
        }
    }

    @Override
    public final void b(int i10, f0 f0Var, Exception exc) {
        if (l(i10, f0Var)) {
            this.f46737c.d(exc);
        }
    }

    @Override
    public final void c(int i10, f0 f0Var, b0 b0Var) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f46736b;
            b0 m10 = m(b0Var, f0Var);
            f0 f0Var2 = (f0) aVar.f298c;
            f0Var2.getClass();
            aVar.i(new s7(aVar, f0Var2, m10, 3));
        }
    }

    @Override
    public final void d(int i10, f0 f0Var, b0 b0Var) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f46736b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.i(new t2(11, aVar, m10));
        }
    }

    @Override
    public final void e(int i10, f0 f0Var, t tVar, b0 b0Var) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f46736b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.i(new h0(aVar, tVar, m10, 0));
        }
    }

    @Override
    public final void f(int i10, f0 f0Var, t tVar, b0 b0Var, IOException iOException, boolean z10) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f46736b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.i(new i0(aVar, tVar, m10, iOException, z10));
        }
    }

    @Override
    public final void g(int i10, f0 f0Var) {
        if (l(i10, f0Var)) {
            this.f46737c.e();
        }
    }

    @Override
    public final void h(int i10, f0 f0Var, t tVar, b0 b0Var, int i11) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f46736b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.i(new ua0(aVar, tVar, m10, i11, 1));
        }
    }

    @Override
    public final void i(int i10, f0 f0Var) {
        if (l(i10, f0Var)) {
            this.f46737c.b();
        }
    }

    @Override
    public final void j(int i10, f0 f0Var, t tVar, b0 b0Var) {
        if (l(i10, f0Var)) {
            a5.a aVar = this.f46736b;
            b0 m10 = m(b0Var, f0Var);
            aVar.getClass();
            aVar.i(new h0(aVar, tVar, m10, 1));
        }
    }

    @Override
    public final void k(int i10, f0 f0Var) {
        if (l(i10, f0Var)) {
            this.f46737c.a();
        }
    }

    public final boolean l(int i10, f0 f0Var) {
        f0 f0Var2;
        Object obj = this.f46735a;
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
        a5.a aVar = this.f46736b;
        if (aVar.f297b != w10 || !Objects.equals((f0) aVar.f298c, f0Var2)) {
            this.f46736b = new a5.a((CopyOnWriteArrayList) lVar.f46634c.d, w10, f0Var2, 20);
        }
        n2.j jVar = this.f46737c;
        if (jVar.f16427a != w10 || !Objects.equals(jVar.f16428b, f0Var2)) {
            this.f46737c = new n2.j(lVar.d.f16429c, w10, f0Var2);
            return true;
        }
        return true;
    }

    public final b0 m(b0 b0Var, f0 f0Var) {
        long j3 = b0Var.f46673f;
        l lVar = this.d;
        Object obj = this.f46735a;
        long v = lVar.v(obj, j3);
        long j10 = b0Var.f46674g;
        long v9 = lVar.v(obj, j10);
        if (v == j3 && v9 == j10) {
            return b0Var;
        }
        return new b0(b0Var.f46669a, b0Var.f46670b, b0Var.f46671c, b0Var.d, b0Var.f46672e, v, v9);
    }
}
