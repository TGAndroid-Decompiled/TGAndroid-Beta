package v2;

import android.support.v4.media.session.a0;
import b2.u;
import b2.x;
import c3.g0;
import e2.l0;
import g2.c0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import l2.o;
import u2.c1;
import u2.d1;
import u2.f1;
import v7.t6;
public final class i implements d1, f1, y2.g, y2.j {
    public final c1[] D;
    public final u9.b E;
    public f F;
    public x G;
    public h H;
    public long I;
    public long J;
    public int K;
    public a L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public final int f50314a;
    public final int[] f50315b;
    public final x[] f50316c;
    public final boolean[] d;
    public final l2.l e;
    public final l2.b f50317f;
    public final a5.a h;
    public final hb.a f50318n;
    public final y2.l f50319r;
    public final u f50320s;
    public final ArrayList f50321w;
    public final List f50322x;
    public final c1 f50323y;

    public i(int i10, int[] iArr, x[] xVarArr, l2.l lVar, l2.b bVar, a0 a0Var, long j10, n2.m mVar, n2.j jVar, hb.a aVar, a5.a aVar2, boolean z10, long j11, z2.a aVar3) {
        y2.l lVar2;
        this.f50314a = i10;
        this.f50315b = iArr;
        this.f50316c = xVarArr;
        this.e = lVar;
        this.f50317f = bVar;
        this.h = aVar2;
        this.f50318n = aVar;
        if (aVar3 != null) {
            lVar2 = new y2.l(aVar3);
        } else {
            lVar2 = new y2.l("ChunkSampleStream");
        }
        this.f50319r = lVar2;
        this.f50320s = new u(6);
        ArrayList arrayList = new ArrayList();
        this.f50321w = arrayList;
        this.f50322x = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.D = new c1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        c1[] c1VarArr = new c1[i11];
        mVar.getClass();
        c1 c1Var = new c1(a0Var, mVar, jVar);
        this.f50323y = c1Var;
        iArr2[0] = i10;
        c1VarArr[0] = c1Var;
        int i12 = 0;
        while (i12 < length) {
            c1 c1Var2 = new c1(a0Var, null, null);
            this.D[i12] = c1Var2;
            int i13 = i12 + 1;
            c1VarArr[i13] = c1Var2;
            iArr2[i13] = this.f50315b[i12];
            i12 = i13;
        }
        this.E = new u9.b(1, iArr2, c1VarArr);
        this.I = j10;
        this.J = j10;
        this.M = z10;
        if (z10 && j11 != -9223372036854775807L) {
            this.M = false;
            this.N = j11 < j10;
        }
    }

    public final void A() {
        int B = B(this.f50323y.v(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 <= B) {
                this.K = i10 + 1;
                a aVar = (a) this.f50321w.get(i10);
                x xVar = aVar.d;
                if (!xVar.equals(this.G)) {
                    this.h.l(this.f50314a, xVar, aVar.e, aVar.f50308f, aVar.h);
                }
                this.G = xVar;
            } else {
                return;
            }
        }
    }

    public final int B(int i10, int i11) {
        ArrayList arrayList;
        do {
            i11++;
            arrayList = this.f50321w;
            if (i11 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i11)).d(0) <= i10);
        return i11 - 1;
    }

    public final void C(l2.b bVar) {
        c1[] c1VarArr;
        this.H = bVar;
        c1 c1Var = this.f50323y;
        c1Var.l();
        n2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.a(c1Var.e);
            c1Var.h = null;
            c1Var.f49844g = null;
        }
        for (c1 c1Var2 : this.D) {
            c1Var2.l();
            n2.g gVar2 = c1Var2.h;
            if (gVar2 != null) {
                gVar2.a(c1Var2.e);
                c1Var2.h = null;
                c1Var2.f49844g = null;
            }
        }
        this.f50319r.e(this);
    }

    @Override
    public final void M(y2.i iVar, long j10, long j11, boolean z10) {
        f fVar = (f) iVar;
        this.F = null;
        this.L = null;
        long j12 = fVar.f50305a;
        g2.n nVar = fVar.f50306b;
        c0 c0Var = fVar.f50310r;
        u2.u uVar = new u2.u(nVar, c0Var.f7284c, c0Var.d, j10, j11, c0Var.f7283b);
        this.f50318n.getClass();
        this.h.p(uVar, fVar.f50307c, this.f50314a, fVar.d, fVar.e, fVar.f50308f, fVar.h, fVar.f50309n);
        if (!z10) {
            if (y()) {
                this.f50323y.G(false);
                for (c1 c1Var : this.D) {
                    c1Var.G(false);
                }
            } else if (fVar instanceof a) {
                ArrayList arrayList = this.f50321w;
                v(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
            }
            this.f50317f.r(this);
        }
    }

    @Override
    public final void a() {
        y2.l lVar = this.f50319r;
        lVar.a();
        this.f50323y.C();
        if (!lVar.d()) {
            l2.l lVar2 = this.e;
            u2.b bVar = lVar2.f11619m;
            if (bVar == null) {
                lVar2.f11610a.a();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final void b() {
        c1[] c1VarArr;
        c1 c1Var = this.f50323y;
        c1Var.G(true);
        n2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.a(c1Var.e);
            c1Var.h = null;
            c1Var.f49844g = null;
        }
        for (c1 c1Var2 : this.D) {
            c1Var2.G(true);
            n2.g gVar2 = c1Var2.h;
            if (gVar2 != null) {
                gVar2.a(c1Var2.e);
                c1Var2.h = null;
                c1Var2.f49844g = null;
            }
        }
        for (l2.j jVar : this.e.f11615i) {
            e eVar = jVar.f11606a;
            if (eVar != null) {
                eVar.f50298a.release();
            }
        }
        h hVar = this.H;
        if (hVar != null) {
            l2.b bVar = (l2.b) hVar;
            synchronized (bVar) {
                o oVar = (o) bVar.D.remove(this);
                if (oVar != null) {
                    c1 c1Var3 = oVar.f11628a;
                    c1Var3.G(true);
                    n2.g gVar3 = c1Var3.h;
                    if (gVar3 != null) {
                        gVar3.a(c1Var3.e);
                        c1Var3.h = null;
                        c1Var3.f49844g = null;
                    }
                }
            }
        }
    }

    @Override
    public final long c() {
        if (y()) {
            return this.I;
        }
        if (this.P) {
            return Long.MIN_VALUE;
        }
        return w().f50309n;
    }

    @Override
    public final boolean d() {
        return this.f50319r.d();
    }

    @Override
    public final boolean e() {
        if (!y() && this.f50323y.A(this.P)) {
            return true;
        }
        return false;
    }

    @Override
    public final int i(long j10) {
        if (y() || z() || this.O) {
            return 0;
        }
        boolean z10 = this.P;
        c1 c1Var = this.f50323y;
        int x10 = c1Var.x(j10, z10);
        a aVar = this.L;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(0) - c1Var.v());
        }
        c1Var.L(x10);
        A();
        return x10;
    }

    @Override
    public final k4.d l(y2.i r26, long r27, long r29, java.io.IOException r31, int r32) {
        throw new UnsupportedOperationException("Method not decompiled: v2.i.l(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final boolean m(i2.w0 r58) {
        throw new UnsupportedOperationException("Method not decompiled: v2.i.m(i2.w0):boolean");
    }

    @Override
    public final void n(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        f fVar = (f) iVar;
        if (i10 == 0) {
            long j12 = fVar.f50305a;
            uVar = new u2.u(fVar.f50306b, j10);
        } else {
            long j13 = fVar.f50305a;
            g2.n nVar = fVar.f50306b;
            c0 c0Var = fVar.f50310r;
            uVar = new u2.u(nVar, c0Var.f7284c, c0Var.d, j10, j11, c0Var.f7283b);
        }
        this.h.u(uVar, fVar.f50307c, this.f50314a, fVar.d, fVar.e, fVar.f50308f, fVar.h, fVar.f50309n, i10);
    }

    @Override
    public final void o(y2.i iVar, long j10, long j11) {
        f fVar = (f) iVar;
        this.F = null;
        l2.l lVar = this.e;
        l2.j[] jVarArr = lVar.f11615i;
        if (fVar instanceof k) {
            int s10 = lVar.f11616j.s(((k) fVar).d);
            l2.j jVar = jVarArr[s10];
            if (jVar.d == null) {
                e eVar = jVar.f11606a;
                eVar.getClass();
                c3.j a2 = eVar.a();
                if (a2 != null) {
                    m2.m mVar = jVar.f11607b;
                    jVarArr[s10] = new l2.j(jVar.e, mVar, jVar.f11608c, jVar.f11606a, jVar.f11609f, new g0(a2, mVar.f12669c, 4));
                }
            }
        }
        o oVar = lVar.h;
        if (oVar != null) {
            long j12 = oVar.d;
            if (j12 == -9223372036854775807L || fVar.f50309n > j12) {
                oVar.d = fVar.f50309n;
            }
            oVar.e.h = true;
        }
        long j13 = fVar.f50305a;
        g2.n nVar = fVar.f50306b;
        c0 c0Var = fVar.f50310r;
        u2.u uVar = new u2.u(nVar, c0Var.f7284c, c0Var.d, j10, j11, c0Var.f7283b);
        this.f50318n.getClass();
        this.h.q(uVar, fVar.f50307c, this.f50314a, fVar.d, fVar.e, fVar.f50308f, fVar.h, fVar.f50309n);
        this.f50317f.r(this);
    }

    @Override
    public final int r(hf.b bVar, h2.h hVar, int i10) {
        if (!y() && !z() && !this.O) {
            a aVar = this.L;
            c1 c1Var = this.f50323y;
            if (aVar == null || aVar.d(0) > c1Var.v()) {
                A();
                return c1Var.F(bVar, hVar, i10, this.P);
            }
            return -3;
        }
        return -3;
    }

    @Override
    public final long s() {
        if (this.P) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.I;
        }
        long j10 = this.J;
        a w9 = w();
        if (!w9.c()) {
            ArrayList arrayList = this.f50321w;
            if (arrayList.size() > 1) {
                w9 = (a) i0.a.g(2, arrayList);
            } else {
                w9 = null;
            }
        }
        if (w9 != null) {
            j10 = Math.max(j10, w9.f50309n);
        }
        return Math.max(j10, this.f50323y.s());
    }

    @Override
    public final void u(long j10) {
        int size;
        y2.l lVar = this.f50319r;
        if (!lVar.c() && !y()) {
            boolean d = lVar.d();
            boolean z10 = false;
            List list = this.f50322x;
            l2.l lVar2 = this.e;
            ArrayList arrayList = this.f50321w;
            if (d) {
                f fVar = this.F;
                fVar.getClass();
                boolean z11 = fVar instanceof a;
                if (!z11 || !x(arrayList.size() - 1)) {
                    if (lVar2.f11619m == null) {
                        z10 = lVar2.f11616j.d(j10, fVar, list);
                    }
                    if (z10) {
                        lVar.b();
                        if (z11) {
                            this.L = (a) fVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (lVar2.f11619m == null && lVar2.f11616j.length() >= 2) {
                size = lVar2.f11616j.i(j10, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                t6.p(!lVar.d());
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
                    long j11 = w().f50309n;
                    a v = v(size);
                    if (arrayList.isEmpty()) {
                        this.I = this.J;
                    }
                    this.P = false;
                    this.h.B(v.h, this.f50314a, j11);
                }
            }
            if (this.f50323y.z()) {
                this.P = true;
            }
        }
    }

    public final a v(int i10) {
        ArrayList arrayList = this.f50321w;
        a aVar = (a) arrayList.get(i10);
        l0.X(i10, arrayList.size(), arrayList);
        this.K = Math.max(this.K, arrayList.size());
        int i11 = 0;
        this.f50323y.o(aVar.d(0));
        while (true) {
            c1[] c1VarArr = this.D;
            if (i11 < c1VarArr.length) {
                c1 c1Var = c1VarArr[i11];
                i11++;
                c1Var.o(aVar.d(i11));
            } else {
                return aVar;
            }
        }
    }

    public final a w() {
        return (a) i0.a.g(1, this.f50321w);
    }

    public final boolean x(int i10) {
        int v;
        a aVar = (a) this.f50321w.get(i10);
        if (this.f50323y.v() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            c1[] c1VarArr = this.D;
            if (i11 >= c1VarArr.length) {
                return false;
            }
            v = c1VarArr[i11].v();
            i11++;
        } while (v <= aVar.d(i11));
        return true;
    }

    public final boolean y() {
        if (this.I != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final boolean z() {
        if ((this.M || this.N) && !this.P && !this.f50319r.c()) {
            return true;
        }
        return false;
    }
}
