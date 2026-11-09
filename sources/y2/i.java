package y2;

import a8.ia;
import a8.ua;
import a8.wa;
import b3.o;
import e2.u;
import h2.m0;
import j$.util.DesugarCollections;
import j2.c0;
import java.util.ArrayList;
import java.util.List;
import sg.i0;
import x2.b1;
import x2.c1;
import x2.e1;
public final class i implements c1, e1, b3.j, b3.m {
    public final b1[] D;
    public final i0 E;
    public f F;
    public u G;
    public h H;
    public long I;
    public long J;
    public int K;
    public a L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public final int f58915a;
    public final int[] f58916b;
    public final u[] f58917c;
    public final boolean[] d;
    public final o2.l f58918e;
    public final o2.b f58919f;
    public final wa h;
    public final pb.b f58920n;
    public final o f58921r;
    public final ca.i f58922s;
    public final ArrayList f58923w;
    public final List f58924x;
    public final b1 f58925y;

    public i(int i7, int[] iArr, u[] uVarArr, o2.l lVar, o2.b bVar, h6.m mVar, long j3, q2.m mVar2, q2.j jVar, pb.b bVar2, wa waVar, boolean z9, long j10, c3.a aVar) {
        o oVar;
        this.f58915a = i7;
        this.f58916b = iArr;
        this.f58917c = uVarArr;
        this.f58918e = lVar;
        this.f58919f = bVar;
        this.h = waVar;
        this.f58920n = bVar2;
        if (aVar != null) {
            oVar = new o(aVar);
        } else {
            oVar = new o("ChunkSampleStream");
        }
        this.f58921r = oVar;
        this.f58922s = new ca.i(10);
        ArrayList arrayList = new ArrayList();
        this.f58923w = arrayList;
        this.f58924x = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.D = new b1[length];
        this.d = new boolean[length];
        int i10 = length + 1;
        int[] iArr2 = new int[i10];
        b1[] b1VarArr = new b1[i10];
        mVar2.getClass();
        b1 b1Var = new b1(mVar, mVar2, jVar);
        this.f58925y = b1Var;
        iArr2[0] = i7;
        b1VarArr[0] = b1Var;
        int i11 = 0;
        while (i11 < length) {
            b1 b1Var2 = new b1(mVar, null, null);
            this.D[i11] = b1Var2;
            int i12 = i11 + 1;
            b1VarArr[i12] = b1Var2;
            iArr2[i12] = this.f58916b[i11];
            i11 = i12;
        }
        this.E = new i0(11, iArr2, b1VarArr);
        this.I = j3;
        this.J = j3;
        this.M = z9;
        if (z9 && j10 != -9223372036854775807L) {
            this.M = false;
            this.N = j10 < j3;
        }
    }

    @Override
    public final void M0(b3.l lVar, long j3, long j10, int i7) {
        x2.u uVar;
        f fVar = (f) lVar;
        if (i7 == 0) {
            long j11 = fVar.f58904a;
            uVar = new x2.u(fVar.f58905b, j3);
        } else {
            long j12 = fVar.f58904a;
            j2.m mVar = fVar.f58905b;
            c0 c0Var = fVar.f58910r;
            uVar = new x2.u(mVar, c0Var.f16417c, c0Var.d, j3, j10, c0Var.f16416b);
        }
        this.h.t(uVar, fVar.f58906c, this.f58915a, fVar.d, fVar.f58907e, fVar.f58908f, fVar.h, fVar.f58909n, i7);
    }

    @Override
    public final void a() {
        o oVar = this.f58921r;
        oVar.a();
        this.f58925y.C();
        if (!oVar.d()) {
            o2.l lVar = this.f58918e;
            x2.b bVar = lVar.f20772m;
            if (bVar == null) {
                lVar.f20762a.a();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final boolean c(l2.v0 r58) {
        throw new UnsupportedOperationException("Method not decompiled: y2.i.c(l2.v0):boolean");
    }

    @Override
    public final void d() {
        b1[] b1VarArr;
        b1 b1Var = this.f58925y;
        b1Var.G(true);
        q2.g gVar = b1Var.h;
        if (gVar != null) {
            gVar.c(b1Var.f58292e);
            b1Var.h = null;
            b1Var.f58294g = null;
        }
        for (b1 b1Var2 : this.D) {
            b1Var2.G(true);
            q2.g gVar2 = b1Var2.h;
            if (gVar2 != null) {
                gVar2.c(b1Var2.f58292e);
                b1Var2.h = null;
                b1Var2.f58294g = null;
            }
        }
        for (o2.j jVar : this.f58918e.f20768i) {
            e eVar = jVar.f20757a;
            if (eVar != null) {
                eVar.f58896a.release();
            }
        }
        h hVar = this.H;
        if (hVar != null) {
            o2.b bVar = (o2.b) hVar;
            synchronized (bVar) {
                o2.o oVar = (o2.o) bVar.D.remove(this);
                if (oVar != null) {
                    b1 b1Var3 = oVar.f20782a;
                    b1Var3.G(true);
                    q2.g gVar3 = b1Var3.h;
                    if (gVar3 != null) {
                        gVar3.c(b1Var3.f58292e);
                        b1Var3.h = null;
                        b1Var3.f58294g = null;
                    }
                }
            }
        }
    }

    @Override
    public final long e() {
        if (v()) {
            return this.I;
        }
        if (this.P) {
            return Long.MIN_VALUE;
        }
        return t().f58909n;
    }

    @Override
    public final boolean f() {
        if (!v() && this.f58925y.A(this.P)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean g() {
        return this.f58921r.d();
    }

    @Override
    public final int l(long j3) {
        if (v() || w() || this.O) {
            return 0;
        }
        boolean z9 = this.P;
        b1 b1Var = this.f58925y;
        int x10 = b1Var.x(j3, z9);
        a aVar = this.L;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(0) - b1Var.v());
        }
        b1Var.L(x10);
        x();
        return x10;
    }

    @Override
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        if (!v() && !w() && !this.O) {
            a aVar = this.L;
            b1 b1Var = this.f58925y;
            if (aVar == null || aVar.d(0) > b1Var.v()) {
                x();
                return b1Var.F(bVar, hVar, i7, this.P);
            }
            return -3;
        }
        return -3;
    }

    @Override
    public final b3.i o0(b3.l r26, long r27, long r29, java.io.IOException r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: y2.i.o0(b3.l, long, long, java.io.IOException, int):b3.i");
    }

    @Override
    public final void o1(b3.l lVar, long j3, long j10) {
        f fVar = (f) lVar;
        this.F = null;
        o2.l lVar2 = this.f58918e;
        o2.j[] jVarArr = lVar2.f20768i;
        if (fVar instanceof k) {
            int b10 = lVar2.f20769j.b(((k) fVar).d);
            o2.j jVar = jVarArr[b10];
            if (jVar.d == null) {
                e eVar = jVar.f20757a;
                eVar.getClass();
                f3.j a10 = eVar.a();
                if (a10 != null) {
                    p2.m mVar = jVar.f20758b;
                    jVarArr[b10] = new o2.j(jVar.f20760e, mVar, jVar.f20759c, jVar.f20757a, jVar.f20761f, new ua(a10, mVar.f53153c, 6));
                }
            }
        }
        o2.o oVar = lVar2.h;
        if (oVar != null) {
            long j11 = oVar.d;
            if (j11 == -9223372036854775807L || fVar.f58909n > j11) {
                oVar.d = fVar.f58909n;
            }
            oVar.f20785e.h = true;
        }
        long j12 = fVar.f58904a;
        j2.m mVar2 = fVar.f58905b;
        c0 c0Var = fVar.f58910r;
        x2.u uVar = new x2.u(mVar2, c0Var.f16417c, c0Var.d, j3, j10, c0Var.f16416b);
        this.f58920n.getClass();
        this.h.p(uVar, fVar.f58906c, this.f58915a, fVar.d, fVar.f58907e, fVar.f58908f, fVar.h, fVar.f58909n);
        this.f58919f.d(this);
    }

    @Override
    public final long p() {
        if (this.P) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.I;
        }
        long j3 = this.J;
        a t6 = t();
        if (!t6.c()) {
            ArrayList arrayList = this.f58923w;
            if (arrayList.size() > 1) {
                t6 = (a) jg.g.i(2, arrayList);
            } else {
                t6 = null;
            }
        }
        if (t6 != null) {
            j3 = Math.max(j3, t6.f58909n);
        }
        return Math.max(j3, this.f58925y.s());
    }

    @Override
    public final void q0(b3.l lVar, long j3, long j10, boolean z9) {
        f fVar = (f) lVar;
        this.F = null;
        this.L = null;
        long j11 = fVar.f58904a;
        j2.m mVar = fVar.f58905b;
        c0 c0Var = fVar.f58910r;
        x2.u uVar = new x2.u(mVar, c0Var.f16417c, c0Var.d, j3, j10, c0Var.f16416b);
        this.f58920n.getClass();
        this.h.o(uVar, fVar.f58906c, this.f58915a, fVar.d, fVar.f58907e, fVar.f58908f, fVar.h, fVar.f58909n);
        if (!z9) {
            if (v()) {
                this.f58925y.G(false);
                for (b1 b1Var : this.D) {
                    b1Var.G(false);
                }
            } else if (fVar instanceof a) {
                ArrayList arrayList = this.f58923w;
                s(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
            }
            this.f58919f.d(this);
        }
    }

    @Override
    public final void r(long j3) {
        int size;
        o oVar = this.f58921r;
        if (!oVar.c() && !v()) {
            boolean d = oVar.d();
            boolean z9 = false;
            List list = this.f58924x;
            o2.l lVar = this.f58918e;
            ArrayList arrayList = this.f58923w;
            if (d) {
                f fVar = this.F;
                fVar.getClass();
                boolean z10 = fVar instanceof a;
                if (!z10 || !u(arrayList.size() - 1)) {
                    if (lVar.f20772m == null) {
                        z9 = lVar.f20769j.k(j3, fVar, list);
                    }
                    if (z9) {
                        oVar.b();
                        if (z10) {
                            this.L = (a) fVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (lVar.f20772m == null && lVar.f20769j.length() >= 2) {
                size = lVar.f20769j.j(j3, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                ia.p(!oVar.d());
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
                    long j10 = t().f58909n;
                    a s5 = s(size);
                    if (arrayList.isEmpty()) {
                        this.I = this.J;
                    }
                    this.P = false;
                    this.h.A(s5.h, this.f58915a, j10);
                }
            }
            if (this.f58925y.z()) {
                this.P = true;
            }
        }
    }

    public final a s(int i7) {
        ArrayList arrayList = this.f58923w;
        a aVar = (a) arrayList.get(i7);
        m0.X(i7, arrayList.size(), arrayList);
        this.K = Math.max(this.K, arrayList.size());
        int i10 = 0;
        this.f58925y.o(aVar.d(0));
        while (true) {
            b1[] b1VarArr = this.D;
            if (i10 < b1VarArr.length) {
                b1 b1Var = b1VarArr[i10];
                i10++;
                b1Var.o(aVar.d(i10));
            } else {
                return aVar;
            }
        }
    }

    public final a t() {
        return (a) jg.g.i(1, this.f58923w);
    }

    public final boolean u(int i7) {
        int v;
        a aVar = (a) this.f58923w.get(i7);
        if (this.f58925y.v() > aVar.d(0)) {
            return true;
        }
        int i10 = 0;
        do {
            b1[] b1VarArr = this.D;
            if (i10 >= b1VarArr.length) {
                return false;
            }
            v = b1VarArr[i10].v();
            i10++;
        } while (v <= aVar.d(i10));
        return true;
    }

    public final boolean v() {
        if (this.I != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final boolean w() {
        if ((this.M || this.N) && !this.P && !this.f58921r.c()) {
            return true;
        }
        return false;
    }

    public final void x() {
        int y10 = y(this.f58925y.v(), this.K - 1);
        while (true) {
            int i7 = this.K;
            if (i7 <= y10) {
                this.K = i7 + 1;
                a aVar = (a) this.f58923w.get(i7);
                u uVar = aVar.d;
                if (!uVar.equals(this.G)) {
                    this.h.j(this.f58915a, uVar, aVar.f58907e, aVar.f58908f, aVar.h);
                }
                this.G = uVar;
            } else {
                return;
            }
        }
    }

    public final int y(int i7, int i10) {
        ArrayList arrayList;
        do {
            i10++;
            arrayList = this.f58923w;
            if (i10 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i10)).d(0) <= i7);
        return i10 - 1;
    }

    public final void z(o2.b bVar) {
        b1[] b1VarArr;
        this.H = bVar;
        b1 b1Var = this.f58925y;
        b1Var.l();
        q2.g gVar = b1Var.h;
        if (gVar != null) {
            gVar.c(b1Var.f58292e);
            b1Var.h = null;
            b1Var.f58294g = null;
        }
        for (b1 b1Var2 : this.D) {
            b1Var2.l();
            q2.g gVar2 = b1Var2.h;
            if (gVar2 != null) {
                gVar2.c(b1Var2.f58292e);
                b1Var2.h = null;
                b1Var2.f58294g = null;
            }
        }
        this.f58921r.e(this);
    }
}
