package x2;

import a8.xa;
import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.km;
import org.telegram.ui.Wallet.k8;
import org.telegram.ui.yl;
public final class j implements j0, q2.l {
    public final Object f59561a;
    public xa f59562b;
    public q2.k f59563c;
    public final l d;

    public j(l lVar, Object obj) {
        this.d = lVar;
        this.f59562b = lVar.b(null);
        this.f59563c = new q2.k(lVar.d.f55187c, 0, null);
        this.f59561a = obj;
    }

    @Override
    public final void A(int i7, f0 f0Var, t tVar, b0 b0Var) {
        if (a(i7, f0Var)) {
            xa xaVar = this.f59562b;
            b0 b10 = b(b0Var, f0Var);
            xaVar.getClass();
            xaVar.g(new h0(xaVar, tVar, b10, 1));
        }
    }

    @Override
    public final void C(int i7, f0 f0Var, b0 b0Var) {
        if (a(i7, f0Var)) {
            xa xaVar = this.f59562b;
            b0 b10 = b(b0Var, f0Var);
            f0 f0Var2 = (f0) xaVar.f714c;
            f0Var2.getClass();
            xaVar.g(new km(xaVar, f0Var2, b10, 17));
        }
    }

    @Override
    public final void G(int i7, f0 f0Var, t tVar, b0 b0Var) {
        if (a(i7, f0Var)) {
            xa xaVar = this.f59562b;
            b0 b10 = b(b0Var, f0Var);
            xaVar.getClass();
            xaVar.g(new h0(xaVar, tVar, b10, 0));
        }
    }

    @Override
    public final void I(int i7, f0 f0Var, t tVar, b0 b0Var, int i10) {
        if (a(i7, f0Var)) {
            xa xaVar = this.f59562b;
            b0 b10 = b(b0Var, f0Var);
            xaVar.getClass();
            xaVar.g(new bg.f0(xaVar, tVar, b10, i10, 11));
        }
    }

    @Override
    public final void K(int i7, f0 f0Var, Exception exc) {
        if (a(i7, f0Var)) {
            this.f59563c.d(exc);
        }
    }

    @Override
    public final void N(int i7, f0 f0Var, int i10) {
        if (a(i7, f0Var)) {
            this.f59563c.c(i10);
        }
    }

    public final boolean a(int i7, f0 f0Var) {
        f0 f0Var2;
        Object obj = this.f59561a;
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
        xa xaVar = this.f59562b;
        if (xaVar.f713b != w10 || !Objects.equals((f0) xaVar.f714c, f0Var2)) {
            this.f59562b = new xa((CopyOnWriteArrayList) lVar.f59461c.d, w10, f0Var2);
        }
        q2.k kVar = this.f59563c;
        if (kVar.f55185a != w10 || !Objects.equals(kVar.f55186b, f0Var2)) {
            this.f59563c = new q2.k(lVar.d.f55187c, w10, f0Var2);
            return true;
        }
        return true;
    }

    public final b0 b(b0 b0Var, f0 f0Var) {
        long j3 = b0Var.f59500f;
        l lVar = this.d;
        Object obj = this.f59561a;
        long v = lVar.v(obj, j3);
        long j10 = b0Var.f59501g;
        long v10 = lVar.v(obj, j10);
        if (v == j3 && v10 == j10) {
            return b0Var;
        }
        return new b0(b0Var.f59496a, b0Var.f59497b, b0Var.f59498c, b0Var.d, b0Var.f59499e, v, v10);
    }

    @Override
    public final void k(int i7, f0 f0Var, b0 b0Var) {
        if (a(i7, f0Var)) {
            xa xaVar = this.f59562b;
            b0 b10 = b(b0Var, f0Var);
            xaVar.getClass();
            xaVar.g(new k8(29, xaVar, b10));
        }
    }

    @Override
    public final void p(int i7, f0 f0Var, nb.a aVar) {
        if (a(i7, f0Var)) {
            this.f59563c.a(aVar);
        }
    }

    @Override
    public final void r(int i7, f0 f0Var, t tVar, b0 b0Var, IOException iOException, boolean z10) {
        if (a(i7, f0Var)) {
            xa xaVar = this.f59562b;
            b0 b10 = b(b0Var, f0Var);
            xaVar.getClass();
            xaVar.g(new yl(xaVar, tVar, b10, iOException, z10));
        }
    }

    @Override
    public final void w(int i7, f0 f0Var) {
        if (a(i7, f0Var)) {
            this.f59563c.b();
        }
    }

    @Override
    public final void z(int i7, f0 f0Var) {
        if (a(i7, f0Var)) {
            this.f59563c.e();
        }
    }
}
