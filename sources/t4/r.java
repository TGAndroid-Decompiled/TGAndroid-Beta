package t4;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import b4.e0;
import g5.g0;
import g5.h0;
import g5.k0;
import g5.m0;
import h5.d0;
import j$.util.DesugarCollections;
import j7.k7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o4.j0;
import o4.n0;
import o4.s0;
import o4.t0;
import org.telegram.ui.Cells.f1;
import qh.u9;
public final class r implements h0, k0, n0, r3.m, j0 {
    public static final Set f47980l0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final List B;
    public final o C;
    public final o D;
    public final Handler E;
    public final ArrayList F;
    public final Map G;
    public q4.e H;
    public q[] I;
    public int[] J;
    public final HashSet K;
    public final SparseIntArray L;
    public p M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public int R;
    public j3.n0 S;
    public j3.n0 T;
    public boolean U;
    public t0 V;
    public Set W;
    public int[] X;
    public int Y;
    public boolean Z;
    public final String f47981a;
    public boolean[] f47982a0;
    public final int f47983b;
    public boolean[] f47984b0;
    public final f1 f47985c;
    public long f47986c0;
    public final i d;
    public long f47987d0;
    public final g5.q f47988e;
    public boolean f47989e0;
    public final j3.n0 f47990f;
    public boolean f47991f0;
    public boolean f47992g0;
    public final o3.o h;
    public boolean f47993h0;
    public long f47994i0;
    public o3.g f47995j0;
    public k f47996k0;
    public final o3.l f47997n;
    public final ab.a f47998r;
    public final m0 f47999s = new m0("Loader:HlsSampleStreamWrapper");
    public final e0 v;
    public final int f48000w;
    public final androidx.activity.o f48001x;
    public final ArrayList f48002y;

    public r(String str, int i10, f1 f1Var, i iVar, Map map, g5.q qVar, long j10, j3.n0 n0Var, o3.o oVar, o3.l lVar, ab.a aVar, e0 e0Var, int i11) {
        this.f47981a = str;
        this.f47983b = i10;
        this.f47985c = f1Var;
        this.d = iVar;
        this.G = map;
        this.f47988e = qVar;
        this.f47990f = n0Var;
        this.h = oVar;
        this.f47997n = lVar;
        this.f47998r = aVar;
        this.v = e0Var;
        this.f48000w = i11;
        ?? obj = new Object();
        obj.f356b = null;
        obj.f355a = false;
        obj.f357c = null;
        this.f48001x = obj;
        this.J = new int[0];
        Set set = f47980l0;
        this.K = new HashSet(set.size());
        this.L = new SparseIntArray(set.size());
        this.I = new q[0];
        this.f47984b0 = new boolean[0];
        this.f47982a0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f48002y = arrayList;
        this.B = DesugarCollections.unmodifiableList(arrayList);
        this.F = new ArrayList();
        this.C = new Runnable(this) {
            public final r f47973b;

            {
                this.f47973b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47973b.A();
                        return;
                    default:
                        r rVar = this.f47973b;
                        rVar.P = true;
                        rVar.A();
                        return;
                }
            }
        };
        this.D = new Runnable(this) {
            public final r f47973b;

            {
                this.f47973b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f47973b.A();
                        return;
                    default:
                        r rVar = this.f47973b;
                        rVar.P = true;
                        rVar.A();
                        return;
                }
            }
        };
        this.E = d0.l(null);
        this.f47986c0 = j10;
        this.f47987d0 = j10;
    }

    public static r3.j l(int i10, int i11) {
        h5.a.K("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new r3.j();
    }

    public static j3.n0 s(j3.n0 n0Var, j3.n0 n0Var2, boolean z4) {
        String a2;
        int i10;
        int i11;
        if (n0Var == null) {
            return n0Var2;
        }
        String str = n0Var.f9324r;
        String str2 = n0Var2.C;
        int g10 = h5.o.g(str2);
        if (d0.o(g10, str) == 1) {
            a2 = d0.p(g10, str);
            str2 = h5.o.c(a2);
        } else {
            a2 = h5.o.a(str, str2);
        }
        n0Var2.v = n0Var.v;
        n0Var2.f9326w = n0Var.f9326w;
        n0Var2.f9327x = n0Var.f9327x;
        n0Var2.f9328y = n0Var.f9328y;
        j3.m0 a10 = n0Var2.a();
        a10.f9253a = n0Var.f9318a;
        a10.f9254b = n0Var.f9319b;
        a10.f9255c = n0Var.f9320c;
        a10.d = n0Var.d;
        a10.f9256e = n0Var.f9321e;
        if (z4) {
            i10 = n0Var.f9322f;
        } else {
            i10 = -1;
        }
        a10.f9257f = i10;
        if (z4) {
            i11 = n0Var.h;
        } else {
            i11 = -1;
        }
        a10.f9258g = i11;
        a10.h = a2;
        a10.f9263m = n0Var.f9327x;
        a10.f9261k = n0Var.f9326w;
        a10.f9260j = n0Var.v;
        a10.f9262l = n0Var.f9328y;
        if (g10 == 2) {
            a10.f9270t = n0Var.H;
            a10.f9271u = n0Var.I;
            a10.v = n0Var.J;
        }
        if (str2 != null) {
            a10.f9265o = str2;
        }
        int i12 = n0Var.P;
        if (i12 != -1 && g10 == 1) {
            a10.B = i12;
        }
        e4.c cVar = n0Var.f9325s;
        if (cVar != null) {
            e4.c cVar2 = n0Var2.f9325s;
            if (cVar2 != null) {
                cVar = cVar2.a(cVar.f4938a);
            }
            a10.f9259i = cVar;
        }
        return new j3.n0(a10);
    }

    public static int y(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 3;
        }
        if (i10 == 3) {
            return 1;
        }
        return 0;
    }

    public final void A() {
        boolean z4;
        j3.n0 s6;
        if (!this.U && this.X == null && this.P) {
            int i10 = 0;
            for (q qVar : this.I) {
                if (qVar.t() == null) {
                    return;
                }
            }
            t0 t0Var = this.V;
            if (t0Var != null) {
                int i11 = t0Var.f16578a;
                int[] iArr = new int[i11];
                this.X = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        q[] qVarArr = this.I;
                        if (i13 < qVarArr.length) {
                            j3.n0 t6 = qVarArr[i13].t();
                            h5.a.j(t6);
                            j3.n0 n0Var = this.V.a(i12).d[0];
                            String str = t6.C;
                            String str2 = n0Var.C;
                            int g10 = h5.o.g(str);
                            if (g10 != 3) {
                                if (g10 == h5.o.g(str2)) {
                                    break;
                                }
                                i13++;
                            } else {
                                if (!d0.a(str, str2)) {
                                    continue;
                                } else if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || t6.U == n0Var.U) {
                                    break;
                                }
                                i13++;
                            }
                        }
                    }
                    this.X[i12] = i13;
                }
                ArrayList arrayList = this.F;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((n) obj).b();
                }
                return;
            }
            int length = this.I.length;
            int i14 = 0;
            int i15 = -2;
            int i16 = -1;
            while (true) {
                int i17 = 1;
                if (i14 >= length) {
                    break;
                }
                j3.n0 t9 = this.I[i14].t();
                h5.a.j(t9);
                String str3 = t9.C;
                if (h5.o.j(str3)) {
                    i17 = 2;
                } else if (!h5.o.h(str3)) {
                    if (h5.o.i(str3)) {
                        i17 = 3;
                    } else {
                        i17 = -2;
                    }
                }
                if (y(i17) > y(i15)) {
                    i16 = i14;
                    i15 = i17;
                } else if (i17 == i15 && i16 != -1) {
                    i16 = -1;
                }
                i14++;
            }
            s0 s0Var = this.d.h;
            int i18 = s0Var.f16573a;
            this.Y = -1;
            this.X = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.X[i19] = i19;
            }
            s0[] s0VarArr = new s0[length];
            for (int i20 = 0; i20 < length; i20++) {
                j3.n0 t10 = this.I[i20].t();
                h5.a.j(t10);
                String str4 = this.f47981a;
                j3.n0 n0Var2 = this.f47990f;
                if (i20 == i16) {
                    j3.n0[] n0VarArr = new j3.n0[i18];
                    for (int i21 = 0; i21 < i18; i21++) {
                        j3.n0 n0Var3 = s0Var.d[i21];
                        if (i15 == 1 && n0Var2 != null) {
                            n0Var3 = n0Var3.c(n0Var2);
                        }
                        if (i18 == 1) {
                            s6 = t10.c(n0Var3);
                        } else {
                            s6 = s(n0Var3, t10, true);
                        }
                        n0VarArr[i21] = s6;
                    }
                    s0VarArr[i20] = new s0(str4, n0VarArr);
                    this.Y = i20;
                } else {
                    n0Var2 = (i15 == 2 && h5.o.h(t10.C)) ? null : null;
                    StringBuilder f10 = w.c.f(str4, ":muxed:");
                    f10.append(i20 < i16 ? i20 : i20 - 1);
                    s0VarArr[i20] = new s0(f10.toString(), s(n0Var2, t10, false));
                }
            }
            this.V = p(s0VarArr);
            if (this.W == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            h5.a.i(z4);
            this.W = Collections.EMPTY_SET;
            this.Q = true;
            this.f47985c.v();
        }
    }

    public final void B() {
        this.f47999s.a();
        i iVar = this.d;
        o4.b bVar = iVar.f47936n;
        if (bVar == null) {
            Uri uri = iVar.f47937o;
            if (uri != null && iVar.f47941s) {
                u4.b bVar2 = (u4.b) iVar.f47930g.d.get(uri);
                bVar2.f48280b.a();
                IOException iOException = bVar2.f48286s;
                if (iOException != null) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void C(s0[] s0VarArr, int... iArr) {
        this.V = p(s0VarArr);
        this.W = new HashSet();
        for (int i10 : iArr) {
            this.W.add(this.V.a(i10));
        }
        this.Y = 0;
        this.E.post(new u9(this.f47985c, 16));
        this.Q = true;
    }

    public final void D() {
        for (q qVar : this.I) {
            qVar.A(this.f47989e0);
        }
        this.f47989e0 = false;
    }

    public final boolean E(long j10, boolean z4) {
        this.f47986c0 = j10;
        if (z()) {
            this.f47987d0 = j10;
            return true;
        }
        if (this.P && !z4) {
            int length = this.I.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.I[i10].D(j10, false) || (!this.f47984b0[i10] && this.Z)) {
                }
            }
            return false;
        }
        this.f47987d0 = j10;
        this.f47992g0 = false;
        this.f48002y.clear();
        m0 m0Var = this.f47999s;
        if (m0Var.d()) {
            if (this.P) {
                for (q qVar : this.I) {
                    qVar.i();
                }
            }
            m0Var.b();
            return true;
        }
        m0Var.f6877c = null;
        D();
        return true;
    }

    @Override
    public final void a() {
        this.E.post(this.C);
    }

    @Override
    public final boolean b() {
        return this.f47999s.d();
    }

    @Override
    public final void c() {
        q[] qVarArr;
        for (q qVar : this.I) {
            qVar.A(true);
            o3.i iVar = qVar.h;
            if (iVar != null) {
                iVar.c(qVar.f16509e);
                qVar.h = null;
                qVar.f16511g = null;
            }
        }
    }

    @Override
    public final long e() {
        if (z()) {
            return this.f47987d0;
        }
        if (this.f47992g0) {
            return Long.MIN_VALUE;
        }
        return w().f44509n;
    }

    public final void h() {
        h5.a.i(this.Q);
        this.V.getClass();
        this.W.getClass();
    }

    @Override
    public final void i1() {
        this.f47993h0 = true;
        this.E.post(this.D);
    }

    @Override
    public final r3.v i2(int i10, int i11) {
        k kVar;
        Integer valueOf = Integer.valueOf(i11);
        Set set = f47980l0;
        boolean contains = set.contains(valueOf);
        boolean z4 = false;
        HashSet hashSet = this.K;
        SparseIntArray sparseIntArray = this.L;
        ?? r52 = 0;
        r52 = 0;
        if (contains) {
            h5.a.f(set.contains(Integer.valueOf(i11)));
            int i12 = sparseIntArray.get(i11, -1);
            if (i12 != -1) {
                if (hashSet.add(Integer.valueOf(i11))) {
                    this.J[i12] = i10;
                }
                r52 = this.J[i12] == i10 ? this.I[i12] : l(i10, i11);
            }
        } else {
            int i13 = 0;
            while (true) {
                ?? r12 = this.I;
                if (i13 >= r12.length) {
                    break;
                } else if (this.J[i13] == i10) {
                    r52 = r12[i13];
                    break;
                } else {
                    i13++;
                }
            }
        }
        if (r52 == 0) {
            if (this.f47993h0) {
                return l(i10, i11);
            }
            int length = this.I.length;
            z4 = (i11 == 1 || i11 == 2) ? true : true;
            r52 = new q(this.f47988e, this.h, this.f47997n, this.G);
            r52.f16523t = this.f47986c0;
            if (z4) {
                r52.I = this.f47995j0;
                r52.f16528z = true;
            }
            long j10 = this.f47994i0;
            if (r52.F != j10) {
                r52.F = j10;
                r52.f16528z = true;
            }
            if (this.f47996k0 != null) {
                r52.C = kVar.v;
            }
            r52.f16510f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.J, i14);
            this.J = copyOf;
            copyOf[length] = i10;
            q[] qVarArr = this.I;
            int i15 = d0.f7237a;
            ?? copyOf2 = Arrays.copyOf(qVarArr, qVarArr.length + 1);
            copyOf2[qVarArr.length] = r52;
            this.I = (q[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f47984b0, i14);
            this.f47984b0 = copyOf3;
            copyOf3[length] = z4;
            this.Z |= z4;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (y(i11) > y(this.N)) {
                this.O = length;
                this.N = i11;
            }
            this.f47982a0 = Arrays.copyOf(this.f47982a0, i14);
        }
        if (i11 == 5) {
            if (this.M == null) {
                this.M = new p(r52, this.f48000w);
            }
            return this.M;
        }
        return r52;
    }

    @Override
    public final boolean m(long r80) {
        throw new UnsupportedOperationException("Method not decompiled: t4.r.m(long):boolean");
    }

    public final t0 p(s0[] s0VarArr) {
        for (int i10 = 0; i10 < s0VarArr.length; i10++) {
            s0 s0Var = s0VarArr[i10];
            j3.n0[] n0VarArr = new j3.n0[s0Var.f16573a];
            for (int i11 = 0; i11 < s0Var.f16573a; i11++) {
                j3.n0 n0Var = s0Var.d[i11];
                int b10 = this.h.b(n0Var);
                j3.m0 a2 = n0Var.a();
                a2.J = b10;
                n0VarArr[i11] = new j3.n0(a2);
            }
            s0VarArr[i10] = new s0(s0Var.f16574b, n0VarArr);
        }
        return new t0(s0VarArr);
    }

    @Override
    public final c4.e q(g5.j0 j0Var, IOException iOException, int i10) {
        boolean z4;
        c4.e eVar;
        int i11;
        q4.e eVar2 = (q4.e) j0Var;
        boolean z10 = eVar2 instanceof k;
        if (z10 && !((k) eVar2).X && (iOException instanceof g5.e0) && ((i11 = ((g5.e0) iOException).d) == 410 || i11 == 404)) {
            return m0.d;
        }
        long j10 = eVar2.f44510r.f6949b;
        Uri uri = eVar2.f44510r.f6950c;
        ?? obj = new Object();
        d0.S(eVar2.h);
        d0.S(eVar2.f44509n);
        p2.v vVar = new p2.v(iOException, i10, 4);
        i iVar = this.d;
        g0 a2 = k7.a(iVar.f47939q);
        this.f47998r.getClass();
        c4.e m32 = ab.a.m3(a2, vVar);
        boolean z11 = false;
        if (m32 != null && m32.f2253a == 2) {
            long j11 = m32.f2254b;
            f5.c cVar = iVar.f47939q;
            z4 = cVar.d(cVar.m(iVar.h.a(eVar2.d)), j11);
        } else {
            z4 = false;
        }
        if (z4) {
            if (z10 && j10 == 0) {
                ArrayList arrayList = this.f48002y;
                if (((k) e2.c.g(1, arrayList)) == eVar2) {
                    z11 = true;
                }
                h5.a.i(z11);
                if (arrayList.isEmpty()) {
                    this.f47987d0 = this.f47986c0;
                } else {
                    ((k) s8.l.h(arrayList)).W = true;
                }
            }
            eVar = m0.f6873e;
        } else {
            long o32 = ab.a.o3(vVar);
            if (o32 != -9223372036854775807L) {
                eVar = new c4.e(0, o32, false);
            } else {
                eVar = m0.f6874f;
            }
        }
        c4.e eVar3 = eVar;
        boolean a10 = eVar3.a();
        this.v.r(obj, eVar2.f44506c, this.f47983b, eVar2.d, eVar2.f44507e, eVar2.f44508f, eVar2.h, eVar2.f44509n, iOException, !a10);
        if (!a10) {
            this.H = null;
        }
        if (z4) {
            if (!this.Q) {
                m(this.f47986c0);
                return eVar3;
            }
            this.f47985c.s(this);
        }
        return eVar3;
    }

    @Override
    public final long r() {
        if (this.f47992g0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.f47987d0;
        }
        long j10 = this.f47986c0;
        k w10 = w();
        if (!w10.U) {
            ArrayList arrayList = this.f48002y;
            if (arrayList.size() > 1) {
                w10 = (k) l.d.i(2, arrayList);
            } else {
                w10 = null;
            }
        }
        if (w10 != null) {
            j10 = Math.max(j10, w10.f44509n);
        }
        if (this.P) {
            for (q qVar : this.I) {
                j10 = Math.max(j10, qVar.n());
            }
        }
        return j10;
    }

    @Override
    public final void t(long j10) {
        int size;
        boolean u10;
        m0 m0Var = this.f47999s;
        if (!m0Var.c() && !z()) {
            boolean d = m0Var.d();
            i iVar = this.d;
            List list = this.B;
            if (d) {
                this.H.getClass();
                q4.e eVar = this.H;
                if (iVar.f47936n != null) {
                    u10 = false;
                } else {
                    u10 = iVar.f47939q.u(j10, eVar, list);
                }
                if (u10) {
                    m0Var.b();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0 && iVar.b((k) list.get(size2 - 1)) == 2) {
                size2--;
            }
            if (size2 < list.size()) {
                v(size2);
            }
            if (iVar.f47936n == null && iVar.f47939q.p() >= 2) {
                size = iVar.f47939q.c(j10, list);
            } else {
                size = list.size();
            }
            if (size < this.f48002y.size()) {
                v(size);
            }
        }
    }

    @Override
    public final void u(g5.j0 j0Var, long j10, long j11, boolean z4) {
        q4.e eVar = (q4.e) j0Var;
        this.H = null;
        long j12 = eVar.f44504a;
        Uri uri = eVar.f44510r.f6950c;
        ?? obj = new Object();
        this.f47998r.getClass();
        this.v.m(obj, eVar.f44506c, this.f47983b, eVar.d, eVar.f44507e, eVar.f44508f, eVar.h, eVar.f44509n);
        if (!z4) {
            if (z() || this.R == 0) {
                D();
            }
            if (this.R > 0) {
                this.f47985c.s(this);
            }
        }
    }

    public final void v(int i10) {
        ArrayList arrayList;
        h5.a.i(!this.f47999s.d());
        int i11 = i10;
        loop0: while (true) {
            arrayList = this.f48002y;
            if (i11 < arrayList.size()) {
                int i12 = i11;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((k) arrayList.get(i12)).f47945y) {
                            break;
                        }
                        i12++;
                    } else {
                        k kVar = (k) arrayList.get(i11);
                        for (int i13 = 0; i13 < this.I.length; i13++) {
                            if (this.I[i13].q() > kVar.f(i13)) {
                                break;
                            }
                        }
                        break loop0;
                    }
                }
            } else {
                i11 = -1;
                break;
            }
            i11++;
        }
        if (i11 == -1) {
            return;
        }
        long j10 = w().f44509n;
        k kVar2 = (k) arrayList.get(i11);
        d0.L(i11, arrayList.size(), arrayList);
        for (int i14 = 0; i14 < this.I.length; i14++) {
            this.I[i14].k(kVar2.f(i14));
        }
        if (arrayList.isEmpty()) {
            this.f47987d0 = this.f47986c0;
        } else {
            ((k) s8.l.h(arrayList)).W = true;
        }
        this.f47992g0 = false;
        this.v.B(new o4.r(1, this.N, null, 3, null, d0.S(kVar2.h), d0.S(j10)));
    }

    public final k w() {
        return (k) l.d.i(1, this.f48002y);
    }

    @Override
    public final void x(g5.j0 j0Var, long j10, long j11) {
        q4.e eVar = (q4.e) j0Var;
        this.H = null;
        if (eVar instanceof e) {
            e eVar2 = (e) eVar;
            byte[] bArr = eVar2.f47918s;
            i iVar = this.d;
            iVar.f47935m = bArr;
            org.telegram.ui.web.e0 e0Var = iVar.f47932j;
            Uri uri = eVar2.f44505b.f6885a;
            byte[] bArr2 = eVar2.f47919w;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((d) e0Var.f42491b).put(uri, bArr2);
        }
        long j12 = eVar.f44504a;
        Uri uri2 = eVar.f44510r.f6950c;
        ?? obj = new Object();
        this.f47998r.getClass();
        this.v.p(obj, eVar.f44506c, this.f47983b, eVar.d, eVar.f44507e, eVar.f44508f, eVar.h, eVar.f44509n);
        if (!this.Q) {
            m(this.f47986c0);
        } else {
            this.f47985c.s(this);
        }
    }

    public final boolean z() {
        if (this.f47987d0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final void m2(r3.s sVar) {
    }
}
