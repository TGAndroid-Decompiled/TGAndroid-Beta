package u2;

import java.util.ArrayList;
public final class h extends p1 {
    public final long f46672l;
    public final long f46673m;
    public final boolean f46674n;
    public final boolean f46675o;
    public final boolean f46676p;
    public final boolean f46677q;
    public final ArrayList f46678r;
    public final b2.j1 f46679s;
    public f f46680t;
    public g f46681u;
    public long v;
    public long f46682w;

    public h(e eVar) {
        super(eVar.f46655a);
        this.f46672l = eVar.f46656b;
        this.f46673m = eVar.f46657c;
        this.f46674n = eVar.d;
        this.f46675o = eVar.f46658e;
        this.f46676p = eVar.f46659f;
        this.f46677q = eVar.f46660g;
        this.f46678r = new ArrayList();
        this.f46679s = new b2.j1();
    }

    @Override
    public final void A(b2.k1 k1Var) {
        if (this.f46681u != null) {
            return;
        }
        D(k1Var);
    }

    public final void D(b2.k1 k1Var) {
        long j3;
        long j10;
        long j11;
        b2.j1 j1Var = this.f46679s;
        k1Var.n(0, j1Var);
        long j12 = j1Var.f2119p;
        f fVar = this.f46680t;
        long j13 = this.f46673m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f46678r;
        if (fVar != null && !arrayList.isEmpty() && !this.f46675o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f46682w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f46676p;
            j3 = this.f46672l;
            if (z10) {
                long j15 = j1Var.f2115l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f46682w = j14;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                d dVar = (d) arrayList.get(i10);
                long j16 = this.v;
                long j17 = this.f46682w;
                dVar.f46653e = j16;
                dVar.f46654f = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(k1Var, j3, j11, this.f46677q);
            this.f46680t = fVar2;
            n(fVar2);
        } catch (g e7) {
            this.f46681u = e7;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((d) arrayList.get(i11)).h = this.f46681u;
            }
        }
    }

    @Override
    public final boolean a(b2.k0 k0Var) {
        a aVar = this.f46785k;
        if (aVar.i().f2129e.equals(k0Var.f2129e) && aVar.a(k0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, y2.d dVar, long j3) {
        d dVar2 = new d(this.f46785k.c(f0Var, dVar, j3), this.f46674n, this.v, this.f46682w);
        this.f46678r.add(dVar2);
        return dVar2;
    }

    @Override
    public final void k() {
        g gVar = this.f46681u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f46678r;
        e2.d.g(arrayList.remove(d0Var));
        this.f46785k.o(((d) d0Var).f46650a);
        if (arrayList.isEmpty() && !this.f46675o) {
            f fVar = this.f46680t;
            fVar.getClass();
            D(fVar.f46787e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f46681u = null;
        this.f46680t = null;
    }
}
