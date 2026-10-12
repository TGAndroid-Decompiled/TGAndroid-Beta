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
import n4.y;
import n7.z0;
import t7.t;
import u2.a1;
import u2.c1;
public final class h implements a1, c1, y2.g, y2.j {
    public final z0 E;
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
    public final int f49289a;
    public final int[] f49290b;
    public final s[] f49291c;
    public final boolean[] d;
    public final l2.l f49292e;
    public final l2.b f49293f;
    public final a5.a h;
    public final t f49294n;
    public final y2.l f49295r = new y2.l("ChunkSampleStream");
    public final p f49296s = new p(7);
    public final ArrayList v;
    public final List f49297w;
    public final u2.z0 f49298x;
    public final u2.z0[] f49299y;

    public h(int i10, int[] iArr, s[] sVarArr, l2.l lVar, l2.b bVar, y2.d dVar, long j3, n2.m mVar, n2.j jVar, t tVar, a5.a aVar, boolean z10) {
        this.f49289a = i10;
        this.f49290b = iArr;
        this.f49291c = sVarArr;
        this.f49292e = lVar;
        this.f49293f = bVar;
        this.h = aVar;
        this.f49294n = tVar;
        this.M = z10;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.f49297w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f49299y = new u2.z0[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        u2.z0[] z0VarArr = new u2.z0[i11];
        mVar.getClass();
        u2.z0 z0Var = new u2.z0(dVar, mVar, jVar);
        this.f49298x = z0Var;
        int i12 = 0;
        iArr2[0] = i10;
        z0VarArr[0] = z0Var;
        while (i12 < length) {
            u2.z0 z0Var2 = new u2.z0(dVar, null, null);
            this.f49299y[i12] = z0Var2;
            int i13 = i12 + 1;
            z0VarArr[i13] = z0Var2;
            iArr2[i13] = this.f49290b[i12];
            i12 = i13;
        }
        this.E = new z0(18, iArr2, z0VarArr);
        this.I = j3;
        this.J = j3;
    }

    public final void A(l2.b bVar) {
        u2.z0[] z0VarArr;
        this.H = bVar;
        u2.z0 z0Var = this.f49298x;
        z0Var.k();
        n2.g gVar = z0Var.h;
        if (gVar != null) {
            gVar.a(z0Var.f48974e);
            z0Var.h = null;
            z0Var.f48976g = null;
        }
        for (u2.z0 z0Var2 : this.f49299y) {
            z0Var2.k();
            n2.g gVar2 = z0Var2.h;
            if (gVar2 != null) {
                gVar2.a(z0Var2.f48974e);
                z0Var2.h = null;
                z0Var2.f48976g = null;
            }
        }
        this.f49295r.e(this);
    }

    @Override
    public final void C(y2.i iVar, long j3, long j10) {
        e eVar = (e) iVar;
        c3.j jVar = null;
        this.F = null;
        l2.l lVar = this.f49292e;
        l2.j[] jVarArr = lVar.f15109i;
        if (eVar instanceof j) {
            int s10 = lVar.f15110j.s(((j) eVar).d);
            l2.j jVar2 = jVarArr[s10];
            if (jVar2.d == null) {
                d dVar = jVar2.f15098a;
                e2.d.h(dVar);
                b0 b0Var = dVar.f49276n;
                if (b0Var instanceof c3.j) {
                    jVar = (c3.j) b0Var;
                }
                if (jVar != null) {
                    m2.m mVar = jVar2.f15099b;
                    jVarArr[s10] = new l2.j(jVar2.f15101e, mVar, jVar2.f15100c, jVar2.f15098a, jVar2.f15102f, new n(jVar, mVar.f15703c, 4));
                }
            }
        }
        o oVar = lVar.h;
        if (oVar != null) {
            long j11 = oVar.d;
            if (j11 == -9223372036854775807L || eVar.f49283n > j11) {
                oVar.d = eVar.f49283n;
            }
            oVar.f15126e.h = true;
        }
        long j12 = eVar.f49278a;
        Uri uri = eVar.f49284r.f10233c;
        u2.t tVar = new u2.t(j10);
        this.f49294n.getClass();
        this.h.q(tVar, eVar.f49280c, this.f49289a, eVar.d, eVar.f49281e, eVar.f49282f, eVar.h, eVar.f49283n);
        this.f49293f.b(this);
    }

    @Override
    public final void H(y2.i iVar, long j3, long j10, boolean z10) {
        e eVar = (e) iVar;
        this.F = null;
        this.L = null;
        long j11 = eVar.f49278a;
        Uri uri = eVar.f49284r.f10233c;
        u2.t tVar = new u2.t(j10);
        this.f49294n.getClass();
        this.h.p(tVar, eVar.f49280c, this.f49289a, eVar.d, eVar.f49281e, eVar.f49282f, eVar.h, eVar.f49283n);
        if (!z10) {
            if (v()) {
                this.f49298x.D(false);
                for (u2.z0 z0Var : this.f49299y) {
                    z0Var.D(false);
                }
            } else if (eVar instanceof a) {
                ArrayList arrayList = this.v;
                s(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
            }
            this.f49293f.b(this);
        }
    }

    @Override
    public final void a() {
        y2.l lVar = this.f49295r;
        lVar.a();
        this.f49298x.z();
        if (!lVar.d()) {
            l2.l lVar2 = this.f49292e;
            u2.b bVar = lVar2.f15113m;
            if (bVar == null) {
                lVar2.f15103a.a();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final void b() {
        u2.z0[] z0VarArr;
        u2.z0 z0Var = this.f49298x;
        z0Var.D(true);
        n2.g gVar = z0Var.h;
        if (gVar != null) {
            gVar.a(z0Var.f48974e);
            z0Var.h = null;
            z0Var.f48976g = null;
        }
        for (u2.z0 z0Var2 : this.f49299y) {
            z0Var2.D(true);
            n2.g gVar2 = z0Var2.h;
            if (gVar2 != null) {
                gVar2.a(z0Var2.f48974e);
                z0Var2.h = null;
                z0Var2.f48976g = null;
            }
        }
        for (l2.j jVar : this.f49292e.f15109i) {
            d dVar = jVar.f15098a;
            if (dVar != null) {
                dVar.f49271a.release();
            }
        }
        g gVar3 = this.H;
        if (gVar3 != null) {
            l2.b bVar = (l2.b) gVar3;
            synchronized (bVar) {
                o oVar = (o) bVar.f15065y.remove(this);
                if (oVar != null) {
                    u2.z0 z0Var3 = oVar.f15123a;
                    z0Var3.D(true);
                    n2.g gVar4 = z0Var3.h;
                    if (gVar4 != null) {
                        gVar4.a(z0Var3.f48974e);
                        z0Var3.h = null;
                        z0Var3.f48976g = null;
                    }
                }
            }
        }
    }

    @Override
    public final boolean c() {
        return this.f49295r.d();
    }

    @Override
    public final long d() {
        if (v()) {
            return this.I;
        }
        if (this.O) {
            return Long.MIN_VALUE;
        }
        return t().f49283n;
    }

    @Override
    public final boolean e() {
        if (!v() && this.f49298x.x(this.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(y yVar, h2.h hVar, int i10) {
        if (!v()) {
            a aVar = this.L;
            u2.z0 z0Var = this.f49298x;
            if (aVar != null && aVar.d(0) <= z0Var.t()) {
                return -3;
            }
            w();
            return z0Var.C(yVar, hVar, i10, this.O);
        }
        return -3;
    }

    @Override
    public final int j(long j3) {
        if (v()) {
            return 0;
        }
        boolean z10 = this.O;
        u2.z0 z0Var = this.f49298x;
        int v = z0Var.v(j3, z10);
        a aVar = this.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(0) - z0Var.t());
        }
        z0Var.H(v);
        w();
        return v;
    }

    @Override
    public final boolean m(i2.s0 r57) {
        throw new UnsupportedOperationException("Method not decompiled: v2.h.m(i2.s0):boolean");
    }

    @Override
    public final long p() {
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
                t10 = (a) hg.c.h(2, arrayList);
            } else {
                t10 = null;
            }
        }
        if (t10 != null) {
            j3 = Math.max(j3, t10.f49283n);
        }
        return Math.max(j3, this.f49298x.q());
    }

    @Override
    public final void r(long j3) {
        int size;
        y2.l lVar = this.f49295r;
        if (!lVar.c() && !v()) {
            boolean d = lVar.d();
            boolean z10 = false;
            List list = this.f49297w;
            l2.l lVar2 = this.f49292e;
            ArrayList arrayList = this.v;
            if (d) {
                e eVar = this.F;
                eVar.getClass();
                boolean z11 = eVar instanceof a;
                if (!z11 || !u(arrayList.size() - 1)) {
                    if (lVar2.f15113m == null) {
                        z10 = lVar2.f15110j.d(j3, eVar, list);
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
            if (lVar2.f15113m == null && lVar2.f15110j.length() >= 2) {
                size = lVar2.f15110j.i(j3, list);
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
                    long j10 = t().f49283n;
                    a s10 = s(size);
                    if (arrayList.isEmpty()) {
                        this.I = this.J;
                    }
                    this.O = false;
                    this.h.A(this.f49289a, s10.h, j10);
                }
            }
        }
    }

    public final a s(int i10) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i10);
        d0.U(i10, arrayList.size(), arrayList);
        this.K = Math.max(this.K, arrayList.size());
        int i11 = 0;
        this.f49298x.n(aVar.d(0));
        while (true) {
            u2.z0[] z0VarArr = this.f49299y;
            if (i11 < z0VarArr.length) {
                u2.z0 z0Var = z0VarArr[i11];
                i11++;
                z0Var.n(aVar.d(i11));
            } else {
                return aVar;
            }
        }
    }

    public final a t() {
        return (a) hg.c.h(1, this.v);
    }

    public final boolean u(int i10) {
        int t10;
        a aVar = (a) this.v.get(i10);
        if (this.f49298x.t() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            u2.z0[] z0VarArr = this.f49299y;
            if (i11 >= z0VarArr.length) {
                return false;
            }
            t10 = z0VarArr[i11].t();
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
        int z10 = z(this.f49298x.t(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 <= z10) {
                this.K = i10 + 1;
                a aVar = (a) this.v.get(i10);
                s sVar = aVar.d;
                if (!sVar.equals(this.G)) {
                    this.h.l(this.f49289a, sVar, aVar.f49281e, aVar.f49282f, aVar.h);
                }
                this.G = sVar;
            } else {
                return;
            }
        }
    }

    @Override
    public final k4.d x(y2.i r23, long r24, long r26, java.io.IOException r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: v2.h.x(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void y(y2.i iVar, long j3, long j10, int i10) {
        u2.t tVar;
        e eVar = (e) iVar;
        if (i10 == 0) {
            long j11 = eVar.f49278a;
            tVar = new u2.t(eVar.f49279b);
        } else {
            long j12 = eVar.f49278a;
            Uri uri = eVar.f49284r.f10233c;
            tVar = new u2.t(j10);
        }
        u2.t tVar2 = tVar;
        this.h.u(tVar2, eVar.f49280c, this.f49289a, eVar.d, eVar.f49281e, eVar.f49282f, eVar.h, eVar.f49283n, i10);
    }

    public final int z(int i10, int i11) {
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
}
