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
    public final int f47310a;
    public final int[] f47311b;
    public final s[] f47312c;
    public final boolean[] d;
    public final l2.k f47313e;
    public final l2.b f47314f;
    public final a5.a h;
    public final rb.a f47315n;
    public final y2.m f47316r = new y2.m("ChunkSampleStream");
    public final p f47317s = new p(7);
    public final ArrayList v;
    public final List f47318w;
    public final a1 f47319x;
    public final a1[] f47320y;

    public h(int i10, int[] iArr, s[] sVarArr, l2.k kVar, l2.b bVar, y2.d dVar, long j3, n2.m mVar, n2.j jVar, rb.a aVar, a5.a aVar2, boolean z10) {
        this.f47310a = i10;
        this.f47311b = iArr;
        this.f47312c = sVarArr;
        this.f47313e = kVar;
        this.f47314f = bVar;
        this.h = aVar2;
        this.f47315n = aVar;
        this.M = z10;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.f47318w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f47320y = new a1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        a1[] a1VarArr = new a1[i11];
        mVar.getClass();
        a1 a1Var = new a1(dVar, mVar, jVar);
        this.f47319x = a1Var;
        int i12 = 0;
        iArr2[0] = i10;
        a1VarArr[0] = a1Var;
        while (i12 < length) {
            a1 a1Var2 = new a1(dVar, null, null);
            this.f47320y[i12] = a1Var2;
            int i13 = i12 + 1;
            a1VarArr[i13] = a1Var2;
            iArr2[i13] = this.f47311b[i12];
            i12 = i13;
        }
        this.E = new o0.a(18, iArr2, a1VarArr);
        this.I = j3;
        this.J = j3;
    }

    public final void A() {
        int B = B(this.f47319x.t(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 <= B) {
                this.K = i10 + 1;
                a aVar = (a) this.v.get(i10);
                s sVar = aVar.d;
                if (!sVar.equals(this.G)) {
                    this.h.j(this.f47310a, sVar, aVar.f47302e, aVar.f47303f, aVar.h);
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
        a1 a1Var = this.f47319x;
        a1Var.k();
        n2.g gVar = a1Var.h;
        if (gVar != null) {
            gVar.a(a1Var.f46622e);
            a1Var.h = null;
            a1Var.f46624g = null;
        }
        for (a1 a1Var2 : this.f47320y) {
            a1Var2.k();
            n2.g gVar2 = a1Var2.h;
            if (gVar2 != null) {
                gVar2.a(a1Var2.f46622e);
                a1Var2.h = null;
                a1Var2.f46624g = null;
            }
        }
        this.f47316r.e(this);
    }

    @Override
    public final void a() {
        a1[] a1VarArr;
        a1 a1Var = this.f47319x;
        a1Var.D(true);
        n2.g gVar = a1Var.h;
        if (gVar != null) {
            gVar.a(a1Var.f46622e);
            a1Var.h = null;
            a1Var.f46624g = null;
        }
        for (a1 a1Var2 : this.f47320y) {
            a1Var2.D(true);
            n2.g gVar2 = a1Var2.h;
            if (gVar2 != null) {
                gVar2.a(a1Var2.f46622e);
                a1Var2.h = null;
                a1Var2.f46624g = null;
            }
        }
        for (l2.i iVar : this.f47313e.f15234i) {
            d dVar = iVar.f15223a;
            if (dVar != null) {
                dVar.f47292a.release();
            }
        }
        g gVar3 = this.H;
        if (gVar3 != null) {
            l2.b bVar = (l2.b) gVar3;
            synchronized (bVar) {
                n nVar = (n) bVar.f15192y.remove(this);
                if (nVar != null) {
                    a1 a1Var3 = nVar.f15248a;
                    a1Var3.D(true);
                    n2.g gVar4 = a1Var3.h;
                    if (gVar4 != null) {
                        gVar4.a(a1Var3.f46622e);
                        a1Var3.h = null;
                        a1Var3.f46624g = null;
                    }
                }
            }
        }
    }

    @Override
    public final void b() {
        y2.m mVar = this.f47316r;
        mVar.b();
        this.f47319x.z();
        if (!mVar.d()) {
            l2.k kVar = this.f47313e;
            u2.b bVar = kVar.f15238m;
            if (bVar == null) {
                kVar.f15228a.b();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final boolean c() {
        return this.f47316r.d();
    }

    @Override
    public final long d() {
        if (z()) {
            return this.I;
        }
        if (this.O) {
            return Long.MIN_VALUE;
        }
        return x().f47304n;
    }

    @Override
    public final boolean e() {
        if (!z() && this.f47319x.x(this.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(y yVar, h2.g gVar, int i10) {
        if (!z()) {
            a aVar = this.L;
            a1 a1Var = this.f47319x;
            if (aVar != null && aVar.d(0) <= a1Var.t()) {
                return -3;
            }
            A();
            return a1Var.C(yVar, gVar, i10, this.O);
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
            long j11 = eVar.f47299a;
            tVar = new t(eVar.f47300b);
        } else {
            long j12 = eVar.f47299a;
            Uri uri = eVar.f47305r.f10298c;
            tVar = new t(j10);
        }
        t tVar2 = tVar;
        this.h.r(tVar2, eVar.f47301c, this.f47310a, eVar.d, eVar.f47302e, eVar.f47303f, eVar.h, eVar.f47304n, i10);
    }

    @Override
    public final void i(y2.j jVar, long j3, long j10) {
        e eVar = (e) jVar;
        c3.j jVar2 = null;
        this.F = null;
        l2.k kVar = this.f47313e;
        l2.i[] iVarArr = kVar.f15234i;
        if (eVar instanceof j) {
            int s10 = kVar.f15235j.s(((j) eVar).d);
            l2.i iVar = iVarArr[s10];
            if (iVar.d == null) {
                d dVar = iVar.f15223a;
                e2.d.h(dVar);
                b0 b0Var = dVar.f47297n;
                if (b0Var instanceof c3.j) {
                    jVar2 = (c3.j) b0Var;
                }
                if (jVar2 != null) {
                    m2.m mVar = iVar.f15224b;
                    iVarArr[s10] = new l2.i(iVar.f15226e, mVar, iVar.f15225c, iVar.f15223a, iVar.f15227f, new e6.n(jVar2, mVar.f15799c, 4));
                }
            }
        }
        n nVar = kVar.h;
        if (nVar != null) {
            long j11 = nVar.d;
            if (j11 == -9223372036854775807L || eVar.f47304n > j11) {
                nVar.d = eVar.f47304n;
            }
            nVar.f15251e.h = true;
        }
        long j12 = eVar.f47299a;
        Uri uri = eVar.f47305r.f10298c;
        t tVar = new t(j10);
        this.f47315n.getClass();
        this.h.o(tVar, eVar.f47301c, this.f47310a, eVar.d, eVar.f47302e, eVar.f47303f, eVar.h, eVar.f47304n);
        this.f47314f.b(this);
    }

    @Override
    public final int m(long j3) {
        if (z()) {
            return 0;
        }
        boolean z10 = this.O;
        a1 a1Var = this.f47319x;
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
            j3 = Math.max(j3, x10.f47304n);
        }
        return Math.max(j3, this.f47319x.q());
    }

    @Override
    public final void u(long j3) {
        int size;
        y2.m mVar = this.f47316r;
        if (!mVar.c() && !z()) {
            boolean d = mVar.d();
            boolean z10 = false;
            List list = this.f47318w;
            l2.k kVar = this.f47313e;
            ArrayList arrayList = this.v;
            if (d) {
                e eVar = this.F;
                eVar.getClass();
                boolean z11 = eVar instanceof a;
                if (!z11 || !y(arrayList.size() - 1)) {
                    if (kVar.f15238m == null) {
                        z10 = kVar.f15235j.d(j3, eVar, list);
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
            if (kVar.f15238m == null && kVar.f15235j.length() >= 2) {
                size = kVar.f15235j.i(j3, list);
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
                    long j10 = x().f47304n;
                    a v = v(size);
                    if (arrayList.isEmpty()) {
                        this.I = this.J;
                    }
                    this.O = false;
                    this.h.y(this.f47310a, v.h, j10);
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
        this.f47319x.n(aVar.d(0));
        while (true) {
            a1[] a1VarArr = this.f47320y;
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
        long j11 = eVar.f47299a;
        Uri uri = eVar.f47305r.f10298c;
        t tVar = new t(j10);
        this.f47315n.getClass();
        this.h.n(tVar, eVar.f47301c, this.f47310a, eVar.d, eVar.f47302e, eVar.f47303f, eVar.h, eVar.f47304n);
        if (!z10) {
            if (z()) {
                this.f47319x.D(false);
                for (a1 a1Var : this.f47320y) {
                    a1Var.D(false);
                }
            } else if (eVar instanceof a) {
                ArrayList arrayList = this.v;
                v(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
            }
            this.f47314f.b(this);
        }
    }

    public final a x() {
        return (a) i2.g.h(1, this.v);
    }

    public final boolean y(int i10) {
        int t10;
        a aVar = (a) this.v.get(i10);
        if (this.f47319x.t() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            a1[] a1VarArr = this.f47320y;
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
