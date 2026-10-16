package x2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import b2.b0;
import b2.q1;
import b2.s1;
import b2.u1;
import b2.x;
import e2.m0;
import e9.n0;
import e9.v1;
import e9.x1;
import e9.y;
import i2.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import org.telegram.ui.ds0;
import u2.r1;
import v7.b8;
import v7.u6;
public final class n extends s {
    public static final v1 f47776l = new y(new ds0(15));
    public final Object d;
    public final Context e;
    public final oa.d f47777f;
    public i f47778g;
    public Thread h;
    public z2.d f47779i;
    public b2.f f47780j;
    public Boolean f47781k;

    public n(Context context, oa.d dVar) {
        Context context2;
        i iVar = i.F0;
        this.d = new Object();
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.e = context2;
        this.f47777f = dVar;
        if (iVar != null) {
            this.f47778g = iVar;
        } else {
            iVar.getClass();
            h hVar = new h(iVar);
            hVar.d(iVar);
            this.f47778g = new i(hVar);
        }
        this.f47780j = b2.f.f2117i;
        if (this.f47778g.A0 && context == null) {
            e2.a.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int c(x xVar, n0 n0Var) {
        for (int i10 = 0; i10 < n0Var.size(); i10++) {
            for (int i11 = 0; i11 < xVar.f2510c.size(); i11++) {
                if (((b0) xVar.f2510c.get(i11)).f2082b.equals(n0Var.get(i10))) {
                    return i10;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void d(r rVar, i iVar, o[] oVarArr) {
        int i10 = rVar.f47784a;
        for (int i11 = 0; i11 < i10; i11++) {
            r1 r1Var = rVar.f47786c[i11];
            Map map = (Map) iVar.D0.get(i11);
            if (map != null && map.containsKey(r1Var)) {
                Map map2 = (Map) iVar.D0.get(i11);
                if (map2 != null && map2.get(r1Var) != null) {
                    throw new ClassCastException();
                }
                oVarArr[i11] = null;
            }
        }
    }

    public static void e(r rVar, i iVar, o[] oVarArr) {
        for (int i10 = 0; i10 < rVar.f47784a; i10++) {
            int i11 = rVar.f47785b[i10];
            if (iVar.E0.get(i10) || iVar.I.contains(Integer.valueOf(i11))) {
                oVarArr[i10] = null;
            }
        }
    }

    public static void f(r rVar, i iVar, o[] oVarArr) {
        o oVar;
        int i10 = rVar.f47784a;
        r1[] r1VarArr = rVar.f47786c;
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            g(r1VarArr[i11], iVar, hashMap);
        }
        g(rVar.f47787f, iVar, hashMap);
        for (int i12 = 0; i12 < i10; i12++) {
            b2.r1 r1Var = (b2.r1) hashMap.get(Integer.valueOf(rVar.f47785b[i12]));
            if (r1Var != null) {
                q1 q1Var = r1Var.f2322a;
                n0 n0Var = r1Var.f2323b;
                if (!n0Var.isEmpty() && r1VarArr[i12].b(q1Var) != -1) {
                    oVar = new o(q1Var, b8.f(n0Var));
                } else {
                    oVar = null;
                }
                oVarArr[i12] = oVar;
            }
        }
    }

    public static void g(r1 r1Var, u1 u1Var, HashMap hashMap) {
        for (int i10 = 0; i10 < r1Var.f46033a; i10++) {
            b2.r1 r1Var2 = (b2.r1) u1Var.H.get(r1Var.a(i10));
            if (r1Var2 != null) {
                q1 q1Var = r1Var2.f2322a;
                b2.r1 r1Var3 = (b2.r1) hashMap.get(Integer.valueOf(q1Var.f2297c));
                if (r1Var3 == null || (r1Var3.f2323b.isEmpty() && !r1Var2.f2323b.isEmpty())) {
                    hashMap.put(Integer.valueOf(q1Var.f2297c), r1Var2);
                }
            }
        }
    }

    public static Pair h(o[] oVarArr, int i10) {
        for (int i11 = 0; i11 < oVarArr.length; i11++) {
            o oVar = oVarArr[i11];
            if (oVar != null && oVar.f47782a.f2297c == i10) {
                return Pair.create(oVar, Integer.valueOf(i11));
            }
        }
        return null;
    }

    public static int i(x xVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(xVar.d)) {
            return 4;
        }
        String l4 = l(str);
        String l10 = l(xVar.d);
        if (l10 != null && l4 != null) {
            if (!l10.startsWith(l4) && !l4.startsWith(l10)) {
                String str2 = m0.f8375a;
                if (!l10.split("-", 2)[0].equals(l4.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        } else if (!z10 || l10 != null) {
            return 0;
        } else {
            return 1;
        }
    }

    public static String l(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "und")) {
            return str;
        }
        return null;
    }

    public static boolean n(i iVar, int i10, x xVar) {
        boolean z10;
        boolean z11;
        if ((i10 & 3584) == 0) {
            return false;
        }
        s1 s1Var = iVar.f2443w;
        if (s1Var.f2373c && (i10 & 2048) == 0) {
            return false;
        }
        if (s1Var.f2372b) {
            if (xVar.N == 0 && xVar.O == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if ((i10 & 1024) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && !z11) {
                return false;
            }
        }
        return true;
    }

    public static o o(r1 r1Var, int[][] iArr, i iVar) {
        if (iVar.f2443w.f2371a != 2) {
            int i10 = 0;
            q1 q1Var = null;
            g gVar = null;
            for (int i11 = 0; i11 < r1Var.f46033a; i11++) {
                q1 a2 = r1Var.a(i11);
                int[] iArr2 = iArr[i11];
                for (int i12 = 0; i12 < a2.f2295a; i12++) {
                    if (i2.d.e(iArr2[i12], iVar.B0)) {
                        g gVar2 = new g(a2.d[i12], iArr2[i12]);
                        if (gVar != null) {
                            if (e9.b0.f8536a.c(gVar2.f47754b, gVar.f47754b).c(gVar2.f47753a, gVar.f47753a).e() <= 0) {
                            }
                        }
                        q1Var = a2;
                        i10 = i12;
                        gVar = gVar2;
                    }
                }
            }
            if (q1Var != null) {
                return new o(q1Var, i10);
            }
        }
        return null;
    }

    public static Pair p(int i10, r rVar, int[][][] iArr, k kVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccess;
        r rVar2 = rVar;
        ArrayList arrayList = new ArrayList();
        int i12 = rVar2.f47784a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == rVar2.f47785b[i13]) {
                r1 r1Var = rVar2.f47786c[i13];
                for (int i14 = 0; i14 < r1Var.f46033a; i14++) {
                    q1 a2 = r1Var.a(i14);
                    x1 a10 = kVar.a(i13, a2, iArr[i13][i14]);
                    int i15 = a2.f2295a;
                    boolean[] zArr = new boolean[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        l lVar = (l) a10.get(i16);
                        int a11 = lVar.a();
                        if (zArr[i16] || a11 == 0) {
                            i11 = i12;
                        } else {
                            if (a11 == 1) {
                                randomAccess = n0.y(lVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(lVar);
                                int i17 = i16 + 1;
                                while (i17 < i15) {
                                    l lVar2 = (l) a10.get(i17);
                                    int i18 = i12;
                                    if (lVar2.a() == 2 && lVar.b(lVar2)) {
                                        arrayList2.add(lVar2);
                                        zArr[i17] = true;
                                    }
                                    i17++;
                                    i12 = i18;
                                }
                                randomAccess = arrayList2;
                            }
                            i11 = i12;
                            arrayList.add(randomAccess);
                        }
                        i16++;
                        i12 = i11;
                    }
                }
            }
            i13++;
            rVar2 = rVar;
            i12 = i12;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((l) list.get(i19)).f47768c;
        }
        l lVar3 = (l) list.get(0);
        return Pair.create(new o(lVar3.f47767b, iArr2), Integer.valueOf(lVar3.f47766a));
    }

    @Override
    public final void a() {
        z2.d dVar;
        boolean z10;
        synchronized (this.d) {
            try {
                Thread thread = this.h;
                if (thread != null) {
                    if (thread == Thread.currentThread()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u6.o("DefaultTrackSelector is accessed on the wrong thread.", z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.f47779i) != null) {
            dVar.e();
            this.f47779i = null;
        }
        this.f47788a = null;
        this.f47789b = null;
    }

    @Override
    public final void b(u1 u1Var) {
        if (u1Var instanceof i) {
            q((i) u1Var);
        }
        h hVar = new h(j());
        hVar.d(u1Var);
        q(new i(hVar));
    }

    public final i j() {
        i iVar;
        synchronized (this.d) {
            iVar = this.f47778g;
        }
        return iVar;
    }

    public final void k() {
        boolean z10;
        r0 r0Var;
        z2.d dVar;
        synchronized (this.d) {
            try {
                if (this.f47778g.A0 && Build.VERSION.SDK_INT >= 32 && (dVar = this.f47779i) != null && dVar.f49248b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10 && (r0Var = this.f47788a) != null) {
            r0Var.f11169n.f(10);
        }
    }

    public final void m() {
        synchronized (this.d) {
            this.f47778g.getClass();
        }
    }

    public final void q(i iVar) {
        boolean equals;
        iVar.getClass();
        synchronized (this.d) {
            equals = this.f47778g.equals(iVar);
            this.f47778g = iVar;
        }
        if (!equals) {
            if (iVar.A0 && this.e == null) {
                e2.a.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            r0 r0Var = this.f47788a;
            if (r0Var != null) {
                r0Var.f11169n.f(10);
            }
        }
    }
}
