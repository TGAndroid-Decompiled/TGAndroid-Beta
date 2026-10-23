package u2;

import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.kk;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Wallet.e8;
import org.telegram.ui.fa;
public final class k implements m0, n2.l {
    public final Object f47790a;
    public a5.a f47791b;
    public n2.k f47792c;
    public final m d;

    public k(m mVar, Object obj) {
        this.d = mVar;
        this.f47791b = mVar.b(null);
        this.f47792c = new n2.k(mVar.d.f17122c, 0, null);
        this.f47790a = obj;
    }

    @Override
    public final void a(int i10, h0 h0Var, int i11) {
        if (l(i10, h0Var)) {
            this.f47792c.c(i11);
        }
    }

    @Override
    public final void b(int i10, h0 h0Var, Exception exc) {
        if (l(i10, h0Var)) {
            this.f47792c.d(exc);
        }
    }

    @Override
    public final void c(int i10, h0 h0Var, oa.d dVar) {
        if (l(i10, h0Var)) {
            this.f47792c.a(dVar);
        }
    }

    @Override
    public final void d(int i10, h0 h0Var, d0 d0Var) {
        if (l(i10, h0Var)) {
            a5.a aVar = this.f47791b;
            d0 m10 = m(d0Var, h0Var);
            h0 h0Var2 = (h0) aVar.f282c;
            h0Var2.getClass();
            aVar.l(new ry(aVar, h0Var2, m10, 12));
        }
    }

    @Override
    public final void e(int i10, h0 h0Var, d0 d0Var) {
        if (l(i10, h0Var)) {
            a5.a aVar = this.f47791b;
            d0 m10 = m(d0Var, h0Var);
            aVar.getClass();
            aVar.l(new e8(14, aVar, m10));
        }
    }

    @Override
    public final void f(int i10, h0 h0Var, v vVar, d0 d0Var) {
        if (l(i10, h0Var)) {
            a5.a aVar = this.f47791b;
            d0 m10 = m(d0Var, h0Var);
            aVar.getClass();
            aVar.l(new j0(aVar, vVar, m10, 0));
        }
    }

    @Override
    public final void g(int i10, h0 h0Var, v vVar, d0 d0Var, IOException iOException, boolean z10) {
        if (l(i10, h0Var)) {
            a5.a aVar = this.f47791b;
            d0 m10 = m(d0Var, h0Var);
            aVar.getClass();
            aVar.l(new kk(aVar, vVar, m10, iOException, z10));
        }
    }

    @Override
    public final void h(int i10, h0 h0Var) {
        if (l(i10, h0Var)) {
            this.f47792c.e();
        }
    }

    @Override
    public final void i(int i10, h0 h0Var, v vVar, d0 d0Var, int i11) {
        if (l(i10, h0Var)) {
            a5.a aVar = this.f47791b;
            d0 m10 = m(d0Var, h0Var);
            aVar.getClass();
            aVar.l(new fa(aVar, vVar, m10, i11, 9));
        }
    }

    @Override
    public final void j(int i10, h0 h0Var) {
        if (l(i10, h0Var)) {
            this.f47792c.b();
        }
    }

    @Override
    public final void k(int i10, h0 h0Var, v vVar, d0 d0Var) {
        if (l(i10, h0Var)) {
            a5.a aVar = this.f47791b;
            d0 m10 = m(d0Var, h0Var);
            aVar.getClass();
            aVar.l(new j0(aVar, vVar, m10, 1));
        }
    }

    public final boolean l(int i10, h0 h0Var) {
        h0 h0Var2;
        Object obj = this.f47790a;
        m mVar = this.d;
        if (h0Var != null) {
            h0Var2 = mVar.u(obj, h0Var);
            if (h0Var2 == null) {
                return false;
            }
        } else {
            h0Var2 = null;
        }
        int w9 = mVar.w(i10, obj);
        a5.a aVar = this.f47791b;
        if (aVar.f281b != w9 || !Objects.equals((h0) aVar.f282c, h0Var2)) {
            this.f47791b = new a5.a((CopyOnWriteArrayList) mVar.f47691c.d, w9, h0Var2, 21);
        }
        n2.k kVar = this.f47792c;
        if (kVar.f17120a != w9 || !Objects.equals(kVar.f17121b, h0Var2)) {
            this.f47792c = new n2.k(mVar.d.f17122c, w9, h0Var2);
            return true;
        }
        return true;
    }

    public final d0 m(d0 d0Var, h0 h0Var) {
        long j10 = d0Var.f47730f;
        m mVar = this.d;
        Object obj = this.f47790a;
        long v = mVar.v(obj, j10);
        long j11 = d0Var.f47731g;
        long v10 = mVar.v(obj, j11);
        if (v == j10 && v10 == j11) {
            return d0Var;
        }
        return new d0(d0Var.f47727a, d0Var.f47728b, d0Var.f47729c, d0Var.d, d0Var.e, v, v10);
    }
}
