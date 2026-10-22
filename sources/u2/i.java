package u2;

import java.util.ArrayList;
import v7.u6;
public final class i extends u1 {
    public final long f47323l;
    public final long f47324m;
    public final boolean f47325n;
    public final boolean f47326o;
    public final boolean f47327p;
    public final boolean f47328q;
    public final ArrayList f47329r;
    public final b2.n1 f47330s;
    public g f47331t;
    public h f47332u;
    public long v;
    public long f47333w;

    public i(f fVar) {
        super(fVar.f47309a);
        this.f47323l = fVar.f47310b;
        this.f47324m = fVar.f47311c;
        this.f47325n = fVar.d;
        this.f47326o = fVar.e;
        this.f47327p = fVar.f47312f;
        this.f47328q = fVar.f47313g;
        this.f47329r = new ArrayList();
        this.f47330s = new b2.n1();
    }

    @Override
    public final void A(b2.o1 o1Var) {
        if (this.f47332u != null) {
            return;
        }
        D(o1Var);
    }

    public final void D(b2.o1 o1Var) {
        long j10;
        long j11;
        long j12;
        b2.n1 n1Var = this.f47330s;
        o1Var.n(0, n1Var);
        long j13 = n1Var.f3879p;
        g gVar = this.f47331t;
        long j14 = this.f47324m;
        long j15 = Long.MIN_VALUE;
        ArrayList arrayList = this.f47329r;
        if (gVar != null && !arrayList.isEmpty() && !this.f47326o) {
            j10 = this.v - j13;
            if (j14 != Long.MIN_VALUE) {
                j15 = this.f47333w - j13;
            }
            j12 = j15;
        } else {
            boolean z10 = this.f47327p;
            j10 = this.f47323l;
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
            this.f47333w = j15;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = (e) arrayList.get(i10);
                long j17 = this.v;
                long j18 = this.f47333w;
                eVar.f47307f = j17;
                eVar.h = j18;
            }
            j12 = j11;
        }
        try {
            g gVar2 = new g(o1Var, j10, j12, this.f47328q);
            this.f47331t = gVar2;
            n(gVar2);
        } catch (h e) {
            this.f47332u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((e) arrayList.get(i11)).f47308n = this.f47332u;
            }
        }
    }

    @Override
    public final boolean a(b2.o0 o0Var) {
        a aVar = this.f47457k;
        if (aVar.i().e.equals(o0Var.e) && aVar.a(o0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        e eVar2 = new e(this.f47457k.c(g0Var, eVar, j10), this.f47325n, this.v, this.f47333w, 0);
        this.f47329r.add(eVar2);
        return eVar2;
    }

    @Override
    public final void k() {
        h hVar = this.f47332u;
        if (hVar == null) {
            super.k();
            return;
        }
        throw hVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f47329r;
        u6.p(arrayList.remove(e0Var));
        this.f47457k.o(((e) e0Var).f47304a);
        if (arrayList.isEmpty() && !this.f47326o) {
            g gVar = this.f47331t;
            gVar.getClass();
            D(gVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f47332u = null;
        this.f47331t = null;
    }
}
