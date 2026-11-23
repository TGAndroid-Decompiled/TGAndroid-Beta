package r2;

import a8.ma;
import a8.xa;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import e2.m1;
import e2.q0;
import e2.s0;
import e2.t;
import e2.u;
import f3.c0;
import f3.j0;
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
import l2.t0;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.web.z0;
import org.telegram.utils.twidget.w;
import x2.b1;
import x2.f1;
import x2.r1;
public final class p implements b3.k, b3.n, f1, f3.q, b1 {
    public static final Set f56532q0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
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
    public final String f56533a;
    public Set f56534a0;
    public final int f56535b;
    public int[] f56536b0;
    public final aa f56537c;
    public int f56538c0;
    public final h d;
    public boolean f56539d0;
    public final h6.m f56540e;
    public boolean[] f56541e0;
    public final u f56542f;
    public boolean[] f56543f0;
    public long f56544g0;
    public final q2.m h;
    public long f56545h0;
    public boolean f56546i0;
    public boolean f56547j0;
    public boolean f56548k0;
    public long f56549l0;
    public boolean m0;
    public final q2.j f56550n;
    public long f56551n0;
    public e2.r f56552o0;
    public i f56553p0;
    public final qb.a f56554r;
    public final b3.p f56555s;
    public final xa f56556w;
    public final int f56557x;
    public final androidx.activity.n f56558y;

    public p(String str, int i7, aa aaVar, h hVar, Map map, h6.m mVar, long j3, u uVar, q2.m mVar2, q2.j jVar, qb.a aVar, xa xaVar, int i10, c3.a aVar2) {
        b3.p pVar;
        this.f56533a = str;
        this.f56535b = i7;
        this.f56537c = aaVar;
        this.d = hVar;
        this.K = map;
        this.f56540e = mVar;
        this.f56542f = uVar;
        this.h = mVar2;
        this.f56550n = jVar;
        this.f56554r = aVar;
        this.f56556w = xaVar;
        this.f56557x = i10;
        if (aVar2 != null) {
            pVar = new b3.p(aVar2);
        } else {
            pVar = new b3.p("Loader:HlsSampleStreamWrapper");
        }
        this.f56555s = pVar;
        androidx.activity.n nVar = new androidx.activity.n(6);
        nVar.f1760c = null;
        nVar.f1759b = false;
        nVar.d = null;
        this.f56558y = nVar;
        this.N = new int[0];
        Set set = f56532q0;
        this.O = new HashSet(set.size());
        this.P = new SparseIntArray(set.size());
        this.M = new o[0];
        this.f56543f0 = new boolean[0];
        this.f56541e0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.E = arrayList;
        this.F = DesugarCollections.unmodifiableList(arrayList);
        this.J = new ArrayList();
        this.G = new Runnable(this) {
            public final p f56525b;

            {
                this.f56525b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f56525b.D();
                        return;
                    default:
                        p pVar2 = this.f56525b;
                        for (o oVar : pVar2.M) {
                            oVar.K(pVar2.f56549l0);
                        }
                        pVar2.T = true;
                        pVar2.D();
                        return;
                }
            }
        };
        this.H = new Runnable(this) {
            public final p f56525b;

            {
                this.f56525b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f56525b.D();
                        return;
                    default:
                        p pVar2 = this.f56525b;
                        for (o oVar : pVar2.M) {
                            oVar.K(pVar2.f56549l0);
                        }
                        pVar2.T = true;
                        pVar2.D();
                        return;
                }
            }
        };
        this.I = l0.q(null);
        this.f56544g0 = j3;
        this.f56545h0 = j3;
        this.f56549l0 = Long.MIN_VALUE;
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
        String str = uVar.f10751k;
        String str2 = uVar2.f10759s;
        int h = s0.h(str2);
        if (l0.v(h, str) == 1) {
            b10 = l0.w(h, str);
            str2 = s0.d(b10);
        } else {
            b10 = s0.b(str, str2);
        }
        uVar2.f10754n = uVar.f10754n;
        uVar2.f10755o = uVar.f10755o;
        uVar2.f10756p = uVar.f10756p;
        uVar2.f10757q = uVar.f10757q;
        t a10 = uVar2.a();
        a10.f10692a = uVar.f10743a;
        a10.f10693b = uVar.f10744b;
        a10.f10694c = i0.q(uVar.f10745c);
        a10.d = uVar.d;
        a10.f10695e = uVar.f10746e;
        a10.f10696f = uVar.f10747f;
        if (z10) {
            i7 = uVar.h;
        } else {
            i7 = -1;
        }
        a10.h = i7;
        if (z10) {
            i10 = uVar.f10749i;
        } else {
            i10 = -1;
        }
        a10.f10698i = i10;
        a10.f10699j = b10;
        a10.f10705p = uVar.f10756p;
        a10.f10703n = uVar.f10755o;
        a10.f10702m = uVar.f10754n;
        a10.f10704o = uVar.f10757q;
        if (h == 2) {
            a10.f10713y = uVar.f10765z;
            a10.f10714z = uVar.A;
            a10.C = uVar.D;
        }
        if (str2 != null) {
            a10.f10707r = s0.n(str2);
        }
        int i11 = uVar.K;
        if (i11 != -1 && h == 1) {
            a10.J = i11;
        }
        q0 q0Var = uVar.f10752l;
        if (q0Var != null) {
            q0 q0Var2 = uVar2.f10752l;
            if (q0Var2 != null) {
                q0Var = q0Var2.b(q0Var);
            }
            a10.f10700k = q0Var;
        }
        return new u(a10);
    }

    public final i A() {
        return (i) i5.c.h(1, this.E);
    }

    public final boolean C() {
        if (this.f56545h0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void D() {
        boolean z10;
        int i7;
        u y10;
        if (!this.Y && this.f56536b0 == null && this.T) {
            int i10 = 0;
            for (o oVar : this.M) {
                if (oVar.y() == null) {
                    return;
                }
            }
            r1 r1Var = this.Z;
            if (r1Var != null) {
                int i11 = r1Var.f60341a;
                int[] iArr = new int[i11];
                this.f56536b0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        o[] oVarArr = this.M;
                        if (i13 < oVarArr.length) {
                            u y11 = oVarArr[i13].y();
                            y11.getClass();
                            u uVar = this.Z.a(i12).d[0];
                            String str = y11.f10759s;
                            String str2 = uVar.f10759s;
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
                    this.f56536b0[i12] = i13;
                }
                ArrayList arrayList = this.J;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((l) obj).c();
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
                String str3 = y12.f10759s;
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
            int i18 = m1Var.f10517a;
            this.f56538c0 = -1;
            this.f56536b0 = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.f56536b0[i19] = i19;
            }
            m1[] m1VarArr = new m1[length];
            int i20 = 0;
            while (i20 < length) {
                u y13 = this.M[i20].y();
                y13.getClass();
                u uVar2 = this.f56542f;
                String str4 = this.f56533a;
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
                    this.f56538c0 = i20;
                    i7 = 0;
                } else {
                    uVar2 = (i16 == 2 && s0.i(y13.f10759s)) ? null : null;
                    StringBuilder n10 = p5.c.n(str4, ":muxed:");
                    n10.append(i20 < i15 ? i20 : i20 - 1);
                    String sb2 = n10.toString();
                    i7 = 0;
                    t a10 = y(uVar2, y13, false).a();
                    a10.f10701l = str4;
                    m1VarArr[i20] = new m1(sb2, new u(a10));
                }
                i20++;
                i10 = i7;
            }
            int i22 = i10;
            this.Z = w(m1VarArr);
            if (this.f56534a0 == null) {
                z10 = 1;
            } else {
                z10 = i22;
            }
            ma.p(z10);
            this.f56534a0 = Collections.EMPTY_SET;
            this.U = true;
            this.f56537c.H2();
        }
    }

    public final void E() {
        this.f56555s.a();
        h hVar = this.d;
        x2.b bVar = hVar.f56486n;
        if (bVar == null) {
            Uri uri = hVar.f56487o;
            if (uri != null && uri.equals(hVar.f56488p)) {
                hVar.f56480g.h(hVar.f56487o);
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void F(m1[] m1VarArr, int... iArr) {
        this.Z = w(m1VarArr);
        this.f56534a0 = new HashSet();
        for (int i7 : iArr) {
            this.f56534a0.add(this.Z.a(i7));
        }
        this.f56538c0 = 0;
        this.I.post(new z0(this.f56537c, 6));
        this.U = true;
    }

    public final void G() {
        for (o oVar : this.M) {
            oVar.G(this.f56546i0);
        }
        this.f56546i0 = false;
    }

    public final boolean H(long j3, boolean z10) {
        i iVar;
        boolean z11;
        boolean z12;
        boolean J;
        this.f56544g0 = j3;
        if (C()) {
            this.f56545h0 = j3;
            return true;
        }
        boolean z13 = this.d.f56489q;
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
                    long f10 = f();
                    if (f10 != Long.MIN_VALUE && j3 >= f10) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    J = oVar.J(j3, z12);
                }
                if (!J && (this.f56543f0[i10] || !this.f56539d0)) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        this.f56545h0 = j3;
        this.f56548k0 = false;
        arrayList.clear();
        b3.p pVar = this.f56555s;
        if (pVar.d()) {
            if (this.T) {
                for (o oVar2 : this.M) {
                    oVar2.l();
                }
            }
            pVar.b();
            return true;
        }
        pVar.f2887c = null;
        G();
        return true;
    }

    @Override
    public final void Z0() {
        this.m0 = true;
        this.I.post(this.H);
    }

    @Override
    public final void a() {
        this.I.post(this.G);
    }

    public final void b() {
        ma.p(this.U);
        this.Z.getClass();
        this.f56534a0.getClass();
    }

    @Override
    public final boolean d(l2.t0 r79) {
        throw new UnsupportedOperationException("Method not decompiled: r2.p.d(l2.t0):boolean");
    }

    @Override
    public final j0 d2(int i7, int i10) {
        i iVar;
        Integer valueOf = Integer.valueOf(i10);
        Set set = f56532q0;
        boolean contains = set.contains(valueOf);
        boolean z10 = false;
        HashSet hashSet = this.O;
        SparseIntArray sparseIntArray = this.P;
        ?? r52 = 0;
        r52 = 0;
        if (contains) {
            ma.f(set.contains(Integer.valueOf(i10)));
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
            r52 = new o(this.f56540e, this.h, this.f56550n, this.K);
            r52.f60195t = this.f56544g0;
            if (z10) {
                r52.K = this.f56552o0;
                r52.B = true;
            }
            long j3 = this.f56551n0;
            if (r52.H != j3) {
                r52.H = j3;
                r52.B = true;
            }
            if (this.f56553p0 != null) {
                r52.E = iVar.f56496w;
            }
            r52.f60182f = this;
            int i13 = length + 1;
            int[] copyOf = Arrays.copyOf(this.N, i13);
            this.N = copyOf;
            copyOf[length] = i7;
            o[] oVarArr = this.M;
            String str = l0.f13778a;
            ?? copyOf2 = Arrays.copyOf(oVarArr, oVarArr.length + 1);
            copyOf2[oVarArr.length] = r52;
            this.M = (o[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f56543f0, i13);
            this.f56543f0 = copyOf3;
            copyOf3[length] = z10;
            this.f56539d0 |= z10;
            hashSet.add(Integer.valueOf(i10));
            sparseIntArray.append(i10, length);
            if (B(i10) > B(this.R)) {
                this.S = length;
                this.R = i10;
            }
            this.f56541e0 = Arrays.copyOf(this.f56541e0, i13);
        }
        if (i10 == 5) {
            if (this.Q == null) {
                this.Q = new n(r52, this.f56557x);
            }
            return this.Q;
        }
        return r52;
    }

    @Override
    public final void e() {
        o[] oVarArr;
        for (o oVar : this.M) {
            oVar.G(true);
            q2.g gVar = oVar.h;
            if (gVar != null) {
                gVar.c(oVar.f60181e);
                oVar.h = null;
                oVar.f60183g = null;
            }
        }
    }

    @Override
    public final long f() {
        if (C()) {
            return this.f56545h0;
        }
        if (this.f56548k0) {
            return Long.MIN_VALUE;
        }
        return A().f60814n;
    }

    @Override
    public final boolean g() {
        return this.f56555s.d();
    }

    @Override
    public final b3.i k(b3.m r24, long r25, long r27, java.io.IOException r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: r2.p.k(b3.m, long, long, java.io.IOException, int):b3.i");
    }

    @Override
    public final void m(b3.m mVar, long j3, long j10, boolean z10) {
        y2.f fVar = (y2.f) mVar;
        this.L = null;
        long j11 = fVar.f60809a;
        j2.m mVar2 = fVar.f60810b;
        b0 b0Var = fVar.f60815r;
        x2.u uVar = new x2.u(mVar2, b0Var.f17244c, b0Var.d, j3, j10, b0Var.f17243b);
        this.f56554r.getClass();
        this.f56556w.n(uVar, fVar.f60811c, this.f56535b, fVar.d, fVar.f60812e, fVar.f60813f, fVar.h, fVar.f60814n);
        if (!z10) {
            if (C() || this.V == 0) {
                G();
            }
            if (this.V > 0) {
                this.f56537c.i2(this);
            }
        }
    }

    public final boolean o(int i7) {
        int i10 = i7;
        while (true) {
            ArrayList arrayList = this.E;
            if (i10 < arrayList.size()) {
                if (((i) arrayList.get(i10)).f56495c0) {
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
    public final long r() {
        if (this.f56548k0) {
            return Long.MIN_VALUE;
        }
        if (C()) {
            return this.f56545h0;
        }
        long j3 = this.f56544g0;
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
            j3 = Math.max(j3, A.f60814n);
        }
        if (this.T) {
            for (o oVar : this.M) {
                j3 = Math.max(j3, oVar.s());
            }
        }
        return j3;
    }

    @Override
    public final void t(b3.m mVar, long j3, long j10, int i7) {
        x2.u uVar;
        y2.f fVar = (y2.f) mVar;
        if (i7 == 0) {
            long j11 = fVar.f60809a;
            uVar = new x2.u(fVar.f60810b, j3);
        } else {
            long j12 = fVar.f60809a;
            j2.m mVar2 = fVar.f60810b;
            b0 b0Var = fVar.f60815r;
            uVar = new x2.u(mVar2, b0Var.f17244c, b0Var.d, j3, j10, b0Var.f17243b);
        }
        this.f56556w.s(uVar, fVar.f60811c, this.f56535b, fVar.d, fVar.f60812e, fVar.f60813f, fVar.h, fVar.f60814n, i7);
    }

    @Override
    public final void u(long j3) {
        int size;
        b3.p pVar = this.f56555s;
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
                if (hVar.f56486n == null) {
                    z11 = hVar.f56490r.k(j3, fVar, list);
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
                z(size2);
            }
            if (hVar.f56486n == null && hVar.f56490r.length() >= 2) {
                size = hVar.f56490r.j(j3, list);
            } else {
                size = list.size();
            }
            if (size < this.E.size()) {
                z(size);
            }
            if (this.T && this.f56549l0 != Long.MIN_VALUE) {
                boolean z12 = true;
                while (true) {
                    o[] oVarArr = this.M;
                    if (i7 >= oVarArr.length) {
                        break;
                    }
                    if (this.f56541e0[i7] && (this.f56543f0[i7] || !this.f56539d0)) {
                        z12 &= oVarArr[i7].z();
                    }
                    i7++;
                }
                z10 = z12;
            }
            if (z10) {
                this.f56548k0 = true;
            }
        }
    }

    public final r1 w(m1[] m1VarArr) {
        for (int i7 = 0; i7 < m1VarArr.length; i7++) {
            m1 m1Var = m1VarArr[i7];
            u[] uVarArr = new u[m1Var.f10517a];
            for (int i10 = 0; i10 < m1Var.f10517a; i10++) {
                u uVar = m1Var.d[i10];
                int E1 = this.h.E1(uVar);
                t a10 = uVar.a();
                a10.S = E1;
                uVarArr[i10] = new u(a10);
            }
            m1VarArr[i7] = new m1(m1Var.f10518b, uVarArr);
        }
        return new r1(m1VarArr);
    }

    @Override
    public final void x(b3.m mVar, long j3, long j10) {
        y2.f fVar = (y2.f) mVar;
        this.L = null;
        if (fVar instanceof d) {
            d dVar = (d) fVar;
            byte[] bArr = dVar.f56467s;
            h hVar = this.d;
            hVar.f56485m = bArr;
            nd0 nd0Var = hVar.f56482j;
            Uri uri = dVar.f60810b.f17276a;
            byte[] bArr2 = dVar.f56469x;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((w) nd0Var.f37766b).put(uri, bArr2);
        }
        long j11 = fVar.f60809a;
        j2.m mVar2 = fVar.f60810b;
        b0 b0Var = fVar.f60815r;
        x2.u uVar = new x2.u(mVar2, b0Var.f17244c, b0Var.d, j3, j10, b0Var.f17243b);
        this.f56554r.getClass();
        this.f56556w.o(uVar, fVar.f60811c, this.f56535b, fVar.d, fVar.f60812e, fVar.f60813f, fVar.h, fVar.f60814n);
        if (!this.U) {
            l2.s0 s0Var = new l2.s0();
            s0Var.f19637a = this.f56544g0;
            d(new t0(s0Var));
            return;
        }
        this.f56537c.i2(this);
    }

    public final void z(int i7) {
        ArrayList arrayList;
        ma.p(!this.f56555s.d());
        while (true) {
            arrayList = this.E;
            if (i7 < arrayList.size()) {
                if (o(i7)) {
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
        long j3 = A().f60814n;
        i iVar = (i) arrayList.get(i7);
        l0.X(i7, arrayList.size(), arrayList);
        for (int i10 = 0; i10 < this.M.length; i10++) {
            this.M[i10].o(iVar.f(i10));
        }
        if (arrayList.isEmpty()) {
            this.f56545h0 = this.f56544g0;
        } else {
            ((i) h9.o.n(arrayList)).f56493a0 = true;
        }
        this.f56548k0 = false;
        this.f56556w.A(iVar.h, this.R, j3);
    }

    @Override
    public final void h(c0 c0Var) {
    }
}
