package u2;

import java.util.ArrayList;
import v7.u6;
public final class i extends v1 {
    public final long f47769l;
    public final long f47770m;
    public final boolean f47771n;
    public final boolean f47772o;
    public final boolean f47773p;
    public final boolean f47774q;
    public final ArrayList f47775r;
    public final b2.n1 f47776s;
    public g f47777t;
    public h f47778u;
    public long v;
    public long f47779w;

    public i(f fVar) {
        super(fVar.f47758a);
        this.f47769l = fVar.f47759b;
        this.f47770m = fVar.f47760c;
        this.f47771n = fVar.d;
        this.f47772o = fVar.e;
        this.f47773p = fVar.f47761f;
        this.f47774q = fVar.f47762g;
        this.f47775r = new ArrayList();
        this.f47776s = new b2.n1();
    }

    @Override
    public final void A(b2.o1 o1Var) {
        if (this.f47778u != null) {
            return;
        }
        D(o1Var);
    }

    public final void D(b2.o1 o1Var) {
        long j10;
        long j11;
        long j12;
        b2.n1 n1Var = this.f47776s;
        o1Var.n(0, n1Var);
        long j13 = n1Var.f3886p;
        g gVar = this.f47777t;
        long j14 = this.f47770m;
        long j15 = Long.MIN_VALUE;
        ArrayList arrayList = this.f47775r;
        if (gVar != null && !arrayList.isEmpty() && !this.f47772o) {
            j10 = this.v - j13;
            if (j14 != Long.MIN_VALUE) {
                j15 = this.f47779w - j13;
            }
            j12 = j15;
        } else {
            boolean z10 = this.f47773p;
            j10 = this.f47769l;
            if (z10) {
                long j16 = n1Var.f3882l;
                j10 += j16;
                j11 = j16 + j14;
            } else {
                j11 = j14;
            }
            this.v = j13 + j10;
            if (j14 != Long.MIN_VALUE) {
                j15 = j13 + j11;
            }
            this.f47779w = j15;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = (e) arrayList.get(i10);
                long j17 = this.v;
                long j18 = this.f47779w;
                eVar.f47734f = j17;
                eVar.h = j18;
            }
            j12 = j11;
        }
        try {
            g gVar2 = new g(o1Var, j10, j12, this.f47774q);
            this.f47777t = gVar2;
            n(gVar2);
        } catch (h e) {
            this.f47778u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((e) arrayList.get(i11)).f47735n = this.f47778u;
            }
        }
    }

    @Override
    public final boolean a(b2.o0 o0Var) {
        a aVar = this.f47911k;
        if (aVar.i().e.equals(o0Var.e) && aVar.a(o0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final f0 c(h0 h0Var, androidx.biometric.e eVar, long j10) {
        e eVar2 = new e(this.f47911k.c(h0Var, eVar, j10), this.f47771n, this.v, this.f47779w, 0);
        this.f47775r.add(eVar2);
        return eVar2;
    }

    @Override
    public final void k() {
        h hVar = this.f47778u;
        if (hVar == null) {
            super.k();
            return;
        }
        throw hVar;
    }

    @Override
    public final void o(f0 f0Var) {
        ArrayList arrayList = this.f47775r;
        u6.p(arrayList.remove(f0Var));
        this.f47911k.o(((e) f0Var).f47731a);
        if (arrayList.isEmpty() && !this.f47772o) {
            g gVar = this.f47777t;
            gVar.getClass();
            D(gVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f47778u = null;
        this.f47777t = null;
    }
}
