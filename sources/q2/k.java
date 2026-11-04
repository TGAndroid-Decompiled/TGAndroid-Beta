package q2;

import android.net.Uri;
import android.support.v4.media.session.a0;
import android.util.SparseArray;
import b8.kg;
import b8.od;
import b8.zb;
import d2.o1;
import d2.s0;
import d2.u0;
import d2.v;
import g2.n0;
import g9.g0;
import g9.i0;
import g9.s1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import k2.p1;
import k2.t1;
import k2.v0;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.nh;
import org.telegram.ui.hc1;
import r2.u;
import r2.w;
import w2.d0;
import w2.e0;
import w2.r1;
public final class k implements e0, u {
    public final int E;
    public final l2.k F;
    public final nh G = new nh(this, 12);
    public d0 H;
    public int I;
    public r1 J;
    public q[] K;
    public q[] L;
    public int M;
    public w2.n N;
    public final long O;
    public final c f53707a;
    public final r2.d f53708b;
    public final i9 f53709c;
    public final i2.d0 d;
    public final p2.m f53710e;
    public final p2.j f53711f;
    public final kb.a h;
    public final kg f53712n;
    public final a0 f53713r;
    public final IdentityHashMap f53714s;
    public final i9 f53715w;
    public final ra.e f53716x;
    public final boolean f53717y;

    public k(c cVar, r2.d dVar, i9 i9Var, i2.d0 d0Var, p2.m mVar, p2.j jVar, kb.a aVar, kg kgVar, a0 a0Var, ra.e eVar, boolean z10, int i3, l2.k kVar) {
        this.f53707a = cVar;
        this.f53708b = dVar;
        this.f53709c = i9Var;
        this.d = d0Var;
        this.f53710e = mVar;
        this.f53711f = jVar;
        this.h = aVar;
        this.f53712n = kgVar;
        this.f53713r = a0Var;
        this.f53716x = eVar;
        this.f53717y = z10;
        this.E = i3;
        this.F = kVar;
        eVar.getClass();
        g0 g0Var = i0.f12083b;
        s1 s1Var = s1.f12146e;
        this.N = new w2.n(s1Var, s1Var);
        this.f53714s = new IdentityHashMap();
        this.f53715w = new i9(13);
        this.K = new q[0];
        this.L = new q[0];
        this.O = Long.MIN_VALUE;
    }

    public static v h(v vVar, v vVar2, boolean z10) {
        s0 s0Var;
        int i3;
        String str;
        String str2;
        i0 i0Var;
        int i10;
        int i11;
        String str3;
        int i12;
        g0 g0Var = i0.f12083b;
        s1 s1Var = s1.f12146e;
        int i13 = -1;
        if (vVar2 != null) {
            str2 = vVar2.f8481k;
            s0Var = vVar2.f8482l;
            i10 = vVar2.K;
            i3 = vVar2.f8476e;
            i11 = vVar2.f8477f;
            str = vVar2.d;
            str3 = vVar2.f8474b;
            i0Var = vVar2.f8475c;
        } else {
            String w10 = n0.w(1, vVar.f8481k);
            s0Var = vVar.f8482l;
            if (z10) {
                i10 = vVar.K;
                i3 = vVar.f8476e;
                i11 = vVar.f8477f;
                str = vVar.d;
                str3 = vVar.f8474b;
                str2 = w10;
                i0Var = vVar.f8475c;
            } else {
                i3 = 0;
                str = null;
                str2 = w10;
                i0Var = s1Var;
                i10 = -1;
                i11 = 0;
                str3 = null;
            }
        }
        String d = u0.d(str2);
        if (z10) {
            i12 = vVar.h;
        } else {
            i12 = -1;
        }
        if (z10) {
            i13 = vVar.f8479i;
        }
        d2.u uVar = new d2.u();
        uVar.f8416a = vVar.f8473a;
        uVar.f8417b = str3;
        uVar.f8418c = i0.q(i0Var);
        uVar.f8430q = u0.n(vVar.f8488r);
        uVar.f8431r = u0.n(d);
        uVar.f8423j = str2;
        uVar.f8424k = s0Var;
        uVar.h = i12;
        uVar.f8422i = i13;
        uVar.J = i10;
        uVar.f8419e = i3;
        uVar.f8420f = i11;
        uVar.d = str;
        return new v(uVar);
    }

    @Override
    public final void a() {
        q[] qVarArr;
        i0 i0Var;
        long j10;
        for (q qVar : this.K) {
            a3.q qVar2 = qVar.f53763s;
            i iVar = qVar.d;
            ArrayList arrayList = qVar.E;
            if (!arrayList.isEmpty()) {
                j jVar = (j) g9.o.n(arrayList);
                int c2 = iVar.c(jVar);
                int i3 = jVar.F;
                boolean z10 = true;
                if (c2 == 1) {
                    if (!jVar.g()) {
                        if (i3 == -1) {
                            z10 = false;
                        }
                        zb.p(z10);
                        r2.m b10 = iVar.f53688g.b(jVar.f53706y, false);
                        b10.getClass();
                        i0 i0Var2 = b10.f54165r;
                        int i10 = (int) (jVar.f58174s - b10.f54158k);
                        if (i10 < 0) {
                            j10 = 0;
                        } else {
                            if (i10 < i0Var2.size()) {
                                i0Var = ((r2.j) i0Var2.get(i10)).f54139y;
                            } else {
                                i0Var = b10.f54166s;
                            }
                            j10 = ((r2.h) i0Var.get(i3)).f54142c;
                        }
                        jVar.f53702b0 = j10;
                    }
                } else if (c2 == 0) {
                    qVar.I.post(new hc1(19, qVar, jVar));
                } else if (c2 == 2 && !qVar.f53756k0 && qVar2.d()) {
                    qVar2.b();
                }
            }
        }
        this.H.k(this);
    }

    @Override
    public final boolean b(Uri uri, e5.u uVar, boolean z10) {
        int i3;
        boolean z11;
        w wVar;
        a3.i iVar;
        int u10;
        boolean z12;
        w wVar2;
        q[] qVarArr = this.K;
        int length = qVarArr.length;
        int i10 = 0;
        boolean z13 = false;
        while (i10 < length) {
            q qVar = qVarArr[i10];
            i iVar2 = qVar.d;
            w[] wVarArr = iVar2.f53686e;
            r2.d dVar = iVar2.f53688g;
            int length2 = wVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length2) {
                    break;
                }
                w wVar3 = wVarArr[i11];
                r2.c cVar = (r2.c) dVar.d.get(uri);
                if (cVar != null) {
                    wVar = cVar.f54080a;
                } else {
                    wVar = null;
                }
                if (wVar3.equals(wVar)) {
                    if (!z10) {
                        a3.h a10 = iVar2.a(uri);
                        qVar.f53762r.getClass();
                        iVar = kb.a.D4(a10, uVar);
                    } else {
                        iVar = null;
                    }
                    iVar2.f53695o = uri;
                    if (iVar != null) {
                        int i12 = iVar.f92a;
                        i3 = i10;
                        long j10 = iVar.f93b;
                        if (i12 != 1) {
                            if (i12 == 2) {
                                int i13 = 0;
                                while (true) {
                                    if (i13 < wVarArr.length) {
                                        w wVar4 = wVarArr[i13];
                                        r2.c cVar2 = (r2.c) dVar.d.get(uri);
                                        if (cVar2 != null) {
                                            wVar2 = cVar2.f54080a;
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
                                if (i13 != -1 && (u10 = iVar2.f53698r.u(i13)) != -1 && iVar2.f53698r.p(u10, j10)) {
                                    r2.c cVar3 = (r2.c) dVar.d.get(uri);
                                    if (cVar3 != null) {
                                        z12 = r2.c.c(cVar3, uri, j10);
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        z11 = true;
                                    }
                                }
                            } else {
                                throw new IllegalStateException(p1.i(i12, "Invalid fallback selection type: "));
                            }
                        } else {
                            r2.c cVar4 = (r2.c) dVar.d.get(uri);
                            if (cVar4 != null) {
                                z11 = r2.c.c(cVar4, uri, j10);
                            }
                        }
                    }
                } else {
                    i11++;
                }
            }
            i3 = i10;
            z11 = false;
            z13 |= z11;
            i10 = i3 + 1;
        }
        this.H.k(this);
        return z13;
    }

    @Override
    public final boolean c(v0 v0Var) {
        q[] qVarArr;
        if (this.J == null) {
            for (q qVar : this.K) {
                if (!qVar.U) {
                    k2.u0 u0Var = new k2.u0();
                    u0Var.f16744a = qVar.f53752g0;
                    qVar.c(new v0(u0Var));
                }
            }
            return false;
        }
        return this.N.c(v0Var);
    }

    @Override
    public final boolean d() {
        return this.N.d();
    }

    @Override
    public final long e() {
        return this.N.e();
    }

    public final q f(String str, int i3, w[] wVarArr, v[] vVarArr, v vVar, List list, Map map, long j10) {
        q qVar = new q(str, i3, this.G, new i(this.f53707a, this.f53708b, wVarArr, vVarArr, this.f53709c, this.d, this.f53715w, list, this.F), map, this.f53713r, j10, vVar, this.f53710e, this.f53711f, this.h, this.f53712n, this.E, null);
        long j11 = this.O;
        qVar.f53757l0 = j11;
        if (qVar.T) {
            for (p pVar : qVar.M) {
                pVar.K(j11);
            }
        }
        return qVar;
    }

    @Override
    public final void g() {
        q[] qVarArr;
        for (q qVar : this.K) {
            qVar.C();
            if (qVar.f53756k0 && !qVar.U) {
                throw d2.v0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override
    public final void i(d0 d0Var, long j10) {
        String str;
        c cVar;
        boolean z10;
        Map map;
        i0 i0Var;
        q[] qVarArr;
        int i3;
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
        r2.d dVar = this.f53708b;
        dVar.getClass();
        dVar.f54086e.add(this);
        r2.p pVar = dVar.f54090s;
        pVar.getClass();
        Map map3 = Collections.EMPTY_MAP;
        i0 c2 = dVar.c(0);
        c2.getClass();
        i0 c10 = dVar.c(2);
        c10.getClass();
        i0 c11 = dVar.c(3);
        c11.getClass();
        boolean isEmpty = c2.isEmpty();
        this.I = 0;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        c cVar2 = this.f53707a;
        boolean z16 = this.f53717y;
        if (isEmpty) {
            str = "ID3";
            cVar = cVar2;
            z10 = z16;
            map = map3;
            i0Var = c11;
        } else {
            v vVar = pVar.f54185j;
            List list2 = pVar.f54186k;
            int size = c2.size();
            int[] iArr = new int[size];
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < c2.size(); i14++) {
                v vVar2 = ((w) c2.get(i14)).f54231a.f54228a;
                int i15 = vVar2.A;
                String str2 = vVar2.f8481k;
                if (i15 > 0 || n0.w(2, str2) != null) {
                    int i16 = i13;
                    iArr[i14] = 2;
                    i12++;
                    i13 = i16;
                } else if (n0.w(1, str2) != null) {
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
            v[] vVarArr = new v[i11];
            int[] iArr2 = new int[i11];
            int i19 = 0;
            boolean z17 = z12;
            int i20 = 0;
            while (i20 < c2.size()) {
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
                    w wVar = (w) c2.get(i20);
                    wVarArr[i19] = wVar;
                    vVarArr[i19] = wVar.f54231a.f54228a;
                    iArr2[i19] = i20;
                    i19++;
                }
                i20++;
                list2 = list;
            }
            List list3 = list2;
            String str3 = vVarArr[0].f8481k;
            int v = n0.v(2, str3);
            int i21 = 1;
            int v10 = n0.v(1, str3);
            if ((v10 == 1 || (v10 == 0 && c10.isEmpty())) && v <= 1 && v10 + v > 0) {
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
            i0Var = c11;
            q f10 = f("main", i21, wVarArr, vVarArr, vVar, list3, map3, j10);
            arrayList3.add(f10);
            arrayList4.add(iArr2);
            if (z10 && z14) {
                ArrayList arrayList5 = new ArrayList();
                if (v > 0) {
                    v[] vVarArr2 = new v[i11];
                    int i22 = 0;
                    while (i22 < i11) {
                        v vVar3 = vVarArr[i22];
                        String w10 = n0.w(2, vVar3.f8481k);
                        String d = u0.d(w10);
                        v[] vVarArr3 = vVarArr;
                        d2.u uVar = new d2.u();
                        uVar.f8416a = vVar3.f8473a;
                        uVar.f8417b = vVar3.f8474b;
                        uVar.f8418c = i0.q(vVar3.f8475c);
                        uVar.f8430q = u0.n(vVar3.f8488r);
                        uVar.f8431r = u0.n(d);
                        uVar.f8423j = w10;
                        uVar.f8424k = vVar3.f8482l;
                        uVar.h = vVar3.h;
                        uVar.f8422i = vVar3.f8479i;
                        uVar.f8437y = vVar3.f8495z;
                        uVar.f8438z = vVar3.A;
                        uVar.C = vVar3.D;
                        uVar.f8419e = vVar3.f8476e;
                        uVar.f8420f = vVar3.f8477f;
                        uVar.H = vVar3.I;
                        vVarArr2[i22] = new v(uVar);
                        i22++;
                        vVarArr = vVarArr3;
                        map3 = map3;
                    }
                    v[] vVarArr4 = vVarArr;
                    map = map3;
                    arrayList5.add(new o1("main", vVarArr2));
                    if (v10 > 0 && (vVar != null || c10.isEmpty())) {
                        d2.u a10 = h(vVarArr4[0], vVar, false).a();
                        a10.f8425l = "main";
                        arrayList5.add(new o1("main:audio", new v(a10)));
                    }
                    if (list3 != null) {
                        for (int i23 = 0; i23 < list3.size(); i23++) {
                            String i24 = p1.i(i23, "main:cc:");
                            d2.u a11 = cVar2.b((v) list3.get(i23)).a();
                            a11.f8425l = "main";
                            arrayList5.add(new o1(i24, new v(a11)));
                        }
                    }
                    cVar = cVar2;
                } else {
                    map = map3;
                    cVar = cVar2;
                    v[] vVarArr5 = new v[i11];
                    for (int i25 = 0; i25 < i11; i25++) {
                        vVarArr5[i25] = h(vVarArr[i25], vVar, true);
                    }
                    arrayList5.add(new o1("main", vVarArr5));
                }
                d2.u uVar2 = new d2.u();
                str = "ID3";
                uVar2.f8416a = str;
                uVar2.f8431r = u0.n("application/id3");
                uVar2.f8425l = "main";
                o1 o1Var = new o1("main:id3", new v(uVar2));
                arrayList5.add(o1Var);
                f10.D((o1[]) arrayList5.toArray(new o1[0]), arrayList5.indexOf(o1Var));
            } else {
                map = map3;
                str = "ID3";
                cVar = cVar2;
            }
        }
        ArrayList arrayList6 = new ArrayList(c10.size());
        ArrayList arrayList7 = new ArrayList(c10.size());
        ArrayList arrayList8 = new ArrayList(c10.size());
        HashSet hashSet3 = new HashSet();
        int i26 = 0;
        while (i26 < c10.size()) {
            String str4 = ((w) c10.get(i26)).f54231a.f54230c;
            str4.getClass();
            if (!hashSet3.add(str4)) {
                hashSet2 = hashSet3;
                i10 = i26;
                i0Var2 = c10;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
            } else {
                arrayList6.clear();
                arrayList7.clear();
                arrayList8.clear();
                boolean z18 = true;
                for (int i27 = 0; i27 < c10.size(); i27++) {
                    if (str4.equals(((w) c10.get(i27)).f54231a.f54230c)) {
                        w wVar2 = (w) c10.get(i27);
                        v vVar4 = wVar2.f54231a.f54228a;
                        arrayList8.add(Integer.valueOf(i27));
                        arrayList6.add(wVar2);
                        arrayList7.add(vVar4);
                        if (n0.v(1, vVar4.f8481k) == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z18 &= z11;
                    }
                }
                String concat = "audio:".concat(str4);
                String str5 = n0.f11873a;
                i10 = i26;
                hashSet2 = hashSet3;
                i0Var2 = c10;
                map2 = map;
                arrayList = arrayList7;
                arrayList2 = arrayList8;
                q f11 = f(concat, 1, (w[]) arrayList6.toArray(new w[0]), (v[]) arrayList7.toArray(new v[0]), null, Collections.EMPTY_LIST, map2, j10);
                arrayList4.add(od.f(arrayList2));
                arrayList3.add(f11);
                if (z10 && z18) {
                    String q10 = t4.c.q(concat, ":id3");
                    d2.u uVar3 = new d2.u();
                    uVar3.f8416a = str;
                    uVar3.f8431r = u0.n("application/id3");
                    uVar3.f8425l = concat;
                    f11.D(new o1[]{new o1(concat, (v[]) arrayList.toArray(new v[0])), new o1(q10, new v(uVar3))}, 1);
                }
            }
            i26 = i10 + 1;
            arrayList7 = arrayList;
            c10 = i0Var2;
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
            String str6 = ((w) i0Var3.get(i28)).f54231a.f54230c;
            str6.getClass();
            if (!hashSet4.add(str6)) {
                hashSet = hashSet4;
                i3 = i28;
                i0Var = i0Var3;
            } else {
                arrayList9.clear();
                arrayList10.clear();
                arrayList11.clear();
                for (int i29 = 0; i29 < i0Var3.size(); i29++) {
                    if (str6.equals(((w) i0Var3.get(i29)).f54231a.f54230c)) {
                        w wVar3 = (w) i0Var3.get(i29);
                        arrayList11.add(Integer.valueOf(i29));
                        arrayList9.add(wVar3);
                        arrayList10.add(wVar3.f54231a.f54228a);
                    }
                }
                String concat2 = "subtitle:".concat(str6);
                v[] vVarArr6 = (v[]) arrayList10.toArray(new v[0]);
                String str7 = n0.f11873a;
                g0 g0Var = i0.f12083b;
                i0Var = i0Var3;
                i3 = i28;
                hashSet = hashSet4;
                q f12 = f(concat2, 3, (w[]) arrayList9.toArray(new w[0]), vVarArr6, null, s1.f12146e, map4, j10);
                arrayList4.add(od.f(arrayList11));
                arrayList3.add(f12);
                int length = vVarArr6.length;
                v[] vVarArr7 = new v[length];
                for (int i30 = 0; i30 < length; i30++) {
                    vVarArr7[i30] = cVar.b(vVarArr6[i30]);
                }
                f12.D(new o1[]{new o1(concat2, vVarArr7)}, new int[0]);
            }
            i28 = i3 + 1;
            hashSet4 = hashSet;
        }
        this.K = (q[]) arrayList3.toArray(new q[0]);
        int[][] iArr3 = (int[][]) arrayList4.toArray(new int[0]);
        this.I = this.K.length;
        for (int i31 = 0; i31 < this.M; i31++) {
            this.K[i31].d.f53692l = true;
        }
        for (q qVar : this.K) {
            if (!qVar.U) {
                k2.u0 u0Var = new k2.u0();
                u0Var.f16744a = qVar.f53752g0;
                qVar.c(new v0(u0Var));
            }
        }
        this.L = this.K;
    }

    @Override
    public final long j(long j10) {
        q[] qVarArr = this.L;
        if (qVarArr.length > 0) {
            boolean F = qVarArr[0].F(j10, false);
            int i3 = 1;
            while (true) {
                q[] qVarArr2 = this.L;
                if (i3 >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i3].F(j10, F);
                i3++;
            }
            if (F) {
                ((SparseArray) this.f53715w.f34636b).clear();
            }
        }
        return j10;
    }

    @Override
    public final void l(long j10) {
        q[] qVarArr;
        for (q qVar : this.L) {
            if (qVar.T && !qVar.A()) {
                int length = qVar.M.length;
                for (int i3 = 0; i3 < length; i3++) {
                    qVar.M[i3].k(j10, qVar.f53749e0[i3]);
                }
            }
        }
    }

    @Override
    public final long n() {
        return -9223372036854775807L;
    }

    @Override
    public final r1 p() {
        r1 r1Var = this.J;
        r1Var.getClass();
        return r1Var;
    }

    @Override
    public final long q() {
        return this.N.q();
    }

    @Override
    public final long r(long j10, t1 t1Var) {
        r2.m mVar;
        long j11;
        q[] qVarArr = this.L;
        int length = qVarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                break;
            }
            q qVar = qVarArr[i3];
            if (qVar.R == 2) {
                i iVar = qVar.d;
                r2.d dVar = iVar.f53688g;
                int c2 = iVar.f53698r.c();
                w[] wVarArr = iVar.f53686e;
                if (c2 < wVarArr.length && c2 != -1) {
                    mVar = dVar.b(wVarArr[iVar.f53698r.l()].c(), true);
                } else {
                    mVar = null;
                }
                if (mVar != null) {
                    i0 i0Var = mVar.f54165r;
                    if (!i0Var.isEmpty()) {
                        long j12 = mVar.h - dVar.J;
                        long j13 = j10 - j12;
                        int d = n0.d(i0Var, Long.valueOf(j13), true);
                        long j14 = ((r2.j) i0Var.get(d)).f54143e;
                        if (mVar.f54191c && d != i0Var.size() - 1) {
                            j11 = ((r2.j) i0Var.get(d + 1)).f54143e;
                        } else {
                            j11 = j14;
                        }
                        return t1Var.a(j13, j14, j11) + j12;
                    }
                }
            } else {
                i3++;
            }
        }
        return j10;
    }

    @Override
    public final long s(z2.p[] r40, boolean[] r41, w2.d1[] r42, boolean[] r43, long r44) {
        throw new UnsupportedOperationException("Method not decompiled: q2.k.s(z2.p[], boolean[], w2.d1[], boolean[], long):long");
    }

    @Override
    public final void t(long j10) {
        this.N.t(j10);
    }
}
