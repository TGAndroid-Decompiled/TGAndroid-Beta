package r2;

import a8.ma;
import a8.xa;
import android.net.Uri;
import android.util.SparseArray;
import c8.l1;
import e2.m1;
import e2.q0;
import e2.s0;
import e2.t;
import e2.t0;
import h2.l0;
import h9.g0;
import h9.i0;
import h9.t1;
import j2.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import l2.p1;
import l2.r0;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.Components.pf;
import p4.o0;
import s2.u;
import s2.w;
import x2.d0;
import x2.e0;
import x2.r1;
public final class j implements e0, u {
    public final int E;
    public final m2.i F;
    public final pf G = new pf(this, 14);
    public d0 H;
    public int I;
    public r1 J;
    public p[] K;
    public p[] L;
    public int M;
    public x2.n N;
    public final long O;
    public final c f56386a;
    public final s2.d f56387b;
    public final c5 f56388c;
    public final c0 d;
    public final q2.m f56389e;
    public final q2.j f56390f;
    public final qb.a h;
    public final xa f56391n;
    public final h6.m f56392r;
    public final IdentityHashMap f56393s;
    public final c5 f56394w;
    public final nb.a f56395x;
    public final boolean f56396y;

    public j(c cVar, s2.d dVar, c5 c5Var, c0 c0Var, q2.m mVar, q2.j jVar, qb.a aVar, xa xaVar, h6.m mVar2, nb.a aVar2, boolean z10, int i7, m2.i iVar) {
        this.f56386a = cVar;
        this.f56387b = dVar;
        this.f56388c = c5Var;
        this.d = c0Var;
        this.f56389e = mVar;
        this.f56390f = jVar;
        this.h = aVar;
        this.f56391n = xaVar;
        this.f56392r = mVar2;
        this.f56395x = aVar2;
        this.f56396y = z10;
        this.E = i7;
        this.F = iVar;
        aVar2.getClass();
        g0 g0Var = i0.f13998b;
        t1 t1Var = t1.f14066e;
        this.N = new x2.n(t1Var, t1Var);
        this.f56393s = new IdentityHashMap();
        this.f56394w = new c5(17);
        this.K = new p[0];
        this.L = new p[0];
        this.O = Long.MIN_VALUE;
    }

    public static e2.u j(e2.u uVar, e2.u uVar2, boolean z10) {
        q0 q0Var;
        int i7;
        String str;
        String str2;
        i0 i0Var;
        int i10;
        int i11;
        String str3;
        int i12;
        g0 g0Var = i0.f13998b;
        t1 t1Var = t1.f14066e;
        int i13 = -1;
        if (uVar2 != null) {
            str2 = uVar2.f10753k;
            q0Var = uVar2.f10754l;
            i10 = uVar2.K;
            i7 = uVar2.f10748e;
            i11 = uVar2.f10749f;
            str = uVar2.d;
            str3 = uVar2.f10746b;
            i0Var = uVar2.f10747c;
        } else {
            String w10 = l0.w(1, uVar.f10753k);
            q0Var = uVar.f10754l;
            if (z10) {
                i10 = uVar.K;
                i7 = uVar.f10748e;
                i11 = uVar.f10749f;
                str = uVar.d;
                str3 = uVar.f10746b;
                str2 = w10;
                i0Var = uVar.f10747c;
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
        if (z10) {
            i12 = uVar.h;
        } else {
            i12 = -1;
        }
        if (z10) {
            i13 = uVar.f10751i;
        }
        t tVar = new t();
        tVar.f10694a = uVar.f10745a;
        tVar.f10695b = str3;
        tVar.f10696c = i0.q(i0Var);
        tVar.f10708q = s0.n(uVar.f10760r);
        tVar.f10709r = s0.n(d);
        tVar.f10701j = str2;
        tVar.f10702k = q0Var;
        tVar.h = i12;
        tVar.f10700i = i13;
        tVar.J = i10;
        tVar.f10697e = i7;
        tVar.f10698f = i11;
        tVar.d = str;
        return new e2.u(tVar);
    }

    @Override
    public final void a() {
        p[] pVarArr;
        i0 i0Var;
        long j3;
        for (p pVar : this.K) {
            b3.p pVar2 = pVar.f56442s;
            h hVar = pVar.d;
            ArrayList arrayList = pVar.E;
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
                        ma.p(z10);
                        s2.m b10 = hVar.f56367g.b(iVar.f56385y, false);
                        b10.getClass();
                        i0 i0Var2 = b10.f56849r;
                        int i10 = (int) (iVar.f60717s - b10.f56842k);
                        if (i10 < 0) {
                            j3 = 0;
                        } else {
                            if (i10 < i0Var2.size()) {
                                i0Var = ((s2.j) i0Var2.get(i10)).f56823y;
                            } else {
                                i0Var = b10.f56850s;
                            }
                            j3 = ((s2.h) i0Var.get(i7)).f56826c;
                        }
                        iVar.f56381b0 = j3;
                    }
                } else if (c10 == 0) {
                    pVar.I.post(new o0(6, pVar, iVar));
                } else if (c10 == 2 && !pVar.f56435k0 && pVar2.d()) {
                    pVar2.b();
                }
            }
        }
        this.H.c0(this);
    }

    @Override
    public final long b(a3.u[] r40, boolean[] r41, x2.d1[] r42, boolean[] r43, long r44) {
        throw new UnsupportedOperationException("Method not decompiled: r2.j.b(a3.u[], boolean[], x2.d1[], boolean[], long):long");
    }

    @Override
    public final boolean c(l2.s0 s0Var) {
        p[] pVarArr;
        if (this.J == null) {
            for (p pVar : this.K) {
                if (!pVar.U) {
                    r0 r0Var = new r0();
                    r0Var.f19533a = pVar.f56431g0;
                    pVar.c(new l2.s0(r0Var));
                }
            }
            return false;
        }
        return this.N.c(s0Var);
    }

    @Override
    public final boolean d(Uri uri, b3.j jVar, boolean z10) {
        int i7;
        boolean z11;
        w wVar;
        b3.i iVar;
        int u10;
        boolean z12;
        w wVar2;
        p[] pVarArr = this.K;
        int length = pVarArr.length;
        int i10 = 0;
        boolean z13 = false;
        while (i10 < length) {
            p pVar = pVarArr[i10];
            h hVar = pVar.d;
            w[] wVarArr = hVar.f56365e;
            s2.d dVar = hVar.f56367g;
            int length2 = wVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length2) {
                    break;
                }
                w wVar3 = wVarArr[i11];
                s2.c cVar = (s2.c) dVar.d.get(uri);
                if (cVar != null) {
                    wVar = cVar.f56764a;
                } else {
                    wVar = null;
                }
                if (wVar3.equals(wVar)) {
                    if (!z10) {
                        b3.h a10 = hVar.a(uri);
                        pVar.f56441r.getClass();
                        iVar = qb.a.Q4(a10, jVar);
                    } else {
                        iVar = null;
                    }
                    hVar.f56374o = uri;
                    if (iVar != null) {
                        int i12 = iVar.f2869a;
                        i7 = i10;
                        long j3 = iVar.f2870b;
                        if (i12 != 1) {
                            if (i12 == 2) {
                                int i13 = 0;
                                while (true) {
                                    if (i13 < wVarArr.length) {
                                        w wVar4 = wVarArr[i13];
                                        s2.c cVar2 = (s2.c) dVar.d.get(uri);
                                        if (cVar2 != null) {
                                            wVar2 = cVar2.f56764a;
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
                                if (i13 != -1 && (u10 = hVar.f56377r.u(i13)) != -1 && hVar.f56377r.p(u10, j3)) {
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
        this.H.c0(this);
        return z13;
    }

    @Override
    public final long e() {
        return this.N.e();
    }

    @Override
    public final long f(long j3, p1 p1Var) {
        s2.m mVar;
        long j10;
        p[] pVarArr = this.L;
        int length = pVarArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            p pVar = pVarArr[i7];
            if (pVar.R == 2) {
                h hVar = pVar.d;
                s2.d dVar = hVar.f56367g;
                int d = hVar.f56377r.d();
                w[] wVarArr = hVar.f56365e;
                if (d < wVarArr.length && d != -1) {
                    mVar = dVar.b(wVarArr[hVar.f56377r.m()].c(), true);
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    i0 i0Var = mVar.f56849r;
                    if (!i0Var.isEmpty()) {
                        long j11 = mVar.h - dVar.J;
                        long j12 = j3 - j11;
                        int d2 = l0.d(i0Var, Long.valueOf(j12), true);
                        long j13 = ((s2.j) i0Var.get(d2)).f56827e;
                        if (mVar.f56875c && d2 != i0Var.size() - 1) {
                            j10 = ((s2.j) i0Var.get(d2 + 1)).f56827e;
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
    public final boolean g() {
        return this.N.g();
    }

    public final p h(String str, int i7, w[] wVarArr, e2.u[] uVarArr, e2.u uVar, List list, Map map, long j3) {
        p pVar = new p(str, i7, this.G, new h(this.f56386a, this.f56387b, wVarArr, uVarArr, this.f56388c, this.d, this.f56394w, list, this.F), map, this.f56392r, j3, uVar, this.f56389e, this.f56390f, this.h, this.f56391n, this.E, null);
        long j10 = this.O;
        pVar.f56436l0 = j10;
        if (pVar.T) {
            for (o oVar : pVar.M) {
                oVar.K(j10);
            }
        }
        return pVar;
    }

    @Override
    public final void i() {
        p[] pVarArr;
        for (p pVar : this.K) {
            pVar.E();
            if (pVar.f56435k0 && !pVar.U) {
                throw t0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override
    public final long k(long j3) {
        p[] pVarArr = this.L;
        if (pVarArr.length > 0) {
            boolean H = pVarArr[0].H(j3, false);
            int i7 = 1;
            while (true) {
                p[] pVarArr2 = this.L;
                if (i7 >= pVarArr2.length) {
                    break;
                }
                pVarArr2[i7].H(j3, H);
                i7++;
            }
            if (H) {
                ((SparseArray) this.f56394w.f30474a).clear();
            }
        }
        return j3;
    }

    @Override
    public final void n(long j3) {
        p[] pVarArr;
        for (p pVar : this.L) {
            if (pVar.T && !pVar.C()) {
                int length = pVar.M.length;
                for (int i7 = 0; i7 < length; i7++) {
                    pVar.M[i7].k(j3, pVar.f56428e0[i7]);
                }
            }
        }
    }

    @Override
    public final long o() {
        return -9223372036854775807L;
    }

    @Override
    public final r1 q() {
        r1 r1Var = this.J;
        r1Var.getClass();
        return r1Var;
    }

    @Override
    public final long r() {
        return this.N.r();
    }

    @Override
    public final void t(d0 d0Var, long j3) {
        String str;
        c cVar;
        boolean z10;
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
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14;
        boolean z15;
        List list;
        this.H = d0Var;
        s2.d dVar = this.f56387b;
        dVar.getClass();
        dVar.f56770e.add(this);
        s2.p pVar = dVar.f56774s;
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
        c cVar2 = this.f56386a;
        boolean z16 = this.f56396y;
        if (isEmpty) {
            str = "ID3";
            cVar = cVar2;
            z10 = z16;
            map = map3;
            i0Var = c12;
        } else {
            e2.u uVar = pVar.f56869j;
            List list2 = pVar.f56870k;
            int size = c10.size();
            int[] iArr = new int[size];
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < c10.size(); i14++) {
                e2.u uVar2 = ((w) c10.get(i14)).f56915a.f56912a;
                int i15 = uVar2.A;
                String str2 = uVar2.f10753k;
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
                    uVarArr[i19] = wVar.f56915a.f56912a;
                    iArr2[i19] = i20;
                    i19++;
                }
                i20++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = uVarArr[0].f10753k;
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
            p h = h("main", i21, wVarArr, uVarArr, uVar, list3, map3, j3);
            arrayList3.add(h);
            arrayList4.add(iArr2);
            if (z10 && z14) {
                ArrayList arrayList5 = new ArrayList();
                if (v > 0) {
                    e2.u[] uVarArr2 = new e2.u[i11];
                    int i22 = 0;
                    while (i22 < i11) {
                        e2.u uVar3 = uVarArr[i22];
                        String w10 = l0.w(2, uVar3.f10753k);
                        String d = s0.d(w10);
                        e2.u[] uVarArr3 = uVarArr;
                        t tVar = new t();
                        tVar.f10694a = uVar3.f10745a;
                        tVar.f10695b = uVar3.f10746b;
                        tVar.f10696c = i0.q(uVar3.f10747c);
                        tVar.f10708q = s0.n(uVar3.f10760r);
                        tVar.f10709r = s0.n(d);
                        tVar.f10701j = w10;
                        tVar.f10702k = uVar3.f10754l;
                        tVar.h = uVar3.h;
                        tVar.f10700i = uVar3.f10751i;
                        tVar.f10715y = uVar3.f10767z;
                        tVar.f10716z = uVar3.A;
                        tVar.C = uVar3.D;
                        tVar.f10697e = uVar3.f10748e;
                        tVar.f10698f = uVar3.f10749f;
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
                        t a10 = j(uVarArr4[0], uVar, false).a();
                        a10.f10703l = "main";
                        arrayList5.add(new m1("main:audio", new e2.u(a10)));
                    }
                    if (list3 != null) {
                        for (int i23 = 0; i23 < list3.size(); i23++) {
                            String i24 = i5.c.i(i23, "main:cc:");
                            t a11 = cVar2.b((e2.u) list3.get(i23)).a();
                            a11.f10703l = "main";
                            arrayList5.add(new m1(i24, new e2.u(a11)));
                        }
                    }
                    cVar = cVar2;
                } else {
                    map = map3;
                    cVar = cVar2;
                    e2.u[] uVarArr5 = new e2.u[i11];
                    for (int i25 = 0; i25 < i11; i25++) {
                        uVarArr5[i25] = j(uVarArr[i25], uVar, true);
                    }
                    arrayList5.add(new m1("main", uVarArr5));
                }
                t tVar2 = new t();
                str = "ID3";
                tVar2.f10694a = str;
                tVar2.f10709r = s0.n("application/id3");
                tVar2.f10703l = "main";
                m1 m1Var = new m1("main:id3", new e2.u(tVar2));
                arrayList5.add(m1Var);
                h.F((m1[]) arrayList5.toArray(new m1[0]), arrayList5.indexOf(m1Var));
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
            String str4 = ((w) c11.get(i26)).f56915a.f56914c;
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
                    if (str4.equals(((w) c11.get(i27)).f56915a.f56914c)) {
                        w wVar2 = (w) c11.get(i27);
                        e2.u uVar4 = wVar2.f56915a.f56912a;
                        arrayList8.add(Integer.valueOf(i27));
                        arrayList6.add(wVar2);
                        arrayList7.add(uVar4);
                        if (l0.v(1, uVar4.f10753k) == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z18 &= z11;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = l0.f13778a;
                i10 = i26;
                hashSet2 = hashSet3;
                i0Var2 = c11;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
                p h7 = h(concat, 1, (w[]) arrayList6.toArray(new w[0]), (e2.u[]) arrayList7.toArray(new e2.u[0]), null, Collections.EMPTY_LIST, map2, j3);
                arrayList4.add(l1.f(arrayList2));
                arrayList3.add(h7);
                if (z10 && z18) {
                    String v11 = p5.c.v(concat, ":id3");
                    t tVar3 = new t();
                    tVar3.f10694a = str;
                    tVar3.f10709r = s0.n("application/id3");
                    tVar3.f10703l = concat;
                    h7.F(new m1[]{new m1(concat, (e2.u[]) arrayList.toArray(new e2.u[0])), new m1(v11, new e2.u(tVar3))}, 1);
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
            String str6 = ((w) i0Var3.get(i28)).f56915a.f56914c;
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
                    if (str6.equals(((w) i0Var3.get(i29)).f56915a.f56914c)) {
                        w wVar3 = (w) i0Var3.get(i29);
                        arrayList11.add(Integer.valueOf(i29));
                        arrayList9.add(wVar3);
                        arrayList10.add(wVar3.f56915a.f56912a);
                    }
                }
                String concat2 = "subtitle:".concat(str6);
                e2.u[] uVarArr6 = (e2.u[]) arrayList10.toArray(new e2.u[0]);
                String str7 = l0.f13778a;
                g0 g0Var = i0.f13998b;
                i0Var = i0Var3;
                i7 = i28;
                hashSet = hashSet4;
                p h10 = h(concat2, 3, (w[]) arrayList9.toArray(new w[0]), uVarArr6, null, t1.f14066e, map4, j3);
                arrayList4.add(l1.f(arrayList11));
                arrayList3.add(h10);
                int length = uVarArr6.length;
                e2.u[] uVarArr7 = new e2.u[length];
                for (int i30 = 0; i30 < length; i30++) {
                    uVarArr7[i30] = cVar.b(uVarArr6[i30]);
                }
                h10.F(new m1[]{new m1(concat2, uVarArr7)}, new int[0]);
            }
            i28 = i7 + 1;
            hashSet4 = hashSet;
        }
        this.K = (p[]) arrayList3.toArray(new p[0]);
        int[][] iArr3 = (int[][]) arrayList4.toArray(new int[0]);
        this.I = this.K.length;
        for (int i31 = 0; i31 < this.M; i31++) {
            this.K[i31].d.f56371l = true;
        }
        for (p pVar2 : this.K) {
            if (!pVar2.U) {
                r0 r0Var = new r0();
                r0Var.f19533a = pVar2.f56431g0;
                pVar2.c(new l2.s0(r0Var));
            }
        }
        this.L = this.K;
    }

    @Override
    public final void u(long j3) {
        this.N.u(j3);
    }
}
