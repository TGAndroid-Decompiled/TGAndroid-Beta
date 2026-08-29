package q4;

import ag.j2;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.j0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.o0;
import com.google.android.exoplayer2.upstream.q0;
import f5.d0;
import h7.x6;
import j$.util.DesugarCollections;
import j3.s0;
import j3.t0;
import j7.l1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l4.a1;
import l4.e1;
import l4.g0;
import l4.j1;
import l4.k1;
import l4.x;
import o3.w;
import org.telegram.ui.web.t1;
public final class r implements l0, o0, e1, o3.m, a1 {
    public static final Set f46320k0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final List A;
    public final o B;
    public final o C;
    public final Handler D;
    public final ArrayList E;
    public final Map F;
    public n4.e G;
    public q[] H;
    public int[] I;
    public final HashSet J;
    public final SparseIntArray K;
    public p L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public int Q;
    public t0 R;
    public t0 S;
    public boolean T;
    public k1 U;
    public Set V;
    public int[] W;
    public int X;
    public boolean Y;
    public boolean[] Z;
    public final String f46321a;
    public boolean[] f46322a0;
    public final int f46323b;
    public long f46324b0;
    public final org.telegram.ui.Components.n f46325c;
    public long f46326c0;
    public final i d;
    public boolean f46327d0;
    public final com.google.android.exoplayer2.upstream.r f46328e;
    public boolean f46329e0;
    public final t0 f46330f;
    public boolean f46331f0;
    public boolean f46332g0;
    public final n3.i h;
    public long f46333h0;
    public n3.c f46334i0;
    public k f46335j0;
    public final j2 f46336n;
    public final f7.v f46337r;
    public final q0 f46338s = new q0("Loader:HlsSampleStreamWrapper");
    public final g0 v;
    public final int f46339w;
    public final androidx.activity.n f46340x;
    public final ArrayList f46341y;

    public r(String str, int i10, org.telegram.ui.Components.n nVar, i iVar, Map map, com.google.android.exoplayer2.upstream.r rVar, long j10, t0 t0Var, n3.i iVar2, j2 j2Var, f7.v vVar, g0 g0Var, int i11) {
        this.f46321a = str;
        this.f46323b = i10;
        this.f46325c = nVar;
        this.d = iVar;
        this.F = map;
        this.f46328e = rVar;
        this.f46330f = t0Var;
        this.h = iVar2;
        this.f46336n = j2Var;
        this.f46337r = vVar;
        this.v = g0Var;
        this.f46339w = i11;
        ?? obj = new Object();
        obj.f881b = null;
        obj.f880a = false;
        obj.f882c = null;
        this.f46340x = obj;
        this.I = new int[0];
        Set set = f46320k0;
        this.J = new HashSet(set.size());
        this.K = new SparseIntArray(set.size());
        this.H = new q[0];
        this.f46322a0 = new boolean[0];
        this.Z = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f46341y = arrayList;
        this.A = DesugarCollections.unmodifiableList(arrayList);
        this.E = new ArrayList();
        this.B = new Runnable(this) {
            public final r f46313b;

            {
                this.f46313b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f46313b.v();
                        return;
                    default:
                        r rVar2 = this.f46313b;
                        rVar2.O = true;
                        rVar2.v();
                        return;
                }
            }
        };
        this.C = new Runnable(this) {
            public final r f46313b;

            {
                this.f46313b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f46313b.v();
                        return;
                    default:
                        r rVar2 = this.f46313b;
                        rVar2.O = true;
                        rVar2.v();
                        return;
                }
            }
        };
        this.D = d0.k(null);
        this.f46324b0 = j10;
        this.f46326c0 = j10;
    }

    public static o3.j e(int i10, int i11) {
        f5.a.K("HlsSampleStreamWrapper", "Unmapped track with id " + i10 + " of type " + i11);
        return new o3.j();
    }

    public static t0 k(t0 t0Var, t0 t0Var2, boolean z10) {
        String a2;
        int i10;
        int i11;
        if (t0Var == null) {
            return t0Var2;
        }
        String str = t0Var.f10803r;
        String str2 = t0Var2.B;
        int g10 = f5.o.g(str2);
        if (d0.n(g10, str) == 1) {
            a2 = d0.o(g10, str);
            str2 = f5.o.c(a2);
        } else {
            a2 = f5.o.a(str, str2);
        }
        t0Var2.v = t0Var.v;
        t0Var2.f10805w = t0Var.f10805w;
        t0Var2.f10806x = t0Var.f10806x;
        t0Var2.f10807y = t0Var.f10807y;
        s0 a10 = t0Var2.a();
        a10.f10730a = t0Var.f10797a;
        a10.f10731b = t0Var.f10798b;
        a10.f10732c = t0Var.f10799c;
        a10.d = t0Var.d;
        a10.f10733e = t0Var.f10800e;
        if (z10) {
            i10 = t0Var.f10801f;
        } else {
            i10 = -1;
        }
        a10.f10734f = i10;
        if (z10) {
            i11 = t0Var.h;
        } else {
            i11 = -1;
        }
        a10.f10735g = i11;
        a10.h = a2;
        a10.f10740m = t0Var.f10806x;
        a10.f10738k = t0Var.f10805w;
        a10.f10737j = t0Var.v;
        a10.f10739l = t0Var.f10807y;
        if (g10 == 2) {
            a10.f10747t = t0Var.G;
            a10.f10748u = t0Var.H;
            a10.v = t0Var.I;
        }
        if (str2 != null) {
            a10.f10742o = str2;
        }
        int i12 = t0Var.O;
        if (i12 != -1 && g10 == 1) {
            a10.B = i12;
        }
        b4.c cVar = t0Var.f10804s;
        if (cVar != null) {
            b4.c cVar2 = t0Var2.f10804s;
            if (cVar2 != null) {
                cVar = cVar2.a(cVar);
            }
            a10.f10736i = cVar;
        }
        return new t0(a10);
    }

    public static int t(int i10) {
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
    public final long L() {
        if (this.f46331f0) {
            return Long.MIN_VALUE;
        }
        if (u()) {
            return this.f46326c0;
        }
        long j10 = this.f46324b0;
        k q6 = q();
        if (!q6.T) {
            ArrayList arrayList = this.f46341y;
            if (arrayList.size() > 1) {
                q6 = (k) l1.i(2, arrayList);
            } else {
                q6 = null;
            }
        }
        if (q6 != null) {
            j10 = Math.max(j10, q6.f17132n);
        }
        if (this.O) {
            for (q qVar : this.H) {
                j10 = Math.max(j10, qVar.n());
            }
        }
        return j10;
    }

    @Override
    public final void U(long j10) {
        int size;
        boolean p10;
        q0 q0Var = this.f46338s;
        if (!q0Var.c() && !u()) {
            boolean d = q0Var.d();
            i iVar = this.d;
            List list = this.A;
            if (d) {
                this.G.getClass();
                n4.e eVar = this.G;
                if (iVar.f46276n != null) {
                    p10 = false;
                } else {
                    p10 = iVar.f46279q.p(j10, eVar, list);
                }
                if (p10) {
                    q0Var.b();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0 && iVar.b((k) list.get(size2 - 1)) == 2) {
                size2--;
            }
            if (size2 < list.size()) {
                l(size2);
            }
            if (iVar.f46276n == null && iVar.f46279q.length() >= 2) {
                size = iVar.f46279q.j(j10, list);
            } else {
                size = list.size();
            }
            if (size < this.f46341y.size()) {
                l(size);
            }
        }
    }

    @Override
    public final w Z1(int i10, int i11) {
        Integer valueOf = Integer.valueOf(i11);
        Set set = f46320k0;
        boolean contains = set.contains(valueOf);
        boolean z10 = false;
        HashSet hashSet = this.J;
        SparseIntArray sparseIntArray = this.K;
        ?? r52 = 0;
        r52 = 0;
        if (contains) {
            f5.a.f(set.contains(Integer.valueOf(i11)));
            int i12 = sparseIntArray.get(i11, -1);
            if (i12 != -1) {
                if (hashSet.add(Integer.valueOf(i11))) {
                    this.I[i12] = i10;
                }
                r52 = this.I[i12] == i10 ? this.H[i12] : e(i10, i11);
            }
        } else {
            int i13 = 0;
            while (true) {
                ?? r12 = this.H;
                if (i13 >= r12.length) {
                    break;
                } else if (this.I[i13] == i10) {
                    r52 = r12[i13];
                    break;
                } else {
                    i13++;
                }
            }
        }
        if (r52 == 0) {
            if (this.f46332g0) {
                return e(i10, i11);
            }
            int length = this.H.length;
            z10 = (i11 == 1 || i11 == 2) ? true : true;
            r52 = new q(this.f46328e, this.h, this.f46336n, this.F);
            r52.f14283t = this.f46324b0;
            if (z10) {
                r52.I = this.f46334i0;
                r52.f14288z = true;
            }
            long j10 = this.f46333h0;
            if (r52.F != j10) {
                r52.F = j10;
                r52.f14288z = true;
            }
            k kVar = this.f46335j0;
            if (kVar != null) {
                r52.C = kVar.v;
            }
            r52.f14270f = this;
            int i14 = length + 1;
            int[] copyOf = Arrays.copyOf(this.I, i14);
            this.I = copyOf;
            copyOf[length] = i10;
            q[] qVarArr = this.H;
            int i15 = d0.f6579a;
            ?? copyOf2 = Arrays.copyOf(qVarArr, qVarArr.length + 1);
            copyOf2[qVarArr.length] = r52;
            this.H = (q[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f46322a0, i14);
            this.f46322a0 = copyOf3;
            copyOf3[length] = z10;
            this.Y |= z10;
            hashSet.add(Integer.valueOf(i11));
            sparseIntArray.append(i11, length);
            if (t(i11) > t(this.M)) {
                this.N = length;
                this.M = i11;
            }
            this.Z = Arrays.copyOf(this.Z, i14);
        }
        if (i11 == 5) {
            if (this.L == null) {
                this.L = new p(r52, this.f46339w);
            }
            return this.L;
        }
        return r52;
    }

    @Override
    public final void a() {
        this.D.post(this.B);
    }

    @Override
    public final boolean b() {
        return this.f46338s.d();
    }

    @Override
    public final void c() {
        q[] qVarArr;
        for (q qVar : this.H) {
            qVar.A(true);
            n3.e eVar = qVar.h;
            if (eVar != null) {
                eVar.p(qVar.f14269e);
                qVar.h = null;
                qVar.f14271g = null;
            }
        }
    }

    public final void d() {
        f5.a.i(this.P);
        this.U.getClass();
        this.V.getClass();
    }

    @Override
    public final void e1() {
        this.f46332g0 = true;
        this.D.post(this.C);
    }

    @Override
    public final void g(n0 n0Var, long j10, long j11, boolean z10) {
        n4.e eVar = (n4.e) n0Var;
        this.G = null;
        long j12 = eVar.f17127a;
        Uri uri = eVar.f17133r.f3667c;
        ?? obj = new Object();
        this.f46337r.getClass();
        this.v.d(obj, eVar.f17129c, this.f46323b, eVar.d, eVar.f17130e, eVar.f17131f, eVar.h, eVar.f17132n);
        if (!z10) {
            if (u() || this.Q == 0) {
                y();
            }
            if (this.Q > 0) {
                this.f46325c.a(this);
            }
        }
    }

    @Override
    public final long h() {
        if (u()) {
            return this.f46326c0;
        }
        if (this.f46331f0) {
            return Long.MIN_VALUE;
        }
        return q().f17132n;
    }

    public final k1 i(j1[] j1VarArr) {
        for (int i10 = 0; i10 < j1VarArr.length; i10++) {
            j1 j1Var = j1VarArr[i10];
            t0[] t0VarArr = new t0[j1Var.f14347a];
            for (int i11 = 0; i11 < j1Var.f14347a; i11++) {
                t0 t0Var = j1Var.d[i11];
                int b10 = this.h.b(t0Var);
                s0 a2 = t0Var.a();
                a2.J = b10;
                t0VarArr[i11] = new t0(a2);
            }
            j1VarArr[i10] = new j1(j1Var.f14348b, t0VarArr);
        }
        return new k1(j1VarArr);
    }

    @Override
    public final k0 j(n0 n0Var, IOException iOException, int i10) {
        boolean z10;
        k0 k0Var;
        int i11;
        n4.e eVar = (n4.e) n0Var;
        boolean z11 = eVar instanceof k;
        if (z11 && !((k) eVar).W && (iOException instanceof h0) && ((i11 = ((h0) iOException).d) == 410 || i11 == 404)) {
            return q0.d;
        }
        long j10 = eVar.f17133r.f3666b;
        Uri uri = eVar.f17133r.f3667c;
        ?? obj = new Object();
        d0.S(eVar.h);
        d0.S(eVar.f17132n);
        p2.u uVar = new p2.u(iOException, i10, 2);
        i iVar = this.d;
        j0 a2 = x6.a(iVar.f46279q);
        this.f46337r.getClass();
        k0 z12 = f7.v.z(a2, uVar);
        boolean z13 = false;
        if (z12 != null && z12.f3576a == 2) {
            long j11 = z12.f3577b;
            d5.r rVar = iVar.f46279q;
            z10 = rVar.d(rVar.u(iVar.h.a(eVar.d)), j11);
        } else {
            z10 = false;
        }
        if (z10) {
            if (z11 && j10 == 0) {
                ArrayList arrayList = this.f46341y;
                if (((k) com.google.android.recaptcha.internal.a.j(1, arrayList)) == eVar) {
                    z13 = true;
                }
                f5.a.i(z13);
                if (arrayList.isEmpty()) {
                    this.f46326c0 = this.f46324b0;
                } else {
                    ((k) q8.l.g(arrayList)).V = true;
                }
            }
            k0Var = q0.f3605e;
        } else {
            long D = f7.v.D(uVar);
            if (D != -9223372036854775807L) {
                k0Var = new k0(0, D, false);
            } else {
                k0Var = q0.f3606f;
            }
        }
        k0 k0Var2 = k0Var;
        boolean a10 = k0Var2.a();
        this.v.h(obj, eVar.f17129c, this.f46323b, eVar.d, eVar.f17130e, eVar.f17131f, eVar.h, eVar.f17132n, iOException, !a10);
        if (!a10) {
            this.G = null;
        }
        if (z10) {
            if (!this.P) {
                s(this.f46324b0);
                return k0Var2;
            }
            this.f46325c.a(this);
        }
        return k0Var2;
    }

    public final void l(int i10) {
        ArrayList arrayList;
        f5.a.i(!this.f46338s.d());
        int i11 = i10;
        loop0: while (true) {
            arrayList = this.f46341y;
            if (i11 < arrayList.size()) {
                int i12 = i11;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((k) arrayList.get(i12)).f46285y) {
                            break;
                        }
                        i12++;
                    } else {
                        k kVar = (k) arrayList.get(i11);
                        for (int i13 = 0; i13 < this.H.length; i13++) {
                            if (this.H[i13].q() > kVar.f(i13)) {
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
        long j10 = q().f17132n;
        k kVar2 = (k) arrayList.get(i11);
        d0.N(i11, arrayList.size(), arrayList);
        for (int i14 = 0; i14 < this.H.length; i14++) {
            this.H[i14].k(kVar2.f(i14));
        }
        if (arrayList.isEmpty()) {
            this.f46326c0 = this.f46324b0;
        } else {
            ((k) q8.l.g(arrayList)).V = true;
        }
        this.f46331f0 = false;
        int i15 = this.M;
        long j11 = kVar2.h;
        g0 g0Var = this.v;
        g0Var.m(new x(1, i15, null, 3, null, g0Var.a(j11), g0Var.a(j10)));
    }

    @Override
    public final void m(n0 n0Var, long j10, long j11) {
        n4.e eVar = (n4.e) n0Var;
        this.G = null;
        if (eVar instanceof e) {
            e eVar2 = (e) eVar;
            byte[] bArr = eVar2.f46258s;
            i iVar = this.d;
            iVar.f46275m = bArr;
            o4.g gVar = iVar.f46272j;
            Uri uri = eVar2.f17128b.f3599a;
            byte[] bArr2 = eVar2.f46259w;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((d) gVar.f19159b).put(uri, bArr2);
        }
        long j12 = eVar.f17127a;
        Uri uri2 = eVar.f17133r.f3667c;
        ?? obj = new Object();
        this.f46337r.getClass();
        this.v.f(obj, eVar.f17129c, this.f46323b, eVar.d, eVar.f17130e, eVar.f17131f, eVar.h, eVar.f17132n);
        if (!this.P) {
            s(this.f46324b0);
        } else {
            this.f46325c.a(this);
        }
    }

    public final k q() {
        return (k) l1.i(1, this.f46341y);
    }

    @Override
    public final boolean s(long r69) {
        throw new UnsupportedOperationException("Method not decompiled: q4.r.s(long):boolean");
    }

    public final boolean u() {
        if (this.f46326c0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void v() {
        boolean z10;
        t0 k9;
        if (!this.T && this.W == null && this.O) {
            int i10 = 0;
            for (q qVar : this.H) {
                if (qVar.t() == null) {
                    return;
                }
            }
            k1 k1Var = this.U;
            if (k1Var != null) {
                int i11 = k1Var.f14357a;
                int[] iArr = new int[i11];
                this.W = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        q[] qVarArr = this.H;
                        if (i13 < qVarArr.length) {
                            t0 t10 = qVarArr[i13].t();
                            f5.a.j(t10);
                            t0 t0Var = this.U.a(i12).d[0];
                            String str = t10.B;
                            String str2 = t0Var.B;
                            int g10 = f5.o.g(str);
                            if (g10 != 3) {
                                if (g10 == f5.o.g(str2)) {
                                    break;
                                }
                                i13++;
                            } else {
                                if (!d0.a(str, str2)) {
                                    continue;
                                } else if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || t10.T == t0Var.T) {
                                    break;
                                }
                                i13++;
                            }
                        }
                    }
                    this.W[i12] = i13;
                }
                ArrayList arrayList = this.E;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((n) obj).b();
                }
                return;
            }
            int length = this.H.length;
            int i14 = 0;
            int i15 = -2;
            int i16 = -1;
            while (true) {
                int i17 = 1;
                if (i14 >= length) {
                    break;
                }
                t0 t11 = this.H[i14].t();
                f5.a.j(t11);
                String str3 = t11.B;
                if (f5.o.j(str3)) {
                    i17 = 2;
                } else if (!f5.o.h(str3)) {
                    if (f5.o.i(str3)) {
                        i17 = 3;
                    } else {
                        i17 = -2;
                    }
                }
                if (t(i17) > t(i15)) {
                    i16 = i14;
                    i15 = i17;
                } else if (i17 == i15 && i16 != -1) {
                    i16 = -1;
                }
                i14++;
            }
            j1 j1Var = this.d.h;
            int i18 = j1Var.f14347a;
            this.X = -1;
            this.W = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.W[i19] = i19;
            }
            j1[] j1VarArr = new j1[length];
            for (int i20 = 0; i20 < length; i20++) {
                t0 t12 = this.H[i20].t();
                f5.a.j(t12);
                String str4 = this.f46321a;
                t0 t0Var2 = this.f46330f;
                if (i20 == i16) {
                    t0[] t0VarArr = new t0[i18];
                    for (int i21 = 0; i21 < i18; i21++) {
                        t0 t0Var3 = j1Var.d[i21];
                        if (i15 == 1 && t0Var2 != null) {
                            t0Var3 = t0Var3.c(t0Var2);
                        }
                        if (i18 == 1) {
                            k9 = t12.c(t0Var3);
                        } else {
                            k9 = k(t0Var3, t12, true);
                        }
                        t0VarArr[i21] = k9;
                    }
                    j1VarArr[i20] = new j1(str4, t0VarArr);
                    this.X = i20;
                } else {
                    t0Var2 = (i15 == 2 && f5.o.h(t12.B)) ? null : null;
                    StringBuilder f9 = u3.c.f(str4, ":muxed:");
                    f9.append(i20 < i16 ? i20 : i20 - 1);
                    j1VarArr[i20] = new j1(f9.toString(), k(t0Var2, t12, false));
                }
            }
            this.U = i(j1VarArr);
            if (this.V == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            f5.a.i(z10);
            this.V = Collections.EMPTY_SET;
            this.P = true;
            this.f46325c.k();
        }
    }

    public final void w() {
        this.f46338s.a();
        i iVar = this.d;
        l4.b bVar = iVar.f46276n;
        if (bVar == null) {
            Uri uri = iVar.f46277o;
            if (uri != null && iVar.f46281s) {
                r4.b bVar2 = (r4.b) iVar.f46270g.d.get(uri);
                bVar2.f46937b.a();
                IOException iOException = bVar2.f46943s;
                if (iOException != null) {
                    throw iOException;
                }
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void x(j1[] j1VarArr, int... iArr) {
        this.U = i(j1VarArr);
        this.V = new HashSet();
        for (int i10 : iArr) {
            this.V.add(this.U.a(i10));
        }
        this.X = 0;
        this.D.post(new t1(this.f46325c, 12));
        this.P = true;
    }

    public final void y() {
        for (q qVar : this.H) {
            qVar.A(this.f46327d0);
        }
        this.f46327d0 = false;
    }

    public final boolean z(long j10, boolean z10) {
        this.f46324b0 = j10;
        if (u()) {
            this.f46326c0 = j10;
            return true;
        }
        if (this.O && !z10) {
            int length = this.H.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.H[i10].D(j10, false) || (!this.f46322a0[i10] && this.Y)) {
                }
            }
            return false;
        }
        this.f46326c0 = j10;
        this.f46331f0 = false;
        this.f46341y.clear();
        q0 q0Var = this.f46338s;
        if (q0Var.d()) {
            if (this.O) {
                for (q qVar : this.H) {
                    qVar.i();
                }
            }
            q0Var.b();
            return true;
        }
        q0Var.f3609c = null;
        y();
        return true;
    }

    @Override
    public final void D1(o3.t tVar) {
    }
}
