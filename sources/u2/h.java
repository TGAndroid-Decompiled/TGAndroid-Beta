package u2;

import a8.yb;
import java.util.ArrayList;
public final class h extends t1 {
    public final long f49300l;
    public final long f49301m;
    public final boolean f49302n;
    public final boolean f49303o;
    public final boolean f49304p;
    public final boolean f49305q;
    public final ArrayList f49306r;
    public final b2.o1 f49307s;
    public f f49308t;
    public g f49309u;
    public long v;
    public long f49310w;

    public h(e eVar) {
        super(eVar.f49286a);
        this.f49300l = eVar.f49287b;
        this.f49301m = eVar.f49288c;
        this.f49302n = eVar.d;
        this.f49303o = eVar.e;
        this.f49304p = eVar.f49289f;
        this.f49305q = eVar.f49290g;
        this.f49306r = new ArrayList();
        this.f49307s = new b2.o1();
    }

    @Override
    public final void A(b2.p1 p1Var) {
        if (this.f49309u != null) {
            return;
        }
        D(p1Var);
    }

    public final void D(b2.p1 p1Var) {
        long j10;
        long j11;
        long j12;
        b2.o1 o1Var = this.f49307s;
        p1Var.n(0, o1Var);
        long j13 = o1Var.f3337p;
        f fVar = this.f49308t;
        long j14 = this.f49301m;
        long j15 = Long.MIN_VALUE;
        ArrayList arrayList = this.f49306r;
        if (fVar != null && !arrayList.isEmpty() && !this.f49303o) {
            j10 = this.v - j13;
            if (j14 != Long.MIN_VALUE) {
                j15 = this.f49310w - j13;
            }
            j12 = j15;
        } else {
            boolean z10 = this.f49304p;
            j10 = this.f49300l;
            if (z10) {
                long j16 = o1Var.f3333l;
                j10 += j16;
                j11 = j16 + j14;
            } else {
                j11 = j14;
            }
            this.v = j13 + j10;
            if (j14 != Long.MIN_VALUE) {
                j15 = j13 + j11;
            }
            this.f49310w = j15;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j17 = this.v;
                long j18 = this.f49310w;
                dVar.f49284f = j17;
                dVar.h = j18;
            }
            j12 = j11;
        }
        try {
            f fVar2 = new f(p1Var, j10, j12, this.f49305q);
            this.f49308t = fVar2;
            n(fVar2);
        } catch (g e) {
            this.f49309u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).f49285n = this.f49309u;
            }
        }
    }

    @Override
    public final boolean a(b2.p0 p0Var) {
        a aVar = this.f49431k;
        if (aVar.i().e.equals(p0Var.e) && aVar.a(p0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, a8.h0 h0Var, long j10) {
        d dVar = new d(this.f49431k.c(g0Var, h0Var, j10), this.f49302n, this.v, this.f49310w, 0);
        this.f49306r.add(dVar);
        return dVar;
    }

    @Override
    public final void k() {
        g gVar = this.f49309u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f49306r;
        yb.p(arrayList.remove(e0Var));
        this.f49431k.o(((d) e0Var).f49281a);
        if (arrayList.isEmpty() && !this.f49303o) {
            f fVar = this.f49308t;
            fVar.getClass();
            D(fVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f49309u = null;
        this.f49308t = null;
    }
}
