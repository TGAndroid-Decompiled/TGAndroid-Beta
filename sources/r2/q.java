package r2;

import a8.ia;
import a8.wa;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import e2.m1;
import e2.q0;
import e2.s0;
import e2.u;
import f3.j0;
import h2.m0;
import h9.i0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j2.c0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l2.u0;
import l2.v0;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.uy;
import x2.a1;
import x2.e1;
import x2.q1;
public final class q implements b3.j, b3.m, e1, f3.q, a1 {
    public static final Set f54236p0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final ArrayList D;
    public final List E;
    public final n F;
    public final n G;
    public final Handler H;
    public final ArrayList I;
    public final Map J;
    public y2.f K;
    public p[] L;
    public int[] M;
    public final HashSet N;
    public final SparseIntArray O;
    public o P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public int U;
    public u V;
    public u W;
    public boolean X;
    public q1 Y;
    public Set Z;
    public final String f54237a;
    public int[] f54238a0;
    public final int f54239b;
    public int f54240b0;
    public final qt f54241c;
    public boolean f54242c0;
    public final i d;
    public boolean[] f54243d0;
    public final h6.m f54244e;
    public boolean[] f54245e0;
    public final u f54246f;
    public long f54247f0;
    public long f54248g0;
    public final q2.m h;
    public boolean f54249h0;
    public boolean f54250i0;
    public boolean f54251j0;
    public long f54252k0;
    public boolean f54253l0;
    public long m0;
    public final q2.j f54254n;
    public e2.r f54255n0;
    public j f54256o0;
    public final pb.b f54257r;
    public final b3.o f54258s;
    public final wa f54259w;
    public final int f54260x;
    public final androidx.activity.n f54261y;

    public q(String str, int i7, qt qtVar, i iVar, Map map, h6.m mVar, long j3, u uVar, q2.m mVar2, q2.j jVar, pb.b bVar, wa waVar, int i10, c3.a aVar) {
        b3.o oVar;
        this.f54237a = str;
        this.f54239b = i7;
        this.f54241c = qtVar;
        this.d = iVar;
        this.J = map;
        this.f54244e = mVar;
        this.f54246f = uVar;
        this.h = mVar2;
        this.f54254n = jVar;
        this.f54257r = bVar;
        this.f54259w = waVar;
        this.f54260x = i10;
        if (aVar != null) {
            oVar = new b3.o(aVar);
        } else {
            oVar = new b3.o("Loader:HlsSampleStreamWrapper");
        }
        this.f54258s = oVar;
        androidx.activity.n nVar = new androidx.activity.n(5);
        nVar.f1847c = null;
        nVar.f1846b = false;
        nVar.d = null;
        this.f54261y = nVar;
        this.M = new int[0];
        Set set = f54236p0;
        this.N = new HashSet(set.size());
        this.O = new SparseIntArray(set.size());
        this.L = new p[0];
        this.f54245e0 = new boolean[0];
        this.f54243d0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.D = arrayList;
        this.E = DesugarCollections.unmodifiableList(arrayList);
        this.I = new ArrayList();
        this.F = new Runnable(this) {
            public final q f54229b;

            {
                this.f54229b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f54229b.z();
                        return;
                    default:
                        q qVar = this.f54229b;
                        for (p pVar : qVar.L) {
                            pVar.K(qVar.f54252k0);
                        }
                        qVar.S = true;
                        qVar.z();
                        return;
                }
            }
        };
        this.G = new Runnable(this) {
            public final q f54229b;

            {
                this.f54229b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f54229b.z();
                        return;
                    default:
                        q qVar = this.f54229b;
                        for (p pVar : qVar.L) {
                            pVar.K(qVar.f54252k0);
                        }
                        qVar.S = true;
                        qVar.z();
                        return;
                }
            }
        };
        this.H = m0.q(null);
        this.f54247f0 = j3;
        this.f54248g0 = j3;
        this.f54252k0 = Long.MIN_VALUE;
    }

    public static f3.n s(int i7, int i10) {
        h2.a.l("HlsSampleStreamWrapper", "Unmapped track with id " + i7 + " of type " + i10);
        return new f3.n();
    }

    public static u u(u uVar, u uVar2, boolean z9) {
        String b10;
        int i7;
        int i10;
        if (uVar == null) {
            return uVar2;
        }
        String str = uVar.f10607k;
        String str2 = uVar2.f10615s;
        int h = s0.h(str2);
        if (m0.v(h, str) == 1) {
            b10 = m0.w(h, str);
            str2 = s0.d(b10);
        } else {
            b10 = s0.b(str, str2);
        }
        uVar2.f10610n = uVar.f10610n;
        uVar2.f10611o = uVar.f10611o;
        uVar2.f10612p = uVar.f10612p;
        uVar2.f10613q = uVar.f10613q;
        e2.t a10 = uVar2.a();
        a10.f10548a = uVar.f10599a;
        a10.f10549b = uVar.f10600b;
        a10.f10550c = i0.q(uVar.f10601c);
        a10.d = uVar.d;
        a10.f10551e = uVar.f10602e;
        a10.f10552f = uVar.f10603f;
        if (z9) {
            i7 = uVar.h;
        } else {
            i7 = -1;
        }
        a10.h = i7;
        if (z9) {
            i10 = uVar.f10605i;
        } else {
            i10 = -1;
        }
        a10.f10554i = i10;
        a10.f10555j = b10;
        a10.f10561p = uVar.f10612p;
        a10.f10559n = uVar.f10611o;
        a10.f10558m = uVar.f10610n;
        a10.f10560o = uVar.f10613q;
        if (h == 2) {
            a10.f10569y = uVar.f10621z;
            a10.f10570z = uVar.A;
            a10.C = uVar.D;
        }
        if (str2 != null) {
            a10.f10563r = s0.n(str2);
        }
        int i11 = uVar.K;
        if (i11 != -1 && h == 1) {
            a10.J = i11;
        }
        q0 q0Var = uVar.f10608l;
        if (q0Var != null) {
            q0 q0Var2 = uVar2.f10608l;
            if (q0Var2 != null) {
                q0Var = q0Var2.b(q0Var);
            }
            a10.f10556k = q0Var;
        }
        return new u(a10);
    }

    public static int x(int i7) {
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

    public final void A() {
        this.f54258s.a();
        i iVar = this.d;
        x2.b bVar = iVar.f54191n;
        if (bVar == null) {
            Uri uri = iVar.f54192o;
            if (uri != null && uri.equals(iVar.f54193p)) {
                iVar.f54185g.h(iVar.f54192o);
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void B(m1[] m1VarArr, int... iArr) {
        this.Y = t(m1VarArr);
        this.Z = new HashSet();
        for (int i7 : iArr) {
            this.Z.add(this.Y.a(i7));
        }
        this.f54240b0 = 0;
        this.H.post(new m5(this.f54241c, 23));
        this.T = true;
    }

    public final void C() {
        for (p pVar : this.L) {
            pVar.G(this.f54249h0);
        }
        this.f54249h0 = false;
    }

    public final boolean D(long j3, boolean z9) {
        j jVar;
        boolean z10;
        boolean z11;
        boolean J;
        this.f54247f0 = j3;
        if (y()) {
            this.f54248g0 = j3;
            return true;
        }
        boolean z12 = this.d.f54194q;
        ArrayList arrayList = this.D;
        if (z12) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                jVar = (j) arrayList.get(i7);
                if (jVar.h == j3) {
                    break;
                }
            }
        }
        jVar = null;
        if (this.S && !z9 && !arrayList.isEmpty()) {
            int length = this.L.length;
            for (int i10 = 0; i10 < length; i10++) {
                p pVar = this.L[i10];
                if (jVar != null) {
                    J = pVar.I(jVar.f(i10));
                } else {
                    long e10 = e();
                    if (e10 != Long.MIN_VALUE && j3 >= e10) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    J = pVar.J(j3, z11);
                }
                if (!J && (this.f54245e0[i10] || !this.f54242c0)) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
            if (z10) {
                return false;
            }
        }
        this.f54248g0 = j3;
        this.f54251j0 = false;
        arrayList.clear();
        b3.o oVar = this.f54258s;
        if (oVar.d()) {
            if (this.S) {
                for (p pVar2 : this.L) {
                    pVar2.l();
                }
            }
            oVar.b();
            return true;
        }
        oVar.f2964c = null;
        C();
        return true;
    }

    @Override
    public final void M0(b3.l lVar, long j3, long j10, int i7) {
        x2.u uVar;
        y2.f fVar = (y2.f) lVar;
        if (i7 == 0) {
            long j11 = fVar.f58775a;
            uVar = new x2.u(fVar.f58776b, j3);
        } else {
            long j12 = fVar.f58775a;
            j2.m mVar = fVar.f58776b;
            c0 c0Var = fVar.f58781r;
            uVar = new x2.u(mVar, c0Var.f16414c, c0Var.d, j3, j10, c0Var.f16413b);
        }
        this.f54259w.t(uVar, fVar.f58777c, this.f54239b, fVar.d, fVar.f58778e, fVar.f58779f, fVar.h, fVar.f58780n, i7);
    }

    @Override
    public final j0 O1(int i7, int i10) {
        j jVar;
        Integer valueOf = Integer.valueOf(i10);
        Set set = f54236p0;
        boolean contains = set.contains(valueOf);
        boolean z9 = false;
        HashSet hashSet = this.N;
        SparseIntArray sparseIntArray = this.O;
        ?? r52 = 0;
        r52 = 0;
        if (contains) {
            ia.f(set.contains(Integer.valueOf(i10)));
            int i11 = sparseIntArray.get(i10, -1);
            if (i11 != -1) {
                if (hashSet.add(Integer.valueOf(i10))) {
                    this.M[i11] = i7;
                }
                r52 = this.M[i11] == i7 ? this.L[i11] : s(i7, i10);
            }
        } else {
            int i12 = 0;
            while (true) {
                ?? r12 = this.L;
                if (i12 >= r12.length) {
                    break;
                } else if (this.M[i12] == i7) {
                    r52 = r12[i12];
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (r52 == 0) {
            if (this.f54253l0) {
                return s(i7, i10);
            }
            int length = this.L.length;
            if (i10 == 1 || i10 == 2) {
                z9 = true;
            }
            r52 = new p(this.f54244e, this.h, this.f54254n, this.J);
            r52.f58177t = this.f54247f0;
            if (z9) {
                r52.K = this.f54255n0;
                r52.B = true;
            }
            long j3 = this.m0;
            if (r52.H != j3) {
                r52.H = j3;
                r52.B = true;
            }
            if (this.f54256o0 != null) {
                r52.E = jVar.f54200w;
            }
            r52.f58164f = this;
            int i13 = length + 1;
            int[] copyOf = Arrays.copyOf(this.M, i13);
            this.M = copyOf;
            copyOf[length] = i7;
            p[] pVarArr = this.L;
            String str = m0.f14112a;
            ?? copyOf2 = Arrays.copyOf(pVarArr, pVarArr.length + 1);
            copyOf2[pVarArr.length] = r52;
            this.L = (p[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f54245e0, i13);
            this.f54245e0 = copyOf3;
            copyOf3[length] = z9;
            this.f54242c0 |= z9;
            hashSet.add(Integer.valueOf(i10));
            sparseIntArray.append(i10, length);
            if (x(i10) > x(this.Q)) {
                this.R = length;
                this.Q = i10;
            }
            this.f54243d0 = Arrays.copyOf(this.f54243d0, i13);
        }
        if (i10 == 5) {
            if (this.P == null) {
                this.P = new o(r52, this.f54260x);
            }
            return this.P;
        }
        return r52;
    }

    @Override
    public final void U0() {
        this.f54253l0 = true;
        this.H.post(this.G);
    }

    @Override
    public final void a() {
        this.H.post(this.F);
    }

    @Override
    public final boolean c(l2.v0 r79) {
        throw new UnsupportedOperationException("Method not decompiled: r2.q.c(l2.v0):boolean");
    }

    @Override
    public final void d() {
        p[] pVarArr;
        for (p pVar : this.L) {
            pVar.G(true);
            q2.g gVar = pVar.h;
            if (gVar != null) {
                gVar.c(pVar.f58163e);
                pVar.h = null;
                pVar.f58165g = null;
            }
        }
    }

    @Override
    public final long e() {
        if (y()) {
            return this.f54248g0;
        }
        if (this.f54251j0) {
            return Long.MIN_VALUE;
        }
        return w().f58780n;
    }

    @Override
    public final boolean g() {
        return this.f54258s.d();
    }

    public final void l() {
        ia.p(this.T);
        this.Y.getClass();
        this.Z.getClass();
    }

    public final boolean m(int i7) {
        int i10 = i7;
        while (true) {
            ArrayList arrayList = this.D;
            if (i10 < arrayList.size()) {
                if (((j) arrayList.get(i10)).f54199b0) {
                    return false;
                }
                i10++;
            } else {
                j jVar = (j) arrayList.get(i7);
                for (int i11 = 0; i11 < this.L.length; i11++) {
                    if (this.L[i11].v() > jVar.f(i11)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    @Override
    public final b3.i o0(b3.l r24, long r25, long r27, java.io.IOException r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: r2.q.o0(b3.l, long, long, java.io.IOException, int):b3.i");
    }

    @Override
    public final void o1(b3.l lVar, long j3, long j10) {
        y2.f fVar = (y2.f) lVar;
        this.K = null;
        if (fVar instanceof e) {
            e eVar = (e) fVar;
            byte[] bArr = eVar.f54172s;
            i iVar = this.d;
            iVar.f54190m = bArr;
            uy uyVar = iVar.f54187j;
            Uri uri = eVar.f58776b.f16446a;
            byte[] bArr2 = eVar.f54174x;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((d) uyVar.f38766b).put(uri, bArr2);
        }
        long j11 = fVar.f58775a;
        j2.m mVar = fVar.f58776b;
        c0 c0Var = fVar.f58781r;
        x2.u uVar = new x2.u(mVar, c0Var.f16414c, c0Var.d, j3, j10, c0Var.f16413b);
        this.f54257r.getClass();
        this.f54259w.p(uVar, fVar.f58777c, this.f54239b, fVar.d, fVar.f58778e, fVar.f58779f, fVar.h, fVar.f58780n);
        if (!this.T) {
            u0 u0Var = new u0();
            u0Var.f18055a = this.f54247f0;
            c(new v0(u0Var));
            return;
        }
        this.f54241c.d(this);
    }

    @Override
    public final long p() {
        if (this.f54251j0) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.f54248g0;
        }
        long j3 = this.f54247f0;
        j w10 = w();
        if (!w10.X) {
            ArrayList arrayList = this.D;
            if (arrayList.size() > 1) {
                w10 = (j) jg.g.i(2, arrayList);
            } else {
                w10 = null;
            }
        }
        if (w10 != null) {
            j3 = Math.max(j3, w10.f58780n);
        }
        if (this.S) {
            for (p pVar : this.L) {
                j3 = Math.max(j3, pVar.s());
            }
        }
        return j3;
    }

    @Override
    public final void q0(b3.l lVar, long j3, long j10, boolean z9) {
        y2.f fVar = (y2.f) lVar;
        this.K = null;
        long j11 = fVar.f58775a;
        j2.m mVar = fVar.f58776b;
        c0 c0Var = fVar.f58781r;
        x2.u uVar = new x2.u(mVar, c0Var.f16414c, c0Var.d, j3, j10, c0Var.f16413b);
        this.f54257r.getClass();
        this.f54259w.o(uVar, fVar.f58777c, this.f54239b, fVar.d, fVar.f58778e, fVar.f58779f, fVar.h, fVar.f58780n);
        if (!z9) {
            if (y() || this.U == 0) {
                C();
            }
            if (this.U > 0) {
                this.f54241c.d(this);
            }
        }
    }

    @Override
    public final void r(long j3) {
        int size;
        b3.o oVar = this.f54258s;
        if (!oVar.c() && !y()) {
            boolean d = oVar.d();
            boolean z9 = false;
            boolean z10 = false;
            int i7 = 0;
            z9 = false;
            i iVar = this.d;
            List list = this.E;
            if (d) {
                this.K.getClass();
                y2.f fVar = this.K;
                if (iVar.f54191n == null) {
                    z10 = iVar.f54195r.k(j3, fVar, list);
                }
                if (z10) {
                    oVar.b();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0 && iVar.c((j) list.get(size2 - 1)) == 2) {
                size2--;
            }
            if (size2 < list.size()) {
                v(size2);
            }
            if (iVar.f54191n == null && iVar.f54195r.length() >= 2) {
                size = iVar.f54195r.j(j3, list);
            } else {
                size = list.size();
            }
            if (size < this.D.size()) {
                v(size);
            }
            if (this.S && this.f54252k0 != Long.MIN_VALUE) {
                boolean z11 = true;
                while (true) {
                    p[] pVarArr = this.L;
                    if (i7 >= pVarArr.length) {
                        break;
                    }
                    if (this.f54243d0[i7] && (this.f54245e0[i7] || !this.f54242c0)) {
                        z11 &= pVarArr[i7].z();
                    }
                    i7++;
                }
                z9 = z11;
            }
            if (z9) {
                this.f54251j0 = true;
            }
        }
    }

    public final q1 t(m1[] m1VarArr) {
        for (int i7 = 0; i7 < m1VarArr.length; i7++) {
            m1 m1Var = m1VarArr[i7];
            u[] uVarArr = new u[m1Var.f10373a];
            for (int i10 = 0; i10 < m1Var.f10373a; i10++) {
                u uVar = m1Var.d[i10];
                int F = this.h.F(uVar);
                e2.t a10 = uVar.a();
                a10.S = F;
                uVarArr[i10] = new u(a10);
            }
            m1VarArr[i7] = new m1(m1Var.f10374b, uVarArr);
        }
        return new q1(m1VarArr);
    }

    public final void v(int i7) {
        ArrayList arrayList;
        ia.p(!this.f54258s.d());
        while (true) {
            arrayList = this.D;
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
        long j3 = w().f58780n;
        j jVar = (j) arrayList.get(i7);
        m0.X(i7, arrayList.size(), arrayList);
        for (int i10 = 0; i10 < this.L.length; i10++) {
            this.L[i10].o(jVar.f(i10));
        }
        if (arrayList.isEmpty()) {
            this.f54248g0 = this.f54247f0;
        } else {
            ((j) h9.o.n(arrayList)).Z = true;
        }
        this.f54251j0 = false;
        this.f54259w.A(jVar.h, this.Q, j3);
    }

    public final j w() {
        return (j) jg.g.i(1, this.D);
    }

    public final boolean y() {
        if (this.f54248g0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void z() {
        boolean z9;
        int i7;
        u u10;
        if (!this.X && this.f54238a0 == null && this.S) {
            int i10 = 0;
            for (p pVar : this.L) {
                if (pVar.y() == null) {
                    return;
                }
            }
            q1 q1Var = this.Y;
            if (q1Var != null) {
                int i11 = q1Var.f58329a;
                int[] iArr = new int[i11];
                this.f54238a0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        p[] pVarArr = this.L;
                        if (i13 < pVarArr.length) {
                            u y10 = pVarArr[i13].y();
                            y10.getClass();
                            u uVar = this.Y.a(i12).d[0];
                            String str = y10.f10615s;
                            String str2 = uVar.f10615s;
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
                    this.f54238a0[i12] = i13;
                }
                ArrayList arrayList = this.I;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((m) obj).b();
                }
                return;
            }
            int length = this.L.length;
            int i14 = 0;
            int i15 = -1;
            int i16 = -2;
            while (true) {
                int i17 = 1;
                if (i14 >= length) {
                    break;
                }
                u y11 = this.L[i14].y();
                y11.getClass();
                String str3 = y11.f10615s;
                if (s0.m(str3)) {
                    i17 = 2;
                } else if (!s0.i(str3)) {
                    if (s0.l(str3)) {
                        i17 = 3;
                    } else {
                        i17 = -2;
                    }
                }
                if (x(i17) > x(i16)) {
                    i15 = i14;
                    i16 = i17;
                } else if (i17 == i16 && i15 != -1) {
                    i15 = -1;
                }
                i14++;
            }
            m1 m1Var = this.d.h;
            int i18 = m1Var.f10373a;
            this.f54240b0 = -1;
            this.f54238a0 = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.f54238a0[i19] = i19;
            }
            m1[] m1VarArr = new m1[length];
            int i20 = 0;
            while (i20 < length) {
                u y12 = this.L[i20].y();
                y12.getClass();
                u uVar2 = this.f54246f;
                String str4 = this.f54237a;
                if (i20 == i15) {
                    u[] uVarArr = new u[i18];
                    for (int i21 = i10; i21 < i18; i21++) {
                        u uVar3 = m1Var.d[i21];
                        if (i16 == 1 && uVar2 != null) {
                            uVar3 = uVar3.d(uVar2);
                        }
                        if (i18 == 1) {
                            u10 = y12.d(uVar3);
                        } else {
                            u10 = u(uVar3, y12, true);
                        }
                        uVarArr[i21] = u10;
                    }
                    m1VarArr[i20] = new m1(str4, uVarArr);
                    this.f54240b0 = i20;
                    i7 = 0;
                } else {
                    uVar2 = (i16 == 2 && s0.i(y12.f10615s)) ? null : null;
                    StringBuilder j3 = rf.b.j(str4, ":muxed:");
                    j3.append(i20 < i15 ? i20 : i20 - 1);
                    String sb2 = j3.toString();
                    i7 = 0;
                    e2.t a10 = u(uVar2, y12, false).a();
                    a10.f10557l = str4;
                    m1VarArr[i20] = new m1(sb2, new u(a10));
                }
                i20++;
                i10 = i7;
            }
            int i22 = i10;
            this.Y = t(m1VarArr);
            if (this.Z == null) {
                z9 = 1;
            } else {
                z9 = i22;
            }
            ia.p(z9);
            this.Z = Collections.EMPTY_SET;
            this.T = true;
            this.f54241c.m0();
        }
    }

    @Override
    public final void f(f3.c0 c0Var) {
    }
}
