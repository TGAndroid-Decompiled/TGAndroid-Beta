package u2;

import android.net.Uri;
import i2.q1;
import java.util.ArrayList;
public final class j1 implements d0, y2.g {
    public final g2.m f48824a;
    public final g2.g f48825b;
    public final g2.c0 f48826c;
    public final t7.t d;
    public final a5.a f48827e;
    public final n1 f48828f;
    public final ArrayList h = new ArrayList();
    public final long f48829n;
    public final y2.l f48830r;
    public final b2.s f48831s;
    public final boolean v;
    public boolean f48832w;
    public byte[] f48833x;
    public int f48834y;

    public j1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.s sVar, long j3, t7.t tVar, a5.a aVar, boolean z10, z2.a aVar2) {
        y2.l lVar;
        this.f48824a = mVar;
        this.f48825b = gVar;
        this.f48826c = c0Var;
        this.f48831s = sVar;
        this.f48829n = j3;
        this.d = tVar;
        this.f48827e = aVar;
        this.v = z10;
        this.f48828f = new n1(new b2.l1("", sVar));
        if (aVar2 != null) {
            lVar = new y2.l(aVar2);
        } else {
            lVar = new y2.l("SingleSampleMediaPeriod");
        }
        this.f48830r = lVar;
    }

    @Override
    public final void C(y2.i iVar, long j3, long j10) {
        i1 i1Var = (i1) iVar;
        this.f48834y = (int) i1Var.f48819b.f10232b;
        byte[] bArr = i1Var.f48820c;
        bArr.getClass();
        this.f48833x = bArr;
        this.f48832w = true;
        Uri uri = i1Var.f48819b.f10233c;
        t tVar = new t(j10);
        this.d.getClass();
        this.f48827e.q(tVar, 1, -1, this.f48831s, 0, null, 0L, this.f48829n);
    }

    @Override
    public final void H(y2.i iVar, long j3, long j10, boolean z10) {
        Uri uri = ((i1) iVar).f48819b.f10233c;
        t tVar = new t(j10);
        this.d.getClass();
        this.f48827e.p(tVar, 1, -1, null, 0, null, 0L, this.f48829n);
    }

    @Override
    public final boolean c() {
        return this.f48830r.d();
    }

    @Override
    public final long d() {
        if (!this.f48832w && !this.f48830r.d()) {
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
                if (h1Var.f48811a == 2) {
                    h1Var.f48811a = 1;
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
    public final long l() {
        return -9223372036854775807L;
    }

    @Override
    public final boolean m(i2.s0 s0Var) {
        if (!this.f48832w) {
            y2.l lVar = this.f48830r;
            if (!lVar.d() && !lVar.c()) {
                g2.h createDataSource = this.f48825b.createDataSource();
                g2.c0 c0Var = this.f48826c;
                if (c0Var != null) {
                    createDataSource.addTransferListener(c0Var);
                }
                i1 i1Var = new i1(createDataSource, this.f48824a);
                this.d.getClass();
                lVar.f(i1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long n(x2.r[] rVarArr, boolean[] zArr, a1[] a1VarArr, boolean[] zArr2, long j3) {
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
    public final n1 o() {
        return this.f48828f;
    }

    @Override
    public final long p() {
        if (this.f48832w) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override
    public final k4.d x(y2.i r14, long r15, long r17, java.io.IOException r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: u2.j1.x(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void y(y2.i iVar, long j3, long j10, int i10) {
        t tVar;
        i1 i1Var = (i1) iVar;
        g2.b0 b0Var = i1Var.f48819b;
        if (i10 == 0) {
            tVar = new t(i1Var.f48818a);
        } else {
            Uri uri = b0Var.f10233c;
            tVar = new t(j10);
        }
        this.f48827e.u(tVar, 1, -1, this.f48831s, 0, null, 0L, this.f48829n, i10);
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
    public final long q(long j3, q1 q1Var) {
        return j3;
    }
}
