package r4;

import android.util.Pair;
import android.util.SparseArray;
import b4.e0;
import g5.n0;
import g5.q;
import g5.v0;
import h5.d0;
import j3.h2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k7.y7;
import o4.k0;
import o4.l0;
import o4.m0;
import o4.s;
import o4.s0;
import o4.t;
import o4.t0;
import org.telegram.ui.Cells.f1;
public final class b implements t, m0, q4.g {
    public static final Pattern K = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern L = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final e0 B;
    public final o3.l C;
    public s D;
    public z2.d G;
    public s4.c H;
    public int I;
    public List J;
    public final int f46603a;
    public final f1 f46604b;
    public final v0 f46605c;
    public final o3.o d;
    public final ab.a f46606e;
    public final com.google.firebase.messaging.s f46607f;
    public final long h;
    public final n0 f46608n;
    public final q f46609r;
    public final t0 f46610s;
    public final a[] v;
    public final z9.d f46611w;
    public final o f46612x;
    public q4.h[] E = new q4.h[0];
    public l[] F = new l[0];
    public final IdentityHashMap f46613y = new IdentityHashMap();

    public b(int i10, s4.c cVar, com.google.firebase.messaging.s sVar, int i11, f1 f1Var, v0 v0Var, o3.o oVar, o3.l lVar, ab.a aVar, e0 e0Var, long j10, n0 n0Var, q qVar, z9.d dVar, f1 f1Var2, k3.k kVar) {
        String j11;
        int i12;
        int i13;
        int[][] iArr;
        boolean[] zArr;
        j3.n0[] n0VarArr;
        s4.f c3;
        Integer num;
        o3.o oVar2 = oVar;
        this.f46603a = i10;
        this.H = cVar;
        this.f46607f = sVar;
        this.I = i11;
        this.f46604b = f1Var;
        this.f46605c = v0Var;
        this.d = oVar2;
        this.C = lVar;
        this.f46606e = aVar;
        this.B = e0Var;
        this.h = j10;
        this.f46608n = n0Var;
        this.f46609r = qVar;
        this.f46611w = dVar;
        this.f46612x = new o(cVar, f1Var2, qVar);
        q4.h[] hVarArr = this.E;
        dVar.getClass();
        this.G = new z2.d(hVarArr);
        s4.h b10 = cVar.b(i11);
        List list = b10.d;
        this.J = list;
        List list2 = b10.f46977c;
        int size = list2.size();
        HashMap hashMap = new HashMap(s8.l.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i14 = 0; i14 < size; i14++) {
            hashMap.put(Long.valueOf(((s4.a) list2.get(i14)).f46940a), Integer.valueOf(i14));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i14));
            arrayList.add(arrayList2);
            sparseArray.put(i14, arrayList2);
        }
        for (int i15 = 0; i15 < size; i15++) {
            s4.a aVar2 = (s4.a) list2.get(i15);
            List list3 = aVar2.f46943e;
            List list4 = aVar2.f46944f;
            s4.f c10 = c("http://dashif.org/guidelines/trickmode", list3);
            c10 = c10 == null ? c("http://dashif.org/guidelines/trickmode", list4) : c10;
            int intValue = (c10 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(c10.f46970b)))) == null) ? i15 : num.intValue();
            if (intValue == i15 && (c3 = c("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = c3.f46970b;
                int i16 = d0.f7237a;
                for (String str2 : str.split(",", -1)) {
                    Integer num2 = (Integer) hashMap.get(Long.valueOf(Long.parseLong(str2)));
                    if (num2 != null) {
                        intValue = Math.min(intValue, num2.intValue());
                    }
                }
            }
            if (intValue != i15) {
                List list5 = (List) sparseArray.get(i15);
                List list6 = (List) sparseArray.get(intValue);
                list6.addAll(list5);
                sparseArray.put(i15, list6);
                arrayList.remove(list5);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2];
        for (int i17 = 0; i17 < size2; i17++) {
            int[] d = y7.d((Collection) arrayList.get(i17));
            iArr2[i17] = d;
            Arrays.sort(d);
        }
        boolean[] zArr2 = new boolean[size2];
        j3.n0[][] n0VarArr2 = new j3.n0[size2];
        int i18 = 0;
        int i19 = 0;
        while (i18 < size2) {
            int[] iArr3 = iArr2[i18];
            int length = iArr3.length;
            int i20 = 0;
            while (true) {
                if (i20 >= length) {
                    break;
                }
                List list7 = ((s4.a) list2.get(iArr3[i20])).f46942c;
                for (int i21 = 0; i21 < list7.size(); i21++) {
                    if (!((s4.m) list7.get(i21)).d.isEmpty()) {
                        zArr2[i18] = true;
                        i19++;
                        break;
                    }
                }
                i20++;
            }
            int[] iArr4 = iArr2[i18];
            int length2 = iArr4.length;
            int i22 = 0;
            while (true) {
                if (i22 < length2) {
                    int i23 = iArr4[i22];
                    s4.a aVar3 = (s4.a) list2.get(i23);
                    List list8 = ((s4.a) list2.get(i23)).d;
                    int[] iArr5 = iArr4;
                    int i24 = 0;
                    while (i24 < list8.size()) {
                        s4.f fVar = (s4.f) list8.get(i24);
                        iArr = iArr2;
                        zArr = zArr2;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f46969a)) {
                            j3.m0 m0Var = new j3.m0();
                            m0Var.f9265o = "application/cea-608";
                            m0Var.f9253a = android.support.v4.media.a.q(new StringBuilder(), aVar3.f46940a, ":cea608");
                            n0VarArr = l(fVar, K, new j3.n0(m0Var));
                            break;
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f46969a)) {
                            j3.m0 m0Var2 = new j3.m0();
                            m0Var2.f9265o = "application/cea-708";
                            m0Var2.f9253a = android.support.v4.media.a.q(new StringBuilder(), aVar3.f46940a, ":cea708");
                            n0VarArr = l(fVar, L, new j3.n0(m0Var2));
                            break;
                        } else {
                            i24++;
                            iArr2 = iArr;
                            zArr2 = zArr;
                        }
                    }
                    i22++;
                    iArr4 = iArr5;
                } else {
                    iArr = iArr2;
                    zArr = zArr2;
                    n0VarArr = new j3.n0[0];
                    break;
                }
            }
            n0VarArr2[i18] = n0VarArr;
            if (n0VarArr.length != 0) {
                i19++;
            }
            i18++;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        int size3 = list.size() + i19 + size2;
        s0[] s0VarArr = new s0[size3];
        a[] aVarArr = new a[size3];
        int i25 = 0;
        int i26 = 0;
        while (i26 < size2) {
            int[] iArr7 = iArr6[i26];
            ArrayList arrayList3 = new ArrayList();
            for (int i27 : iArr7) {
                arrayList3.addAll(((s4.a) list2.get(i27)).f46942c);
            }
            int size4 = arrayList3.size();
            j3.n0[] n0VarArr3 = new j3.n0[size4];
            int i28 = 0;
            while (i28 < size4) {
                int i29 = size2;
                j3.n0 n0Var2 = ((s4.m) arrayList3.get(i28)).f46988a;
                int i30 = i25;
                int b11 = oVar2.b(n0Var2);
                j3.m0 a2 = n0Var2.a();
                a2.J = b11;
                n0VarArr3[i28] = new j3.n0(a2);
                i28++;
                size2 = i29;
                i25 = i30;
            }
            int i31 = size2;
            int i32 = i25;
            s4.a aVar4 = (s4.a) list2.get(iArr7[0]);
            long j12 = aVar4.f46940a;
            if (j12 != -1) {
                j11 = Long.toString(j12);
            } else {
                j11 = l.d.j(i26, "unset:");
            }
            int i33 = i32 + 1;
            if (zArr3[i26]) {
                i12 = i32 + 2;
            } else {
                i12 = i33;
                i33 = -1;
            }
            if (n0VarArr2[i26].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            List list9 = list2;
            s0VarArr[i32] = new s0(j11, n0VarArr3);
            int i34 = i32;
            aVarArr[i34] = new a(aVar4.f46941b, 0, iArr7, i32, i33, i12, -1);
            int i35 = -1;
            if (i33 != -1) {
                String e6 = w.c.e(j11, ":emsg");
                j3.m0 m0Var3 = new j3.m0();
                m0Var3.f9253a = e6;
                m0Var3.f9265o = "application/x-emsg";
                s0VarArr[i33] = new s0(e6, new j3.n0(m0Var3));
                a aVar5 = new a(5, 1, iArr7, i34, -1, -1, -1);
                i34 = i34;
                aVarArr[i33] = aVar5;
                i35 = -1;
            }
            if (i12 != i35) {
                s0VarArr[i12] = new s0(w.c.e(j11, ":cc"), n0VarArr2[i26]);
                aVarArr[i12] = new a(3, 1, iArr7, i34, -1, -1, -1);
            }
            i26++;
            size2 = i31;
            oVar2 = oVar;
            i25 = i13;
            list2 = list9;
        }
        int i36 = 0;
        while (i36 < list.size()) {
            s4.g gVar = (s4.g) list.get(i36);
            j3.m0 m0Var4 = new j3.m0();
            m0Var4.f9253a = gVar.a();
            m0Var4.f9265o = "application/x-emsg";
            s0VarArr[i25] = new s0(gVar.a() + ":" + i36, new j3.n0(m0Var4));
            aVarArr[i25] = new a(5, 2, new int[0], -1, -1, -1, i36);
            i36++;
            i25++;
        }
        Pair create = Pair.create(new t0(s0VarArr), aVarArr);
        this.f46610s = (t0) create.first;
        this.v = (a[]) create.second;
    }

    public static s4.f c(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            s4.f fVar = (s4.f) list.get(i10);
            if (str.equals(fVar.f46969a)) {
                return fVar;
            }
        }
        return null;
    }

    public static j3.n0[] l(s4.f fVar, Pattern pattern, j3.n0 n0Var) {
        String str = fVar.f46970b;
        if (str == null) {
            return new j3.n0[]{n0Var};
        }
        int i10 = d0.f7237a;
        String[] split = str.split(";", -1);
        j3.n0[] n0VarArr = new j3.n0[split.length];
        for (int i11 = 0; i11 < split.length; i11++) {
            Matcher matcher = pattern.matcher(split[i11]);
            if (!matcher.matches()) {
                return new j3.n0[]{n0Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            j3.m0 a2 = n0Var.a();
            a2.f9253a = n0Var.f9318a + ":" + parseInt;
            a2.G = parseInt;
            a2.f9255c = matcher.group(2);
            n0VarArr[i11] = new j3.n0(a2);
        }
        return n0VarArr;
    }

    @Override
    public final boolean b() {
        return this.G.b();
    }

    @Override
    public final long d(long j10, h2 h2Var) {
        long j11;
        long j12 = j10;
        q4.h[] hVarArr = this.E;
        int length = hVarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            q4.h hVar = hVarArr[i11];
            if (hVar.f44484a == 2) {
                i[] iVarArr = hVar.f44487e.h;
                int length2 = iVarArr.length;
                while (i10 < length2) {
                    i iVar = iVarArr[i10];
                    h hVar2 = iVar.d;
                    long j13 = iVar.f46646f;
                    h hVar3 = iVar.d;
                    long j14 = iVar.f46645e;
                    if (hVar2 != null) {
                        long F = hVar2.F(j14);
                        if (F != 0) {
                            long t6 = hVar3.t(j12, j14) + j13;
                            long d = iVar.d(t6);
                            if (d < j12 && (F == -1 || t6 < ((hVar3.C() + j13) + F) - 1)) {
                                j11 = iVar.d(t6 + 1);
                            } else {
                                j11 = d;
                            }
                            return h2Var.a(j12, d, j11);
                        }
                    }
                    i10++;
                    j12 = j10;
                }
            } else {
                i11++;
                j12 = j10;
            }
        }
        return j10;
    }

    @Override
    public final long e() {
        return this.G.e();
    }

    @Override
    public final void f(s sVar, long j10) {
        this.D = sVar;
        sVar.a(this);
    }

    @Override
    public final long g(f5.c[] cVarArr, boolean[] zArr, l0[] l0VarArr, boolean[] zArr2, long j10) {
        int i10;
        boolean z4;
        int[] iArr;
        int i11;
        int[] iArr2;
        boolean z10;
        s0 s0Var;
        int i12;
        boolean z11;
        s0 s0Var2;
        int i13;
        n nVar;
        boolean z12;
        int[] iArr3 = new int[cVarArr.length];
        int i14 = 0;
        while (true) {
            i10 = -1;
            if (i14 >= cVarArr.length) {
                break;
            }
            f5.c cVar = cVarArr[i14];
            if (cVar != null) {
                iArr3[i14] = this.f46610s.b(cVar.l());
            } else {
                iArr3[i14] = -1;
            }
            i14++;
        }
        for (int i15 = 0; i15 < cVarArr.length; i15++) {
            if (cVarArr[i15] == null || !zArr[i15]) {
                Object[] objArr = l0VarArr[i15];
                if (objArr instanceof q4.h) {
                    ((q4.h) objArr).B(this);
                } else if (objArr instanceof q4.f) {
                    q4.f fVar = (q4.f) objArr;
                    q4.h hVar = fVar.f44483e;
                    boolean[] zArr3 = hVar.d;
                    int i16 = fVar.f44482c;
                    h5.a.i(zArr3[i16]);
                    hVar.d[i16] = false;
                }
                l0VarArr[i15] = 0;
            }
        }
        int i17 = 0;
        while (true) {
            z4 = true;
            if (i17 >= cVarArr.length) {
                break;
            }
            Object[] objArr2 = l0VarArr[i17];
            if ((objArr2 instanceof o4.g) || (objArr2 instanceof q4.f)) {
                int h = h(i17, iArr3);
                if (h == -1) {
                    z12 = l0VarArr[i17] instanceof o4.g;
                } else {
                    Object[] objArr3 = l0VarArr[i17];
                    z12 = ((objArr3 instanceof q4.f) && ((q4.f) objArr3).f44480a == l0VarArr[h]) ? false : false;
                }
                if (!z12) {
                    Object[] objArr4 = l0VarArr[i17];
                    if (objArr4 instanceof q4.f) {
                        q4.f fVar2 = (q4.f) objArr4;
                        q4.h hVar2 = fVar2.f44483e;
                        boolean[] zArr4 = hVar2.d;
                        int i18 = fVar2.f44482c;
                        h5.a.i(zArr4[i18]);
                        hVar2.d[i18] = false;
                    }
                    l0VarArr[i17] = 0;
                }
            }
            i17++;
        }
        int i19 = 0;
        while (i19 < cVarArr.length) {
            f5.c cVar2 = cVarArr[i19];
            if (cVar2 == null) {
                i11 = i19;
                iArr2 = iArr3;
            } else {
                Object[] objArr5 = l0VarArr[i19];
                if (objArr5 == 0) {
                    zArr2[i19] = z4;
                    a aVar = this.v[iArr3[i19]];
                    int i20 = aVar.f46599c;
                    if (i20 == 0) {
                        int i21 = aVar.f46601f;
                        if (i21 != i10) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            s0Var = this.f46610s.a(i21);
                            i12 = 1;
                        } else {
                            s0Var = null;
                            i12 = 0;
                        }
                        int i22 = aVar.f46602g;
                        if (i22 != i10) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            s0Var2 = this.f46610s.a(i22);
                            i12 += s0Var2.f16571a;
                        } else {
                            s0Var2 = null;
                        }
                        j3.n0[] n0VarArr = new j3.n0[i12];
                        int[] iArr4 = new int[i12];
                        if (z10) {
                            n0VarArr[0] = s0Var.d[0];
                            iArr4[0] = 5;
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (z11) {
                            for (int i23 = 0; i23 < s0Var2.f16571a; i23++) {
                                j3.n0 n0Var = s0Var2.d[i23];
                                n0VarArr[i13] = n0Var;
                                iArr4[i13] = 3;
                                arrayList.add(n0Var);
                                i13++;
                            }
                        }
                        if (this.H.d && z10) {
                            o oVar = this.f46612x;
                            nVar = new n(oVar, oVar.f46670a);
                        } else {
                            nVar = null;
                        }
                        f1 f1Var = this.f46604b;
                        n0 n0Var2 = this.f46608n;
                        s4.c cVar3 = this.H;
                        com.google.firebase.messaging.s sVar = this.f46607f;
                        int i24 = this.I;
                        int[] iArr5 = aVar.f46597a;
                        int i25 = aVar.f46598b;
                        long j11 = this.h;
                        i11 = i19;
                        v0 v0Var = this.f46605c;
                        g5.m createDataSource = ((g5.l) f1Var.f22788b).createDataSource();
                        if (v0Var != null) {
                            createDataSource.addTransferListener(v0Var);
                        }
                        n nVar2 = nVar;
                        iArr2 = iArr3;
                        q4.h hVar3 = new q4.h(aVar.f46598b, iArr4, n0VarArr, new k(n0Var2, cVar3, sVar, i24, iArr5, cVar2, i25, createDataSource, j11, z10, arrayList, nVar), this, this.f46609r, j10, this.d, this.C, this.f46606e, this.B);
                        synchronized (this) {
                            this.f46613y.put(hVar3, nVar2);
                        }
                        l0VarArr[i11] = hVar3;
                    } else {
                        i11 = i19;
                        iArr2 = iArr3;
                        if (i20 == 2) {
                            l0VarArr[i11] = new l((s4.g) this.J.get(aVar.d), cVar2.l().d[0], this.H.d);
                        }
                    }
                } else {
                    i11 = i19;
                    iArr2 = iArr3;
                    if (objArr5 instanceof q4.h) {
                        ((q4.h) objArr5).f44487e.f46653i = cVar2;
                    }
                }
            }
            i19 = i11 + 1;
            iArr3 = iArr2;
            i10 = -1;
            z4 = true;
        }
        int[] iArr6 = iArr3;
        int i26 = 0;
        while (i26 < cVarArr.length) {
            if (l0VarArr[i26] == 0 && cVarArr[i26] != null) {
                a aVar2 = this.v[iArr6[i26]];
                if (aVar2.f46599c == 1) {
                    iArr = iArr6;
                    int h9 = h(i26, iArr);
                    if (h9 == -1) {
                        l0VarArr[i26] = new Object();
                    } else {
                        q4.h hVar4 = (q4.h) l0VarArr[h9];
                        int i27 = aVar2.f46598b;
                        boolean[] zArr5 = hVar4.d;
                        k0[] k0VarArr = hVar4.f44494y;
                        for (int i28 = 0; i28 < k0VarArr.length; i28++) {
                            if (hVar4.f44485b[i28] == i27) {
                                h5.a.i(!zArr5[i28]);
                                zArr5[i28] = true;
                                k0VarArr[i28].D(j10, true);
                                l0VarArr[i26] = new q4.f(hVar4, hVar4, k0VarArr[i28], i28);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    i26++;
                    iArr6 = iArr;
                }
            }
            iArr = iArr6;
            i26++;
            iArr6 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object[] objArr6 : l0VarArr) {
            if (objArr6 instanceof q4.h) {
                arrayList2.add((q4.h) objArr6);
            } else if (objArr6 instanceof l) {
                arrayList3.add((l) objArr6);
            }
        }
        q4.h[] hVarArr = new q4.h[arrayList2.size()];
        this.E = hVarArr;
        arrayList2.toArray(hVarArr);
        l[] lVarArr = new l[arrayList3.size()];
        this.F = lVarArr;
        arrayList3.toArray(lVarArr);
        z9.d dVar = this.f46611w;
        q4.h[] hVarArr2 = this.E;
        dVar.getClass();
        this.G = new z2.d(hVarArr2);
        return j10;
    }

    public final int h(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            a[] aVarArr = this.v;
            int i12 = aVarArr[i11].f46600e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && aVarArr[i14].f46599c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override
    public final void i() {
        this.f46608n.a();
    }

    @Override
    public final long j(long j10) {
        q4.h[] hVarArr;
        l[] lVarArr;
        long j11;
        q4.a aVar;
        boolean z4;
        boolean D;
        for (q4.h hVar : this.E) {
            hVar.G = j10;
            if (hVar.y()) {
                hVar.F = j10;
            } else {
                for (int i10 = 0; i10 < hVar.v.size(); i10++) {
                    aVar = (q4.a) hVar.v.get(i10);
                    int i11 = (aVar.h > j10 ? 1 : (aVar.h == j10 ? 0 : -1));
                    if (i11 == 0 && aVar.v == -9223372036854775807L) {
                        break;
                    } else if (i11 > 0) {
                        break;
                    }
                }
                aVar = null;
                if (aVar != null) {
                    k0 k0Var = hVar.f44493x;
                    int d = aVar.d(0);
                    synchronized (k0Var) {
                        k0Var.B();
                        int i12 = k0Var.f16518q;
                        if (d >= i12 && d <= k0Var.f16517p + i12) {
                            k0Var.f16521t = Long.MIN_VALUE;
                            k0Var.f16520s = d - i12;
                            D = true;
                        }
                        D = false;
                    }
                } else {
                    k0 k0Var2 = hVar.f44493x;
                    if (j10 < hVar.e()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    D = k0Var2.D(j10, z4);
                }
                if (D) {
                    hVar.H = hVar.A(hVar.f44493x.q(), 0);
                    k0[] k0VarArr = hVar.f44494y;
                    for (k0 k0Var3 : k0VarArr) {
                        k0Var3.D(j10, true);
                    }
                } else {
                    hVar.F = j10;
                    hVar.J = false;
                    hVar.v.clear();
                    hVar.H = 0;
                    if (hVar.f44490r.d()) {
                        hVar.f44493x.i();
                        for (k0 k0Var4 : hVar.f44494y) {
                            k0Var4.i();
                        }
                        hVar.f44490r.b();
                    } else {
                        hVar.f44490r.f6877c = null;
                        hVar.f44493x.A(false);
                        for (k0 k0Var5 : hVar.f44494y) {
                            k0Var5.A(false);
                        }
                    }
                }
            }
        }
        for (l lVar : this.F) {
            int b10 = d0.b(lVar.f46660c, j10, true);
            lVar.h = b10;
            if (lVar.d && b10 == lVar.f46660c.length) {
                j11 = j10;
            } else {
                j11 = -9223372036854775807L;
            }
            lVar.f46663n = j11;
        }
        return j10;
    }

    @Override
    public final void k(long j10) {
        q4.h[] hVarArr;
        long j11;
        for (q4.h hVar : this.E) {
            if (!hVar.y()) {
                k0 k0Var = hVar.f44493x;
                int i10 = k0Var.f16518q;
                k0Var.h(j10, true);
                k0 k0Var2 = hVar.f44493x;
                int i11 = k0Var2.f16518q;
                if (i11 > i10) {
                    synchronized (k0Var2) {
                        if (k0Var2.f16517p == 0) {
                            j11 = Long.MIN_VALUE;
                        } else {
                            j11 = k0Var2.f16515n[k0Var2.f16519r];
                        }
                    }
                    int i12 = 0;
                    while (true) {
                        k0[] k0VarArr = hVar.f44494y;
                        if (i12 >= k0VarArr.length) {
                            break;
                        }
                        k0VarArr[i12].h(j11, hVar.d[i12]);
                        i12++;
                    }
                }
                int min = Math.min(hVar.A(i11, 0), hVar.H);
                if (min > 0) {
                    d0.L(0, min, hVar.v);
                    hVar.H -= min;
                }
            }
        }
    }

    @Override
    public final boolean m(long j10) {
        return this.G.m(j10);
    }

    @Override
    public final long n() {
        return -9223372036854775807L;
    }

    @Override
    public final t0 o() {
        return this.f46610s;
    }

    @Override
    public final long r() {
        return this.G.r();
    }

    @Override
    public final void s(o4.n0 n0Var) {
        this.D.s(this);
    }

    @Override
    public final void t(long j10) {
        this.G.t(j10);
    }
}
