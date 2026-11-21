package y2;

import a8.la;
import a8.va;
import a8.xa;
import b3.p;
import e2.u;
import h2.l0;
import j$.util.DesugarCollections;
import j2.b0;
import java.util.ArrayList;
import java.util.List;
import o2.o;
import sg.h0;
import x2.c1;
import x2.d1;
import x2.f1;
public final class i implements d1, f1, b3.k, b3.n {
    public final c1[] E;
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
    public final int f60733a;
    public final int[] f60734b;
    public final u[] f60735c;
    public final boolean[] d;
    public final o2.l f60736e;
    public final o2.b f60737f;
    public final xa h;
    public final qb.a f60738n;
    public final p f60739r;
    public final ca.i f60740s;
    public final ArrayList f60741w;
    public final List f60742x;
    public final c1 f60743y;

    public i(int i7, int[] iArr, u[] uVarArr, o2.l lVar, o2.b bVar, h6.m mVar, long j3, q2.m mVar2, q2.j jVar, qb.a aVar, xa xaVar, boolean z10, long j10, c3.a aVar2) {
        p pVar;
        this.f60733a = i7;
        this.f60734b = iArr;
        this.f60735c = uVarArr;
        this.f60736e = lVar;
        this.f60737f = bVar;
        this.h = xaVar;
        this.f60738n = aVar;
        if (aVar2 != null) {
            pVar = new p(aVar2);
        } else {
            pVar = new p("ChunkSampleStream");
        }
        this.f60739r = pVar;
        this.f60740s = new ca.i(10);
        ArrayList arrayList = new ArrayList();
        this.f60741w = arrayList;
        this.f60742x = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.E = new c1[length];
        this.d = new boolean[length];
        int i10 = length + 1;
        int[] iArr2 = new int[i10];
        c1[] c1VarArr = new c1[i10];
        mVar2.getClass();
        c1 c1Var = new c1(mVar, mVar2, jVar);
        this.f60743y = c1Var;
        iArr2[0] = i7;
        c1VarArr[0] = c1Var;
        int i11 = 0;
        while (i11 < length) {
            c1 c1Var2 = new c1(mVar, null, null);
            this.E[i11] = c1Var2;
            int i12 = i11 + 1;
            c1VarArr[i12] = c1Var2;
            iArr2[i12] = this.f60734b[i11];
            i11 = i12;
        }
        this.F = new h0(11, iArr2, c1VarArr);
        this.J = j3;
        this.K = j3;
        this.N = z10;
        if (z10 && j10 != -9223372036854775807L) {
            this.N = false;
            this.O = j10 < j3;
        }
    }

    public final boolean A() {
        if ((this.N || this.O) && !this.Q && !this.f60739r.c()) {
            return true;
        }
        return false;
    }

    public final void B() {
        int C = C(this.f60743y.v(), this.L - 1);
        while (true) {
            int i7 = this.L;
            if (i7 <= C) {
                this.L = i7 + 1;
                a aVar = (a) this.f60741w.get(i7);
                u uVar = aVar.d;
                if (!uVar.equals(this.H)) {
                    this.h.j(this.f60733a, uVar, aVar.f60725e, aVar.f60726f, aVar.h);
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
            arrayList = this.f60741w;
            if (i10 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i10)).d(0) <= i7);
        return i10 - 1;
    }

    public final void D(o2.b bVar) {
        c1[] c1VarArr;
        this.I = bVar;
        c1 c1Var = this.f60743y;
        c1Var.l();
        q2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.c(c1Var.f60094e);
            c1Var.h = null;
            c1Var.f60096g = null;
        }
        for (c1 c1Var2 : this.E) {
            c1Var2.l();
            q2.g gVar2 = c1Var2.h;
            if (gVar2 != null) {
                gVar2.c(c1Var2.f60094e);
                c1Var2.h = null;
                c1Var2.f60096g = null;
            }
        }
        this.f60739r.e(this);
    }

    @Override
    public final void a() {
        p pVar = this.f60739r;
        pVar.a();
        this.f60743y.C();
        if (!pVar.d()) {
            o2.l lVar = this.f60736e;
            x2.b bVar = lVar.f21682m;
            if (bVar == null) {
                lVar.f21672a.a();
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
        c1[] c1VarArr;
        c1 c1Var = this.f60743y;
        c1Var.G(true);
        q2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.c(c1Var.f60094e);
            c1Var.h = null;
            c1Var.f60096g = null;
        }
        for (c1 c1Var2 : this.E) {
            c1Var2.G(true);
            q2.g gVar2 = c1Var2.h;
            if (gVar2 != null) {
                gVar2.c(c1Var2.f60094e);
                c1Var2.h = null;
                c1Var2.f60096g = null;
            }
        }
        for (o2.j jVar : this.f60736e.f21678i) {
            e eVar = jVar.f21667a;
            if (eVar != null) {
                eVar.f60714a.release();
            }
        }
        h hVar = this.I;
        if (hVar != null) {
            o2.b bVar = (o2.b) hVar;
            synchronized (bVar) {
                o oVar = (o) bVar.E.remove(this);
                if (oVar != null) {
                    c1 c1Var3 = oVar.f21692a;
                    c1Var3.G(true);
                    q2.g gVar3 = c1Var3.h;
                    if (gVar3 != null) {
                        gVar3.c(c1Var3.f60094e);
                        c1Var3.h = null;
                        c1Var3.f60096g = null;
                    }
                }
            }
        }
    }

    @Override
    public final long e() {
        if (y()) {
            return this.J;
        }
        if (this.Q) {
            return Long.MIN_VALUE;
        }
        return w().f60727n;
    }

    @Override
    public final boolean g() {
        return this.f60739r.d();
    }

    @Override
    public final boolean h() {
        if (!y() && this.f60743y.A(this.Q)) {
            return true;
        }
        return false;
    }

    @Override
    public final int j(long j3) {
        if (y() || A() || this.P) {
            return 0;
        }
        boolean z10 = this.Q;
        c1 c1Var = this.f60743y;
        int x10 = c1Var.x(j3, z10);
        a aVar = this.M;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(0) - c1Var.v());
        }
        c1Var.L(x10);
        B();
        return x10;
    }

    @Override
    public final b3.i l(b3.m r26, long r27, long r29, java.io.IOException r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: y2.i.l(b3.m, long, long, java.io.IOException, int):b3.i");
    }

    @Override
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        if (!y() && !A() && !this.P) {
            a aVar2 = this.M;
            c1 c1Var = this.f60743y;
            if (aVar2 == null || aVar2.d(0) > c1Var.v()) {
                B();
                return c1Var.F(aVar, hVar, i7, this.Q);
            }
            return -3;
        }
        return -3;
    }

    @Override
    public final void p(b3.m mVar, long j3, long j10, boolean z10) {
        f fVar = (f) mVar;
        this.G = null;
        this.M = null;
        long j11 = fVar.f60722a;
        j2.m mVar2 = fVar.f60723b;
        b0 b0Var = fVar.f60728r;
        x2.u uVar = new x2.u(mVar2, b0Var.f17178c, b0Var.d, j3, j10, b0Var.f17177b);
        this.f60738n.getClass();
        this.h.o(uVar, fVar.f60724c, this.f60733a, fVar.d, fVar.f60725e, fVar.f60726f, fVar.h, fVar.f60727n);
        if (!z10) {
            if (y()) {
                this.f60743y.G(false);
                for (c1 c1Var : this.E) {
                    c1Var.G(false);
                }
            } else if (fVar instanceof a) {
                ArrayList arrayList = this.f60741w;
                v(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.J = this.K;
                }
            }
            this.f60737f.c0(this);
        }
    }

    @Override
    public final long r() {
        if (this.Q) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.J;
        }
        long j3 = this.K;
        a w10 = w();
        if (!w10.c()) {
            ArrayList arrayList = this.f60741w;
            if (arrayList.size() > 1) {
                w10 = (a) i5.c.h(2, arrayList);
            } else {
                w10 = null;
            }
        }
        if (w10 != null) {
            j3 = Math.max(j3, w10.f60727n);
        }
        return Math.max(j3, this.f60743y.s());
    }

    @Override
    public final void s(b3.m mVar, long j3, long j10, int i7) {
        x2.u uVar;
        f fVar = (f) mVar;
        if (i7 == 0) {
            long j11 = fVar.f60722a;
            uVar = new x2.u(fVar.f60723b, j3);
        } else {
            long j12 = fVar.f60722a;
            j2.m mVar2 = fVar.f60723b;
            b0 b0Var = fVar.f60728r;
            uVar = new x2.u(mVar2, b0Var.f17178c, b0Var.d, j3, j10, b0Var.f17177b);
        }
        this.h.u(uVar, fVar.f60724c, this.f60733a, fVar.d, fVar.f60725e, fVar.f60726f, fVar.h, fVar.f60727n, i7);
    }

    @Override
    public final void u(long j3) {
        int size;
        p pVar = this.f60739r;
        if (!pVar.c() && !y()) {
            boolean d = pVar.d();
            boolean z10 = false;
            List list = this.f60742x;
            o2.l lVar = this.f60736e;
            ArrayList arrayList = this.f60741w;
            if (d) {
                f fVar = this.G;
                fVar.getClass();
                boolean z11 = fVar instanceof a;
                if (!z11 || !x(arrayList.size() - 1)) {
                    if (lVar.f21682m == null) {
                        z10 = lVar.f21679j.k(j3, fVar, list);
                    }
                    if (z10) {
                        pVar.b();
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
            if (lVar.f21682m == null && lVar.f21679j.length() >= 2) {
                size = lVar.f21679j.j(j3, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                la.p(!pVar.d());
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
                    long j10 = w().f60727n;
                    a v = v(size);
                    if (arrayList.isEmpty()) {
                        this.J = this.K;
                    }
                    this.Q = false;
                    this.h.B(v.h, this.f60733a, j10);
                }
            }
            if (this.f60743y.z()) {
                this.Q = true;
            }
        }
    }

    public final a v(int i7) {
        ArrayList arrayList = this.f60741w;
        a aVar = (a) arrayList.get(i7);
        l0.X(i7, arrayList.size(), arrayList);
        this.L = Math.max(this.L, arrayList.size());
        int i10 = 0;
        this.f60743y.o(aVar.d(0));
        while (true) {
            c1[] c1VarArr = this.E;
            if (i10 < c1VarArr.length) {
                c1 c1Var = c1VarArr[i10];
                i10++;
                c1Var.o(aVar.d(i10));
            } else {
                return aVar;
            }
        }
    }

    public final a w() {
        return (a) i5.c.h(1, this.f60741w);
    }

    public final boolean x(int i7) {
        int v;
        a aVar = (a) this.f60741w.get(i7);
        if (this.f60743y.v() > aVar.d(0)) {
            return true;
        }
        int i10 = 0;
        do {
            c1[] c1VarArr = this.E;
            if (i10 >= c1VarArr.length) {
                return false;
            }
            v = c1VarArr[i10].v();
            i10++;
        } while (v <= aVar.d(i10));
        return true;
    }

    public final boolean y() {
        if (this.J != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final void z(b3.m mVar, long j3, long j10) {
        f fVar = (f) mVar;
        this.G = null;
        o2.l lVar = this.f60736e;
        o2.j[] jVarArr = lVar.f21678i;
        if (fVar instanceof k) {
            int b10 = lVar.f21679j.b(((k) fVar).d);
            o2.j jVar = jVarArr[b10];
            if (jVar.d == null) {
                e eVar = jVar.f21667a;
                eVar.getClass();
                f3.j a10 = eVar.a();
                if (a10 != null) {
                    p2.m mVar2 = jVar.f21668b;
                    jVarArr[b10] = new o2.j(jVar.f21670e, mVar2, jVar.f21669c, jVar.f21667a, jVar.f21671f, new va(a10, mVar2.f55168c, 6));
                }
            }
        }
        o oVar = lVar.h;
        if (oVar != null) {
            long j11 = oVar.d;
            if (j11 == -9223372036854775807L || fVar.f60727n > j11) {
                oVar.d = fVar.f60727n;
            }
            oVar.f21695e.h = true;
        }
        long j12 = fVar.f60722a;
        j2.m mVar3 = fVar.f60723b;
        b0 b0Var = fVar.f60728r;
        x2.u uVar = new x2.u(mVar3, b0Var.f17178c, b0Var.d, j3, j10, b0Var.f17177b);
        this.f60738n.getClass();
        this.h.p(uVar, fVar.f60724c, this.f60733a, fVar.d, fVar.f60725e, fVar.f60726f, fVar.h, fVar.f60727n);
        this.f60737f.c0(this);
    }
}
