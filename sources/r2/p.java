package r2;

import a8.la;
import a8.xa;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import e2.m1;
import e2.q0;
import e2.s0;
import e2.t;
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
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.of;
import org.telegram.ui.web.z0;
import org.telegram.utils.twidget.w;
import x2.b1;
import x2.f1;
import x2.r1;
public final class p implements b3.k, b3.n, f1, f3.q, b1 {
    public static final Set f56409q0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final ArrayList E;
    public final List F;
    public final m G;
    public final m H;
    public final Handler I;
    public final ArrayList J;
    public final Map K;
    public y2.f L;
    public o[] M;
    public int[] N;
    public final HashSet O;
    public final SparseIntArray P;
    public n Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public int V;
    public u W;
    public u X;
    public boolean Y;
    public r1 Z;
    public final String f56410a;
    public Set f56411a0;
    public final int f56412b;
    public int[] f56413b0;
    public final of f56414c;
    public int f56415c0;
    public final h d;
    public boolean f56416d0;
    public final h6.m f56417e;
    public boolean[] f56418e0;
    public final u f56419f;
    public boolean[] f56420f0;
    public long f56421g0;
    public final q2.m h;
    public long f56422h0;
    public boolean f56423i0;
    public boolean f56424j0;
    public boolean f56425k0;
    public long f56426l0;
    public boolean m0;
    public final q2.j f56427n;
    public long f56428n0;
    public e2.r f56429o0;
    public i f56430p0;
    public final qb.a f56431r;
    public final b3.p f56432s;
    public final xa f56433w;
    public final int f56434x;
    public final androidx.activity.n f56435y;

    public p(String str, int i7, of ofVar, h hVar, Map map, h6.m mVar, long j3, u uVar, q2.m mVar2, q2.j jVar, qb.a aVar, xa xaVar, int i10, c3.a aVar2) {
        b3.p pVar;
        this.f56410a = str;
        this.f56412b = i7;
        this.f56414c = ofVar;
        this.d = hVar;
        this.K = map;
        this.f56417e = mVar;
        this.f56419f = uVar;
        this.h = mVar2;
        this.f56427n = jVar;
        this.f56431r = aVar;
        this.f56433w = xaVar;
        this.f56434x = i10;
        if (aVar2 != null) {
            pVar = new b3.p(aVar2);
        } else {
            pVar = new b3.p("Loader:HlsSampleStreamWrapper");
        }
        this.f56432s = pVar;
        androidx.activity.n nVar = new androidx.activity.n(6);
        nVar.f1789c = null;
        nVar.f1788b = false;
        nVar.d = null;
        this.f56435y = nVar;
        this.N = new int[0];
        Set set = f56409q0;
        this.O = new HashSet(set.size());
        this.P = new SparseIntArray(set.size());
        this.M = new o[0];
        this.f56420f0 = new boolean[0];
        this.f56418e0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.E = arrayList;
        this.F = DesugarCollections.unmodifiableList(arrayList);
        this.J = new ArrayList();
        this.G = new Runnable(this) {
            public final p f56402b;

            {
                this.f56402b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f56402b.D();
                        return;
                    default:
                        p pVar2 = this.f56402b;
                        for (o oVar : pVar2.M) {
                            oVar.K(pVar2.f56426l0);
                        }
                        pVar2.T = true;
                        pVar2.D();
                        return;
                }
            }
        };
        this.H = new Runnable(this) {
            public final p f56402b;

            {
                this.f56402b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f56402b.D();
                        return;
                    default:
                        p pVar2 = this.f56402b;
                        for (o oVar : pVar2.M) {
                            oVar.K(pVar2.f56426l0);
                        }
                        pVar2.T = true;
                        pVar2.D();
                        return;
                }
            }
        };
        this.I = l0.q(null);
        this.f56421g0 = j3;
        this.f56422h0 = j3;
        this.f56426l0 = Long.MIN_VALUE;
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

    public static u x(u uVar, u uVar2, boolean z10) {
        String b10;
        int i7;
        int i10;
        if (uVar == null) {
            return uVar2;
        }
        String str = uVar.f10758k;
        String str2 = uVar2.f10766s;
        int h = s0.h(str2);
        if (l0.v(h, str) == 1) {
            b10 = l0.w(h, str);
            str2 = s0.d(b10);
        } else {
            b10 = s0.b(str, str2);
        }
        uVar2.f10761n = uVar.f10761n;
        uVar2.f10762o = uVar.f10762o;
        uVar2.f10763p = uVar.f10763p;
        uVar2.f10764q = uVar.f10764q;
        t a10 = uVar2.a();
        a10.f10699a = uVar.f10750a;
        a10.f10700b = uVar.f10751b;
        a10.f10701c = i0.q(uVar.f10752c);
        a10.d = uVar.d;
        a10.f10702e = uVar.f10753e;
        a10.f10703f = uVar.f10754f;
        if (z10) {
            i7 = uVar.h;
        } else {
            i7 = -1;
        }
        a10.h = i7;
        if (z10) {
            i10 = uVar.f10756i;
        } else {
            i10 = -1;
        }
        a10.f10705i = i10;
        a10.f10706j = b10;
        a10.f10712p = uVar.f10763p;
        a10.f10710n = uVar.f10762o;
        a10.f10709m = uVar.f10761n;
        a10.f10711o = uVar.f10764q;
        if (h == 2) {
            a10.f10720y = uVar.f10772z;
            a10.f10721z = uVar.A;
            a10.C = uVar.D;
        }
        if (str2 != null) {
            a10.f10714r = s0.n(str2);
        }
        int i11 = uVar.K;
        if (i11 != -1 && h == 1) {
            a10.J = i11;
        }
        q0 q0Var = uVar.f10759l;
        if (q0Var != null) {
            q0 q0Var2 = uVar2.f10759l;
            if (q0Var2 != null) {
                q0Var = q0Var2.b(q0Var);
            }
            a10.f10707k = q0Var;
        }
        return new u(a10);
    }

    public final i A() {
        return (i) i5.c.h(1, this.E);
    }

    public final boolean C() {
        if (this.f56422h0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void D() {
        boolean z10;
        int i7;
        u x10;
        if (!this.Y && this.f56413b0 == null && this.T) {
            int i10 = 0;
            for (o oVar : this.M) {
                if (oVar.y() == null) {
                    return;
                }
            }
            r1 r1Var = this.Z;
            if (r1Var != null) {
                int i11 = r1Var.f60213a;
                int[] iArr = new int[i11];
                this.f56413b0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        o[] oVarArr = this.M;
                        if (i13 < oVarArr.length) {
                            u y10 = oVarArr[i13].y();
                            y10.getClass();
                            u uVar = this.Z.a(i12).d[0];
                            String str = y10.f10766s;
                            String str2 = uVar.f10766s;
                            int h = s0.h(str);
                            if (h != 3) {
                                if (h == s0.h(str2)) {
                                    break;
                                }
                                i13++;
                            } else {
                                if (!Objects.equals(str, str2)) {
                                    continue;
                                } else if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || y10.P == uVar.P) {
                                    break;
                                }
                                i13++;
                            }
                        }
                    }
                    this.f56413b0[i12] = i13;
                }
                ArrayList arrayList = this.J;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((l) obj).b();
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
                u y11 = this.M[i14].y();
                y11.getClass();
                String str3 = y11.f10766s;
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
            int i18 = m1Var.f10524a;
            this.f56415c0 = -1;
            this.f56413b0 = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.f56413b0[i19] = i19;
            }
            m1[] m1VarArr = new m1[length];
            int i20 = 0;
            while (i20 < length) {
                u y12 = this.M[i20].y();
                y12.getClass();
                u uVar2 = this.f56419f;
                String str4 = this.f56410a;
                if (i20 == i15) {
                    u[] uVarArr = new u[i18];
                    for (int i21 = i10; i21 < i18; i21++) {
                        u uVar3 = m1Var.d[i21];
                        if (i16 == 1 && uVar2 != null) {
                            uVar3 = uVar3.d(uVar2);
                        }
                        if (i18 == 1) {
                            x10 = y12.d(uVar3);
                        } else {
                            x10 = x(uVar3, y12, true);
                        }
                        uVarArr[i21] = x10;
                    }
                    m1VarArr[i20] = new m1(str4, uVarArr);
                    this.f56415c0 = i20;
                    i7 = 0;
                } else {
                    uVar2 = (i16 == 2 && s0.i(y12.f10766s)) ? null : null;
                    StringBuilder n10 = p5.c.n(str4, ":muxed:");
                    n10.append(i20 < i15 ? i20 : i20 - 1);
                    String sb2 = n10.toString();
                    i7 = 0;
                    t a10 = x(uVar2, y12, false).a();
                    a10.f10708l = str4;
                    m1VarArr[i20] = new m1(sb2, new u(a10));
                }
                i20++;
                i10 = i7;
            }
            int i22 = i10;
            this.Z = w(m1VarArr);
            if (this.f56411a0 == null) {
                z10 = 1;
            } else {
                z10 = i22;
            }
            la.p(z10);
            this.f56411a0 = Collections.EMPTY_SET;
            this.U = true;
            this.f56414c.v0();
        }
    }

    public final void E() {
        this.f56432s.a();
        h hVar = this.d;
        x2.b bVar = hVar.f56363n;
        if (bVar == null) {
            Uri uri = hVar.f56364o;
            if (uri != null && uri.equals(hVar.f56365p)) {
                hVar.f56357g.h(hVar.f56364o);
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void F(m1[] m1VarArr, int... iArr) {
        this.Z = w(m1VarArr);
        this.f56411a0 = new HashSet();
        for (int i7 : iArr) {
            this.f56411a0.add(this.Z.a(i7));
        }
        this.f56415c0 = 0;
        this.I.post(new z0(this.f56414c, 6));
        this.U = true;
    }

    public final void G() {
        for (o oVar : this.M) {
            oVar.G(this.f56423i0);
        }
        this.f56423i0 = false;
    }

    public final boolean H(long j3, boolean z10) {
        i iVar;
        boolean z11;
        boolean z12;
        boolean J;
        this.f56421g0 = j3;
        if (C()) {
            this.f56422h0 = j3;
            return true;
        }
        boolean z13 = this.d.f56366q;
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
                o oVar = this.M[i10];
                if (iVar != null) {
                    J = oVar.I(iVar.f(i10));
                } else {
                    long e10 = e();
                    if (e10 != Long.MIN_VALUE && j3 >= e10) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    J = oVar.J(j3, z12);
                }
                if (!J && (this.f56420f0[i10] || !this.f56416d0)) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        this.f56422h0 = j3;
        this.f56425k0 = false;
        arrayList.clear();
        b3.p pVar = this.f56432s;
        if (pVar.d()) {
            if (this.T) {
                for (o oVar2 : this.M) {
                    oVar2.l();
                }
            }
            pVar.b();
            return true;
        }
        pVar.f2916c = null;
        G();
        return true;
    }

    @Override
    public final void a() {
        this.I.post(this.G);
    }

    @Override
    public final boolean c(l2.s0 r79) {
        throw new UnsupportedOperationException("Method not decompiled: r2.p.c(l2.s0):boolean");
    }

    @Override
    public final void d() {
        o[] oVarArr;
        for (o oVar : this.M) {
            oVar.G(true);
            q2.g gVar = oVar.h;
            if (gVar != null) {
                gVar.c(oVar.f60053e);
                oVar.h = null;
                oVar.f60055g = null;
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
        Set set = f56409q0;
        boolean contains = set.contains(valueOf);
        boolean z10 = false;
        HashSet hashSet = this.O;
        SparseIntArray sparseIntArray = this.P;
        ?? r52 = 0;
        r52 = 0;
        if (contains) {
            la.f(set.contains(Integer.valueOf(i10)));
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
            r52 = new o(this.f56417e, this.h, this.f56427n, this.K);
            r52.f60067t = this.f56421g0;
            if (z10) {
                r52.K = this.f56429o0;
                r52.B = true;
            }
            long j3 = this.f56428n0;
            if (r52.H != j3) {
                r52.H = j3;
                r52.B = true;
            }
            if (this.f56430p0 != null) {
                r52.E = iVar.f56373w;
            }
            r52.f60054f = this;
            int i13 = length + 1;
            int[] copyOf = Arrays.copyOf(this.N, i13);
            this.N = copyOf;
            copyOf[length] = i7;
            o[] oVarArr = this.M;
            String str = l0.f13783a;
            ?? copyOf2 = Arrays.copyOf(oVarArr, oVarArr.length + 1);
            copyOf2[oVarArr.length] = r52;
            this.M = (o[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f56420f0, i13);
            this.f56420f0 = copyOf3;
            copyOf3[length] = z10;
            this.f56416d0 |= z10;
            hashSet.add(Integer.valueOf(i10));
            sparseIntArray.append(i10, length);
            if (B(i10) > B(this.R)) {
                this.S = length;
                this.R = i10;
            }
            this.f56418e0 = Arrays.copyOf(this.f56418e0, i13);
        }
        if (i10 == 5) {
            if (this.Q == null) {
                this.Q = new n(r52, this.f56434x);
            }
            return this.Q;
        }
        return r52;
    }

    @Override
    public final long e() {
        if (C()) {
            return this.f56422h0;
        }
        if (this.f56425k0) {
            return Long.MIN_VALUE;
        }
        return A().f60686n;
    }

    @Override
    public final boolean g() {
        return this.f56432s.d();
    }

    public final void h() {
        la.p(this.U);
        this.Z.getClass();
        this.f56411a0.getClass();
    }

    @Override
    public final b3.i l(b3.m r24, long r25, long r27, java.io.IOException r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: r2.p.l(b3.m, long, long, java.io.IOException, int):b3.i");
    }

    public final boolean m(int i7) {
        int i10 = i7;
        while (true) {
            ArrayList arrayList = this.E;
            if (i10 < arrayList.size()) {
                if (((i) arrayList.get(i10)).f56372c0) {
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
    public final void p(b3.m mVar, long j3, long j10, boolean z10) {
        y2.f fVar = (y2.f) mVar;
        this.L = null;
        long j11 = fVar.f60681a;
        j2.m mVar2 = fVar.f60682b;
        b0 b0Var = fVar.f60687r;
        x2.u uVar = new x2.u(mVar2, b0Var.f17153c, b0Var.d, j3, j10, b0Var.f17152b);
        this.f56431r.getClass();
        this.f56433w.o(uVar, fVar.f60683c, this.f56412b, fVar.d, fVar.f60684e, fVar.f60685f, fVar.h, fVar.f60686n);
        if (!z10) {
            if (C() || this.V == 0) {
                G();
            }
            if (this.V > 0) {
                this.f56414c.c0(this);
            }
        }
    }

    @Override
    public final long r() {
        if (this.f56425k0) {
            return Long.MIN_VALUE;
        }
        if (C()) {
            return this.f56422h0;
        }
        long j3 = this.f56421g0;
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
            j3 = Math.max(j3, A.f60686n);
        }
        if (this.T) {
            for (o oVar : this.M) {
                j3 = Math.max(j3, oVar.s());
            }
        }
        return j3;
    }

    @Override
    public final void s(b3.m mVar, long j3, long j10, int i7) {
        x2.u uVar;
        y2.f fVar = (y2.f) mVar;
        if (i7 == 0) {
            long j11 = fVar.f60681a;
            uVar = new x2.u(fVar.f60682b, j3);
        } else {
            long j12 = fVar.f60681a;
            j2.m mVar2 = fVar.f60682b;
            b0 b0Var = fVar.f60687r;
            uVar = new x2.u(mVar2, b0Var.f17153c, b0Var.d, j3, j10, b0Var.f17152b);
        }
        this.f56433w.u(uVar, fVar.f60683c, this.f56412b, fVar.d, fVar.f60684e, fVar.f60685f, fVar.h, fVar.f60686n, i7);
    }

    @Override
    public final void u(long j3) {
        int size;
        b3.p pVar = this.f56432s;
        if (!pVar.c() && !C()) {
            boolean d = pVar.d();
            boolean z10 = false;
            boolean z11 = false;
            int i7 = 0;
            z10 = false;
            h hVar = this.d;
            List list = this.F;
            if (d) {
                this.L.getClass();
                y2.f fVar = this.L;
                if (hVar.f56363n == null) {
                    z11 = hVar.f56367r.k(j3, fVar, list);
                }
                if (z11) {
                    pVar.b();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0 && hVar.c((i) list.get(size2 - 1)) == 2) {
                size2--;
            }
            if (size2 < list.size()) {
                y(size2);
            }
            if (hVar.f56363n == null && hVar.f56367r.length() >= 2) {
                size = hVar.f56367r.j(j3, list);
            } else {
                size = list.size();
            }
            if (size < this.E.size()) {
                y(size);
            }
            if (this.T && this.f56426l0 != Long.MIN_VALUE) {
                boolean z12 = true;
                while (true) {
                    o[] oVarArr = this.M;
                    if (i7 >= oVarArr.length) {
                        break;
                    }
                    if (this.f56418e0[i7] && (this.f56420f0[i7] || !this.f56416d0)) {
                        z12 &= oVarArr[i7].z();
                    }
                    i7++;
                }
                z10 = z12;
            }
            if (z10) {
                this.f56425k0 = true;
            }
        }
    }

    public final r1 w(m1[] m1VarArr) {
        for (int i7 = 0; i7 < m1VarArr.length; i7++) {
            m1 m1Var = m1VarArr[i7];
            u[] uVarArr = new u[m1Var.f10524a];
            for (int i10 = 0; i10 < m1Var.f10524a; i10++) {
                u uVar = m1Var.d[i10];
                int E1 = this.h.E1(uVar);
                t a10 = uVar.a();
                a10.S = E1;
                uVarArr[i10] = new u(a10);
            }
            m1VarArr[i7] = new m1(m1Var.f10525b, uVarArr);
        }
        return new r1(m1VarArr);
    }

    public final void y(int i7) {
        ArrayList arrayList;
        la.p(!this.f56432s.d());
        while (true) {
            arrayList = this.E;
            if (i7 < arrayList.size()) {
                if (m(i7)) {
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
        long j3 = A().f60686n;
        i iVar = (i) arrayList.get(i7);
        l0.X(i7, arrayList.size(), arrayList);
        for (int i10 = 0; i10 < this.M.length; i10++) {
            this.M[i10].o(iVar.f(i10));
        }
        if (arrayList.isEmpty()) {
            this.f56422h0 = this.f56421g0;
        } else {
            ((i) h9.o.n(arrayList)).f56370a0 = true;
        }
        this.f56425k0 = false;
        this.f56433w.B(iVar.h, this.R, j3);
    }

    @Override
    public final void z(b3.m mVar, long j3, long j10) {
        y2.f fVar = (y2.f) mVar;
        this.L = null;
        if (fVar instanceof d) {
            d dVar = (d) fVar;
            byte[] bArr = dVar.f56344s;
            h hVar = this.d;
            hVar.f56362m = bArr;
            hn hnVar = hVar.f56359j;
            Uri uri = dVar.f60682b.f17185a;
            byte[] bArr2 = dVar.f56346x;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((w) hnVar.f35933b).put(uri, bArr2);
        }
        long j11 = fVar.f60681a;
        j2.m mVar2 = fVar.f60682b;
        b0 b0Var = fVar.f60687r;
        x2.u uVar = new x2.u(mVar2, b0Var.f17153c, b0Var.d, j3, j10, b0Var.f17152b);
        this.f56431r.getClass();
        this.f56433w.p(uVar, fVar.f60683c, this.f56412b, fVar.d, fVar.f60684e, fVar.f60685f, fVar.h, fVar.f60686n);
        if (!this.U) {
            r0 r0Var = new r0();
            r0Var.f19536a = this.f56421g0;
            c(new l2.s0(r0Var));
            return;
        }
        this.f56414c.c0(this);
    }

    @Override
    public final void j(f3.b0 b0Var) {
    }
}
