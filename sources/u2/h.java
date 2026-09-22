package u2;

import java.util.ArrayList;
public final class h extends p1 {
    public final long f43357l;
    public final long f43358m;
    public final boolean f43359n;
    public final boolean f43360o;
    public final boolean f43361p;
    public final boolean f43362q;
    public final ArrayList f43363r;
    public final b2.j1 f43364s;
    public f f43365t;
    public g f43366u;
    public long v;
    public long f43367w;

    public h(e eVar) {
        super(eVar.f43342a);
        this.f43357l = eVar.f43343b;
        this.f43358m = eVar.f43344c;
        this.f43359n = eVar.d;
        this.f43360o = eVar.e;
        this.f43361p = eVar.f43345f;
        this.f43362q = eVar.f43346g;
        this.f43363r = new ArrayList();
        this.f43364s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f43366u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f43364s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f3067p;
        f fVar = this.f43365t;
        long j13 = this.f43358m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f43363r;
        if (fVar != null && !arrayList.isEmpty() && !this.f43360o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f43367w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f43361p;
            j3 = this.f43357l;
            if (z10) {
                long j15 = j1Var.f3063l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f43367w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f43367w;
                dVar.e = j16;
                dVar.f43341f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f43362q);
            this.f43365t = fVar2;
            n(fVar2);
        } catch (g e) {
            this.f43366u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f43366u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f43464k;
        if (aVar.i().e.equals(k0Var.e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f43464k.c(f0Var, dVar, j3), this.f43359n, this.v, this.f43367w);
        this.f43363r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f43366u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f43363r;
        e2.d.g(arrayList.remove(d0Var));
        this.f43464k.o(((d) d0Var).f43338a);
        if (arrayList.isEmpty() && !this.f43360o) {
            f fVar = this.f43365t;
            fVar.getClass();
            D(fVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f43366u = null;
        this.f43365t = null;
    }
}
