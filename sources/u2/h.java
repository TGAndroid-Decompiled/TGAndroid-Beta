package u2;

import java.util.ArrayList;
public final class h extends q1 {
    public final long f43646l;
    public final long f43647m;
    public final boolean f43648n;
    public final boolean f43649o;
    public final boolean f43650p;
    public final boolean f43651q;
    public final ArrayList f43652r;
    public final b2.j1 f43653s;
    public f f43654t;
    public g f43655u;
    public long v;
    public long f43656w;

    public h(e eVar) {
        super(eVar.f43631a);
        this.f43646l = eVar.f43632b;
        this.f43647m = eVar.f43633c;
        this.f43648n = eVar.d;
        this.f43649o = eVar.e;
        this.f43650p = eVar.f43634f;
        this.f43651q = eVar.f43635g;
        this.f43652r = new ArrayList();
        this.f43653s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f43655u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f43653s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f3062p;
        f fVar = this.f43654t;
        long j13 = this.f43647m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f43652r;
        if (fVar != null && !arrayList.isEmpty() && !this.f43649o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f43656w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f43650p;
            j3 = this.f43646l;
            if (z10) {
                long j15 = j1Var.f3058l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f43656w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f43656w;
                dVar.e = j16;
                dVar.f43630f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f43651q);
            this.f43654t = fVar2;
            n(fVar2);
        } catch (g e) {
            this.f43655u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f43655u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f43755k;
        if (aVar.i().e.equals(k0Var.e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f43755k.c(f0Var, dVar, j3), this.f43648n, this.v, this.f43656w);
        this.f43652r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f43655u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f43652r;
        e2.d.g(arrayList.remove(d0Var));
        this.f43755k.o(((d) d0Var).f43627a);
        if (arrayList.isEmpty() && !this.f43649o) {
            f fVar = this.f43654t;
            fVar.getClass();
            D(fVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f43655u = null;
        this.f43654t = null;
    }
}
