package q2;

import android.net.Uri;
import android.os.Handler;
import android.support.v4.media.session.a0;
import android.util.SparseIntArray;
import b8.kg;
import b8.zb;
import d2.o1;
import d2.s0;
import d2.u;
import d2.u0;
import d2.v;
import e3.b0;
import g2.n0;
import g9.i0;
import i2.c0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k2.p1;
import k2.v0;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.y00;
import w2.b1;
import w2.f1;
import w2.r1;
public final class q implements a3.k, a3.n, f1, e3.q, b1 {
    public static final Set f53740q0 = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public final ArrayList E;
    public final List F;
    public final n G;
    public final n H;
    public final Handler I;
    public final ArrayList J;
    public final Map K;
    public x2.f L;
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
    public v W;
    public v X;
    public boolean Y;
    public r1 Z;
    public final String f53741a;
    public Set f53742a0;
    public final int f53743b;
    public int[] f53744b0;
    public final nh f53745c;
    public int f53746c0;
    public final i d;
    public boolean f53747d0;
    public final a0 f53748e;
    public boolean[] f53749e0;
    public final v f53750f;
    public boolean[] f53751f0;
    public long f53752g0;
    public final p2.m h;
    public long f53753h0;
    public boolean f53754i0;
    public boolean f53755j0;
    public boolean f53756k0;
    public long f53757l0;
    public boolean m0;
    public final p2.j f53758n;
    public long f53759n0;
    public d2.s f53760o0;
    public j f53761p0;
    public final kb.a f53762r;
    public final a3.q f53763s;
    public final kg f53764w;
    public final int f53765x;
    public final androidx.activity.n f53766y;

    public q(String str, int i3, nh nhVar, i iVar, Map map, a0 a0Var, long j10, v vVar, p2.m mVar, p2.j jVar, kb.a aVar, kg kgVar, int i10, b3.a aVar2) {
        a3.q qVar;
        this.f53741a = str;
        this.f53743b = i3;
        this.f53745c = nhVar;
        this.d = iVar;
        this.K = map;
        this.f53748e = a0Var;
        this.f53750f = vVar;
        this.h = mVar;
        this.f53758n = jVar;
        this.f53762r = aVar;
        this.f53764w = kgVar;
        this.f53765x = i10;
        if (aVar2 != null) {
            qVar = new a3.q(aVar2);
        } else {
            qVar = new a3.q("Loader:HlsSampleStreamWrapper");
        }
        this.f53763s = qVar;
        androidx.activity.n nVar = new androidx.activity.n(5);
        nVar.f1270c = null;
        nVar.f1269b = false;
        nVar.d = null;
        this.f53766y = nVar;
        this.N = new int[0];
        Set set = f53740q0;
        this.O = new HashSet(set.size());
        this.P = new SparseIntArray(set.size());
        this.M = new p[0];
        this.f53751f0 = new boolean[0];
        this.f53749e0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.E = arrayList;
        this.F = DesugarCollections.unmodifiableList(arrayList);
        this.J = new ArrayList();
        this.G = new Runnable(this) {
            public final q f53733b;

            {
                this.f53733b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f53733b.B();
                        return;
                    default:
                        q qVar2 = this.f53733b;
                        for (p pVar : qVar2.M) {
                            pVar.K(qVar2.f53757l0);
                        }
                        qVar2.T = true;
                        qVar2.B();
                        return;
                }
            }
        };
        this.H = new Runnable(this) {
            public final q f53733b;

            {
                this.f53733b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f53733b.B();
                        return;
                    default:
                        q qVar2 = this.f53733b;
                        for (p pVar : qVar2.M) {
                            pVar.K(qVar2.f53757l0);
                        }
                        qVar2.T = true;
                        qVar2.B();
                        return;
                }
            }
        };
        this.I = n0.q(null);
        this.f53752g0 = j10;
        this.f53753h0 = j10;
        this.f53757l0 = Long.MIN_VALUE;
    }

    public static e3.n u(int i3, int i10) {
        g2.a.l("HlsSampleStreamWrapper", "Unmapped track with id " + i3 + " of type " + i10);
        return new e3.n();
    }

    public static v w(v vVar, v vVar2, boolean z10) {
        String b10;
        int i3;
        int i10;
        if (vVar == null) {
            return vVar2;
        }
        String str = vVar.f8481k;
        String str2 = vVar2.f8489s;
        int h = u0.h(str2);
        if (n0.v(h, str) == 1) {
            b10 = n0.w(h, str);
            str2 = u0.d(b10);
        } else {
            b10 = u0.b(str, str2);
        }
        vVar2.f8484n = vVar.f8484n;
        vVar2.f8485o = vVar.f8485o;
        vVar2.f8486p = vVar.f8486p;
        vVar2.f8487q = vVar.f8487q;
        u a10 = vVar2.a();
        a10.f8416a = vVar.f8473a;
        a10.f8417b = vVar.f8474b;
        a10.f8418c = i0.q(vVar.f8475c);
        a10.d = vVar.d;
        a10.f8419e = vVar.f8476e;
        a10.f8420f = vVar.f8477f;
        if (z10) {
            i3 = vVar.h;
        } else {
            i3 = -1;
        }
        a10.h = i3;
        if (z10) {
            i10 = vVar.f8479i;
        } else {
            i10 = -1;
        }
        a10.f8422i = i10;
        a10.f8423j = b10;
        a10.f8429p = vVar.f8486p;
        a10.f8427n = vVar.f8485o;
        a10.f8426m = vVar.f8484n;
        a10.f8428o = vVar.f8487q;
        if (h == 2) {
            a10.f8437y = vVar.f8495z;
            a10.f8438z = vVar.A;
            a10.C = vVar.D;
        }
        if (str2 != null) {
            a10.f8431r = u0.n(str2);
        }
        int i11 = vVar.K;
        if (i11 != -1 && h == 1) {
            a10.J = i11;
        }
        s0 s0Var = vVar.f8482l;
        if (s0Var != null) {
            s0 s0Var2 = vVar2.f8482l;
            if (s0Var2 != null) {
                s0Var = s0Var2.b(s0Var);
            }
            a10.f8424k = s0Var;
        }
        return new v(a10);
    }

    public static int z(int i3) {
        if (i3 == 1) {
            return 2;
        }
        if (i3 == 2) {
            return 3;
        }
        if (i3 == 3) {
            return 1;
        }
        return 0;
    }

    public final boolean A() {
        if (this.f53753h0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void B() {
        boolean z10;
        int i3;
        v w10;
        if (!this.Y && this.f53744b0 == null && this.T) {
            int i10 = 0;
            for (p pVar : this.M) {
                if (pVar.y() == null) {
                    return;
                }
            }
            r1 r1Var = this.Z;
            if (r1Var != null) {
                int i11 = r1Var.f57206a;
                int[] iArr = new int[i11];
                this.f53744b0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i12 = 0; i12 < i11; i12++) {
                    int i13 = 0;
                    while (true) {
                        p[] pVarArr = this.M;
                        if (i13 < pVarArr.length) {
                            v y9 = pVarArr[i13].y();
                            y9.getClass();
                            v vVar = this.Z.a(i12).d[0];
                            String str = y9.f8489s;
                            String str2 = vVar.f8489s;
                            int h = u0.h(str);
                            if (h != 3) {
                                if (h == u0.h(str2)) {
                                    break;
                                }
                                i13++;
                            } else {
                                if (!Objects.equals(str, str2)) {
                                    continue;
                                } else if ((!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) || y9.P == vVar.P) {
                                    break;
                                }
                                i13++;
                            }
                        }
                    }
                    this.f53744b0[i12] = i13;
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
                v y10 = this.M[i14].y();
                y10.getClass();
                String str3 = y10.f8489s;
                if (u0.m(str3)) {
                    i17 = 2;
                } else if (!u0.i(str3)) {
                    if (u0.l(str3)) {
                        i17 = 3;
                    } else {
                        i17 = -2;
                    }
                }
                if (z(i17) > z(i16)) {
                    i15 = i14;
                    i16 = i17;
                } else if (i17 == i16 && i15 != -1) {
                    i15 = -1;
                }
                i14++;
            }
            o1 o1Var = this.d.h;
            int i18 = o1Var.f8252a;
            this.f53746c0 = -1;
            this.f53744b0 = new int[length];
            for (int i19 = 0; i19 < length; i19++) {
                this.f53744b0[i19] = i19;
            }
            o1[] o1VarArr = new o1[length];
            int i20 = 0;
            while (i20 < length) {
                v y11 = this.M[i20].y();
                y11.getClass();
                v vVar2 = this.f53750f;
                String str4 = this.f53741a;
                if (i20 == i15) {
                    v[] vVarArr = new v[i18];
                    for (int i21 = i10; i21 < i18; i21++) {
                        v vVar3 = o1Var.d[i21];
                        if (i16 == 1 && vVar2 != null) {
                            vVar3 = vVar3.d(vVar2);
                        }
                        if (i18 == 1) {
                            w10 = y11.d(vVar3);
                        } else {
                            w10 = w(vVar3, y11, true);
                        }
                        vVarArr[i21] = w10;
                    }
                    o1VarArr[i20] = new o1(str4, vVarArr);
                    this.f53746c0 = i20;
                    i3 = 0;
                } else {
                    vVar2 = (i16 == 2 && u0.i(y11.f8489s)) ? null : null;
                    StringBuilder h7 = t4.c.h(str4, ":muxed:");
                    h7.append(i20 < i15 ? i20 : i20 - 1);
                    String sb2 = h7.toString();
                    i3 = 0;
                    u a10 = w(vVar2, y11, false).a();
                    a10.f8425l = str4;
                    o1VarArr[i20] = new o1(sb2, new v(a10));
                }
                i20++;
                i10 = i3;
            }
            int i22 = i10;
            this.Z = v(o1VarArr);
            if (this.f53742a0 == null) {
                z10 = 1;
            } else {
                z10 = i22;
            }
            zb.p(z10);
            this.f53742a0 = Collections.EMPTY_SET;
            this.U = true;
            this.f53745c.B();
        }
    }

    public final void C() {
        this.f53763s.a();
        i iVar = this.d;
        w2.b bVar = iVar.f53694n;
        if (bVar == null) {
            Uri uri = iVar.f53695o;
            if (uri != null && uri.equals(iVar.f53696p)) {
                iVar.f53688g.i(iVar.f53695o);
                return;
            }
            return;
        }
        throw bVar;
    }

    public final void D(o1[] o1VarArr, int... iArr) {
        this.Z = v(o1VarArr);
        this.f53742a0 = new HashSet();
        for (int i3 : iArr) {
            this.f53742a0.add(this.Z.a(i3));
        }
        this.f53746c0 = 0;
        this.I.post(new d4(this.f53745c, 27));
        this.U = true;
    }

    public final void E() {
        for (p pVar : this.M) {
            pVar.G(this.f53754i0);
        }
        this.f53754i0 = false;
    }

    public final boolean F(long j10, boolean z10) {
        j jVar;
        boolean z11;
        boolean z12;
        boolean J;
        this.f53752g0 = j10;
        if (A()) {
            this.f53753h0 = j10;
            return true;
        }
        boolean z13 = this.d.f53697q;
        ArrayList arrayList = this.E;
        if (z13) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                jVar = (j) arrayList.get(i3);
                if (jVar.h == j10) {
                    break;
                }
            }
        }
        jVar = null;
        if (this.T && !z10 && !arrayList.isEmpty()) {
            int length = this.M.length;
            for (int i10 = 0; i10 < length; i10++) {
                p pVar = this.M[i10];
                if (jVar != null) {
                    J = pVar.I(jVar.f(i10));
                } else {
                    long e10 = e();
                    if (e10 != Long.MIN_VALUE && j10 >= e10) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    J = pVar.J(j10, z12);
                }
                if (!J && (this.f53751f0[i10] || !this.f53747d0)) {
                    z11 = false;
                    break;
                }
            }
            z11 = true;
            if (z11) {
                return false;
            }
        }
        this.f53753h0 = j10;
        this.f53756k0 = false;
        arrayList.clear();
        a3.q qVar = this.f53763s;
        if (qVar.d()) {
            if (this.T) {
                for (p pVar2 : this.M) {
                    pVar2.l();
                }
            }
            qVar.b();
            return true;
        }
        qVar.f109c = null;
        E();
        return true;
    }

    @Override
    public final void L() {
        this.m0 = true;
        this.I.post(this.H);
    }

    @Override
    public final void M(a3.m mVar, long j10, long j11, int i3) {
        w2.u uVar;
        x2.f fVar = (x2.f) mVar;
        if (i3 == 0) {
            long j12 = fVar.f58148a;
            uVar = new w2.u(fVar.f58149b, j10);
        } else {
            long j13 = fVar.f58148a;
            i2.n nVar = fVar.f58149b;
            c0 c0Var = fVar.f58154r;
            uVar = new w2.u(nVar, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        }
        this.f53764w.u(uVar, fVar.f58150c, this.f53743b, fVar.d, fVar.f58151e, fVar.f58152f, fVar.h, fVar.f58153n, i3);
    }

    @Override
    public final void a() {
        this.I.post(this.G);
    }

    @Override
    public final void b() {
        p[] pVarArr;
        for (p pVar : this.M) {
            pVar.G(true);
            p2.g gVar = pVar.h;
            if (gVar != null) {
                gVar.b(pVar.f57046e);
                pVar.h = null;
                pVar.f57048g = null;
            }
        }
    }

    @Override
    public final boolean c(k2.v0 r79) {
        throw new UnsupportedOperationException("Method not decompiled: q2.q.c(k2.v0):boolean");
    }

    @Override
    public final boolean d() {
        return this.f53763s.d();
    }

    @Override
    public final long e() {
        if (A()) {
            return this.f53753h0;
        }
        if (this.f53756k0) {
            return Long.MIN_VALUE;
        }
        return y().f58153n;
    }

    @Override
    public final void h(a3.m mVar, long j10, long j11) {
        x2.f fVar = (x2.f) mVar;
        this.L = null;
        if (fVar instanceof e) {
            e eVar = (e) fVar;
            byte[] bArr = eVar.f53675s;
            i iVar = this.d;
            iVar.f53693m = bArr;
            y00 y00Var = iVar.f53690j;
            Uri uri = eVar.f58149b.f14564a;
            byte[] bArr2 = eVar.f53677x;
            bArr2.getClass();
            uri.getClass();
            byte[] bArr3 = (byte[]) ((d) y00Var.f40562a).put(uri, bArr2);
        }
        long j12 = fVar.f58148a;
        i2.n nVar = fVar.f58149b;
        c0 c0Var = fVar.f58154r;
        w2.u uVar = new w2.u(nVar, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        this.f53762r.getClass();
        this.f53764w.q(uVar, fVar.f58150c, this.f53743b, fVar.d, fVar.f58151e, fVar.f58152f, fVar.h, fVar.f58153n);
        if (!this.U) {
            k2.u0 u0Var = new k2.u0();
            u0Var.f16744a = this.f53752g0;
            c(new v0(u0Var));
            return;
        }
        this.f53745c.k(this);
    }

    @Override
    public final e3.i0 i0(int i3, int i10) {
        j jVar;
        Integer valueOf = Integer.valueOf(i10);
        Set set = f53740q0;
        boolean contains = set.contains(valueOf);
        boolean z10 = false;
        HashSet hashSet = this.O;
        SparseIntArray sparseIntArray = this.P;
        ?? r5 = 0;
        r5 = 0;
        if (contains) {
            zb.f(set.contains(Integer.valueOf(i10)));
            int i11 = sparseIntArray.get(i10, -1);
            if (i11 != -1) {
                if (hashSet.add(Integer.valueOf(i10))) {
                    this.N[i11] = i3;
                }
                r5 = this.N[i11] == i3 ? this.M[i11] : u(i3, i10);
            }
        } else {
            int i12 = 0;
            while (true) {
                ?? r12 = this.M;
                if (i12 >= r12.length) {
                    break;
                } else if (this.N[i12] == i3) {
                    r5 = r12[i12];
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (r5 == 0) {
            if (this.m0) {
                return u(i3, i10);
            }
            int length = this.M.length;
            if (i10 == 1 || i10 == 2) {
                z10 = true;
            }
            r5 = new p(this.f53748e, this.h, this.f53758n, this.K);
            r5.f57060t = this.f53752g0;
            if (z10) {
                r5.K = this.f53760o0;
                r5.B = true;
            }
            long j10 = this.f53759n0;
            if (r5.H != j10) {
                r5.H = j10;
                r5.B = true;
            }
            if (this.f53761p0 != null) {
                r5.E = jVar.f53704w;
            }
            r5.f57047f = this;
            int i13 = length + 1;
            int[] copyOf = Arrays.copyOf(this.N, i13);
            this.N = copyOf;
            copyOf[length] = i3;
            p[] pVarArr = this.M;
            String str = n0.f11873a;
            ?? copyOf2 = Arrays.copyOf(pVarArr, pVarArr.length + 1);
            copyOf2[pVarArr.length] = r5;
            this.M = (p[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f53751f0, i13);
            this.f53751f0 = copyOf3;
            copyOf3[length] = z10;
            this.f53747d0 |= z10;
            hashSet.add(Integer.valueOf(i10));
            sparseIntArray.append(i10, length);
            if (z(i10) > z(this.R)) {
                this.S = length;
                this.R = i10;
            }
            this.f53749e0 = Arrays.copyOf(this.f53749e0, i13);
        }
        if (i10 == 5) {
            if (this.Q == null) {
                this.Q = new o(r5, this.f53765x);
            }
            return this.Q;
        }
        return r5;
    }

    @Override
    public final a3.i k(a3.m r24, long r25, long r27, java.io.IOException r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: q2.q.k(a3.m, long, long, java.io.IOException, int):a3.i");
    }

    public final void m() {
        zb.p(this.U);
        this.Z.getClass();
        this.f53742a0.getClass();
    }

    public final boolean o(int i3) {
        int i10 = i3;
        while (true) {
            ArrayList arrayList = this.E;
            if (i10 < arrayList.size()) {
                if (((j) arrayList.get(i10)).f53703c0) {
                    return false;
                }
                i10++;
            } else {
                j jVar = (j) arrayList.get(i3);
                for (int i11 = 0; i11 < this.M.length; i11++) {
                    if (this.M[i11].v() > jVar.f(i11)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    @Override
    public final long q() {
        if (this.f53756k0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.f53753h0;
        }
        long j10 = this.f53752g0;
        j y9 = y();
        if (!y9.Y) {
            ArrayList arrayList = this.E;
            if (arrayList.size() > 1) {
                y9 = (j) p1.h(2, arrayList);
            } else {
                y9 = null;
            }
        }
        if (y9 != null) {
            j10 = Math.max(j10, y9.f58153n);
        }
        if (this.T) {
            for (p pVar : this.M) {
                j10 = Math.max(j10, pVar.s());
            }
        }
        return j10;
    }

    @Override
    public final void q0(a3.m mVar, long j10, long j11, boolean z10) {
        x2.f fVar = (x2.f) mVar;
        this.L = null;
        long j12 = fVar.f58148a;
        i2.n nVar = fVar.f58149b;
        c0 c0Var = fVar.f58154r;
        w2.u uVar = new w2.u(nVar, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        this.f53762r.getClass();
        this.f53764w.p(uVar, fVar.f58150c, this.f53743b, fVar.d, fVar.f58151e, fVar.f58152f, fVar.h, fVar.f58153n);
        if (!z10) {
            if (A() || this.V == 0) {
                E();
            }
            if (this.V > 0) {
                this.f53745c.k(this);
            }
        }
    }

    @Override
    public final void t(long j10) {
        int size;
        a3.q qVar = this.f53763s;
        if (!qVar.c() && !A()) {
            boolean d = qVar.d();
            boolean z10 = false;
            boolean z11 = false;
            int i3 = 0;
            z10 = false;
            i iVar = this.d;
            List list = this.F;
            if (d) {
                this.L.getClass();
                x2.f fVar = this.L;
                if (iVar.f53694n == null) {
                    z11 = iVar.f53698r.m(j10, fVar, list);
                }
                if (z11) {
                    qVar.b();
                    return;
                }
                return;
            }
            int size2 = list.size();
            while (size2 > 0 && iVar.c((j) list.get(size2 - 1)) == 2) {
                size2--;
            }
            if (size2 < list.size()) {
                x(size2);
            }
            if (iVar.f53694n == null && iVar.f53698r.length() >= 2) {
                size = iVar.f53698r.j(j10, list);
            } else {
                size = list.size();
            }
            if (size < this.E.size()) {
                x(size);
            }
            if (this.T && this.f53757l0 != Long.MIN_VALUE) {
                boolean z12 = true;
                while (true) {
                    p[] pVarArr = this.M;
                    if (i3 >= pVarArr.length) {
                        break;
                    }
                    if (this.f53749e0[i3] && (this.f53751f0[i3] || !this.f53747d0)) {
                        z12 &= pVarArr[i3].z();
                    }
                    i3++;
                }
                z10 = z12;
            }
            if (z10) {
                this.f53756k0 = true;
            }
        }
    }

    public final r1 v(o1[] o1VarArr) {
        for (int i3 = 0; i3 < o1VarArr.length; i3++) {
            o1 o1Var = o1VarArr[i3];
            v[] vVarArr = new v[o1Var.f8252a];
            for (int i10 = 0; i10 < o1Var.f8252a; i10++) {
                v vVar = o1Var.d[i10];
                int u10 = this.h.u(vVar);
                u a10 = vVar.a();
                a10.S = u10;
                vVarArr[i10] = new v(a10);
            }
            o1VarArr[i3] = new o1(o1Var.f8253b, vVarArr);
        }
        return new r1(o1VarArr);
    }

    public final void x(int i3) {
        ArrayList arrayList;
        zb.p(!this.f53763s.d());
        while (true) {
            arrayList = this.E;
            if (i3 < arrayList.size()) {
                if (o(i3)) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 == -1) {
            return;
        }
        long j10 = y().f58153n;
        j jVar = (j) arrayList.get(i3);
        n0.X(i3, arrayList.size(), arrayList);
        for (int i10 = 0; i10 < this.M.length; i10++) {
            this.M[i10].o(jVar.f(i10));
        }
        if (arrayList.isEmpty()) {
            this.f53753h0 = this.f53752g0;
        } else {
            ((j) g9.o.n(arrayList)).f53701a0 = true;
        }
        this.f53756k0 = false;
        this.f53764w.B(jVar.h, this.R, j10);
    }

    public final j y() {
        return (j) p1.h(1, this.E);
    }

    @Override
    public final void f(b0 b0Var) {
    }
}
