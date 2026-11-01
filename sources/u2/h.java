package u2;

import java.util.ArrayList;
import v7.t6;
public final class h extends t1 {
    public final long f49895l;
    public final long f49896m;
    public final boolean f49897n;
    public final boolean f49898o;
    public final boolean f49899p;
    public final boolean f49900q;
    public final ArrayList f49901r;
    public final b2.n1 f49902s;
    public f f49903t;
    public g f49904u;
    public long v;
    public long f49905w;

    public h(e eVar) {
        super(eVar.f49881a);
        this.f49895l = eVar.f49882b;
        this.f49896m = eVar.f49883c;
        this.f49897n = eVar.d;
        this.f49898o = eVar.e;
        this.f49899p = eVar.f49884f;
        this.f49900q = eVar.f49885g;
        this.f49901r = new ArrayList();
        this.f49902s = new b2.n1();
    }

    @Override
    public final void A(b2.o1 o1Var) {
        if (this.f49904u != null) {
            return;
        }
        D(o1Var);
    }

    public final void D(b2.o1 o1Var) {
        long j10;
        long j11;
        long j12;
        b2.n1 n1Var = this.f49902s;
        o1Var.n(0, n1Var);
        long j13 = n1Var.f2149p;
        f fVar = this.f49903t;
        long j14 = this.f49896m;
        long j15 = Long.MIN_VALUE;
        ArrayList arrayList = this.f49901r;
        if (fVar != null && !arrayList.isEmpty() && !this.f49898o) {
            j10 = this.v - j13;
            if (j14 != Long.MIN_VALUE) {
                j15 = this.f49905w - j13;
            }
            j12 = j15;
        } else {
            boolean z10 = this.f49899p;
            j10 = this.f49895l;
            if (z10) {
                long j16 = n1Var.f2145l;
                j10 += j16;
                j11 = j16 + j14;
            } else {
                j11 = j14;
            }
            this.v = j13 + j10;
            if (j14 != Long.MIN_VALUE) {
                j15 = j13 + j11;
            }
            this.f49905w = j15;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j17 = this.v;
                long j18 = this.f49905w;
                dVar.f49879f = j17;
                dVar.h = j18;
            }
            j12 = j11;
        }
        try {
            f fVar2 = new f(o1Var, j10, j12, this.f49900q);
            this.f49903t = fVar2;
            n(fVar2);
        } catch (g e) {
            this.f49904u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).f49880n = this.f49904u;
            }
        }
    }

    @Override
    public final boolean a(b2.p0 p0Var) {
        a aVar = this.f50027k;
        if (aVar.i().e.equals(p0Var.e) && aVar.a(p0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, android.support.v4.media.session.a0 a0Var, long j10) {
        d dVar = new d(this.f50027k.c(g0Var, a0Var, j10), this.f49897n, this.v, this.f49905w, 0);
        this.f49901r.add(dVar);
        return dVar;
    }

    @Override
    public final void k() {
        g gVar = this.f49904u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f49901r;
        t6.p(arrayList.remove(e0Var));
        this.f50027k.o(((d) e0Var).f49876a);
        if (arrayList.isEmpty() && !this.f49898o) {
            f fVar = this.f49903t;
            fVar.getClass();
            D(fVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f49904u = null;
        this.f49903t = null;
    }
}
