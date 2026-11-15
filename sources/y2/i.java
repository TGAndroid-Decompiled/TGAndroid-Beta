package y2;

import a8.ja;
import a8.va;
import a8.xa;
import b3.o;
import e2.u;
import h2.l0;
import j$.util.DesugarCollections;
import j2.b0;
import java.util.ArrayList;
import java.util.List;
import sg.h0;
import x2.a1;
import x2.b1;
import x2.d1;
import x2.t;
public final class i implements b1, d1, b3.j, b3.m {
    public final a1[] E;
    public final h0 F;
    public f G;
    public u H;
    public h I;
    public long J;
    public long K;
    public int L;
    public a M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public final int f60126a;
    public final int[] f60127b;
    public final u[] f60128c;
    public final boolean[] d;
    public final o2.l f60129e;
    public final o2.b f60130f;
    public final xa h;
    public final qb.a f60131n;
    public final o f60132r;
    public final ca.i f60133s;
    public final ArrayList f60134w;
    public final List f60135x;
    public final a1 f60136y;

    public i(int i7, int[] iArr, u[] uVarArr, o2.l lVar, o2.b bVar, h6.m mVar, long j3, q2.n nVar, q2.k kVar, qb.a aVar, xa xaVar, boolean z10, long j10, c3.a aVar2) {
        o oVar;
        this.f60126a = i7;
        this.f60127b = iArr;
        this.f60128c = uVarArr;
        this.f60129e = lVar;
        this.f60130f = bVar;
        this.h = xaVar;
        this.f60131n = aVar;
        if (aVar2 != null) {
            oVar = new o(aVar2);
        } else {
            oVar = new o("ChunkSampleStream");
        }
        this.f60132r = oVar;
        this.f60133s = new ca.i(10);
        ArrayList arrayList = new ArrayList();
        this.f60134w = arrayList;
        this.f60135x = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.E = new a1[length];
        this.d = new boolean[length];
        int i10 = length + 1;
        int[] iArr2 = new int[i10];
        a1[] a1VarArr = new a1[i10];
        nVar.getClass();
        a1 a1Var = new a1(mVar, nVar, kVar);
        this.f60136y = a1Var;
        iArr2[0] = i7;
        a1VarArr[0] = a1Var;
        int i11 = 0;
        while (i11 < length) {
            a1 a1Var2 = new a1(mVar, null, null);
            this.E[i11] = a1Var2;
            int i12 = i11 + 1;
            a1VarArr[i12] = a1Var2;
            iArr2[i12] = this.f60127b[i11];
            i11 = i12;
        }
        this.F = new h0(11, iArr2, a1VarArr);
        this.J = j3;
        this.K = j3;
        this.N = z10;
        if (z10 && j10 != -9223372036854775807L) {
            this.N = false;
            this.O = j10 < j3;
        }
    }

    public final boolean A() {
        if ((this.N || this.O) && !this.Q && !this.f60132r.c()) {
            return true;
        }
        return false;
    }

    public final void B() {
        int C = C(this.f60136y.v(), this.L - 1);
        while (true) {
            int i7 = this.L;
            if (i7 <= C) {
                this.L = i7 + 1;
                a aVar = (a) this.f60134w.get(i7);
                u uVar = aVar.d;
                if (!uVar.equals(this.H)) {
                    this.h.i(this.f60126a, uVar, aVar.f60118e, aVar.f60119f, aVar.h);
                }
                this.H = uVar;
            } else {
                return;
            }
        }
    }

    public final int C(int i7, int i10) {
        ArrayList arrayList;
        do {
            i10++;
            arrayList = this.f60134w;
            if (i10 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i10)).d(0) <= i7);
        return i10 - 1;
    }

    public final void D(o2.b bVar) {
        a1[] a1VarArr;
        this.I = bVar;
        a1 a1Var = this.f60136y;
        a1Var.l();
        q2.h hVar = a1Var.h;
        if (hVar != null) {
            hVar.c(a1Var.f59476e);
            a1Var.h = null;
            a1Var.f59478g = null;
        }
        for (a1 a1Var2 : this.E) {
            a1Var2.l();
            q2.h hVar2 = a1Var2.h;
            if (hVar2 != null) {
                hVar2.c(a1Var2.f59476e);
                a1Var2.h = null;
                a1Var2.f59478g = null;
            }
        }
        this.f60132r.e(this);
    }

    @Override
    public final void a() {
        o oVar = this.f60132r;
        oVar.a();
        this.f60136y.C();
        if (!oVar.d()) {
            o2.l lVar = this.f60129e;
            x2.b bVar = lVar.f21293m;
            if (bVar == null) {
                lVar.f21283a.a();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final boolean c(l2.s0 r58) {
        throw new UnsupportedOperationException("Method not decompiled: y2.i.c(l2.s0):boolean");
    }

    @Override
    public final void d() {
        a1[] a1VarArr;
        a1 a1Var = this.f60136y;
        a1Var.G(true);
        q2.h hVar = a1Var.h;
        if (hVar != null) {
            hVar.c(a1Var.f59476e);
            a1Var.h = null;
            a1Var.f59478g = null;
        }
        for (a1 a1Var2 : this.E) {
            a1Var2.G(true);
            q2.h hVar2 = a1Var2.h;
            if (hVar2 != null) {
                hVar2.c(a1Var2.f59476e);
                a1Var2.h = null;
                a1Var2.f59478g = null;
            }
        }
        for (o2.j jVar : this.f60129e.f21289i) {
            e eVar = jVar.f21278a;
            if (eVar != null) {
                eVar.f60107a.release();
            }
        }
        h hVar3 = this.I;
        if (hVar3 != null) {
            o2.b bVar = (o2.b) hVar3;
            synchronized (bVar) {
                o2.o oVar = (o2.o) bVar.E.remove(this);
                if (oVar != null) {
                    a1 a1Var3 = oVar.f21303a;
                    a1Var3.G(true);
                    q2.h hVar4 = a1Var3.h;
                    if (hVar4 != null) {
                        hVar4.c(a1Var3.f59476e);
                        a1Var3.h = null;
                        a1Var3.f59478g = null;
                    }
                }
            }
        }
    }

    @Override
    public final long e() {
        if (z()) {
            return this.J;
        }
        if (this.Q) {
            return Long.MIN_VALUE;
        }
        return x().f60120n;
    }

    @Override
    public final boolean f() {
        if (!z() && this.f60136y.A(this.Q)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean g() {
        return this.f60132r.d();
    }

    @Override
    public final b3.i k(b3.l r26, long r27, long r29, java.io.IOException r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: y2.i.k(b3.l, long, long, java.io.IOException, int):b3.i");
    }

    @Override
    public final void m(b3.l lVar, long j3, long j10, boolean z10) {
        f fVar = (f) lVar;
        this.G = null;
        this.M = null;
        long j11 = fVar.f60115a;
        j2.m mVar = fVar.f60116b;
        b0 b0Var = fVar.f60121r;
        t tVar = new t(mVar, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        this.f60131n.getClass();
        this.h.n(tVar, fVar.f60117c, this.f60126a, fVar.d, fVar.f60118e, fVar.f60119f, fVar.h, fVar.f60120n);
        if (!z10) {
            if (z()) {
                this.f60136y.G(false);
                for (a1 a1Var : this.E) {
                    a1Var.G(false);
                }
            } else if (fVar instanceof a) {
                ArrayList arrayList = this.f60134w;
                v(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.J = this.K;
                }
            }
            this.f60130f.f0(this);
        }
    }

    @Override
    public final int n(long j3) {
        if (z() || A() || this.P) {
            return 0;
        }
        boolean z10 = this.Q;
        a1 a1Var = this.f60136y;
        int x10 = a1Var.x(j3, z10);
        a aVar = this.M;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(0) - a1Var.v());
        }
        a1Var.L(x10);
        B();
        return x10;
    }

    @Override
    public final int q(k8.a aVar, k2.h hVar, int i7) {
        if (!z() && !A() && !this.P) {
            a aVar2 = this.M;
            a1 a1Var = this.f60136y;
            if (aVar2 == null || aVar2.d(0) > a1Var.v()) {
                B();
                return a1Var.F(aVar, hVar, i7, this.Q);
            }
            return -3;
        }
        return -3;
    }

    @Override
    public final void r(b3.l lVar, long j3, long j10, int i7) {
        t tVar;
        f fVar = (f) lVar;
        if (i7 == 0) {
            long j11 = fVar.f60115a;
            tVar = new t(fVar.f60116b, j3);
        } else {
            long j12 = fVar.f60115a;
            j2.m mVar = fVar.f60116b;
            b0 b0Var = fVar.f60121r;
            tVar = new t(mVar, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        }
        this.h.s(tVar, fVar.f60117c, this.f60126a, fVar.d, fVar.f60118e, fVar.f60119f, fVar.h, fVar.f60120n, i7);
    }

    @Override
    public final long s() {
        if (this.Q) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.J;
        }
        long j3 = this.K;
        a x10 = x();
        if (!x10.c()) {
            ArrayList arrayList = this.f60134w;
            if (arrayList.size() > 1) {
                x10 = (a) i5.c.h(2, arrayList);
            } else {
                x10 = null;
            }
        }
        if (x10 != null) {
            j3 = Math.max(j3, x10.f60120n);
        }
        return Math.max(j3, this.f60136y.s());
    }

    @Override
    public final void u(long j3) {
        int size;
        o oVar = this.f60132r;
        if (!oVar.c() && !z()) {
            boolean d = oVar.d();
            boolean z10 = false;
            List list = this.f60135x;
            o2.l lVar = this.f60129e;
            ArrayList arrayList = this.f60134w;
            if (d) {
                f fVar = this.G;
                fVar.getClass();
                boolean z11 = fVar instanceof a;
                if (!z11 || !y(arrayList.size() - 1)) {
                    if (lVar.f21293m == null) {
                        z10 = lVar.f21290j.k(j3, fVar, list);
                    }
                    if (z10) {
                        oVar.b();
                        if (z11) {
                            this.M = (a) fVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (lVar.f21293m == null && lVar.f21290j.length() >= 2) {
                size = lVar.f21290j.j(j3, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                ja.p(!oVar.d());
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
                    long j10 = x().f60120n;
                    a v = v(size);
                    if (arrayList.isEmpty()) {
                        this.J = this.K;
                    }
                    this.Q = false;
                    this.h.z(v.h, this.f60126a, j10);
                }
            }
            if (this.f60136y.z()) {
                this.Q = true;
            }
        }
    }

    public final a v(int i7) {
        ArrayList arrayList = this.f60134w;
        a aVar = (a) arrayList.get(i7);
        l0.X(i7, arrayList.size(), arrayList);
        this.L = Math.max(this.L, arrayList.size());
        int i10 = 0;
        this.f60136y.o(aVar.d(0));
        while (true) {
            a1[] a1VarArr = this.E;
            if (i10 < a1VarArr.length) {
                a1 a1Var = a1VarArr[i10];
                i10++;
                a1Var.o(aVar.d(i10));
            } else {
                return aVar;
            }
        }
    }

    @Override
    public final void w(b3.l lVar, long j3, long j10) {
        f fVar = (f) lVar;
        this.G = null;
        o2.l lVar2 = this.f60129e;
        o2.j[] jVarArr = lVar2.f21289i;
        if (fVar instanceof k) {
            int b10 = lVar2.f21290j.b(((k) fVar).d);
            o2.j jVar = jVarArr[b10];
            if (jVar.d == null) {
                e eVar = jVar.f21278a;
                eVar.getClass();
                f3.j a10 = eVar.a();
                if (a10 != null) {
                    p2.m mVar = jVar.f21279b;
                    jVarArr[b10] = new o2.j(jVar.f21281e, mVar, jVar.f21280c, jVar.f21278a, jVar.f21282f, new va(a10, mVar.f54558c, 6));
                }
            }
        }
        o2.o oVar = lVar2.h;
        if (oVar != null) {
            long j11 = oVar.d;
            if (j11 == -9223372036854775807L || fVar.f60120n > j11) {
                oVar.d = fVar.f60120n;
            }
            oVar.f21306e.h = true;
        }
        long j12 = fVar.f60115a;
        j2.m mVar2 = fVar.f60116b;
        b0 b0Var = fVar.f60121r;
        t tVar = new t(mVar2, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        this.f60131n.getClass();
        this.h.o(tVar, fVar.f60117c, this.f60126a, fVar.d, fVar.f60118e, fVar.f60119f, fVar.h, fVar.f60120n);
        this.f60130f.f0(this);
    }

    public final a x() {
        return (a) i5.c.h(1, this.f60134w);
    }

    public final boolean y(int i7) {
        int v;
        a aVar = (a) this.f60134w.get(i7);
        if (this.f60136y.v() > aVar.d(0)) {
            return true;
        }
        int i10 = 0;
        do {
            a1[] a1VarArr = this.E;
            if (i10 >= a1VarArr.length) {
                return false;
            }
            v = a1VarArr[i10].v();
            i10++;
        } while (v <= aVar.d(i10));
        return true;
    }

    public final boolean z() {
        if (this.J != -9223372036854775807L) {
            return true;
        }
        return false;
    }
}
