package u2;

import android.net.Uri;
import java.util.ArrayList;
public final class l1 implements d0, y2.g {
    public final g2.m f47326a;
    public final g2.g f47327b;
    public final g2.c0 f47328c;
    public final qb.b d;
    public final a5.a f47329e;
    public final p1 f47330f;
    public final ArrayList h = new ArrayList();
    public final long f47331n;
    public final y2.l f47332r;
    public final b2.s f47333s;
    public final boolean v;
    public boolean f47334w;
    public byte[] f47335x;
    public int f47336y;

    public l1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.s sVar, long j3, qb.b bVar, a5.a aVar, boolean z10, z2.a aVar2) {
        y2.l lVar;
        this.f47326a = mVar;
        this.f47327b = gVar;
        this.f47328c = c0Var;
        this.f47333s = sVar;
        this.f47331n = j3;
        this.d = bVar;
        this.f47329e = aVar;
        this.v = z10;
        this.f47330f = new p1(new b2.l1("", sVar));
        if (aVar2 != null) {
            lVar = new y2.l(aVar2);
        } else {
            lVar = new y2.l("SingleSampleMediaPeriod");
        }
        this.f47332r = lVar;
    }

    @Override
    public final boolean c() {
        return this.f47332r.d();
    }

    @Override
    public final long d() {
        if (!this.f47334w && !this.f47332r.d()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long h(long j3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                j1 j1Var = (j1) arrayList.get(i10);
                if (j1Var.f47314a == 2) {
                    j1Var.f47314a = 1;
                }
                i10++;
            } else {
                return j3;
            }
        }
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        c0Var.b(this);
    }

    @Override
    public final long l() {
        return -9223372036854775807L;
    }

    @Override
    public final boolean m(i2.s0 s0Var) {
        if (!this.f47334w) {
            y2.l lVar = this.f47332r;
            if (!lVar.d() && !lVar.c()) {
                g2.h createDataSource = this.f47327b.createDataSource();
                g2.c0 c0Var = this.f47328c;
                if (c0Var != null) {
                    createDataSource.addTransferListener(c0Var);
                }
                k1 k1Var = new k1(createDataSource, this.f47326a);
                this.d.getClass();
                lVar.f(k1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long n(x2.r[] rVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            c1 c1Var = c1VarArr[i10];
            ArrayList arrayList = this.h;
            if (c1Var != null && (rVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(c1Var);
                c1VarArr[i10] = null;
            }
            if (c1VarArr[i10] == null && rVarArr[i10] != null) {
                j1 j1Var = new j1(this);
                arrayList.add(j1Var);
                c1VarArr[i10] = j1Var;
                zArr2[i10] = true;
            }
        }
        return j3;
    }

    @Override
    public final p1 o() {
        return this.f47330f;
    }

    @Override
    public final long p() {
        if (this.f47334w) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override
    public final k4.d v(y2.i r15, long r16, long r18, java.io.IOException r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: u2.l1.v(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void x(y2.i iVar, long j3, long j10, int i10) {
        t tVar;
        k1 k1Var = (k1) iVar;
        g2.b0 b0Var = k1Var.f47321b;
        if (i10 == 0) {
            tVar = new t(k1Var.f47320a);
        } else {
            Uri uri = b0Var.f10162c;
            tVar = new t(j10);
        }
        this.f47329e.s(tVar, 1, -1, this.f47333s, 0, null, 0L, this.f47331n, i10);
    }

    @Override
    public final void x0(y2.i iVar, long j3, long j10, boolean z10) {
        Uri uri = ((k1) iVar).f47321b.f10162c;
        t tVar = new t(j10);
        this.d.getClass();
        this.f47329e.o(tVar, 1, -1, null, 0, null, 0L, this.f47331n);
    }

    @Override
    public final void y(y2.i iVar, long j3, long j10) {
        k1 k1Var = (k1) iVar;
        this.f47336y = (int) k1Var.f47321b.f10161b;
        byte[] bArr = k1Var.f47322c;
        bArr.getClass();
        this.f47335x = bArr;
        this.f47334w = true;
        Uri uri = k1Var.f47321b.f10162c;
        t tVar = new t(j10);
        this.d.getClass();
        this.f47329e.p(tVar, 1, -1, this.f47333s, 0, null, 0L, this.f47331n);
    }

    @Override
    public final void g() {
    }

    @Override
    public final void i(long j3) {
    }

    @Override
    public final void r(long j3) {
    }

    @Override
    public final long q(long j3, i2.q1 q1Var) {
        return j3;
    }
}
