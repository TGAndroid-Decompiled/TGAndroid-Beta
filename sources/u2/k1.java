package u2;

import android.net.Uri;
import i2.q1;
import java.util.ArrayList;
public final class k1 implements d0, y2.g {
    public final g2.m f43734a;
    public final g2.g f43735b;
    public final g2.c0 f43736c;
    public final qb.b d;
    public final a5.a e;
    public final o1 f43737f;
    public final ArrayList h = new ArrayList();
    public final long f43738n;
    public final y2.l f43739r;
    public final b2.s f43740s;
    public final boolean v;
    public boolean f43741w;
    public byte[] f43742x;
    public int f43743y;

    public k1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.s sVar, long j3, qb.b bVar, a5.a aVar, boolean z10, z2.a aVar2) {
        y2.l lVar;
        this.f43734a = mVar;
        this.f43735b = gVar;
        this.f43736c = c0Var;
        this.f43740s = sVar;
        this.f43738n = j3;
        this.d = bVar;
        this.e = aVar;
        this.v = z10;
        this.f43737f = new o1(new b2.l1("", sVar));
        if (aVar2 != null) {
            lVar = new y2.l(aVar2);
        } else {
            lVar = new y2.l("SingleSampleMediaPeriod");
        }
        this.f43739r = lVar;
    }

    @Override
    public final void G(y2.i iVar, long j3, long j10, boolean z10) {
        Uri uri = ((j1) iVar).f43727b.f9339c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.o(tVar, 1, -1, null, 0, null, 0L, this.f43738n);
    }

    @Override
    public final boolean c() {
        return this.f43739r.d();
    }

    @Override
    public final long d() {
        if (!this.f43741w && !this.f43739r.d()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final long i(long j3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                i1 i1Var = (i1) arrayList.get(i10);
                if (i1Var.f43720a == 2) {
                    i1Var.f43720a = 1;
                }
                i10++;
            } else {
                return j3;
            }
        }
    }

    @Override
    public final void k(c0 c0Var, long j3) {
        c0Var.e(this);
    }

    @Override
    public final k4.d l(y2.i r15, long r16, long r18, java.io.IOException r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: u2.k1.l(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void m(y2.i iVar, long j3, long j10, int i10) {
        t tVar;
        j1 j1Var = (j1) iVar;
        g2.b0 b0Var = j1Var.f43727b;
        if (i10 == 0) {
            tVar = new t(j1Var.f43726a);
        } else {
            Uri uri = b0Var.f9339c;
            tVar = new t(j10);
        }
        this.e.s(tVar, 1, -1, this.f43740s, 0, null, 0L, this.f43738n, i10);
    }

    @Override
    public final long n() {
        return -9223372036854775807L;
    }

    @Override
    public final boolean o(i2.s0 s0Var) {
        if (!this.f43741w) {
            y2.l lVar = this.f43739r;
            if (!lVar.d() && !lVar.c()) {
                g2.h createDataSource = this.f43735b.createDataSource();
                g2.c0 c0Var = this.f43736c;
                if (c0Var != null) {
                    createDataSource.addTransferListener(c0Var);
                }
                j1 j1Var = new j1(createDataSource, this.f43734a);
                this.d.getClass();
                lVar.f(j1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long p(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
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
    public final void q(y2.i iVar, long j3, long j10) {
        j1 j1Var = (j1) iVar;
        this.f43743y = (int) j1Var.f43727b.f9338b;
        byte[] bArr = j1Var.f43728c;
        bArr.getClass();
        this.f43742x = bArr;
        this.f43741w = true;
        Uri uri = j1Var.f43727b.f9339c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.p(tVar, 1, -1, this.f43740s, 0, null, 0L, this.f43738n);
    }

    @Override
    public final o1 r() {
        return this.f43737f;
    }

    @Override
    public final long s() {
        if (this.f43741w) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override
    public final void g() {
    }

    @Override
    public final void j(long j3) {
    }

    @Override
    public final void u(long j3) {
    }

    @Override
    public final long t(long j3, q1 q1Var) {
        return j3;
    }
}
