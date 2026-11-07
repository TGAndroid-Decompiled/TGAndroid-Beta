package r2;

import a8.ia;
import a8.wa;
import android.net.Uri;
import android.util.SparseArray;
import c8.e1;
import e2.m1;
import e2.q0;
import e2.s0;
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
import org.telegram.ui.web.w;
import s2.u;
import x2.d0;
import x2.e0;
import x2.q1;
public final class k implements e0, u {
    public final int D;
    public final m2.j E;
    public final qt F = new qt(this, 12);
    public d0 G;
    public int H;
    public q1 I;
    public q[] J;
    public q[] K;
    public int L;
    public x2.n M;
    public final long N;
    public final c f54227a;
    public final s2.d f54228b;
    public final org.telegram.ui.Components.n f54229c;
    public final j2.d0 d;
    public final q2.m f54230e;
    public final q2.j f54231f;
    public final pb.b h;
    public final wa f54232n;
    public final h6.m f54233r;
    public final IdentityHashMap f54234s;
    public final org.telegram.ui.Components.n f54235w;
    public final sa.d f54236x;
    public final boolean f54237y;

    public k(c cVar, s2.d dVar, org.telegram.ui.Components.n nVar, j2.d0 d0Var, q2.m mVar, q2.j jVar, pb.b bVar, wa waVar, h6.m mVar2, sa.d dVar2, boolean z9, int i7, m2.j jVar2) {
        this.f54227a = cVar;
        this.f54228b = dVar;
        this.f54229c = nVar;
        this.d = d0Var;
        this.f54230e = mVar;
        this.f54231f = jVar;
        this.h = bVar;
        this.f54232n = waVar;
        this.f54233r = mVar2;
        this.f54236x = dVar2;
        this.f54237y = z9;
        this.D = i7;
        this.E = jVar2;
        dVar2.getClass();
        g0 g0Var = i0.f14329b;
        t1 t1Var = t1.f14397e;
        this.M = new x2.n(t1Var, t1Var);
        this.f54234s = new IdentityHashMap();
        this.f54235w = new org.telegram.ui.Components.n(15);
        this.J = new q[0];
        this.K = new q[0];
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
        g0 g0Var = i0.f14329b;
        t1 t1Var = t1.f14397e;
        int i13 = -1;
        if (uVar2 != null) {
            str2 = uVar2.f10607k;
            q0Var = uVar2.f10608l;
            i10 = uVar2.K;
            i7 = uVar2.f10602e;
            i11 = uVar2.f10603f;
            str = uVar2.d;
            str3 = uVar2.f10600b;
            i0Var = uVar2.f10601c;
        } else {
            String w10 = m0.w(1, uVar.f10607k);
            q0Var = uVar.f10608l;
            if (z9) {
                i10 = uVar.K;
                i7 = uVar.f10602e;
                i11 = uVar.f10603f;
                str = uVar.d;
                str3 = uVar.f10600b;
                str2 = w10;
                i0Var = uVar.f10601c;
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
            i13 = uVar.f10605i;
        }
        e2.t tVar = new e2.t();
        tVar.f10548a = uVar.f10599a;
        tVar.f10549b = str3;
        tVar.f10550c = i0.q(i0Var);
        tVar.f10562q = s0.n(uVar.f10614r);
        tVar.f10563r = s0.n(d);
        tVar.f10555j = str2;
        tVar.f10556k = q0Var;
        tVar.h = i12;
        tVar.f10554i = i13;
        tVar.J = i10;
        tVar.f10551e = i7;
        tVar.f10552f = i11;
        tVar.d = str;
        return new e2.u(tVar);
    }

    @Override
    public final void a() {
        q[] qVarArr;
        i0 i0Var;
        long j3;
        for (q qVar : this.J) {
            b3.o oVar = qVar.f54282s;
            i iVar = qVar.d;
            ArrayList arrayList = qVar.D;
            if (!arrayList.isEmpty()) {
                j jVar = (j) h9.o.n(arrayList);
                int c10 = iVar.c(jVar);
                int i7 = jVar.E;
                boolean z9 = true;
                if (c10 == 1) {
                    if (!jVar.g()) {
                        if (i7 == -1) {
                            z9 = false;
                        }
                        ia.p(z9);
                        s2.m b10 = iVar.f54209g.b(jVar.f54226y, false);
                        b10.getClass();
                        i0 i0Var2 = b10.f54607r;
                        int i10 = (int) (jVar.f58831s - b10.f54600k);
                        if (i10 < 0) {
                            j3 = 0;
                        } else {
                            if (i10 < i0Var2.size()) {
                                i0Var = ((s2.j) i0Var2.get(i10)).f54581y;
                            } else {
                                i0Var = b10.f54608s;
                            }
                            j3 = ((s2.h) i0Var.get(i7)).f54584c;
                        }
                        jVar.f54222a0 = j3;
                    }
                } else if (c10 == 0) {
                    qVar.H.post(new w(21, qVar, jVar));
                } else if (c10 == 2 && !qVar.f54275j0 && oVar.d()) {
                    oVar.b();
                }
            }
        }
        this.G.d(this);
    }

    @Override
    public final long b(a3.u[] r40, boolean[] r41, x2.c1[] r42, boolean[] r43, long r44) {
        throw new UnsupportedOperationException("Method not decompiled: r2.k.b(a3.u[], boolean[], x2.c1[], boolean[], long):long");
    }

    @Override
    public final boolean c(v0 v0Var) {
        q[] qVarArr;
        if (this.I == null) {
            for (q qVar : this.J) {
                if (!qVar.T) {
                    u0 u0Var = new u0();
                    u0Var.f18055a = qVar.f54271f0;
                    qVar.c(new v0(u0Var));
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
        s2.w wVar;
        b3.i iVar;
        int u10;
        boolean z11;
        s2.w wVar2;
        q[] qVarArr = this.J;
        int length = qVarArr.length;
        int i10 = 0;
        boolean z12 = false;
        while (i10 < length) {
            q qVar = qVarArr[i10];
            i iVar2 = qVar.d;
            s2.w[] wVarArr = iVar2.f54207e;
            s2.d dVar = iVar2.f54209g;
            int length2 = wVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length2) {
                    break;
                }
                s2.w wVar3 = wVarArr[i11];
                s2.c cVar = (s2.c) dVar.d.get(uri);
                if (cVar != null) {
                    wVar = cVar.f54522a;
                } else {
                    wVar = null;
                }
                if (wVar3.equals(wVar)) {
                    if (!z9) {
                        b3.h a10 = iVar2.a(uri);
                        qVar.f54281r.getClass();
                        iVar = pb.b.V0(a10, uVar);
                    } else {
                        iVar = null;
                    }
                    iVar2.f54216o = uri;
                    if (iVar != null) {
                        int i12 = iVar.f2950a;
                        i7 = i10;
                        long j3 = iVar.f2951b;
                        if (i12 != 1) {
                            if (i12 == 2) {
                                int i13 = 0;
                                while (true) {
                                    if (i13 < wVarArr.length) {
                                        s2.w wVar4 = wVarArr[i13];
                                        s2.c cVar2 = (s2.c) dVar.d.get(uri);
                                        if (cVar2 != null) {
                                            wVar2 = cVar2.f54522a;
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
                                if (i13 != -1 && (u10 = iVar2.f54219r.u(i13)) != -1 && iVar2.f54219r.p(u10, j3)) {
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

    public final q f(String str, int i7, s2.w[] wVarArr, e2.u[] uVarArr, e2.u uVar, List list, Map map, long j3) {
        q qVar = new q(str, i7, this.F, new i(this.f54227a, this.f54228b, wVarArr, uVarArr, this.f54229c, this.d, this.f54235w, list, this.E), map, this.f54233r, j3, uVar, this.f54230e, this.f54231f, this.h, this.f54232n, this.D, null);
        long j10 = this.N;
        qVar.f54276k0 = j10;
        if (qVar.S) {
            for (p pVar : qVar.L) {
                pVar.K(j10);
            }
        }
        return qVar;
    }

    @Override
    public final boolean g() {
        return this.M.g();
    }

    @Override
    public final long h(long j3, l2.t1 t1Var) {
        s2.m mVar;
        long j10;
        q[] qVarArr = this.K;
        int length = qVarArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            q qVar = qVarArr[i7];
            if (qVar.Q == 2) {
                i iVar = qVar.d;
                s2.d dVar = iVar.f54209g;
                int d = iVar.f54219r.d();
                s2.w[] wVarArr = iVar.f54207e;
                if (d < wVarArr.length && d != -1) {
                    mVar = dVar.b(wVarArr[iVar.f54219r.m()].c(), true);
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    i0 i0Var = mVar.f54607r;
                    if (!i0Var.isEmpty()) {
                        long j11 = mVar.h - dVar.I;
                        long j12 = j3 - j11;
                        int d2 = m0.d(i0Var, Long.valueOf(j12), true);
                        long j13 = ((s2.j) i0Var.get(d2)).f54585e;
                        if (mVar.f54633c && d2 != i0Var.size() - 1) {
                            j10 = ((s2.j) i0Var.get(d2 + 1)).f54585e;
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
        q[] qVarArr;
        for (q qVar : this.J) {
            qVar.A();
            if (qVar.f54275j0 && !qVar.T) {
                throw t0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override
    public final long j(long j3) {
        q[] qVarArr = this.K;
        if (qVarArr.length > 0) {
            boolean D = qVarArr[0].D(j3, false);
            int i7 = 1;
            while (true) {
                q[] qVarArr2 = this.K;
                if (i7 >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i7].D(j3, D);
                i7++;
            }
            if (D) {
                ((SparseArray) this.f54235w.f36142a).clear();
            }
        }
        return j3;
    }

    @Override
    public final void k(long j3) {
        q[] qVarArr;
        for (q qVar : this.K) {
            if (qVar.S && !qVar.y()) {
                int length = qVar.L.length;
                for (int i7 = 0; i7 < length; i7++) {
                    qVar.L[i7].k(j3, qVar.f54267d0[i7]);
                }
            }
        }
    }

    @Override
    public final long n() {
        return -9223372036854775807L;
    }

    @Override
    public final q1 o() {
        q1 q1Var = this.I;
        q1Var.getClass();
        return q1Var;
    }

    @Override
    public final long p() {
        return this.M.p();
    }

    @Override
    public final void q(d0 d0Var, long j3) {
        String str;
        c cVar;
        boolean z9;
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
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        boolean z14;
        List list;
        this.G = d0Var;
        s2.d dVar = this.f54228b;
        dVar.getClass();
        dVar.f54528e.add(this);
        s2.p pVar = dVar.f54532s;
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
        c cVar2 = this.f54227a;
        boolean z15 = this.f54237y;
        if (isEmpty) {
            str = "ID3";
            cVar = cVar2;
            z9 = z15;
            map = map3;
            i0Var = c12;
        } else {
            e2.u uVar = pVar.f54627j;
            List list2 = pVar.f54628k;
            int size = c10.size();
            int[] iArr = new int[size];
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < c10.size(); i14++) {
                e2.u uVar2 = ((s2.w) c10.get(i14)).f54673a.f54670a;
                int i15 = uVar2.A;
                String str2 = uVar2.f10607k;
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
            s2.w[] wVarArr = new s2.w[i11];
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
                    s2.w wVar = (s2.w) c10.get(i20);
                    wVarArr[i19] = wVar;
                    uVarArr[i19] = wVar.f54673a.f54670a;
                    iArr2[i19] = i20;
                    i19++;
                }
                i20++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = uVarArr[0].f10607k;
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
            q f10 = f("main", i21, wVarArr, uVarArr, uVar, list3, map3, j3);
            arrayList3.add(f10);
            arrayList4.add(iArr2);
            if (z9 && z13) {
                ArrayList arrayList5 = new ArrayList();
                if (v > 0) {
                    e2.u[] uVarArr2 = new e2.u[i11];
                    int i22 = 0;
                    while (i22 < i11) {
                        e2.u uVar3 = uVarArr[i22];
                        String w10 = m0.w(2, uVar3.f10607k);
                        String d = s0.d(w10);
                        e2.u[] uVarArr3 = uVarArr;
                        e2.t tVar = new e2.t();
                        tVar.f10548a = uVar3.f10599a;
                        tVar.f10549b = uVar3.f10600b;
                        tVar.f10550c = i0.q(uVar3.f10601c);
                        tVar.f10562q = s0.n(uVar3.f10614r);
                        tVar.f10563r = s0.n(d);
                        tVar.f10555j = w10;
                        tVar.f10556k = uVar3.f10608l;
                        tVar.h = uVar3.h;
                        tVar.f10554i = uVar3.f10605i;
                        tVar.f10569y = uVar3.f10621z;
                        tVar.f10570z = uVar3.A;
                        tVar.C = uVar3.D;
                        tVar.f10551e = uVar3.f10602e;
                        tVar.f10552f = uVar3.f10603f;
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
                        e2.t a10 = l(uVarArr4[0], uVar, false).a();
                        a10.f10557l = "main";
                        arrayList5.add(new m1("main:audio", new e2.u(a10)));
                    }
                    if (list3 != null) {
                        for (int i23 = 0; i23 < list3.size(); i23++) {
                            String j10 = jg.g.j(i23, "main:cc:");
                            e2.t a11 = cVar2.b((e2.u) list3.get(i23)).a();
                            a11.f10557l = "main";
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
                e2.t tVar2 = new e2.t();
                str = "ID3";
                tVar2.f10548a = str;
                tVar2.f10563r = s0.n("application/id3");
                tVar2.f10557l = "main";
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
            String str4 = ((s2.w) c11.get(i25)).f54673a.f54672c;
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
                    if (str4.equals(((s2.w) c11.get(i26)).f54673a.f54672c)) {
                        s2.w wVar2 = (s2.w) c11.get(i26);
                        e2.u uVar4 = wVar2.f54673a.f54670a;
                        arrayList8.add(Integer.valueOf(i26));
                        arrayList6.add(wVar2);
                        arrayList7.add(uVar4);
                        if (m0.v(1, uVar4.f10607k) == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z17 &= z10;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = m0.f14112a;
                i10 = i25;
                hashSet2 = hashSet3;
                i0Var2 = c11;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
                q f11 = f(concat, 1, (s2.w[]) arrayList6.toArray(new s2.w[0]), (e2.u[]) arrayList7.toArray(new e2.u[0]), null, Collections.EMPTY_LIST, map2, j3);
                arrayList4.add(e1.f(arrayList2));
                arrayList3.add(f11);
                if (z9 && z17) {
                    String q10 = rf.b.q(concat, ":id3");
                    e2.t tVar3 = new e2.t();
                    tVar3.f10548a = str;
                    tVar3.f10563r = s0.n("application/id3");
                    tVar3.f10557l = concat;
                    f11.B(new m1[]{new m1(concat, (e2.u[]) arrayList.toArray(new e2.u[0])), new m1(q10, new e2.u(tVar3))}, 1);
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
            String str6 = ((s2.w) i0Var3.get(i27)).f54673a.f54672c;
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
                    if (str6.equals(((s2.w) i0Var3.get(i28)).f54673a.f54672c)) {
                        s2.w wVar3 = (s2.w) i0Var3.get(i28);
                        arrayList11.add(Integer.valueOf(i28));
                        arrayList9.add(wVar3);
                        arrayList10.add(wVar3.f54673a.f54670a);
                    }
                }
                String concat2 = "subtitle:".concat(str6);
                e2.u[] uVarArr6 = (e2.u[]) arrayList10.toArray(new e2.u[0]);
                String str7 = m0.f14112a;
                g0 g0Var = i0.f14329b;
                i0Var = i0Var3;
                i7 = i27;
                hashSet = hashSet4;
                q f12 = f(concat2, 3, (s2.w[]) arrayList9.toArray(new s2.w[0]), uVarArr6, null, t1.f14397e, map4, j3);
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
        this.J = (q[]) arrayList3.toArray(new q[0]);
        int[][] iArr3 = (int[][]) arrayList4.toArray(new int[0]);
        this.H = this.J.length;
        for (int i30 = 0; i30 < this.L; i30++) {
            this.J[i30].d.f54213l = true;
        }
        for (q qVar : this.J) {
            if (!qVar.T) {
                u0 u0Var = new u0();
                u0Var.f18055a = qVar.f54271f0;
                qVar.c(new v0(u0Var));
            }
        }
        this.K = this.J;
    }

    @Override
    public final void r(long j3) {
        this.M.r(j3);
    }
}
