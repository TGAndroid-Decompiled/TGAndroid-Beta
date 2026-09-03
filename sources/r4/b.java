package r4;

import android.util.Pair;
import android.util.SparseArray;
import b4.e0;
import com.google.firebase.messaging.r;
import g5.n0;
import g5.q;
import g5.v0;
import h5.d0;
import h7.u;
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
import kf.k0;
import o3.p;
import o4.l0;
import o4.m0;
import o4.s;
import o4.s0;
import o4.t;
import o4.t0;
import org.telegram.ui.Components.zz;
import vh.w2;
public final class b implements t, m0, q4.g {
    public static final Pattern K = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern L = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final e0 B;
    public final o3.m C;
    public s D;
    public o2.i G;
    public s4.c H;
    public int I;
    public List J;
    public final int f43288a;
    public final zz f43289b;
    public final v0 f43290c;
    public final p d;
    public final z9.d e;
    public final r f43291f;
    public final long h;
    public final n0 f43292n;
    public final q f43293r;
    public final t0 f43294s;
    public final a[] v;
    public final u f43295w;
    public final o f43296x;
    public q4.h[] E = new q4.h[0];
    public l[] F = new l[0];
    public final IdentityHashMap f43297y = new IdentityHashMap();

    public b(int i10, s4.c cVar, r rVar, int i11, zz zzVar, v0 v0Var, p pVar, o3.m mVar, z9.d dVar, e0 e0Var, long j10, n0 n0Var, q qVar, u uVar, zz zzVar2, k3.k kVar) {
        String j11;
        int i12;
        int i13;
        int[][] iArr;
        j3.n0[] n0VarArr;
        s4.f a2;
        Integer num;
        p pVar2 = pVar;
        this.f43288a = i10;
        this.H = cVar;
        this.f43291f = rVar;
        this.I = i11;
        this.f43289b = zzVar;
        this.f43290c = v0Var;
        this.d = pVar2;
        this.C = mVar;
        this.e = dVar;
        this.B = e0Var;
        this.h = j10;
        this.f43292n = n0Var;
        this.f43293r = qVar;
        this.f43295w = uVar;
        this.f43296x = new o(cVar, zzVar2, qVar);
        q4.h[] hVarArr = this.E;
        uVar.getClass();
        this.G = new o2.i(hVarArr, 1);
        s4.h b10 = cVar.b(i11);
        List list = b10.d;
        this.J = list;
        List list2 = b10.f44077c;
        int size = list2.size();
        HashMap hashMap = new HashMap(s8.l.a(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i14 = 0; i14 < size; i14++) {
            hashMap.put(Long.valueOf(((s4.a) list2.get(i14)).f44044a), Integer.valueOf(i14));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i14));
            arrayList.add(arrayList2);
            sparseArray.put(i14, arrayList2);
        }
        for (int i15 = 0; i15 < size; i15++) {
            s4.a aVar = (s4.a) list2.get(i15);
            List list3 = aVar.e;
            List list4 = aVar.f44047f;
            s4.f a10 = a("http://dashif.org/guidelines/trickmode", list3);
            a10 = a10 == null ? a("http://dashif.org/guidelines/trickmode", list4) : a10;
            int intValue = (a10 == null || (num = (Integer) hashMap.get(Long.valueOf(Long.parseLong(a10.f44070b)))) == null) ? i15 : num.intValue();
            if (intValue == i15 && (a2 = a("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = a2.f44070b;
                int i16 = d0.f6924a;
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
        boolean[] zArr = new boolean[size2];
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
                List list7 = ((s4.a) list2.get(iArr3[i20])).f44046c;
                for (int i21 = 0; i21 < list7.size(); i21++) {
                    if (!((s4.m) list7.get(i21)).d.isEmpty()) {
                        zArr[i18] = true;
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
                    s4.a aVar2 = (s4.a) list2.get(i23);
                    List list8 = ((s4.a) list2.get(i23)).d;
                    int[] iArr5 = iArr4;
                    int i24 = 0;
                    while (i24 < list8.size()) {
                        s4.f fVar = (s4.f) list8.get(i24);
                        iArr = iArr2;
                        int i25 = length2;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f44069a)) {
                            j3.m0 m0Var = new j3.m0();
                            m0Var.f8666o = "application/cea-608";
                            m0Var.f8655a = android.support.v4.media.a.q(new StringBuilder(), aVar2.f44044a, ":cea608");
                            n0VarArr = d(fVar, K, new j3.n0(m0Var));
                            break;
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f44069a)) {
                            j3.m0 m0Var2 = new j3.m0();
                            m0Var2.f8666o = "application/cea-708";
                            m0Var2.f8655a = android.support.v4.media.a.q(new StringBuilder(), aVar2.f44044a, ":cea708");
                            n0VarArr = d(fVar, L, new j3.n0(m0Var2));
                            break;
                        } else {
                            i24++;
                            length2 = i25;
                            iArr2 = iArr;
                        }
                    }
                    i22++;
                    iArr4 = iArr5;
                } else {
                    iArr = iArr2;
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
        }
        int[][] iArr6 = iArr2;
        int size3 = list.size() + i19 + size2;
        s0[] s0VarArr = new s0[size3];
        a[] aVarArr = new a[size3];
        int i26 = 0;
        int i27 = 0;
        while (i27 < size2) {
            int[] iArr7 = iArr6[i27];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr7.length;
            int i28 = 0;
            while (i28 < length3) {
                arrayList3.addAll(((s4.a) list2.get(iArr7[i28])).f44046c);
                i28++;
                size2 = size2;
            }
            int i29 = size2;
            int size4 = arrayList3.size();
            j3.n0[] n0VarArr3 = new j3.n0[size4];
            int i30 = 0;
            while (i30 < size4) {
                int i31 = size4;
                j3.n0 n0Var2 = ((s4.m) arrayList3.get(i30)).f44087a;
                int i32 = i26;
                int z4 = pVar2.z(n0Var2);
                j3.m0 a11 = n0Var2.a();
                a11.J = z4;
                n0VarArr3[i30] = new j3.n0(a11);
                i30++;
                size4 = i31;
                i26 = i32;
            }
            int i33 = i26;
            s4.a aVar3 = (s4.a) list2.get(iArr7[0]);
            boolean[] zArr2 = zArr;
            long j12 = aVar3.f44044a;
            if (j12 != -1) {
                j11 = Long.toString(j12);
            } else {
                j11 = k0.j(i27, "unset:");
            }
            int i34 = i33 + 1;
            if (zArr2[i27]) {
                i12 = i33 + 2;
            } else {
                i12 = i34;
                i34 = -1;
            }
            List list9 = list2;
            if (n0VarArr2[i27].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            s0VarArr[i33] = new s0(j11, n0VarArr3);
            int i35 = i33;
            aVarArr[i35] = new a(aVar3.f44045b, 0, iArr7, i33, i34, i12, -1);
            int i36 = -1;
            if (i34 != -1) {
                String k10 = w2.k(j11, ":emsg");
                j3.m0 m0Var3 = new j3.m0();
                m0Var3.f8655a = k10;
                m0Var3.f8666o = "application/x-emsg";
                s0VarArr[i34] = new s0(k10, new j3.n0(m0Var3));
                a aVar4 = new a(5, 1, iArr7, i35, -1, -1, -1);
                i35 = i35;
                aVarArr[i34] = aVar4;
                i36 = -1;
            }
            if (i12 != i36) {
                s0VarArr[i12] = new s0(w2.k(j11, ":cc"), n0VarArr2[i27]);
                aVarArr[i12] = new a(3, 1, iArr7, i35, -1, -1, -1);
            }
            i27++;
            size2 = i29;
            i26 = i13;
            pVar2 = pVar;
            zArr = zArr2;
            list2 = list9;
        }
        int i37 = 0;
        while (i37 < list.size()) {
            s4.g gVar = (s4.g) list.get(i37);
            j3.m0 m0Var4 = new j3.m0();
            m0Var4.f8655a = gVar.a();
            m0Var4.f8666o = "application/x-emsg";
            s0VarArr[i26] = new s0(gVar.a() + ":" + i37, new j3.n0(m0Var4));
            aVarArr[i26] = new a(5, 2, new int[0], -1, -1, -1, i37);
            i37++;
            i26++;
        }
        Pair create = Pair.create(new t0(s0VarArr), aVarArr);
        this.f43294s = (t0) create.first;
        this.v = (a[]) create.second;
    }

    public static s4.f a(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            s4.f fVar = (s4.f) list.get(i10);
            if (str.equals(fVar.f44069a)) {
                return fVar;
            }
        }
        return null;
    }

    public static j3.n0[] d(s4.f fVar, Pattern pattern, j3.n0 n0Var) {
        String str = fVar.f44070b;
        if (str == null) {
            return new j3.n0[]{n0Var};
        }
        int i10 = d0.f6924a;
        String[] split = str.split(";", -1);
        j3.n0[] n0VarArr = new j3.n0[split.length];
        for (int i11 = 0; i11 < split.length; i11++) {
            Matcher matcher = pattern.matcher(split[i11]);
            if (!matcher.matches()) {
                return new j3.n0[]{n0Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            j3.m0 a2 = n0Var.a();
            a2.f8655a = n0Var.f8717a + ":" + parseInt;
            a2.G = parseInt;
            a2.f8657c = matcher.group(2);
            n0VarArr[i11] = new j3.n0(a2);
        }
        return n0VarArr;
    }

    @Override
    public final long H() {
        return this.G.H();
    }

    @Override
    public final void J(s sVar, long j10) {
        this.D = sVar;
        sVar.E1(this);
    }

    @Override
    public final void X1(o4.n0 n0Var) {
        this.D.X1(this);
    }

    @Override
    public final long Y(f5.c[] cVarArr, boolean[] zArr, l0[] l0VarArr, boolean[] zArr2, long j10) {
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
                iArr3[i14] = this.f43294s.b(cVar.l());
            } else {
                iArr3[i14] = -1;
            }
            i14++;
        }
        for (int i15 = 0; i15 < cVarArr.length; i15++) {
            if (cVarArr[i15] == null || !zArr[i15]) {
                Object[] objArr = l0VarArr[i15];
                if (objArr instanceof q4.h) {
                    ((q4.h) objArr).m(this);
                } else if (objArr instanceof q4.f) {
                    q4.f fVar = (q4.f) objArr;
                    q4.h hVar = fVar.e;
                    boolean[] zArr3 = hVar.d;
                    int i16 = fVar.f42767c;
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
                int c3 = c(i17, iArr3);
                if (c3 == -1) {
                    z12 = l0VarArr[i17] instanceof o4.g;
                } else {
                    Object[] objArr3 = l0VarArr[i17];
                    z12 = ((objArr3 instanceof q4.f) && ((q4.f) objArr3).f42765a == l0VarArr[c3]) ? false : false;
                }
                if (!z12) {
                    Object[] objArr4 = l0VarArr[i17];
                    if (objArr4 instanceof q4.f) {
                        q4.f fVar2 = (q4.f) objArr4;
                        q4.h hVar2 = fVar2.e;
                        boolean[] zArr4 = hVar2.d;
                        int i18 = fVar2.f42767c;
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
                    int i20 = aVar.f43285c;
                    if (i20 == 0) {
                        int i21 = aVar.f43286f;
                        if (i21 != i10) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            s0Var = this.f43294s.a(i21);
                            i12 = 1;
                        } else {
                            s0Var = null;
                            i12 = 0;
                        }
                        int i22 = aVar.f43287g;
                        if (i22 != i10) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            s0Var2 = this.f43294s.a(i22);
                            i12 += s0Var2.f16400a;
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
                            for (int i23 = 0; i23 < s0Var2.f16400a; i23++) {
                                j3.n0 n0Var = s0Var2.d[i23];
                                n0VarArr[i13] = n0Var;
                                iArr4[i13] = 3;
                                arrayList.add(n0Var);
                                i13++;
                            }
                        }
                        if (this.H.d && z10) {
                            o oVar = this.f43296x;
                            nVar = new n(oVar, oVar.f43349a);
                        } else {
                            nVar = null;
                        }
                        zz zzVar = this.f43289b;
                        n0 n0Var2 = this.f43292n;
                        s4.c cVar3 = this.H;
                        r rVar = this.f43291f;
                        int i24 = this.I;
                        int[] iArr5 = aVar.f43283a;
                        int i25 = aVar.f43284b;
                        long j11 = this.h;
                        i11 = i19;
                        v0 v0Var = this.f43290c;
                        g5.m createDataSource = ((g5.l) zzVar.f31508b).createDataSource();
                        if (v0Var != null) {
                            createDataSource.addTransferListener(v0Var);
                        }
                        n nVar2 = nVar;
                        iArr2 = iArr3;
                        q4.h hVar3 = new q4.h(aVar.f43284b, iArr4, n0VarArr, new k(n0Var2, cVar3, rVar, i24, iArr5, cVar2, i25, createDataSource, j11, z10, arrayList, nVar), this, this.f43293r, j10, this.d, this.C, this.e, this.B);
                        synchronized (this) {
                            this.f43297y.put(hVar3, nVar2);
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
                        ((q4.h) objArr5).e.f43334i = cVar2;
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
                if (aVar2.f43285c == 1) {
                    iArr = iArr6;
                    int c10 = c(i26, iArr);
                    if (c10 == -1) {
                        l0VarArr[i26] = new Object();
                    } else {
                        q4.h hVar4 = (q4.h) l0VarArr[c10];
                        int i27 = aVar2.f43284b;
                        boolean[] zArr5 = hVar4.d;
                        o4.k0[] k0VarArr = hVar4.f42777y;
                        for (int i28 = 0; i28 < k0VarArr.length; i28++) {
                            if (hVar4.f42769b[i28] == i27) {
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
        u uVar = this.f43295w;
        q4.h[] hVarArr2 = this.E;
        uVar.getClass();
        this.G = new o2.i(hVarArr2, 1);
        return j10;
    }

    @Override
    public final long a1() {
        return -9223372036854775807L;
    }

    @Override
    public final boolean b() {
        return this.G.b();
    }

    public final int c(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            a[] aVarArr = this.v;
            int i12 = aVarArr[i11].e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && aVarArr[i14].f43285c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override
    public final void d0() {
        this.f43292n.a();
    }

    @Override
    public final long j0(long j10) {
        q4.h[] hVarArr;
        l[] lVarArr;
        long j11;
        q4.a aVar;
        boolean z4;
        boolean D;
        for (q4.h hVar : this.E) {
            hVar.G = j10;
            if (hVar.j()) {
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
                    o4.k0 k0Var = hVar.f42776x;
                    int e = aVar.e(0);
                    synchronized (k0Var) {
                        k0Var.B();
                        int i12 = k0Var.f16352q;
                        if (e >= i12 && e <= k0Var.f16351p + i12) {
                            k0Var.f16355t = Long.MIN_VALUE;
                            k0Var.f16354s = e - i12;
                            D = true;
                        }
                        D = false;
                    }
                } else {
                    o4.k0 k0Var2 = hVar.f42776x;
                    if (j10 < hVar.H()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    D = k0Var2.D(j10, z4);
                }
                if (D) {
                    hVar.H = hVar.l(hVar.f42776x.q(), 0);
                    o4.k0[] k0VarArr = hVar.f42777y;
                    for (o4.k0 k0Var3 : k0VarArr) {
                        k0Var3.D(j10, true);
                    }
                } else {
                    hVar.F = j10;
                    hVar.J = false;
                    hVar.v.clear();
                    hVar.H = 0;
                    if (hVar.f42773r.d()) {
                        hVar.f42776x.i();
                        for (o4.k0 k0Var4 : hVar.f42777y) {
                            k0Var4.i();
                        }
                        hVar.f42773r.b();
                    } else {
                        hVar.f42773r.f6394c = null;
                        hVar.f42776x.A(false);
                        for (o4.k0 k0Var5 : hVar.f42777y) {
                            k0Var5.A(false);
                        }
                    }
                }
            }
        }
        for (l lVar : this.F) {
            int b10 = d0.b(lVar.f43341c, j10, true);
            lVar.h = b10;
            if (lVar.d && b10 == lVar.f43341c.length) {
                j11 = j10;
            } else {
                j11 = -9223372036854775807L;
            }
            lVar.f43343n = j11;
        }
        return j10;
    }

    @Override
    public final void k2(long j10) {
        this.G.k2(j10);
    }

    @Override
    public final void m0(long j10) {
        q4.h[] hVarArr;
        long j11;
        for (q4.h hVar : this.E) {
            if (!hVar.j()) {
                o4.k0 k0Var = hVar.f42776x;
                int i10 = k0Var.f16352q;
                k0Var.h(j10, true);
                o4.k0 k0Var2 = hVar.f42776x;
                int i11 = k0Var2.f16352q;
                if (i11 > i10) {
                    synchronized (k0Var2) {
                        if (k0Var2.f16351p == 0) {
                            j11 = Long.MIN_VALUE;
                        } else {
                            j11 = k0Var2.f16349n[k0Var2.f16353r];
                        }
                    }
                    int i12 = 0;
                    while (true) {
                        o4.k0[] k0VarArr = hVar.f42777y;
                        if (i12 >= k0VarArr.length) {
                            break;
                        }
                        k0VarArr[i12].h(j11, hVar.d[i12]);
                        i12++;
                    }
                }
                int min = Math.min(hVar.l(i11, 0), hVar.H);
                if (min > 0) {
                    d0.L(0, min, hVar.v);
                    hVar.H -= min;
                }
            }
        }
    }

    @Override
    public final boolean n0(long j10) {
        return this.G.n0(j10);
    }

    @Override
    public final t0 o1() {
        return this.f43294s;
    }

    @Override
    public final long y1() {
        return this.G.y1();
    }

    @Override
    public final long z(long j10, h2 h2Var) {
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
            if (hVar.f42768a == 2) {
                i[] iVarArr = hVar.e.h;
                int length2 = iVarArr.length;
                while (i10 < length2) {
                    i iVar = iVarArr[i10];
                    h hVar2 = iVar.d;
                    long j13 = iVar.f43328f;
                    h hVar3 = iVar.d;
                    long j14 = iVar.e;
                    if (hVar2 != null) {
                        long N1 = hVar2.N1(j14);
                        if (N1 != 0) {
                            long u02 = hVar3.u0(j12, j14) + j13;
                            long d = iVar.d(u02);
                            if (d < j12 && (N1 == -1 || u02 < ((hVar3.x1() + j13) + N1) - 1)) {
                                j11 = iVar.d(u02 + 1);
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
}
