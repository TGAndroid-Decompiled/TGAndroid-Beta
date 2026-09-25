package v2;

import android.net.Uri;
import b2.p;
import b2.s;
import c3.b0;
import e2.d0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import n2.n;
import n4.y;
import u2.a1;
import u2.b1;
import u2.d1;
import u2.t;
public final class h implements b1, d1, y2.g, y2.j {
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
    public final int f44134a;
    public final int[] f44135b;
    public final s[] f44136c;
    public final boolean[] d;
    public final l2.k e;
    public final l2.b f44137f;
    public final a5.a h;
    public final qb.b f44138n;
    public final y2.l f44139r = new y2.l("ChunkSampleStream");
    public final p f44140s = new p(7);
    public final ArrayList v;
    public final List f44141w;
    public final a1 f44142x;
    public final a1[] f44143y;

    public h(int i10, int[] iArr, s[] sVarArr, l2.k kVar, l2.b bVar, y2.d dVar, long j3, n nVar, n2.k kVar2, qb.b bVar2, a5.a aVar, boolean z10) {
        this.f44134a = i10;
        this.f44135b = iArr;
        this.f44136c = sVarArr;
        this.e = kVar;
        this.f44137f = bVar;
        this.h = aVar;
        this.f44138n = bVar2;
        this.M = z10;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.f44141w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f44143y = new a1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        a1[] a1VarArr = new a1[i11];
        nVar.getClass();
        a1 a1Var = new a1(dVar, nVar, kVar2);
        this.f44142x = a1Var;
        int i12 = 0;
        iArr2[0] = i10;
        a1VarArr[0] = a1Var;
        while (i12 < length) {
            a1 a1Var2 = new a1(dVar, null, null);
            this.f44143y[i12] = a1Var2;
            int i13 = i12 + 1;
            a1VarArr[i13] = a1Var2;
            iArr2[i13] = this.f44135b[i12];
            i12 = i13;
        }
        this.E = new o0.a(18, iArr2, a1VarArr);
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
        a1[] a1VarArr;
        this.H = bVar;
        a1 a1Var = this.f44142x;
        a1Var.k();
        n2.h hVar = a1Var.h;
        if (hVar != null) {
            hVar.a(a1Var.e);
            a1Var.h = null;
            a1Var.f43601g = null;
        }
        for (a1 a1Var2 : this.f44143y) {
            a1Var2.k();
            n2.h hVar2 = a1Var2.h;
            if (hVar2 != null) {
                hVar2.a(a1Var2.e);
                a1Var2.h = null;
                a1Var2.f43601g = null;
            }
        }
        this.f44139r.e(this);
    }

    @Override
    public final void E(y2.i iVar, long j3, long j10, boolean z10) {
        e eVar = (e) iVar;
        this.F = null;
        this.L = null;
        long j11 = eVar.f44125a;
        Uri uri = eVar.f44130r.f9334c;
        t tVar = new t(j10);
        this.f44138n.getClass();
        this.h.o(tVar, eVar.f44127c, this.f44134a, eVar.d, eVar.e, eVar.f44128f, eVar.h, eVar.f44129n);
        if (!z10) {
            if (y()) {
                this.f44142x.D(false);
                for (a1 a1Var : this.f44143y) {
                    a1Var.D(false);
                }
            } else if (eVar instanceof a) {
                ArrayList arrayList = this.v;
                v(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
            }
            this.f44137f.m(this);
        }
    }

    @Override
    public final void a() {
        y2.l lVar = this.f44139r;
        lVar.a();
        this.f44142x.z();
        if (!lVar.d()) {
            l2.k kVar = this.e;
            u2.b bVar = kVar.f14078m;
            if (bVar == null) {
                kVar.f14069a.a();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final void b() {
        a1[] a1VarArr;
        a1 a1Var = this.f44142x;
        a1Var.D(true);
        n2.h hVar = a1Var.h;
        if (hVar != null) {
            hVar.a(a1Var.e);
            a1Var.h = null;
            a1Var.f43601g = null;
        }
        for (a1 a1Var2 : this.f44143y) {
            a1Var2.D(true);
            n2.h hVar2 = a1Var2.h;
            if (hVar2 != null) {
                hVar2.a(a1Var2.e);
                a1Var2.h = null;
                a1Var2.f43601g = null;
            }
        }
        for (l2.i iVar : this.e.f14074i) {
            d dVar = iVar.f14065a;
            if (dVar != null) {
                dVar.f44119a.release();
            }
        }
        g gVar = this.H;
        if (gVar != null) {
            l2.b bVar = (l2.b) gVar;
            synchronized (bVar) {
                l2.n nVar = (l2.n) bVar.f14035y.remove(this);
                if (nVar != null) {
                    a1 a1Var3 = nVar.f14087a;
                    a1Var3.D(true);
                    n2.h hVar3 = a1Var3.h;
                    if (hVar3 != null) {
                        hVar3.a(a1Var3.e);
                        a1Var3.h = null;
                        a1Var3.f43601g = null;
                    }
                }
            }
        }
    }

    @Override
    public final boolean c() {
        return this.f44139r.d();
    }

    @Override
    public final long d() {
        if (y()) {
            return this.I;
        }
        if (this.O) {
            return Long.MIN_VALUE;
        }
        return w().f44129n;
    }

    @Override
    public final boolean e() {
        if (!y() && this.f44142x.x(this.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(y yVar, h2.h hVar, int i10) {
        if (!y()) {
            a aVar = this.L;
            a1 a1Var = this.f44142x;
            if (aVar != null && aVar.d(0) <= a1Var.t()) {
                return -3;
            }
            z();
            return a1Var.C(yVar, hVar, i10, this.O);
        }
        return -3;
    }

    @Override
    public final int j(long j3) {
        if (y()) {
            return 0;
        }
        boolean z10 = this.O;
        a1 a1Var = this.f44142x;
        int v = a1Var.v(j3, z10);
        a aVar = this.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(0) - a1Var.t());
        }
        a1Var.H(v);
        z();
        return v;
    }

    @Override
    public final k4.d m(y2.i r23, long r24, long r26, java.io.IOException r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: v2.h.m(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void n(y2.i iVar, long j3, long j10, int i10) {
        t tVar;
        e eVar = (e) iVar;
        if (i10 == 0) {
            long j11 = eVar.f44125a;
            tVar = new t(eVar.f44126b);
        } else {
            long j12 = eVar.f44125a;
            Uri uri = eVar.f44130r.f9334c;
            tVar = new t(j10);
        }
        t tVar2 = tVar;
        this.h.s(tVar2, eVar.f44127c, this.f44134a, eVar.d, eVar.e, eVar.f44128f, eVar.h, eVar.f44129n, i10);
    }

    @Override
    public final void o(y2.i iVar, long j3, long j10) {
        e eVar = (e) iVar;
        c3.j jVar = null;
        this.F = null;
        l2.k kVar = this.e;
        l2.i[] iVarArr = kVar.f14074i;
        if (eVar instanceof j) {
            int s10 = kVar.f14075j.s(((j) eVar).d);
            l2.i iVar2 = iVarArr[s10];
            if (iVar2.d == null) {
                d dVar = iVar2.f14065a;
                e2.d.h(dVar);
                b0 b0Var = dVar.f44123n;
                if (b0Var instanceof c3.j) {
                    jVar = (c3.j) b0Var;
                }
                if (jVar != null) {
                    m2.m mVar = iVar2.f14066b;
                    iVarArr[s10] = new l2.i(iVar2.e, mVar, iVar2.f14067c, iVar2.f14065a, iVar2.f14068f, new e6.n(jVar, mVar.f14673c, 4));
                }
            }
        }
        l2.n nVar = kVar.h;
        if (nVar != null) {
            long j11 = nVar.d;
            if (j11 == -9223372036854775807L || eVar.f44129n > j11) {
                nVar.d = eVar.f44129n;
            }
            nVar.e.h = true;
        }
        long j12 = eVar.f44125a;
        Uri uri = eVar.f44130r.f9334c;
        t tVar = new t(j10);
        this.f44138n.getClass();
        this.h.p(tVar, eVar.f44127c, this.f44134a, eVar.d, eVar.e, eVar.f44128f, eVar.h, eVar.f44129n);
        this.f44137f.m(this);
    }

    @Override
    public final boolean p(i2.s0 r57) {
        throw new UnsupportedOperationException("Method not decompiled: v2.h.p(i2.s0):boolean");
    }

    @Override
    public final long s() {
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
                w10 = (a) hg.c.g(2, arrayList);
            } else {
                w10 = null;
            }
        }
        if (w10 != null) {
            j3 = Math.max(j3, w10.f44129n);
        }
        return Math.max(j3, this.f44142x.q());
    }

    @Override
    public final void u(long j3) {
        int size;
        y2.l lVar = this.f44139r;
        if (!lVar.c() && !y()) {
            boolean d = lVar.d();
            boolean z10 = false;
            List list = this.f44141w;
            l2.k kVar = this.e;
            ArrayList arrayList = this.v;
            if (d) {
                e eVar = this.F;
                eVar.getClass();
                boolean z11 = eVar instanceof a;
                if (!z11 || !x(arrayList.size() - 1)) {
                    if (kVar.f14078m == null) {
                        z10 = kVar.f14075j.d(j3, eVar, list);
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
            if (kVar.f14078m == null && kVar.f14075j.length() >= 2) {
                size = kVar.f14075j.i(j3, list);
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
                    long j10 = w().f44129n;
                    a v = v(size);
                    if (arrayList.isEmpty()) {
                        this.I = this.J;
                    }
                    this.O = false;
                    this.h.y(this.f44134a, v.h, j10);
                }
            }
        }
    }

    public final a v(int i10) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i10);
        d0.V(i10, arrayList.size(), arrayList);
        this.K = Math.max(this.K, arrayList.size());
        int i11 = 0;
        this.f44142x.n(aVar.d(0));
        while (true) {
            a1[] a1VarArr = this.f44143y;
            if (i11 < a1VarArr.length) {
                a1 a1Var = a1VarArr[i11];
                i11++;
                a1Var.n(aVar.d(i11));
            } else {
                return aVar;
            }
        }
    }

    public final a w() {
        return (a) hg.c.g(1, this.v);
    }

    public final boolean x(int i10) {
        int t10;
        a aVar = (a) this.v.get(i10);
        if (this.f44142x.t() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            a1[] a1VarArr = this.f44143y;
            if (i11 >= a1VarArr.length) {
                return false;
            }
            t10 = a1VarArr[i11].t();
            i11++;
        } while (t10 <= aVar.d(i11));
        return true;
    }

    public final boolean y() {
        if (this.I != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void z() {
        int A = A(this.f44142x.t(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 <= A) {
                this.K = i10 + 1;
                a aVar = (a) this.v.get(i10);
                s sVar = aVar.d;
                if (!sVar.equals(this.G)) {
                    this.h.k(this.f44134a, sVar, aVar.e, aVar.f44128f, aVar.h);
                }
                this.G = sVar;
            } else {
                return;
            }
        }
    }
}
