package v2;

import android.net.Uri;
import b2.p;
import b2.s;
import c3.b0;
import e2.d0;
import hg.k0;
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
    public final int f47788a;
    public final int[] f47789b;
    public final s[] f47790c;
    public final boolean[] d;
    public final l2.l f47791e;
    public final l2.b f47792f;
    public final a5.a h;
    public final qb.b f47793n;
    public final y2.l f47794r = new y2.l("ChunkSampleStream");
    public final p f47795s = new p(7);
    public final ArrayList v;
    public final List f47796w;
    public final b1 f47797x;
    public final b1[] f47798y;

    public h(int i10, int[] iArr, s[] sVarArr, l2.l lVar, l2.b bVar, y2.d dVar, long j3, n nVar, n2.k kVar, qb.b bVar2, a5.a aVar, boolean z10) {
        this.f47788a = i10;
        this.f47789b = iArr;
        this.f47790c = sVarArr;
        this.f47791e = lVar;
        this.f47792f = bVar;
        this.h = aVar;
        this.f47793n = bVar2;
        this.M = z10;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.f47796w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f47798y = new b1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        b1[] b1VarArr = new b1[i11];
        nVar.getClass();
        b1 b1Var = new b1(dVar, nVar, kVar);
        this.f47797x = b1Var;
        int i12 = 0;
        iArr2[0] = i10;
        b1VarArr[0] = b1Var;
        while (i12 < length) {
            b1 b1Var2 = new b1(dVar, null, null);
            this.f47798y[i12] = b1Var2;
            int i13 = i12 + 1;
            b1VarArr[i13] = b1Var2;
            iArr2[i13] = this.f47789b[i12];
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
        b1 b1Var = this.f47797x;
        b1Var.k();
        n2.h hVar = b1Var.h;
        if (hVar != null) {
            hVar.a(b1Var.f47217e);
            b1Var.h = null;
            b1Var.f47219g = null;
        }
        for (b1 b1Var2 : this.f47798y) {
            b1Var2.k();
            n2.h hVar2 = b1Var2.h;
            if (hVar2 != null) {
                hVar2.a(b1Var2.f47217e);
                b1Var2.h = null;
                b1Var2.f47219g = null;
            }
        }
        this.f47794r.e(this);
    }

    @Override
    public final void a() {
        y2.l lVar = this.f47794r;
        lVar.a();
        this.f47797x.z();
        if (!lVar.d()) {
            l2.l lVar2 = this.f47791e;
            u2.b bVar = lVar2.f15299m;
            if (bVar == null) {
                lVar2.f15289a.a();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final void b() {
        b1[] b1VarArr;
        b1 b1Var = this.f47797x;
        b1Var.D(true);
        n2.h hVar = b1Var.h;
        if (hVar != null) {
            hVar.a(b1Var.f47217e);
            b1Var.h = null;
            b1Var.f47219g = null;
        }
        for (b1 b1Var2 : this.f47798y) {
            b1Var2.D(true);
            n2.h hVar2 = b1Var2.h;
            if (hVar2 != null) {
                hVar2.a(b1Var2.f47217e);
                b1Var2.h = null;
                b1Var2.f47219g = null;
            }
        }
        for (l2.j jVar : this.f47791e.f15295i) {
            d dVar = jVar.f15284a;
            if (dVar != null) {
                dVar.f47770a.release();
            }
        }
        g gVar = this.H;
        if (gVar != null) {
            l2.b bVar = (l2.b) gVar;
            synchronized (bVar) {
                o oVar = (o) bVar.f15251y.remove(this);
                if (oVar != null) {
                    b1 b1Var3 = oVar.f15309a;
                    b1Var3.D(true);
                    n2.h hVar3 = b1Var3.h;
                    if (hVar3 != null) {
                        hVar3.a(b1Var3.f47217e);
                        b1Var3.h = null;
                        b1Var3.f47219g = null;
                    }
                }
            }
        }
    }

    @Override
    public final boolean c() {
        return this.f47794r.d();
    }

    @Override
    public final long d() {
        if (y()) {
            return this.I;
        }
        if (this.O) {
            return Long.MIN_VALUE;
        }
        return w().f47782n;
    }

    @Override
    public final boolean e() {
        if (!y() && this.f47797x.x(this.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(y yVar, h2.h hVar, int i10) {
        if (!y()) {
            a aVar = this.L;
            b1 b1Var = this.f47797x;
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
        if (y()) {
            return 0;
        }
        boolean z10 = this.O;
        b1 b1Var = this.f47797x;
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
        if (y()) {
            return this.I;
        }
        long j3 = this.J;
        a w10 = w();
        if (!w10.c()) {
            ArrayList arrayList = this.v;
            if (arrayList.size() > 1) {
                w10 = (a) k0.g(2, arrayList);
            } else {
                w10 = null;
            }
        }
        if (w10 != null) {
            j3 = Math.max(j3, w10.f47782n);
        }
        return Math.max(j3, this.f47797x.q());
    }

    @Override
    public final void r(long j3) {
        int size;
        y2.l lVar = this.f47794r;
        if (!lVar.c() && !y()) {
            boolean d = lVar.d();
            boolean z10 = false;
            List list = this.f47796w;
            l2.l lVar2 = this.f47791e;
            ArrayList arrayList = this.v;
            if (d) {
                e eVar = this.F;
                eVar.getClass();
                boolean z11 = eVar instanceof a;
                if (!z11 || !x(arrayList.size() - 1)) {
                    if (lVar2.f15299m == null) {
                        z10 = lVar2.f15296j.d(j3, eVar, list);
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
            if (lVar2.f15299m == null && lVar2.f15296j.length() >= 2) {
                size = lVar2.f15296j.i(j3, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                e2.d.g(!lVar.d());
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
                    long j10 = w().f47782n;
                    a u10 = u(size);
                    if (arrayList.isEmpty()) {
                        this.I = this.J;
                    }
                    this.O = false;
                    this.h.y(this.f47788a, u10.h, j10);
                }
            }
        }
    }

    @Override
    public final k4.d s(y2.i r23, long r24, long r26, java.io.IOException r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: v2.h.s(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void t(y2.i iVar, long j3, long j10, int i10) {
        t tVar;
        e eVar = (e) iVar;
        if (i10 == 0) {
            long j11 = eVar.f47777a;
            tVar = new t(eVar.f47778b);
        } else {
            long j12 = eVar.f47777a;
            Uri uri = eVar.f47783r.f10161c;
            tVar = new t(j10);
        }
        t tVar2 = tVar;
        this.h.s(tVar2, eVar.f47779c, this.f47788a, eVar.d, eVar.f47780e, eVar.f47781f, eVar.h, eVar.f47782n, i10);
    }

    public final a u(int i10) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i10);
        d0.V(i10, arrayList.size(), arrayList);
        this.K = Math.max(this.K, arrayList.size());
        int i11 = 0;
        this.f47797x.n(aVar.d(0));
        while (true) {
            b1[] b1VarArr = this.f47798y;
            if (i11 < b1VarArr.length) {
                b1 b1Var = b1VarArr[i11];
                i11++;
                b1Var.n(aVar.d(i11));
            } else {
                return aVar;
            }
        }
    }

    @Override
    public final void v(y2.i iVar, long j3, long j10) {
        e eVar = (e) iVar;
        c3.j jVar = null;
        this.F = null;
        l2.l lVar = this.f47791e;
        l2.j[] jVarArr = lVar.f15295i;
        if (eVar instanceof j) {
            int s10 = lVar.f15296j.s(((j) eVar).d);
            l2.j jVar2 = jVarArr[s10];
            if (jVar2.d == null) {
                d dVar = jVar2.f15284a;
                e2.d.h(dVar);
                b0 b0Var = dVar.f47775n;
                if (b0Var instanceof c3.j) {
                    jVar = (c3.j) b0Var;
                }
                if (jVar != null) {
                    m2.m mVar = jVar2.f15285b;
                    jVarArr[s10] = new l2.j(jVar2.f15287e, mVar, jVar2.f15286c, jVar2.f15284a, jVar2.f15288f, new e6.n(jVar, mVar.f16014c, 4));
                }
            }
        }
        o oVar = lVar.h;
        if (oVar != null) {
            long j11 = oVar.d;
            if (j11 == -9223372036854775807L || eVar.f47782n > j11) {
                oVar.d = eVar.f47782n;
            }
            oVar.f15312e.h = true;
        }
        long j12 = eVar.f47777a;
        Uri uri = eVar.f47783r.f10161c;
        t tVar = new t(j10);
        this.f47793n.getClass();
        this.h.p(tVar, eVar.f47779c, this.f47788a, eVar.d, eVar.f47780e, eVar.f47781f, eVar.h, eVar.f47782n);
        this.f47792f.f(this);
    }

    public final a w() {
        return (a) k0.g(1, this.v);
    }

    public final boolean x(int i10) {
        int t10;
        a aVar = (a) this.v.get(i10);
        if (this.f47797x.t() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            b1[] b1VarArr = this.f47798y;
            if (i11 >= b1VarArr.length) {
                return false;
            }
            t10 = b1VarArr[i11].t();
            i11++;
        } while (t10 <= aVar.d(i11));
        return true;
    }

    @Override
    public final void x0(y2.i iVar, long j3, long j10, boolean z10) {
        e eVar = (e) iVar;
        this.F = null;
        this.L = null;
        long j11 = eVar.f47777a;
        Uri uri = eVar.f47783r.f10161c;
        t tVar = new t(j10);
        this.f47793n.getClass();
        this.h.o(tVar, eVar.f47779c, this.f47788a, eVar.d, eVar.f47780e, eVar.f47781f, eVar.h, eVar.f47782n);
        if (!z10) {
            if (y()) {
                this.f47797x.D(false);
                for (b1 b1Var : this.f47798y) {
                    b1Var.D(false);
                }
            } else if (eVar instanceof a) {
                ArrayList arrayList = this.v;
                u(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
            }
            this.f47792f.f(this);
        }
    }

    public final boolean y() {
        if (this.I != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void z() {
        int A = A(this.f47797x.t(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 <= A) {
                this.K = i10 + 1;
                a aVar = (a) this.v.get(i10);
                s sVar = aVar.d;
                if (!sVar.equals(this.G)) {
                    this.h.k(this.f47788a, sVar, aVar.f47780e, aVar.f47781f, aVar.h);
                }
                this.G = sVar;
            } else {
                return;
            }
        }
    }
}
