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
import j7.i7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kh.a2;
import o4.j0;
import o4.n0;
import o4.s0;
import o4.t0;
import org.telegram.ui.Cells.f1;
import p2.w;
import ph.ga;
import ph.j5;
import vh.v2;
public final class r implements h0, k0, n0, r3.m, j0 {
    public static final Set f44538l0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
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
    public final String f44539a;
    public boolean[] f44540a0;
    public final int f44541b;
    public boolean[] f44542b0;
    public final j5 f44543c;
    public long f44544c0;
    public final i d;
    public long f44545d0;
    public final g5.q e;
    public boolean f44546e0;
    public final j3.n0 f44547f;
    public boolean f44548f0;
    public boolean f44549g0;
    public final o3.o h;
    public boolean f44550h0;
    public long f44551i0;
    public o3.g f44552j0;
    public k f44553k0;
    public final o3.l f44554n;
    public final ab.a f44555r;
    public final m0 f44556s = new m0("Loader:HlsSampleStreamWrapper");
    public final e0 v;
    public final int f44557w;
    public final androidx.activity.o f44558x;
    public final ArrayList f44559y;

    public r(String str, int i10, j5 j5Var, i iVar, Map map, g5.q qVar, long j10, j3.n0 n0Var, o3.o oVar, o3.l lVar, ab.a aVar, e0 e0Var, int i11) {
        this.f44539a = str;
        this.f44541b = i10;
        this.f44543c = j5Var;
        this.d = iVar;
        this.G = map;
        this.e = qVar;
        this.f44547f = n0Var;
        this.h = oVar;
        this.f44554n = lVar;
        this.f44555r = aVar;
        this.v = e0Var;
        this.f44557w = i11;
        ?? obj = new Object();
        obj.f318b = null;
        obj.f317a = false;
        obj.f319c = null;
        this.f44558x = obj;
        this.J = new int[0];
        Set set = f44538l0;
        this.K = new HashSet(set.size());
        this.L = new SparseIntArray(set.size());
        this.I = new q[0];
        this.f44542b0 = new boolean[0];
        this.f44540a0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f44559y = arrayList;
        this.B = DesugarCollections.unmodifiableList(arrayList);
        this.F = new ArrayList();
        this.C = new Runnable(this) {
            public final r f44532b;

            {
                this.f44532b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f44532b.o();
                        return;
                    default:
                        r rVar = this.f44532b;
                        rVar.P = true;
                        rVar.o();
                        return;
                }
            }
        };
        this.D = new Runnable(this) {
            public final r f44532b;

            {
                this.f44532b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f44532b.o();
                        return;
                    default:
                        r rVar = this.f44532b;
                        rVar.P = true;
                        rVar.o();
                        return;
                }
            }
        };
        this.E = d0.l(null);
        this.f44544c0 = j10;
        this.f44545d0 = j10;
    }

    public static r3.j e(int i10, int i11) {
        h5.a.K("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new r3.j();
    }

    public static j3.n0 g(j3.n0 n0Var, j3.n0 n0Var2, boolean z4) {
        String a2;
        int i10;
        int i11;
        if (n0Var == null) {
            return n0Var2;
        }
        String str = n0Var.f8740r;
        String str2 = n0Var2.C;
        int g10 = h5.o.g(str2);
        if (d0.o(g10, str) == 1) {
            a2 = d0.p(g10, str);
            str2 = h5.o.c(a2);
        } else {
            a2 = h5.o.a(str, str2);
        }
        n0Var2.v = n0Var.v;
        n0Var2.f8742w = n0Var.f8742w;
        n0Var2.f8743x = n0Var.f8743x;
        n0Var2.f8744y = n0Var.f8744y;
        j3.m0 a10 = n0Var2.a();
        a10.f8673a = n0Var.f8735a;
        a10.f8674b = n0Var.f8736b;
        a10.f8675c = n0Var.f8737c;
        a10.d = n0Var.d;
        a10.e = n0Var.e;
        if (z4) {
            i10 = n0Var.f8738f;
        } else {
            i10 = -1;
        }
        a10.f8676f = i10;
        if (z4) {
            i11 = n0Var.h;
        } else {
            i11 = -1;
        }
        a10.f8677g = i11;
        a10.h = a2;
        a10.f8682m = n0Var.f8743x;
        a10.f8680k = n0Var.f8742w;
        a10.f8679j = n0Var.v;
        a10.f8681l = n0Var.f8744y;
        if (g10 == 2) {
            a10.f8689t = n0Var.H;
            a10.f8690u = n0Var.I;
            a10.v = n0Var.J;
        }
        if (str2 != null) {
            a10.f8684o = str2;
        }
        int i12 = n0Var.P;
        if (i12 != -1 && g10 == 1) {
            a10.B = i12;
        }
        e4.c cVar = n0Var.f8741s;
        if (cVar != null) {
            e4.c cVar2 = n0Var2.f8741s;
            if (cVar2 != null) {
                cVar = cVar2.a(cVar.f5101a);
            }
            a10.f8678i = cVar;
        }
        return new j3.n0(a10);
    }

    public static int k(int i10) {
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

    @Override
    public final void A(g5.j0 j0Var, long j10, long j11) {
        q4.e eVar = (q4.e) j0Var;
        this.H = null;
        if (eVar instanceof e) {
            e eVar2 = (e) eVar;
            byte[] bArr = eVar2.f44480s;
            i iVar = this.d;
            iVar.f44495m = bArr;
            f1 f1Var = iVar.f44492j;
            Uri uri = eVar2.f42730b.f6401a;
            byte[] bArr2 = eVar2.f44481w;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((d) f1Var.f21045b).put(uri, bArr2);
        }
        long j12 = eVar.f42729a;
        Uri uri2 = eVar.f42734r.f6458c;
        ?? obj = new Object();
        this.f44555r.getClass();
        this.v.n(obj, eVar.f42731c, this.f44541b, eVar.d, eVar.e, eVar.f42732f, eVar.h, eVar.f42733n);
        if (!this.Q) {
            C(this.f44544c0);
        } else {
            this.f44543c.Z(this);
        }
    }

    @Override
    public final boolean C(long r80) {
        throw new UnsupportedOperationException("Method not decompiled: t4.r.C(long):boolean");
    }

    @Override
    public final long X() {
        if (this.f44549g0) {
            return Long.MIN_VALUE;
        }
        if (n()) {
            return this.f44545d0;
        }
        long j10 = this.f44544c0;
        k j11 = j();
        if (!j11.U) {
            ArrayList arrayList = this.f44559y;
            if (arrayList.size() > 1) {
                j11 = (k) a2.i(2, arrayList);
            } else {
                j11 = null;
            }
        }
        if (j11 != null) {
            j10 = Math.max(j10, j11.f42733n);
        }
        if (this.P) {
            for (q qVar : this.I) {
                j10 = Math.max(j10, qVar.n());
            }
        }
        return j10;
    }

    @Override
    public final void a() {
        this.E.post(this.C);
    }

    @Override
    public final boolean b() {
        return this.f44556s.d();
    }

    @Override
    public final void c() {
        q[] qVarArr;
        for (q qVar : this.I) {
            qVar.A(true);
            o3.i iVar = qVar.h;
            if (iVar != null) {
                iVar.c(qVar.e);
                qVar.h = null;
                qVar.f16361g = null;
            }
        }
    }

    @Override
    public final r3.v c2(int i10, int i11) {
        k kVar;
        Integer valueOf = Integer.valueOf(i11);
        Set set = f44538l0;
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
                r52 = this.J[i12] == i10 ? this.I[i12] : e(i10, i11);
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
            if (this.f44550h0) {
                return e(i10, i11);
            }
            int length = this.I.length;
            z4 = (i11 == 1 || i11 == 2) ? true : true;
            r52 = new q(this.e, this.h, this.f44554n, this.G);
            r52.f16373t = this.f44544c0;
            if (z4) {
                r52.I = this.f44552j0;
                r52.f16378z = true;
            }
            long j10 = this.f44551i0;
            if (r52.F != j10) {
                r52.F = j10;
                r52.f16378z = true;
            }
            if (this.f44553k0 != null) {
                r52.C = kVar.v;
            }
            r52.f16360f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.J, i14);
            this.J = copyOf;
            copyOf[length] = i10;
            q[] qVarArr = this.I;
            int i15 = d0.f6937a;
            ?? copyOf2 = Arrays.copyOf(qVarArr, qVarArr.length + 1);
            copyOf2[qVarArr.length] = r52;
            this.I = (q[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f44542b0, i14);
            this.f44542b0 = copyOf3;
            copyOf3[length] = z4;
            this.Z |= z4;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (k(i11) > k(this.N)) {
                this.O = length;
                this.N = i11;
            }
            this.f44540a0 = Arrays.copyOf(this.f44540a0, i14);
        }
        if (i11 == 5) {
            if (this.M == null) {
                this.M = new p(r52, this.f44557w);
            }
            return this.M;
        }
        return r52;
    }

    public final void d() {
        h5.a.i(this.Q);
        this.V.getClass();
        this.W.getClass();
    }

    public final t0 f(s0[] s0VarArr) {
        for (int i10 = 0; i10 < s0VarArr.length; i10++) {
            s0 s0Var = s0VarArr[i10];
            j3.n0[] n0VarArr = new j3.n0[s0Var.f16418a];
            for (int i11 = 0; i11 < s0Var.f16418a; i11++) {
                j3.n0 n0Var = s0Var.d[i11];
                int b10 = this.h.b(n0Var);
                j3.m0 a2 = n0Var.a();
                a2.J = b10;
                n0VarArr[i11] = new j3.n0(a2);
            }
            s0VarArr[i10] = new s0(s0Var.f16419b, n0VarArr);
        }
        return new t0(s0VarArr);
    }

    @Override
    public final void f0(long j10) {
        int size;
        boolean u10;
        m0 m0Var = this.f44556s;
        if (!m0Var.c() && !n()) {
            boolean d = m0Var.d();
            i iVar = this.d;
            List list = this.B;
            if (d) {
                this.H.getClass();
                q4.e eVar = this.H;
                if (iVar.f44496n != null) {
                    u10 = false;
                } else {
                    u10 = iVar.f44499q.u(j10, eVar, list);
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
                i(size2);
            }
            if (iVar.f44496n == null && iVar.f44499q.p() >= 2) {
                size = iVar.f44499q.c(j10, list);
            } else {
                size = list.size();
            }
            if (size < this.f44559y.size()) {
                i(size);
            }
        }
    }

    @Override
    public final void f1() {
        this.f44550h0 = true;
        this.E.post(this.D);
    }

    public final void i(int i10) {
        ArrayList arrayList;
        h5.a.i(!this.f44556s.d());
        int i11 = i10;
        loop0: while (true) {
            arrayList = this.f44559y;
            if (i11 < arrayList.size()) {
                int i12 = i11;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((k) arrayList.get(i12)).f44505y) {
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
        long j10 = j().f42733n;
        k kVar2 = (k) arrayList.get(i11);
        d0.L(i11, arrayList.size(), arrayList);
        for (int i14 = 0; i14 < this.I.length; i14++) {
            this.I[i14].k(kVar2.f(i14));
        }
        if (arrayList.isEmpty()) {
            this.f44545d0 = this.f44544c0;
        } else {
            ((k) s8.l.h(arrayList)).W = true;
        }
        this.f44549g0 = false;
        this.v.A(new o4.r(1, this.N, null, 3, null, d0.S(kVar2.h), d0.S(j10)));
    }

    public final k j() {
        return (k) a2.i(1, this.f44559y);
    }

    @Override
    public final long l() {
        if (n()) {
            return this.f44545d0;
        }
        if (this.f44549g0) {
            return Long.MIN_VALUE;
        }
        return j().f42733n;
    }

    @Override
    public final c4.e m(g5.j0 j0Var, IOException iOException, int i10) {
        boolean z4;
        c4.e eVar;
        int i11;
        q4.e eVar2 = (q4.e) j0Var;
        boolean z10 = eVar2 instanceof k;
        if (z10 && !((k) eVar2).X && (iOException instanceof g5.e0) && ((i11 = ((g5.e0) iOException).d) == 410 || i11 == 404)) {
            return m0.d;
        }
        long j10 = eVar2.f42734r.f6457b;
        Uri uri = eVar2.f42734r.f6458c;
        ?? obj = new Object();
        d0.S(eVar2.h);
        d0.S(eVar2.f42733n);
        w wVar = new w(iOException, i10, 4);
        i iVar = this.d;
        g0 a2 = i7.a(iVar.f44499q);
        this.f44555r.getClass();
        c4.e m32 = ab.a.m3(a2, wVar);
        boolean z11 = false;
        if (m32 != null && m32.f2072a == 2) {
            long j11 = m32.f2073b;
            f5.c cVar = iVar.f44499q;
            z4 = cVar.d(cVar.m(iVar.h.a(eVar2.d)), j11);
        } else {
            z4 = false;
        }
        if (z4) {
            if (z10 && j10 == 0) {
                ArrayList arrayList = this.f44559y;
                if (((k) e2.c.g(1, arrayList)) == eVar2) {
                    z11 = true;
                }
                h5.a.i(z11);
                if (arrayList.isEmpty()) {
                    this.f44545d0 = this.f44544c0;
                } else {
                    ((k) s8.l.h(arrayList)).W = true;
                }
            }
            eVar = m0.e;
        } else {
            long o32 = ab.a.o3(wVar);
            if (o32 != -9223372036854775807L) {
                eVar = new c4.e(0, o32, false);
            } else {
                eVar = m0.f6391f;
            }
        }
        c4.e eVar3 = eVar;
        boolean a10 = eVar3.a();
        this.v.q(obj, eVar2.f42731c, this.f44541b, eVar2.d, eVar2.e, eVar2.f42732f, eVar2.h, eVar2.f42733n, iOException, !a10);
        if (!a10) {
            this.H = null;
        }
        if (z4) {
            if (!this.Q) {
                C(this.f44544c0);
                return eVar3;
            }
            this.f44543c.Z(this);
        }
        return eVar3;
    }

    public final boolean n() {
        if (this.f44545d0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void o() {
        boolean z4;
        j3.n0 g10;
        if (!this.U && this.X == null && this.P) {
            int i10 = 0;
            for (q qVar : this.I) {
                if (qVar.t() == null) {
                    return;
                }
            }
            t0 t0Var = this.V;
            if (t0Var != null) {
                int i11 = t0Var.f16421a;
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
                            int g11 = h5.o.g(str);
                            if (g11 != 3) {
                                if (g11 == h5.o.g(str2)) {
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
                if (k(i17) > k(i15)) {
                    i16 = i14;
                    i15 = i17;
                } else if (i17 == i15 && i16 != -1) {
                    i16 = -1;
                }
                i14++;
            }
            s0 s0Var = this.d.h;
            int i18 = s0Var.f16418a;
            this.Y = -1;
            this.X = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.X[i19] = i19;
            }
            s0[] s0VarArr = new s0[length];
            for (int i20 = 0; i20 < length; i20++) {
                j3.n0 t10 = this.I[i20].t();
                h5.a.j(t10);
                String str4 = this.f44539a;
                j3.n0 n0Var2 = this.f44547f;
                if (i20 == i16) {
                    j3.n0[] n0VarArr = new j3.n0[i18];
                    for (int i21 = 0; i21 < i18; i21++) {
                        j3.n0 n0Var3 = s0Var.d[i21];
                        if (i15 == 1 && n0Var2 != null) {
                            n0Var3 = n0Var3.c(n0Var2);
                        }
                        if (i18 == 1) {
                            g10 = t10.c(n0Var3);
                        } else {
                            g10 = g(n0Var3, t10, true);
                        }
                        n0VarArr[i21] = g10;
                    }
                    s0VarArr[i20] = new s0(str4, n0VarArr);
                    this.Y = i20;
                } else {
                    n0Var2 = (i15 == 2 && h5.o.h(t10.C)) ? null : null;
                    StringBuilder f10 = v2.f(str4, ":muxed:");
                    f10.append(i20 < i16 ? i20 : i20 - 1);
                    s0VarArr[i20] = new s0(f10.toString(), g(n0Var2, t10, false));
                }
            }
            this.V = f(s0VarArr);
            if (this.W == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            h5.a.i(z4);
            this.W = Collections.EMPTY_SET;
            this.Q = true;
            this.f44543c.g0();
        }
    }

    public final void q() {
        this.f44556s.a();
        i iVar = this.d;
        o4.b bVar = iVar.f44496n;
        if (bVar == null) {
            Uri uri = iVar.f44497o;
            if (uri != null && iVar.f44501s) {
                u4.b bVar2 = (u4.b) iVar.f44490g.d.get(uri);
                bVar2.f45001b.a();
                IOException iOException = bVar2.f45006s;
                if (iOException != null) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void r(s0[] s0VarArr, int... iArr) {
        this.V = f(s0VarArr);
        this.W = new HashSet();
        for (int i10 : iArr) {
            this.W.add(this.V.a(i10));
        }
        this.Y = 0;
        this.E.post(new ga(this.f44543c, 14));
        this.Q = true;
    }

    @Override
    public final void s(g5.j0 j0Var, long j10, long j11, boolean z4) {
        q4.e eVar = (q4.e) j0Var;
        this.H = null;
        long j12 = eVar.f42729a;
        Uri uri = eVar.f42734r.f6458c;
        ?? obj = new Object();
        this.f44555r.getClass();
        this.v.l(obj, eVar.f42731c, this.f44541b, eVar.d, eVar.e, eVar.f42732f, eVar.h, eVar.f42733n);
        if (!z4) {
            if (n() || this.R == 0) {
                t();
            }
            if (this.R > 0) {
                this.f44543c.Z(this);
            }
        }
    }

    public final void t() {
        for (q qVar : this.I) {
            qVar.A(this.f44546e0);
        }
        this.f44546e0 = false;
    }

    public final boolean u(long j10, boolean z4) {
        this.f44544c0 = j10;
        if (n()) {
            this.f44545d0 = j10;
            return true;
        }
        if (this.P && !z4) {
            int length = this.I.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.I[i10].D(j10, false) || (!this.f44542b0[i10] && this.Z)) {
                }
            }
            return false;
        }
        this.f44545d0 = j10;
        this.f44549g0 = false;
        this.f44559y.clear();
        m0 m0Var = this.f44556s;
        if (m0Var.d()) {
            if (this.P) {
                for (q qVar : this.I) {
                    qVar.i();
                }
            }
            m0Var.b();
            return true;
        }
        m0Var.f6394c = null;
        t();
        return true;
    }

    @Override
    public final void g2(r3.s sVar) {
    }
}
