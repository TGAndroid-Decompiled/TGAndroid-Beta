package r2;

import a8.ja;
import a8.xa;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import e2.m1;
import e2.q0;
import e2.s0;
import e2.u;
import h2.l0;
import h9.i0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j2.b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l2.r0;
import org.telegram.messenger.ou;
import org.telegram.ui.Components.ff;
import org.telegram.utils.twidget.v;
import x2.d1;
import x2.q1;
import x2.z0;
public final class q implements b3.j, b3.m, d1, f3.q, z0 {
    public static final Set f55835q0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final ArrayList E;
    public final List F;
    public final n G;
    public final n H;
    public final Handler I;
    public final ArrayList J;
    public final Map K;
    public y2.f L;
    public p[] M;
    public int[] N;
    public final HashSet O;
    public final SparseIntArray P;
    public o Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public int V;
    public u W;
    public u X;
    public boolean Y;
    public q1 Z;
    public final String f55836a;
    public Set f55837a0;
    public final int f55838b;
    public int[] f55839b0;
    public final ff f55840c;
    public int f55841c0;
    public final h d;
    public boolean f55842d0;
    public final h6.m f55843e;
    public boolean[] f55844e0;
    public final u f55845f;
    public boolean[] f55846f0;
    public long f55847g0;
    public final q2.n h;
    public long f55848h0;
    public boolean f55849i0;
    public boolean f55850j0;
    public boolean f55851k0;
    public long f55852l0;
    public boolean m0;
    public final q2.k f55853n;
    public long f55854n0;
    public e2.r f55855o0;
    public i f55856p0;
    public final qb.a f55857r;
    public final b3.o f55858s;
    public final xa f55859w;
    public final int f55860x;
    public final androidx.activity.n f55861y;

    public q(String str, int i7, ff ffVar, h hVar, Map map, h6.m mVar, long j3, u uVar, q2.n nVar, q2.k kVar, qb.a aVar, xa xaVar, int i10, c3.a aVar2) {
        b3.o oVar;
        this.f55836a = str;
        this.f55838b = i7;
        this.f55840c = ffVar;
        this.d = hVar;
        this.K = map;
        this.f55843e = mVar;
        this.f55845f = uVar;
        this.h = nVar;
        this.f55853n = kVar;
        this.f55857r = aVar;
        this.f55859w = xaVar;
        this.f55860x = i10;
        if (aVar2 != null) {
            oVar = new b3.o(aVar2);
        } else {
            oVar = new b3.o("Loader:HlsSampleStreamWrapper");
        }
        this.f55858s = oVar;
        androidx.activity.n nVar2 = new androidx.activity.n(6);
        nVar2.f1790c = null;
        nVar2.f1789b = false;
        nVar2.d = null;
        this.f55861y = nVar2;
        this.N = new int[0];
        Set set = f55835q0;
        this.O = new HashSet(set.size());
        this.P = new SparseIntArray(set.size());
        this.M = new p[0];
        this.f55846f0 = new boolean[0];
        this.f55844e0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.E = arrayList;
        this.F = DesugarCollections.unmodifiableList(arrayList);
        this.J = new ArrayList();
        this.G = new Runnable(this) {
            public final q f55828b;

            {
                this.f55828b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f55828b.D();
                        return;
                    default:
                        q qVar = this.f55828b;
                        for (p pVar : qVar.M) {
                            pVar.K(qVar.f55852l0);
                        }
                        qVar.T = true;
                        qVar.D();
                        return;
                }
            }
        };
        this.H = new Runnable(this) {
            public final q f55828b;

            {
                this.f55828b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f55828b.D();
                        return;
                    default:
                        q qVar = this.f55828b;
                        for (p pVar : qVar.M) {
                            pVar.K(qVar.f55852l0);
                        }
                        qVar.T = true;
                        qVar.D();
                        return;
                }
            }
        };
        this.I = l0.q(null);
        this.f55847g0 = j3;
        this.f55848h0 = j3;
        this.f55852l0 = Long.MIN_VALUE;
    }

    public static int B(int i7) {
        if (i7 == 1) {
            return 2;
        }
        if (i7 == 2) {
            return 3;
        }
        if (i7 == 3) {
            return 1;
        }
        return 0;
    }

    public static f3.n v(int i7, int i10) {
        h2.a.l("HlsSampleStreamWrapper", "Unmapped track with id " + i7 + " of type " + i10);
        return new f3.n();
    }

    public static u y(u uVar, u uVar2, boolean z10) {
        String b10;
        int i7;
        int i10;
        if (uVar == null) {
            return uVar2;
        }
        String str = uVar.f10443k;
        String str2 = uVar2.f10451s;
        int h = s0.h(str2);
        if (l0.v(h, str) == 1) {
            b10 = l0.w(h, str);
            str2 = s0.d(b10);
        } else {
            b10 = s0.b(str, str2);
        }
        uVar2.f10446n = uVar.f10446n;
        uVar2.f10447o = uVar.f10447o;
        uVar2.f10448p = uVar.f10448p;
        uVar2.f10449q = uVar.f10449q;
        e2.t a10 = uVar2.a();
        a10.f10384a = uVar.f10435a;
        a10.f10385b = uVar.f10436b;
        a10.f10386c = i0.q(uVar.f10437c);
        a10.d = uVar.d;
        a10.f10387e = uVar.f10438e;
        a10.f10388f = uVar.f10439f;
        if (z10) {
            i7 = uVar.h;
        } else {
            i7 = -1;
        }
        a10.h = i7;
        if (z10) {
            i10 = uVar.f10441i;
        } else {
            i10 = -1;
        }
        a10.f10390i = i10;
        a10.f10391j = b10;
        a10.f10397p = uVar.f10448p;
        a10.f10395n = uVar.f10447o;
        a10.f10394m = uVar.f10446n;
        a10.f10396o = uVar.f10449q;
        if (h == 2) {
            a10.f10405y = uVar.f10457z;
            a10.f10406z = uVar.A;
            a10.C = uVar.D;
        }
        if (str2 != null) {
            a10.f10399r = s0.n(str2);
        }
        int i11 = uVar.K;
        if (i11 != -1 && h == 1) {
            a10.J = i11;
        }
        q0 q0Var = uVar.f10444l;
        if (q0Var != null) {
            q0 q0Var2 = uVar2.f10444l;
            if (q0Var2 != null) {
                q0Var = q0Var2.b(q0Var);
            }
            a10.f10392k = q0Var;
        }
        return new u(a10);
    }

    public final i A() {
        return (i) i5.c.h(1, this.E);
    }

    public final boolean C() {
        if (this.f55848h0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void D() {
        boolean z10;
        int i7;
        u y10;
        if (!this.Y && this.f55839b0 == null && this.T) {
            int i10 = 0;
            for (p pVar : this.M) {
                if (pVar.y() == null) {
                    return;
                }
            }
            q1 q1Var = this.Z;
            if (q1Var != null) {
                int i11 = q1Var.f59640a;
                int[] iArr = new int[i11];
                this.f55839b0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        p[] pVarArr = this.M;
                        if (i13 < pVarArr.length) {
                            u y11 = pVarArr[i13].y();
                            y11.getClass();
                            u uVar = this.Z.a(i12).d[0];
                            String str = y11.f10451s;
                            String str2 = uVar.f10451s;
                            int h = s0.h(str);
                            if (h != 3) {
                                if (h == s0.h(str2)) {
                                    break;
                                }
                                i13++;
                            } else {
                                if (!Objects.equals(str, str2)) {
                                    continue;
                                } else if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || y11.P == uVar.P) {
                                    break;
                                }
                                i13++;
                            }
                        }
                    }
                    this.f55839b0[i12] = i13;
                }
                ArrayList arrayList = this.J;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((m) obj).b();
                }
                return;
            }
            int length = this.M.length;
            int i14 = 0;
            int i15 = -1;
            int i16 = -2;
            while (true) {
                int i17 = 1;
                if (i14 >= length) {
                    break;
                }
                u y12 = this.M[i14].y();
                y12.getClass();
                String str3 = y12.f10451s;
                if (s0.m(str3)) {
                    i17 = 2;
                } else if (!s0.i(str3)) {
                    if (s0.l(str3)) {
                        i17 = 3;
                    } else {
                        i17 = -2;
                    }
                }
                if (B(i17) > B(i16)) {
                    i15 = i14;
                    i16 = i17;
                } else if (i17 == i16 && i15 != -1) {
                    i15 = -1;
                }
                i14++;
            }
            m1 m1Var = this.d.h;
            int i18 = m1Var.f10209a;
            this.f55841c0 = -1;
            this.f55839b0 = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.f55839b0[i19] = i19;
            }
            m1[] m1VarArr = new m1[length];
            int i20 = 0;
            while (i20 < length) {
                u y13 = this.M[i20].y();
                y13.getClass();
                u uVar2 = this.f55845f;
                String str4 = this.f55836a;
                if (i20 == i15) {
                    u[] uVarArr = new u[i18];
                    for (int i21 = i10; i21 < i18; i21++) {
                        u uVar3 = m1Var.d[i21];
                        if (i16 == 1 && uVar2 != null) {
                            uVar3 = uVar3.d(uVar2);
                        }
                        if (i18 == 1) {
                            y10 = y13.d(uVar3);
                        } else {
                            y10 = y(uVar3, y13, true);
                        }
                        uVarArr[i21] = y10;
                    }
                    m1VarArr[i20] = new m1(str4, uVarArr);
                    this.f55841c0 = i20;
                    i7 = 0;
                } else {
                    uVar2 = (i16 == 2 && s0.i(y13.f10451s)) ? null : null;
                    StringBuilder m10 = r.b.m(str4, ":muxed:");
                    m10.append(i20 < i15 ? i20 : i20 - 1);
                    String sb2 = m10.toString();
                    i7 = 0;
                    e2.t a10 = y(uVar2, y13, false).a();
                    a10.f10393l = str4;
                    m1VarArr[i20] = new m1(sb2, new u(a10));
                }
                i20++;
                i10 = i7;
            }
            int i22 = i10;
            this.Z = x(m1VarArr);
            if (this.f55837a0 == null) {
                z10 = 1;
            } else {
                z10 = i22;
            }
            ja.p(z10);
            this.f55837a0 = Collections.EMPTY_SET;
            this.U = true;
            this.f55840c.A0();
        }
    }

    public final void E() {
        this.f55858s.a();
        h hVar = this.d;
        x2.b bVar = hVar.f55788n;
        if (bVar == null) {
            Uri uri = hVar.f55789o;
            if (uri != null && uri.equals(hVar.f55790p)) {
                hVar.f55782g.h(hVar.f55789o);
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void F(m1[] m1VarArr, int... iArr) {
        this.Z = x(m1VarArr);
        this.f55837a0 = new HashSet();
        for (int i7 : iArr) {
            this.f55837a0.add(this.Z.a(i7));
        }
        this.f55841c0 = 0;
        this.I.post(new q2.d(this.f55840c, 3));
        this.U = true;
    }

    public final void G() {
        for (p pVar : this.M) {
            pVar.G(this.f55849i0);
        }
        this.f55849i0 = false;
    }

    public final boolean H(long j3, boolean z10) {
        i iVar;
        boolean z11;
        boolean z12;
        boolean J;
        this.f55847g0 = j3;
        if (C()) {
            this.f55848h0 = j3;
            return true;
        }
        boolean z13 = this.d.f55791q;
        ArrayList arrayList = this.E;
        if (z13) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                iVar = (i) arrayList.get(i7);
                if (iVar.h == j3) {
                    break;
                }
            }
        }
        iVar = null;
        if (this.T && !z10 && !arrayList.isEmpty()) {
            int length = this.M.length;
            for (int i10 = 0; i10 < length; i10++) {
                p pVar = this.M[i10];
                if (iVar != null) {
                    J = pVar.I(iVar.f(i10));
                } else {
                    long e10 = e();
                    if (e10 != Long.MIN_VALUE && j3 >= e10) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    J = pVar.J(j3, z12);
                }
                if (!J && (this.f55846f0[i10] || !this.f55842d0)) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        this.f55848h0 = j3;
        this.f55851k0 = false;
        arrayList.clear();
        b3.o oVar = this.f55858s;
        if (oVar.d()) {
            if (this.T) {
                for (p pVar2 : this.M) {
                    pVar2.l();
                }
            }
            oVar.b();
            return true;
        }
        oVar.f2918c = null;
        G();
        return true;
    }

    @Override
    public final void a() {
        this.I.post(this.G);
    }

    @Override
    public final boolean c(l2.s0 r79) {
        throw new UnsupportedOperationException("Method not decompiled: r2.q.c(l2.s0):boolean");
    }

    @Override
    public final void d() {
        p[] pVarArr;
        for (p pVar : this.M) {
            pVar.G(true);
            q2.h hVar = pVar.h;
            if (hVar != null) {
                hVar.c(pVar.f59476e);
                pVar.h = null;
                pVar.f59478g = null;
            }
        }
    }

    @Override
    public final void d1() {
        this.m0 = true;
        this.I.post(this.H);
    }

    @Override
    public final f3.i0 d2(int i7, int i10) {
        i iVar;
        Integer valueOf = Integer.valueOf(i10);
        Set set = f55835q0;
        boolean contains = set.contains(valueOf);
        boolean z10 = false;
        HashSet hashSet = this.O;
        SparseIntArray sparseIntArray = this.P;
        ?? r52 = 0;
        r52 = 0;
        if (contains) {
            ja.f(set.contains(Integer.valueOf(i10)));
            int i11 = sparseIntArray.get(i10, -1);
            if (i11 != -1) {
                if (hashSet.add(Integer.valueOf(i10))) {
                    this.N[i11] = i7;
                }
                r52 = this.N[i11] == i7 ? this.M[i11] : v(i7, i10);
            }
        } else {
            int i12 = 0;
            while (true) {
                ?? r12 = this.M;
                if (i12 >= r12.length) {
                    break;
                } else if (this.N[i12] == i7) {
                    r52 = r12[i12];
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (r52 == 0) {
            if (this.m0) {
                return v(i7, i10);
            }
            int length = this.M.length;
            if (i10 == 1 || i10 == 2) {
                z10 = true;
            }
            r52 = new p(this.f55843e, this.h, this.f55853n, this.K);
            r52.f59490t = this.f55847g0;
            if (z10) {
                r52.K = this.f55855o0;
                r52.B = true;
            }
            long j3 = this.f55854n0;
            if (r52.H != j3) {
                r52.H = j3;
                r52.B = true;
            }
            if (this.f55856p0 != null) {
                r52.E = iVar.f55798w;
            }
            r52.f59477f = this;
            int i13 = length + 1;
            int[] copyOf = Arrays.copyOf(this.N, i13);
            this.N = copyOf;
            copyOf[length] = i7;
            p[] pVarArr = this.M;
            String str = l0.f13471a;
            ?? copyOf2 = Arrays.copyOf(pVarArr, pVarArr.length + 1);
            copyOf2[pVarArr.length] = r52;
            this.M = (p[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f55846f0, i13);
            this.f55846f0 = copyOf3;
            copyOf3[length] = z10;
            this.f55842d0 |= z10;
            hashSet.add(Integer.valueOf(i10));
            sparseIntArray.append(i10, length);
            if (B(i10) > B(this.R)) {
                this.S = length;
                this.R = i10;
            }
            this.f55844e0 = Arrays.copyOf(this.f55844e0, i13);
        }
        if (i10 == 5) {
            if (this.Q == null) {
                this.Q = new o(r52, this.f55860x);
            }
            return this.Q;
        }
        return r52;
    }

    @Override
    public final long e() {
        if (C()) {
            return this.f55848h0;
        }
        if (this.f55851k0) {
            return Long.MIN_VALUE;
        }
        return A().f60120n;
    }

    @Override
    public final boolean g() {
        return this.f55858s.d();
    }

    @Override
    public final b3.i k(b3.l r24, long r25, long r27, java.io.IOException r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: r2.q.k(b3.l, long, long, java.io.IOException, int):b3.i");
    }

    @Override
    public final void m(b3.l lVar, long j3, long j10, boolean z10) {
        y2.f fVar = (y2.f) lVar;
        this.L = null;
        long j11 = fVar.f60115a;
        j2.m mVar = fVar.f60116b;
        b0 b0Var = fVar.f60121r;
        x2.t tVar = new x2.t(mVar, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        this.f55857r.getClass();
        this.f55859w.n(tVar, fVar.f60117c, this.f55838b, fVar.d, fVar.f60118e, fVar.f60119f, fVar.h, fVar.f60120n);
        if (!z10) {
            if (C() || this.V == 0) {
                G();
            }
            if (this.V > 0) {
                this.f55840c.f0(this);
            }
        }
    }

    public final void n() {
        ja.p(this.U);
        this.Z.getClass();
        this.f55837a0.getClass();
    }

    public final boolean q(int i7) {
        int i10 = i7;
        while (true) {
            ArrayList arrayList = this.E;
            if (i10 < arrayList.size()) {
                if (((i) arrayList.get(i10)).f55797c0) {
                    return false;
                }
                i10++;
            } else {
                i iVar = (i) arrayList.get(i7);
                for (int i11 = 0; i11 < this.M.length; i11++) {
                    if (this.M[i11].v() > iVar.f(i11)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    @Override
    public final void r(b3.l lVar, long j3, long j10, int i7) {
        x2.t tVar;
        y2.f fVar = (y2.f) lVar;
        if (i7 == 0) {
            long j11 = fVar.f60115a;
            tVar = new x2.t(fVar.f60116b, j3);
        } else {
            long j12 = fVar.f60115a;
            j2.m mVar = fVar.f60116b;
            b0 b0Var = fVar.f60121r;
            tVar = new x2.t(mVar, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        }
        this.f55859w.s(tVar, fVar.f60117c, this.f55838b, fVar.d, fVar.f60118e, fVar.f60119f, fVar.h, fVar.f60120n, i7);
    }

    @Override
    public final long s() {
        if (this.f55851k0) {
            return Long.MIN_VALUE;
        }
        if (C()) {
            return this.f55848h0;
        }
        long j3 = this.f55847g0;
        i A = A();
        if (!A.Y) {
            ArrayList arrayList = this.E;
            if (arrayList.size() > 1) {
                A = (i) i5.c.h(2, arrayList);
            } else {
                A = null;
            }
        }
        if (A != null) {
            j3 = Math.max(j3, A.f60120n);
        }
        if (this.T) {
            for (p pVar : this.M) {
                j3 = Math.max(j3, pVar.s());
            }
        }
        return j3;
    }

    @Override
    public final void u(long j3) {
        int size;
        b3.o oVar = this.f55858s;
        if (!oVar.c() && !C()) {
            boolean d = oVar.d();
            boolean z10 = false;
            boolean z11 = false;
            int i7 = 0;
            z10 = false;
            h hVar = this.d;
            List list = this.F;
            if (d) {
                this.L.getClass();
                y2.f fVar = this.L;
                if (hVar.f55788n == null) {
                    z11 = hVar.f55792r.k(j3, fVar, list);
                }
                if (z11) {
                    oVar.b();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0 && hVar.c((i) list.get(size2 - 1)) == 2) {
                size2--;
            }
            if (size2 < list.size()) {
                z(size2);
            }
            if (hVar.f55788n == null && hVar.f55792r.length() >= 2) {
                size = hVar.f55792r.j(j3, list);
            } else {
                size = list.size();
            }
            if (size < this.E.size()) {
                z(size);
            }
            if (this.T && this.f55852l0 != Long.MIN_VALUE) {
                boolean z12 = true;
                while (true) {
                    p[] pVarArr = this.M;
                    if (i7 >= pVarArr.length) {
                        break;
                    }
                    if (this.f55844e0[i7] && (this.f55846f0[i7] || !this.f55842d0)) {
                        z12 &= pVarArr[i7].z();
                    }
                    i7++;
                }
                z10 = z12;
            }
            if (z10) {
                this.f55851k0 = true;
            }
        }
    }

    @Override
    public final void w(b3.l lVar, long j3, long j10) {
        y2.f fVar = (y2.f) lVar;
        this.L = null;
        if (fVar instanceof d) {
            d dVar = (d) fVar;
            byte[] bArr = dVar.f55769s;
            h hVar = this.d;
            hVar.f55787m = bArr;
            ou ouVar = hVar.f55784j;
            Uri uri = dVar.f60116b.f16803a;
            byte[] bArr2 = dVar.f55771x;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((v) ouVar.f25804b).put(uri, bArr2);
        }
        long j11 = fVar.f60115a;
        j2.m mVar = fVar.f60116b;
        b0 b0Var = fVar.f60121r;
        x2.t tVar = new x2.t(mVar, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        this.f55857r.getClass();
        this.f55859w.o(tVar, fVar.f60117c, this.f55838b, fVar.d, fVar.f60118e, fVar.f60119f, fVar.h, fVar.f60120n);
        if (!this.U) {
            r0 r0Var = new r0();
            r0Var.f19172a = this.f55847g0;
            c(new l2.s0(r0Var));
            return;
        }
        this.f55840c.f0(this);
    }

    public final q1 x(m1[] m1VarArr) {
        for (int i7 = 0; i7 < m1VarArr.length; i7++) {
            m1 m1Var = m1VarArr[i7];
            u[] uVarArr = new u[m1Var.f10209a];
            for (int i10 = 0; i10 < m1Var.f10209a; i10++) {
                u uVar = m1Var.d[i10];
                int E1 = this.h.E1(uVar);
                e2.t a10 = uVar.a();
                a10.S = E1;
                uVarArr[i10] = new u(a10);
            }
            m1VarArr[i7] = new m1(m1Var.f10210b, uVarArr);
        }
        return new q1(m1VarArr);
    }

    public final void z(int i7) {
        ArrayList arrayList;
        ja.p(!this.f55858s.d());
        while (true) {
            arrayList = this.E;
            if (i7 < arrayList.size()) {
                if (q(i7)) {
                    break;
                }
                i7++;
            } else {
                i7 = -1;
                break;
            }
        }
        if (i7 == -1) {
            return;
        }
        long j3 = A().f60120n;
        i iVar = (i) arrayList.get(i7);
        l0.X(i7, arrayList.size(), arrayList);
        for (int i10 = 0; i10 < this.M.length; i10++) {
            this.M[i10].o(iVar.f(i10));
        }
        if (arrayList.isEmpty()) {
            this.f55848h0 = this.f55847g0;
        } else {
            ((i) h9.o.n(arrayList)).f55795a0 = true;
        }
        this.f55851k0 = false;
        this.f55859w.z(iVar.h, this.R, j3);
    }

    @Override
    public final void f(f3.b0 b0Var) {
    }
}
