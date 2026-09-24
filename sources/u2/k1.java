package u2;

import android.net.Uri;
import java.util.ArrayList;
public final class k1 implements d0, y2.h {
    public final g2.m f43675a;
    public final g2.g f43676b;
    public final g2.c0 f43677c;
    public final qb.b d;
    public final a5.a e;
    public final p1 f43678f;
    public final ArrayList h = new ArrayList();
    public final long f43679n;
    public final y2.m f43680r;
    public final b2.s f43681s;
    public final boolean v;
    public boolean f43682w;
    public byte[] f43683x;
    public int f43684y;

    public k1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.s sVar, long j3, qb.b bVar, a5.a aVar, boolean z10, z2.a aVar2) {
        y2.m mVar2;
        this.f43675a = mVar;
        this.f43676b = gVar;
        this.f43677c = c0Var;
        this.f43681s = sVar;
        this.f43679n = j3;
        this.d = bVar;
        this.e = aVar;
        this.v = z10;
        this.f43678f = new p1(new b2.l1("", sVar));
        if (aVar2 != null) {
            mVar2 = new y2.m(aVar2);
        } else {
            mVar2 = new y2.m("SingleSampleMediaPeriod");
        }
        this.f43680r = mVar2;
    }

    @Override
    public final void E(y2.j jVar, long j3, long j10, boolean z10) {
        Uri uri = ((j1) jVar).f43670b.f9334c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.o(tVar, 1, -1, null, 0, null, 0L, this.f43679n);
    }

    @Override
    public final boolean c() {
        return this.f43680r.d();
    }

    @Override
    public final long d() {
        if (!this.f43682w && !this.f43680r.d()) {
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
                i1 i1Var = (i1) arrayList.get(i10);
                if (i1Var.f43661a == 2) {
                    i1Var.f43661a = 1;
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
    public final k4.d m(y2.j r15, long r16, long r18, java.io.IOException r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: u2.k1.m(y2.j, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void n(y2.j jVar, long j3, long j10, int i10) {
        t tVar;
        j1 j1Var = (j1) jVar;
        g2.b0 b0Var = j1Var.f43670b;
        if (i10 == 0) {
            tVar = new t(j1Var.f43669a);
        } else {
            Uri uri = b0Var.f9334c;
            tVar = new t(j10);
        }
        this.e.s(tVar, 1, -1, this.f43681s, 0, null, 0L, this.f43679n, i10);
    }

    @Override
    public final void o(y2.j jVar, long j3, long j10) {
        j1 j1Var = (j1) jVar;
        this.f43684y = (int) j1Var.f43670b.f9333b;
        byte[] bArr = j1Var.f43671c;
        bArr.getClass();
        this.f43683x = bArr;
        this.f43682w = true;
        Uri uri = j1Var.f43670b.f9334c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.p(tVar, 1, -1, this.f43681s, 0, null, 0L, this.f43679n);
    }

    @Override
    public final boolean p(i2.s0 s0Var) {
        if (!this.f43682w) {
            y2.m mVar = this.f43680r;
            if (!mVar.d() && !mVar.c()) {
                g2.h createDataSource = this.f43676b.createDataSource();
                g2.c0 c0Var = this.f43677c;
                if (c0Var != null) {
                    createDataSource.addTransferListener(c0Var);
                }
                j1 j1Var = new j1(createDataSource, this.f43675a);
                this.d.getClass();
                mVar.f(j1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long q(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            b1 b1Var = b1VarArr[i10];
            ArrayList arrayList = this.h;
            if (b1Var != null && (rVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(b1Var);
                b1VarArr[i10] = null;
            }
            if (b1VarArr[i10] == null && rVarArr[i10] != null) {
                i1 i1Var = new i1(this);
                arrayList.add(i1Var);
                b1VarArr[i10] = i1Var;
                zArr2[i10] = true;
            }
        }
        return j3;
    }

    @Override
    public final p1 r() {
        return this.f43678f;
    }

    @Override
    public final long s() {
        if (this.f43682w) {
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
    public final void u(long j3) {
    }

    @Override
    public final long t(long j3, i2.q1 q1Var) {
        return j3;
    }
}
