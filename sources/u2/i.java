package u2;

import java.util.ArrayList;
import v7.u6;
public final class i extends t1 {
    public final long f47334l;
    public final long f47335m;
    public final boolean f47336n;
    public final boolean f47337o;
    public final boolean f47338p;
    public final boolean f47339q;
    public final ArrayList f47340r;
    public final b2.n1 f47341s;
    public g f47342t;
    public h f47343u;
    public long v;
    public long f47344w;

    public i(f fVar) {
        super(fVar.f47319a);
        this.f47334l = fVar.f47320b;
        this.f47335m = fVar.f47321c;
        this.f47336n = fVar.d;
        this.f47337o = fVar.e;
        this.f47338p = fVar.f47322f;
        this.f47339q = fVar.f47323g;
        this.f47340r = new ArrayList();
        this.f47341s = new b2.n1();
    }

    @Override
    public final void A(b2.o1 o1Var) {
        if (this.f47343u != null) {
            return;
        }
        D(o1Var);
    }

    public final void D(b2.o1 o1Var) {
        long j10;
        long j11;
        long j12;
        b2.n1 n1Var = this.f47341s;
        o1Var.n(0, n1Var);
        long j13 = n1Var.f3882p;
        g gVar = this.f47342t;
        long j14 = this.f47335m;
        long j15 = Long.MIN_VALUE;
        ArrayList arrayList = this.f47340r;
        if (gVar != null && !arrayList.isEmpty() && !this.f47337o) {
            j10 = this.v - j13;
            if (j14 != Long.MIN_VALUE) {
                j15 = this.f47344w - j13;
            }
            j12 = j15;
        } else {
            boolean z10 = this.f47338p;
            j10 = this.f47334l;
            if (z10) {
                long j16 = n1Var.f3878l;
                j10 += j16;
                j11 = j16 + j14;
            } else {
                j11 = j14;
            }
            this.v = j13 + j10;
            if (j14 != Long.MIN_VALUE) {
                j15 = j13 + j11;
            }
            this.f47344w = j15;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = (e) arrayList.get(i10);
                long j17 = this.v;
                long j18 = this.f47344w;
                eVar.f47317f = j17;
                eVar.h = j18;
            }
            j12 = j11;
        }
        try {
            g gVar2 = new g(o1Var, j10, j12, this.f47339q);
            this.f47342t = gVar2;
            n(gVar2);
        } catch (h e) {
            this.f47343u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((e) arrayList.get(i11)).f47318n = this.f47343u;
            }
        }
    }

    @Override
    public final boolean a(b2.o0 o0Var) {
        a aVar = this.f47459k;
        if (aVar.i().e.equals(o0Var.e) && aVar.a(o0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        e eVar2 = new e(this.f47459k.c(g0Var, eVar, j10), this.f47336n, this.v, this.f47344w, 0);
        this.f47340r.add(eVar2);
        return eVar2;
    }

    @Override
    public final void k() {
        h hVar = this.f47343u;
        if (hVar == null) {
            super.k();
            return;
        }
        throw hVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f47340r;
        u6.p(arrayList.remove(e0Var));
        this.f47459k.o(((e) e0Var).f47314a);
        if (arrayList.isEmpty() && !this.f47337o) {
            g gVar = this.f47342t;
            gVar.getClass();
            D(gVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f47343u = null;
        this.f47342t = null;
    }
}
