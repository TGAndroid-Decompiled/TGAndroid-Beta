package u2;

import java.util.ArrayList;
import v7.u6;
public final class i extends u1 {
    public final long f47324l;
    public final long f47325m;
    public final boolean f47326n;
    public final boolean f47327o;
    public final boolean f47328p;
    public final boolean f47329q;
    public final ArrayList f47330r;
    public final b2.n1 f47331s;
    public g f47332t;
    public h f47333u;
    public long v;
    public long f47334w;

    public i(f fVar) {
        super(fVar.f47310a);
        this.f47324l = fVar.f47311b;
        this.f47325m = fVar.f47312c;
        this.f47326n = fVar.d;
        this.f47327o = fVar.e;
        this.f47328p = fVar.f47313f;
        this.f47329q = fVar.f47314g;
        this.f47330r = new ArrayList();
        this.f47331s = new b2.n1();
    }

    @Override
    public final void A(b2.o1 o1Var) {
        if (this.f47333u != null) {
            return;
        }
        D(o1Var);
    }

    public final void D(b2.o1 o1Var) {
        long j10;
        long j11;
        long j12;
        b2.n1 n1Var = this.f47331s;
        o1Var.n(0, n1Var);
        long j13 = n1Var.f3879p;
        g gVar = this.f47332t;
        long j14 = this.f47325m;
        long j15 = Long.MIN_VALUE;
        ArrayList arrayList = this.f47330r;
        if (gVar != null && !arrayList.isEmpty() && !this.f47327o) {
            j10 = this.v - j13;
            if (j14 != Long.MIN_VALUE) {
                j15 = this.f47334w - j13;
            }
            j12 = j15;
        } else {
            boolean z10 = this.f47328p;
            j10 = this.f47324l;
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
            this.f47334w = j15;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = (e) arrayList.get(i10);
                long j17 = this.v;
                long j18 = this.f47334w;
                eVar.f47308f = j17;
                eVar.h = j18;
            }
            j12 = j11;
        }
        try {
            g gVar2 = new g(o1Var, j10, j12, this.f47329q);
            this.f47332t = gVar2;
            n(gVar2);
        } catch (h e) {
            this.f47333u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((e) arrayList.get(i11)).f47309n = this.f47333u;
            }
        }
    }

    @Override
    public final boolean a(b2.o0 o0Var) {
        a aVar = this.f47458k;
        if (aVar.i().e.equals(o0Var.e) && aVar.a(o0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        e eVar2 = new e(this.f47458k.c(g0Var, eVar, j10), this.f47326n, this.v, this.f47334w, 0);
        this.f47330r.add(eVar2);
        return eVar2;
    }

    @Override
    public final void k() {
        h hVar = this.f47333u;
        if (hVar == null) {
            super.k();
            return;
        }
        throw hVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f47330r;
        u6.p(arrayList.remove(e0Var));
        this.f47458k.o(((e) e0Var).f47305a);
        if (arrayList.isEmpty() && !this.f47327o) {
            g gVar = this.f47332t;
            gVar.getClass();
            D(gVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f47333u = null;
        this.f47332t = null;
    }
}
