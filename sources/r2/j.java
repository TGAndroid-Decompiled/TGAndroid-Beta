package r2;

import a8.ia;
import a8.wa;
import android.net.Uri;
import android.util.SparseArray;
import c8.e1;
import e2.m1;
import e2.q0;
import e2.s0;
import e2.t;
import e2.t0;
import h2.m0;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import l2.u0;
import l2.v0;
import org.telegram.ui.Components.qt;
import s2.u;
import s2.w;
import x2.c0;
import x2.d0;
import x2.p1;
public final class j implements d0, u {
    public final int D;
    public final m2.j E;
    public final qt F = new qt(this, 12);
    public c0 G;
    public int H;
    public p1 I;
    public p[] J;
    public p[] K;
    public int L;
    public x2.n M;
    public final long N;
    public final c f54331a;
    public final s2.d f54332b;
    public final org.telegram.ui.Components.m f54333c;
    public final j2.d0 d;
    public final q2.m f54334e;
    public final q2.j f54335f;
    public final pb.b h;
    public final wa f54336n;
    public final h6.m f54337r;
    public final IdentityHashMap f54338s;
    public final org.telegram.ui.Components.m f54339w;
    public final sa.d f54340x;
    public final boolean f54341y;

    public j(c cVar, s2.d dVar, org.telegram.ui.Components.m mVar, j2.d0 d0Var, q2.m mVar2, q2.j jVar, pb.b bVar, wa waVar, h6.m mVar3, sa.d dVar2, boolean z9, int i7, m2.j jVar2) {
        this.f54331a = cVar;
        this.f54332b = dVar;
        this.f54333c = mVar;
        this.d = d0Var;
        this.f54334e = mVar2;
        this.f54335f = jVar;
        this.h = bVar;
        this.f54336n = waVar;
        this.f54337r = mVar3;
        this.f54340x = dVar2;
        this.f54341y = z9;
        this.D = i7;
        this.E = jVar2;
        dVar2.getClass();
        g0 g0Var = i0.f14331b;
        t1 t1Var = t1.f14399e;
        this.M = new x2.n(t1Var, t1Var);
        this.f54338s = new IdentityHashMap();
        this.f54339w = new org.telegram.ui.Components.m(15);
        this.J = new p[0];
        this.K = new p[0];
        this.N = Long.MIN_VALUE;
    }

    public static e2.u l(e2.u uVar, e2.u uVar2, boolean z9) {
        q0 q0Var;
        int i7;
        String str;
        String str2;
        i0 i0Var;
        int i10;
        int i11;
        String str3;
        int i12;
        g0 g0Var = i0.f14331b;
        t1 t1Var = t1.f14399e;
        int i13 = -1;
        if (uVar2 != null) {
            str2 = uVar2.f10612k;
            q0Var = uVar2.f10613l;
            i10 = uVar2.K;
            i7 = uVar2.f10607e;
            i11 = uVar2.f10608f;
            str = uVar2.d;
            str3 = uVar2.f10605b;
            i0Var = uVar2.f10606c;
        } else {
            String w10 = m0.w(1, uVar.f10612k);
            q0Var = uVar.f10613l;
            if (z9) {
                i10 = uVar.K;
                i7 = uVar.f10607e;
                i11 = uVar.f10608f;
                str = uVar.d;
                str3 = uVar.f10605b;
                str2 = w10;
                i0Var = uVar.f10606c;
            } else {
                i7 = 0;
                str = null;
                str2 = w10;
                i0Var = t1Var;
                i10 = -1;
                i11 = 0;
                str3 = null;
            }
        }
        String d = s0.d(str2);
        if (z9) {
            i12 = uVar.h;
        } else {
            i12 = -1;
        }
        if (z9) {
            i13 = uVar.f10610i;
        }
        t tVar = new t();
        tVar.f10553a = uVar.f10604a;
        tVar.f10554b = str3;
        tVar.f10555c = i0.q(i0Var);
        tVar.f10567q = s0.n(uVar.f10619r);
        tVar.f10568r = s0.n(d);
        tVar.f10560j = str2;
        tVar.f10561k = q0Var;
        tVar.h = i12;
        tVar.f10559i = i13;
        tVar.J = i10;
        tVar.f10556e = i7;
        tVar.f10557f = i11;
        tVar.d = str;
        return new e2.u(tVar);
    }

    @Override
    public final void a() {
        p[] pVarArr;
        i0 i0Var;
        long j3;
        for (p pVar : this.J) {
            b3.o oVar = pVar.f54386s;
            h hVar = pVar.d;
            ArrayList arrayList = pVar.D;
            if (!arrayList.isEmpty()) {
                i iVar = (i) h9.o.n(arrayList);
                int c10 = hVar.c(iVar);
                int i7 = iVar.E;
                boolean z9 = true;
                if (c10 == 1) {
                    if (!iVar.g()) {
                        if (i7 == -1) {
                            z9 = false;
                        }
                        ia.p(z9);
                        s2.m b10 = hVar.f54313g.b(iVar.f54330y, false);
                        b10.getClass();
                        i0 i0Var2 = b10.f54711r;
                        int i10 = (int) (iVar.f58928s - b10.f54704k);
                        if (i10 < 0) {
                            j3 = 0;
                        } else {
                            if (i10 < i0Var2.size()) {
                                i0Var = ((s2.j) i0Var2.get(i10)).f54685y;
                            } else {
                                i0Var = b10.f54712s;
                            }
                            j3 = ((s2.h) i0Var.get(i7)).f54688c;
                        }
                        iVar.f54326a0 = j3;
                    }
                } else if (c10 == 0) {
                    pVar.H.post(new org.telegram.ui.web.s(17, pVar, iVar));
                } else if (c10 == 2 && !pVar.f54379j0 && oVar.d()) {
                    oVar.b();
                }
            }
        }
        this.G.d(this);
    }

    @Override
    public final long b(a3.u[] r40, boolean[] r41, x2.b1[] r42, boolean[] r43, long r44) {
        throw new UnsupportedOperationException("Method not decompiled: r2.j.b(a3.u[], boolean[], x2.b1[], boolean[], long):long");
    }

    @Override
    public final boolean c(v0 v0Var) {
        p[] pVarArr;
        if (this.I == null) {
            for (p pVar : this.J) {
                if (!pVar.T) {
                    u0 u0Var = new u0();
                    u0Var.f18059a = pVar.f54375f0;
                    pVar.c(new v0(u0Var));
                }
            }
            return false;
        }
        return this.M.c(v0Var);
    }

    @Override
    public final boolean d(Uri uri, f5.u uVar, boolean z9) {
        int i7;
        boolean z10;
        w wVar;
        b3.i iVar;
        int u10;
        boolean z11;
        w wVar2;
        p[] pVarArr = this.J;
        int length = pVarArr.length;
        int i10 = 0;
        boolean z12 = false;
        while (i10 < length) {
            p pVar = pVarArr[i10];
            h hVar = pVar.d;
            w[] wVarArr = hVar.f54311e;
            s2.d dVar = hVar.f54313g;
            int length2 = wVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length2) {
                    break;
                }
                w wVar3 = wVarArr[i11];
                s2.c cVar = (s2.c) dVar.d.get(uri);
                if (cVar != null) {
                    wVar = cVar.f54626a;
                } else {
                    wVar = null;
                }
                if (wVar3.equals(wVar)) {
                    if (!z9) {
                        b3.h a10 = hVar.a(uri);
                        pVar.f54385r.getClass();
                        iVar = pb.b.V0(a10, uVar);
                    } else {
                        iVar = null;
                    }
                    hVar.f54320o = uri;
                    if (iVar != null) {
                        int i12 = iVar.f2950a;
                        i7 = i10;
                        long j3 = iVar.f2951b;
                        if (i12 != 1) {
                            if (i12 == 2) {
                                int i13 = 0;
                                while (true) {
                                    if (i13 < wVarArr.length) {
                                        w wVar4 = wVarArr[i13];
                                        s2.c cVar2 = (s2.c) dVar.d.get(uri);
                                        if (cVar2 != null) {
                                            wVar2 = cVar2.f54626a;
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
                                if (i13 != -1 && (u10 = hVar.f54323r.u(i13)) != -1 && hVar.f54323r.p(u10, j3)) {
                                    s2.c cVar3 = (s2.c) dVar.d.get(uri);
                                    if (cVar3 != null) {
                                        z11 = s2.c.c(cVar3, uri, j3);
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        z10 = true;
                                    }
                                }
                            } else {
                                throw new IllegalStateException(jg.g.j(i12, "Invalid fallback selection type: "));
                            }
                        } else {
                            s2.c cVar4 = (s2.c) dVar.d.get(uri);
                            if (cVar4 != null) {
                                z10 = s2.c.c(cVar4, uri, j3);
                            }
                        }
                    }
                } else {
                    i11++;
                }
            }
            i7 = i10;
            z10 = false;
            z12 |= z10;
            i10 = i7 + 1;
        }
        this.G.d(this);
        return z12;
    }

    @Override
    public final long e() {
        return this.M.e();
    }

    public final p f(String str, int i7, w[] wVarArr, e2.u[] uVarArr, e2.u uVar, List list, Map map, long j3) {
        p pVar = new p(str, i7, this.F, new h(this.f54331a, this.f54332b, wVarArr, uVarArr, this.f54333c, this.d, this.f54339w, list, this.E), map, this.f54337r, j3, uVar, this.f54334e, this.f54335f, this.h, this.f54336n, this.D, null);
        long j10 = this.N;
        pVar.f54380k0 = j10;
        if (pVar.S) {
            for (o oVar : pVar.L) {
                oVar.K(j10);
            }
        }
        return pVar;
    }

    @Override
    public final boolean g() {
        return this.M.g();
    }

    @Override
    public final long h(long j3, l2.t1 t1Var) {
        s2.m mVar;
        long j10;
        p[] pVarArr = this.K;
        int length = pVarArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            p pVar = pVarArr[i7];
            if (pVar.Q == 2) {
                h hVar = pVar.d;
                s2.d dVar = hVar.f54313g;
                int d = hVar.f54323r.d();
                w[] wVarArr = hVar.f54311e;
                if (d < wVarArr.length && d != -1) {
                    mVar = dVar.b(wVarArr[hVar.f54323r.m()].c(), true);
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    i0 i0Var = mVar.f54711r;
                    if (!i0Var.isEmpty()) {
                        long j11 = mVar.h - dVar.I;
                        long j12 = j3 - j11;
                        int d2 = m0.d(i0Var, Long.valueOf(j12), true);
                        long j13 = ((s2.j) i0Var.get(d2)).f54689e;
                        if (mVar.f54737c && d2 != i0Var.size() - 1) {
                            j10 = ((s2.j) i0Var.get(d2 + 1)).f54689e;
                        } else {
                            j10 = j13;
                        }
                        return t1Var.a(j12, j13, j10) + j11;
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
        p[] pVarArr;
        for (p pVar : this.J) {
            pVar.A();
            if (pVar.f54379j0 && !pVar.T) {
                throw t0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override
    public final long j(long j3) {
        p[] pVarArr = this.K;
        if (pVarArr.length > 0) {
            boolean D = pVarArr[0].D(j3, false);
            int i7 = 1;
            while (true) {
                p[] pVarArr2 = this.K;
                if (i7 >= pVarArr2.length) {
                    break;
                }
                pVarArr2[i7].D(j3, D);
                i7++;
            }
            if (D) {
                ((SparseArray) this.f54339w.f35778a).clear();
            }
        }
        return j3;
    }

    @Override
    public final void k(long j3) {
        p[] pVarArr;
        for (p pVar : this.K) {
            if (pVar.S && !pVar.y()) {
                int length = pVar.L.length;
                for (int i7 = 0; i7 < length; i7++) {
                    pVar.L[i7].k(j3, pVar.f54371d0[i7]);
                }
            }
        }
    }

    @Override
    public final long n() {
        return -9223372036854775807L;
    }

    @Override
    public final p1 o() {
        p1 p1Var = this.I;
        p1Var.getClass();
        return p1Var;
    }

    @Override
    public final long p() {
        return this.M.p();
    }

    @Override
    public final void q(c0 c0Var, long j3) {
        String str;
        c cVar;
        boolean z9;
        Map map;
        i0 i0Var;
        p[] pVarArr;
        int i7;
        HashSet hashSet;
        int i10;
        HashSet hashSet2;
        i0 i0Var2;
        Map map2;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        List list;
        this.G = c0Var;
        s2.d dVar = this.f54332b;
        dVar.getClass();
        dVar.f54632e.add(this);
        s2.p pVar = dVar.f54636s;
        pVar.getClass();
        Map map3 = Collections.EMPTY_MAP;
        i0 c10 = dVar.c(0);
        c10.getClass();
        i0 c11 = dVar.c(2);
        c11.getClass();
        i0 c12 = dVar.c(3);
        c12.getClass();
        boolean isEmpty = c10.isEmpty();
        this.H = 0;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        c cVar2 = this.f54331a;
        boolean z15 = this.f54341y;
        if (isEmpty) {
            str = "ID3";
            cVar = cVar2;
            z9 = z15;
            map = map3;
            i0Var = c12;
        } else {
            e2.u uVar = pVar.f54731j;
            List list2 = pVar.f54732k;
            int size = c10.size();
            int[] iArr = new int[size];
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < c10.size(); i14++) {
                e2.u uVar2 = ((w) c10.get(i14)).f54777a.f54774a;
                int i15 = uVar2.A;
                String str2 = uVar2.f10612k;
                if (i15 > 0 || m0.w(2, str2) != null) {
                    int i16 = i13;
                    iArr[i14] = 2;
                    i12++;
                    i13 = i16;
                } else if (m0.w(1, str2) != null) {
                    iArr[i14] = 1;
                    i13++;
                } else {
                    iArr[i14] = -1;
                }
            }
            int i17 = i13;
            if (i12 > 0) {
                z12 = false;
                i11 = i12;
                z11 = true;
            } else if (i17 < size) {
                int i18 = size - i17;
                z11 = false;
                i11 = i18;
                z12 = true;
            } else {
                z11 = false;
                z12 = false;
                i11 = size;
            }
            w[] wVarArr = new w[i11];
            e2.u[] uVarArr = new e2.u[i11];
            int[] iArr2 = new int[i11];
            int i19 = 0;
            boolean z16 = z11;
            int i20 = 0;
            while (i20 < c10.size()) {
                if (z16) {
                    list = list2;
                    if (iArr[i20] != 2) {
                        i20++;
                        list2 = list;
                    }
                } else {
                    list = list2;
                }
                if (!z12 || iArr[i20] != 1) {
                    w wVar = (w) c10.get(i20);
                    wVarArr[i19] = wVar;
                    uVarArr[i19] = wVar.f54777a.f54774a;
                    iArr2[i19] = i20;
                    i19++;
                }
                i20++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = uVarArr[0].f10612k;
            int v = m0.v(2, str3);
            int i21 = 1;
            int v10 = m0.v(1, str3);
            if ((v10 == 1 || (v10 == 0 && c11.isEmpty())) && v <= 1 && v10 + v > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z16 && v10 > 0) {
                z14 = true;
            } else {
                z14 = true;
                i21 = 0;
            }
            z9 = z15;
            i0Var = c12;
            p f10 = f("main", i21, wVarArr, uVarArr, uVar, list3, map3, j3);
            arrayList3.add(f10);
            arrayList4.add(iArr2);
            if (z9 && z13) {
                ArrayList arrayList5 = new ArrayList();
                if (v > 0) {
                    e2.u[] uVarArr2 = new e2.u[i11];
                    int i22 = 0;
                    while (i22 < i11) {
                        e2.u uVar3 = uVarArr[i22];
                        String w10 = m0.w(2, uVar3.f10612k);
                        String d = s0.d(w10);
                        e2.u[] uVarArr3 = uVarArr;
                        t tVar = new t();
                        tVar.f10553a = uVar3.f10604a;
                        tVar.f10554b = uVar3.f10605b;
                        tVar.f10555c = i0.q(uVar3.f10606c);
                        tVar.f10567q = s0.n(uVar3.f10619r);
                        tVar.f10568r = s0.n(d);
                        tVar.f10560j = w10;
                        tVar.f10561k = uVar3.f10613l;
                        tVar.h = uVar3.h;
                        tVar.f10559i = uVar3.f10610i;
                        tVar.f10574y = uVar3.f10626z;
                        tVar.f10575z = uVar3.A;
                        tVar.C = uVar3.D;
                        tVar.f10556e = uVar3.f10607e;
                        tVar.f10557f = uVar3.f10608f;
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
                        t a10 = l(uVarArr4[0], uVar, false).a();
                        a10.f10562l = "main";
                        arrayList5.add(new m1("main:audio", new e2.u(a10)));
                    }
                    if (list3 != null) {
                        for (int i23 = 0; i23 < list3.size(); i23++) {
                            String j10 = jg.g.j(i23, "main:cc:");
                            t a11 = cVar2.b((e2.u) list3.get(i23)).a();
                            a11.f10562l = "main";
                            arrayList5.add(new m1(j10, new e2.u(a11)));
                        }
                    }
                    cVar = cVar2;
                } else {
                    map = map3;
                    cVar = cVar2;
                    e2.u[] uVarArr5 = new e2.u[i11];
                    for (int i24 = 0; i24 < i11; i24++) {
                        uVarArr5[i24] = l(uVarArr[i24], uVar, true);
                    }
                    arrayList5.add(new m1("main", uVarArr5));
                }
                t tVar2 = new t();
                str = "ID3";
                tVar2.f10553a = str;
                tVar2.f10568r = s0.n("application/id3");
                tVar2.f10562l = "main";
                m1 m1Var = new m1("main:id3", new e2.u(tVar2));
                arrayList5.add(m1Var);
                f10.B((m1[]) arrayList5.toArray(new m1[0]), arrayList5.indexOf(m1Var));
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
        int i25 = 0;
        while (i25 < c11.size()) {
            String str4 = ((w) c11.get(i25)).f54777a.f54776c;
            str4.getClass();
            if (!hashSet3.add(str4)) {
                hashSet2 = hashSet3;
                i10 = i25;
                i0Var2 = c11;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
            } else {
                arrayList6.clear();
                arrayList7.clear();
                arrayList8.clear();
                boolean z17 = true;
                for (int i26 = 0; i26 < c11.size(); i26++) {
                    if (str4.equals(((w) c11.get(i26)).f54777a.f54776c)) {
                        w wVar2 = (w) c11.get(i26);
                        e2.u uVar4 = wVar2.f54777a.f54774a;
                        arrayList8.add(Integer.valueOf(i26));
                        arrayList6.add(wVar2);
                        arrayList7.add(uVar4);
                        if (m0.v(1, uVar4.f10612k) == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z17 &= z10;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = m0.f14114a;
                i10 = i25;
                hashSet2 = hashSet3;
                i0Var2 = c11;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
                p f11 = f(concat, 1, (w[]) arrayList6.toArray(new w[0]), (e2.u[]) arrayList7.toArray(new e2.u[0]), null, Collections.EMPTY_LIST, map2, j3);
                arrayList4.add(e1.f(arrayList2));
                arrayList3.add(f11);
                if (z9 && z17) {
                    String r10 = rf.b.r(concat, ":id3");
                    t tVar3 = new t();
                    tVar3.f10553a = str;
                    tVar3.f10568r = s0.n("application/id3");
                    tVar3.f10562l = concat;
                    f11.B(new m1[]{new m1(concat, (e2.u[]) arrayList.toArray(new e2.u[0])), new m1(r10, new e2.u(tVar3))}, 1);
                }
            }
            i25 = i10 + 1;
            arrayList7 = arrayList;
            c11 = i0Var2;
            arrayList8 = arrayList2;
            hashSet3 = hashSet2;
            map = map2;
        }
        Map map4 = map;
        this.L = arrayList3.size();
        ArrayList arrayList9 = new ArrayList(i0Var.size());
        ArrayList arrayList10 = new ArrayList(i0Var.size());
        ArrayList arrayList11 = new ArrayList(i0Var.size());
        HashSet hashSet4 = new HashSet();
        int i27 = 0;
        while (i27 < i0Var.size()) {
            i0 i0Var3 = i0Var;
            String str6 = ((w) i0Var3.get(i27)).f54777a.f54776c;
            str6.getClass();
            if (!hashSet4.add(str6)) {
                hashSet = hashSet4;
                i7 = i27;
                i0Var = i0Var3;
            } else {
                arrayList9.clear();
                arrayList10.clear();
                arrayList11.clear();
                for (int i28 = 0; i28 < i0Var3.size(); i28++) {
                    if (str6.equals(((w) i0Var3.get(i28)).f54777a.f54776c)) {
                        w wVar3 = (w) i0Var3.get(i28);
                        arrayList11.add(Integer.valueOf(i28));
                        arrayList9.add(wVar3);
                        arrayList10.add(wVar3.f54777a.f54774a);
                    }
                }
                String concat2 = "subtitle:".concat(str6);
                e2.u[] uVarArr6 = (e2.u[]) arrayList10.toArray(new e2.u[0]);
                String str7 = m0.f14114a;
                g0 g0Var = i0.f14331b;
                i0Var = i0Var3;
                i7 = i27;
                hashSet = hashSet4;
                p f12 = f(concat2, 3, (w[]) arrayList9.toArray(new w[0]), uVarArr6, null, t1.f14399e, map4, j3);
                arrayList4.add(e1.f(arrayList11));
                arrayList3.add(f12);
                int length = uVarArr6.length;
                e2.u[] uVarArr7 = new e2.u[length];
                for (int i29 = 0; i29 < length; i29++) {
                    uVarArr7[i29] = cVar.b(uVarArr6[i29]);
                }
                f12.B(new m1[]{new m1(concat2, uVarArr7)}, new int[0]);
            }
            i27 = i7 + 1;
            hashSet4 = hashSet;
        }
        this.J = (p[]) arrayList3.toArray(new p[0]);
        int[][] iArr3 = (int[][]) arrayList4.toArray(new int[0]);
        this.H = this.J.length;
        for (int i30 = 0; i30 < this.L; i30++) {
            this.J[i30].d.f54317l = true;
        }
        for (p pVar2 : this.J) {
            if (!pVar2.T) {
                u0 u0Var = new u0();
                u0Var.f18059a = pVar2.f54375f0;
                pVar2.c(new v0(u0Var));
            }
        }
        this.K = this.J;
    }

    @Override
    public final void r(long j3) {
        this.M.r(j3);
    }
}
