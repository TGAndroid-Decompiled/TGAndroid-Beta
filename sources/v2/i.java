package v2;

import a8.h0;
import a8.lg;
import a8.ng;
import a8.yb;
import b2.u;
import b2.x;
import e2.n0;
import g2.b0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import u2.c1;
import u2.d1;
import u2.f1;
import u7.s;
public final class i implements d1, f1, y2.g, y2.j {
    public final m4.c E;
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
    public final int f50050a;
    public final int[] f50051b;
    public final x[] f50052c;
    public final boolean[] d;
    public final l2.k e;
    public final l2.b f50053f;
    public final ng h;
    public final s f50054n;
    public final y2.l f50055r;
    public final u f50056s;
    public final ArrayList v;
    public final List f50057w;
    public final c1 f50058x;
    public final c1[] f50059y;

    public i(int i10, int[] iArr, x[] xVarArr, l2.k kVar, l2.b bVar, h0 h0Var, long j10, n2.m mVar, n2.j jVar, s sVar, ng ngVar, boolean z10, long j11, z2.a aVar) {
        y2.l lVar;
        this.f50050a = i10;
        this.f50051b = iArr;
        this.f50052c = xVarArr;
        this.e = kVar;
        this.f50053f = bVar;
        this.h = ngVar;
        this.f50054n = sVar;
        if (aVar != null) {
            lVar = new y2.l(aVar);
        } else {
            lVar = new y2.l("ChunkSampleStream");
        }
        this.f50055r = lVar;
        this.f50056s = new u(6);
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.f50057w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f50059y = new c1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        c1[] c1VarArr = new c1[i11];
        mVar.getClass();
        c1 c1Var = new c1(h0Var, mVar, jVar);
        this.f50058x = c1Var;
        iArr2[0] = i10;
        c1VarArr[0] = c1Var;
        int i12 = 0;
        while (i12 < length) {
            c1 c1Var2 = new c1(h0Var, null, null);
            this.f50059y[i12] = c1Var2;
            int i13 = i12 + 1;
            c1VarArr[i13] = c1Var2;
            iArr2[i13] = this.f50051b[i12];
            i12 = i13;
        }
        this.E = new m4.c(22, iArr2, c1VarArr);
        this.I = j10;
        this.J = j10;
        this.M = z10;
        if (z10 && j11 != -9223372036854775807L) {
            this.M = false;
            this.N = j11 < j10;
        }
    }

    public final int A(int i10, int i11) {
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

    @Override
    public final void B(y2.i iVar, long j10, long j11) {
        f fVar = (f) iVar;
        this.F = null;
        l2.k kVar = this.e;
        l2.i[] iVarArr = kVar.f16834i;
        if (fVar instanceof k) {
            int s10 = kVar.f16835j.s(((k) fVar).d);
            l2.i iVar2 = iVarArr[s10];
            if (iVar2.d == null) {
                e eVar = iVar2.f16825a;
                eVar.getClass();
                c3.j a2 = eVar.a();
                if (a2 != null) {
                    m2.m mVar = iVar2.f16826b;
                    iVarArr[s10] = new l2.i(iVar2.e, mVar, iVar2.f16827c, iVar2.f16825a, iVar2.f16828f, new lg(a2, mVar.f17973c, 6));
                }
            }
        }
        l2.n nVar = kVar.h;
        if (nVar != null) {
            long j12 = nVar.d;
            if (j12 == -9223372036854775807L || fVar.f50045n > j12) {
                nVar.d = fVar.f50045n;
            }
            nVar.e.h = true;
        }
        long j13 = fVar.f50041a;
        g2.m mVar2 = fVar.f50042b;
        b0 b0Var = fVar.f50046r;
        u2.u uVar = new u2.u(mVar2, b0Var.f12230c, b0Var.d, j10, j11, b0Var.f12229b);
        this.f50054n.getClass();
        this.h.q(uVar, fVar.f50043c, this.f50050a, fVar.d, fVar.e, fVar.f50044f, fVar.h, fVar.f50045n);
        this.f50053f.u(this);
    }

    public final void C(l2.b bVar) {
        c1[] c1VarArr;
        this.H = bVar;
        c1 c1Var = this.f50058x;
        c1Var.l();
        n2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.a(c1Var.e);
            c1Var.h = null;
            c1Var.f49301g = null;
        }
        for (c1 c1Var2 : this.f50059y) {
            c1Var2.l();
            n2.g gVar2 = c1Var2.h;
            if (gVar2 != null) {
                gVar2.a(c1Var2.e);
                c1Var2.h = null;
                c1Var2.f49301g = null;
            }
        }
        this.f50055r.e(this);
    }

    @Override
    public final void a() {
        c1[] c1VarArr;
        c1 c1Var = this.f50058x;
        c1Var.G(true);
        n2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.a(c1Var.e);
            c1Var.h = null;
            c1Var.f49301g = null;
        }
        for (c1 c1Var2 : this.f50059y) {
            c1Var2.G(true);
            n2.g gVar2 = c1Var2.h;
            if (gVar2 != null) {
                gVar2.a(c1Var2.e);
                c1Var2.h = null;
                c1Var2.f49301g = null;
            }
        }
        for (l2.i iVar : this.e.f16834i) {
            e eVar = iVar.f16825a;
            if (eVar != null) {
                eVar.f50034a.release();
            }
        }
        h hVar = this.H;
        if (hVar != null) {
            l2.b bVar = (l2.b) hVar;
            synchronized (bVar) {
                l2.n nVar = (l2.n) bVar.f16795y.remove(this);
                if (nVar != null) {
                    c1 c1Var3 = nVar.f16847a;
                    c1Var3.G(true);
                    n2.g gVar3 = c1Var3.h;
                    if (gVar3 != null) {
                        gVar3.a(c1Var3.e);
                        c1Var3.h = null;
                        c1Var3.f49301g = null;
                    }
                }
            }
        }
    }

    @Override
    public final long b() {
        if (v()) {
            return this.I;
        }
        if (this.P) {
            return Long.MIN_VALUE;
        }
        return t().f50045n;
    }

    @Override
    public final boolean c() {
        return this.f50055r.c();
    }

    @Override
    public final void d() {
        y2.l lVar = this.f50055r;
        lVar.d();
        this.f50058x.C();
        if (!lVar.c()) {
            l2.k kVar = this.e;
            u2.b bVar = kVar.f16838m;
            if (bVar == null) {
                kVar.f16829a.d();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final boolean e() {
        if (!v() && this.f50058x.A(this.P)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.s sVar, h2.h hVar, int i10) {
        if (!v() && !x() && !this.O) {
            a aVar = this.L;
            c1 c1Var = this.f50058x;
            if (aVar == null || aVar.d(0) > c1Var.v()) {
                y();
                return c1Var.F(sVar, hVar, i10, this.P);
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
        c1 c1Var = this.f50058x;
        int x9 = c1Var.x(j10, z10);
        a aVar = this.L;
        if (aVar != null) {
            x9 = Math.min(x9, aVar.d(0) - c1Var.v());
        }
        c1Var.L(x9);
        y();
        return x9;
    }

    @Override
    public final void l0(y2.i iVar, long j10, long j11, boolean z10) {
        f fVar = (f) iVar;
        this.F = null;
        this.L = null;
        long j12 = fVar.f50041a;
        g2.m mVar = fVar.f50042b;
        b0 b0Var = fVar.f50046r;
        u2.u uVar = new u2.u(mVar, b0Var.f12230c, b0Var.d, j10, j11, b0Var.f12229b);
        this.f50054n.getClass();
        this.h.p(uVar, fVar.f50043c, this.f50050a, fVar.d, fVar.e, fVar.f50044f, fVar.h, fVar.f50045n);
        if (!z10) {
            if (v()) {
                this.f50058x.G(false);
                for (c1 c1Var : this.f50059y) {
                    c1Var.G(false);
                }
            } else if (fVar instanceof a) {
                ArrayList arrayList = this.v;
                n(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
            }
            this.f50053f.u(this);
        }
    }

    @Override
    public final boolean m(i2.w0 r58) {
        throw new UnsupportedOperationException("Method not decompiled: v2.i.m(i2.w0):boolean");
    }

    public final a n(int i10) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i10);
        n0.X(i10, arrayList.size(), arrayList);
        this.K = Math.max(this.K, arrayList.size());
        int i11 = 0;
        this.f50058x.o(aVar.d(0));
        while (true) {
            c1[] c1VarArr = this.f50059y;
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
    public final long q() {
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
                t10 = (a) ic.a.g(2, arrayList);
            } else {
                t10 = null;
            }
        }
        if (t10 != null) {
            j10 = Math.max(j10, t10.f50045n);
        }
        return Math.max(j10, this.f50058x.s());
    }

    @Override
    public final void s(long j10) {
        int size;
        y2.l lVar = this.f50055r;
        if (!lVar.b() && !v()) {
            boolean c10 = lVar.c();
            boolean z10 = false;
            List list = this.f50057w;
            l2.k kVar = this.e;
            ArrayList arrayList = this.v;
            if (c10) {
                f fVar = this.F;
                fVar.getClass();
                boolean z11 = fVar instanceof a;
                if (!z11 || !u(arrayList.size() - 1)) {
                    if (kVar.f16838m == null) {
                        z10 = kVar.f16835j.d(j10, fVar, list);
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
            if (kVar.f16838m == null && kVar.f16835j.length() >= 2) {
                size = kVar.f16835j.i(j10, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                yb.p(!lVar.c());
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
                    long j11 = t().f50045n;
                    a n10 = n(size);
                    if (arrayList.isEmpty()) {
                        this.I = this.J;
                    }
                    this.P = false;
                    this.h.C(this.f50050a, n10.h, j11);
                }
            }
            if (this.f50058x.z()) {
                this.P = true;
            }
        }
    }

    public final a t() {
        return (a) ic.a.g(1, this.v);
    }

    public final boolean u(int i10) {
        int v;
        a aVar = (a) this.v.get(i10);
        if (this.f50058x.v() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            c1[] c1VarArr = this.f50059y;
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
        if ((this.M || this.N) && !this.P && !this.f50055r.b()) {
            return true;
        }
        return false;
    }

    public final void y() {
        int A = A(this.f50058x.v(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 <= A) {
                this.K = i10 + 1;
                a aVar = (a) this.v.get(i10);
                x xVar = aVar.d;
                if (!xVar.equals(this.G)) {
                    this.h.l(this.f50050a, xVar, aVar.e, aVar.f50044f, aVar.h);
                }
                this.G = xVar;
            } else {
                return;
            }
        }
    }

    @Override
    public final void z(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        f fVar = (f) iVar;
        if (i10 == 0) {
            long j12 = fVar.f50041a;
            uVar = new u2.u(fVar.f50042b, j10);
        } else {
            long j13 = fVar.f50041a;
            g2.m mVar = fVar.f50042b;
            b0 b0Var = fVar.f50046r;
            uVar = new u2.u(mVar, b0Var.f12230c, b0Var.d, j10, j11, b0Var.f12229b);
        }
        this.h.u(uVar, fVar.f50043c, this.f50050a, fVar.d, fVar.e, fVar.f50044f, fVar.h, fVar.f50045n, i10);
    }
}
