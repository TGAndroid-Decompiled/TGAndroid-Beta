package q4;

import android.net.Uri;
import b4.e0;
import c2.u;
import g5.h0;
import g5.j0;
import g5.k0;
import g5.m0;
import g5.q;
import h5.d0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import n7.qa;
import o3.o;
import o4.l0;
import o4.n0;
import o4.r;
import r3.s;
import r4.n;
public final class h implements l0, n0, h0, k0 {
    public final qa B;
    public e C;
    public j3.n0 D;
    public g E;
    public long F;
    public long G;
    public int H;
    public a I;
    public boolean J;
    public final int f44484a;
    public final int[] f44485b;
    public final j3.n0[] f44486c;
    public final boolean[] d;
    public final r4.k f44487e;
    public final r4.b f44488f;
    public final e0 h;
    public final ab.a f44489n;
    public final m0 f44490r = new m0("ChunkSampleStream");
    public final u f44491s = new u(6);
    public final ArrayList v;
    public final List f44492w;
    public final o4.k0 f44493x;
    public final o4.k0[] f44494y;

    public h(int i10, int[] iArr, j3.n0[] n0VarArr, r4.k kVar, r4.b bVar, q qVar, long j10, o oVar, o3.l lVar, ab.a aVar, e0 e0Var) {
        this.f44484a = i10;
        this.f44485b = iArr;
        this.f44486c = n0VarArr;
        this.f44487e = kVar;
        this.f44488f = bVar;
        this.h = e0Var;
        this.f44489n = aVar;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.f44492w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f44494y = new o4.k0[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        o4.k0[] k0VarArr = new o4.k0[i11];
        oVar.getClass();
        o4.k0 k0Var = new o4.k0(qVar, oVar, lVar);
        this.f44493x = k0Var;
        int i12 = 0;
        iArr2[0] = i10;
        k0VarArr[0] = k0Var;
        while (i12 < length) {
            o4.k0 k0Var2 = new o4.k0(qVar, null, null);
            this.f44494y[i12] = k0Var2;
            int i13 = i12 + 1;
            k0VarArr[i13] = k0Var2;
            iArr2[i13] = this.f44485b[i12];
            i12 = i13;
        }
        this.B = new qa(28, iArr2, k0VarArr);
        this.F = j10;
        this.G = j10;
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

    public final void B(r4.b bVar) {
        o4.k0[] k0VarArr;
        this.E = bVar;
        o4.k0 k0Var = this.f44493x;
        k0Var.i();
        o3.i iVar = k0Var.h;
        if (iVar != null) {
            iVar.c(k0Var.f16507e);
            k0Var.h = null;
            k0Var.f16509g = null;
        }
        for (o4.k0 k0Var2 : this.f44494y) {
            k0Var2.i();
            o3.i iVar2 = k0Var2.h;
            if (iVar2 != null) {
                iVar2.c(k0Var2.f16507e);
                k0Var2.h = null;
                k0Var2.f16509g = null;
            }
        }
        this.f44490r.e(this);
    }

    @Override
    public final void a() {
        m0 m0Var = this.f44490r;
        m0Var.a();
        this.f44493x.w();
        if (!m0Var.d()) {
            r4.k kVar = this.f44487e;
            o4.b bVar = kVar.f46656l;
            if (bVar == null) {
                kVar.f46647a.a();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final boolean b() {
        return this.f44490r.d();
    }

    @Override
    public final void c() {
        o4.k0[] k0VarArr;
        o4.k0 k0Var = this.f44493x;
        k0Var.A(true);
        o3.i iVar = k0Var.h;
        if (iVar != null) {
            iVar.c(k0Var.f16507e);
            k0Var.h = null;
            k0Var.f16509g = null;
        }
        for (o4.k0 k0Var2 : this.f44494y) {
            k0Var2.A(true);
            o3.i iVar2 = k0Var2.h;
            if (iVar2 != null) {
                iVar2.c(k0Var2.f16507e);
                k0Var2.h = null;
                k0Var2.f16509g = null;
            }
        }
        for (r4.i iVar3 : this.f44487e.h) {
            d dVar = iVar3.f46642a;
            if (dVar != null) {
                dVar.f44466a.release();
            }
        }
        g gVar = this.E;
        if (gVar != null) {
            r4.b bVar = (r4.b) gVar;
            synchronized (bVar) {
                n nVar = (n) bVar.f46613y.remove(this);
                if (nVar != null) {
                    o4.k0 k0Var3 = nVar.f46666a;
                    k0Var3.A(true);
                    o3.i iVar4 = k0Var3.h;
                    if (iVar4 != null) {
                        iVar4.c(k0Var3.f16507e);
                        k0Var3.h = null;
                        k0Var3.f16509g = null;
                    }
                }
            }
        }
    }

    @Override
    public final long e() {
        if (y()) {
            return this.F;
        }
        if (this.J) {
            return Long.MIN_VALUE;
        }
        return v().f44478n;
    }

    @Override
    public final boolean h() {
        if (!y() && this.f44493x.u(this.J)) {
            return true;
        }
        return false;
    }

    @Override
    public final int l(long j10) {
        if (y()) {
            return 0;
        }
        boolean z4 = this.J;
        o4.k0 k0Var = this.f44493x;
        int s6 = k0Var.s(j10, z4);
        a aVar = this.I;
        if (aVar != null) {
            s6 = Math.min(s6, aVar.d(0) - k0Var.q());
        }
        k0Var.E(s6);
        z();
        return s6;
    }

    @Override
    public final boolean m(long r56) {
        throw new UnsupportedOperationException("Method not decompiled: q4.h.m(long):boolean");
    }

    @Override
    public final int p(f7.b bVar, n3.i iVar, int i10) {
        if (!y()) {
            a aVar = this.I;
            o4.k0 k0Var = this.f44493x;
            if (aVar != null && aVar.d(0) <= k0Var.q()) {
                return -3;
            }
            z();
            return k0Var.z(bVar, iVar, i10, this.J);
        }
        return -3;
    }

    @Override
    public final c4.e q(g5.j0 r26, java.io.IOException r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: q4.h.q(g5.j0, java.io.IOException, int):c4.e");
    }

    @Override
    public final long r() {
        if (this.J) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.F;
        }
        long j10 = this.G;
        a v = v();
        if (!v.c()) {
            ArrayList arrayList = this.v;
            if (arrayList.size() > 1) {
                v = (a) l.d.i(2, arrayList);
            } else {
                v = null;
            }
        }
        if (v != null) {
            j10 = Math.max(j10, v.f44478n);
        }
        return Math.max(j10, this.f44493x.n());
    }

    public final a s(int i10) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i10);
        d0.L(i10, arrayList.size(), arrayList);
        this.H = Math.max(this.H, arrayList.size());
        int i11 = 0;
        this.f44493x.k(aVar.d(0));
        while (true) {
            o4.k0[] k0VarArr = this.f44494y;
            if (i11 < k0VarArr.length) {
                o4.k0 k0Var = k0VarArr[i11];
                i11++;
                k0Var.k(aVar.d(i11));
            } else {
                return aVar;
            }
        }
    }

    @Override
    public final void t(long j10) {
        int size;
        m0 m0Var = this.f44490r;
        if (!m0Var.c() && !y()) {
            boolean d = m0Var.d();
            boolean z4 = false;
            List list = this.f44492w;
            r4.k kVar = this.f44487e;
            ArrayList arrayList = this.v;
            if (d) {
                e eVar = this.C;
                eVar.getClass();
                boolean z10 = eVar instanceof a;
                if (!z10 || !w(arrayList.size() - 1)) {
                    if (kVar.f46656l == null) {
                        z4 = kVar.f46653i.u(j10, eVar, list);
                    }
                    if (z4) {
                        m0Var.b();
                        if (z10) {
                            this.I = (a) eVar;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (kVar.f46656l == null && kVar.f46653i.p() >= 2) {
                size = kVar.f46653i.c(j10, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                h5.a.i(!m0Var.d());
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
                    long j11 = v().f44478n;
                    a s6 = s(size);
                    if (arrayList.isEmpty()) {
                        this.F = this.G;
                    }
                    this.J = false;
                    this.h.B(new r(1, this.f44484a, null, 3, null, d0.S(s6.h), d0.S(j11)));
                }
            }
        }
    }

    @Override
    public final void u(j0 j0Var, long j10, long j11, boolean z4) {
        e eVar = (e) j0Var;
        this.C = null;
        this.I = null;
        long j12 = eVar.f44473a;
        Uri uri = eVar.f44479r.f6950c;
        ?? obj = new Object();
        this.f44489n.getClass();
        this.h.m(obj, eVar.f44475c, this.f44484a, eVar.d, eVar.f44476e, eVar.f44477f, eVar.h, eVar.f44478n);
        if (!z4) {
            if (y()) {
                this.f44493x.A(false);
                for (o4.k0 k0Var : this.f44494y) {
                    k0Var.A(false);
                }
            } else if (eVar instanceof a) {
                ArrayList arrayList = this.v;
                s(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.F = this.G;
                }
            }
            this.f44488f.s(this);
        }
    }

    public final a v() {
        return (a) l.d.i(1, this.v);
    }

    public final boolean w(int i10) {
        int q10;
        a aVar = (a) this.v.get(i10);
        if (this.f44493x.q() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            o4.k0[] k0VarArr = this.f44494y;
            if (i11 >= k0VarArr.length) {
                return false;
            }
            q10 = k0VarArr[i11].q();
            i11++;
        } while (q10 <= aVar.d(i11));
        return true;
    }

    @Override
    public final void x(j0 j0Var, long j10, long j11) {
        e eVar = (e) j0Var;
        r3.f fVar = null;
        this.C = null;
        boolean z4 = eVar instanceof j;
        r4.k kVar = this.f44487e;
        if (z4) {
            int n10 = kVar.f46653i.n(((j) eVar).d);
            r4.i[] iVarArr = kVar.h;
            r4.i iVar = iVarArr[n10];
            if (iVar.d == null) {
                d dVar = iVar.f46642a;
                s sVar = dVar.f44471n;
                if (sVar instanceof r3.f) {
                    fVar = (r3.f) sVar;
                }
                if (fVar != null) {
                    s4.m mVar = iVar.f46643b;
                    iVarArr[n10] = new r4.i(iVar.f46645e, mVar, iVar.f46644c, dVar, iVar.f46646f, new f2.c(fVar, mVar.f46990c, 7));
                }
            }
        }
        n nVar = kVar.f46652g;
        if (nVar != null) {
            long j12 = nVar.d;
            if (j12 == -9223372036854775807L || eVar.f44478n > j12) {
                nVar.d = eVar.f44478n;
            }
            nVar.f46669e.h = true;
        }
        long j13 = eVar.f44473a;
        Uri uri = eVar.f44479r.f6950c;
        ?? obj = new Object();
        this.f44489n.getClass();
        this.h.p(obj, eVar.f44475c, this.f44484a, eVar.d, eVar.f44476e, eVar.f44477f, eVar.h, eVar.f44478n);
        this.f44488f.s(this);
    }

    public final boolean y() {
        if (this.F != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void z() {
        int A = A(this.f44493x.q(), this.H - 1);
        while (true) {
            int i10 = this.H;
            if (i10 <= A) {
                this.H = i10 + 1;
                a aVar = (a) this.v.get(i10);
                j3.n0 n0Var = aVar.d;
                if (!n0Var.equals(this.D)) {
                    this.h.h(this.f44484a, n0Var, aVar.f44476e, aVar.f44477f, aVar.h);
                }
                this.D = n0Var;
            } else {
                return;
            }
        }
    }
}
