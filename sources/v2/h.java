package v2;

import android.net.Uri;
import b2.p;
import b2.s;
import c3.b0;
import e2.d0;
import e6.n;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import l2.o;
import n4.x;
import org.telegram.ui.ActionBar.b5;
import u2.a1;
import u2.b1;
import u2.d1;
import u2.t;
public final class h implements b1, d1, y2.g, y2.j {
    public final b5 E;
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
    public final int f49105a;
    public final int[] f49106b;
    public final s[] f49107c;
    public final boolean[] d;
    public final l2.l f49108e;
    public final l2.b f49109f;
    public final a5.a h;
    public final rb.a f49110n;
    public final y2.l f49111r = new y2.l("ChunkSampleStream");
    public final p f49112s = new p(7);
    public final ArrayList v;
    public final List f49113w;
    public final a1 f49114x;
    public final a1[] f49115y;

    public h(int i10, int[] iArr, s[] sVarArr, l2.l lVar, l2.b bVar, y2.d dVar, long j3, n2.m mVar, n2.j jVar, rb.a aVar, a5.a aVar2, boolean z10) {
        this.f49105a = i10;
        this.f49106b = iArr;
        this.f49107c = sVarArr;
        this.f49108e = lVar;
        this.f49109f = bVar;
        this.h = aVar2;
        this.f49110n = aVar;
        this.M = z10;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.f49113w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f49115y = new a1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        a1[] a1VarArr = new a1[i11];
        mVar.getClass();
        a1 a1Var = new a1(dVar, mVar, jVar);
        this.f49114x = a1Var;
        int i12 = 0;
        iArr2[0] = i10;
        a1VarArr[0] = a1Var;
        while (i12 < length) {
            a1 a1Var2 = new a1(dVar, null, null);
            this.f49115y[i12] = a1Var2;
            int i13 = i12 + 1;
            a1VarArr[i13] = a1Var2;
            iArr2[i13] = this.f49106b[i12];
            i12 = i13;
        }
        this.E = new b5(17, iArr2, a1VarArr);
        this.I = j3;
        this.J = j3;
    }

    @Override
    public final void C(y2.i iVar, long j3, long j10, int i10) {
        t tVar;
        e eVar = (e) iVar;
        if (i10 == 0) {
            long j11 = eVar.f49094a;
            tVar = new t(eVar.f49095b);
        } else {
            long j12 = eVar.f49094a;
            Uri uri = eVar.f49100r.f10235c;
            tVar = new t(j10);
        }
        t tVar2 = tVar;
        this.h.u(tVar2, eVar.f49096c, this.f49105a, eVar.d, eVar.f49097e, eVar.f49098f, eVar.h, eVar.f49099n, i10);
    }

    @Override
    public final void F(y2.i iVar, long j3, long j10) {
        e eVar = (e) iVar;
        c3.j jVar = null;
        this.F = null;
        l2.l lVar = this.f49108e;
        l2.j[] jVarArr = lVar.f15365i;
        if (eVar instanceof j) {
            int s10 = lVar.f15366j.s(((j) eVar).d);
            l2.j jVar2 = jVarArr[s10];
            if (jVar2.d == null) {
                d dVar = jVar2.f15354a;
                e2.d.h(dVar);
                b0 b0Var = dVar.f49092n;
                if (b0Var instanceof c3.j) {
                    jVar = (c3.j) b0Var;
                }
                if (jVar != null) {
                    m2.m mVar = jVar2.f15355b;
                    jVarArr[s10] = new l2.j(jVar2.f15357e, mVar, jVar2.f15356c, jVar2.f15354a, jVar2.f15358f, new n(jVar, mVar.f15958c, 4));
                }
            }
        }
        o oVar = lVar.h;
        if (oVar != null) {
            long j11 = oVar.d;
            if (j11 == -9223372036854775807L || eVar.f49099n > j11) {
                oVar.d = eVar.f49099n;
            }
            oVar.f15382e.h = true;
        }
        long j12 = eVar.f49094a;
        Uri uri = eVar.f49100r.f10235c;
        t tVar = new t(j10);
        this.f49110n.getClass();
        this.h.q(tVar, eVar.f49096c, this.f49105a, eVar.d, eVar.f49097e, eVar.f49098f, eVar.h, eVar.f49099n);
        this.f49109f.D(this);
    }

    @Override
    public final void O0(y2.i iVar, long j3, long j10, boolean z10) {
        e eVar = (e) iVar;
        this.F = null;
        this.L = null;
        long j11 = eVar.f49094a;
        Uri uri = eVar.f49100r.f10235c;
        t tVar = new t(j10);
        this.f49110n.getClass();
        this.h.p(tVar, eVar.f49096c, this.f49105a, eVar.d, eVar.f49097e, eVar.f49098f, eVar.h, eVar.f49099n);
        if (!z10) {
            if (v()) {
                this.f49114x.D(false);
                for (a1 a1Var : this.f49115y) {
                    a1Var.D(false);
                }
            } else if (eVar instanceof a) {
                ArrayList arrayList = this.v;
                m(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
            }
            this.f49109f.D(this);
        }
    }

    @Override
    public final void a() {
        y2.l lVar = this.f49111r;
        lVar.a();
        this.f49114x.z();
        if (!lVar.d()) {
            l2.l lVar2 = this.f49108e;
            u2.b bVar = lVar2.f15369m;
            if (bVar == null) {
                lVar2.f15359a.a();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final void b() {
        a1[] a1VarArr;
        a1 a1Var = this.f49114x;
        a1Var.D(true);
        n2.g gVar = a1Var.h;
        if (gVar != null) {
            gVar.a(a1Var.f48570e);
            a1Var.h = null;
            a1Var.f48572g = null;
        }
        for (a1 a1Var2 : this.f49115y) {
            a1Var2.D(true);
            n2.g gVar2 = a1Var2.h;
            if (gVar2 != null) {
                gVar2.a(a1Var2.f48570e);
                a1Var2.h = null;
                a1Var2.f48572g = null;
            }
        }
        for (l2.j jVar : this.f49108e.f15365i) {
            d dVar = jVar.f15354a;
            if (dVar != null) {
                dVar.f49087a.release();
            }
        }
        g gVar3 = this.H;
        if (gVar3 != null) {
            l2.b bVar = (l2.b) gVar3;
            synchronized (bVar) {
                o oVar = (o) bVar.f15321y.remove(this);
                if (oVar != null) {
                    a1 a1Var3 = oVar.f15379a;
                    a1Var3.D(true);
                    n2.g gVar4 = a1Var3.h;
                    if (gVar4 != null) {
                        gVar4.a(a1Var3.f48570e);
                        a1Var3.h = null;
                        a1Var3.f48572g = null;
                    }
                }
            }
        }
    }

    @Override
    public final boolean c() {
        return this.f49111r.d();
    }

    @Override
    public final long d() {
        if (v()) {
            return this.I;
        }
        if (this.O) {
            return Long.MIN_VALUE;
        }
        return t().f49099n;
    }

    @Override
    public final boolean e() {
        if (!v() && this.f49114x.x(this.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(x xVar, h2.h hVar, int i10) {
        if (!v()) {
            a aVar = this.L;
            a1 a1Var = this.f49114x;
            if (aVar != null && aVar.d(0) <= a1Var.t()) {
                return -3;
            }
            w();
            return a1Var.C(xVar, hVar, i10, this.O);
        }
        return -3;
    }

    @Override
    public final int j(long j3) {
        if (v()) {
            return 0;
        }
        boolean z10 = this.O;
        a1 a1Var = this.f49114x;
        int v = a1Var.v(j3, z10);
        a aVar = this.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(0) - a1Var.t());
        }
        a1Var.H(v);
        w();
        return v;
    }

    public final a m(int i10) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i10);
        d0.U(i10, arrayList.size(), arrayList);
        this.K = Math.max(this.K, arrayList.size());
        int i11 = 0;
        this.f49114x.n(aVar.d(0));
        while (true) {
            a1[] a1VarArr = this.f49115y;
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
    public final boolean n(i2.s0 r57) {
        throw new UnsupportedOperationException("Method not decompiled: v2.h.n(i2.s0):boolean");
    }

    @Override
    public final long q() {
        if (this.O) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.I;
        }
        long j3 = this.J;
        a t10 = t();
        if (!t10.c()) {
            ArrayList arrayList = this.v;
            if (arrayList.size() > 1) {
                t10 = (a) hg.c.g(2, arrayList);
            } else {
                t10 = null;
            }
        }
        if (t10 != null) {
            j3 = Math.max(j3, t10.f49099n);
        }
        return Math.max(j3, this.f49114x.q());
    }

    @Override
    public final void s(long j3) {
        int size;
        y2.l lVar = this.f49111r;
        if (!lVar.c() && !v()) {
            boolean d = lVar.d();
            boolean z10 = false;
            List list = this.f49113w;
            l2.l lVar2 = this.f49108e;
            ArrayList arrayList = this.v;
            if (d) {
                e eVar = this.F;
                eVar.getClass();
                boolean z11 = eVar instanceof a;
                if (!z11 || !u(arrayList.size() - 1)) {
                    if (lVar2.f15369m == null) {
                        z10 = lVar2.f15366j.d(j3, eVar, list);
                    }
                    if (z10) {
                        lVar.b();
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
            if (lVar2.f15369m == null && lVar2.f15366j.length() >= 2) {
                size = lVar2.f15366j.i(j3, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                e2.d.g(!lVar.d());
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
                    long j10 = t().f49099n;
                    a m10 = m(size);
                    if (arrayList.isEmpty()) {
                        this.I = this.J;
                    }
                    this.O = false;
                    this.h.A(this.f49105a, m10.h, j10);
                }
            }
        }
    }

    public final a t() {
        return (a) hg.c.g(1, this.v);
    }

    public final boolean u(int i10) {
        int t10;
        a aVar = (a) this.v.get(i10);
        if (this.f49114x.t() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            a1[] a1VarArr = this.f49115y;
            if (i11 >= a1VarArr.length) {
                return false;
            }
            t10 = a1VarArr[i11].t();
            i11++;
        } while (t10 <= aVar.d(i11));
        return true;
    }

    public final boolean v() {
        if (this.I != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void w() {
        int x10 = x(this.f49114x.t(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 <= x10) {
                this.K = i10 + 1;
                a aVar = (a) this.v.get(i10);
                s sVar = aVar.d;
                if (!sVar.equals(this.G)) {
                    this.h.l(this.f49105a, sVar, aVar.f49097e, aVar.f49098f, aVar.h);
                }
                this.G = sVar;
            } else {
                return;
            }
        }
    }

    public final int x(int i10, int i11) {
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

    @Override
    public final k4.d y(y2.i r23, long r24, long r26, java.io.IOException r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: v2.h.y(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    public final void z(l2.b bVar) {
        a1[] a1VarArr;
        this.H = bVar;
        a1 a1Var = this.f49114x;
        a1Var.k();
        n2.g gVar = a1Var.h;
        if (gVar != null) {
            gVar.a(a1Var.f48570e);
            a1Var.h = null;
            a1Var.f48572g = null;
        }
        for (a1 a1Var2 : this.f49115y) {
            a1Var2.k();
            n2.g gVar2 = a1Var2.h;
            if (gVar2 != null) {
                gVar2.a(a1Var2.f48570e);
                a1Var2.h = null;
                a1Var2.f48572g = null;
            }
        }
        this.f49111r.e(this);
    }
}
