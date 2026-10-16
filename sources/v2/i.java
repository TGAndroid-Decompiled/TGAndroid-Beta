package v2;

import b2.u;
import b2.x;
import e2.m0;
import g2.b0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import u2.c1;
import u2.d1;
import u2.f1;
import v7.u6;
public final class i implements d1, f1, y2.g, y2.j {
    public final n3.b E;
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
    public final l2.k e;
    public final l2.b f46510f;
    public final a5.a h;
    public final oa.d f46511n;
    public final y2.l f46512r;
    public final u f46513s;
    public final ArrayList v;
    public final List f46514w;
    public final c1 f46515x;
    public final c1[] f46516y;

    public i(int i10, int[] iArr, x[] xVarArr, l2.k kVar, l2.b bVar, androidx.biometric.e eVar, long j10, n2.m mVar, n2.j jVar, oa.d dVar, a5.a aVar, boolean z10, long j11, z2.a aVar2) {
        y2.l lVar;
        this.f46507a = i10;
        this.f46508b = iArr;
        this.f46509c = xVarArr;
        this.e = kVar;
        this.f46510f = bVar;
        this.h = aVar;
        this.f46511n = dVar;
        if (aVar2 != null) {
            lVar = new y2.l(aVar2);
        } else {
            lVar = new y2.l("ChunkSampleStream");
        }
        this.f46512r = lVar;
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
        mVar.getClass();
        c1 c1Var = new c1(eVar, mVar, jVar);
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
        this.E = new n3.b(20, iArr2, c1VarArr);
        this.I = j10;
        this.J = j10;
        this.M = z10;
        if (z10 && j11 != -9223372036854775807L) {
            this.M = false;
            this.N = j11 < j10;
        }
    }

    @Override
    public final void A(y2.i iVar, long j10, long j11) {
        f fVar = (f) iVar;
        this.F = null;
        l2.k kVar = this.e;
        l2.i[] iVarArr = kVar.f14531i;
        if (fVar instanceof k) {
            int s10 = kVar.f14532j.s(((k) fVar).d);
            l2.i iVar2 = iVarArr[s10];
            if (iVar2.d == null) {
                e eVar = iVar2.f14522a;
                eVar.getClass();
                c3.j a2 = eVar.a();
                if (a2 != null) {
                    m2.m mVar = iVar2.f14523b;
                    iVarArr[s10] = new l2.i(iVar2.e, mVar, iVar2.f14524c, iVar2.f14522a, iVar2.f14525f, new ad.d(a2, mVar.f15095c, 5));
                }
            }
        }
        l2.n nVar = kVar.h;
        if (nVar != null) {
            long j12 = nVar.d;
            if (j12 == -9223372036854775807L || fVar.f46502n > j12) {
                nVar.d = fVar.f46502n;
            }
            nVar.e.h = true;
        }
        long j13 = fVar.f46498a;
        g2.m mVar2 = fVar.f46499b;
        b0 b0Var = fVar.f46503r;
        u2.u uVar = new u2.u(mVar2, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b);
        this.f46511n.getClass();
        this.h.r(uVar, fVar.f46500c, this.f46507a, fVar.d, fVar.e, fVar.f46501f, fVar.h, fVar.f46502n);
        this.f46510f.F(this);
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
    public final void X0(y2.i iVar, long j10, long j11, boolean z10) {
        f fVar = (f) iVar;
        this.F = null;
        this.L = null;
        long j12 = fVar.f46498a;
        g2.m mVar = fVar.f46499b;
        b0 b0Var = fVar.f46503r;
        u2.u uVar = new u2.u(mVar, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b);
        this.f46511n.getClass();
        this.h.q(uVar, fVar.f46500c, this.f46507a, fVar.d, fVar.e, fVar.f46501f, fVar.h, fVar.f46502n);
        if (!z10) {
            if (v()) {
                this.f46515x.G(false);
                for (c1 c1Var : this.f46516y) {
                    c1Var.G(false);
                }
            } else if (fVar instanceof a) {
                ArrayList arrayList = this.v;
                q(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
            }
            this.f46510f.F(this);
        }
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
        for (l2.i iVar : this.e.f14531i) {
            e eVar = iVar.f14522a;
            if (eVar != null) {
                eVar.f46491a.release();
            }
        }
        h hVar = this.H;
        if (hVar != null) {
            l2.b bVar = (l2.b) hVar;
            synchronized (bVar) {
                l2.n nVar = (l2.n) bVar.f14492y.remove(this);
                if (nVar != null) {
                    c1 c1Var3 = nVar.f14544a;
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
    public final void b() {
        y2.l lVar = this.f46512r;
        lVar.b();
        this.f46515x.C();
        if (!lVar.d()) {
            l2.k kVar = this.e;
            u2.b bVar = kVar.f14535m;
            if (bVar == null) {
                kVar.f14526a.b();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final boolean c() {
        return this.f46512r.d();
    }

    @Override
    public final long d() {
        if (v()) {
            return this.I;
        }
        if (this.P) {
            return Long.MIN_VALUE;
        }
        return t().f46502n;
    }

    @Override
    public final boolean e() {
        if (!v() && this.f46515x.A(this.P)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        if (!v() && !x() && !this.O) {
            a aVar = this.L;
            c1 c1Var = this.f46515x;
            if (aVar == null || aVar.d(0) > c1Var.v()) {
                z();
                return c1Var.F(bVar, hVar, i10, this.P);
            }
            return -3;
        }
        return -3;
    }

    @Override
    public final int j(long j10) {
        if (v() || x() || this.O) {
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
        z();
        return x10;
    }

    @Override
    public final boolean m(i2.v0 r58) {
        throw new UnsupportedOperationException("Method not decompiled: v2.i.m(i2.v0):boolean");
    }

    @Override
    public final long p() {
        if (this.P) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.I;
        }
        long j10 = this.J;
        a t10 = t();
        if (!t10.c()) {
            ArrayList arrayList = this.v;
            if (arrayList.size() > 1) {
                t10 = (a) i2.d.h(2, arrayList);
            } else {
                t10 = null;
            }
        }
        if (t10 != null) {
            j10 = Math.max(j10, t10.f46502n);
        }
        return Math.max(j10, this.f46515x.s());
    }

    public final a q(int i10) {
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

    @Override
    public final void s(long j10) {
        int size;
        y2.l lVar = this.f46512r;
        if (!lVar.c() && !v()) {
            boolean d = lVar.d();
            boolean z10 = false;
            List list = this.f46514w;
            l2.k kVar = this.e;
            ArrayList arrayList = this.v;
            if (d) {
                f fVar = this.F;
                fVar.getClass();
                boolean z11 = fVar instanceof a;
                if (!z11 || !u(arrayList.size() - 1)) {
                    if (kVar.f14535m == null) {
                        z10 = kVar.f14532j.d(j10, fVar, list);
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
            if (kVar.f14535m == null && kVar.f14532j.length() >= 2) {
                size = kVar.f14532j.i(j10, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                u6.p(!lVar.d());
                int size2 = arrayList.size();
                while (true) {
                    if (size < size2) {
                        if (!u(size)) {
                            break;
                        }
                        size++;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (size != -1) {
                    long j11 = t().f46502n;
                    a q6 = q(size);
                    if (arrayList.isEmpty()) {
                        this.I = this.J;
                    }
                    this.P = false;
                    this.h.C(this.f46507a, q6.h, j11);
                }
            }
            if (this.f46515x.z()) {
                this.P = true;
            }
        }
    }

    public final a t() {
        return (a) i2.d.h(1, this.v);
    }

    public final boolean u(int i10) {
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

    public final boolean v() {
        if (this.I != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final k4.d w(y2.i r26, long r27, long r29, java.io.IOException r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: v2.i.w(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    public final boolean x() {
        if ((this.M || this.N) && !this.P && !this.f46512r.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final void y(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        f fVar = (f) iVar;
        if (i10 == 0) {
            long j12 = fVar.f46498a;
            uVar = new u2.u(fVar.f46499b, j10);
        } else {
            long j13 = fVar.f46498a;
            g2.m mVar = fVar.f46499b;
            b0 b0Var = fVar.f46503r;
            uVar = new u2.u(mVar, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b);
        }
        this.h.v(uVar, fVar.f46500c, this.f46507a, fVar.d, fVar.e, fVar.f46501f, fVar.h, fVar.f46502n, i10);
    }

    public final void z() {
        int B = B(this.f46515x.v(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 <= B) {
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
}
