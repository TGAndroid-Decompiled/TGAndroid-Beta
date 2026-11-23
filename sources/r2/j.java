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
import e2.u;
import h2.l0;
import h9.g0;
import h9.i0;
import h9.s1;
import j2.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import l2.q1;
import l2.t0;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.web.t1;
import s2.v;
import s2.x;
import x2.d0;
import x2.e0;
import x2.r1;
public final class j implements e0, v {
    public final int E;
    public final m2.i F;
    public final aa G = new aa(this, 16);
    public d0 H;
    public int I;
    public r1 J;
    public p[] K;
    public p[] L;
    public int M;
    public x2.n N;
    public final long O;
    public final c f56499a;
    public final s2.d f56500b;
    public final i5 f56501c;
    public final c0 d;
    public final q2.m f56502e;
    public final q2.j f56503f;
    public final qb.a h;
    public final xa f56504n;
    public final h6.m f56505r;
    public final IdentityHashMap f56506s;
    public final i5 f56507w;
    public final nb.a f56508x;
    public final boolean f56509y;

    public j(c cVar, s2.d dVar, i5 i5Var, c0 c0Var, q2.m mVar, q2.j jVar, qb.a aVar, xa xaVar, h6.m mVar2, nb.a aVar2, boolean z10, int i7, m2.i iVar) {
        this.f56499a = cVar;
        this.f56500b = dVar;
        this.f56501c = i5Var;
        this.d = c0Var;
        this.f56502e = mVar;
        this.f56503f = jVar;
        this.h = aVar;
        this.f56504n = xaVar;
        this.f56505r = mVar2;
        this.f56508x = aVar2;
        this.f56509y = z10;
        this.E = i7;
        this.F = iVar;
        aVar2.getClass();
        g0 g0Var = i0.f13995b;
        s1 s1Var = s1.f14058e;
        this.N = new x2.n(s1Var, s1Var);
        this.f56506s = new IdentityHashMap();
        this.f56507w = new i5(19);
        this.K = new p[0];
        this.L = new p[0];
        this.O = Long.MIN_VALUE;
    }

    public static u h(u uVar, u uVar2, boolean z10) {
        q0 q0Var;
        int i7;
        String str;
        String str2;
        i0 i0Var;
        int i10;
        int i11;
        String str3;
        int i12;
        g0 g0Var = i0.f13995b;
        s1 s1Var = s1.f14058e;
        int i13 = -1;
        if (uVar2 != null) {
            str2 = uVar2.f10751k;
            q0Var = uVar2.f10752l;
            i10 = uVar2.K;
            i7 = uVar2.f10746e;
            i11 = uVar2.f10747f;
            str = uVar2.d;
            str3 = uVar2.f10744b;
            i0Var = uVar2.f10745c;
        } else {
            String w10 = l0.w(1, uVar.f10751k);
            q0Var = uVar.f10752l;
            if (z10) {
                i10 = uVar.K;
                i7 = uVar.f10746e;
                i11 = uVar.f10747f;
                str = uVar.d;
                str3 = uVar.f10744b;
                str2 = w10;
                i0Var = uVar.f10745c;
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
            i13 = uVar.f10749i;
        }
        t tVar = new t();
        tVar.f10692a = uVar.f10743a;
        tVar.f10693b = str3;
        tVar.f10694c = i0.q(i0Var);
        tVar.f10706q = s0.n(uVar.f10758r);
        tVar.f10707r = s0.n(d);
        tVar.f10699j = str2;
        tVar.f10700k = q0Var;
        tVar.h = i12;
        tVar.f10698i = i13;
        tVar.J = i10;
        tVar.f10695e = i7;
        tVar.f10696f = i11;
        tVar.d = str;
        return new u(tVar);
    }

    @Override
    public final void a() {
        p[] pVarArr;
        i0 i0Var;
        long j3;
        for (p pVar : this.K) {
            b3.p pVar2 = pVar.f56555s;
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
                        s2.n b10 = hVar.f56480g.b(iVar.f56498y, false);
                        b10.getClass();
                        i0 i0Var2 = b10.f56965r;
                        int i10 = (int) (iVar.f60835s - b10.f56958k);
                        if (i10 < 0) {
                            j3 = 0;
                        } else {
                            if (i10 < i0Var2.size()) {
                                i0Var = ((s2.k) i0Var2.get(i10)).f56939y;
                            } else {
                                i0Var = b10.f56966s;
                            }
                            j3 = ((s2.i) i0Var.get(i7)).f56942c;
                        }
                        iVar.f56494b0 = j3;
                    }
                } else if (c10 == 0) {
                    pVar.I.post(new t1(12, pVar, iVar));
                } else if (c10 == 2 && !pVar.f56548k0 && pVar2.d()) {
                    pVar2.b();
                }
            }
        }
        this.H.i2(this);
    }

    @Override
    public final boolean b(Uri uri, b3.j jVar, boolean z10) {
        int i7;
        boolean z11;
        x xVar;
        b3.i iVar;
        int u10;
        boolean z12;
        x xVar2;
        p[] pVarArr = this.K;
        int length = pVarArr.length;
        int i10 = 0;
        boolean z13 = false;
        while (i10 < length) {
            p pVar = pVarArr[i10];
            h hVar = pVar.d;
            x[] xVarArr = hVar.f56478e;
            s2.d dVar = hVar.f56480g;
            int length2 = xVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length2) {
                    break;
                }
                x xVar3 = xVarArr[i11];
                s2.c cVar = (s2.c) dVar.d.get(uri);
                if (cVar != null) {
                    xVar = cVar.f56877a;
                } else {
                    xVar = null;
                }
                if (xVar3.equals(xVar)) {
                    if (!z10) {
                        b3.h a10 = hVar.a(uri);
                        pVar.f56554r.getClass();
                        iVar = qb.a.Q4(a10, jVar);
                    } else {
                        iVar = null;
                    }
                    hVar.f56487o = uri;
                    if (iVar != null) {
                        int i12 = iVar.f2870a;
                        i7 = i10;
                        long j3 = iVar.f2871b;
                        if (i12 != 1) {
                            if (i12 == 2) {
                                int i13 = 0;
                                while (true) {
                                    if (i13 < xVarArr.length) {
                                        x xVar4 = xVarArr[i13];
                                        s2.c cVar2 = (s2.c) dVar.d.get(uri);
                                        if (cVar2 != null) {
                                            xVar2 = cVar2.f56877a;
                                        } else {
                                            xVar2 = null;
                                        }
                                        if (xVar4.equals(xVar2)) {
                                            break;
                                        }
                                        i13++;
                                    } else {
                                        i13 = -1;
                                        break;
                                    }
                                }
                                if (i13 != -1 && (u10 = hVar.f56490r.u(i13)) != -1 && hVar.f56490r.p(u10, j3)) {
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
        this.H.i2(this);
        return z13;
    }

    @Override
    public final long c(a3.u[] r40, boolean[] r41, x2.d1[] r42, boolean[] r43, long r44) {
        throw new UnsupportedOperationException("Method not decompiled: r2.j.c(a3.u[], boolean[], x2.d1[], boolean[], long):long");
    }

    @Override
    public final boolean d(t0 t0Var) {
        p[] pVarArr;
        if (this.J == null) {
            for (p pVar : this.K) {
                if (!pVar.U) {
                    l2.s0 s0Var = new l2.s0();
                    s0Var.f19637a = pVar.f56544g0;
                    pVar.d(new t0(s0Var));
                }
            }
            return false;
        }
        return this.N.d(t0Var);
    }

    public final p e(String str, int i7, x[] xVarArr, u[] uVarArr, u uVar, List list, Map map, long j3) {
        p pVar = new p(str, i7, this.G, new h(this.f56499a, this.f56500b, xVarArr, uVarArr, this.f56501c, this.d, this.f56507w, list, this.F), map, this.f56505r, j3, uVar, this.f56502e, this.f56503f, this.h, this.f56504n, this.E, null);
        long j10 = this.O;
        pVar.f56549l0 = j10;
        if (pVar.T) {
            for (o oVar : pVar.M) {
                oVar.K(j10);
            }
        }
        return pVar;
    }

    @Override
    public final long f() {
        return this.N.f();
    }

    @Override
    public final boolean g() {
        return this.N.g();
    }

    @Override
    public final long i(long j3, q1 q1Var) {
        s2.n nVar;
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
                s2.d dVar = hVar.f56480g;
                int d = hVar.f56490r.d();
                x[] xVarArr = hVar.f56478e;
                if (d < xVarArr.length && d != -1) {
                    nVar = dVar.b(xVarArr[hVar.f56490r.m()].c(), true);
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    i0 i0Var = nVar.f56965r;
                    if (!i0Var.isEmpty()) {
                        long j11 = nVar.h - dVar.J;
                        long j12 = j3 - j11;
                        int d2 = l0.d(i0Var, Long.valueOf(j12), true);
                        long j13 = ((s2.k) i0Var.get(d2)).f56943e;
                        if (nVar.f56991c && d2 != i0Var.size() - 1) {
                            j10 = ((s2.k) i0Var.get(d2 + 1)).f56943e;
                        } else {
                            j10 = j13;
                        }
                        return q1Var.a(j12, j13, j10) + j11;
                    }
                }
            } else {
                i7++;
            }
        }
        return j3;
    }

    @Override
    public final void j() {
        p[] pVarArr;
        for (p pVar : this.K) {
            pVar.E();
            if (pVar.f56548k0 && !pVar.U) {
                throw e2.t0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override
    public final long l(long j3) {
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
                ((SparseArray) this.f56507w.f29095a).clear();
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
                    pVar.M[i7].k(j3, pVar.f56541e0[i7]);
                }
            }
        }
    }

    @Override
    public final long p() {
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
    public final void s(d0 d0Var, long j3) {
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
        s2.d dVar = this.f56500b;
        dVar.getClass();
        dVar.f56883e.add(this);
        s2.q qVar = dVar.f56887s;
        qVar.getClass();
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
        c cVar2 = this.f56499a;
        boolean z16 = this.f56509y;
        if (isEmpty) {
            str = "ID3";
            cVar = cVar2;
            z10 = z16;
            map = map3;
            i0Var = c12;
        } else {
            u uVar = qVar.f56985j;
            List list2 = qVar.f56986k;
            int size = c10.size();
            int[] iArr = new int[size];
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < c10.size(); i14++) {
                u uVar2 = ((x) c10.get(i14)).f57031a.f57028a;
                int i15 = uVar2.A;
                String str2 = uVar2.f10751k;
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
            x[] xVarArr = new x[i11];
            u[] uVarArr = new u[i11];
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
                    x xVar = (x) c10.get(i20);
                    xVarArr[i19] = xVar;
                    uVarArr[i19] = xVar.f57031a.f57028a;
                    iArr2[i19] = i20;
                    i19++;
                }
                i20++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = uVarArr[0].f10751k;
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
            p e10 = e("main", i21, xVarArr, uVarArr, uVar, list3, map3, j3);
            arrayList3.add(e10);
            arrayList4.add(iArr2);
            if (z10 && z14) {
                ArrayList arrayList5 = new ArrayList();
                if (v > 0) {
                    u[] uVarArr2 = new u[i11];
                    int i22 = 0;
                    while (i22 < i11) {
                        u uVar3 = uVarArr[i22];
                        String w10 = l0.w(2, uVar3.f10751k);
                        String d = s0.d(w10);
                        u[] uVarArr3 = uVarArr;
                        t tVar = new t();
                        tVar.f10692a = uVar3.f10743a;
                        tVar.f10693b = uVar3.f10744b;
                        tVar.f10694c = i0.q(uVar3.f10745c);
                        tVar.f10706q = s0.n(uVar3.f10758r);
                        tVar.f10707r = s0.n(d);
                        tVar.f10699j = w10;
                        tVar.f10700k = uVar3.f10752l;
                        tVar.h = uVar3.h;
                        tVar.f10698i = uVar3.f10749i;
                        tVar.f10713y = uVar3.f10765z;
                        tVar.f10714z = uVar3.A;
                        tVar.C = uVar3.D;
                        tVar.f10695e = uVar3.f10746e;
                        tVar.f10696f = uVar3.f10747f;
                        tVar.H = uVar3.I;
                        uVarArr2[i22] = new u(tVar);
                        i22++;
                        uVarArr = uVarArr3;
                        map3 = map3;
                    }
                    u[] uVarArr4 = uVarArr;
                    map = map3;
                    arrayList5.add(new m1("main", uVarArr2));
                    if (v10 > 0 && (uVar != null || c11.isEmpty())) {
                        t a10 = h(uVarArr4[0], uVar, false).a();
                        a10.f10701l = "main";
                        arrayList5.add(new m1("main:audio", new u(a10)));
                    }
                    if (list3 != null) {
                        for (int i23 = 0; i23 < list3.size(); i23++) {
                            String i24 = i5.c.i(i23, "main:cc:");
                            t a11 = cVar2.b((u) list3.get(i23)).a();
                            a11.f10701l = "main";
                            arrayList5.add(new m1(i24, new u(a11)));
                        }
                    }
                    cVar = cVar2;
                } else {
                    map = map3;
                    cVar = cVar2;
                    u[] uVarArr5 = new u[i11];
                    for (int i25 = 0; i25 < i11; i25++) {
                        uVarArr5[i25] = h(uVarArr[i25], uVar, true);
                    }
                    arrayList5.add(new m1("main", uVarArr5));
                }
                t tVar2 = new t();
                str = "ID3";
                tVar2.f10692a = str;
                tVar2.f10707r = s0.n("application/id3");
                tVar2.f10701l = "main";
                m1 m1Var = new m1("main:id3", new u(tVar2));
                arrayList5.add(m1Var);
                e10.F((m1[]) arrayList5.toArray(new m1[0]), arrayList5.indexOf(m1Var));
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
            String str4 = ((x) c11.get(i26)).f57031a.f57030c;
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
                    if (str4.equals(((x) c11.get(i27)).f57031a.f57030c)) {
                        x xVar2 = (x) c11.get(i27);
                        u uVar4 = xVar2.f57031a.f57028a;
                        arrayList8.add(Integer.valueOf(i27));
                        arrayList6.add(xVar2);
                        arrayList7.add(uVar4);
                        if (l0.v(1, uVar4.f10751k) == 1) {
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
                p e11 = e(concat, 1, (x[]) arrayList6.toArray(new x[0]), (u[]) arrayList7.toArray(new u[0]), null, Collections.EMPTY_LIST, map2, j3);
                arrayList4.add(l1.f(arrayList2));
                arrayList3.add(e11);
                if (z10 && z18) {
                    String v11 = p5.c.v(concat, ":id3");
                    t tVar3 = new t();
                    tVar3.f10692a = str;
                    tVar3.f10707r = s0.n("application/id3");
                    tVar3.f10701l = concat;
                    e11.F(new m1[]{new m1(concat, (u[]) arrayList.toArray(new u[0])), new m1(v11, new u(tVar3))}, 1);
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
            String str6 = ((x) i0Var3.get(i28)).f57031a.f57030c;
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
                    if (str6.equals(((x) i0Var3.get(i29)).f57031a.f57030c)) {
                        x xVar3 = (x) i0Var3.get(i29);
                        arrayList11.add(Integer.valueOf(i29));
                        arrayList9.add(xVar3);
                        arrayList10.add(xVar3.f57031a.f57028a);
                    }
                }
                String concat2 = "subtitle:".concat(str6);
                u[] uVarArr6 = (u[]) arrayList10.toArray(new u[0]);
                String str7 = l0.f13778a;
                g0 g0Var = i0.f13995b;
                i0Var = i0Var3;
                i7 = i28;
                hashSet = hashSet4;
                p e12 = e(concat2, 3, (x[]) arrayList9.toArray(new x[0]), uVarArr6, null, s1.f14058e, map4, j3);
                arrayList4.add(l1.f(arrayList11));
                arrayList3.add(e12);
                int length = uVarArr6.length;
                u[] uVarArr7 = new u[length];
                for (int i30 = 0; i30 < length; i30++) {
                    uVarArr7[i30] = cVar.b(uVarArr6[i30]);
                }
                e12.F(new m1[]{new m1(concat2, uVarArr7)}, new int[0]);
            }
            i28 = i7 + 1;
            hashSet4 = hashSet;
        }
        this.K = (p[]) arrayList3.toArray(new p[0]);
        int[][] iArr3 = (int[][]) arrayList4.toArray(new int[0]);
        this.I = this.K.length;
        for (int i31 = 0; i31 < this.M; i31++) {
            this.K[i31].d.f56484l = true;
        }
        for (p pVar : this.K) {
            if (!pVar.U) {
                l2.s0 s0Var = new l2.s0();
                s0Var.f19637a = pVar.f56544g0;
                pVar.d(new t0(s0Var));
            }
        }
        this.L = this.K;
    }

    @Override
    public final void u(long j3) {
        this.N.u(j3);
    }
}
