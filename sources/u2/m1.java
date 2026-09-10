package u2;

import android.net.Uri;
import java.util.ArrayList;
public final class m1 implements e0, y2.i {
    public final g2.m f42380a;
    public final g2.g f42381b;
    public final g2.c0 f42382c;
    public final rb.a d;
    public final a5.a e;
    public final q1 f42383f;
    public final ArrayList h = new ArrayList();
    public final long f42384n;
    public final y2.n f42385r;
    public final b2.s f42386s;
    public final boolean v;
    public boolean f42387w;
    public byte[] f42388x;
    public int f42389y;

    public m1(g2.m mVar, g2.g gVar, g2.c0 c0Var, b2.s sVar, long j3, rb.a aVar, a5.a aVar2, boolean z10, z2.a aVar3) {
        y2.n nVar;
        this.f42380a = mVar;
        this.f42381b = gVar;
        this.f42382c = c0Var;
        this.f42386s = sVar;
        this.f42384n = j3;
        this.d = aVar;
        this.e = aVar2;
        this.v = z10;
        this.f42383f = new q1(new b2.l1("", sVar));
        if (aVar3 != null) {
            nVar = new y2.n(aVar3);
        } else {
            nVar = new y2.n("SingleSampleMediaPeriod");
        }
        this.f42385r = nVar;
    }

    @Override
    public final void C(y2.k kVar, long j3, long j10, boolean z10) {
        Uri uri = ((l1) kVar).f42376b.f8480c;
        u uVar = new u(j10);
        this.d.getClass();
        this.e.m(uVar, 1, -1, null, 0, null, 0L, this.f42384n);
    }

    @Override
    public final boolean c() {
        return this.f42385r.d();
    }

    @Override
    public final long d() {
        if (!this.f42387w && !this.f42385r.d()) {
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
                k1 k1Var = (k1) arrayList.get(i10);
                if (k1Var.f42367a == 2) {
                    k1Var.f42367a = 1;
                }
                i10++;
            } else {
                return j3;
            }
        }
    }

    @Override
    public final void j(d0 d0Var, long j3) {
        d0Var.b(this);
    }

    @Override
    public final k4.d k(y2.k r15, long r16, long r18, java.io.IOException r20, int r21) {
        throw new UnsupportedOperationException("Method not decompiled: u2.m1.k(y2.k, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void l(y2.k kVar, long j3, long j10, int i10) {
        u uVar;
        l1 l1Var = (l1) kVar;
        g2.b0 b0Var = l1Var.f42376b;
        if (i10 == 0) {
            uVar = new u(l1Var.f42375a);
        } else {
            Uri uri = b0Var.f8480c;
            uVar = new u(j10);
        }
        this.e.r(uVar, 1, -1, this.f42386s, 0, null, 0L, this.f42384n, i10);
    }

    @Override
    public final long m() {
        return -9223372036854775807L;
    }

    @Override
    public final boolean n(i2.q0 q0Var) {
        if (!this.f42387w) {
            y2.n nVar = this.f42385r;
            if (!nVar.d() && !nVar.c()) {
                g2.h createDataSource = this.f42381b.createDataSource();
                g2.c0 c0Var = this.f42382c;
                if (c0Var != null) {
                    createDataSource.addTransferListener(c0Var);
                }
                l1 l1Var = new l1(createDataSource, this.f42380a);
                this.d.getClass();
                nVar.f(l1Var, this, 3);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final long o(x2.r[] rVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            d1 d1Var = d1VarArr[i10];
            ArrayList arrayList = this.h;
            if (d1Var != null && (rVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(d1Var);
                d1VarArr[i10] = null;
            }
            if (d1VarArr[i10] == null && rVarArr[i10] != null) {
                k1 k1Var = new k1(this);
                arrayList.add(k1Var);
                d1VarArr[i10] = k1Var;
                zArr2[i10] = true;
            }
        }
        return j3;
    }

    @Override
    public final void p(y2.k kVar, long j3, long j10) {
        l1 l1Var = (l1) kVar;
        this.f42389y = (int) l1Var.f42376b.f8479b;
        byte[] bArr = l1Var.f42377c;
        bArr.getClass();
        this.f42388x = bArr;
        this.f42387w = true;
        Uri uri = l1Var.f42376b.f8480c;
        u uVar = new u(j10);
        this.d.getClass();
        this.e.o(uVar, 1, -1, this.f42386s, 0, null, 0L, this.f42384n);
    }

    @Override
    public final q1 q() {
        return this.f42383f;
    }

    @Override
    public final long r() {
        if (this.f42387w) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override
    public final void f() {
    }

    @Override
    public final void i(long j3) {
    }

    @Override
    public final void u(long j3) {
    }

    @Override
    public final long s(long j3, i2.o1 o1Var) {
        return j3;
    }
}
