package v2;

import android.net.Uri;
import b2.p;
import b2.s;
import c3.b0;
import e2.d0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import n7.a1;
import u2.c1;
import u2.d1;
import u2.f1;
import u2.u;
import y2.n;
public final class h implements d1, f1, y2.i, y2.l {
    public final a1 E;
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
    public final int f42871a;
    public final int[] f42872b;
    public final s[] f42873c;
    public final boolean[] d;
    public final l2.m e;
    public final l2.b f42874f;
    public final a5.a h;
    public final rb.a f42875n;
    public final n f42876r = new n("ChunkSampleStream");
    public final p f42877s = new p(7);
    public final ArrayList v;
    public final List f42878w;
    public final c1 f42879x;
    public final c1[] f42880y;

    public h(int i10, int[] iArr, s[] sVarArr, l2.m mVar, l2.b bVar, y2.d dVar, long j3, n2.n nVar, n2.j jVar, rb.a aVar, a5.a aVar2, boolean z10) {
        this.f42871a = i10;
        this.f42872b = iArr;
        this.f42873c = sVarArr;
        this.e = mVar;
        this.f42874f = bVar;
        this.h = aVar2;
        this.f42875n = aVar;
        this.M = z10;
        ArrayList arrayList = new ArrayList();
        this.v = arrayList;
        this.f42878w = DesugarCollections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f42880y = new c1[length];
        this.d = new boolean[length];
        int i11 = length + 1;
        int[] iArr2 = new int[i11];
        c1[] c1VarArr = new c1[i11];
        nVar.getClass();
        c1 c1Var = new c1(dVar, nVar, jVar);
        this.f42879x = c1Var;
        int i12 = 0;
        iArr2[0] = i10;
        c1VarArr[0] = c1Var;
        while (i12 < length) {
            c1 c1Var2 = new c1(dVar, null, null);
            this.f42880y[i12] = c1Var2;
            int i13 = i12 + 1;
            c1VarArr[i13] = c1Var2;
            iArr2[i13] = this.f42872b[i12];
            i12 = i13;
        }
        this.E = new a1(20, iArr2, c1VarArr);
        this.I = j3;
        this.J = j3;
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

    public final void B(l2.b bVar) {
        c1[] c1VarArr;
        this.H = bVar;
        c1 c1Var = this.f42879x;
        c1Var.k();
        n2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.a(c1Var.e);
            c1Var.h = null;
            c1Var.f42291g = null;
        }
        for (c1 c1Var2 : this.f42880y) {
            c1Var2.k();
            n2.g gVar2 = c1Var2.h;
            if (gVar2 != null) {
                gVar2.a(c1Var2.e);
                c1Var2.h = null;
                c1Var2.f42291g = null;
            }
        }
        this.f42876r.e(this);
    }

    @Override
    public final void C(y2.k kVar, long j3, long j10, boolean z10) {
        e eVar = (e) kVar;
        this.F = null;
        this.L = null;
        long j11 = eVar.f42862a;
        Uri uri = eVar.f42867r.f8480c;
        u uVar = new u(j10);
        this.f42875n.getClass();
        this.h.m(uVar, eVar.f42864c, this.f42871a, eVar.d, eVar.e, eVar.f42865f, eVar.h, eVar.f42866n);
        if (!z10) {
            if (y()) {
                this.f42879x.D(false);
                for (c1 c1Var : this.f42880y) {
                    c1Var.D(false);
                }
            } else if (eVar instanceof a) {
                ArrayList arrayList = this.v;
                v(arrayList.size() - 1);
                if (arrayList.isEmpty()) {
                    this.I = this.J;
                }
            }
            this.f42874f.g(this);
        }
    }

    @Override
    public final void a() {
        n nVar = this.f42876r;
        nVar.a();
        this.f42879x.z();
        if (!nVar.d()) {
            l2.m mVar = this.e;
            u2.b bVar = mVar.f12752m;
            if (bVar == null) {
                mVar.f12743a.a();
                return;
            }
            throw bVar;
        }
    }

    @Override
    public final void b() {
        c1[] c1VarArr;
        c1 c1Var = this.f42879x;
        c1Var.D(true);
        n2.g gVar = c1Var.h;
        if (gVar != null) {
            gVar.a(c1Var.e);
            c1Var.h = null;
            c1Var.f42291g = null;
        }
        for (c1 c1Var2 : this.f42880y) {
            c1Var2.D(true);
            n2.g gVar2 = c1Var2.h;
            if (gVar2 != null) {
                gVar2.a(c1Var2.e);
                c1Var2.h = null;
                c1Var2.f42291g = null;
            }
        }
        for (l2.k kVar : this.e.f12748i) {
            d dVar = kVar.f12739a;
            if (dVar != null) {
                dVar.f42856a.release();
            }
        }
        g gVar3 = this.H;
        if (gVar3 != null) {
            l2.b bVar = (l2.b) gVar3;
            synchronized (bVar) {
                l2.p pVar = (l2.p) bVar.f12705y.remove(this);
                if (pVar != null) {
                    c1 c1Var3 = pVar.f12761a;
                    c1Var3.D(true);
                    n2.g gVar4 = c1Var3.h;
                    if (gVar4 != null) {
                        gVar4.a(c1Var3.e);
                        c1Var3.h = null;
                        c1Var3.f42291g = null;
                    }
                }
            }
        }
    }

    @Override
    public final boolean c() {
        return this.f42876r.d();
    }

    @Override
    public final long d() {
        if (y()) {
            return this.I;
        }
        if (this.O) {
            return Long.MIN_VALUE;
        }
        return w().f42866n;
    }

    @Override
    public final boolean e() {
        if (!y() && this.f42879x.x(this.O)) {
            return true;
        }
        return false;
    }

    @Override
    public final int g(long j3) {
        if (y()) {
            return 0;
        }
        boolean z10 = this.O;
        c1 c1Var = this.f42879x;
        int v = c1Var.v(j3, z10);
        a aVar = this.L;
        if (aVar != null) {
            v = Math.min(v, aVar.d(0) - c1Var.t());
        }
        c1Var.H(v);
        z();
        return v;
    }

    @Override
    public final k4.d k(y2.k r23, long r24, long r26, java.io.IOException r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: v2.h.k(y2.k, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void l(y2.k kVar, long j3, long j10, int i10) {
        u uVar;
        e eVar = (e) kVar;
        if (i10 == 0) {
            long j11 = eVar.f42862a;
            uVar = new u(eVar.f42863b);
        } else {
            long j12 = eVar.f42862a;
            Uri uri = eVar.f42867r.f8480c;
            uVar = new u(j10);
        }
        u uVar2 = uVar;
        this.h.r(uVar2, eVar.f42864c, this.f42871a, eVar.d, eVar.e, eVar.f42865f, eVar.h, eVar.f42866n, i10);
    }

    @Override
    public final boolean n(i2.q0 r57) {
        throw new UnsupportedOperationException("Method not decompiled: v2.h.n(i2.q0):boolean");
    }

    @Override
    public final void p(y2.k kVar, long j3, long j10) {
        e eVar = (e) kVar;
        c3.j jVar = null;
        this.F = null;
        l2.m mVar = this.e;
        l2.k[] kVarArr = mVar.f12748i;
        if (eVar instanceof j) {
            int s10 = mVar.f12749j.s(((j) eVar).d);
            l2.k kVar2 = kVarArr[s10];
            if (kVar2.d == null) {
                d dVar = kVar2.f12739a;
                e2.d.h(dVar);
                b0 b0Var = dVar.f42860n;
                if (b0Var instanceof c3.j) {
                    jVar = (c3.j) b0Var;
                }
                if (jVar != null) {
                    m2.m mVar2 = kVar2.f12740b;
                    kVarArr[s10] = new l2.k(kVar2.e, mVar2, kVar2.f12741c, kVar2.f12739a, kVar2.f12742f, new e6.n(jVar, mVar2.f13270c, 4));
                }
            }
        }
        l2.p pVar = mVar.h;
        if (pVar != null) {
            long j11 = pVar.d;
            if (j11 == -9223372036854775807L || eVar.f42866n > j11) {
                pVar.d = eVar.f42866n;
            }
            pVar.e.h = true;
        }
        long j12 = eVar.f42862a;
        Uri uri = eVar.f42867r.f8480c;
        u uVar = new u(j10);
        this.f42875n.getClass();
        this.h.o(uVar, eVar.f42864c, this.f42871a, eVar.d, eVar.e, eVar.f42865f, eVar.h, eVar.f42866n);
        this.f42874f.g(this);
    }

    @Override
    public final long r() {
        if (this.O) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.I;
        }
        long j3 = this.J;
        a w10 = w();
        if (!w10.c()) {
            ArrayList arrayList = this.v;
            if (arrayList.size() > 1) {
                w10 = (a) hc.b.i(2, arrayList);
            } else {
                w10 = null;
            }
        }
        if (w10 != null) {
            j3 = Math.max(j3, w10.f42866n);
        }
        return Math.max(j3, this.f42879x.q());
    }

    @Override
    public final int t(of.b bVar, h2.h hVar, int i10) {
        if (!y()) {
            a aVar = this.L;
            c1 c1Var = this.f42879x;
            if (aVar != null && aVar.d(0) <= c1Var.t()) {
                return -3;
            }
            z();
            return c1Var.C(bVar, hVar, i10, this.O);
        }
        return -3;
    }

    @Override
    public final void u(long j3) {
        int size;
        n nVar = this.f42876r;
        if (!nVar.c() && !y()) {
            boolean d = nVar.d();
            boolean z10 = false;
            List list = this.f42878w;
            l2.m mVar = this.e;
            ArrayList arrayList = this.v;
            if (d) {
                e eVar = this.F;
                eVar.getClass();
                boolean z11 = eVar instanceof a;
                if (!z11 || !x(arrayList.size() - 1)) {
                    if (mVar.f12752m == null) {
                        z10 = mVar.f12749j.d(j3, eVar, list);
                    }
                    if (z10) {
                        nVar.b();
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
            if (mVar.f12752m == null && mVar.f12749j.length() >= 2) {
                size = mVar.f12749j.i(j3, list);
            } else {
                size = list.size();
            }
            if (size < arrayList.size()) {
                e2.d.g(!nVar.d());
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
                    long j10 = w().f42866n;
                    a v = v(size);
                    if (arrayList.isEmpty()) {
                        this.I = this.J;
                    }
                    this.O = false;
                    this.h.x(this.f42871a, v.h, j10);
                }
            }
        }
    }

    public final a v(int i10) {
        ArrayList arrayList = this.v;
        a aVar = (a) arrayList.get(i10);
        d0.V(i10, arrayList.size(), arrayList);
        this.K = Math.max(this.K, arrayList.size());
        int i11 = 0;
        this.f42879x.n(aVar.d(0));
        while (true) {
            c1[] c1VarArr = this.f42880y;
            if (i11 < c1VarArr.length) {
                c1 c1Var = c1VarArr[i11];
                i11++;
                c1Var.n(aVar.d(i11));
            } else {
                return aVar;
            }
        }
    }

    public final a w() {
        return (a) hc.b.i(1, this.v);
    }

    public final boolean x(int i10) {
        int t10;
        a aVar = (a) this.v.get(i10);
        if (this.f42879x.t() > aVar.d(0)) {
            return true;
        }
        int i11 = 0;
        do {
            c1[] c1VarArr = this.f42880y;
            if (i11 >= c1VarArr.length) {
                return false;
            }
            t10 = c1VarArr[i11].t();
            i11++;
        } while (t10 <= aVar.d(i11));
        return true;
    }

    public final boolean y() {
        if (this.I != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void z() {
        int A = A(this.f42879x.t(), this.K - 1);
        while (true) {
            int i10 = this.K;
            if (i10 <= A) {
                this.K = i10 + 1;
                a aVar = (a) this.v.get(i10);
                s sVar = aVar.d;
                if (!sVar.equals(this.G)) {
                    this.h.i(this.f42871a, sVar, aVar.e, aVar.f42865f, aVar.h);
                }
                this.G = sVar;
            } else {
                return;
            }
        }
    }
}
