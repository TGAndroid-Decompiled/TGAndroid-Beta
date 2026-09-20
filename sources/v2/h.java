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
import n2.n;
import n4.y;
import u2.b1;
import u2.c1;
import u2.e1;
import u2.t;
public final class h implements c1, e1, y2.h, y2.k {
    public final m5.e E;
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
    public final int f44149a;
    public final int[] f44150b;
    public final s[] f44151c;
    public final boolean[] d;
    public final l2.k e;
    public final l2.b f44152f;
    public final a5.a h;
    public final qb.b f44153n;
    public final y2.m f44154r = new y2.m("ChunkSampleStream");
    public final p f44155s = new p(7);
    public final ArrayList v;
    public final List f44156w;
    public final b1 f44157x;
    public final b1[] f44158y;

    public h(int i10, int[] iArr, s[] sVarArr, l2.k kVar, l2.b bVar, y2.d dVar, long j3, n nVar, n2.k kVar2, qb.b bVar2, a5.a aVar, boolean z10) {
        this.f44149a = i10;
        this.f44150b = iArr;
        this.f44151c = sVarArr;
        this.e = kVar;
        this.f44152f = bVar;
        this.h = aVar;
        this.f44153n = bVar2;
        this.M = z10;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.f44156w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f44158y = new b1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        b1[] b1VarArr = new b1[i11];
        nVar.getClass();
        b1 b1Var = new b1(dVar, nVar, kVar2);
        this.f44157x = b1Var;
        int i12 = 0;
        iArr2[0] = i10;
        b1VarArr[0] = b1Var;
        while (i12 < length) {
            b1 b1Var2 = new b1(dVar, null, null);
            this.f44158y[i12] = b1Var2;
            int i13 = i12 + 1;
            b1VarArr[i13] = b1Var2;
            iArr2[i13] = this.f44150b[i12];
            i12 = i13;
        }
        this.E = new m5.e(23, iArr2, b1VarArr);
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
        b1 b1Var = this.f44157x;
        b1Var.k();
        n2.h hVar = b1Var.h;
        if (hVar != null) {
            hVar.a(b1Var.e);
            b1Var.h = null;
            b1Var.f43620g = null;
        }
        for (b1 b1Var2 : this.f44158y) {
            b1Var2.k();
            n2.h hVar2 = b1Var2.h;
            if (hVar2 != null) {
                hVar2.a(b1Var2.e);
                b1Var2.h = null;
                b1Var2.f43620g = null;
            }
        }
        this.f44154r.e(this);
    }

    @Override
    public final void F(y2.j jVar, long j3, long j10, boolean z10) {
        e eVar = (e) jVar;
        this.F = null;
        this.L = null;
        long j11 = eVar.f44140a;
        Uri uri = eVar.f44145r.f9352c;
        t tVar = new t(j10);
        this.f44153n.getClass();
        this.h.o(tVar, eVar.f44142c, this.f44149a, eVar.d, eVar.e, eVar.f44143f, eVar.h, eVar.f44144n);
        if (!z10) {
            if (y()) {
                this.f44157x.D(false);
                for (b1 b1Var : this.f44158y) {
                    b1Var.D(false);
                }
            } else if (eVar instanceof a) {
                ArrayList arrayList = this.v;
                v(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
            }
            this.f44152f.m(this);
        }
    }

    @Override
    public final void a() {
        y2.m mVar = this.f44154r;
        mVar.a();
        this.f44157x.z();
        if (!mVar.d()) {
            l2.k kVar = this.e;
            u2.b bVar = kVar.f14052m;
            if (bVar == null) {
                kVar.f14043a.a();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final void b() {
        b1[] b1VarArr;
        b1 b1Var = this.f44157x;
        b1Var.D(true);
        n2.h hVar = b1Var.h;
        if (hVar != null) {
            hVar.a(b1Var.e);
            b1Var.h = null;
            b1Var.f43620g = null;
        }
        for (b1 b1Var2 : this.f44158y) {
            b1Var2.D(true);
            n2.h hVar2 = b1Var2.h;
            if (hVar2 != null) {
                hVar2.a(b1Var2.e);
                b1Var2.h = null;
                b1Var2.f43620g = null;
            }
        }
        for (l2.i iVar : this.e.f14048i) {
            d dVar = iVar.f14039a;
            if (dVar != null) {
                dVar.f44134a.release();
            }
        }
        g gVar = this.H;
        if (gVar != null) {
            l2.b bVar = (l2.b) gVar;
            synchronized (bVar) {
                l2.n nVar = (l2.n) bVar.f14009y.remove(this);
                if (nVar != null) {
                    b1 b1Var3 = nVar.f14061a;
                    b1Var3.D(true);
                    n2.h hVar3 = b1Var3.h;
                    if (hVar3 != null) {
                        hVar3.a(b1Var3.e);
                        b1Var3.h = null;
                        b1Var3.f43620g = null;
                    }
                }
            }
        }
    }

    @Override
    public final boolean c() {
        return this.f44154r.d();
    }

    @Override
    public final long d() {
        if (y()) {
            return this.I;
        }
        if (this.O) {
            return Long.MIN_VALUE;
        }
        return w().f44144n;
    }

    @Override
    public final boolean e() {
        if (!y() && this.f44157x.x(this.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(y yVar, h2.h hVar, int i10) {
        if (!y()) {
            a aVar = this.L;
            b1 b1Var = this.f44157x;
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
        b1 b1Var = this.f44157x;
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
    public final k4.d m(y2.j r23, long r24, long r26, java.io.IOException r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: v2.h.m(y2.j, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void n(y2.j jVar, long j3, long j10, int i10) {
        t tVar;
        e eVar = (e) jVar;
        if (i10 == 0) {
            long j11 = eVar.f44140a;
            tVar = new t(eVar.f44141b);
        } else {
            long j12 = eVar.f44140a;
            Uri uri = eVar.f44145r.f9352c;
            tVar = new t(j10);
        }
        t tVar2 = tVar;
        this.h.s(tVar2, eVar.f44142c, this.f44149a, eVar.d, eVar.e, eVar.f44143f, eVar.h, eVar.f44144n, i10);
    }

    @Override
    public final void o(y2.j jVar, long j3, long j10) {
        e eVar = (e) jVar;
        c3.j jVar2 = null;
        this.F = null;
        l2.k kVar = this.e;
        l2.i[] iVarArr = kVar.f14048i;
        if (eVar instanceof j) {
            int s10 = kVar.f14049j.s(((j) eVar).d);
            l2.i iVar = iVarArr[s10];
            if (iVar.d == null) {
                d dVar = iVar.f14039a;
                e2.d.h(dVar);
                b0 b0Var = dVar.f44138n;
                if (b0Var instanceof c3.j) {
                    jVar2 = (c3.j) b0Var;
                }
                if (jVar2 != null) {
                    m2.m mVar = iVar.f14040b;
                    iVarArr[s10] = new l2.i(iVar.e, mVar, iVar.f14041c, iVar.f14039a, iVar.f14042f, new e6.n(jVar2, mVar.f14653c, 4));
                }
            }
        }
        l2.n nVar = kVar.h;
        if (nVar != null) {
            long j11 = nVar.d;
            if (j11 == -9223372036854775807L || eVar.f44144n > j11) {
                nVar.d = eVar.f44144n;
            }
            nVar.e.h = true;
        }
        long j12 = eVar.f44140a;
        Uri uri = eVar.f44145r.f9352c;
        t tVar = new t(j10);
        this.f44153n.getClass();
        this.h.p(tVar, eVar.f44142c, this.f44149a, eVar.d, eVar.e, eVar.f44143f, eVar.h, eVar.f44144n);
        this.f44152f.m(this);
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
            j3 = Math.max(j3, w10.f44144n);
        }
        return Math.max(j3, this.f44157x.q());
    }

    @Override
    public final void u(long j3) {
        int size;
        y2.m mVar = this.f44154r;
        if (!mVar.c() && !y()) {
            boolean d = mVar.d();
            boolean z10 = false;
            List list = this.f44156w;
            l2.k kVar = this.e;
            ArrayList arrayList = this.v;
            if (d) {
                e eVar = this.F;
                eVar.getClass();
                boolean z11 = eVar instanceof a;
                if (!z11 || !x(arrayList.size() - 1)) {
                    if (kVar.f14052m == null) {
                        z10 = kVar.f14049j.d(j3, eVar, list);
                    }
                    if (z10) {
                        mVar.b();
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
            if (kVar.f14052m == null && kVar.f14049j.length() >= 2) {
                size = kVar.f14049j.i(j3, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                e2.d.g(!mVar.d());
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
                    long j10 = w().f44144n;
                    a v = v(size);
                    if (arrayList.isEmpty()) {
                        this.I = this.J;
                    }
                    this.O = false;
                    this.h.y(this.f44149a, v.h, j10);
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
        this.f44157x.n(aVar.d(0));
        while (true) {
            b1[] b1VarArr = this.f44158y;
            if (i11 < b1VarArr.length) {
                b1 b1Var = b1VarArr[i11];
                i11++;
                b1Var.n(aVar.d(i11));
            } else {
                return aVar;
            }
        }
    }

    public final a w() {
        return (a) k0.g(1, this.v);
    }

    public final boolean x(int i10) {
        int t10;
        a aVar = (a) this.v.get(i10);
        if (this.f44157x.t() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            b1[] b1VarArr = this.f44158y;
            if (i11 >= b1VarArr.length) {
                return false;
            }
            t10 = b1VarArr[i11].t();
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
        int A = A(this.f44157x.t(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 <= A) {
                this.K = i10 + 1;
                a aVar = (a) this.v.get(i10);
                s sVar = aVar.d;
                if (!sVar.equals(this.G)) {
                    this.h.k(this.f44149a, sVar, aVar.e, aVar.f44143f, aVar.h);
                }
                this.G = sVar;
            } else {
                return;
            }
        }
    }
}
