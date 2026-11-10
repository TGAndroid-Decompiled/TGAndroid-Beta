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
import x2.a1;
import x2.b1;
import x2.d1;
import x2.t;
public final class i implements b1, d1, b3.j, b3.m {
    public final a1[] D;
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
    public final int f58913a;
    public final int[] f58914b;
    public final u[] f58915c;
    public final boolean[] d;
    public final o2.l f58916e;
    public final o2.b f58917f;
    public final wa h;
    public final pb.b f58918n;
    public final o f58919r;
    public final ca.i f58920s;
    public final ArrayList f58921w;
    public final List f58922x;
    public final a1 f58923y;

    public i(int i7, int[] iArr, u[] uVarArr, o2.l lVar, o2.b bVar, h6.m mVar, long j3, q2.m mVar2, q2.j jVar, pb.b bVar2, wa waVar, boolean z9, long j10, c3.a aVar) {
        o oVar;
        this.f58913a = i7;
        this.f58914b = iArr;
        this.f58915c = uVarArr;
        this.f58916e = lVar;
        this.f58917f = bVar;
        this.h = waVar;
        this.f58918n = bVar2;
        if (aVar != null) {
            oVar = new o(aVar);
        } else {
            oVar = new o("ChunkSampleStream");
        }
        this.f58919r = oVar;
        this.f58920s = new ca.i(10);
        ArrayList arrayList = new ArrayList();
        this.f58921w = arrayList;
        this.f58922x = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.D = new a1[length];
        this.d = new boolean[length];
        int i10 = length + 1;
        int[] iArr2 = new int[i10];
        a1[] a1VarArr = new a1[i10];
        mVar2.getClass();
        a1 a1Var = new a1(mVar, mVar2, jVar);
        this.f58923y = a1Var;
        iArr2[0] = i7;
        a1VarArr[0] = a1Var;
        int i11 = 0;
        while (i11 < length) {
            a1 a1Var2 = new a1(mVar, null, null);
            this.D[i11] = a1Var2;
            int i12 = i11 + 1;
            a1VarArr[i12] = a1Var2;
            iArr2[i12] = this.f58914b[i11];
            i11 = i12;
        }
        this.E = new i0(11, iArr2, a1VarArr);
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
        t tVar;
        f fVar = (f) lVar;
        if (i7 == 0) {
            long j11 = fVar.f58902a;
            tVar = new t(fVar.f58903b, j3);
        } else {
            long j12 = fVar.f58902a;
            j2.m mVar = fVar.f58903b;
            c0 c0Var = fVar.f58908r;
            tVar = new t(mVar, c0Var.f16417c, c0Var.d, j3, j10, c0Var.f16416b);
        }
        this.h.t(tVar, fVar.f58904c, this.f58913a, fVar.d, fVar.f58905e, fVar.f58906f, fVar.h, fVar.f58907n, i7);
    }

    @Override
    public final void a() {
        o oVar = this.f58919r;
        oVar.a();
        this.f58923y.C();
        if (!oVar.d()) {
            o2.l lVar = this.f58916e;
            x2.b bVar = lVar.f20777m;
            if (bVar == null) {
                lVar.f20767a.a();
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
        a1[] a1VarArr;
        a1 a1Var = this.f58923y;
        a1Var.G(true);
        q2.g gVar = a1Var.h;
        if (gVar != null) {
            gVar.c(a1Var.f58295e);
            a1Var.h = null;
            a1Var.f58297g = null;
        }
        for (a1 a1Var2 : this.D) {
            a1Var2.G(true);
            q2.g gVar2 = a1Var2.h;
            if (gVar2 != null) {
                gVar2.c(a1Var2.f58295e);
                a1Var2.h = null;
                a1Var2.f58297g = null;
            }
        }
        for (o2.j jVar : this.f58916e.f20773i) {
            e eVar = jVar.f20762a;
            if (eVar != null) {
                eVar.f58894a.release();
            }
        }
        h hVar = this.H;
        if (hVar != null) {
            o2.b bVar = (o2.b) hVar;
            synchronized (bVar) {
                o2.o oVar = (o2.o) bVar.D.remove(this);
                if (oVar != null) {
                    a1 a1Var3 = oVar.f20787a;
                    a1Var3.G(true);
                    q2.g gVar3 = a1Var3.h;
                    if (gVar3 != null) {
                        gVar3.c(a1Var3.f58295e);
                        a1Var3.h = null;
                        a1Var3.f58297g = null;
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
        return t().f58907n;
    }

    @Override
    public final boolean f() {
        if (!v() && this.f58923y.A(this.P)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean g() {
        return this.f58919r.d();
    }

    @Override
    public final int l(long j3) {
        if (v() || w() || this.O) {
            return 0;
        }
        boolean z9 = this.P;
        a1 a1Var = this.f58923y;
        int x10 = a1Var.x(j3, z9);
        a aVar = this.L;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(0) - a1Var.v());
        }
        a1Var.L(x10);
        x();
        return x10;
    }

    @Override
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        if (!v() && !w() && !this.O) {
            a aVar = this.L;
            a1 a1Var = this.f58923y;
            if (aVar == null || aVar.d(0) > a1Var.v()) {
                x();
                return a1Var.F(bVar, hVar, i7, this.P);
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
        o2.l lVar2 = this.f58916e;
        o2.j[] jVarArr = lVar2.f20773i;
        if (fVar instanceof k) {
            int b10 = lVar2.f20774j.b(((k) fVar).d);
            o2.j jVar = jVarArr[b10];
            if (jVar.d == null) {
                e eVar = jVar.f20762a;
                eVar.getClass();
                f3.j a10 = eVar.a();
                if (a10 != null) {
                    p2.m mVar = jVar.f20763b;
                    jVarArr[b10] = new o2.j(jVar.f20765e, mVar, jVar.f20764c, jVar.f20762a, jVar.f20766f, new ua(a10, mVar.f53152c, 6));
                }
            }
        }
        o2.o oVar = lVar2.h;
        if (oVar != null) {
            long j11 = oVar.d;
            if (j11 == -9223372036854775807L || fVar.f58907n > j11) {
                oVar.d = fVar.f58907n;
            }
            oVar.f20790e.h = true;
        }
        long j12 = fVar.f58902a;
        j2.m mVar2 = fVar.f58903b;
        c0 c0Var = fVar.f58908r;
        t tVar = new t(mVar2, c0Var.f16417c, c0Var.d, j3, j10, c0Var.f16416b);
        this.f58918n.getClass();
        this.h.p(tVar, fVar.f58904c, this.f58913a, fVar.d, fVar.f58905e, fVar.f58906f, fVar.h, fVar.f58907n);
        this.f58917f.d(this);
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
            ArrayList arrayList = this.f58921w;
            if (arrayList.size() > 1) {
                t6 = (a) jg.g.i(2, arrayList);
            } else {
                t6 = null;
            }
        }
        if (t6 != null) {
            j3 = Math.max(j3, t6.f58907n);
        }
        return Math.max(j3, this.f58923y.s());
    }

    @Override
    public final void q0(b3.l lVar, long j3, long j10, boolean z9) {
        f fVar = (f) lVar;
        this.F = null;
        this.L = null;
        long j11 = fVar.f58902a;
        j2.m mVar = fVar.f58903b;
        c0 c0Var = fVar.f58908r;
        t tVar = new t(mVar, c0Var.f16417c, c0Var.d, j3, j10, c0Var.f16416b);
        this.f58918n.getClass();
        this.h.o(tVar, fVar.f58904c, this.f58913a, fVar.d, fVar.f58905e, fVar.f58906f, fVar.h, fVar.f58907n);
        if (!z9) {
            if (v()) {
                this.f58923y.G(false);
                for (a1 a1Var : this.D) {
                    a1Var.G(false);
                }
            } else if (fVar instanceof a) {
                ArrayList arrayList = this.f58921w;
                s(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
            }
            this.f58917f.d(this);
        }
    }

    @Override
    public final void r(long j3) {
        int size;
        o oVar = this.f58919r;
        if (!oVar.c() && !v()) {
            boolean d = oVar.d();
            boolean z9 = false;
            List list = this.f58922x;
            o2.l lVar = this.f58916e;
            ArrayList arrayList = this.f58921w;
            if (d) {
                f fVar = this.F;
                fVar.getClass();
                boolean z10 = fVar instanceof a;
                if (!z10 || !u(arrayList.size() - 1)) {
                    if (lVar.f20777m == null) {
                        z9 = lVar.f20774j.k(j3, fVar, list);
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
            if (lVar.f20777m == null && lVar.f20774j.length() >= 2) {
                size = lVar.f20774j.j(j3, list);
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
                    long j10 = t().f58907n;
                    a s5 = s(size);
                    if (arrayList.isEmpty()) {
                        this.I = this.J;
                    }
                    this.P = false;
                    this.h.A(s5.h, this.f58913a, j10);
                }
            }
            if (this.f58923y.z()) {
                this.P = true;
            }
        }
    }

    public final a s(int i7) {
        ArrayList arrayList = this.f58921w;
        a aVar = (a) arrayList.get(i7);
        m0.X(i7, arrayList.size(), arrayList);
        this.K = Math.max(this.K, arrayList.size());
        int i10 = 0;
        this.f58923y.o(aVar.d(0));
        while (true) {
            a1[] a1VarArr = this.D;
            if (i10 < a1VarArr.length) {
                a1 a1Var = a1VarArr[i10];
                i10++;
                a1Var.o(aVar.d(i10));
            } else {
                return aVar;
            }
        }
    }

    public final a t() {
        return (a) jg.g.i(1, this.f58921w);
    }

    public final boolean u(int i7) {
        int v;
        a aVar = (a) this.f58921w.get(i7);
        if (this.f58923y.v() > aVar.d(0)) {
            return true;
        }
        int i10 = 0;
        do {
            a1[] a1VarArr = this.D;
            if (i10 >= a1VarArr.length) {
                return false;
            }
            v = a1VarArr[i10].v();
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
        if ((this.M || this.N) && !this.P && !this.f58919r.c()) {
            return true;
        }
        return false;
    }

    public final void x() {
        int y10 = y(this.f58923y.v(), this.K - 1);
        while (true) {
            int i7 = this.K;
            if (i7 <= y10) {
                this.K = i7 + 1;
                a aVar = (a) this.f58921w.get(i7);
                u uVar = aVar.d;
                if (!uVar.equals(this.G)) {
                    this.h.j(this.f58913a, uVar, aVar.f58905e, aVar.f58906f, aVar.h);
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
            arrayList = this.f58921w;
            if (i10 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i10)).d(0) <= i7);
        return i10 - 1;
    }

    public final void z(o2.b bVar) {
        a1[] a1VarArr;
        this.H = bVar;
        a1 a1Var = this.f58923y;
        a1Var.l();
        q2.g gVar = a1Var.h;
        if (gVar != null) {
            gVar.c(a1Var.f58295e);
            a1Var.h = null;
            a1Var.f58297g = null;
        }
        for (a1 a1Var2 : this.D) {
            a1Var2.l();
            q2.g gVar2 = a1Var2.h;
            if (gVar2 != null) {
                gVar2.c(a1Var2.f58295e);
                a1Var2.h = null;
                a1Var2.f58297g = null;
            }
        }
        this.f58919r.e(this);
    }
}
