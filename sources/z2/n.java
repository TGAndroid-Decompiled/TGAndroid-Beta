package z2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import b8.od;
import b8.zb;
import d2.o1;
import d2.p1;
import d2.s1;
import d2.v;
import d2.z;
import g2.n0;
import g9.i0;
import g9.q1;
import g9.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import k2.r0;
import vg.i1;
import w2.r1;
public final class n extends s {
    public static final q1 f59629l = new g9.t(new i1(3));
    public final Object d;
    public final Context f59630e;
    public final ra.e f59631f;
    public i f59632g;
    public Thread h;
    public b3.d f59633i;
    public d2.f f59634j;
    public Boolean f59635k;

    public n(Context context, ra.e eVar) {
        Context context2;
        i iVar = i.F0;
        this.d = new Object();
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.f59630e = context2;
        this.f59631f = eVar;
        if (iVar != null) {
            this.f59632g = iVar;
        } else {
            iVar.getClass();
            h hVar = new h(iVar);
            hVar.d(iVar);
            this.f59632g = new i(hVar);
        }
        this.f59634j = d2.f.f8079i;
        if (this.f59632g.A0 && context == null) {
            g2.a.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int c(v vVar, i0 i0Var) {
        for (int i3 = 0; i3 < i0Var.size(); i3++) {
            for (int i10 = 0; i10 < vVar.f8475c.size(); i10++) {
                if (((z) vVar.f8475c.get(i10)).f8523b.equals(i0Var.get(i3))) {
                    return i3;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void d(r rVar, i iVar, o[] oVarArr) {
        int i3 = rVar.f59638a;
        for (int i10 = 0; i10 < i3; i10++) {
            r1 r1Var = rVar.f59640c[i10];
            Map map = (Map) iVar.D0.get(i10);
            if (map != null && map.containsKey(r1Var)) {
                Map map2 = (Map) iVar.D0.get(i10);
                if (map2 != null && map2.get(r1Var) != null) {
                    throw new ClassCastException();
                }
                oVarArr[i10] = null;
            }
        }
    }

    public static void e(r rVar, i iVar, o[] oVarArr) {
        for (int i3 = 0; i3 < rVar.f59638a; i3++) {
            int i10 = rVar.f59639b[i3];
            if (iVar.E0.get(i3) || iVar.I.contains(Integer.valueOf(i10))) {
                oVarArr[i3] = null;
            }
        }
    }

    public static void f(r rVar, i iVar, o[] oVarArr) {
        o oVar;
        int i3 = rVar.f59638a;
        r1[] r1VarArr = rVar.f59640c;
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < i3; i10++) {
            g(r1VarArr[i10], iVar, hashMap);
        }
        g(rVar.f59642f, iVar, hashMap);
        for (int i11 = 0; i11 < i3; i11++) {
            p1 p1Var = (p1) hashMap.get(Integer.valueOf(rVar.f59639b[i11]));
            if (p1Var != null) {
                o1 o1Var = p1Var.f8284a;
                i0 i0Var = p1Var.f8285b;
                if (!i0Var.isEmpty() && r1VarArr[i11].b(o1Var) != -1) {
                    oVar = new o(o1Var, od.f(i0Var));
                } else {
                    oVar = null;
                }
                oVarArr[i11] = oVar;
            }
        }
    }

    public static void g(r1 r1Var, s1 s1Var, HashMap hashMap) {
        for (int i3 = 0; i3 < r1Var.f57206a; i3++) {
            p1 p1Var = (p1) s1Var.H.get(r1Var.a(i3));
            if (p1Var != null) {
                o1 o1Var = p1Var.f8284a;
                p1 p1Var2 = (p1) hashMap.get(Integer.valueOf(o1Var.f8254c));
                if (p1Var2 == null || (p1Var2.f8285b.isEmpty() && !p1Var.f8285b.isEmpty())) {
                    hashMap.put(Integer.valueOf(o1Var.f8254c), p1Var);
                }
            }
        }
    }

    public static Pair h(o[] oVarArr, int i3) {
        for (int i10 = 0; i10 < oVarArr.length; i10++) {
            o oVar = oVarArr[i10];
            if (oVar != null && oVar.f59636a.f8254c == i3) {
                return Pair.create(oVar, Integer.valueOf(i10));
            }
        }
        return null;
    }

    public static int i(v vVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(vVar.d)) {
            return 4;
        }
        String l10 = l(str);
        String l11 = l(vVar.d);
        if (l11 != null && l10 != null) {
            if (!l11.startsWith(l10) && !l10.startsWith(l11)) {
                String str2 = n0.f11873a;
                if (!l11.split("-", 2)[0].equals(l10.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        } else if (!z10 || l11 != null) {
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

    public static boolean n(i iVar, int i3, v vVar) {
        boolean z10;
        boolean z11;
        if ((i3 & 3584) == 0) {
            return false;
        }
        d2.q1 q1Var = iVar.f8408w;
        if (q1Var.f8335c && (i3 & 2048) == 0) {
            return false;
        }
        if (q1Var.f8334b) {
            if (vVar.N == 0 && vVar.O == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if ((i3 & 1024) != 0) {
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
        if (iVar.f8408w.f8333a != 2) {
            int i3 = 0;
            o1 o1Var = null;
            g gVar = null;
            for (int i10 = 0; i10 < r1Var.f57206a; i10++) {
                o1 a10 = r1Var.a(i10);
                int[] iArr2 = iArr[i10];
                for (int i11 = 0; i11 < a10.f8252a; i11++) {
                    if (k2.p1.b(iArr2[i11], iVar.B0)) {
                        g gVar2 = new g(a10.d[i11], iArr2[i11]);
                        if (gVar != null) {
                            if (w.f12160a.c(gVar2.f59605b, gVar.f59605b).c(gVar2.f59604a, gVar.f59604a).e() <= 0) {
                            }
                        }
                        o1Var = a10;
                        i3 = i11;
                        gVar = gVar2;
                    }
                }
            }
            if (o1Var != null) {
                return new o(o1Var, i3);
            }
        }
        return null;
    }

    public static Pair p(int i3, r rVar, int[][][] iArr, k kVar, Comparator comparator) {
        int i10;
        RandomAccess randomAccess;
        r rVar2 = rVar;
        ArrayList arrayList = new ArrayList();
        int i11 = rVar2.f59638a;
        int i12 = 0;
        while (i12 < i11) {
            if (i3 == rVar2.f59639b[i12]) {
                r1 r1Var = rVar2.f59640c[i12];
                for (int i13 = 0; i13 < r1Var.f57206a; i13++) {
                    o1 a10 = r1Var.a(i13);
                    g9.s1 c2 = kVar.c(i12, a10, iArr[i12][i13]);
                    int i14 = a10.f8252a;
                    boolean[] zArr = new boolean[i14];
                    int i15 = 0;
                    while (i15 < i14) {
                        l lVar = (l) c2.get(i15);
                        int a11 = lVar.a();
                        if (zArr[i15] || a11 == 0) {
                            i10 = i11;
                        } else {
                            if (a11 == 1) {
                                randomAccess = i0.u(lVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(lVar);
                                int i16 = i15 + 1;
                                while (i16 < i14) {
                                    l lVar2 = (l) c2.get(i16);
                                    int i17 = i11;
                                    if (lVar2.a() == 2 && lVar.b(lVar2)) {
                                        arrayList2.add(lVar2);
                                        zArr[i16] = true;
                                    }
                                    i16++;
                                    i11 = i17;
                                }
                                randomAccess = arrayList2;
                            }
                            i10 = i11;
                            arrayList.add(randomAccess);
                        }
                        i15++;
                        i11 = i10;
                    }
                }
            }
            i12++;
            rVar2 = rVar;
            i11 = i11;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i18 = 0; i18 < list.size(); i18++) {
            iArr2[i18] = ((l) list.get(i18)).f59620c;
        }
        l lVar3 = (l) list.get(0);
        return Pair.create(new o(lVar3.f59619b, iArr2), Integer.valueOf(lVar3.f59618a));
    }

    @Override
    public final void a() {
        b3.d dVar;
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
                    zb.o("DefaultTrackSelector is accessed on the wrong thread.", z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.f59633i) != null) {
            dVar.e();
            this.f59633i = null;
        }
        this.f59643a = null;
        this.f59644b = null;
    }

    @Override
    public final void b(s1 s1Var) {
        if (s1Var instanceof i) {
            q((i) s1Var);
        }
        h hVar = new h(j());
        hVar.d(s1Var);
        q(new i(hVar));
    }

    public final i j() {
        i iVar;
        synchronized (this.d) {
            iVar = this.f59632g;
        }
        return iVar;
    }

    public final void k() {
        boolean z10;
        r0 r0Var;
        b3.d dVar;
        synchronized (this.d) {
            try {
                if (this.f59632g.A0 && Build.VERSION.SDK_INT >= 32 && (dVar = this.f59633i) != null && dVar.f2350b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10 && (r0Var = this.f59643a) != null) {
            r0Var.f16705n.f(10);
        }
    }

    public final void m() {
        synchronized (this.d) {
            this.f59632g.getClass();
        }
    }

    public final void q(i iVar) {
        boolean equals;
        iVar.getClass();
        synchronized (this.d) {
            equals = this.f59632g.equals(iVar);
            this.f59632g = iVar;
        }
        if (!equals) {
            if (iVar.A0 && this.f59630e == null) {
                g2.a.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            r0 r0Var = this.f59643a;
            if (r0Var != null) {
                r0Var.f16705n.f(10);
            }
        }
    }
}
