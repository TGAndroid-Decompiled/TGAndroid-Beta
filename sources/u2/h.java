package u2;

import java.util.ArrayList;
public final class h extends q1 {
    public final long f43631l;
    public final long f43632m;
    public final boolean f43633n;
    public final boolean f43634o;
    public final boolean f43635p;
    public final boolean f43636q;
    public final ArrayList f43637r;
    public final b2.j1 f43638s;
    public f f43639t;
    public g f43640u;
    public long v;
    public long f43641w;

    public h(e eVar) {
        super(eVar.f43616a);
        this.f43631l = eVar.f43617b;
        this.f43632m = eVar.f43618c;
        this.f43633n = eVar.d;
        this.f43634o = eVar.e;
        this.f43635p = eVar.f43619f;
        this.f43636q = eVar.f43620g;
        this.f43637r = new ArrayList();
        this.f43638s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f43640u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f43638s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f3062p;
        f fVar = this.f43639t;
        long j13 = this.f43632m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f43637r;
        if (fVar != null && !arrayList.isEmpty() && !this.f43634o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f43641w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f43635p;
            j3 = this.f43631l;
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
            this.f43641w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f43641w;
                dVar.e = j16;
                dVar.f43615f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f43636q);
            this.f43639t = fVar2;
            n(fVar2);
        } catch (g e) {
            this.f43640u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f43640u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f43740k;
        if (aVar.i().e.equals(k0Var.e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f43740k.c(f0Var, dVar, j3), this.f43633n, this.v, this.f43641w);
        this.f43637r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f43640u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f43637r;
        e2.d.g(arrayList.remove(d0Var));
        this.f43740k.o(((d) d0Var).f43612a);
        if (arrayList.isEmpty() && !this.f43634o) {
            f fVar = this.f43639t;
            fVar.getClass();
            D(fVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f43640u = null;
        this.f43639t = null;
    }
}
