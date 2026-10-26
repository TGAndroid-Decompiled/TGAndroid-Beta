package u2;

import a8.yb;
import java.util.ArrayList;
public final class h extends t1 {
    public final long f49303l;
    public final long f49304m;
    public final boolean f49305n;
    public final boolean f49306o;
    public final boolean f49307p;
    public final boolean f49308q;
    public final ArrayList f49309r;
    public final b2.o1 f49310s;
    public f f49311t;
    public g f49312u;
    public long v;
    public long f49313w;

    public h(e eVar) {
        super(eVar.f49289a);
        this.f49303l = eVar.f49290b;
        this.f49304m = eVar.f49291c;
        this.f49305n = eVar.d;
        this.f49306o = eVar.e;
        this.f49307p = eVar.f49292f;
        this.f49308q = eVar.f49293g;
        this.f49309r = new ArrayList();
        this.f49310s = new b2.o1();
    }

    @Override
    public final void A(b2.p1 p1Var) {
        if (this.f49312u != null) {
            return;
        }
        D(p1Var);
    }

    public final void D(b2.p1 p1Var) {
        long j10;
        long j11;
        long j12;
        b2.o1 o1Var = this.f49310s;
        p1Var.n(0, o1Var);
        long j13 = o1Var.f3337p;
        f fVar = this.f49311t;
        long j14 = this.f49304m;
        long j15 = Long.MIN_VALUE;
        ArrayList arrayList = this.f49309r;
        if (fVar != null && !arrayList.isEmpty() && !this.f49306o) {
            j10 = this.v - j13;
            if (j14 != Long.MIN_VALUE) {
                j15 = this.f49313w - j13;
            }
            j12 = j15;
        } else {
            boolean z10 = this.f49307p;
            j10 = this.f49303l;
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
            this.f49313w = j15;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j17 = this.v;
                long j18 = this.f49313w;
                dVar.f49287f = j17;
                dVar.h = j18;
            }
            j12 = j11;
        }
        try {
            f fVar2 = new f(p1Var, j10, j12, this.f49308q);
            this.f49311t = fVar2;
            n(fVar2);
        } catch (g e) {
            this.f49312u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).f49288n = this.f49312u;
            }
        }
    }

    @Override
    public final boolean a(b2.p0 p0Var) {
        a aVar = this.f49434k;
        if (aVar.i().e.equals(p0Var.e) && aVar.a(p0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, a8.h0 h0Var, long j10) {
        d dVar = new d(this.f49434k.c(g0Var, h0Var, j10), this.f49305n, this.v, this.f49313w, 0);
        this.f49309r.add(dVar);
        return dVar;
    }

    @Override
    public final void k() {
        g gVar = this.f49312u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f49309r;
        yb.p(arrayList.remove(e0Var));
        this.f49434k.o(((d) e0Var).f49284a);
        if (arrayList.isEmpty() && !this.f49306o) {
            f fVar = this.f49311t;
            fVar.getClass();
            D(fVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f49312u = null;
        this.f49311t = null;
    }
}
