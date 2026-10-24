package u2;

import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.lk;
import org.telegram.ui.Components.py;
import org.telegram.ui.Wallet.e8;
import org.telegram.ui.fa;
public final class k implements m0, n2.l {
    public final Object f47789a;
    public a5.a f47790b;
    public n2.k f47791c;
    public final m d;

    public k(m mVar, Object obj) {
        this.d = mVar;
        this.f47790b = mVar.b(null);
        this.f47791c = new n2.k(mVar.d.f17122c, 0, null);
        this.f47789a = obj;
    }

    @Override
    public final void a(int i10, h0 h0Var, int i11) {
        if (l(i10, h0Var)) {
            this.f47791c.c(i11);
        }
    }

    @Override
    public final void b(int i10, h0 h0Var, Exception exc) {
        if (l(i10, h0Var)) {
            this.f47791c.d(exc);
        }
    }

    @Override
    public final void c(int i10, h0 h0Var, oa.d dVar) {
        if (l(i10, h0Var)) {
            this.f47791c.a(dVar);
        }
    }

    @Override
    public final void d(int i10, h0 h0Var, d0 d0Var) {
        if (l(i10, h0Var)) {
            a5.a aVar = this.f47790b;
            d0 m10 = m(d0Var, h0Var);
            h0 h0Var2 = (h0) aVar.f282c;
            h0Var2.getClass();
            aVar.l(new py(aVar, h0Var2, m10, 12));
        }
    }

    @Override
    public final void e(int i10, h0 h0Var, d0 d0Var) {
        if (l(i10, h0Var)) {
            a5.a aVar = this.f47790b;
            d0 m10 = m(d0Var, h0Var);
            aVar.getClass();
            aVar.l(new e8(14, aVar, m10));
        }
    }

    @Override
    public final void f(int i10, h0 h0Var, v vVar, d0 d0Var) {
        if (l(i10, h0Var)) {
            a5.a aVar = this.f47790b;
            d0 m10 = m(d0Var, h0Var);
            aVar.getClass();
            aVar.l(new j0(aVar, vVar, m10, 0));
        }
    }

    @Override
    public final void g(int i10, h0 h0Var, v vVar, d0 d0Var, IOException iOException, boolean z10) {
        if (l(i10, h0Var)) {
            a5.a aVar = this.f47790b;
            d0 m10 = m(d0Var, h0Var);
            aVar.getClass();
            aVar.l(new lk(aVar, vVar, m10, iOException, z10));
        }
    }

    @Override
    public final void h(int i10, h0 h0Var) {
        if (l(i10, h0Var)) {
            this.f47791c.e();
        }
    }

    @Override
    public final void i(int i10, h0 h0Var, v vVar, d0 d0Var, int i11) {
        if (l(i10, h0Var)) {
            a5.a aVar = this.f47790b;
            d0 m10 = m(d0Var, h0Var);
            aVar.getClass();
            aVar.l(new fa(aVar, vVar, m10, i11, 9));
        }
    }

    @Override
    public final void j(int i10, h0 h0Var) {
        if (l(i10, h0Var)) {
            this.f47791c.b();
        }
    }

    @Override
    public final void k(int i10, h0 h0Var, v vVar, d0 d0Var) {
        if (l(i10, h0Var)) {
            a5.a aVar = this.f47790b;
            d0 m10 = m(d0Var, h0Var);
            aVar.getClass();
            aVar.l(new j0(aVar, vVar, m10, 1));
        }
    }

    public final boolean l(int i10, h0 h0Var) {
        h0 h0Var2;
        Object obj = this.f47789a;
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
        a5.a aVar = this.f47790b;
        if (aVar.f281b != w9 || !Objects.equals((h0) aVar.f282c, h0Var2)) {
            this.f47790b = new a5.a((CopyOnWriteArrayList) mVar.f47690c.d, w9, h0Var2, 21);
        }
        n2.k kVar = this.f47791c;
        if (kVar.f17120a != w9 || !Objects.equals(kVar.f17121b, h0Var2)) {
            this.f47791c = new n2.k(mVar.d.f17122c, w9, h0Var2);
            return true;
        }
        return true;
    }

    public final d0 m(d0 d0Var, h0 h0Var) {
        long j10 = d0Var.f47729f;
        m mVar = this.d;
        Object obj = this.f47789a;
        long v = mVar.v(obj, j10);
        long j11 = d0Var.f47730g;
        long v10 = mVar.v(obj, j11);
        if (v == j10 && v10 == j11) {
            return d0Var;
        }
        return new d0(d0Var.f47726a, d0Var.f47727b, d0Var.f47728c, d0Var.d, d0Var.e, v, v10);
    }
}
