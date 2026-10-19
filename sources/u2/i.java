package u2;

import java.util.ArrayList;
import v7.u6;
public final class i extends t1 {
    public final long f47313l;
    public final long f47314m;
    public final boolean f47315n;
    public final boolean f47316o;
    public final boolean f47317p;
    public final boolean f47318q;
    public final ArrayList f47319r;
    public final b2.n1 f47320s;
    public g f47321t;
    public h f47322u;
    public long v;
    public long f47323w;

    public i(f fVar) {
        super(fVar.f47298a);
        this.f47313l = fVar.f47299b;
        this.f47314m = fVar.f47300c;
        this.f47315n = fVar.d;
        this.f47316o = fVar.e;
        this.f47317p = fVar.f47301f;
        this.f47318q = fVar.f47302g;
        this.f47319r = new ArrayList();
        this.f47320s = new b2.n1();
    }

    @Override
    public final void A(b2.o1 o1Var) {
        if (this.f47322u != null) {
            return;
        }
        D(o1Var);
    }

    public final void D(b2.o1 o1Var) {
        long j10;
        long j11;
        long j12;
        b2.n1 n1Var = this.f47320s;
        o1Var.n(0, n1Var);
        long j13 = n1Var.f3879p;
        g gVar = this.f47321t;
        long j14 = this.f47314m;
        long j15 = Long.MIN_VALUE;
        ArrayList arrayList = this.f47319r;
        if (gVar != null && !arrayList.isEmpty() && !this.f47316o) {
            j10 = this.v - j13;
            if (j14 != Long.MIN_VALUE) {
                j15 = this.f47323w - j13;
            }
            j12 = j15;
        } else {
            boolean z10 = this.f47317p;
            j10 = this.f47313l;
            if (z10) {
                long j16 = n1Var.f3875l;
                j10 += j16;
                j11 = j16 + j14;
            } else {
                j11 = j14;
            }
            this.v = j13 + j10;
            if (j14 != Long.MIN_VALUE) {
                j15 = j13 + j11;
            }
            this.f47323w = j15;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = (e) arrayList.get(i10);
                long j17 = this.v;
                long j18 = this.f47323w;
                eVar.f47296f = j17;
                eVar.h = j18;
            }
            j12 = j11;
        }
        try {
            g gVar2 = new g(o1Var, j10, j12, this.f47318q);
            this.f47321t = gVar2;
            n(gVar2);
        } catch (h e) {
            this.f47322u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((e) arrayList.get(i11)).f47297n = this.f47322u;
            }
        }
    }

    @Override
    public final boolean a(b2.o0 o0Var) {
        a aVar = this.f47438k;
        if (aVar.i().e.equals(o0Var.e) && aVar.a(o0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        e eVar2 = new e(this.f47438k.c(g0Var, eVar, j10), this.f47315n, this.v, this.f47323w, 0);
        this.f47319r.add(eVar2);
        return eVar2;
    }

    @Override
    public final void k() {
        h hVar = this.f47322u;
        if (hVar == null) {
            super.k();
            return;
        }
        throw hVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f47319r;
        u6.p(arrayList.remove(e0Var));
        this.f47438k.o(((e) e0Var).f47293a);
        if (arrayList.isEmpty() && !this.f47316o) {
            g gVar = this.f47321t;
            gVar.getClass();
            D(gVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f47322u = null;
        this.f47321t = null;
    }
}
