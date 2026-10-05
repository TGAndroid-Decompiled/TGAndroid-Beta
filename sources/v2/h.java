package v2;

import android.net.Uri;
import b2.p;
import b2.s;
import c3.b0;
import e2.d0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import l2.o;
import n2.n;
import n4.y;
import u2.b1;
import u2.c1;
import u2.e1;
import u2.t;
public final class h implements c1, e1, y2.g, y2.j {
    public final o0.a E;
    public e F;
    public s G;
    public g H;
    public long I;
    public long J;
    public int K;
    public a L;
    public boolean M;
    public boolean N;
    public boolean O;
    public final int f47804a;
    public final int[] f47805b;
    public final s[] f47806c;
    public final boolean[] d;
    public final l2.l f47807e;
    public final l2.b f47808f;
    public final a5.a h;
    public final qb.b f47809n;
    public final y2.l f47810r = new y2.l("ChunkSampleStream");
    public final p f47811s = new p(7);
    public final ArrayList v;
    public final List f47812w;
    public final b1 f47813x;
    public final b1[] f47814y;

    public h(int i10, int[] iArr, s[] sVarArr, l2.l lVar, l2.b bVar, y2.d dVar, long j3, n nVar, n2.k kVar, qb.b bVar2, a5.a aVar, boolean z10) {
        this.f47804a = i10;
        this.f47805b = iArr;
        this.f47806c = sVarArr;
        this.f47807e = lVar;
        this.f47808f = bVar;
        this.h = aVar;
        this.f47809n = bVar2;
        this.M = z10;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.f47812w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f47814y = new b1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        b1[] b1VarArr = new b1[i11];
        nVar.getClass();
        b1 b1Var = new b1(dVar, nVar, kVar);
        this.f47813x = b1Var;
        int i12 = 0;
        iArr2[0] = i10;
        b1VarArr[0] = b1Var;
        while (i12 < length) {
            b1 b1Var2 = new b1(dVar, null, null);
            this.f47814y[i12] = b1Var2;
            int i13 = i12 + 1;
            b1VarArr[i13] = b1Var2;
            iArr2[i13] = this.f47805b[i12];
            i12 = i13;
        }
        this.E = new o0.a(18, iArr2, b1VarArr);
        this.I = j3;
        this.J = j3;
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

    public final void B(l2.b bVar) {
        b1[] b1VarArr;
        this.H = bVar;
        b1 b1Var = this.f47813x;
        b1Var.k();
        n2.h hVar = b1Var.h;
        if (hVar != null) {
            hVar.a(b1Var.f47233e);
            b1Var.h = null;
            b1Var.f47235g = null;
        }
        for (b1 b1Var2 : this.f47814y) {
            b1Var2.k();
            n2.h hVar2 = b1Var2.h;
            if (hVar2 != null) {
                hVar2.a(b1Var2.f47233e);
                b1Var2.h = null;
                b1Var2.f47235g = null;
            }
        }
        this.f47810r.e(this);
    }

    @Override
    public final void a() {
        y2.l lVar = this.f47810r;
        lVar.a();
        this.f47813x.z();
        if (!lVar.d()) {
            l2.l lVar2 = this.f47807e;
            u2.b bVar = lVar2.f15301m;
            if (bVar == null) {
                lVar2.f15291a.a();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final void b() {
        b1[] b1VarArr;
        b1 b1Var = this.f47813x;
        b1Var.D(true);
        n2.h hVar = b1Var.h;
        if (hVar != null) {
            hVar.a(b1Var.f47233e);
            b1Var.h = null;
            b1Var.f47235g = null;
        }
        for (b1 b1Var2 : this.f47814y) {
            b1Var2.D(true);
            n2.h hVar2 = b1Var2.h;
            if (hVar2 != null) {
                hVar2.a(b1Var2.f47233e);
                b1Var2.h = null;
                b1Var2.f47235g = null;
            }
        }
        for (l2.j jVar : this.f47807e.f15297i) {
            d dVar = jVar.f15286a;
            if (dVar != null) {
                dVar.f47786a.release();
            }
        }
        g gVar = this.H;
        if (gVar != null) {
            l2.b bVar = (l2.b) gVar;
            synchronized (bVar) {
                o oVar = (o) bVar.f15253y.remove(this);
                if (oVar != null) {
                    b1 b1Var3 = oVar.f15311a;
                    b1Var3.D(true);
                    n2.h hVar3 = b1Var3.h;
                    if (hVar3 != null) {
                        hVar3.a(b1Var3.f47233e);
                        b1Var3.h = null;
                        b1Var3.f47235g = null;
                    }
                }
            }
        }
    }

    @Override
    public final boolean c() {
        return this.f47810r.d();
    }

    @Override
    public final long d() {
        if (w()) {
            return this.I;
        }
        if (this.O) {
            return Long.MIN_VALUE;
        }
        return t().f47798n;
    }

    @Override
    public final boolean e() {
        if (!w() && this.f47813x.x(this.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(y yVar, h2.h hVar, int i10) {
        if (!w()) {
            a aVar = this.L;
            b1 b1Var = this.f47813x;
            if (aVar != null && aVar.d(0) <= b1Var.t()) {
                return -3;
            }
            z();
            return b1Var.C(yVar, hVar, i10, this.O);
        }
        return -3;
    }

    @Override
    public final int j(long j3) {
        if (w()) {
            return 0;
        }
        boolean z10 = this.O;
        b1 b1Var = this.f47813x;
        int v = b1Var.v(j3, z10);
        a aVar = this.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(0) - b1Var.t());
        }
        b1Var.H(v);
        z();
        return v;
    }

    @Override
    public final boolean m(i2.s0 r57) {
        throw new UnsupportedOperationException("Method not decompiled: v2.h.m(i2.s0):boolean");
    }

    @Override
    public final long p() {
        if (this.O) {
            return Long.MIN_VALUE;
        }
        if (w()) {
            return this.I;
        }
        long j3 = this.J;
        a t10 = t();
        if (!t10.c()) {
            ArrayList arrayList = this.v;
            if (arrayList.size() > 1) {
                t10 = (a) hg.c.g(2, arrayList);
            } else {
                t10 = null;
            }
        }
        if (t10 != null) {
            j3 = Math.max(j3, t10.f47798n);
        }
        return Math.max(j3, this.f47813x.q());
    }

    @Override
    public final void r(long j3) {
        int size;
        y2.l lVar = this.f47810r;
        if (!lVar.c() && !w()) {
            boolean d = lVar.d();
            boolean z10 = false;
            List list = this.f47812w;
            l2.l lVar2 = this.f47807e;
            ArrayList arrayList = this.v;
            if (d) {
                e eVar = this.F;
                eVar.getClass();
                boolean z11 = eVar instanceof a;
                if (!z11 || !u(arrayList.size() - 1)) {
                    if (lVar2.f15301m == null) {
                        z10 = lVar2.f15298j.d(j3, eVar, list);
                    }
                    if (z10) {
                        lVar.b();
                        if (z11) {
                            this.L = (a) eVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (lVar2.f15301m == null && lVar2.f15298j.length() >= 2) {
                size = lVar2.f15298j.i(j3, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                e2.d.g(!lVar.d());
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
                    long j10 = t().f47798n;
                    a s10 = s(size);
                    if (arrayList.isEmpty()) {
                        this.I = this.J;
                    }
                    this.O = false;
                    this.h.y(this.f47804a, s10.h, j10);
                }
            }
        }
    }

    public final a s(int i10) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i10);
        d0.V(i10, arrayList.size(), arrayList);
        this.K = Math.max(this.K, arrayList.size());
        int i11 = 0;
        this.f47813x.n(aVar.d(0));
        while (true) {
            b1[] b1VarArr = this.f47814y;
            if (i11 < b1VarArr.length) {
                b1 b1Var = b1VarArr[i11];
                i11++;
                b1Var.n(aVar.d(i11));
            } else {
                return aVar;
            }
        }
    }

    public final a t() {
        return (a) hg.c.g(1, this.v);
    }

    public final boolean u(int i10) {
        int t10;
        a aVar = (a) this.v.get(i10);
        if (this.f47813x.t() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            b1[] b1VarArr = this.f47814y;
            if (i11 >= b1VarArr.length) {
                return false;
            }
            t10 = b1VarArr[i11].t();
            i11++;
        } while (t10 <= aVar.d(i11));
        return true;
    }

    @Override
    public final k4.d v(y2.i r23, long r24, long r26, java.io.IOException r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: v2.h.v(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    public final boolean w() {
        if (this.I != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final void x(y2.i iVar, long j3, long j10, int i10) {
        t tVar;
        e eVar = (e) iVar;
        if (i10 == 0) {
            long j11 = eVar.f47793a;
            tVar = new t(eVar.f47794b);
        } else {
            long j12 = eVar.f47793a;
            Uri uri = eVar.f47799r.f10162c;
            tVar = new t(j10);
        }
        t tVar2 = tVar;
        this.h.s(tVar2, eVar.f47795c, this.f47804a, eVar.d, eVar.f47796e, eVar.f47797f, eVar.h, eVar.f47798n, i10);
    }

    @Override
    public final void x0(y2.i iVar, long j3, long j10, boolean z10) {
        e eVar = (e) iVar;
        this.F = null;
        this.L = null;
        long j11 = eVar.f47793a;
        Uri uri = eVar.f47799r.f10162c;
        t tVar = new t(j10);
        this.f47809n.getClass();
        this.h.o(tVar, eVar.f47795c, this.f47804a, eVar.d, eVar.f47796e, eVar.f47797f, eVar.h, eVar.f47798n);
        if (!z10) {
            if (w()) {
                this.f47813x.D(false);
                for (b1 b1Var : this.f47814y) {
                    b1Var.D(false);
                }
            } else if (eVar instanceof a) {
                ArrayList arrayList = this.v;
                s(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
            }
            this.f47808f.f(this);
        }
    }

    @Override
    public final void y(y2.i iVar, long j3, long j10) {
        e eVar = (e) iVar;
        c3.j jVar = null;
        this.F = null;
        l2.l lVar = this.f47807e;
        l2.j[] jVarArr = lVar.f15297i;
        if (eVar instanceof j) {
            int s10 = lVar.f15298j.s(((j) eVar).d);
            l2.j jVar2 = jVarArr[s10];
            if (jVar2.d == null) {
                d dVar = jVar2.f15286a;
                e2.d.h(dVar);
                b0 b0Var = dVar.f47791n;
                if (b0Var instanceof c3.j) {
                    jVar = (c3.j) b0Var;
                }
                if (jVar != null) {
                    m2.m mVar = jVar2.f15287b;
                    jVarArr[s10] = new l2.j(jVar2.f15289e, mVar, jVar2.f15288c, jVar2.f15286a, jVar2.f15290f, new e6.n(jVar, mVar.f16024c, 4));
                }
            }
        }
        o oVar = lVar.h;
        if (oVar != null) {
            long j11 = oVar.d;
            if (j11 == -9223372036854775807L || eVar.f47798n > j11) {
                oVar.d = eVar.f47798n;
            }
            oVar.f15314e.h = true;
        }
        long j12 = eVar.f47793a;
        Uri uri = eVar.f47799r.f10162c;
        t tVar = new t(j10);
        this.f47809n.getClass();
        this.h.p(tVar, eVar.f47795c, this.f47804a, eVar.d, eVar.f47796e, eVar.f47797f, eVar.h, eVar.f47798n);
        this.f47808f.f(this);
    }

    public final void z() {
        int A = A(this.f47813x.t(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 <= A) {
                this.K = i10 + 1;
                a aVar = (a) this.v.get(i10);
                s sVar = aVar.d;
                if (!sVar.equals(this.G)) {
                    this.h.k(this.f47804a, sVar, aVar.f47796e, aVar.f47797f, aVar.h);
                }
                this.G = sVar;
            } else {
                return;
            }
        }
    }
}
