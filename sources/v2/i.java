package v2;

import b2.u;
import b2.x;
import e2.m0;
import g2.b0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import n6.o;
import u2.c1;
import u2.d1;
import u2.f1;
import v7.u6;
public final class i implements d1, f1, y2.g, y2.j {
    public final o E;
    public f F;
    public x G;
    public h H;
    public long I;
    public long J;
    public int K;
    public a L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public final int f46507a;
    public final int[] f46508b;
    public final x[] f46509c;
    public final boolean[] d;
    public final l2.l e;
    public final l2.b f46510f;
    public final a5.a h;
    public final oa.d f46511n;
    public final y2.l f46512r;
    public final u f46513s;
    public final ArrayList v;
    public final List f46514w;
    public final c1 f46515x;
    public final c1[] f46516y;

    public i(int i10, int[] iArr, x[] xVarArr, l2.l lVar, l2.b bVar, androidx.biometric.e eVar, long j10, n2.n nVar, n2.k kVar, oa.d dVar, a5.a aVar, boolean z10, long j11, z2.a aVar2) {
        y2.l lVar2;
        this.f46507a = i10;
        this.f46508b = iArr;
        this.f46509c = xVarArr;
        this.e = lVar;
        this.f46510f = bVar;
        this.h = aVar;
        this.f46511n = dVar;
        if (aVar2 != null) {
            lVar2 = new y2.l(aVar2);
        } else {
            lVar2 = new y2.l("ChunkSampleStream");
        }
        this.f46512r = lVar2;
        this.f46513s = new u(6);
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.f46514w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f46516y = new c1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        c1[] c1VarArr = new c1[i11];
        nVar.getClass();
        c1 c1Var = new c1(eVar, nVar, kVar);
        this.f46515x = c1Var;
        iArr2[0] = i10;
        c1VarArr[0] = c1Var;
        int i12 = 0;
        while (i12 < length) {
            c1 c1Var2 = new c1(eVar, null, null);
            this.f46516y[i12] = c1Var2;
            int i13 = i12 + 1;
            c1VarArr[i13] = c1Var2;
            iArr2[i13] = this.f46508b[i12];
            i12 = i13;
        }
        this.E = new o(19, iArr2, c1VarArr);
        this.I = j10;
        this.J = j10;
        this.M = z10;
        if (z10 && j11 != -9223372036854775807L) {
            this.M = false;
            this.N = j11 < j10;
        }
    }

    public final void A() {
        int C = C(this.f46515x.v(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 <= C) {
                this.K = i10 + 1;
                a aVar = (a) this.v.get(i10);
                x xVar = aVar.d;
                if (!xVar.equals(this.G)) {
                    this.h.m(this.f46507a, xVar, aVar.e, aVar.f46501f, aVar.h);
                }
                this.G = xVar;
            } else {
                return;
            }
        }
    }

    @Override
    public final void B(y2.i iVar, long j10, long j11, boolean z10) {
        f fVar = (f) iVar;
        this.F = null;
        this.L = null;
        long j12 = fVar.f46498a;
        g2.m mVar = fVar.f46499b;
        b0 b0Var = fVar.f46503r;
        u2.u uVar = new u2.u(mVar, b0Var.f9856c, b0Var.d, j10, j11, b0Var.f9855b);
        this.f46511n.getClass();
        this.h.q(uVar, fVar.f46500c, this.f46507a, fVar.d, fVar.e, fVar.f46501f, fVar.h, fVar.f46502n);
        if (!z10) {
            if (y()) {
                this.f46515x.G(false);
                for (c1 c1Var : this.f46516y) {
                    c1Var.G(false);
                }
            } else if (fVar instanceof a) {
                ArrayList arrayList = this.v;
                v(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
            }
            this.f46510f.G(this);
        }
    }

    public final int C(int i10, int i11) {
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

    public final void D(l2.b bVar) {
        c1[] c1VarArr;
        this.H = bVar;
        c1 c1Var = this.f46515x;
        c1Var.l();
        n2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.a(c1Var.e);
            c1Var.h = null;
            c1Var.f45886g = null;
        }
        for (c1 c1Var2 : this.f46516y) {
            c1Var2.l();
            n2.g gVar2 = c1Var2.h;
            if (gVar2 != null) {
                gVar2.a(c1Var2.e);
                c1Var2.h = null;
                c1Var2.f45886g = null;
            }
        }
        this.f46512r.e(this);
    }

    @Override
    public final void a() {
        c1[] c1VarArr;
        c1 c1Var = this.f46515x;
        c1Var.G(true);
        n2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.a(c1Var.e);
            c1Var.h = null;
            c1Var.f45886g = null;
        }
        for (c1 c1Var2 : this.f46516y) {
            c1Var2.G(true);
            n2.g gVar2 = c1Var2.h;
            if (gVar2 != null) {
                gVar2.a(c1Var2.e);
                c1Var2.h = null;
                c1Var2.f45886g = null;
            }
        }
        for (l2.j jVar : this.e.f14531i) {
            e eVar = jVar.f14522a;
            if (eVar != null) {
                eVar.f46491a.release();
            }
        }
        h hVar = this.H;
        if (hVar != null) {
            l2.b bVar = (l2.b) hVar;
            synchronized (bVar) {
                l2.o oVar = (l2.o) bVar.f14490y.remove(this);
                if (oVar != null) {
                    c1 c1Var3 = oVar.f14544a;
                    c1Var3.G(true);
                    n2.g gVar3 = c1Var3.h;
                    if (gVar3 != null) {
                        gVar3.a(c1Var3.e);
                        c1Var3.h = null;
                        c1Var3.f45886g = null;
                    }
                }
            }
        }
    }

    @Override
    public final long b() {
        if (y()) {
            return this.I;
        }
        if (this.P) {
            return Long.MIN_VALUE;
        }
        return w().f46502n;
    }

    @Override
    public final boolean c() {
        return this.f46512r.c();
    }

    @Override
    public final void d() {
        y2.l lVar = this.f46512r;
        lVar.d();
        this.f46515x.C();
        if (!lVar.c()) {
            l2.l lVar2 = this.e;
            u2.b bVar = lVar2.f14535m;
            if (bVar == null) {
                lVar2.f14526a.d();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final boolean e() {
        if (!y() && this.f46515x.A(this.P)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        if (!y() && !z() && !this.O) {
            a aVar = this.L;
            c1 c1Var = this.f46515x;
            if (aVar == null || aVar.d(0) > c1Var.v()) {
                A();
                return c1Var.F(bVar, hVar, i10, this.P);
            }
            return -3;
        }
        return -3;
    }

    @Override
    public final k4.d j(y2.i r26, long r27, long r29, java.io.IOException r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: v2.i.j(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void k(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        f fVar = (f) iVar;
        if (i10 == 0) {
            long j12 = fVar.f46498a;
            uVar = new u2.u(fVar.f46499b, j10);
        } else {
            long j13 = fVar.f46498a;
            g2.m mVar = fVar.f46499b;
            b0 b0Var = fVar.f46503r;
            uVar = new u2.u(mVar, b0Var.f9856c, b0Var.d, j10, j11, b0Var.f9855b);
        }
        this.h.v(uVar, fVar.f46500c, this.f46507a, fVar.d, fVar.e, fVar.f46501f, fVar.h, fVar.f46502n, i10);
    }

    @Override
    public final void l(y2.i iVar, long j10, long j11) {
        f fVar = (f) iVar;
        this.F = null;
        l2.l lVar = this.e;
        l2.j[] jVarArr = lVar.f14531i;
        if (fVar instanceof k) {
            int s10 = lVar.f14532j.s(((k) fVar).d);
            l2.j jVar = jVarArr[s10];
            if (jVar.d == null) {
                e eVar = jVar.f14522a;
                eVar.getClass();
                c3.j a2 = eVar.a();
                if (a2 != null) {
                    m2.m mVar = jVar.f14523b;
                    jVarArr[s10] = new l2.j(jVar.e, mVar, jVar.f14524c, jVar.f14522a, jVar.f14525f, new ad.d(a2, mVar.f15360c, 5));
                }
            }
        }
        l2.o oVar = lVar.h;
        if (oVar != null) {
            long j12 = oVar.d;
            if (j12 == -9223372036854775807L || fVar.f46502n > j12) {
                oVar.d = fVar.f46502n;
            }
            oVar.e.h = true;
        }
        long j13 = fVar.f46498a;
        g2.m mVar2 = fVar.f46499b;
        b0 b0Var = fVar.f46503r;
        u2.u uVar = new u2.u(mVar2, b0Var.f9856c, b0Var.d, j10, j11, b0Var.f9855b);
        this.f46511n.getClass();
        this.h.r(uVar, fVar.f46500c, this.f46507a, fVar.d, fVar.e, fVar.f46501f, fVar.h, fVar.f46502n);
        this.f46510f.G(this);
    }

    @Override
    public final int m(long j10) {
        if (y() || z() || this.O) {
            return 0;
        }
        boolean z10 = this.P;
        c1 c1Var = this.f46515x;
        int x10 = c1Var.x(j10, z10);
        a aVar = this.L;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(0) - c1Var.v());
        }
        c1Var.L(x10);
        A();
        return x10;
    }

    @Override
    public final boolean p(i2.v0 r58) {
        throw new UnsupportedOperationException("Method not decompiled: v2.i.p(i2.v0):boolean");
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
                w9 = (a) i2.d.g(2, arrayList);
            } else {
                w9 = null;
            }
        }
        if (w9 != null) {
            j10 = Math.max(j10, w9.f46502n);
        }
        return Math.max(j10, this.f46515x.s());
    }

    @Override
    public final void u(long j10) {
        int size;
        y2.l lVar = this.f46512r;
        if (!lVar.b() && !y()) {
            boolean c10 = lVar.c();
            boolean z10 = false;
            List list = this.f46514w;
            l2.l lVar2 = this.e;
            ArrayList arrayList = this.v;
            if (c10) {
                f fVar = this.F;
                fVar.getClass();
                boolean z11 = fVar instanceof a;
                if (!z11 || !x(arrayList.size() - 1)) {
                    if (lVar2.f14535m == null) {
                        z10 = lVar2.f14532j.d(j10, fVar, list);
                    }
                    if (z10) {
                        lVar.a();
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
            if (lVar2.f14535m == null && lVar2.f14532j.length() >= 2) {
                size = lVar2.f14532j.i(j10, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                u6.p(!lVar.c());
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
                    long j11 = w().f46502n;
                    a v = v(size);
                    if (arrayList.isEmpty()) {
                        this.I = this.J;
                    }
                    this.P = false;
                    this.h.C(this.f46507a, v.h, j11);
                }
            }
            if (this.f46515x.z()) {
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
        this.f46515x.o(aVar.d(0));
        while (true) {
            c1[] c1VarArr = this.f46516y;
            if (i11 < c1VarArr.length) {
                c1 c1Var = c1VarArr[i11];
                i11++;
                c1Var.o(aVar.d(i11));
            } else {
                return aVar;
            }
        }
    }

    public final a w() {
        return (a) i2.d.g(1, this.v);
    }

    public final boolean x(int i10) {
        int v;
        a aVar = (a) this.v.get(i10);
        if (this.f46515x.v() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            c1[] c1VarArr = this.f46516y;
            if (i11 >= c1VarArr.length) {
                return false;
            }
            v = c1VarArr[i11].v();
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
        if ((this.M || this.N) && !this.P && !this.f46512r.b()) {
            return true;
        }
        return false;
    }
}
