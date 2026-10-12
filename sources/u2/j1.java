package u2;

import android.net.Uri;
import i2.q1;
import java.util.ArrayList;
public final class j1 implements d0, y2.g {
    public final g2.m f48832a;
    public final g2.g f48833b;
    public final g2.c0 f48834c;
    public final t7.t d;
    public final a5.a f48835e;
    public final n1 f48836f;
    public final ArrayList h = new ArrayList();
    public final long f48837n;
    public final y2.l f48838r;
    public final b2.s f48839s;
    public final boolean v;
    public boolean f48840w;
    public byte[] f48841x;
    public int f48842y;

    public j1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.s sVar, long j3, t7.t tVar, a5.a aVar, boolean z10, z2.a aVar2) {
        y2.l lVar;
        this.f48832a = mVar;
        this.f48833b = gVar;
        this.f48834c = c0Var;
        this.f48839s = sVar;
        this.f48837n = j3;
        this.d = tVar;
        this.f48835e = aVar;
        this.v = z10;
        this.f48836f = new n1(new b2.l1("", sVar));
        if (aVar2 != null) {
            lVar = new y2.l(aVar2);
        } else {
            lVar = new y2.l("SingleSampleMediaPeriod");
        }
        this.f48838r = lVar;
    }

    @Override
    public final void C(y2.i iVar, long j3, long j10) {
        i1 i1Var = (i1) iVar;
        this.f48842y = (int) i1Var.f48827b.f10232b;
        byte[] bArr = i1Var.f48828c;
        bArr.getClass();
        this.f48841x = bArr;
        this.f48840w = true;
        Uri uri = i1Var.f48827b.f10233c;
        t tVar = new t(j10);
        this.d.getClass();
        this.f48835e.q(tVar, 1, -1, this.f48839s, 0, null, 0L, this.f48837n);
    }

    @Override
    public final void H(y2.i iVar, long j3, long j10, boolean z10) {
        Uri uri = ((i1) iVar).f48827b.f10233c;
        t tVar = new t(j10);
        this.d.getClass();
        this.f48835e.p(tVar, 1, -1, null, 0, null, 0L, this.f48837n);
    }

    @Override
    public final boolean c() {
        return this.f48838r.d();
    }

    @Override
    public final long d() {
        if (!this.f48840w && !this.f48838r.d()) {
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
                if (h1Var.f48819a == 2) {
                    h1Var.f48819a = 1;
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
        if (!this.f48840w) {
            y2.l lVar = this.f48838r;
            if (!lVar.d() && !lVar.c()) {
                g2.h createDataSource = this.f48833b.createDataSource();
                g2.c0 c0Var = this.f48834c;
                if (c0Var != null) {
                    createDataSource.addTransferListener(c0Var);
                }
                i1 i1Var = new i1(createDataSource, this.f48832a);
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
        return this.f48836f;
    }

    @Override
    public final long p() {
        if (this.f48840w) {
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
        g2.b0 b0Var = i1Var.f48827b;
        if (i10 == 0) {
            tVar = new t(i1Var.f48826a);
        } else {
            Uri uri = b0Var.f10233c;
            tVar = new t(j10);
        }
        this.f48835e.u(tVar, 1, -1, this.f48839s, 0, null, 0L, this.f48837n, i10);
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
