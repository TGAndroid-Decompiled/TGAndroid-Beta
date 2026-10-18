package v2;

import b2.t;
import b2.w;
import e2.m0;
import g2.b0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import l2.o;
import u2.d1;
import u2.e1;
import u2.g1;
import u2.u;
import v7.u6;
public final class i implements e1, g1, y2.g, y2.j {
    public final n2.e E;
    public f F;
    public w G;
    public h H;
    public long I;
    public long J;
    public int K;
    public a L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public final int f47893a;
    public final int[] f47894b;
    public final w[] f47895c;
    public final boolean[] d;
    public final l2.l e;
    public final l2.b f47896f;
    public final a5.a h;
    public final oa.d f47897n;
    public final y2.l f47898r;
    public final t f47899s;
    public final ArrayList v;
    public final List f47900w;
    public final d1 f47901x;
    public final d1[] f47902y;

    public i(int i10, int[] iArr, w[] wVarArr, l2.l lVar, l2.b bVar, androidx.biometric.e eVar, long j10, n2.n nVar, n2.k kVar, oa.d dVar, a5.a aVar, boolean z10, long j11, z2.a aVar2) {
        y2.l lVar2;
        this.f47893a = i10;
        this.f47894b = iArr;
        this.f47895c = wVarArr;
        this.e = lVar;
        this.f47896f = bVar;
        this.h = aVar;
        this.f47897n = dVar;
        if (aVar2 != null) {
            lVar2 = new y2.l(aVar2);
        } else {
            lVar2 = new y2.l("ChunkSampleStream");
        }
        this.f47898r = lVar2;
        this.f47899s = new t(6);
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.f47900w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f47902y = new d1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        d1[] d1VarArr = new d1[i11];
        nVar.getClass();
        d1 d1Var = new d1(eVar, nVar, kVar);
        this.f47901x = d1Var;
        iArr2[0] = i10;
        d1VarArr[0] = d1Var;
        int i12 = 0;
        while (i12 < length) {
            d1 d1Var2 = new d1(eVar, null, null);
            this.f47902y[i12] = d1Var2;
            int i13 = i12 + 1;
            d1VarArr[i13] = d1Var2;
            iArr2[i13] = this.f47894b[i12];
            i12 = i13;
        }
        this.E = new n2.e(21, iArr2, d1VarArr);
        this.I = j10;
        this.J = j10;
        this.M = z10;
        if (z10 && j11 != -9223372036854775807L) {
            this.M = false;
            this.N = j11 < j10;
        }
    }

    public final void A() {
        int B = B(this.f47901x.v(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 <= B) {
                this.K = i10 + 1;
                a aVar = (a) this.v.get(i10);
                w wVar = aVar.d;
                if (!wVar.equals(this.G)) {
                    this.h.m(this.f47893a, wVar, aVar.e, aVar.f47887f, aVar.h);
                }
                this.G = wVar;
            } else {
                return;
            }
        }
    }

    public final int B(int i10, int i11) {
        ArrayList arrayList;
        do {
            i11++;
            arrayList = this.v;
            if (i11 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i11)).d(0) <= i10);
        return i11 - 1;
    }

    public final void C(l2.b bVar) {
        d1[] d1VarArr;
        this.H = bVar;
        d1 d1Var = this.f47901x;
        d1Var.l();
        n2.h hVar = d1Var.h;
        if (hVar != null) {
            hVar.a(d1Var.e);
            d1Var.h = null;
            d1Var.f47274g = null;
        }
        for (d1 d1Var2 : this.f47902y) {
            d1Var2.l();
            n2.h hVar2 = d1Var2.h;
            if (hVar2 != null) {
                hVar2.a(d1Var2.e);
                d1Var2.h = null;
                d1Var2.f47274g = null;
            }
        }
        this.f47898r.e(this);
    }

    @Override
    public final void I(y2.i iVar, long j10, long j11, boolean z10) {
        f fVar = (f) iVar;
        this.F = null;
        this.L = null;
        long j12 = fVar.f47884a;
        g2.m mVar = fVar.f47885b;
        b0 b0Var = fVar.f47889r;
        u uVar = new u(mVar, b0Var.f10765c, b0Var.d, j10, j11, b0Var.f10764b);
        this.f47897n.getClass();
        this.h.q(uVar, fVar.f47886c, this.f47893a, fVar.d, fVar.e, fVar.f47887f, fVar.h, fVar.f47888n);
        if (!z10) {
            if (y()) {
                this.f47901x.G(false);
                for (d1 d1Var : this.f47902y) {
                    d1Var.G(false);
                }
            } else if (fVar instanceof a) {
                ArrayList arrayList = this.v;
                v(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
            }
            this.f47896f.v(this);
        }
    }

    @Override
    public final void a() {
        y2.l lVar = this.f47898r;
        lVar.a();
        this.f47901x.C();
        if (!lVar.d()) {
            l2.l lVar2 = this.e;
            u2.b bVar = lVar2.f15874m;
            if (bVar == null) {
                lVar2.f15865a.a();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final void b() {
        d1[] d1VarArr;
        d1 d1Var = this.f47901x;
        d1Var.G(true);
        n2.h hVar = d1Var.h;
        if (hVar != null) {
            hVar.a(d1Var.e);
            d1Var.h = null;
            d1Var.f47274g = null;
        }
        for (d1 d1Var2 : this.f47902y) {
            d1Var2.G(true);
            n2.h hVar2 = d1Var2.h;
            if (hVar2 != null) {
                hVar2.a(d1Var2.e);
                d1Var2.h = null;
                d1Var2.f47274g = null;
            }
        }
        for (l2.j jVar : this.e.f15870i) {
            e eVar = jVar.f15861a;
            if (eVar != null) {
                eVar.f47877a.release();
            }
        }
        h hVar3 = this.H;
        if (hVar3 != null) {
            l2.b bVar = (l2.b) hVar3;
            synchronized (bVar) {
                o oVar = (o) bVar.f15829y.remove(this);
                if (oVar != null) {
                    d1 d1Var3 = oVar.f15883a;
                    d1Var3.G(true);
                    n2.h hVar4 = d1Var3.h;
                    if (hVar4 != null) {
                        hVar4.a(d1Var3.e);
                        d1Var3.h = null;
                        d1Var3.f47274g = null;
                    }
                }
            }
        }
    }

    @Override
    public final boolean c() {
        return this.f47898r.d();
    }

    @Override
    public final long d() {
        if (y()) {
            return this.I;
        }
        if (this.P) {
            return Long.MIN_VALUE;
        }
        return w().f47888n;
    }

    @Override
    public final boolean e() {
        if (!y() && this.f47901x.A(this.P)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        if (!y() && !z() && !this.O) {
            a aVar = this.L;
            d1 d1Var = this.f47901x;
            if (aVar == null || aVar.d(0) > d1Var.v()) {
                A();
                return d1Var.F(bVar, hVar, i10, this.P);
            }
            return -3;
        }
        return -3;
    }

    @Override
    public final int h(long j10) {
        if (y() || z() || this.O) {
            return 0;
        }
        boolean z10 = this.P;
        d1 d1Var = this.f47901x;
        int x10 = d1Var.x(j10, z10);
        a aVar = this.L;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(0) - d1Var.v());
        }
        d1Var.L(x10);
        A();
        return x10;
    }

    @Override
    public final k4.d j(y2.i r26, long r27, long r29, java.io.IOException r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: v2.i.j(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void l(y2.i iVar, long j10, long j11, int i10) {
        u uVar;
        f fVar = (f) iVar;
        if (i10 == 0) {
            long j12 = fVar.f47884a;
            uVar = new u(fVar.f47885b, j10);
        } else {
            long j13 = fVar.f47884a;
            g2.m mVar = fVar.f47885b;
            b0 b0Var = fVar.f47889r;
            uVar = new u(mVar, b0Var.f10765c, b0Var.d, j10, j11, b0Var.f10764b);
        }
        this.h.v(uVar, fVar.f47886c, this.f47893a, fVar.d, fVar.e, fVar.f47887f, fVar.h, fVar.f47888n, i10);
    }

    @Override
    public final void n(y2.i iVar, long j10, long j11) {
        f fVar = (f) iVar;
        this.F = null;
        l2.l lVar = this.e;
        l2.j[] jVarArr = lVar.f15870i;
        if (fVar instanceof k) {
            int s10 = lVar.f15871j.s(((k) fVar).d);
            l2.j jVar = jVarArr[s10];
            if (jVar.d == null) {
                e eVar = jVar.f15861a;
                eVar.getClass();
                c3.j a2 = eVar.a();
                if (a2 != null) {
                    m2.m mVar = jVar.f15862b;
                    jVarArr[s10] = new l2.j(jVar.e, mVar, jVar.f15863c, jVar.f15861a, jVar.f15864f, new ad.d(a2, mVar.f16453c, 5));
                }
            }
        }
        o oVar = lVar.h;
        if (oVar != null) {
            long j12 = oVar.d;
            if (j12 == -9223372036854775807L || fVar.f47888n > j12) {
                oVar.d = fVar.f47888n;
            }
            oVar.e.h = true;
        }
        long j13 = fVar.f47884a;
        g2.m mVar2 = fVar.f47885b;
        b0 b0Var = fVar.f47889r;
        u uVar = new u(mVar2, b0Var.f10765c, b0Var.d, j10, j11, b0Var.f10764b);
        this.f47897n.getClass();
        this.h.r(uVar, fVar.f47886c, this.f47893a, fVar.d, fVar.e, fVar.f47887f, fVar.h, fVar.f47888n);
        this.f47896f.v(this);
    }

    @Override
    public final boolean p(i2.u0 r58) {
        throw new UnsupportedOperationException("Method not decompiled: v2.i.p(i2.u0):boolean");
    }

    @Override
    public final long s() {
        if (this.P) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.I;
        }
        long j10 = this.J;
        a w9 = w();
        if (!w9.c()) {
            ArrayList arrayList = this.v;
            if (arrayList.size() > 1) {
                w9 = (a) i2.d.h(2, arrayList);
            } else {
                w9 = null;
            }
        }
        if (w9 != null) {
            j10 = Math.max(j10, w9.f47888n);
        }
        return Math.max(j10, this.f47901x.s());
    }

    @Override
    public final void u(long j10) {
        int size;
        y2.l lVar = this.f47898r;
        if (!lVar.c() && !y()) {
            boolean d = lVar.d();
            boolean z10 = false;
            List list = this.f47900w;
            l2.l lVar2 = this.e;
            ArrayList arrayList = this.v;
            if (d) {
                f fVar = this.F;
                fVar.getClass();
                boolean z11 = fVar instanceof a;
                if (!z11 || !x(arrayList.size() - 1)) {
                    if (lVar2.f15874m == null) {
                        z10 = lVar2.f15871j.d(j10, fVar, list);
                    }
                    if (z10) {
                        lVar.b();
                        if (z11) {
                            this.L = (a) fVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (lVar2.f15874m == null && lVar2.f15871j.length() >= 2) {
                size = lVar2.f15871j.i(j10, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                u6.p(!lVar.d());
                int size2 = arrayList.size();
                while (true) {
                    if (size < size2) {
                        if (!x(size)) {
                            break;
                        }
                        size++;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (size != -1) {
                    long j11 = w().f47888n;
                    a v = v(size);
                    if (arrayList.isEmpty()) {
                        this.I = this.J;
                    }
                    this.P = false;
                    this.h.C(this.f47893a, v.h, j11);
                }
            }
            if (this.f47901x.z()) {
                this.P = true;
            }
        }
    }

    public final a v(int i10) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i10);
        m0.X(i10, arrayList.size(), arrayList);
        this.K = Math.max(this.K, arrayList.size());
        int i11 = 0;
        this.f47901x.o(aVar.d(0));
        while (true) {
            d1[] d1VarArr = this.f47902y;
            if (i11 < d1VarArr.length) {
                d1 d1Var = d1VarArr[i11];
                i11++;
                d1Var.o(aVar.d(i11));
            } else {
                return aVar;
            }
        }
    }

    public final a w() {
        return (a) i2.d.h(1, this.v);
    }

    public final boolean x(int i10) {
        int v;
        a aVar = (a) this.v.get(i10);
        if (this.f47901x.v() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            d1[] d1VarArr = this.f47902y;
            if (i11 >= d1VarArr.length) {
                return false;
            }
            v = d1VarArr[i11].v();
            i11++;
        } while (v <= aVar.d(i11));
        return true;
    }

    public final boolean y() {
        if (this.I != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final boolean z() {
        if ((this.M || this.N) && !this.P && !this.f47898r.c()) {
            return true;
        }
        return false;
    }
}
