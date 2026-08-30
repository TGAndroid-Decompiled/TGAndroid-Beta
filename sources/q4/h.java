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
import kh.a2;
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
    public final int f42738a;
    public final int[] f42739b;
    public final j3.n0[] f42740c;
    public final boolean[] d;
    public final r4.k e;
    public final r4.b f42741f;
    public final e0 h;
    public final ab.a f42742n;
    public final m0 f42743r = new m0("ChunkSampleStream");
    public final u f42744s = new u(6);
    public final ArrayList v;
    public final List f42745w;
    public final o4.k0 f42746x;
    public final o4.k0[] f42747y;

    public h(int i10, int[] iArr, j3.n0[] n0VarArr, r4.k kVar, r4.b bVar, q qVar, long j10, o oVar, o3.l lVar, ab.a aVar, e0 e0Var) {
        this.f42738a = i10;
        this.f42739b = iArr;
        this.f42740c = n0VarArr;
        this.e = kVar;
        this.f42741f = bVar;
        this.h = e0Var;
        this.f42742n = aVar;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.f42745w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f42747y = new o4.k0[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        o4.k0[] k0VarArr = new o4.k0[i11];
        oVar.getClass();
        o4.k0 k0Var = new o4.k0(qVar, oVar, lVar);
        this.f42746x = k0Var;
        int i12 = 0;
        iArr2[0] = i10;
        k0VarArr[0] = k0Var;
        while (i12 < length) {
            o4.k0 k0Var2 = new o4.k0(qVar, null, null);
            this.f42747y[i12] = k0Var2;
            int i13 = i12 + 1;
            k0VarArr[i13] = k0Var2;
            iArr2[i13] = this.f42739b[i12];
            i12 = i13;
        }
        this.B = new qa(iArr2, k0VarArr, false, 28);
        this.F = j10;
        this.G = j10;
    }

    @Override
    public final void A(j0 j0Var, long j10, long j11) {
        e eVar = (e) j0Var;
        r3.f fVar = null;
        this.C = null;
        boolean z4 = eVar instanceof j;
        r4.k kVar = this.e;
        if (z4) {
            int n10 = kVar.f43310i.n(((j) eVar).d);
            r4.i[] iVarArr = kVar.h;
            r4.i iVar = iVarArr[n10];
            if (iVar.d == null) {
                d dVar = iVar.f43301a;
                s sVar = dVar.f42727n;
                if (sVar instanceof r3.f) {
                    fVar = (r3.f) sVar;
                }
                if (fVar != null) {
                    s4.m mVar = iVar.f43302b;
                    iVarArr[n10] = new r4.i(iVar.e, mVar, iVar.f43303c, dVar, iVar.f43304f, new f2.c(fVar, mVar.f44024c, 7));
                }
            }
        }
        n nVar = kVar.f43309g;
        if (nVar != null) {
            long j12 = nVar.d;
            if (j12 == -9223372036854775807L || eVar.f42733n > j12) {
                nVar.d = eVar.f42733n;
            }
            nVar.e.h = true;
        }
        long j13 = eVar.f42729a;
        Uri uri = eVar.f42734r.f6458c;
        ?? obj = new Object();
        this.f42742n.getClass();
        this.h.n(obj, eVar.f42731c, this.f42738a, eVar.d, eVar.e, eVar.f42732f, eVar.h, eVar.f42733n);
        this.f42741f.Z(this);
    }

    @Override
    public final boolean C(long r56) {
        throw new UnsupportedOperationException("Method not decompiled: q4.h.C(long):boolean");
    }

    @Override
    public final long X() {
        if (this.J) {
            return Long.MIN_VALUE;
        }
        if (k()) {
            return this.F;
        }
        long j10 = this.G;
        a i10 = i();
        if (!i10.c()) {
            ArrayList arrayList = this.v;
            if (arrayList.size() > 1) {
                i10 = (a) a2.i(2, arrayList);
            } else {
                i10 = null;
            }
        }
        if (i10 != null) {
            j10 = Math.max(j10, i10.f42733n);
        }
        return Math.max(j10, this.f42746x.n());
    }

    @Override
    public final void a() {
        m0 m0Var = this.f42743r;
        m0Var.a();
        this.f42746x.w();
        if (!m0Var.d()) {
            r4.k kVar = this.e;
            o4.b bVar = kVar.f43313l;
            if (bVar == null) {
                kVar.f43305a.a();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final boolean b() {
        return this.f42743r.d();
    }

    @Override
    public final void c() {
        o4.k0[] k0VarArr;
        o4.k0 k0Var = this.f42746x;
        k0Var.A(true);
        o3.i iVar = k0Var.h;
        if (iVar != null) {
            iVar.c(k0Var.e);
            k0Var.h = null;
            k0Var.f16361g = null;
        }
        for (o4.k0 k0Var2 : this.f42747y) {
            k0Var2.A(true);
            o3.i iVar2 = k0Var2.h;
            if (iVar2 != null) {
                iVar2.c(k0Var2.e);
                k0Var2.h = null;
                k0Var2.f16361g = null;
            }
        }
        for (r4.i iVar3 : this.e.h) {
            d dVar = iVar3.f43301a;
            if (dVar != null) {
                dVar.f42723a.release();
            }
        }
        g gVar = this.E;
        if (gVar != null) {
            r4.b bVar = (r4.b) gVar;
            synchronized (bVar) {
                n nVar = (n) bVar.f43273y.remove(this);
                if (nVar != null) {
                    o4.k0 k0Var3 = nVar.f43322a;
                    k0Var3.A(true);
                    o3.i iVar4 = k0Var3.h;
                    if (iVar4 != null) {
                        iVar4.c(k0Var3.e);
                        k0Var3.h = null;
                        k0Var3.f16361g = null;
                    }
                }
            }
        }
    }

    @Override
    public final boolean d() {
        if (!k() && this.f42746x.u(this.J)) {
            return true;
        }
        return false;
    }

    @Override
    public final int e(long j10) {
        if (k()) {
            return 0;
        }
        boolean z4 = this.J;
        o4.k0 k0Var = this.f42746x;
        int s6 = k0Var.s(j10, z4);
        a aVar = this.I;
        if (aVar != null) {
            s6 = Math.min(s6, aVar.d(0) - k0Var.q());
        }
        k0Var.E(s6);
        n();
        return s6;
    }

    @Override
    public final int f(f7.b bVar, n3.i iVar, int i10) {
        if (!k()) {
            a aVar = this.I;
            o4.k0 k0Var = this.f42746x;
            if (aVar != null && aVar.d(0) <= k0Var.q()) {
                return -3;
            }
            n();
            return k0Var.z(bVar, iVar, i10, this.J);
        }
        return -3;
    }

    @Override
    public final void f0(long j10) {
        int size;
        m0 m0Var = this.f42743r;
        if (!m0Var.c() && !k()) {
            boolean d = m0Var.d();
            boolean z4 = false;
            List list = this.f42745w;
            r4.k kVar = this.e;
            ArrayList arrayList = this.v;
            if (d) {
                e eVar = this.C;
                eVar.getClass();
                boolean z10 = eVar instanceof a;
                if (!z10 || !j(arrayList.size() - 1)) {
                    if (kVar.f43313l == null) {
                        z4 = kVar.f43310i.u(j10, eVar, list);
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
            if (kVar.f43313l == null && kVar.f43310i.p() >= 2) {
                size = kVar.f43310i.c(j10, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                h5.a.i(!m0Var.d());
                int size2 = arrayList.size();
                while (true) {
                    if (size < size2) {
                        if (!j(size)) {
                            break;
                        }
                        size++;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (size != -1) {
                    long j11 = i().f42733n;
                    a g10 = g(size);
                    if (arrayList.isEmpty()) {
                        this.F = this.G;
                    }
                    this.J = false;
                    this.h.A(new r(1, this.f42738a, null, 3, null, d0.S(g10.h), d0.S(j11)));
                }
            }
        }
    }

    public final a g(int i10) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i10);
        d0.L(i10, arrayList.size(), arrayList);
        this.H = Math.max(this.H, arrayList.size());
        int i11 = 0;
        this.f42746x.k(aVar.d(0));
        while (true) {
            o4.k0[] k0VarArr = this.f42747y;
            if (i11 < k0VarArr.length) {
                o4.k0 k0Var = k0VarArr[i11];
                i11++;
                k0Var.k(aVar.d(i11));
            } else {
                return aVar;
            }
        }
    }

    public final a i() {
        return (a) a2.i(1, this.v);
    }

    public final boolean j(int i10) {
        int q10;
        a aVar = (a) this.v.get(i10);
        if (this.f42746x.q() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            o4.k0[] k0VarArr = this.f42747y;
            if (i11 >= k0VarArr.length) {
                return false;
            }
            q10 = k0VarArr[i11].q();
            i11++;
        } while (q10 <= aVar.d(i11));
        return true;
    }

    public final boolean k() {
        if (this.F != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final long l() {
        if (k()) {
            return this.F;
        }
        if (this.J) {
            return Long.MIN_VALUE;
        }
        return i().f42733n;
    }

    @Override
    public final c4.e m(g5.j0 r26, java.io.IOException r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: q4.h.m(g5.j0, java.io.IOException, int):c4.e");
    }

    public final void n() {
        int o10 = o(this.f42746x.q(), this.H - 1);
        while (true) {
            int i10 = this.H;
            if (i10 <= o10) {
                this.H = i10 + 1;
                a aVar = (a) this.v.get(i10);
                j3.n0 n0Var = aVar.d;
                if (!n0Var.equals(this.D)) {
                    this.h.g(this.f42738a, n0Var, aVar.e, aVar.f42732f, aVar.h);
                }
                this.D = n0Var;
            } else {
                return;
            }
        }
    }

    public final int o(int i10, int i11) {
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

    public final void q(r4.b bVar) {
        o4.k0[] k0VarArr;
        this.E = bVar;
        o4.k0 k0Var = this.f42746x;
        k0Var.i();
        o3.i iVar = k0Var.h;
        if (iVar != null) {
            iVar.c(k0Var.e);
            k0Var.h = null;
            k0Var.f16361g = null;
        }
        for (o4.k0 k0Var2 : this.f42747y) {
            k0Var2.i();
            o3.i iVar2 = k0Var2.h;
            if (iVar2 != null) {
                iVar2.c(k0Var2.e);
                k0Var2.h = null;
                k0Var2.f16361g = null;
            }
        }
        this.f42743r.e(this);
    }

    @Override
    public final void s(j0 j0Var, long j10, long j11, boolean z4) {
        e eVar = (e) j0Var;
        this.C = null;
        this.I = null;
        long j12 = eVar.f42729a;
        Uri uri = eVar.f42734r.f6458c;
        ?? obj = new Object();
        this.f42742n.getClass();
        this.h.l(obj, eVar.f42731c, this.f42738a, eVar.d, eVar.e, eVar.f42732f, eVar.h, eVar.f42733n);
        if (!z4) {
            if (k()) {
                this.f42746x.A(false);
                for (o4.k0 k0Var : this.f42747y) {
                    k0Var.A(false);
                }
            } else if (eVar instanceof a) {
                ArrayList arrayList = this.v;
                g(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.F = this.G;
                }
            }
            this.f42741f.Z(this);
        }
    }
}
