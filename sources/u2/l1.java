package u2;

import android.net.Uri;
import java.util.ArrayList;
public final class l1 implements d0, y2.h {
    public final g2.m f43709a;
    public final g2.g f43710b;
    public final g2.c0 f43711c;
    public final qb.b d;
    public final a5.a e;
    public final p1 f43712f;
    public final ArrayList h = new ArrayList();
    public final long f43713n;
    public final y2.m f43714r;
    public final b2.s f43715s;
    public final boolean v;
    public boolean f43716w;
    public byte[] f43717x;
    public int f43718y;

    public l1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.s sVar, long j3, qb.b bVar, a5.a aVar, boolean z10, z2.a aVar2) {
        y2.m mVar2;
        this.f43709a = mVar;
        this.f43710b = gVar;
        this.f43711c = c0Var;
        this.f43715s = sVar;
        this.f43713n = j3;
        this.d = bVar;
        this.e = aVar;
        this.v = z10;
        this.f43712f = new p1(new b2.l1("", sVar));
        if (aVar2 != null) {
            mVar2 = new y2.m(aVar2);
        } else {
            mVar2 = new y2.m("SingleSampleMediaPeriod");
        }
        this.f43714r = mVar2;
    }

    @Override
    public final void F(y2.j jVar, long j3, long j10, boolean z10) {
        Uri uri = ((k1) jVar).f43705b.f9352c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.o(tVar, 1, -1, null, 0, null, 0L, this.f43713n);
    }

    @Override
    public final boolean c() {
        return this.f43714r.d();
    }

    @Override
    public final long d() {
        if (!this.f43716w && !this.f43714r.d()) {
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
                if (j1Var.f43696a == 2) {
                    j1Var.f43696a = 1;
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
        throw new UnsupportedOperationException("Method not decompiled: u2.l1.m(y2.j, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void n(y2.j jVar, long j3, long j10, int i10) {
        t tVar;
        k1 k1Var = (k1) jVar;
        g2.b0 b0Var = k1Var.f43705b;
        if (i10 == 0) {
            tVar = new t(k1Var.f43704a);
        } else {
            Uri uri = b0Var.f9352c;
            tVar = new t(j10);
        }
        this.e.s(tVar, 1, -1, this.f43715s, 0, null, 0L, this.f43713n, i10);
    }

    @Override
    public final void o(y2.j jVar, long j3, long j10) {
        k1 k1Var = (k1) jVar;
        this.f43718y = (int) k1Var.f43705b.f9351b;
        byte[] bArr = k1Var.f43706c;
        bArr.getClass();
        this.f43717x = bArr;
        this.f43716w = true;
        Uri uri = k1Var.f43705b.f9352c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.p(tVar, 1, -1, this.f43715s, 0, null, 0L, this.f43713n);
    }

    @Override
    public final boolean p(i2.r0 r0Var) {
        if (!this.f43716w) {
            y2.m mVar = this.f43714r;
            if (!mVar.d() && !mVar.c()) {
                g2.h createDataSource = this.f43710b.createDataSource();
                g2.c0 c0Var = this.f43711c;
                if (c0Var != null) {
                    createDataSource.addTransferListener(c0Var);
                }
                k1 k1Var = new k1(createDataSource, this.f43709a);
                this.d.getClass();
                mVar.f(k1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long q(x2.s[] sVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
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
    public final p1 r() {
        return this.f43712f;
    }

    @Override
    public final long s() {
        if (this.f43716w) {
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
    public final long t(long j3, i2.p1 p1Var) {
        return j3;
    }
}
