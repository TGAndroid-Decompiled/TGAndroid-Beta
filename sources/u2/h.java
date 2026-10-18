package u2;

import java.util.ArrayList;
import v7.u6;
public final class h extends s1 {
    public final long f47354l;
    public final long f47355m;
    public final boolean f47356n;
    public final boolean f47357o;
    public final boolean f47358p;
    public final boolean f47359q;
    public final ArrayList f47360r;
    public final b2.n1 f47361s;
    public f f47362t;
    public g f47363u;
    public long v;
    public long f47364w;

    public h(e eVar) {
        super(eVar.f47339a);
        this.f47354l = eVar.f47340b;
        this.f47355m = eVar.f47341c;
        this.f47356n = eVar.d;
        this.f47357o = eVar.e;
        this.f47358p = eVar.f47342f;
        this.f47359q = eVar.f47343g;
        this.f47360r = new ArrayList();
        this.f47361s = new b2.n1();
    }

    @Override
    public final void A(b2.o1 o1Var) {
        if (this.f47363u != null) {
            return;
        }
        D(o1Var);
    }

    public final void D(b2.o1 o1Var) {
        long j10;
        long j11;
        long j12;
        b2.n1 n1Var = this.f47361s;
        o1Var.n(0, n1Var);
        long j13 = n1Var.f3883p;
        f fVar = this.f47362t;
        long j14 = this.f47355m;
        long j15 = Long.MIN_VALUE;
        ArrayList arrayList = this.f47360r;
        if (fVar != null && !arrayList.isEmpty() && !this.f47357o) {
            j10 = this.v - j13;
            if (j14 != Long.MIN_VALUE) {
                j15 = this.f47364w - j13;
            }
            j12 = j15;
        } else {
            boolean z10 = this.f47358p;
            j10 = this.f47354l;
            if (z10) {
                long j16 = n1Var.f3879l;
                j10 += j16;
                j11 = j16 + j14;
            } else {
                j11 = j14;
            }
            this.v = j13 + j10;
            if (j14 != Long.MIN_VALUE) {
                j15 = j13 + j11;
            }
            this.f47364w = j15;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j17 = this.v;
                long j18 = this.f47364w;
                dVar.f47337f = j17;
                dVar.h = j18;
            }
            j12 = j11;
        }
        try {
            f fVar2 = new f(o1Var, j10, j12, this.f47359q);
            this.f47362t = fVar2;
            n(fVar2);
        } catch (g e) {
            this.f47363u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).f47338n = this.f47363u;
            }
        }
    }

    @Override
    public final boolean a(b2.o0 o0Var) {
        a aVar = this.f47479k;
        if (aVar.i().e.equals(o0Var.e) && aVar.a(o0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, androidx.biometric.e eVar, long j10) {
        d dVar = new d(this.f47479k.c(f0Var, eVar, j10), this.f47356n, this.v, this.f47364w, 0);
        this.f47360r.add(dVar);
        return dVar;
    }

    @Override
    public final void k() {
        g gVar = this.f47363u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f47360r;
        u6.p(arrayList.remove(d0Var));
        this.f47479k.o(((d) d0Var).f47334a);
        if (arrayList.isEmpty() && !this.f47357o) {
            f fVar = this.f47362t;
            fVar.getClass();
            D(fVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f47363u = null;
        this.f47362t = null;
    }
}
