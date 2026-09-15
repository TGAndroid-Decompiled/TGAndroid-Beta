package u2;

import java.util.ArrayList;
public final class h extends p1 {
    public final long f43361l;
    public final long f43362m;
    public final boolean f43363n;
    public final boolean f43364o;
    public final boolean f43365p;
    public final boolean f43366q;
    public final ArrayList f43367r;
    public final b2.j1 f43368s;
    public f f43369t;
    public g f43370u;
    public long v;
    public long f43371w;

    public h(e eVar) {
        super(eVar.f43346a);
        this.f43361l = eVar.f43347b;
        this.f43362m = eVar.f43348c;
        this.f43363n = eVar.d;
        this.f43364o = eVar.e;
        this.f43365p = eVar.f43349f;
        this.f43366q = eVar.f43350g;
        this.f43367r = new ArrayList();
        this.f43368s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f43370u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f43368s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f3065p;
        f fVar = this.f43369t;
        long j13 = this.f43362m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f43367r;
        if (fVar != null && !arrayList.isEmpty() && !this.f43364o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f43371w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f43365p;
            j3 = this.f43361l;
            if (z10) {
                long j15 = j1Var.f3061l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f43371w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f43371w;
                dVar.e = j16;
                dVar.f43345f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f43366q);
            this.f43369t = fVar2;
            n(fVar2);
        } catch (g e) {
            this.f43370u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f43370u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f43468k;
        if (aVar.i().e.equals(k0Var.e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f43468k.c(f0Var, dVar, j3), this.f43363n, this.v, this.f43371w);
        this.f43367r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f43370u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f43367r;
        e2.d.g(arrayList.remove(d0Var));
        this.f43468k.o(((d) d0Var).f43342a);
        if (arrayList.isEmpty() && !this.f43364o) {
            f fVar = this.f43369t;
            fVar.getClass();
            D(fVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f43370u = null;
        this.f43369t = null;
    }
}
