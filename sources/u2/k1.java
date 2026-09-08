package u2;

import android.net.Uri;
import java.util.ArrayList;
public final class k1 implements d0, y2.h {
    public final g2.m f46746a;
    public final g2.g f46747b;
    public final g2.c0 f46748c;
    public final rb.a d;
    public final a5.a f46749e;
    public final o1 f46750f;
    public final ArrayList h = new ArrayList();
    public final long f46751n;
    public final y2.m f46752r;
    public final b2.s f46753s;
    public final boolean v;
    public boolean f46754w;
    public byte[] f46755x;
    public int f46756y;

    public k1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.s sVar, long j3, rb.a aVar, a5.a aVar2, boolean z10, z2.a aVar3) {
        y2.m mVar2;
        this.f46746a = mVar;
        this.f46747b = gVar;
        this.f46748c = c0Var;
        this.f46753s = sVar;
        this.f46751n = j3;
        this.d = aVar;
        this.f46749e = aVar2;
        this.v = z10;
        this.f46750f = new o1(new b2.l1("", sVar));
        if (aVar3 != null) {
            mVar2 = new y2.m(aVar3);
        } else {
            mVar2 = new y2.m("SingleSampleMediaPeriod");
        }
        this.f46752r = mVar2;
    }

    @Override
    public final boolean c() {
        return this.f46752r.d();
    }

    @Override
    public final long d() {
        if (!this.f46754w && !this.f46752r.d()) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override
    public final k4.d g(y2.j r15, long r16, long r18, java.io.IOException r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: u2.k1.g(y2.j, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void h(y2.j jVar, long j3, long j10, int i10) {
        t tVar;
        j1 j1Var = (j1) jVar;
        g2.b0 b0Var = j1Var.f46741b;
        if (i10 == 0) {
            tVar = new t(j1Var.f46740a);
        } else {
            Uri uri = b0Var.f10326c;
            tVar = new t(j10);
        }
        this.f46749e.r(tVar, 1, -1, this.f46753s, 0, null, 0L, this.f46751n, i10);
    }

    @Override
    public final void i(y2.j jVar, long j3, long j10) {
        j1 j1Var = (j1) jVar;
        this.f46756y = (int) j1Var.f46741b.f10325b;
        byte[] bArr = j1Var.f46742c;
        bArr.getClass();
        this.f46755x = bArr;
        this.f46754w = true;
        Uri uri = j1Var.f46741b.f10326c;
        t tVar = new t(j10);
        this.d.getClass();
        this.f46749e.o(tVar, 1, -1, this.f46753s, 0, null, 0L, this.f46751n);
    }

    @Override
    public final long k(long j3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 < arrayList.size()) {
                i1 i1Var = (i1) arrayList.get(i10);
                if (i1Var.f46732a == 2) {
                    i1Var.f46732a = 1;
                }
                i10++;
            } else {
                return j3;
            }
        }
    }

    @Override
    public final void n(c0 c0Var, long j3) {
        c0Var.a(this);
    }

    @Override
    public final long o() {
        return -9223372036854775807L;
    }

    @Override
    public final boolean p(i2.r0 r0Var) {
        if (!this.f46754w) {
            y2.m mVar = this.f46752r;
            if (!mVar.d() && !mVar.c()) {
                g2.h createDataSource = this.f46747b.createDataSource();
                g2.c0 c0Var = this.f46748c;
                if (c0Var != null) {
                    createDataSource.addTransferListener(c0Var);
                }
                j1 j1Var = new j1(createDataSource, this.f46746a);
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
    public final o1 r() {
        return this.f46750f;
    }

    @Override
    public final long s() {
        if (this.f46754w) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override
    public final void w(y2.j jVar, long j3, long j10, boolean z10) {
        Uri uri = ((j1) jVar).f46741b.f10326c;
        t tVar = new t(j10);
        this.d.getClass();
        this.f46749e.n(tVar, 1, -1, null, 0, null, 0L, this.f46751n);
    }

    @Override
    public final void j() {
    }

    @Override
    public final void l(long j3) {
    }

    @Override
    public final void u(long j3) {
    }

    @Override
    public final long t(long j3, i2.p1 p1Var) {
        return j3;
    }
}
