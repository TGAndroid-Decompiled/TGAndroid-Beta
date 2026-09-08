package v2;

import android.net.Uri;
import b2.p;
import b2.s;
import c3.b0;
import e2.d0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import l2.n;
import n4.y;
import u2.a1;
import u2.b1;
import u2.d1;
import u2.t;
public final class h implements b1, d1, y2.h, y2.k {
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
    public final int f47337a;
    public final int[] f47338b;
    public final s[] f47339c;
    public final boolean[] d;
    public final l2.k f47340e;
    public final l2.b f47341f;
    public final a5.a h;
    public final rb.a f47342n;
    public final y2.m f47343r = new y2.m("ChunkSampleStream");
    public final p f47344s = new p(7);
    public final ArrayList v;
    public final List f47345w;
    public final a1 f47346x;
    public final a1[] f47347y;

    public h(int i10, int[] iArr, s[] sVarArr, l2.k kVar, l2.b bVar, y2.d dVar, long j3, n2.m mVar, n2.j jVar, rb.a aVar, a5.a aVar2, boolean z10) {
        this.f47337a = i10;
        this.f47338b = iArr;
        this.f47339c = sVarArr;
        this.f47340e = kVar;
        this.f47341f = bVar;
        this.h = aVar2;
        this.f47342n = aVar;
        this.M = z10;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.f47345w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f47347y = new a1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        a1[] a1VarArr = new a1[i11];
        mVar.getClass();
        a1 a1Var = new a1(dVar, mVar, jVar);
        this.f47346x = a1Var;
        int i12 = 0;
        iArr2[0] = i10;
        a1VarArr[0] = a1Var;
        while (i12 < length) {
            a1 a1Var2 = new a1(dVar, null, null);
            this.f47347y[i12] = a1Var2;
            int i13 = i12 + 1;
            a1VarArr[i13] = a1Var2;
            iArr2[i13] = this.f47338b[i12];
            i12 = i13;
        }
        this.E = new o0.a(18, iArr2, a1VarArr);
        this.I = j3;
        this.J = j3;
    }

    public final void A() {
        int B = B(this.f47346x.t(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 <= B) {
                this.K = i10 + 1;
                a aVar = (a) this.v.get(i10);
                s sVar = aVar.d;
                if (!sVar.equals(this.G)) {
                    this.h.j(this.f47337a, sVar, aVar.f47329e, aVar.f47330f, aVar.h);
                }
                this.G = sVar;
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
        a1[] a1VarArr;
        this.H = bVar;
        a1 a1Var = this.f47346x;
        a1Var.k();
        n2.g gVar = a1Var.h;
        if (gVar != null) {
            gVar.a(a1Var.f46649e);
            a1Var.h = null;
            a1Var.f46651g = null;
        }
        for (a1 a1Var2 : this.f47347y) {
            a1Var2.k();
            n2.g gVar2 = a1Var2.h;
            if (gVar2 != null) {
                gVar2.a(a1Var2.f46649e);
                a1Var2.h = null;
                a1Var2.f46651g = null;
            }
        }
        this.f47343r.e(this);
    }

    @Override
    public final void a() {
        a1[] a1VarArr;
        a1 a1Var = this.f47346x;
        a1Var.D(true);
        n2.g gVar = a1Var.h;
        if (gVar != null) {
            gVar.a(a1Var.f46649e);
            a1Var.h = null;
            a1Var.f46651g = null;
        }
        for (a1 a1Var2 : this.f47347y) {
            a1Var2.D(true);
            n2.g gVar2 = a1Var2.h;
            if (gVar2 != null) {
                gVar2.a(a1Var2.f46649e);
                a1Var2.h = null;
                a1Var2.f46651g = null;
            }
        }
        for (l2.i iVar : this.f47340e.f15260i) {
            d dVar = iVar.f15249a;
            if (dVar != null) {
                dVar.f47319a.release();
            }
        }
        g gVar3 = this.H;
        if (gVar3 != null) {
            l2.b bVar = (l2.b) gVar3;
            synchronized (bVar) {
                n nVar = (n) bVar.f15218y.remove(this);
                if (nVar != null) {
                    a1 a1Var3 = nVar.f15274a;
                    a1Var3.D(true);
                    n2.g gVar4 = a1Var3.h;
                    if (gVar4 != null) {
                        gVar4.a(a1Var3.f46649e);
                        a1Var3.h = null;
                        a1Var3.f46651g = null;
                    }
                }
            }
        }
    }

    @Override
    public final void b() {
        y2.m mVar = this.f47343r;
        mVar.b();
        this.f47346x.z();
        if (!mVar.d()) {
            l2.k kVar = this.f47340e;
            u2.b bVar = kVar.f15264m;
            if (bVar == null) {
                kVar.f15254a.b();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final boolean c() {
        return this.f47343r.d();
    }

    @Override
    public final long d() {
        if (z()) {
            return this.I;
        }
        if (this.O) {
            return Long.MIN_VALUE;
        }
        return x().f47331n;
    }

    @Override
    public final boolean e() {
        if (!z() && this.f47346x.x(this.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(y yVar, h2.h hVar, int i10) {
        if (!z()) {
            a aVar = this.L;
            a1 a1Var = this.f47346x;
            if (aVar != null && aVar.d(0) <= a1Var.t()) {
                return -3;
            }
            A();
            return a1Var.C(yVar, hVar, i10, this.O);
        }
        return -3;
    }

    @Override
    public final k4.d g(y2.j r23, long r24, long r26, java.io.IOException r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: v2.h.g(y2.j, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void h(y2.j jVar, long j3, long j10, int i10) {
        t tVar;
        e eVar = (e) jVar;
        if (i10 == 0) {
            long j11 = eVar.f47326a;
            tVar = new t(eVar.f47327b);
        } else {
            long j12 = eVar.f47326a;
            Uri uri = eVar.f47332r.f10326c;
            tVar = new t(j10);
        }
        t tVar2 = tVar;
        this.h.r(tVar2, eVar.f47328c, this.f47337a, eVar.d, eVar.f47329e, eVar.f47330f, eVar.h, eVar.f47331n, i10);
    }

    @Override
    public final void i(y2.j jVar, long j3, long j10) {
        e eVar = (e) jVar;
        c3.j jVar2 = null;
        this.F = null;
        l2.k kVar = this.f47340e;
        l2.i[] iVarArr = kVar.f15260i;
        if (eVar instanceof j) {
            int s10 = kVar.f15261j.s(((j) eVar).d);
            l2.i iVar = iVarArr[s10];
            if (iVar.d == null) {
                d dVar = iVar.f15249a;
                e2.d.h(dVar);
                b0 b0Var = dVar.f47324n;
                if (b0Var instanceof c3.j) {
                    jVar2 = (c3.j) b0Var;
                }
                if (jVar2 != null) {
                    m2.m mVar = iVar.f15250b;
                    iVarArr[s10] = new l2.i(iVar.f15252e, mVar, iVar.f15251c, iVar.f15249a, iVar.f15253f, new e6.n(jVar2, mVar.f15826c, 4));
                }
            }
        }
        n nVar = kVar.h;
        if (nVar != null) {
            long j11 = nVar.d;
            if (j11 == -9223372036854775807L || eVar.f47331n > j11) {
                nVar.d = eVar.f47331n;
            }
            nVar.f15277e.h = true;
        }
        long j12 = eVar.f47326a;
        Uri uri = eVar.f47332r.f10326c;
        t tVar = new t(j10);
        this.f47342n.getClass();
        this.h.o(tVar, eVar.f47328c, this.f47337a, eVar.d, eVar.f47329e, eVar.f47330f, eVar.h, eVar.f47331n);
        this.f47341f.b(this);
    }

    @Override
    public final int m(long j3) {
        if (z()) {
            return 0;
        }
        boolean z10 = this.O;
        a1 a1Var = this.f47346x;
        int v = a1Var.v(j3, z10);
        a aVar = this.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(0) - a1Var.t());
        }
        a1Var.H(v);
        A();
        return v;
    }

    @Override
    public final boolean p(i2.r0 r57) {
        throw new UnsupportedOperationException("Method not decompiled: v2.h.p(i2.r0):boolean");
    }

    @Override
    public final long s() {
        if (this.O) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.I;
        }
        long j3 = this.J;
        a x10 = x();
        if (!x10.c()) {
            ArrayList arrayList = this.v;
            if (arrayList.size() > 1) {
                x10 = (a) i2.g.h(2, arrayList);
            } else {
                x10 = null;
            }
        }
        if (x10 != null) {
            j3 = Math.max(j3, x10.f47331n);
        }
        return Math.max(j3, this.f47346x.q());
    }

    @Override
    public final void u(long j3) {
        int size;
        y2.m mVar = this.f47343r;
        if (!mVar.c() && !z()) {
            boolean d = mVar.d();
            boolean z10 = false;
            List list = this.f47345w;
            l2.k kVar = this.f47340e;
            ArrayList arrayList = this.v;
            if (d) {
                e eVar = this.F;
                eVar.getClass();
                boolean z11 = eVar instanceof a;
                if (!z11 || !y(arrayList.size() - 1)) {
                    if (kVar.f15264m == null) {
                        z10 = kVar.f15261j.d(j3, eVar, list);
                    }
                    if (z10) {
                        mVar.a();
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
            if (kVar.f15264m == null && kVar.f15261j.length() >= 2) {
                size = kVar.f15261j.i(j3, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                e2.d.g(!mVar.d());
                int size2 = arrayList.size();
                while (true) {
                    if (size < size2) {
                        if (!y(size)) {
                            break;
                        }
                        size++;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (size != -1) {
                    long j10 = x().f47331n;
                    a v = v(size);
                    if (arrayList.isEmpty()) {
                        this.I = this.J;
                    }
                    this.O = false;
                    this.h.y(this.f47337a, v.h, j10);
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
        this.f47346x.n(aVar.d(0));
        while (true) {
            a1[] a1VarArr = this.f47347y;
            if (i11 < a1VarArr.length) {
                a1 a1Var = a1VarArr[i11];
                i11++;
                a1Var.n(aVar.d(i11));
            } else {
                return aVar;
            }
        }
    }

    @Override
    public final void w(y2.j jVar, long j3, long j10, boolean z10) {
        e eVar = (e) jVar;
        this.F = null;
        this.L = null;
        long j11 = eVar.f47326a;
        Uri uri = eVar.f47332r.f10326c;
        t tVar = new t(j10);
        this.f47342n.getClass();
        this.h.n(tVar, eVar.f47328c, this.f47337a, eVar.d, eVar.f47329e, eVar.f47330f, eVar.h, eVar.f47331n);
        if (!z10) {
            if (z()) {
                this.f47346x.D(false);
                for (a1 a1Var : this.f47347y) {
                    a1Var.D(false);
                }
            } else if (eVar instanceof a) {
                ArrayList arrayList = this.v;
                v(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
            }
            this.f47341f.b(this);
        }
    }

    public final a x() {
        return (a) i2.g.h(1, this.v);
    }

    public final boolean y(int i10) {
        int t10;
        a aVar = (a) this.v.get(i10);
        if (this.f47346x.t() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            a1[] a1VarArr = this.f47347y;
            if (i11 >= a1VarArr.length) {
                return false;
            }
            t10 = a1VarArr[i11].t();
            i11++;
        } while (t10 <= aVar.d(i11));
        return true;
    }

    public final boolean z() {
        if (this.I != -9223372036854775807L) {
            return true;
        }
        return false;
    }
}
