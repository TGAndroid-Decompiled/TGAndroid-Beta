package x2;

import a8.ja;
import java.util.ArrayList;
public final class h extends s1 {
    public final long f59528l;
    public final long f59529m;
    public final boolean f59530n;
    public final boolean f59531o;
    public final boolean f59532p;
    public final boolean f59533q;
    public final ArrayList f59534r;
    public final e2.k1 f59535s;
    public f f59536t;
    public g f59537u;
    public long v;
    public long f59538w;

    public h(e eVar) {
        super(eVar.f59511a);
        this.f59528l = eVar.f59512b;
        this.f59529m = eVar.f59513c;
        this.f59530n = eVar.d;
        this.f59531o = eVar.f59514e;
        this.f59532p = eVar.f59515f;
        this.f59533q = eVar.f59516g;
        this.f59534r = new ArrayList();
        this.f59535s = new e2.k1();
    }

    @Override
    public final void A(e2.l1 l1Var) {
        if (this.f59537u != null) {
            return;
        }
        D(l1Var);
    }

    public final void D(e2.l1 l1Var) {
        long j3;
        long j10;
        long j11;
        e2.k1 k1Var = this.f59535s;
        l1Var.n(0, k1Var);
        long j12 = k1Var.f10173p;
        f fVar = this.f59536t;
        long j13 = this.f59529m;
        long j14 = Long.MIN_VALUE;
        ArrayList arrayList = this.f59534r;
        if (fVar != null && !arrayList.isEmpty() && !this.f59531o) {
            j3 = this.v - j12;
            if (j13 != Long.MIN_VALUE) {
                j14 = this.f59538w - j12;
            }
            j11 = j14;
        } else {
            boolean z10 = this.f59532p;
            j3 = this.f59528l;
            if (z10) {
                long j15 = k1Var.f10169l;
                j3 += j15;
                j10 = j15 + j13;
            } else {
                j10 = j13;
            }
            this.v = j12 + j3;
            if (j13 != Long.MIN_VALUE) {
                j14 = j12 + j10;
            }
            this.f59538w = j14;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                d dVar = (d) arrayList.get(i7);
                long j16 = this.v;
                long j17 = this.f59538w;
                dVar.f59509f = j16;
                dVar.h = j17;
            }
            j11 = j10;
        }
        try {
            f fVar2 = new f(l1Var, j3, j11, this.f59533q);
            this.f59536t = fVar2;
            n(fVar2);
        } catch (g e10) {
            this.f59537u = e10;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((d) arrayList.get(i10)).f59510n = this.f59537u;
            }
        }
    }

    @Override
    public final boolean a(e2.l0 l0Var) {
        a aVar = this.f59663k;
        if (aVar.i().f10188e.equals(l0Var.f10188e) && aVar.a(l0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final d0 c(f0 f0Var, h6.m mVar, long j3) {
        d dVar = new d(this.f59663k.c(f0Var, mVar, j3), this.f59530n, this.v, this.f59538w, 0);
        this.f59534r.add(dVar);
        return dVar;
    }

    @Override
    public final void k() {
        g gVar = this.f59537u;
        if (gVar == null) {
            super.k();
            return;
        }
        throw gVar;
    }

    @Override
    public final void o(d0 d0Var) {
        ArrayList arrayList = this.f59534r;
        ja.p(arrayList.remove(d0Var));
        this.f59663k.o(((d) d0Var).f59505a);
        if (arrayList.isEmpty() && !this.f59531o) {
            f fVar = this.f59536t;
            fVar.getClass();
            D(fVar.f59643e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f59537u = null;
        this.f59536t = null;
    }
}
