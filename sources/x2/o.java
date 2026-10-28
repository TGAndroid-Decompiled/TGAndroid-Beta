package x2;

import a8.ed;
import a8.yb;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import b2.b0;
import b2.s1;
import b2.u1;
import b2.x;
import c3.h0;
import e2.n0;
import f9.i0;
import f9.q1;
import f9.w;
import i2.s0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import org.telegram.ui.dv;
import u2.r1;
public final class o extends t {
    public static final q1 f51404l = new f9.t(new dv(22));
    public final Object d;
    public final Context e;
    public final qb.a f51405f;
    public j f51406g;
    public Thread h;
    public z2.d f51407i;
    public b2.f f51408j;
    public Boolean f51409k;

    public o(Context context, qb.a aVar) {
        Context context2;
        j jVar = j.F0;
        this.d = new Object();
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.e = context2;
        this.f51405f = aVar;
        if (jVar != null) {
            this.f51406g = jVar;
        } else {
            jVar.getClass();
            i iVar = new i(jVar);
            iVar.d(jVar);
            this.f51406g = new j(iVar);
        }
        this.f51408j = b2.f.f3180i;
        if (this.f51406g.A0 && context == null) {
            e2.a.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int c(x xVar, i0 i0Var) {
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            for (int i11 = 0; i11 < xVar.f3573c.size(); i11++) {
                if (((b0) xVar.f3573c.get(i11)).f3145b.equals(i0Var.get(i10))) {
                    return i10;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void d(s sVar, j jVar, p[] pVarArr) {
        int i10 = sVar.f51412a;
        for (int i11 = 0; i11 < i10; i11++) {
            r1 r1Var = sVar.f51414c[i11];
            Map map = (Map) jVar.D0.get(i11);
            if (map != null && map.containsKey(r1Var)) {
                Map map2 = (Map) jVar.D0.get(i11);
                if (map2 != null && map2.get(r1Var) != null) {
                    throw new ClassCastException();
                }
                pVarArr[i11] = null;
            }
        }
    }

    public static void e(s sVar, j jVar, p[] pVarArr) {
        for (int i10 = 0; i10 < sVar.f51412a; i10++) {
            int i11 = sVar.f51413b[i10];
            if (jVar.E0.get(i10) || jVar.I.contains(Integer.valueOf(i11))) {
                pVarArr[i10] = null;
            }
        }
    }

    public static void f(s sVar, j jVar, p[] pVarArr) {
        p pVar;
        int i10 = sVar.f51412a;
        r1[] r1VarArr = sVar.f51414c;
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            g(r1VarArr[i11], jVar, hashMap);
        }
        g(sVar.f51415f, jVar, hashMap);
        for (int i12 = 0; i12 < i10; i12++) {
            b2.r1 r1Var = (b2.r1) hashMap.get(Integer.valueOf(sVar.f51413b[i12]));
            if (r1Var != null) {
                b2.q1 q1Var = r1Var.f3385a;
                i0 i0Var = r1Var.f3386b;
                if (!i0Var.isEmpty() && r1VarArr[i12].b(q1Var) != -1) {
                    pVar = new p(q1Var, ed.f(i0Var));
                } else {
                    pVar = null;
                }
                pVarArr[i12] = pVar;
            }
        }
    }

    public static void g(r1 r1Var, u1 u1Var, HashMap hashMap) {
        for (int i10 = 0; i10 < r1Var.f49450a; i10++) {
            b2.r1 r1Var2 = (b2.r1) u1Var.H.get(r1Var.a(i10));
            if (r1Var2 != null) {
                b2.q1 q1Var = r1Var2.f3385a;
                b2.r1 r1Var3 = (b2.r1) hashMap.get(Integer.valueOf(q1Var.f3360c));
                if (r1Var3 == null || (r1Var3.f3386b.isEmpty() && !r1Var2.f3386b.isEmpty())) {
                    hashMap.put(Integer.valueOf(q1Var.f3360c), r1Var2);
                }
            }
        }
    }

    public static Pair h(p[] pVarArr, int i10) {
        for (int i11 = 0; i11 < pVarArr.length; i11++) {
            p pVar = pVarArr[i11];
            if (pVar != null && pVar.f51410a.f3360c == i10) {
                return Pair.create(pVar, Integer.valueOf(i11));
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
                String str2 = n0.f9691a;
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

    public static boolean n(j jVar, int i10, x xVar) {
        boolean z10;
        boolean z11;
        if ((i10 & 3584) == 0) {
            return false;
        }
        s1 s1Var = jVar.f3506w;
        if (s1Var.f3436c && (i10 & 2048) == 0) {
            return false;
        }
        if (s1Var.f3435b) {
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

    public static p o(r1 r1Var, int[][] iArr, j jVar) {
        if (jVar.f3506w.f3434a != 2) {
            int i10 = 0;
            b2.q1 q1Var = null;
            h hVar = null;
            for (int i11 = 0; i11 < r1Var.f49450a; i11++) {
                b2.q1 a2 = r1Var.a(i11);
                int[] iArr2 = iArr[i11];
                for (int i12 = 0; i12 < a2.f3358a; i12++) {
                    if (h0.e(iArr2[i12], jVar.B0)) {
                        h hVar2 = new h(a2.d[i12], iArr2[i12]);
                        if (hVar != null) {
                            if (w.f10351a.c(hVar2.f51382b, hVar.f51382b).c(hVar2.f51381a, hVar.f51381a).e() <= 0) {
                            }
                        }
                        q1Var = a2;
                        i10 = i12;
                        hVar = hVar2;
                    }
                }
            }
            if (q1Var != null) {
                return new p(q1Var, i10);
            }
        }
        return null;
    }

    public static Pair p(int i10, s sVar, int[][][] iArr, l lVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccess;
        s sVar2 = sVar;
        ArrayList arrayList = new ArrayList();
        int i12 = sVar2.f51412a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == sVar2.f51413b[i13]) {
                r1 r1Var = sVar2.f51414c[i13];
                for (int i14 = 0; i14 < r1Var.f49450a; i14++) {
                    b2.q1 a2 = r1Var.a(i14);
                    f9.s1 a10 = lVar.a(i13, a2, iArr[i13][i14]);
                    int i15 = a2.f3358a;
                    boolean[] zArr = new boolean[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        m mVar = (m) a10.get(i16);
                        int a11 = mVar.a();
                        if (zArr[i16] || a11 == 0) {
                            i11 = i12;
                        } else {
                            if (a11 == 1) {
                                randomAccess = i0.y(mVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(mVar);
                                int i17 = i16 + 1;
                                while (i17 < i15) {
                                    m mVar2 = (m) a10.get(i17);
                                    int i18 = i12;
                                    if (mVar2.a() == 2 && mVar.b(mVar2)) {
                                        arrayList2.add(mVar2);
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
            sVar2 = sVar;
            i12 = i12;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((m) list.get(i19)).f51396c;
        }
        m mVar3 = (m) list.get(0);
        return Pair.create(new p(mVar3.f51395b, iArr2), Integer.valueOf(mVar3.f51394a));
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
                    yb.o("DefaultTrackSelector is accessed on the wrong thread.", z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.f51407i) != null) {
            dVar.e();
            this.f51407i = null;
        }
        this.f51416a = null;
        this.f51417b = null;
    }

    @Override
    public final void b(u1 u1Var) {
        if (u1Var instanceof j) {
            q((j) u1Var);
        }
        i iVar = new i(j());
        iVar.d(u1Var);
        q(new j(iVar));
    }

    public final j j() {
        j jVar;
        synchronized (this.d) {
            jVar = this.f51406g;
        }
        return jVar;
    }

    public final void k() {
        boolean z10;
        s0 s0Var;
        z2.d dVar;
        synchronized (this.d) {
            try {
                if (this.f51406g.A0 && Build.VERSION.SDK_INT >= 32 && (dVar = this.f51407i) != null && dVar.f52698b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10 && (s0Var = this.f51416a) != null) {
            s0Var.f13743n.f(10);
        }
    }

    public final void m() {
        synchronized (this.d) {
            this.f51406g.getClass();
        }
    }

    public final void q(j jVar) {
        boolean equals;
        jVar.getClass();
        synchronized (this.d) {
            equals = this.f51406g.equals(jVar);
            this.f51406g = jVar;
        }
        if (!equals) {
            if (jVar.A0 && this.e == null) {
                e2.a.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            s0 s0Var = this.f51416a;
            if (s0Var != null) {
                s0Var.f13743n.f(10);
            }
        }
    }
}
