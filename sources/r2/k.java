package r2;

import a8.ja;
import a8.xa;
import android.net.Uri;
import android.util.SparseArray;
import c8.g1;
import e2.m1;
import e2.q0;
import e2.s0;
import e2.t0;
import f5.v;
import h2.l0;
import h9.g0;
import h9.i0;
import h9.s1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import l2.p1;
import l2.r0;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.ff;
import org.telegram.ui.web.e1;
import s2.u;
import s2.w;
import x2.c0;
import x2.d0;
import x2.q1;
public final class k implements d0, u {
    public final int E;
    public final m2.j F;
    public final ff G = new ff(this, 14);
    public c0 H;
    public int I;
    public q1 J;
    public q[] K;
    public q[] L;
    public int M;
    public x2.n N;
    public final long O;
    public final c f55802a;
    public final s2.d f55803b;
    public final cf f55804c;
    public final j2.c0 d;
    public final q2.n f55805e;
    public final q2.k f55806f;
    public final qb.a h;
    public final xa f55807n;
    public final h6.m f55808r;
    public final IdentityHashMap f55809s;
    public final cf f55810w;
    public final nb.a f55811x;
    public final boolean f55812y;

    public k(c cVar, s2.d dVar, cf cfVar, j2.c0 c0Var, q2.n nVar, q2.k kVar, qb.a aVar, xa xaVar, h6.m mVar, nb.a aVar2, boolean z10, int i7, m2.j jVar) {
        this.f55802a = cVar;
        this.f55803b = dVar;
        this.f55804c = cfVar;
        this.d = c0Var;
        this.f55805e = nVar;
        this.f55806f = kVar;
        this.h = aVar;
        this.f55807n = xaVar;
        this.f55808r = mVar;
        this.f55811x = aVar2;
        this.f55812y = z10;
        this.E = i7;
        this.F = jVar;
        aVar2.getClass();
        g0 g0Var = i0.f13686b;
        s1 s1Var = s1.f13749e;
        this.N = new x2.n(s1Var, s1Var);
        this.f55809s = new IdentityHashMap();
        this.f55810w = new cf(14);
        this.K = new q[0];
        this.L = new q[0];
        this.O = Long.MIN_VALUE;
    }

    public static e2.u k(e2.u uVar, e2.u uVar2, boolean z10) {
        q0 q0Var;
        int i7;
        String str;
        String str2;
        i0 i0Var;
        int i10;
        int i11;
        String str3;
        int i12;
        g0 g0Var = i0.f13686b;
        s1 s1Var = s1.f13749e;
        int i13 = -1;
        if (uVar2 != null) {
            str2 = uVar2.f10443k;
            q0Var = uVar2.f10444l;
            i10 = uVar2.K;
            i7 = uVar2.f10438e;
            i11 = uVar2.f10439f;
            str = uVar2.d;
            str3 = uVar2.f10436b;
            i0Var = uVar2.f10437c;
        } else {
            String w10 = l0.w(1, uVar.f10443k);
            q0Var = uVar.f10444l;
            if (z10) {
                i10 = uVar.K;
                i7 = uVar.f10438e;
                i11 = uVar.f10439f;
                str = uVar.d;
                str3 = uVar.f10436b;
                str2 = w10;
                i0Var = uVar.f10437c;
            } else {
                i7 = 0;
                str = null;
                str2 = w10;
                i0Var = s1Var;
                i10 = -1;
                i11 = 0;
                str3 = null;
            }
        }
        String d = s0.d(str2);
        if (z10) {
            i12 = uVar.h;
        } else {
            i12 = -1;
        }
        if (z10) {
            i13 = uVar.f10441i;
        }
        e2.t tVar = new e2.t();
        tVar.f10384a = uVar.f10435a;
        tVar.f10385b = str3;
        tVar.f10386c = i0.q(i0Var);
        tVar.f10398q = s0.n(uVar.f10450r);
        tVar.f10399r = s0.n(d);
        tVar.f10391j = str2;
        tVar.f10392k = q0Var;
        tVar.h = i12;
        tVar.f10390i = i13;
        tVar.J = i10;
        tVar.f10387e = i7;
        tVar.f10388f = i11;
        tVar.d = str;
        return new e2.u(tVar);
    }

    @Override
    public final void a() {
        q[] qVarArr;
        i0 i0Var;
        long j3;
        for (q qVar : this.K) {
            b3.o oVar = qVar.f55858s;
            h hVar = qVar.d;
            ArrayList arrayList = qVar.E;
            if (!arrayList.isEmpty()) {
                i iVar = (i) h9.o.n(arrayList);
                int c10 = hVar.c(iVar);
                int i7 = iVar.F;
                boolean z10 = true;
                if (c10 == 1) {
                    if (!iVar.g()) {
                        if (i7 == -1) {
                            z10 = false;
                        }
                        ja.p(z10);
                        s2.m b10 = hVar.f55782g.b(iVar.f55800y, false);
                        b10.getClass();
                        i0 i0Var2 = b10.f56265r;
                        int i10 = (int) (iVar.f60141s - b10.f56258k);
                        if (i10 < 0) {
                            j3 = 0;
                        } else {
                            if (i10 < i0Var2.size()) {
                                i0Var = ((s2.j) i0Var2.get(i10)).f56239y;
                            } else {
                                i0Var = b10.f56266s;
                            }
                            j3 = ((s2.h) i0Var.get(i7)).f56242c;
                        }
                        iVar.f55796b0 = j3;
                    }
                } else if (c10 == 0) {
                    qVar.I.post(new e1(14, qVar, iVar));
                } else if (c10 == 2 && !qVar.f55851k0 && oVar.d()) {
                    oVar.b();
                }
            }
        }
        this.H.f0(this);
    }

    @Override
    public final long b(a3.u[] r40, boolean[] r41, x2.b1[] r42, boolean[] r43, long r44) {
        throw new UnsupportedOperationException("Method not decompiled: r2.k.b(a3.u[], boolean[], x2.b1[], boolean[], long):long");
    }

    @Override
    public final boolean c(l2.s0 s0Var) {
        q[] qVarArr;
        if (this.J == null) {
            for (q qVar : this.K) {
                if (!qVar.U) {
                    r0 r0Var = new r0();
                    r0Var.f19172a = qVar.f55847g0;
                    qVar.c(new l2.s0(r0Var));
                }
            }
            return false;
        }
        return this.N.c(s0Var);
    }

    @Override
    public final boolean d(Uri uri, v vVar, boolean z10) {
        int i7;
        boolean z11;
        w wVar;
        b3.i iVar;
        int u10;
        boolean z12;
        w wVar2;
        q[] qVarArr = this.K;
        int length = qVarArr.length;
        int i10 = 0;
        boolean z13 = false;
        while (i10 < length) {
            q qVar = qVarArr[i10];
            h hVar = qVar.d;
            w[] wVarArr = hVar.f55780e;
            s2.d dVar = hVar.f55782g;
            int length2 = wVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length2) {
                    break;
                }
                w wVar3 = wVarArr[i11];
                s2.c cVar = (s2.c) dVar.d.get(uri);
                if (cVar != null) {
                    wVar = cVar.f56180a;
                } else {
                    wVar = null;
                }
                if (wVar3.equals(wVar)) {
                    if (!z10) {
                        b3.h a10 = hVar.a(uri);
                        qVar.f55857r.getClass();
                        iVar = qb.a.Q4(a10, vVar);
                    } else {
                        iVar = null;
                    }
                    hVar.f55789o = uri;
                    if (iVar != null) {
                        int i12 = iVar.f2907a;
                        i7 = i10;
                        long j3 = iVar.f2908b;
                        if (i12 != 1) {
                            if (i12 == 2) {
                                int i13 = 0;
                                while (true) {
                                    if (i13 < wVarArr.length) {
                                        w wVar4 = wVarArr[i13];
                                        s2.c cVar2 = (s2.c) dVar.d.get(uri);
                                        if (cVar2 != null) {
                                            wVar2 = cVar2.f56180a;
                                        } else {
                                            wVar2 = null;
                                        }
                                        if (wVar4.equals(wVar2)) {
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        i13 = -1;
                                        break;
                                    }
                                }
                                if (i13 != -1 && (u10 = hVar.f55792r.u(i13)) != -1 && hVar.f55792r.p(u10, j3)) {
                                    s2.c cVar3 = (s2.c) dVar.d.get(uri);
                                    if (cVar3 != null) {
                                        z12 = s2.c.c(cVar3, uri, j3);
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        z11 = true;
                                    }
                                }
                            } else {
                                throw new IllegalStateException(i5.c.i(i12, "Invalid fallback selection type: "));
                            }
                        } else {
                            s2.c cVar4 = (s2.c) dVar.d.get(uri);
                            if (cVar4 != null) {
                                z11 = s2.c.c(cVar4, uri, j3);
                            }
                        }
                    }
                } else {
                    i11++;
                }
            }
            i7 = i10;
            z11 = false;
            z13 |= z11;
            i10 = i7 + 1;
        }
        this.H.f0(this);
        return z13;
    }

    @Override
    public final long e() {
        return this.N.e();
    }

    public final q f(String str, int i7, w[] wVarArr, e2.u[] uVarArr, e2.u uVar, List list, Map map, long j3) {
        q qVar = new q(str, i7, this.G, new h(this.f55802a, this.f55803b, wVarArr, uVarArr, this.f55804c, this.d, this.f55810w, list, this.F), map, this.f55808r, j3, uVar, this.f55805e, this.f55806f, this.h, this.f55807n, this.E, null);
        long j10 = this.O;
        qVar.f55852l0 = j10;
        if (qVar.T) {
            for (p pVar : qVar.M) {
                pVar.K(j10);
            }
        }
        return qVar;
    }

    @Override
    public final boolean g() {
        return this.N.g();
    }

    @Override
    public final long h(long j3, p1 p1Var) {
        s2.m mVar;
        long j10;
        q[] qVarArr = this.L;
        int length = qVarArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            q qVar = qVarArr[i7];
            if (qVar.R == 2) {
                h hVar = qVar.d;
                s2.d dVar = hVar.f55782g;
                int d = hVar.f55792r.d();
                w[] wVarArr = hVar.f55780e;
                if (d < wVarArr.length && d != -1) {
                    mVar = dVar.b(wVarArr[hVar.f55792r.m()].c(), true);
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    i0 i0Var = mVar.f56265r;
                    if (!i0Var.isEmpty()) {
                        long j11 = mVar.h - dVar.J;
                        long j12 = j3 - j11;
                        int d2 = l0.d(i0Var, Long.valueOf(j12), true);
                        long j13 = ((s2.j) i0Var.get(d2)).f56243e;
                        if (mVar.f56291c && d2 != i0Var.size() - 1) {
                            j10 = ((s2.j) i0Var.get(d2 + 1)).f56243e;
                        } else {
                            j10 = j13;
                        }
                        return p1Var.a(j12, j13, j10) + j11;
                    }
                }
            } else {
                i7++;
            }
        }
        return j3;
    }

    @Override
    public final void i() {
        q[] qVarArr;
        for (q qVar : this.K) {
            qVar.E();
            if (qVar.f55851k0 && !qVar.U) {
                throw t0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override
    public final long j(long j3) {
        q[] qVarArr = this.L;
        if (qVarArr.length > 0) {
            boolean H = qVarArr[0].H(j3, false);
            int i7 = 1;
            while (true) {
                q[] qVarArr2 = this.L;
                if (i7 >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i7].H(j3, H);
                i7++;
            }
            if (H) {
                ((SparseArray) this.f55810w.f33545a).clear();
            }
        }
        return j3;
    }

    @Override
    public final void l(long j3) {
        q[] qVarArr;
        for (q qVar : this.L) {
            if (qVar.T && !qVar.C()) {
                int length = qVar.M.length;
                for (int i7 = 0; i7 < length; i7++) {
                    qVar.M[i7].k(j3, qVar.f55844e0[i7]);
                }
            }
        }
    }

    @Override
    public final long o() {
        return -9223372036854775807L;
    }

    @Override
    public final q1 p() {
        q1 q1Var = this.J;
        q1Var.getClass();
        return q1Var;
    }

    @Override
    public final long s() {
        return this.N.s();
    }

    @Override
    public final void t(c0 c0Var, long j3) {
        String str;
        c cVar;
        boolean z10;
        Map map;
        i0 i0Var;
        q[] qVarArr;
        int i7;
        HashSet hashSet;
        int i10;
        HashSet hashSet2;
        i0 i0Var2;
        Map map2;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        boolean z15;
        List list;
        this.H = c0Var;
        s2.d dVar = this.f55803b;
        dVar.getClass();
        dVar.f56186e.add(this);
        s2.p pVar = dVar.f56190s;
        pVar.getClass();
        Map map3 = Collections.EMPTY_MAP;
        i0 c10 = dVar.c(0);
        c10.getClass();
        i0 c11 = dVar.c(2);
        c11.getClass();
        i0 c12 = dVar.c(3);
        c12.getClass();
        boolean isEmpty = c10.isEmpty();
        this.I = 0;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        c cVar2 = this.f55802a;
        boolean z16 = this.f55812y;
        if (isEmpty) {
            str = "ID3";
            cVar = cVar2;
            z10 = z16;
            map = map3;
            i0Var = c12;
        } else {
            e2.u uVar = pVar.f56285j;
            List list2 = pVar.f56286k;
            int size = c10.size();
            int[] iArr = new int[size];
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < c10.size(); i14++) {
                e2.u uVar2 = ((w) c10.get(i14)).f56331a.f56328a;
                int i15 = uVar2.A;
                String str2 = uVar2.f10443k;
                if (i15 > 0 || l0.w(2, str2) != null) {
                    int i16 = i13;
                    iArr[i14] = 2;
                    i12++;
                    i13 = i16;
                } else if (l0.w(1, str2) != null) {
                    iArr[i14] = 1;
                    i13++;
                } else {
                    iArr[i14] = -1;
                }
            }
            int i17 = i13;
            if (i12 > 0) {
                z13 = false;
                i11 = i12;
                z12 = true;
            } else if (i17 < size) {
                int i18 = size - i17;
                z12 = false;
                i11 = i18;
                z13 = true;
            } else {
                z12 = false;
                z13 = false;
                i11 = size;
            }
            w[] wVarArr = new w[i11];
            e2.u[] uVarArr = new e2.u[i11];
            int[] iArr2 = new int[i11];
            int i19 = 0;
            boolean z17 = z12;
            int i20 = 0;
            while (i20 < c10.size()) {
                if (z17) {
                    list = list2;
                    if (iArr[i20] != 2) {
                        i20++;
                        list2 = list;
                    }
                } else {
                    list = list2;
                }
                if (!z13 || iArr[i20] != 1) {
                    w wVar = (w) c10.get(i20);
                    wVarArr[i19] = wVar;
                    uVarArr[i19] = wVar.f56331a.f56328a;
                    iArr2[i19] = i20;
                    i19++;
                }
                i20++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = uVarArr[0].f10443k;
            int v = l0.v(2, str3);
            int i21 = 1;
            int v10 = l0.v(1, str3);
            if ((v10 == 1 || (v10 == 0 && c11.isEmpty())) && v <= 1 && v10 + v > 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z17 && v10 > 0) {
                z15 = true;
            } else {
                z15 = true;
                i21 = 0;
            }
            z10 = z16;
            i0Var = c12;
            q f10 = f("main", i21, wVarArr, uVarArr, uVar, list3, map3, j3);
            arrayList3.add(f10);
            arrayList4.add(iArr2);
            if (z10 && z14) {
                ArrayList arrayList5 = new ArrayList();
                if (v > 0) {
                    e2.u[] uVarArr2 = new e2.u[i11];
                    int i22 = 0;
                    while (i22 < i11) {
                        e2.u uVar3 = uVarArr[i22];
                        String w10 = l0.w(2, uVar3.f10443k);
                        String d = s0.d(w10);
                        e2.u[] uVarArr3 = uVarArr;
                        e2.t tVar = new e2.t();
                        tVar.f10384a = uVar3.f10435a;
                        tVar.f10385b = uVar3.f10436b;
                        tVar.f10386c = i0.q(uVar3.f10437c);
                        tVar.f10398q = s0.n(uVar3.f10450r);
                        tVar.f10399r = s0.n(d);
                        tVar.f10391j = w10;
                        tVar.f10392k = uVar3.f10444l;
                        tVar.h = uVar3.h;
                        tVar.f10390i = uVar3.f10441i;
                        tVar.f10405y = uVar3.f10457z;
                        tVar.f10406z = uVar3.A;
                        tVar.C = uVar3.D;
                        tVar.f10387e = uVar3.f10438e;
                        tVar.f10388f = uVar3.f10439f;
                        tVar.H = uVar3.I;
                        uVarArr2[i22] = new e2.u(tVar);
                        i22++;
                        uVarArr = uVarArr3;
                        map3 = map3;
                    }
                    e2.u[] uVarArr4 = uVarArr;
                    map = map3;
                    arrayList5.add(new m1("main", uVarArr2));
                    if (v10 > 0 && (uVar != null || c11.isEmpty())) {
                        e2.t a10 = k(uVarArr4[0], uVar, false).a();
                        a10.f10393l = "main";
                        arrayList5.add(new m1("main:audio", new e2.u(a10)));
                    }
                    if (list3 != null) {
                        for (int i23 = 0; i23 < list3.size(); i23++) {
                            String i24 = i5.c.i(i23, "main:cc:");
                            e2.t a11 = cVar2.b((e2.u) list3.get(i23)).a();
                            a11.f10393l = "main";
                            arrayList5.add(new m1(i24, new e2.u(a11)));
                        }
                    }
                    cVar = cVar2;
                } else {
                    map = map3;
                    cVar = cVar2;
                    e2.u[] uVarArr5 = new e2.u[i11];
                    for (int i25 = 0; i25 < i11; i25++) {
                        uVarArr5[i25] = k(uVarArr[i25], uVar, true);
                    }
                    arrayList5.add(new m1("main", uVarArr5));
                }
                e2.t tVar2 = new e2.t();
                str = "ID3";
                tVar2.f10384a = str;
                tVar2.f10399r = s0.n("application/id3");
                tVar2.f10393l = "main";
                m1 m1Var = new m1("main:id3", new e2.u(tVar2));
                arrayList5.add(m1Var);
                f10.F((m1[]) arrayList5.toArray(new m1[0]), arrayList5.indexOf(m1Var));
            } else {
                map = map3;
                str = "ID3";
                cVar = cVar2;
            }
        }
        ArrayList arrayList6 = new ArrayList(c11.size());
        ArrayList arrayList7 = new ArrayList(c11.size());
        ArrayList arrayList8 = new ArrayList(c11.size());
        HashSet hashSet3 = new HashSet();
        int i26 = 0;
        while (i26 < c11.size()) {
            String str4 = ((w) c11.get(i26)).f56331a.f56330c;
            str4.getClass();
            if (!hashSet3.add(str4)) {
                hashSet2 = hashSet3;
                i10 = i26;
                i0Var2 = c11;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
            } else {
                arrayList6.clear();
                arrayList7.clear();
                arrayList8.clear();
                boolean z18 = true;
                for (int i27 = 0; i27 < c11.size(); i27++) {
                    if (str4.equals(((w) c11.get(i27)).f56331a.f56330c)) {
                        w wVar2 = (w) c11.get(i27);
                        e2.u uVar4 = wVar2.f56331a.f56328a;
                        arrayList8.add(Integer.valueOf(i27));
                        arrayList6.add(wVar2);
                        arrayList7.add(uVar4);
                        if (l0.v(1, uVar4.f10443k) == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z18 &= z11;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = l0.f13471a;
                i10 = i26;
                hashSet2 = hashSet3;
                i0Var2 = c11;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
                q f11 = f(concat, 1, (w[]) arrayList6.toArray(new w[0]), (e2.u[]) arrayList7.toArray(new e2.u[0]), null, Collections.EMPTY_LIST, map2, j3);
                arrayList4.add(g1.f(arrayList2));
                arrayList3.add(f11);
                if (z10 && z18) {
                    String v11 = r.b.v(concat, ":id3");
                    e2.t tVar3 = new e2.t();
                    tVar3.f10384a = str;
                    tVar3.f10399r = s0.n("application/id3");
                    tVar3.f10393l = concat;
                    f11.F(new m1[]{new m1(concat, (e2.u[]) arrayList.toArray(new e2.u[0])), new m1(v11, new e2.u(tVar3))}, 1);
                }
            }
            i26 = i10 + 1;
            arrayList7 = arrayList;
            c11 = i0Var2;
            arrayList8 = arrayList2;
            hashSet3 = hashSet2;
            map = map2;
        }
        Map map4 = map;
        this.M = arrayList3.size();
        ArrayList arrayList9 = new ArrayList(i0Var.size());
        ArrayList arrayList10 = new ArrayList(i0Var.size());
        ArrayList arrayList11 = new ArrayList(i0Var.size());
        HashSet hashSet4 = new HashSet();
        int i28 = 0;
        while (i28 < i0Var.size()) {
            i0 i0Var3 = i0Var;
            String str6 = ((w) i0Var3.get(i28)).f56331a.f56330c;
            str6.getClass();
            if (!hashSet4.add(str6)) {
                hashSet = hashSet4;
                i7 = i28;
                i0Var = i0Var3;
            } else {
                arrayList9.clear();
                arrayList10.clear();
                arrayList11.clear();
                for (int i29 = 0; i29 < i0Var3.size(); i29++) {
                    if (str6.equals(((w) i0Var3.get(i29)).f56331a.f56330c)) {
                        w wVar3 = (w) i0Var3.get(i29);
                        arrayList11.add(Integer.valueOf(i29));
                        arrayList9.add(wVar3);
                        arrayList10.add(wVar3.f56331a.f56328a);
                    }
                }
                String concat2 = "subtitle:".concat(str6);
                e2.u[] uVarArr6 = (e2.u[]) arrayList10.toArray(new e2.u[0]);
                String str7 = l0.f13471a;
                g0 g0Var = i0.f13686b;
                i0Var = i0Var3;
                i7 = i28;
                hashSet = hashSet4;
                q f12 = f(concat2, 3, (w[]) arrayList9.toArray(new w[0]), uVarArr6, null, s1.f13749e, map4, j3);
                arrayList4.add(g1.f(arrayList11));
                arrayList3.add(f12);
                int length = uVarArr6.length;
                e2.u[] uVarArr7 = new e2.u[length];
                for (int i30 = 0; i30 < length; i30++) {
                    uVarArr7[i30] = cVar.b(uVarArr6[i30]);
                }
                f12.F(new m1[]{new m1(concat2, uVarArr7)}, new int[0]);
            }
            i28 = i7 + 1;
            hashSet4 = hashSet;
        }
        this.K = (q[]) arrayList3.toArray(new q[0]);
        int[][] iArr3 = (int[][]) arrayList4.toArray(new int[0]);
        this.I = this.K.length;
        for (int i31 = 0; i31 < this.M; i31++) {
            this.K[i31].d.f55786l = true;
        }
        for (q qVar : this.K) {
            if (!qVar.U) {
                r0 r0Var = new r0();
                r0Var.f19172a = qVar.f55847g0;
                qVar.c(new l2.s0(r0Var));
            }
        }
        this.L = this.K;
    }

    @Override
    public final void u(long j3) {
        this.N.u(j3);
    }
}
