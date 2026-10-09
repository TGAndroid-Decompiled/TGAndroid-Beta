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
    public final int f49061a;
    public final int[] f49062b;
    public final s[] f49063c;
    public final boolean[] d;
    public final l2.l f49064e;
    public final l2.b f49065f;
    public final a5.a h;
    public final rb.a f49066n;
    public final y2.l f49067r = new y2.l("ChunkSampleStream");
    public final p f49068s = new p(7);
    public final ArrayList v;
    public final List f49069w;
    public final a1 f49070x;
    public final a1[] f49071y;

    public h(int i10, int[] iArr, s[] sVarArr, l2.l lVar, l2.b bVar, y2.d dVar, long j3, n2.m mVar, n2.j jVar, rb.a aVar, a5.a aVar2, boolean z10) {
        this.f49061a = i10;
        this.f49062b = iArr;
        this.f49063c = sVarArr;
        this.f49064e = lVar;
        this.f49065f = bVar;
        this.h = aVar2;
        this.f49066n = aVar;
        this.M = z10;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.f49069w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f49071y = new a1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        a1[] a1VarArr = new a1[i11];
        mVar.getClass();
        a1 a1Var = new a1(dVar, mVar, jVar);
        this.f49070x = a1Var;
        int i12 = 0;
        iArr2[0] = i10;
        a1VarArr[0] = a1Var;
        while (i12 < length) {
            a1 a1Var2 = new a1(dVar, null, null);
            this.f49071y[i12] = a1Var2;
            int i13 = i12 + 1;
            a1VarArr[i13] = a1Var2;
            iArr2[i13] = this.f49062b[i12];
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
            long j11 = eVar.f49050a;
            tVar = new t(eVar.f49051b);
        } else {
            long j12 = eVar.f49050a;
            Uri uri = eVar.f49056r.f10235c;
            tVar = new t(j10);
        }
        t tVar2 = tVar;
        this.h.u(tVar2, eVar.f49052c, this.f49061a, eVar.d, eVar.f49053e, eVar.f49054f, eVar.h, eVar.f49055n, i10);
    }

    @Override
    public final void F(y2.i iVar, long j3, long j10) {
        e eVar = (e) iVar;
        c3.j jVar = null;
        this.F = null;
        l2.l lVar = this.f49064e;
        l2.j[] jVarArr = lVar.f15361i;
        if (eVar instanceof j) {
            int s10 = lVar.f15362j.s(((j) eVar).d);
            l2.j jVar2 = jVarArr[s10];
            if (jVar2.d == null) {
                d dVar = jVar2.f15350a;
                e2.d.h(dVar);
                b0 b0Var = dVar.f49048n;
                if (b0Var instanceof c3.j) {
                    jVar = (c3.j) b0Var;
                }
                if (jVar != null) {
                    m2.m mVar = jVar2.f15351b;
                    jVarArr[s10] = new l2.j(jVar2.f15353e, mVar, jVar2.f15352c, jVar2.f15350a, jVar2.f15354f, new n(jVar, mVar.f15954c, 4));
                }
            }
        }
        o oVar = lVar.h;
        if (oVar != null) {
            long j11 = oVar.d;
            if (j11 == -9223372036854775807L || eVar.f49055n > j11) {
                oVar.d = eVar.f49055n;
            }
            oVar.f15378e.h = true;
        }
        long j12 = eVar.f49050a;
        Uri uri = eVar.f49056r.f10235c;
        t tVar = new t(j10);
        this.f49066n.getClass();
        this.h.q(tVar, eVar.f49052c, this.f49061a, eVar.d, eVar.f49053e, eVar.f49054f, eVar.h, eVar.f49055n);
        this.f49065f.D(this);
    }

    @Override
    public final void O0(y2.i iVar, long j3, long j10, boolean z10) {
        e eVar = (e) iVar;
        this.F = null;
        this.L = null;
        long j11 = eVar.f49050a;
        Uri uri = eVar.f49056r.f10235c;
        t tVar = new t(j10);
        this.f49066n.getClass();
        this.h.p(tVar, eVar.f49052c, this.f49061a, eVar.d, eVar.f49053e, eVar.f49054f, eVar.h, eVar.f49055n);
        if (!z10) {
            if (v()) {
                this.f49070x.D(false);
                for (a1 a1Var : this.f49071y) {
                    a1Var.D(false);
                }
            } else if (eVar instanceof a) {
                ArrayList arrayList = this.v;
                m(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
            }
            this.f49065f.D(this);
        }
    }

    @Override
    public final void a() {
        y2.l lVar = this.f49067r;
        lVar.a();
        this.f49070x.z();
        if (!lVar.d()) {
            l2.l lVar2 = this.f49064e;
            u2.b bVar = lVar2.f15365m;
            if (bVar == null) {
                lVar2.f15355a.a();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final void b() {
        a1[] a1VarArr;
        a1 a1Var = this.f49070x;
        a1Var.D(true);
        n2.g gVar = a1Var.h;
        if (gVar != null) {
            gVar.a(a1Var.f48526e);
            a1Var.h = null;
            a1Var.f48528g = null;
        }
        for (a1 a1Var2 : this.f49071y) {
            a1Var2.D(true);
            n2.g gVar2 = a1Var2.h;
            if (gVar2 != null) {
                gVar2.a(a1Var2.f48526e);
                a1Var2.h = null;
                a1Var2.f48528g = null;
            }
        }
        for (l2.j jVar : this.f49064e.f15361i) {
            d dVar = jVar.f15350a;
            if (dVar != null) {
                dVar.f49043a.release();
            }
        }
        g gVar3 = this.H;
        if (gVar3 != null) {
            l2.b bVar = (l2.b) gVar3;
            synchronized (bVar) {
                o oVar = (o) bVar.f15317y.remove(this);
                if (oVar != null) {
                    a1 a1Var3 = oVar.f15375a;
                    a1Var3.D(true);
                    n2.g gVar4 = a1Var3.h;
                    if (gVar4 != null) {
                        gVar4.a(a1Var3.f48526e);
                        a1Var3.h = null;
                        a1Var3.f48528g = null;
                    }
                }
            }
        }
    }

    @Override
    public final boolean c() {
        return this.f49067r.d();
    }

    @Override
    public final long d() {
        if (v()) {
            return this.I;
        }
        if (this.O) {
            return Long.MIN_VALUE;
        }
        return t().f49055n;
    }

    @Override
    public final boolean e() {
        if (!v() && this.f49070x.x(this.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(x xVar, h2.h hVar, int i10) {
        if (!v()) {
            a aVar = this.L;
            a1 a1Var = this.f49070x;
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
        a1 a1Var = this.f49070x;
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
        this.f49070x.n(aVar.d(0));
        while (true) {
            a1[] a1VarArr = this.f49071y;
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
            j3 = Math.max(j3, t10.f49055n);
        }
        return Math.max(j3, this.f49070x.q());
    }

    @Override
    public final void s(long j3) {
        int size;
        y2.l lVar = this.f49067r;
        if (!lVar.c() && !v()) {
            boolean d = lVar.d();
            boolean z10 = false;
            List list = this.f49069w;
            l2.l lVar2 = this.f49064e;
            ArrayList arrayList = this.v;
            if (d) {
                e eVar = this.F;
                eVar.getClass();
                boolean z11 = eVar instanceof a;
                if (!z11 || !u(arrayList.size() - 1)) {
                    if (lVar2.f15365m == null) {
                        z10 = lVar2.f15362j.d(j3, eVar, list);
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
            if (lVar2.f15365m == null && lVar2.f15362j.length() >= 2) {
                size = lVar2.f15362j.i(j3, list);
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
                    long j10 = t().f49055n;
                    a m10 = m(size);
                    if (arrayList.isEmpty()) {
                        this.I = this.J;
                    }
                    this.O = false;
                    this.h.A(this.f49061a, m10.h, j10);
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
        if (this.f49070x.t() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            a1[] a1VarArr = this.f49071y;
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
        int x10 = x(this.f49070x.t(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 <= x10) {
                this.K = i10 + 1;
                a aVar = (a) this.v.get(i10);
                s sVar = aVar.d;
                if (!sVar.equals(this.G)) {
                    this.h.l(this.f49061a, sVar, aVar.f49053e, aVar.f49054f, aVar.h);
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
        a1 a1Var = this.f49070x;
        a1Var.k();
        n2.g gVar = a1Var.h;
        if (gVar != null) {
            gVar.a(a1Var.f48526e);
            a1Var.h = null;
            a1Var.f48528g = null;
        }
        for (a1 a1Var2 : this.f49071y) {
            a1Var2.k();
            n2.g gVar2 = a1Var2.h;
            if (gVar2 != null) {
                gVar2.a(a1Var2.f48526e);
                a1Var2.h = null;
                a1Var2.f48528g = null;
            }
        }
        this.f49067r.e(this);
    }
}
