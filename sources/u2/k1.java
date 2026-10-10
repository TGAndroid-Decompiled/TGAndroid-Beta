package u2;

import android.net.Uri;
import i2.q1;
import java.util.ArrayList;
public final class k1 implements d0, y2.g {
    public final g2.m f48665a;
    public final g2.g f48666b;
    public final g2.c0 f48667c;
    public final rb.a d;
    public final a5.a f48668e;
    public final o1 f48669f;
    public final ArrayList h = new ArrayList();
    public final long f48670n;
    public final y2.l f48671r;
    public final b2.s f48672s;
    public final boolean v;
    public boolean f48673w;
    public byte[] f48674x;
    public int f48675y;

    public k1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.s sVar, long j3, rb.a aVar, a5.a aVar2, boolean z10, z2.a aVar3) {
        y2.l lVar;
        this.f48665a = mVar;
        this.f48666b = gVar;
        this.f48667c = c0Var;
        this.f48672s = sVar;
        this.f48670n = j3;
        this.d = aVar;
        this.f48668e = aVar2;
        this.v = z10;
        this.f48669f = new o1(new b2.l1("", sVar));
        if (aVar3 != null) {
            lVar = new y2.l(aVar3);
        } else {
            lVar = new y2.l("SingleSampleMediaPeriod");
        }
        this.f48671r = lVar;
    }

    @Override
    public final void C(y2.i iVar, long j3, long j10, int i10) {
        t tVar;
        j1 j1Var = (j1) iVar;
        g2.b0 b0Var = j1Var.f48658b;
        if (i10 == 0) {
            tVar = new t(j1Var.f48657a);
        } else {
            Uri uri = b0Var.f10235c;
            tVar = new t(j10);
        }
        this.f48668e.u(tVar, 1, -1, this.f48672s, 0, null, 0L, this.f48670n, i10);
    }

    @Override
    public final void F(y2.i iVar, long j3, long j10) {
        j1 j1Var = (j1) iVar;
        this.f48675y = (int) j1Var.f48658b.f10234b;
        byte[] bArr = j1Var.f48659c;
        bArr.getClass();
        this.f48674x = bArr;
        this.f48673w = true;
        Uri uri = j1Var.f48658b.f10235c;
        t tVar = new t(j10);
        this.d.getClass();
        this.f48668e.q(tVar, 1, -1, this.f48672s, 0, null, 0L, this.f48670n);
    }

    @Override
    public final void O0(y2.i iVar, long j3, long j10, boolean z10) {
        Uri uri = ((j1) iVar).f48658b.f10235c;
        t tVar = new t(j10);
        this.d.getClass();
        this.f48668e.p(tVar, 1, -1, null, 0, null, 0L, this.f48670n);
    }

    @Override
    public final boolean c() {
        return this.f48671r.d();
    }

    @Override
    public final long d() {
        if (!this.f48673w && !this.f48671r.d()) {
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
                if (i1Var.f48651a == 2) {
                    i1Var.f48651a = 1;
                }
                i10++;
            } else {
                return j3;
            }
        }
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        c0Var.m(this);
    }

    @Override
    public final long l() {
        return -9223372036854775807L;
    }

    @Override
    public final boolean n(i2.s0 s0Var) {
        if (!this.f48673w) {
            y2.l lVar = this.f48671r;
            if (!lVar.d() && !lVar.c()) {
                g2.h createDataSource = this.f48666b.createDataSource();
                g2.c0 c0Var = this.f48667c;
                if (c0Var != null) {
                    createDataSource.addTransferListener(c0Var);
                }
                j1 j1Var = new j1(createDataSource, this.f48665a);
                this.d.getClass();
                lVar.f(j1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long o(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
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
    public final o1 p() {
        return this.f48669f;
    }

    @Override
    public final long q() {
        if (this.f48673w) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override
    public final k4.d y(y2.i r14, long r15, long r17, java.io.IOException r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: u2.k1.y(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void g() {
    }

    @Override
    public final void i(long j3) {
    }

    @Override
    public final void s(long j3) {
    }

    @Override
    public final long r(long j3, q1 q1Var) {
        return j3;
    }
}
