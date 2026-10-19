package u2;

import java.util.ArrayList;
import v7.u6;
public final class i extends t1 {
    public final long f47311l;
    public final long f47312m;
    public final boolean f47313n;
    public final boolean f47314o;
    public final boolean f47315p;
    public final boolean f47316q;
    public final ArrayList f47317r;
    public final b2.n1 f47318s;
    public g f47319t;
    public h f47320u;
    public long v;
    public long f47321w;

    public i(f fVar) {
        super(fVar.f47296a);
        this.f47311l = fVar.f47297b;
        this.f47312m = fVar.f47298c;
        this.f47313n = fVar.d;
        this.f47314o = fVar.e;
        this.f47315p = fVar.f47299f;
        this.f47316q = fVar.f47300g;
        this.f47317r = new ArrayList();
        this.f47318s = new b2.n1();
    }

    @Override
    public final void A(b2.o1 o1Var) {
        if (this.f47320u != null) {
            return;
        }
        D(o1Var);
    }

    public final void D(b2.o1 o1Var) {
        long j10;
        long j11;
        long j12;
        b2.n1 n1Var = this.f47318s;
        o1Var.n(0, n1Var);
        long j13 = n1Var.f3881p;
        g gVar = this.f47319t;
        long j14 = this.f47312m;
        long j15 = Long.MIN_VALUE;
        ArrayList arrayList = this.f47317r;
        if (gVar != null && !arrayList.isEmpty() && !this.f47314o) {
            j10 = this.v - j13;
            if (j14 != Long.MIN_VALUE) {
                j15 = this.f47321w - j13;
            }
            j12 = j15;
        } else {
            boolean z10 = this.f47315p;
            j10 = this.f47311l;
            if (z10) {
                long j16 = n1Var.f3877l;
                j10 += j16;
                j11 = j16 + j14;
            } else {
                j11 = j14;
            }
            this.v = j13 + j10;
            if (j14 != Long.MIN_VALUE) {
                j15 = j13 + j11;
            }
            this.f47321w = j15;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = (e) arrayList.get(i10);
                long j17 = this.v;
                long j18 = this.f47321w;
                eVar.f47294f = j17;
                eVar.h = j18;
            }
            j12 = j11;
        }
        try {
            g gVar2 = new g(o1Var, j10, j12, this.f47316q);
            this.f47319t = gVar2;
            n(gVar2);
        } catch (h e) {
            this.f47320u = e;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((e) arrayList.get(i11)).f47295n = this.f47320u;
            }
        }
    }

    @Override
    public final boolean a(b2.o0 o0Var) {
        a aVar = this.f47436k;
        if (aVar.i().e.equals(o0Var.e) && aVar.a(o0Var)) {
            return true;
        }
        return false;
    }

    @Override
    public final e0 c(g0 g0Var, androidx.biometric.e eVar, long j10) {
        e eVar2 = new e(this.f47436k.c(g0Var, eVar, j10), this.f47313n, this.v, this.f47321w, 0);
        this.f47317r.add(eVar2);
        return eVar2;
    }

    @Override
    public final void k() {
        h hVar = this.f47320u;
        if (hVar == null) {
            super.k();
            return;
        }
        throw hVar;
    }

    @Override
    public final void o(e0 e0Var) {
        ArrayList arrayList = this.f47317r;
        u6.p(arrayList.remove(e0Var));
        this.f47436k.o(((e) e0Var).f47291a);
        if (arrayList.isEmpty() && !this.f47314o) {
            g gVar = this.f47319t;
            gVar.getClass();
            D(gVar.e);
        }
    }

    @Override
    public final void q() {
        super.q();
        this.f47320u = null;
        this.f47319t = null;
    }
}
