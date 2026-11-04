package x2;

import a3.q;
import android.support.v4.media.session.a0;
import b8.ig;
import b8.kg;
import b8.zb;
import d2.v;
import g2.n0;
import i2.c0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import k2.p1;
import n2.o;
import w2.c1;
import w2.d1;
import w2.f1;
import w2.u;
public final class i implements d1, f1, a3.k, a3.n {
    public final c1[] E;
    public final ua.b F;
    public f G;
    public v H;
    public h I;
    public long J;
    public long K;
    public int L;
    public a M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public final int f58159a;
    public final int[] f58160b;
    public final v[] f58161c;
    public final boolean[] d;
    public final n2.l f58162e;
    public final n2.b f58163f;
    public final kg h;
    public final kb.a f58164n;
    public final q f58165r;
    public final ba.i f58166s;
    public final ArrayList f58167w;
    public final List f58168x;
    public final c1 f58169y;

    public i(int i3, int[] iArr, v[] vVarArr, n2.l lVar, n2.b bVar, a0 a0Var, long j10, p2.m mVar, p2.j jVar, kb.a aVar, kg kgVar, boolean z10, long j11, b3.a aVar2) {
        q qVar;
        this.f58159a = i3;
        this.f58160b = iArr;
        this.f58161c = vVarArr;
        this.f58162e = lVar;
        this.f58163f = bVar;
        this.h = kgVar;
        this.f58164n = aVar;
        if (aVar2 != null) {
            qVar = new q(aVar2);
        } else {
            qVar = new q("ChunkSampleStream");
        }
        this.f58165r = qVar;
        this.f58166s = new ba.i(10);
        ArrayList arrayList = new ArrayList();
        this.f58167w = arrayList;
        this.f58168x = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.E = new c1[length];
        this.d = new boolean[length];
        int i10 = length + 1;
        int[] iArr2 = new int[i10];
        c1[] c1VarArr = new c1[i10];
        mVar.getClass();
        c1 c1Var = new c1(a0Var, mVar, jVar);
        this.f58169y = c1Var;
        iArr2[0] = i3;
        c1VarArr[0] = c1Var;
        int i11 = 0;
        while (i11 < length) {
            c1 c1Var2 = new c1(a0Var, null, null);
            this.E[i11] = c1Var2;
            int i12 = i11 + 1;
            c1VarArr[i12] = c1Var2;
            iArr2[i12] = this.f58160b[i11];
            i11 = i12;
        }
        this.F = new ua.b(3, iArr2, c1VarArr);
        this.J = j10;
        this.K = j10;
        this.N = z10;
        if (z10 && j11 != -9223372036854775807L) {
            this.N = false;
            this.O = j11 < j10;
        }
    }

    public final int A(int i3, int i10) {
        ArrayList arrayList;
        do {
            i10++;
            arrayList = this.f58167w;
            if (i10 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i10)).d(0) <= i3);
        return i10 - 1;
    }

    public final void B(n2.b bVar) {
        c1[] c1VarArr;
        this.I = bVar;
        c1 c1Var = this.f58169y;
        c1Var.l();
        p2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.b(c1Var.f57046e);
            c1Var.h = null;
            c1Var.f57048g = null;
        }
        for (c1 c1Var2 : this.E) {
            c1Var2.l();
            p2.g gVar2 = c1Var2.h;
            if (gVar2 != null) {
                gVar2.b(c1Var2.f57046e);
                c1Var2.h = null;
                c1Var2.f57048g = null;
            }
        }
        this.f58165r.e(this);
    }

    @Override
    public final void M(a3.m mVar, long j10, long j11, int i3) {
        u uVar;
        f fVar = (f) mVar;
        if (i3 == 0) {
            long j12 = fVar.f58148a;
            uVar = new u(fVar.f58149b, j10);
        } else {
            long j13 = fVar.f58148a;
            i2.n nVar = fVar.f58149b;
            c0 c0Var = fVar.f58154r;
            uVar = new u(nVar, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        }
        this.h.u(uVar, fVar.f58150c, this.f58159a, fVar.d, fVar.f58151e, fVar.f58152f, fVar.h, fVar.f58153n, i3);
    }

    @Override
    public final void a() {
        q qVar = this.f58165r;
        qVar.a();
        this.f58169y.C();
        if (!qVar.d()) {
            n2.l lVar = this.f58162e;
            w2.b bVar = lVar.f20191m;
            if (bVar == null) {
                lVar.f20181a.a();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final void b() {
        c1[] c1VarArr;
        c1 c1Var = this.f58169y;
        c1Var.G(true);
        p2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.b(c1Var.f57046e);
            c1Var.h = null;
            c1Var.f57048g = null;
        }
        for (c1 c1Var2 : this.E) {
            c1Var2.G(true);
            p2.g gVar2 = c1Var2.h;
            if (gVar2 != null) {
                gVar2.b(c1Var2.f57046e);
                c1Var2.h = null;
                c1Var2.f57048g = null;
            }
        }
        for (n2.j jVar : this.f58162e.f20187i) {
            e eVar = jVar.f20176a;
            if (eVar != null) {
                eVar.f58140a.release();
            }
        }
        h hVar = this.I;
        if (hVar != null) {
            n2.b bVar = (n2.b) hVar;
            synchronized (bVar) {
                o oVar = (o) bVar.E.remove(this);
                if (oVar != null) {
                    c1 c1Var3 = oVar.f20201a;
                    c1Var3.G(true);
                    p2.g gVar3 = c1Var3.h;
                    if (gVar3 != null) {
                        gVar3.b(c1Var3.f57046e);
                        c1Var3.h = null;
                        c1Var3.f57048g = null;
                    }
                }
            }
        }
    }

    @Override
    public final boolean c(k2.v0 r58) {
        throw new UnsupportedOperationException("Method not decompiled: x2.i.c(k2.v0):boolean");
    }

    @Override
    public final boolean d() {
        return this.f58165r.d();
    }

    @Override
    public final long e() {
        if (x()) {
            return this.J;
        }
        if (this.Q) {
            return Long.MIN_VALUE;
        }
        return v().f58153n;
    }

    @Override
    public final boolean f() {
        if (!x() && this.f58169y.A(this.Q)) {
            return true;
        }
        return false;
    }

    @Override
    public final void h(a3.m mVar, long j10, long j11) {
        f fVar = (f) mVar;
        this.G = null;
        n2.l lVar = this.f58162e;
        n2.j[] jVarArr = lVar.f20187i;
        if (fVar instanceof k) {
            int e10 = lVar.f20188j.e(((k) fVar).d);
            n2.j jVar = jVarArr[e10];
            if (jVar.d == null) {
                e eVar = jVar.f20176a;
                eVar.getClass();
                e3.j a10 = eVar.a();
                if (a10 != null) {
                    o2.m mVar2 = jVar.f20177b;
                    jVarArr[e10] = new n2.j(jVar.f20179e, mVar2, jVar.f20178c, jVar.f20176a, jVar.f20180f, new ig(a10, mVar2.f20555c, 5));
                }
            }
        }
        o oVar = lVar.h;
        if (oVar != null) {
            long j12 = oVar.d;
            if (j12 == -9223372036854775807L || fVar.f58153n > j12) {
                oVar.d = fVar.f58153n;
            }
            oVar.f20204e.h = true;
        }
        long j13 = fVar.f58148a;
        i2.n nVar = fVar.f58149b;
        c0 c0Var = fVar.f58154r;
        u uVar = new u(nVar, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        this.f58164n.getClass();
        this.h.q(uVar, fVar.f58150c, this.f58159a, fVar.d, fVar.f58151e, fVar.f58152f, fVar.h, fVar.f58153n);
        this.f58163f.k(this);
    }

    @Override
    public final a3.i k(a3.m r26, long r27, long r29, java.io.IOException r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: x2.i.k(a3.m, long, long, java.io.IOException, int):a3.i");
    }

    @Override
    public final int m(long j10) {
        if (x() || y() || this.P) {
            return 0;
        }
        boolean z10 = this.Q;
        c1 c1Var = this.f58169y;
        int x10 = c1Var.x(j10, z10);
        a aVar = this.M;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(0) - c1Var.v());
        }
        c1Var.L(x10);
        z();
        return x10;
    }

    @Override
    public final int o(tf.b bVar, j2.h hVar, int i3) {
        if (!x() && !y() && !this.P) {
            a aVar = this.M;
            c1 c1Var = this.f58169y;
            if (aVar == null || aVar.d(0) > c1Var.v()) {
                z();
                return c1Var.F(bVar, hVar, i3, this.Q);
            }
            return -3;
        }
        return -3;
    }

    @Override
    public final long q() {
        if (this.Q) {
            return Long.MIN_VALUE;
        }
        if (x()) {
            return this.J;
        }
        long j10 = this.K;
        a v = v();
        if (!v.c()) {
            ArrayList arrayList = this.f58167w;
            if (arrayList.size() > 1) {
                v = (a) p1.h(2, arrayList);
            } else {
                v = null;
            }
        }
        if (v != null) {
            j10 = Math.max(j10, v.f58153n);
        }
        return Math.max(j10, this.f58169y.s());
    }

    @Override
    public final void q0(a3.m mVar, long j10, long j11, boolean z10) {
        f fVar = (f) mVar;
        this.G = null;
        this.M = null;
        long j12 = fVar.f58148a;
        i2.n nVar = fVar.f58149b;
        c0 c0Var = fVar.f58154r;
        u uVar = new u(nVar, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        this.f58164n.getClass();
        this.h.p(uVar, fVar.f58150c, this.f58159a, fVar.d, fVar.f58151e, fVar.f58152f, fVar.h, fVar.f58153n);
        if (!z10) {
            if (x()) {
                this.f58169y.G(false);
                for (c1 c1Var : this.E) {
                    c1Var.G(false);
                }
            } else if (fVar instanceof a) {
                ArrayList arrayList = this.f58167w;
                u(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.J = this.K;
                }
            }
            this.f58163f.k(this);
        }
    }

    @Override
    public final void t(long j10) {
        int size;
        q qVar = this.f58165r;
        if (!qVar.c() && !x()) {
            boolean d = qVar.d();
            boolean z10 = false;
            List list = this.f58168x;
            n2.l lVar = this.f58162e;
            ArrayList arrayList = this.f58167w;
            if (d) {
                f fVar = this.G;
                fVar.getClass();
                boolean z11 = fVar instanceof a;
                if (!z11 || !w(arrayList.size() - 1)) {
                    if (lVar.f20191m == null) {
                        z10 = lVar.f20188j.m(j10, fVar, list);
                    }
                    if (z10) {
                        qVar.b();
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
            if (lVar.f20191m == null && lVar.f20188j.length() >= 2) {
                size = lVar.f20188j.j(j10, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                zb.p(!qVar.d());
                int size2 = arrayList.size();
                while (true) {
                    if (size < size2) {
                        if (!w(size)) {
                            break;
                        }
                        size++;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (size != -1) {
                    long j11 = v().f58153n;
                    a u10 = u(size);
                    if (arrayList.isEmpty()) {
                        this.J = this.K;
                    }
                    this.Q = false;
                    this.h.B(u10.h, this.f58159a, j11);
                }
            }
            if (this.f58169y.z()) {
                this.Q = true;
            }
        }
    }

    public final a u(int i3) {
        ArrayList arrayList = this.f58167w;
        a aVar = (a) arrayList.get(i3);
        n0.X(i3, arrayList.size(), arrayList);
        this.L = Math.max(this.L, arrayList.size());
        int i10 = 0;
        this.f58169y.o(aVar.d(0));
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

    public final a v() {
        return (a) p1.h(1, this.f58167w);
    }

    public final boolean w(int i3) {
        int v;
        a aVar = (a) this.f58167w.get(i3);
        if (this.f58169y.v() > aVar.d(0)) {
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

    public final boolean x() {
        if (this.J != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final boolean y() {
        if ((this.N || this.O) && !this.Q && !this.f58165r.c()) {
            return true;
        }
        return false;
    }

    public final void z() {
        int A = A(this.f58169y.v(), this.L - 1);
        while (true) {
            int i3 = this.L;
            if (i3 <= A) {
                this.L = i3 + 1;
                a aVar = (a) this.f58167w.get(i3);
                v vVar = aVar.d;
                if (!vVar.equals(this.H)) {
                    this.h.k(this.f58159a, vVar, aVar.f58151e, aVar.f58152f, aVar.h);
                }
                this.H = vVar;
            } else {
                return;
            }
        }
    }
}
