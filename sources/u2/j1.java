package u2;

import android.net.Uri;
import i2.q1;
import java.util.ArrayList;
public final class j1 implements d0, y2.g {
    public final g2.m f48683a;
    public final g2.g f48684b;
    public final g2.c0 f48685c;
    public final rb.a d;
    public final a5.a f48686e;
    public final n1 f48687f;
    public final ArrayList h = new ArrayList();
    public final long f48688n;
    public final y2.l f48689r;
    public final b2.s f48690s;
    public final boolean v;
    public boolean f48691w;
    public byte[] f48692x;
    public int f48693y;

    public j1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.s sVar, long j3, rb.a aVar, a5.a aVar2, boolean z10, z2.a aVar3) {
        y2.l lVar;
        this.f48683a = mVar;
        this.f48684b = gVar;
        this.f48685c = c0Var;
        this.f48690s = sVar;
        this.f48688n = j3;
        this.d = aVar;
        this.f48686e = aVar2;
        this.v = z10;
        this.f48687f = new n1(new b2.l1("", sVar));
        if (aVar3 != null) {
            lVar = new y2.l(aVar3);
        } else {
            lVar = new y2.l("SingleSampleMediaPeriod");
        }
        this.f48689r = lVar;
    }

    @Override
    public final void C(y2.i iVar, long j3, long j10, int i10) {
        t tVar;
        i1 i1Var = (i1) iVar;
        g2.b0 b0Var = i1Var.f48678b;
        if (i10 == 0) {
            tVar = new t(i1Var.f48677a);
        } else {
            Uri uri = b0Var.f10234c;
            tVar = new t(j10);
        }
        this.f48686e.u(tVar, 1, -1, this.f48690s, 0, null, 0L, this.f48688n, i10);
    }

    @Override
    public final void F(y2.i iVar, long j3, long j10) {
        i1 i1Var = (i1) iVar;
        this.f48693y = (int) i1Var.f48678b.f10233b;
        byte[] bArr = i1Var.f48679c;
        bArr.getClass();
        this.f48692x = bArr;
        this.f48691w = true;
        Uri uri = i1Var.f48678b.f10234c;
        t tVar = new t(j10);
        this.d.getClass();
        this.f48686e.q(tVar, 1, -1, this.f48690s, 0, null, 0L, this.f48688n);
    }

    @Override
    public final void O0(y2.i iVar, long j3, long j10, boolean z10) {
        Uri uri = ((i1) iVar).f48678b.f10234c;
        t tVar = new t(j10);
        this.d.getClass();
        this.f48686e.p(tVar, 1, -1, null, 0, null, 0L, this.f48688n);
    }

    @Override
    public final boolean c() {
        return this.f48689r.d();
    }

    @Override
    public final long d() {
        if (!this.f48691w && !this.f48689r.d()) {
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
                h1 h1Var = (h1) arrayList.get(i10);
                if (h1Var.f48670a == 2) {
                    h1Var.f48670a = 1;
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
        if (!this.f48691w) {
            y2.l lVar = this.f48689r;
            if (!lVar.d() && !lVar.c()) {
                g2.h createDataSource = this.f48684b.createDataSource();
                g2.c0 c0Var = this.f48685c;
                if (c0Var != null) {
                    createDataSource.addTransferListener(c0Var);
                }
                i1 i1Var = new i1(createDataSource, this.f48683a);
                this.d.getClass();
                lVar.f(i1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long o(x2.r[] rVarArr, boolean[] zArr, a1[] a1VarArr, boolean[] zArr2, long j3) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            a1 a1Var = a1VarArr[i10];
            ArrayList arrayList = this.h;
            if (a1Var != null && (rVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(a1Var);
                a1VarArr[i10] = null;
            }
            if (a1VarArr[i10] == null && rVarArr[i10] != null) {
                h1 h1Var = new h1(this);
                arrayList.add(h1Var);
                a1VarArr[i10] = h1Var;
                zArr2[i10] = true;
            }
        }
        return j3;
    }

    @Override
    public final n1 p() {
        return this.f48687f;
    }

    @Override
    public final long q() {
        if (this.f48691w) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override
    public final k4.d y(y2.i r14, long r15, long r17, java.io.IOException r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: u2.j1.y(y2.i, long, long, java.io.IOException, int):k4.d");
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
