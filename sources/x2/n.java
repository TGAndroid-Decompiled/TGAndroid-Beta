package x2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import b2.a0;
import b2.p1;
import b2.q1;
import b2.r1;
import b2.w;
import e2.m0;
import e9.b0;
import e9.n0;
import e9.v1;
import e9.x1;
import e9.y;
import i2.o1;
import i2.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import org.telegram.ui.o70;
import u2.t1;
import v7.b8;
import v7.u6;
public final class n extends s {
    public static final v1 f49614l = new y(new o70(19));
    public final Object d;
    public final Context e;
    public final oa.d f49615f;
    public i f49616g;
    public Thread h;
    public z2.e f49617i;
    public b2.f f49618j;
    public Boolean f49619k;

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
        this.f49615f = dVar;
        if (iVar != null) {
            this.f49616g = iVar;
        } else {
            iVar.getClass();
            h hVar = new h(iVar);
            hVar.d(iVar);
            this.f49616g = new i(hVar);
        }
        this.f49618j = b2.f.f3744i;
        if (this.f49616g.A0 && context == null) {
            e2.a.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int c(w wVar, n0 n0Var) {
        for (int i10 = 0; i10 < n0Var.size(); i10++) {
            for (int i11 = 0; i11 < wVar.f4122c.size(); i11++) {
                if (((a0) wVar.f4122c.get(i11)).f3695b.equals(n0Var.get(i10))) {
                    return i10;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void d(r rVar, i iVar, o[] oVarArr) {
        int i10 = rVar.f49622a;
        for (int i11 = 0; i11 < i10; i11++) {
            t1 t1Var = rVar.f49624c[i11];
            Map map = (Map) iVar.D0.get(i11);
            if (map != null && map.containsKey(t1Var)) {
                Map map2 = (Map) iVar.D0.get(i11);
                if (map2 != null && map2.get(t1Var) != null) {
                    throw new ClassCastException();
                }
                oVarArr[i11] = null;
            }
        }
    }

    public static void e(r rVar, i iVar, o[] oVarArr) {
        for (int i10 = 0; i10 < rVar.f49622a; i10++) {
            int i11 = rVar.f49623b[i10];
            if (iVar.E0.get(i10) || iVar.I.contains(Integer.valueOf(i11))) {
                oVarArr[i10] = null;
            }
        }
    }

    public static void f(r rVar, i iVar, o[] oVarArr) {
        o oVar;
        int i10 = rVar.f49622a;
        t1[] t1VarArr = rVar.f49624c;
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            g(t1VarArr[i11], iVar, hashMap);
        }
        g(rVar.f49625f, iVar, hashMap);
        for (int i12 = 0; i12 < i10; i12++) {
            q1 q1Var = (q1) hashMap.get(Integer.valueOf(rVar.f49623b[i12]));
            if (q1Var != null) {
                p1 p1Var = q1Var.f3934a;
                n0 n0Var = q1Var.f3935b;
                if (!n0Var.isEmpty() && t1VarArr[i12].b(p1Var) != -1) {
                    oVar = new o(p1Var, b8.f(n0Var));
                } else {
                    oVar = null;
                }
                oVarArr[i12] = oVar;
            }
        }
    }

    public static void g(t1 t1Var, b2.t1 t1Var2, HashMap hashMap) {
        for (int i10 = 0; i10 < t1Var.f47887a; i10++) {
            q1 q1Var = (q1) t1Var2.H.get(t1Var.a(i10));
            if (q1Var != null) {
                p1 p1Var = q1Var.f3934a;
                q1 q1Var2 = (q1) hashMap.get(Integer.valueOf(p1Var.f3909c));
                if (q1Var2 == null || (q1Var2.f3935b.isEmpty() && !q1Var.f3935b.isEmpty())) {
                    hashMap.put(Integer.valueOf(p1Var.f3909c), q1Var);
                }
            }
        }
    }

    public static Pair h(o[] oVarArr, int i10) {
        for (int i11 = 0; i11 < oVarArr.length; i11++) {
            o oVar = oVarArr[i11];
            if (oVar != null && oVar.f49620a.f3909c == i10) {
                return Pair.create(oVar, Integer.valueOf(i11));
            }
        }
        return null;
    }

    public static int i(w wVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(wVar.d)) {
            return 4;
        }
        String l4 = l(str);
        String l10 = l(wVar.d);
        if (l10 != null && l4 != null) {
            if (!l10.startsWith(l4) && !l4.startsWith(l10)) {
                String str2 = m0.f8259a;
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

    public static boolean n(i iVar, int i10, w wVar) {
        boolean z10;
        boolean z11;
        if ((i10 & 3584) == 0) {
            return false;
        }
        r1 r1Var = iVar.f4055w;
        if (r1Var.f3985c && (i10 & 2048) == 0) {
            return false;
        }
        if (r1Var.f3984b) {
            if (wVar.N == 0 && wVar.O == 0) {
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

    public static o o(t1 t1Var, int[][] iArr, i iVar) {
        if (iVar.f4055w.f3983a != 2) {
            int i10 = 0;
            p1 p1Var = null;
            g gVar = null;
            for (int i11 = 0; i11 < t1Var.f47887a; i11++) {
                p1 a2 = t1Var.a(i11);
                int[] iArr2 = iArr[i11];
                for (int i12 = 0; i12 < a2.f3907a; i12++) {
                    if (o1.e(iArr2[i12], iVar.B0)) {
                        g gVar2 = new g(a2.d[i12], iArr2[i12]);
                        if (gVar != null) {
                            if (b0.f8422a.c(gVar2.f49592b, gVar.f49592b).c(gVar2.f49591a, gVar.f49591a).e() <= 0) {
                            }
                        }
                        p1Var = a2;
                        i10 = i12;
                        gVar = gVar2;
                    }
                }
            }
            if (p1Var != null) {
                return new o(p1Var, i10);
            }
        }
        return null;
    }

    public static Pair p(int i10, r rVar, int[][][] iArr, k kVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccess;
        r rVar2 = rVar;
        ArrayList arrayList = new ArrayList();
        int i12 = rVar2.f49622a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == rVar2.f49623b[i13]) {
                t1 t1Var = rVar2.f49624c[i13];
                for (int i14 = 0; i14 < t1Var.f47887a; i14++) {
                    p1 a2 = t1Var.a(i14);
                    x1 b10 = kVar.b(i13, a2, iArr[i13][i14]);
                    int i15 = a2.f3907a;
                    boolean[] zArr = new boolean[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        l lVar = (l) b10.get(i16);
                        int a10 = lVar.a();
                        if (zArr[i16] || a10 == 0) {
                            i11 = i12;
                        } else {
                            if (a10 == 1) {
                                randomAccess = n0.y(lVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(lVar);
                                int i17 = i16 + 1;
                                while (i17 < i15) {
                                    l lVar2 = (l) b10.get(i17);
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
            iArr2[i19] = ((l) list.get(i19)).f49606c;
        }
        l lVar3 = (l) list.get(0);
        return Pair.create(new o(lVar3.f49605b, iArr2), Integer.valueOf(lVar3.f49604a));
    }

    @Override
    public final void a() {
        z2.e eVar;
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
        if (Build.VERSION.SDK_INT >= 32 && (eVar = this.f49617i) != null) {
            eVar.e();
            this.f49617i = null;
        }
        this.f49626a = null;
        this.f49627b = null;
    }

    @Override
    public final void b(b2.t1 t1Var) {
        if (t1Var instanceof i) {
            q((i) t1Var);
        }
        h hVar = new h(j());
        hVar.d(t1Var);
        q(new i(hVar));
    }

    public final i j() {
        i iVar;
        synchronized (this.d) {
            iVar = this.f49616g;
        }
        return iVar;
    }

    public final void k() {
        boolean z10;
        q0 q0Var;
        z2.e eVar;
        synchronized (this.d) {
            try {
                if (this.f49616g.A0 && Build.VERSION.SDK_INT >= 32 && (eVar = this.f49617i) != null && eVar.f51101b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10 && (q0Var = this.f49626a) != null) {
            q0Var.f12583n.f(10);
        }
    }

    public final void m() {
        synchronized (this.d) {
            this.f49616g.getClass();
        }
    }

    public final void q(i iVar) {
        boolean equals;
        iVar.getClass();
        synchronized (this.d) {
            equals = this.f49616g.equals(iVar);
            this.f49616g = iVar;
        }
        if (!equals) {
            if (iVar.A0 && this.e == null) {
                e2.a.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            q0 q0Var = this.f49626a;
            if (q0Var != null) {
                q0Var.f12583n.f(10);
            }
        }
    }
}
