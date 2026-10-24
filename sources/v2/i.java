package v2;

import b2.t;
import b2.w;
import e2.m0;
import g2.b0;
import i2.o1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import l2.o;
import u2.e1;
import u2.f1;
import u2.h1;
import u2.v;
import v7.u6;
public final class i implements f1, h1, y2.g, y2.j {
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
    public final int f48341a;
    public final int[] f48342b;
    public final w[] f48343c;
    public final boolean[] d;
    public final l2.l e;
    public final l2.b f48344f;
    public final a5.a h;
    public final oa.d f48345n;
    public final y2.l f48346r;
    public final t f48347s;
    public final ArrayList v;
    public final List f48348w;
    public final e1 f48349x;
    public final e1[] f48350y;

    public i(int i10, int[] iArr, w[] wVarArr, l2.l lVar, l2.b bVar, androidx.biometric.e eVar, long j10, n2.n nVar, n2.k kVar, oa.d dVar, a5.a aVar, boolean z10, long j11, z2.a aVar2) {
        y2.l lVar2;
        this.f48341a = i10;
        this.f48342b = iArr;
        this.f48343c = wVarArr;
        this.e = lVar;
        this.f48344f = bVar;
        this.h = aVar;
        this.f48345n = dVar;
        if (aVar2 != null) {
            lVar2 = new y2.l(aVar2);
        } else {
            lVar2 = new y2.l("ChunkSampleStream");
        }
        this.f48346r = lVar2;
        this.f48347s = new t(6);
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.f48348w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f48350y = new e1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        e1[] e1VarArr = new e1[i11];
        nVar.getClass();
        e1 e1Var = new e1(eVar, nVar, kVar);
        this.f48349x = e1Var;
        iArr2[0] = i10;
        e1VarArr[0] = e1Var;
        int i12 = 0;
        while (i12 < length) {
            e1 e1Var2 = new e1(eVar, null, null);
            this.f48350y[i12] = e1Var2;
            int i13 = i12 + 1;
            e1VarArr[i13] = e1Var2;
            iArr2[i13] = this.f48342b[i12];
            i12 = i13;
        }
        this.E = new n2.e(20, iArr2, e1VarArr);
        this.I = j10;
        this.J = j10;
        this.M = z10;
        if (z10 && j11 != -9223372036854775807L) {
            this.M = false;
            this.N = j11 < j10;
        }
    }

    public final boolean A() {
        if ((this.M || this.N) && !this.P && !this.f48346r.c()) {
            return true;
        }
        return false;
    }

    public final void B() {
        int C = C(this.f48349x.v(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 <= C) {
                this.K = i10 + 1;
                a aVar = (a) this.v.get(i10);
                w wVar = aVar.d;
                if (!wVar.equals(this.G)) {
                    this.h.m(this.f48341a, wVar, aVar.e, aVar.f48335f, aVar.h);
                }
                this.G = wVar;
            } else {
                return;
            }
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
        e1[] e1VarArr;
        this.H = bVar;
        e1 e1Var = this.f48349x;
        e1Var.l();
        n2.h hVar = e1Var.h;
        if (hVar != null) {
            hVar.a(e1Var.e);
            e1Var.h = null;
            e1Var.f47740g = null;
        }
        for (e1 e1Var2 : this.f48350y) {
            e1Var2.l();
            n2.h hVar2 = e1Var2.h;
            if (hVar2 != null) {
                hVar2.a(e1Var2.e);
                e1Var2.h = null;
                e1Var2.f47740g = null;
            }
        }
        this.f48346r.e(this);
    }

    @Override
    public final void a() {
        y2.l lVar = this.f48346r;
        lVar.a();
        this.f48349x.C();
        if (!lVar.d()) {
            l2.l lVar2 = this.e;
            u2.b bVar = lVar2.f15938m;
            if (bVar == null) {
                lVar2.f15929a.a();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final void b() {
        e1[] e1VarArr;
        e1 e1Var = this.f48349x;
        e1Var.G(true);
        n2.h hVar = e1Var.h;
        if (hVar != null) {
            hVar.a(e1Var.e);
            e1Var.h = null;
            e1Var.f47740g = null;
        }
        for (e1 e1Var2 : this.f48350y) {
            e1Var2.G(true);
            n2.h hVar2 = e1Var2.h;
            if (hVar2 != null) {
                hVar2.a(e1Var2.e);
                e1Var2.h = null;
                e1Var2.f47740g = null;
            }
        }
        for (l2.j jVar : this.e.f15934i) {
            e eVar = jVar.f15925a;
            if (eVar != null) {
                eVar.f48325a.release();
            }
        }
        h hVar3 = this.H;
        if (hVar3 != null) {
            l2.b bVar = (l2.b) hVar3;
            synchronized (bVar) {
                o oVar = (o) bVar.f15893y.remove(this);
                if (oVar != null) {
                    e1 e1Var3 = oVar.f15947a;
                    e1Var3.G(true);
                    n2.h hVar4 = e1Var3.h;
                    if (hVar4 != null) {
                        hVar4.a(e1Var3.e);
                        e1Var3.h = null;
                        e1Var3.f47740g = null;
                    }
                }
            }
        }
    }

    @Override
    public final boolean c() {
        return this.f48346r.d();
    }

    @Override
    public final long d() {
        if (y()) {
            return this.I;
        }
        if (this.P) {
            return Long.MIN_VALUE;
        }
        return w().f48336n;
    }

    @Override
    public final k4.d e(y2.i r26, long r27, long r29, java.io.IOException r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: v2.i.e(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final boolean f() {
        if (!y() && this.f48349x.A(this.P)) {
            return true;
        }
        return false;
    }

    @Override
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        if (!y() && !A() && !this.O) {
            a aVar = this.L;
            e1 e1Var = this.f48349x;
            if (aVar == null || aVar.d(0) > e1Var.v()) {
                B();
                return e1Var.F(bVar, hVar, i10, this.P);
            }
            return -3;
        }
        return -3;
    }

    @Override
    public final void j(y2.i iVar, long j10, long j11, int i10) {
        v vVar;
        f fVar = (f) iVar;
        if (i10 == 0) {
            long j12 = fVar.f48332a;
            vVar = new v(fVar.f48333b, j10);
        } else {
            long j13 = fVar.f48332a;
            g2.m mVar = fVar.f48333b;
            b0 b0Var = fVar.f48337r;
            vVar = new v(mVar, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b);
        }
        this.h.v(vVar, fVar.f48334c, this.f48341a, fVar.d, fVar.e, fVar.f48335f, fVar.h, fVar.f48336n, i10);
    }

    @Override
    public final void k(y2.i iVar, long j10, long j11) {
        f fVar = (f) iVar;
        this.F = null;
        l2.l lVar = this.e;
        l2.j[] jVarArr = lVar.f15934i;
        if (fVar instanceof k) {
            int s10 = lVar.f15935j.s(((k) fVar).d);
            l2.j jVar = jVarArr[s10];
            if (jVar.d == null) {
                e eVar = jVar.f15925a;
                eVar.getClass();
                c3.j a2 = eVar.a();
                if (a2 != null) {
                    m2.m mVar = jVar.f15926b;
                    jVarArr[s10] = new l2.j(jVar.e, mVar, jVar.f15927c, jVar.f15925a, jVar.f15928f, new ad.d(a2, mVar.f16517c, 5));
                }
            }
        }
        o oVar = lVar.h;
        if (oVar != null) {
            long j12 = oVar.d;
            if (j12 == -9223372036854775807L || fVar.f48336n > j12) {
                oVar.d = fVar.f48336n;
            }
            oVar.e.h = true;
        }
        long j13 = fVar.f48332a;
        g2.m mVar2 = fVar.f48333b;
        b0 b0Var = fVar.f48337r;
        v vVar = new v(mVar2, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b);
        this.f48345n.getClass();
        this.h.r(vVar, fVar.f48334c, this.f48341a, fVar.d, fVar.e, fVar.f48335f, fVar.h, fVar.f48336n);
        this.f48344f.b(this);
    }

    @Override
    public final int m(long j10) {
        if (y() || A() || this.O) {
            return 0;
        }
        boolean z10 = this.P;
        e1 e1Var = this.f48349x;
        int x10 = e1Var.x(j10, z10);
        a aVar = this.L;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(0) - e1Var.v());
        }
        e1Var.L(x10);
        B();
        return x10;
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
                w9 = (a) o1.i(2, arrayList);
            } else {
                w9 = null;
            }
        }
        if (w9 != null) {
            j10 = Math.max(j10, w9.f48336n);
        }
        return Math.max(j10, this.f48349x.s());
    }

    @Override
    public final void u(long j10) {
        int size;
        y2.l lVar = this.f48346r;
        if (!lVar.c() && !y()) {
            boolean d = lVar.d();
            boolean z10 = false;
            List list = this.f48348w;
            l2.l lVar2 = this.e;
            ArrayList arrayList = this.v;
            if (d) {
                f fVar = this.F;
                fVar.getClass();
                boolean z11 = fVar instanceof a;
                if (!z11 || !x(arrayList.size() - 1)) {
                    if (lVar2.f15938m == null) {
                        z10 = lVar2.f15935j.d(j10, fVar, list);
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
            if (lVar2.f15938m == null && lVar2.f15935j.length() >= 2) {
                size = lVar2.f15935j.i(j10, list);
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
                    long j11 = w().f48336n;
                    a v = v(size);
                    if (arrayList.isEmpty()) {
                        this.I = this.J;
                    }
                    this.P = false;
                    this.h.C(this.f48341a, v.h, j11);
                }
            }
            if (this.f48349x.z()) {
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
        this.f48349x.o(aVar.d(0));
        while (true) {
            e1[] e1VarArr = this.f48350y;
            if (i11 < e1VarArr.length) {
                e1 e1Var = e1VarArr[i11];
                i11++;
                e1Var.o(aVar.d(i11));
            } else {
                return aVar;
            }
        }
    }

    public final a w() {
        return (a) o1.i(1, this.v);
    }

    public final boolean x(int i10) {
        int v;
        a aVar = (a) this.v.get(i10);
        if (this.f48349x.v() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            e1[] e1VarArr = this.f48350y;
            if (i11 >= e1VarArr.length) {
                return false;
            }
            v = e1VarArr[i11].v();
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

    @Override
    public final void z(y2.i iVar, long j10, long j11, boolean z10) {
        f fVar = (f) iVar;
        this.F = null;
        this.L = null;
        long j12 = fVar.f48332a;
        g2.m mVar = fVar.f48333b;
        b0 b0Var = fVar.f48337r;
        v vVar = new v(mVar, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b);
        this.f48345n.getClass();
        this.h.q(vVar, fVar.f48334c, this.f48341a, fVar.d, fVar.e, fVar.f48335f, fVar.h, fVar.f48336n);
        if (!z10) {
            if (y()) {
                this.f48349x.G(false);
                for (e1 e1Var : this.f48350y) {
                    e1Var.G(false);
                }
            } else if (fVar instanceof a) {
                ArrayList arrayList = this.v;
                v(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
            }
            this.f48344f.b(this);
        }
    }
}
