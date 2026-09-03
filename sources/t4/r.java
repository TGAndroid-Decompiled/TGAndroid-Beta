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
import o4.j0;
import o4.n0;
import o4.s0;
import o4.t0;
import org.telegram.ui.Components.zz;
import p2.w;
import ph.ga;
import vh.w2;
public final class r implements h0, k0, n0, r3.m, j0 {
    public static final Set f44600l0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
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
    public final String f44601a;
    public boolean[] f44602a0;
    public final int f44603b;
    public boolean[] f44604b0;
    public final o2.i f44605c;
    public long f44606c0;
    public final i d;
    public long f44607d0;
    public final g5.q e;
    public boolean f44608e0;
    public final j3.n0 f44609f;
    public boolean f44610f0;
    public boolean f44611g0;
    public final o3.p h;
    public boolean f44612h0;
    public long f44613i0;
    public o3.h f44614j0;
    public k f44615k0;
    public final o3.m f44616n;
    public final z9.d f44617r;
    public final m0 f44618s = new m0("Loader:HlsSampleStreamWrapper");
    public final e0 v;
    public final int f44619w;
    public final androidx.activity.o f44620x;
    public final ArrayList f44621y;

    public r(String str, int i10, o2.i iVar, i iVar2, Map map, g5.q qVar, long j10, j3.n0 n0Var, o3.p pVar, o3.m mVar, z9.d dVar, e0 e0Var, int i11) {
        this.f44601a = str;
        this.f44603b = i10;
        this.f44605c = iVar;
        this.d = iVar2;
        this.G = map;
        this.e = qVar;
        this.f44609f = n0Var;
        this.h = pVar;
        this.f44616n = mVar;
        this.f44617r = dVar;
        this.v = e0Var;
        this.f44619w = i11;
        ?? obj = new Object();
        obj.f333b = null;
        obj.f332a = false;
        obj.f334c = null;
        this.f44620x = obj;
        this.J = new int[0];
        Set set = f44600l0;
        this.K = new HashSet(set.size());
        this.L = new SparseIntArray(set.size());
        this.I = new q[0];
        this.f44604b0 = new boolean[0];
        this.f44602a0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f44621y = arrayList;
        this.B = DesugarCollections.unmodifiableList(arrayList);
        this.F = new ArrayList();
        this.C = new Runnable(this) {
            public final r f44594b;

            {
                this.f44594b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f44594b.l();
                        return;
                    default:
                        r rVar = this.f44594b;
                        rVar.P = true;
                        rVar.l();
                        return;
                }
            }
        };
        this.D = new Runnable(this) {
            public final r f44594b;

            {
                this.f44594b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f44594b.l();
                        return;
                    default:
                        r rVar = this.f44594b;
                        rVar.P = true;
                        rVar.l();
                        return;
                }
            }
        };
        this.E = d0.l(null);
        this.f44606c0 = j10;
        this.f44607d0 = j10;
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
        String str = n0Var.f8722r;
        String str2 = n0Var2.C;
        int g10 = h5.o.g(str2);
        if (d0.o(g10, str) == 1) {
            a2 = d0.p(g10, str);
            str2 = h5.o.c(a2);
        } else {
            a2 = h5.o.a(str, str2);
        }
        n0Var2.v = n0Var.v;
        n0Var2.f8724w = n0Var.f8724w;
        n0Var2.f8725x = n0Var.f8725x;
        n0Var2.f8726y = n0Var.f8726y;
        j3.m0 a10 = n0Var2.a();
        a10.f8655a = n0Var.f8717a;
        a10.f8656b = n0Var.f8718b;
        a10.f8657c = n0Var.f8719c;
        a10.d = n0Var.d;
        a10.e = n0Var.e;
        if (z4) {
            i10 = n0Var.f8720f;
        } else {
            i10 = -1;
        }
        a10.f8658f = i10;
        if (z4) {
            i11 = n0Var.h;
        } else {
            i11 = -1;
        }
        a10.f8659g = i11;
        a10.h = a2;
        a10.f8664m = n0Var.f8725x;
        a10.f8662k = n0Var.f8724w;
        a10.f8661j = n0Var.v;
        a10.f8663l = n0Var.f8726y;
        if (g10 == 2) {
            a10.f8671t = n0Var.H;
            a10.f8672u = n0Var.I;
            a10.v = n0Var.J;
        }
        if (str2 != null) {
            a10.f8666o = str2;
        }
        int i12 = n0Var.P;
        if (i12 != -1 && g10 == 1) {
            a10.B = i12;
        }
        e4.c cVar = n0Var.f8723s;
        if (cVar != null) {
            e4.c cVar2 = n0Var2.f8723s;
            if (cVar2 != null) {
                cVar = cVar2.a(cVar.f5109a);
            }
            a10.f8660i = cVar;
        }
        return new j3.n0(a10);
    }

    public static int j(int i10) {
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
    public final long H() {
        if (k()) {
            return this.f44607d0;
        }
        if (this.f44611g0) {
            return Long.MIN_VALUE;
        }
        return i().f42763n;
    }

    @Override
    public final c4.e X(g5.j0 j0Var, IOException iOException, int i10) {
        boolean z4;
        c4.e eVar;
        int i11;
        q4.e eVar2 = (q4.e) j0Var;
        boolean z10 = eVar2 instanceof k;
        if (z10 && !((k) eVar2).X && (iOException instanceof g5.e0) && ((i11 = ((g5.e0) iOException).d) == 410 || i11 == 404)) {
            return m0.d;
        }
        long j10 = eVar2.f42764r.f6457b;
        Uri uri = eVar2.f42764r.f6458c;
        ?? obj = new Object();
        d0.S(eVar2.h);
        d0.S(eVar2.f42763n);
        w wVar = new w(iOException, i10, 4);
        i iVar = this.d;
        g0 a2 = i7.a(iVar.f44561q);
        this.f44617r.getClass();
        c4.e d = z9.d.d(a2, wVar);
        boolean z11 = false;
        if (d != null && d.f2095a == 2) {
            long j11 = d.f2096b;
            f5.c cVar = iVar.f44561q;
            z4 = cVar.d(cVar.m(iVar.h.a(eVar2.d)), j11);
        } else {
            z4 = false;
        }
        if (z4) {
            if (z10 && j10 == 0) {
                ArrayList arrayList = this.f44621y;
                if (((k) e2.c.g(1, arrayList)) == eVar2) {
                    z11 = true;
                }
                h5.a.i(z11);
                if (arrayList.isEmpty()) {
                    this.f44607d0 = this.f44606c0;
                } else {
                    ((k) s8.l.h(arrayList)).W = true;
                }
            }
            eVar = m0.e;
        } else {
            long v = z9.d.v(wVar);
            if (v != -9223372036854775807L) {
                eVar = new c4.e(0, v, false);
            } else {
                eVar = m0.f6391f;
            }
        }
        c4.e eVar3 = eVar;
        boolean a10 = eVar3.a();
        this.v.r(obj, eVar2.f42761c, this.f44603b, eVar2.d, eVar2.e, eVar2.f42762f, eVar2.h, eVar2.f42763n, iOException, !a10);
        if (!a10) {
            this.H = null;
        }
        if (z4) {
            if (!this.Q) {
                n0(this.f44606c0);
                return eVar3;
            }
            this.f44605c.X1(this);
        }
        return eVar3;
    }

    @Override
    public final void a() {
        this.E.post(this.C);
    }

    @Override
    public final boolean b() {
        return this.f44618s.d();
    }

    @Override
    public final void c() {
        q[] qVarArr;
        for (q qVar : this.I) {
            qVar.A(true);
            o3.j jVar = qVar.h;
            if (jVar != null) {
                jVar.c(qVar.e);
                qVar.h = null;
                qVar.f16343g = null;
            }
        }
    }

    public final void d() {
        h5.a.i(this.Q);
        this.V.getClass();
        this.W.getClass();
    }

    @Override
    public final r3.v d2(int i10, int i11) {
        k kVar;
        Integer valueOf = Integer.valueOf(i11);
        Set set = f44600l0;
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
            if (this.f44612h0) {
                return e(i10, i11);
            }
            int length = this.I.length;
            z4 = (i11 == 1 || i11 == 2) ? true : true;
            r52 = new q(this.e, this.h, this.f44616n, this.G);
            r52.f16355t = this.f44606c0;
            if (z4) {
                r52.I = this.f44614j0;
                r52.f16360z = true;
            }
            long j10 = this.f44613i0;
            if (r52.F != j10) {
                r52.F = j10;
                r52.f16360z = true;
            }
            if (this.f44615k0 != null) {
                r52.C = kVar.v;
            }
            r52.f16342f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.J, i14);
            this.J = copyOf;
            copyOf[length] = i10;
            q[] qVarArr = this.I;
            int i15 = d0.f6924a;
            ?? copyOf2 = Arrays.copyOf(qVarArr, qVarArr.length + 1);
            copyOf2[qVarArr.length] = r52;
            this.I = (q[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f44604b0, i14);
            this.f44604b0 = copyOf3;
            copyOf3[length] = z4;
            this.Z |= z4;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (j(i11) > j(this.N)) {
                this.O = length;
                this.N = i11;
            }
            this.f44602a0 = Arrays.copyOf(this.f44602a0, i14);
        }
        if (i11 == 5) {
            if (this.M == null) {
                this.M = new p(r52, this.f44619w);
            }
            return this.M;
        }
        return r52;
    }

    public final t0 f(s0[] s0VarArr) {
        for (int i10 = 0; i10 < s0VarArr.length; i10++) {
            s0 s0Var = s0VarArr[i10];
            j3.n0[] n0VarArr = new j3.n0[s0Var.f16400a];
            for (int i11 = 0; i11 < s0Var.f16400a; i11++) {
                j3.n0 n0Var = s0Var.d[i11];
                int z4 = this.h.z(n0Var);
                j3.m0 a2 = n0Var.a();
                a2.J = z4;
                n0VarArr[i11] = new j3.n0(a2);
            }
            s0VarArr[i10] = new s0(s0Var.f16401b, n0VarArr);
        }
        return new t0(s0VarArr);
    }

    public final void h(int i10) {
        ArrayList arrayList;
        h5.a.i(!this.f44618s.d());
        int i11 = i10;
        loop0: while (true) {
            arrayList = this.f44621y;
            if (i11 < arrayList.size()) {
                int i12 = i11;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((k) arrayList.get(i12)).f44567y) {
                            break;
                        }
                        i12++;
                    } else {
                        k kVar = (k) arrayList.get(i11);
                        for (int i13 = 0; i13 < this.I.length; i13++) {
                            if (this.I[i13].q() > kVar.g(i13)) {
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
        long j10 = i().f42763n;
        k kVar2 = (k) arrayList.get(i11);
        d0.L(i11, arrayList.size(), arrayList);
        for (int i14 = 0; i14 < this.I.length; i14++) {
            this.I[i14].k(kVar2.g(i14));
        }
        if (arrayList.isEmpty()) {
            this.f44607d0 = this.f44606c0;
        } else {
            ((k) s8.l.h(arrayList)).W = true;
        }
        this.f44611g0 = false;
        this.v.B(new o4.r(1, this.N, null, 3, null, d0.S(kVar2.h), d0.S(j10)));
    }

    public final k i() {
        return (k) kf.k0.i(1, this.f44621y);
    }

    @Override
    public final void j1() {
        this.f44612h0 = true;
        this.E.post(this.D);
    }

    public final boolean k() {
        if (this.f44607d0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override
    public final void k1(g5.j0 j0Var, long j10, long j11) {
        q4.e eVar = (q4.e) j0Var;
        this.H = null;
        if (eVar instanceof e) {
            e eVar2 = (e) eVar;
            byte[] bArr = eVar2.f44542s;
            i iVar = this.d;
            iVar.f44557m = bArr;
            zz zzVar = iVar.f44554j;
            Uri uri = eVar2.f42760b.f6401a;
            byte[] bArr2 = eVar2.f44543w;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((d) zzVar.f31508b).put(uri, bArr2);
        }
        long j12 = eVar.f42759a;
        Uri uri2 = eVar.f42764r.f6458c;
        ?? obj = new Object();
        this.f44617r.getClass();
        this.v.p(obj, eVar.f42761c, this.f44603b, eVar.d, eVar.e, eVar.f42762f, eVar.h, eVar.f42763n);
        if (!this.Q) {
            n0(this.f44606c0);
        } else {
            this.f44605c.X1(this);
        }
    }

    @Override
    public final void k2(long j10) {
        int size;
        boolean u10;
        m0 m0Var = this.f44618s;
        if (!m0Var.c() && !k()) {
            boolean d = m0Var.d();
            i iVar = this.d;
            List list = this.B;
            if (d) {
                this.H.getClass();
                q4.e eVar = this.H;
                if (iVar.f44558n != null) {
                    u10 = false;
                } else {
                    u10 = iVar.f44561q.u(j10, eVar, list);
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
                h(size2);
            }
            if (iVar.f44558n == null && iVar.f44561q.p() >= 2) {
                size = iVar.f44561q.c(j10, list);
            } else {
                size = list.size();
            }
            if (size < this.f44621y.size()) {
                h(size);
            }
        }
    }

    public final void l() {
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
                int i11 = t0Var.f16403a;
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
                if (j(i17) > j(i15)) {
                    i16 = i14;
                    i15 = i17;
                } else if (i17 == i15 && i16 != -1) {
                    i16 = -1;
                }
                i14++;
            }
            s0 s0Var = this.d.h;
            int i18 = s0Var.f16400a;
            this.Y = -1;
            this.X = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.X[i19] = i19;
            }
            s0[] s0VarArr = new s0[length];
            for (int i20 = 0; i20 < length; i20++) {
                j3.n0 t10 = this.I[i20].t();
                h5.a.j(t10);
                String str4 = this.f44601a;
                j3.n0 n0Var2 = this.f44609f;
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
                    StringBuilder f10 = w2.f(str4, ":muxed:");
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
            this.f44605c.q2();
        }
    }

    public final void m() {
        this.f44618s.a();
        i iVar = this.d;
        o4.b bVar = iVar.f44558n;
        if (bVar == null) {
            Uri uri = iVar.f44559o;
            if (uri != null && iVar.f44563s) {
                u4.b bVar2 = (u4.b) iVar.f44552g.d.get(uri);
                bVar2.f45063b.a();
                IOException iOException = bVar2.f45068s;
                if (iOException != null) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void n(s0[] s0VarArr, int... iArr) {
        this.V = f(s0VarArr);
        this.W = new HashSet();
        for (int i10 : iArr) {
            this.W.add(this.V.a(i10));
        }
        this.Y = 0;
        this.E.post(new ga(this.f44605c, 15));
        this.Q = true;
    }

    @Override
    public final boolean n0(long r80) {
        throw new UnsupportedOperationException("Method not decompiled: t4.r.n0(long):boolean");
    }

    public final void o() {
        for (q qVar : this.I) {
            qVar.A(this.f44608e0);
        }
        this.f44608e0 = false;
    }

    public final boolean p(long j10, boolean z4) {
        this.f44606c0 = j10;
        if (k()) {
            this.f44607d0 = j10;
            return true;
        }
        if (this.P && !z4) {
            int length = this.I.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.I[i10].D(j10, false) || (!this.f44604b0[i10] && this.Z)) {
                }
            }
            return false;
        }
        this.f44607d0 = j10;
        this.f44611g0 = false;
        this.f44621y.clear();
        m0 m0Var = this.f44618s;
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
        o();
        return true;
    }

    @Override
    public final void x0(g5.j0 j0Var, long j10, long j11, boolean z4) {
        q4.e eVar = (q4.e) j0Var;
        this.H = null;
        long j12 = eVar.f42759a;
        Uri uri = eVar.f42764r.f6458c;
        ?? obj = new Object();
        this.f44617r.getClass();
        this.v.m(obj, eVar.f42761c, this.f44603b, eVar.d, eVar.e, eVar.f42762f, eVar.h, eVar.f42763n);
        if (!z4) {
            if (k() || this.R == 0) {
                o();
            }
            if (this.R > 0) {
                this.f44605c.X1(this);
            }
        }
    }

    @Override
    public final long y1() {
        if (this.f44611g0) {
            return Long.MIN_VALUE;
        }
        if (k()) {
            return this.f44607d0;
        }
        long j10 = this.f44606c0;
        k i10 = i();
        if (!i10.U) {
            ArrayList arrayList = this.f44621y;
            if (arrayList.size() > 1) {
                i10 = (k) kf.k0.i(2, arrayList);
            } else {
                i10 = null;
            }
        }
        if (i10 != null) {
            j10 = Math.max(j10, i10.f42763n);
        }
        if (this.P) {
            for (q qVar : this.I) {
                j10 = Math.max(j10, qVar.n());
            }
        }
        return j10;
    }

    @Override
    public final void h2(r3.s sVar) {
    }
}
