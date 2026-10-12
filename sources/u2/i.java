package u2;

import java.util.ArrayList;
import v7.u6;
public final class i extends t1 {
    public final long f45927l;
    public final long f45928m;
    public final boolean f45929n;
    public final boolean f45930o;
    public final boolean f45931p;
    public final boolean f45932q;
    public final ArrayList f45933r;
    public final b2.o1 f45934s;
    public g f45935t;
    public h f45936u;
    public long v;
    public long f45937w;

    public i(f fVar) {
        super(fVar.f45912a);
        this.f45927l = fVar.f45913b;
        this.f45928m = fVar.f45914c;
        this.f45929n = fVar.d;
        this.f45930o = fVar.e;
        this.f45931p = fVar.f45915f;
        this.f45932q = fVar.f45916g;
        this.f45933r = new ArrayList();
        this.f45934s = new b2.o1();
    }

    @Override
    public final void A(b2.p1 p1Var) {
        if (this.f45936u != null) {
            return;
        }
        D(p1Var);
    }

    public final void D(b2.p1 p1Var) {
        long j10;
        long j11;
        long j12;
        b2.o1 o1Var = this.f45934s;
        p1Var.n(0, o1Var);
        long j13 = o1Var.f2270p;
        g gVar = this.f45935t;
        long j14 = this.f45928m;
        long j15 = Long.MIN_VALUE;
        ArrayList arrayList = this.f45933r;
        if (gVar != null && !arrayList.isEmpty() && !this.f45930o) {
            j10 = this.v - j13;
            if (j14 != Long.MIN_VALUE) {
                j15 = this.f45937w - j13;
            }
            j12 = j15;
        } else {
            boolean z10 = this.f45931p;
            j10 = this.f45927l;
            if (z10) {
                long j16 = o1Var.f2266l;
                j10 += j16;
                j11 = j16 + j14;
            } else {
                j11 = j14;
            }
            this.v = j13 + j10;
            if (j14 != Long.MIN_VALUE) {
                j15 = j13 + j11;
            }
            this.f45937w = j15;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = (e) arrayList.get(i10);
                long j17 = this.v;
                long j18 = this.f45937w;
                eVar.f45910f = j17;
                eVar.h = j18;
            }
            j12 = j11;
        }
        try {
            g gVar2 = new g(p1Var, j10, j12, this.f45932q);
            this.f45935t = gVar2;
            n(gVar2);
        } catch (h e) {
            this.f45936u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((e) arrayList.get(i11)).f45911n = this.f45936u;
            }
        }
    }

    @Override
    public final boolean a(b2.p0 p0Var) {
        a aVar = this.f46052k;
        if (aVar.i().e.equals(p0Var.e) && aVar.a(p0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        e eVar2 = new e(this.f46052k.c(g0Var, eVar, j10), this.f45929n, this.v, this.f45937w, 0);
        this.f45933r.add(eVar2);
        return eVar2;
    }

    @Override
    public final void k() {
        h hVar = this.f45936u;
        if (hVar == null) {
            super.k();
            return;
        }
        throw hVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f45933r;
        u6.p(arrayList.remove(e0Var));
        this.f46052k.o(((e) e0Var).f45907a);
        if (arrayList.isEmpty() && !this.f45930o) {
            g gVar = this.f45935t;
            gVar.getClass();
            D(gVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f45936u = null;
        this.f45935t = null;
    }
}
