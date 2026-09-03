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
import o3.p;
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
    public final int f42768a;
    public final int[] f42769b;
    public final j3.n0[] f42770c;
    public final boolean[] d;
    public final r4.k e;
    public final r4.b f42771f;
    public final e0 h;
    public final z9.d f42772n;
    public final m0 f42773r = new m0("ChunkSampleStream");
    public final u f42774s = new u(6);
    public final ArrayList v;
    public final List f42775w;
    public final o4.k0 f42776x;
    public final o4.k0[] f42777y;

    public h(int i10, int[] iArr, j3.n0[] n0VarArr, r4.k kVar, r4.b bVar, q qVar, long j10, p pVar, o3.m mVar, z9.d dVar, e0 e0Var) {
        this.f42768a = i10;
        this.f42769b = iArr;
        this.f42770c = n0VarArr;
        this.e = kVar;
        this.f42771f = bVar;
        this.h = e0Var;
        this.f42772n = dVar;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.f42775w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f42777y = new o4.k0[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        o4.k0[] k0VarArr = new o4.k0[i11];
        pVar.getClass();
        o4.k0 k0Var = new o4.k0(qVar, pVar, mVar);
        this.f42776x = k0Var;
        int i12 = 0;
        iArr2[0] = i10;
        k0VarArr[0] = k0Var;
        while (i12 < length) {
            o4.k0 k0Var2 = new o4.k0(qVar, null, null);
            this.f42777y[i12] = k0Var2;
            int i13 = i12 + 1;
            k0VarArr[i13] = k0Var2;
            iArr2[i13] = this.f42769b[i12];
            i12 = i13;
        }
        this.B = new qa(iArr2, k0VarArr, false, 29);
        this.F = j10;
        this.G = j10;
    }

    @Override
    public final long H() {
        if (j()) {
            return this.F;
        }
        if (this.J) {
            return Long.MIN_VALUE;
        }
        return h().f42763n;
    }

    @Override
    public final c4.e X(g5.j0 r26, java.io.IOException r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: q4.h.X(g5.j0, java.io.IOException, int):c4.e");
    }

    @Override
    public final void a() {
        m0 m0Var = this.f42773r;
        m0Var.a();
        this.f42776x.w();
        if (!m0Var.d()) {
            r4.k kVar = this.e;
            o4.b bVar = kVar.f43337l;
            if (bVar == null) {
                kVar.f43329a.a();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final boolean b() {
        return this.f42773r.d();
    }

    @Override
    public final void c() {
        o4.k0[] k0VarArr;
        o4.k0 k0Var = this.f42776x;
        k0Var.A(true);
        o3.j jVar = k0Var.h;
        if (jVar != null) {
            jVar.c(k0Var.e);
            k0Var.h = null;
            k0Var.f16343g = null;
        }
        for (o4.k0 k0Var2 : this.f42777y) {
            k0Var2.A(true);
            o3.j jVar2 = k0Var2.h;
            if (jVar2 != null) {
                jVar2.c(k0Var2.e);
                k0Var2.h = null;
                k0Var2.f16343g = null;
            }
        }
        for (r4.i iVar : this.e.h) {
            d dVar = iVar.f43325a;
            if (dVar != null) {
                dVar.f42753a.release();
            }
        }
        g gVar = this.E;
        if (gVar != null) {
            r4.b bVar = (r4.b) gVar;
            synchronized (bVar) {
                n nVar = (n) bVar.f43297y.remove(this);
                if (nVar != null) {
                    o4.k0 k0Var3 = nVar.f43346a;
                    k0Var3.A(true);
                    o3.j jVar3 = k0Var3.h;
                    if (jVar3 != null) {
                        jVar3.c(k0Var3.e);
                        k0Var3.h = null;
                        k0Var3.f16343g = null;
                    }
                }
            }
        }
    }

    @Override
    public final boolean d() {
        if (!j() && this.f42776x.u(this.J)) {
            return true;
        }
        return false;
    }

    @Override
    public final int e(long j10) {
        if (j()) {
            return 0;
        }
        boolean z4 = this.J;
        o4.k0 k0Var = this.f42776x;
        int s6 = k0Var.s(j10, z4);
        a aVar = this.I;
        if (aVar != null) {
            s6 = Math.min(s6, aVar.e(0) - k0Var.q());
        }
        k0Var.E(s6);
        k();
        return s6;
    }

    @Override
    public final int f(f7.b bVar, n3.i iVar, int i10) {
        if (!j()) {
            a aVar = this.I;
            o4.k0 k0Var = this.f42776x;
            if (aVar != null && aVar.e(0) <= k0Var.q()) {
                return -3;
            }
            k();
            return k0Var.z(bVar, iVar, i10, this.J);
        }
        return -3;
    }

    public final a g(int i10) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i10);
        d0.L(i10, arrayList.size(), arrayList);
        this.H = Math.max(this.H, arrayList.size());
        int i11 = 0;
        this.f42776x.k(aVar.e(0));
        while (true) {
            o4.k0[] k0VarArr = this.f42777y;
            if (i11 < k0VarArr.length) {
                o4.k0 k0Var = k0VarArr[i11];
                i11++;
                k0Var.k(aVar.e(i11));
            } else {
                return aVar;
            }
        }
    }

    public final a h() {
        return (a) kf.k0.i(1, this.v);
    }

    public final boolean i(int i10) {
        int q10;
        a aVar = (a) this.v.get(i10);
        if (this.f42776x.q() > aVar.e(0)) {
            return true;
        }
        int i11 = 0;
        do {
            o4.k0[] k0VarArr = this.f42777y;
            if (i11 >= k0VarArr.length) {
                return false;
            }
            q10 = k0VarArr[i11].q();
            i11++;
        } while (q10 <= aVar.e(i11));
        return true;
    }

    public final boolean j() {
        if (this.F != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void k() {
        int l10 = l(this.f42776x.q(), this.H - 1);
        while (true) {
            int i10 = this.H;
            if (i10 <= l10) {
                this.H = i10 + 1;
                a aVar = (a) this.v.get(i10);
                j3.n0 n0Var = aVar.d;
                if (!n0Var.equals(this.D)) {
                    this.h.h(this.f42768a, n0Var, aVar.e, aVar.f42762f, aVar.h);
                }
                this.D = n0Var;
            } else {
                return;
            }
        }
    }

    @Override
    public final void k1(j0 j0Var, long j10, long j11) {
        e eVar = (e) j0Var;
        r3.f fVar = null;
        this.C = null;
        boolean z4 = eVar instanceof j;
        r4.k kVar = this.e;
        if (z4) {
            int n10 = kVar.f43334i.n(((j) eVar).d);
            r4.i[] iVarArr = kVar.h;
            r4.i iVar = iVarArr[n10];
            if (iVar.d == null) {
                d dVar = iVar.f43325a;
                s sVar = dVar.f42757n;
                if (sVar instanceof r3.f) {
                    fVar = (r3.f) sVar;
                }
                if (fVar != null) {
                    s4.m mVar = iVar.f43326b;
                    iVarArr[n10] = new r4.i(iVar.e, mVar, iVar.f43327c, dVar, iVar.f43328f, new f2.c(fVar, mVar.f44089c, 7));
                }
            }
        }
        n nVar = kVar.f43333g;
        if (nVar != null) {
            long j12 = nVar.d;
            if (j12 == -9223372036854775807L || eVar.f42763n > j12) {
                nVar.d = eVar.f42763n;
            }
            nVar.e.h = true;
        }
        long j13 = eVar.f42759a;
        Uri uri = eVar.f42764r.f6458c;
        ?? obj = new Object();
        this.f42772n.getClass();
        this.h.p(obj, eVar.f42761c, this.f42768a, eVar.d, eVar.e, eVar.f42762f, eVar.h, eVar.f42763n);
        this.f42771f.X1(this);
    }

    @Override
    public final void k2(long j10) {
        int size;
        m0 m0Var = this.f42773r;
        if (!m0Var.c() && !j()) {
            boolean d = m0Var.d();
            boolean z4 = false;
            List list = this.f42775w;
            r4.k kVar = this.e;
            ArrayList arrayList = this.v;
            if (d) {
                e eVar = this.C;
                eVar.getClass();
                boolean z10 = eVar instanceof a;
                if (!z10 || !i(arrayList.size() - 1)) {
                    if (kVar.f43337l == null) {
                        z4 = kVar.f43334i.u(j10, eVar, list);
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
            if (kVar.f43337l == null && kVar.f43334i.p() >= 2) {
                size = kVar.f43334i.c(j10, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                h5.a.i(!m0Var.d());
                int size2 = arrayList.size();
                while (true) {
                    if (size < size2) {
                        if (!i(size)) {
                            break;
                        }
                        size++;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (size != -1) {
                    long j11 = h().f42763n;
                    a g10 = g(size);
                    if (arrayList.isEmpty()) {
                        this.F = this.G;
                    }
                    this.J = false;
                    this.h.B(new r(1, this.f42768a, null, 3, null, d0.S(g10.h), d0.S(j11)));
                }
            }
        }
    }

    public final int l(int i10, int i11) {
        ArrayList arrayList;
        do {
            i11++;
            arrayList = this.v;
            if (i11 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i11)).e(0) <= i10);
        return i11 - 1;
    }

    public final void m(r4.b bVar) {
        o4.k0[] k0VarArr;
        this.E = bVar;
        o4.k0 k0Var = this.f42776x;
        k0Var.i();
        o3.j jVar = k0Var.h;
        if (jVar != null) {
            jVar.c(k0Var.e);
            k0Var.h = null;
            k0Var.f16343g = null;
        }
        for (o4.k0 k0Var2 : this.f42777y) {
            k0Var2.i();
            o3.j jVar2 = k0Var2.h;
            if (jVar2 != null) {
                jVar2.c(k0Var2.e);
                k0Var2.h = null;
                k0Var2.f16343g = null;
            }
        }
        this.f42773r.e(this);
    }

    @Override
    public final boolean n0(long r56) {
        throw new UnsupportedOperationException("Method not decompiled: q4.h.n0(long):boolean");
    }

    @Override
    public final void x0(j0 j0Var, long j10, long j11, boolean z4) {
        e eVar = (e) j0Var;
        this.C = null;
        this.I = null;
        long j12 = eVar.f42759a;
        Uri uri = eVar.f42764r.f6458c;
        ?? obj = new Object();
        this.f42772n.getClass();
        this.h.m(obj, eVar.f42761c, this.f42768a, eVar.d, eVar.e, eVar.f42762f, eVar.h, eVar.f42763n);
        if (!z4) {
            if (j()) {
                this.f42776x.A(false);
                for (o4.k0 k0Var : this.f42777y) {
                    k0Var.A(false);
                }
            } else if (eVar instanceof a) {
                ArrayList arrayList = this.v;
                g(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.F = this.G;
                }
            }
            this.f42771f.X1(this);
        }
    }

    @Override
    public final long y1() {
        if (this.J) {
            return Long.MIN_VALUE;
        }
        if (j()) {
            return this.F;
        }
        long j10 = this.G;
        a h = h();
        if (!h.d()) {
            ArrayList arrayList = this.v;
            if (arrayList.size() > 1) {
                h = (a) kf.k0.i(2, arrayList);
            } else {
                h = null;
            }
        }
        if (h != null) {
            j10 = Math.max(j10, h.f42763n);
        }
        return Math.max(j10, this.f42776x.n());
    }
}
