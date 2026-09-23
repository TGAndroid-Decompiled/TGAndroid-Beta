package u2;

import android.net.Uri;
import i2.q1;
import java.util.ArrayList;
public final class j1 implements d0, y2.h {
    public final g2.m f43328a;
    public final g2.g f43329b;
    public final g2.c0 f43330c;
    public final qb.b d;
    public final a5.a e;
    public final n1 f43331f;
    public final ArrayList h = new ArrayList();
    public final long f43332n;
    public final y2.m f43333r;
    public final b2.s f43334s;
    public final boolean v;
    public boolean f43335w;
    public byte[] f43336x;
    public int f43337y;

    public j1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.s sVar, long j3, qb.b bVar, a5.a aVar, boolean z10, z2.a aVar2) {
        y2.m mVar2;
        this.f43328a = mVar;
        this.f43329b = gVar;
        this.f43330c = c0Var;
        this.f43334s = sVar;
        this.f43332n = j3;
        this.d = bVar;
        this.e = aVar;
        this.v = z10;
        this.f43331f = new n1(new b2.l1("", sVar));
        if (aVar2 != null) {
            mVar2 = new y2.m(aVar2);
        } else {
            mVar2 = new y2.m("SingleSampleMediaPeriod");
        }
        this.f43333r = mVar2;
    }

    @Override
    public final void V(y2.j jVar, long j3, long j10, boolean z10) {
        Uri uri = ((i1) jVar).f43323b.f9335c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.o(tVar, 1, -1, null, 0, null, 0L, this.f43332n);
    }

    @Override
    public final boolean c() {
        return this.f43333r.d();
    }

    @Override
    public final long d() {
        if (!this.f43335w && !this.f43333r.d()) {
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
                if (h1Var.f43315a == 2) {
                    h1Var.f43315a = 1;
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
        if (!this.f43335w) {
            y2.m mVar = this.f43333r;
            if (!mVar.d() && !mVar.c()) {
                g2.h createDataSource = this.f43329b.createDataSource();
                g2.c0 c0Var = this.f43330c;
                if (c0Var != null) {
                    createDataSource.addTransferListener(c0Var);
                }
                i1 i1Var = new i1(createDataSource, this.f43328a);
                this.d.getClass();
                mVar.f(i1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final k4.d n(y2.j r15, long r16, long r18, java.io.IOException r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: u2.j1.n(y2.j, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void o(y2.j jVar, long j3, long j10, int i10) {
        t tVar;
        i1 i1Var = (i1) jVar;
        g2.b0 b0Var = i1Var.f43323b;
        if (i10 == 0) {
            tVar = new t(i1Var.f43322a);
        } else {
            Uri uri = b0Var.f9335c;
            tVar = new t(j10);
        }
        this.e.s(tVar, 1, -1, this.f43334s, 0, null, 0L, this.f43332n, i10);
    }

    @Override
    public final long p(x2.r[] rVarArr, boolean[] zArr, a1[] a1VarArr, boolean[] zArr2, long j3) {
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
    public final void q(y2.j jVar, long j3, long j10) {
        i1 i1Var = (i1) jVar;
        this.f43337y = (int) i1Var.f43323b.f9334b;
        byte[] bArr = i1Var.f43324c;
        bArr.getClass();
        this.f43336x = bArr;
        this.f43335w = true;
        Uri uri = i1Var.f43323b.f9335c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.p(tVar, 1, -1, this.f43334s, 0, null, 0L, this.f43332n);
    }

    @Override
    public final n1 r() {
        return this.f43331f;
    }

    @Override
    public final long s() {
        if (this.f43335w) {
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
    public final long t(long j3, q1 q1Var) {
        return j3;
    }
}
