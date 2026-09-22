package u2;

import android.net.Uri;
import java.util.ArrayList;
public final class l1 implements d0, y2.h {
    public final g2.m f43730a;
    public final g2.g f43731b;
    public final g2.c0 f43732c;
    public final qb.b d;
    public final a5.a e;
    public final p1 f43733f;
    public final ArrayList h = new ArrayList();
    public final long f43734n;
    public final y2.m f43735r;
    public final b2.s f43736s;
    public final boolean v;
    public boolean f43737w;
    public byte[] f43738x;
    public int f43739y;

    public l1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.s sVar, long j3, qb.b bVar, a5.a aVar, boolean z10, z2.a aVar2) {
        y2.m mVar2;
        this.f43730a = mVar;
        this.f43731b = gVar;
        this.f43732c = c0Var;
        this.f43736s = sVar;
        this.f43734n = j3;
        this.d = bVar;
        this.e = aVar;
        this.v = z10;
        this.f43733f = new p1(new b2.l1("", sVar));
        if (aVar2 != null) {
            mVar2 = new y2.m(aVar2);
        } else {
            mVar2 = new y2.m("SingleSampleMediaPeriod");
        }
        this.f43735r = mVar2;
    }

    @Override
    public final void S(y2.j jVar, long j3, long j10, boolean z10) {
        Uri uri = ((k1) jVar).f43726b.f9352c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.o(tVar, 1, -1, null, 0, null, 0L, this.f43734n);
    }

    @Override
    public final boolean c() {
        return this.f43735r.d();
    }

    @Override
    public final long d() {
        if (!this.f43737w && !this.f43735r.d()) {
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
                if (j1Var.f43717a == 2) {
                    j1Var.f43717a = 1;
                }
                i10++;
            } else {
                return j3;
            }
        }
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        c0Var.a(this);
    }

    @Override
    public final long m() {
        return -9223372036854775807L;
    }

    @Override
    public final k4.d n(y2.j r15, long r16, long r18, java.io.IOException r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: u2.l1.n(y2.j, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void o(y2.j jVar, long j3, long j10, int i10) {
        t tVar;
        k1 k1Var = (k1) jVar;
        g2.b0 b0Var = k1Var.f43726b;
        if (i10 == 0) {
            tVar = new t(k1Var.f43725a);
        } else {
            Uri uri = b0Var.f9352c;
            tVar = new t(j10);
        }
        this.e.s(tVar, 1, -1, this.f43736s, 0, null, 0L, this.f43734n, i10);
    }

    @Override
    public final void p(y2.j jVar, long j3, long j10) {
        k1 k1Var = (k1) jVar;
        this.f43739y = (int) k1Var.f43726b.f9351b;
        byte[] bArr = k1Var.f43727c;
        bArr.getClass();
        this.f43738x = bArr;
        this.f43737w = true;
        Uri uri = k1Var.f43726b.f9352c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.p(tVar, 1, -1, this.f43736s, 0, null, 0L, this.f43734n);
    }

    @Override
    public final boolean q(i2.r0 r0Var) {
        if (!this.f43737w) {
            y2.m mVar = this.f43735r;
            if (!mVar.d() && !mVar.c()) {
                g2.h createDataSource = this.f43731b.createDataSource();
                g2.c0 c0Var = this.f43732c;
                if (c0Var != null) {
                    createDataSource.addTransferListener(c0Var);
                }
                k1 k1Var = new k1(createDataSource, this.f43730a);
                this.d.getClass();
                mVar.f(k1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long r(x2.s[] sVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            c1 c1Var = c1VarArr[i10];
            ArrayList arrayList = this.h;
            if (c1Var != null && (sVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(c1Var);
                c1VarArr[i10] = null;
            }
            if (c1VarArr[i10] == null && sVarArr[i10] != null) {
                j1 j1Var = new j1(this);
                arrayList.add(j1Var);
                c1VarArr[i10] = j1Var;
                zArr2[i10] = true;
            }
        }
        return j3;
    }

    @Override
    public final p1 s() {
        return this.f43733f;
    }

    @Override
    public final long t() {
        if (this.f43737w) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override
    public final void g() {
    }

    @Override
    public final void i(long j3) {
    }

    @Override
    public final void v(long j3) {
    }

    @Override
    public final long u(long j3, i2.p1 p1Var) {
        return j3;
    }
}
