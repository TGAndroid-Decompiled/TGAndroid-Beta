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
import u2.c1;
import u2.t;
import u2.z0;
public final class h implements a1, c1, y2.h, y2.k {
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
    public final int f43800a;
    public final int[] f43801b;
    public final s[] f43802c;
    public final boolean[] d;
    public final l2.k e;
    public final l2.b f43803f;
    public final a5.a h;
    public final qb.b f43804n;
    public final y2.m f43805r = new y2.m("ChunkSampleStream");
    public final p f43806s = new p(7);
    public final ArrayList v;
    public final List f43807w;
    public final z0 f43808x;
    public final z0[] f43809y;

    public h(int i10, int[] iArr, s[] sVarArr, l2.k kVar, l2.b bVar, y2.d dVar, long j3, n2.m mVar, n2.j jVar, qb.b bVar2, a5.a aVar, boolean z10) {
        this.f43800a = i10;
        this.f43801b = iArr;
        this.f43802c = sVarArr;
        this.e = kVar;
        this.f43803f = bVar;
        this.h = aVar;
        this.f43804n = bVar2;
        this.M = z10;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.f43807w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f43809y = new z0[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        z0[] z0VarArr = new z0[i11];
        mVar.getClass();
        z0 z0Var = new z0(dVar, mVar, jVar);
        this.f43808x = z0Var;
        int i12 = 0;
        iArr2[0] = i10;
        z0VarArr[0] = z0Var;
        while (i12 < length) {
            z0 z0Var2 = new z0(dVar, null, null);
            this.f43809y[i12] = z0Var2;
            int i13 = i12 + 1;
            z0VarArr[i13] = z0Var2;
            iArr2[i13] = this.f43801b[i12];
            i12 = i13;
        }
        this.E = new o0.a(18, iArr2, z0VarArr);
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
        z0[] z0VarArr;
        this.H = bVar;
        z0 z0Var = this.f43808x;
        z0Var.k();
        n2.g gVar = z0Var.h;
        if (gVar != null) {
            gVar.a(z0Var.e);
            z0Var.h = null;
            z0Var.f43468g = null;
        }
        for (z0 z0Var2 : this.f43809y) {
            z0Var2.k();
            n2.g gVar2 = z0Var2.h;
            if (gVar2 != null) {
                gVar2.a(z0Var2.e);
                z0Var2.h = null;
                z0Var2.f43468g = null;
            }
        }
        this.f43805r.e(this);
    }

    @Override
    public final void V(y2.j jVar, long j3, long j10, boolean z10) {
        e eVar = (e) jVar;
        this.F = null;
        this.L = null;
        long j11 = eVar.f43791a;
        Uri uri = eVar.f43796r.f9335c;
        t tVar = new t(j10);
        this.f43804n.getClass();
        this.h.o(tVar, eVar.f43793c, this.f43800a, eVar.d, eVar.e, eVar.f43794f, eVar.h, eVar.f43795n);
        if (!z10) {
            if (y()) {
                this.f43808x.D(false);
                for (z0 z0Var : this.f43809y) {
                    z0Var.D(false);
                }
            } else if (eVar instanceof a) {
                ArrayList arrayList = this.v;
                v(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
            }
            this.f43803f.v(this);
        }
    }

    @Override
    public final void a() {
        y2.m mVar = this.f43805r;
        mVar.a();
        this.f43808x.z();
        if (!mVar.d()) {
            l2.k kVar = this.e;
            u2.b bVar = kVar.f13842m;
            if (bVar == null) {
                kVar.f13833a.a();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final void b() {
        z0[] z0VarArr;
        z0 z0Var = this.f43808x;
        z0Var.D(true);
        n2.g gVar = z0Var.h;
        if (gVar != null) {
            gVar.a(z0Var.e);
            z0Var.h = null;
            z0Var.f43468g = null;
        }
        for (z0 z0Var2 : this.f43809y) {
            z0Var2.D(true);
            n2.g gVar2 = z0Var2.h;
            if (gVar2 != null) {
                gVar2.a(z0Var2.e);
                z0Var2.h = null;
                z0Var2.f43468g = null;
            }
        }
        for (l2.i iVar : this.e.f13838i) {
            d dVar = iVar.f13829a;
            if (dVar != null) {
                dVar.f43785a.release();
            }
        }
        g gVar3 = this.H;
        if (gVar3 != null) {
            l2.b bVar = (l2.b) gVar3;
            synchronized (bVar) {
                n nVar = (n) bVar.f13799y.remove(this);
                if (nVar != null) {
                    z0 z0Var3 = nVar.f13851a;
                    z0Var3.D(true);
                    n2.g gVar4 = z0Var3.h;
                    if (gVar4 != null) {
                        gVar4.a(z0Var3.e);
                        z0Var3.h = null;
                        z0Var3.f43468g = null;
                    }
                }
            }
        }
    }

    @Override
    public final boolean c() {
        return this.f43805r.d();
    }

    @Override
    public final long d() {
        if (y()) {
            return this.I;
        }
        if (this.O) {
            return Long.MIN_VALUE;
        }
        return w().f43795n;
    }

    @Override
    public final boolean e() {
        if (!y() && this.f43808x.x(this.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(y yVar, h2.h hVar, int i10) {
        if (!y()) {
            a aVar = this.L;
            z0 z0Var = this.f43808x;
            if (aVar != null && aVar.d(0) <= z0Var.t()) {
                return -3;
            }
            z();
            return z0Var.C(yVar, hVar, i10, this.O);
        }
        return -3;
    }

    @Override
    public final int j(long j3) {
        if (y()) {
            return 0;
        }
        boolean z10 = this.O;
        z0 z0Var = this.f43808x;
        int v = z0Var.v(j3, z10);
        a aVar = this.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(0) - z0Var.t());
        }
        z0Var.H(v);
        z();
        return v;
    }

    @Override
    public final boolean m(i2.s0 r57) {
        throw new UnsupportedOperationException("Method not decompiled: v2.h.m(i2.s0):boolean");
    }

    @Override
    public final k4.d n(y2.j r23, long r24, long r26, java.io.IOException r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: v2.h.n(y2.j, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void o(y2.j jVar, long j3, long j10, int i10) {
        t tVar;
        e eVar = (e) jVar;
        if (i10 == 0) {
            long j11 = eVar.f43791a;
            tVar = new t(eVar.f43792b);
        } else {
            long j12 = eVar.f43791a;
            Uri uri = eVar.f43796r.f9335c;
            tVar = new t(j10);
        }
        t tVar2 = tVar;
        this.h.s(tVar2, eVar.f43793c, this.f43800a, eVar.d, eVar.e, eVar.f43794f, eVar.h, eVar.f43795n, i10);
    }

    @Override
    public final void q(y2.j jVar, long j3, long j10) {
        e eVar = (e) jVar;
        c3.j jVar2 = null;
        this.F = null;
        l2.k kVar = this.e;
        l2.i[] iVarArr = kVar.f13838i;
        if (eVar instanceof j) {
            int s10 = kVar.f13839j.s(((j) eVar).d);
            l2.i iVar = iVarArr[s10];
            if (iVar.d == null) {
                d dVar = iVar.f13829a;
                e2.d.h(dVar);
                b0 b0Var = dVar.f43789n;
                if (b0Var instanceof c3.j) {
                    jVar2 = (c3.j) b0Var;
                }
                if (jVar2 != null) {
                    m2.m mVar = iVar.f13830b;
                    iVarArr[s10] = new l2.i(iVar.e, mVar, iVar.f13831c, iVar.f13829a, iVar.f13832f, new e6.n(jVar2, mVar.f14420c, 4));
                }
            }
        }
        n nVar = kVar.h;
        if (nVar != null) {
            long j11 = nVar.d;
            if (j11 == -9223372036854775807L || eVar.f43795n > j11) {
                nVar.d = eVar.f43795n;
            }
            nVar.e.h = true;
        }
        long j12 = eVar.f43791a;
        Uri uri = eVar.f43796r.f9335c;
        t tVar = new t(j10);
        this.f43804n.getClass();
        this.h.p(tVar, eVar.f43793c, this.f43800a, eVar.d, eVar.e, eVar.f43794f, eVar.h, eVar.f43795n);
        this.f43803f.v(this);
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
                w10 = (a) hg.c.h(2, arrayList);
            } else {
                w10 = null;
            }
        }
        if (w10 != null) {
            j3 = Math.max(j3, w10.f43795n);
        }
        return Math.max(j3, this.f43808x.q());
    }

    @Override
    public final void u(long j3) {
        int size;
        y2.m mVar = this.f43805r;
        if (!mVar.c() && !y()) {
            boolean d = mVar.d();
            boolean z10 = false;
            List list = this.f43807w;
            l2.k kVar = this.e;
            ArrayList arrayList = this.v;
            if (d) {
                e eVar = this.F;
                eVar.getClass();
                boolean z11 = eVar instanceof a;
                if (!z11 || !x(arrayList.size() - 1)) {
                    if (kVar.f13842m == null) {
                        z10 = kVar.f13839j.d(j3, eVar, list);
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
            if (kVar.f13842m == null && kVar.f13839j.length() >= 2) {
                size = kVar.f13839j.i(j3, list);
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
                    long j10 = w().f43795n;
                    a v = v(size);
                    if (arrayList.isEmpty()) {
                        this.I = this.J;
                    }
                    this.O = false;
                    this.h.y(this.f43800a, v.h, j10);
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
        this.f43808x.n(aVar.d(0));
        while (true) {
            z0[] z0VarArr = this.f43809y;
            if (i11 < z0VarArr.length) {
                z0 z0Var = z0VarArr[i11];
                i11++;
                z0Var.n(aVar.d(i11));
            } else {
                return aVar;
            }
        }
    }

    public final a w() {
        return (a) hg.c.h(1, this.v);
    }

    public final boolean x(int i10) {
        int t10;
        a aVar = (a) this.v.get(i10);
        if (this.f43808x.t() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            z0[] z0VarArr = this.f43809y;
            if (i11 >= z0VarArr.length) {
                return false;
            }
            t10 = z0VarArr[i11].t();
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
        int A = A(this.f43808x.t(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 <= A) {
                this.K = i10 + 1;
                a aVar = (a) this.v.get(i10);
                s sVar = aVar.d;
                if (!sVar.equals(this.G)) {
                    this.h.k(this.f43800a, sVar, aVar.e, aVar.f43794f, aVar.h);
                }
                this.G = sVar;
            } else {
                return;
            }
        }
    }
}
