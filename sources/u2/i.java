package u2;

import java.util.ArrayList;
import v7.u6;
public final class i extends v1 {
    public final long f47770l;
    public final long f47771m;
    public final boolean f47772n;
    public final boolean f47773o;
    public final boolean f47774p;
    public final boolean f47775q;
    public final ArrayList f47776r;
    public final b2.n1 f47777s;
    public g f47778t;
    public h f47779u;
    public long v;
    public long f47780w;

    public i(f fVar) {
        super(fVar.f47759a);
        this.f47770l = fVar.f47760b;
        this.f47771m = fVar.f47761c;
        this.f47772n = fVar.d;
        this.f47773o = fVar.e;
        this.f47774p = fVar.f47762f;
        this.f47775q = fVar.f47763g;
        this.f47776r = new ArrayList();
        this.f47777s = new b2.n1();
    }

    @Override
    public final void A(b2.o1 o1Var) {
        if (this.f47779u != null) {
            return;
        }
        D(o1Var);
    }

    public final void D(b2.o1 o1Var) {
        long j10;
        long j11;
        long j12;
        b2.n1 n1Var = this.f47777s;
        o1Var.n(0, n1Var);
        long j13 = n1Var.f3886p;
        g gVar = this.f47778t;
        long j14 = this.f47771m;
        long j15 = Long.MIN_VALUE;
        ArrayList arrayList = this.f47776r;
        if (gVar != null && !arrayList.isEmpty() && !this.f47773o) {
            j10 = this.v - j13;
            if (j14 != Long.MIN_VALUE) {
                j15 = this.f47780w - j13;
            }
            j12 = j15;
        } else {
            boolean z10 = this.f47774p;
            j10 = this.f47770l;
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
            this.f47780w = j15;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = (e) arrayList.get(i10);
                long j17 = this.v;
                long j18 = this.f47780w;
                eVar.f47735f = j17;
                eVar.h = j18;
            }
            j12 = j11;
        }
        try {
            g gVar2 = new g(o1Var, j10, j12, this.f47775q);
            this.f47778t = gVar2;
            n(gVar2);
        } catch (h e) {
            this.f47779u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((e) arrayList.get(i11)).f47736n = this.f47779u;
            }
        }
    }

    @Override
    public final boolean a(b2.o0 o0Var) {
        a aVar = this.f47912k;
        if (aVar.i().e.equals(o0Var.e) && aVar.a(o0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final f0 c(h0 h0Var, androidx.biometric.e eVar, long j10) {
        e eVar2 = new e(this.f47912k.c(h0Var, eVar, j10), this.f47772n, this.v, this.f47780w, 0);
        this.f47776r.add(eVar2);
        return eVar2;
    }

    @Override
    public final void k() {
        h hVar = this.f47779u;
        if (hVar == null) {
            super.k();
            return;
        }
        throw hVar;
    }

    @Override
    public final void o(f0 f0Var) {
        ArrayList arrayList = this.f47776r;
        u6.p(arrayList.remove(f0Var));
        this.f47912k.o(((e) f0Var).f47732a);
        if (arrayList.isEmpty() && !this.f47773o) {
            g gVar = this.f47778t;
            gVar.getClass();
            D(gVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f47779u = null;
        this.f47778t = null;
    }
}
