package x2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import b2.b0;
import b2.p1;
import b2.q1;
import b2.s1;
import b2.u1;
import b2.x;
import e2.l0;
import e9.n0;
import e9.v1;
import e9.x1;
import e9.y;
import i2.s0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import org.telegram.ui.dx0;
import u2.r1;
import v7.c8;
import v7.t6;
public final class o extends t {
    public static final v1 f52959l = new y(new dx0(28));
    public final Object d;
    public final Context e;
    public final t7.u f52960f;
    public j f52961g;
    public Thread h;
    public z2.d f52962i;
    public b2.f f52963j;
    public Boolean f52964k;

    public o(Context context, t7.u uVar) {
        Context context2;
        j jVar = j.F0;
        this.d = new Object();
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.e = context2;
        this.f52960f = uVar;
        if (jVar != null) {
            this.f52961g = jVar;
        } else {
            jVar.getClass();
            i iVar = new i(jVar);
            iVar.d(jVar);
            this.f52961g = new j(iVar);
        }
        this.f52963j = b2.f.f2027i;
        if (this.f52961g.A0 && context == null) {
            e2.a.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int c(x xVar, n0 n0Var) {
        for (int i10 = 0; i10 < n0Var.size(); i10++) {
            for (int i11 = 0; i11 < xVar.f2410c.size(); i11++) {
                if (((b0) xVar.f2410c.get(i11)).f1981b.equals(n0Var.get(i10))) {
                    return i10;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void d(s sVar, j jVar, p[] pVarArr) {
        int i10 = sVar.f52967a;
        for (int i11 = 0; i11 < i10; i11++) {
            r1 r1Var = sVar.f52969c[i11];
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
        for (int i10 = 0; i10 < sVar.f52967a; i10++) {
            int i11 = sVar.f52968b[i10];
            if (jVar.E0.get(i10) || jVar.I.contains(Integer.valueOf(i11))) {
                pVarArr[i10] = null;
            }
        }
    }

    public static void f(s sVar, j jVar, p[] pVarArr) {
        p pVar;
        int i10 = sVar.f52967a;
        r1[] r1VarArr = sVar.f52969c;
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            g(r1VarArr[i11], jVar, hashMap);
        }
        g(sVar.f52970f, jVar, hashMap);
        for (int i12 = 0; i12 < i10; i12++) {
            q1 q1Var = (q1) hashMap.get(Integer.valueOf(sVar.f52968b[i12]));
            if (q1Var != null) {
                p1 p1Var = q1Var.f2196a;
                n0 n0Var = q1Var.f2197b;
                if (!n0Var.isEmpty() && r1VarArr[i12].b(p1Var) != -1) {
                    pVar = new p(p1Var, c8.f(n0Var));
                } else {
                    pVar = null;
                }
                pVarArr[i12] = pVar;
            }
        }
    }

    public static void g(r1 r1Var, u1 u1Var, HashMap hashMap) {
        for (int i10 = 0; i10 < r1Var.f50007a; i10++) {
            q1 q1Var = (q1) u1Var.H.get(r1Var.a(i10));
            if (q1Var != null) {
                p1 p1Var = q1Var.f2196a;
                q1 q1Var2 = (q1) hashMap.get(Integer.valueOf(p1Var.f2189c));
                if (q1Var2 == null || (q1Var2.f2197b.isEmpty() && !q1Var.f2197b.isEmpty())) {
                    hashMap.put(Integer.valueOf(p1Var.f2189c), q1Var);
                }
            }
        }
    }

    public static Pair h(p[] pVarArr, int i10) {
        for (int i11 = 0; i11 < pVarArr.length; i11++) {
            p pVar = pVarArr[i11];
            if (pVar != null && pVar.f52965a.f2189c == i10) {
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
                String str2 = l0.f6165a;
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
        s1 s1Var = jVar.f2343w;
        if (s1Var.f2273c && (i10 & 2048) == 0) {
            return false;
        }
        if (s1Var.f2272b) {
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
        if (jVar.f2343w.f2271a != 2) {
            int i10 = 0;
            p1 p1Var = null;
            h hVar = null;
            for (int i11 = 0; i11 < r1Var.f50007a; i11++) {
                p1 a2 = r1Var.a(i11);
                int[] iArr2 = iArr[i11];
                for (int i12 = 0; i12 < a2.f2187a; i12++) {
                    if (i0.a.b(iArr2[i12], jVar.B0)) {
                        h hVar2 = new h(a2.d[i12], iArr2[i12]);
                        if (hVar != null) {
                            if (e9.b0.f6331a.c(hVar2.f52937b, hVar.f52937b).c(hVar2.f52936a, hVar.f52936a).e() <= 0) {
                            }
                        }
                        p1Var = a2;
                        i10 = i12;
                        hVar = hVar2;
                    }
                }
            }
            if (p1Var != null) {
                return new p(p1Var, i10);
            }
        }
        return null;
    }

    public static Pair p(int i10, s sVar, int[][][] iArr, l lVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccess;
        s sVar2 = sVar;
        ArrayList arrayList = new ArrayList();
        int i12 = sVar2.f52967a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == sVar2.f52968b[i13]) {
                r1 r1Var = sVar2.f52969c[i13];
                for (int i14 = 0; i14 < r1Var.f50007a; i14++) {
                    p1 a2 = r1Var.a(i14);
                    x1 b10 = lVar.b(i13, a2, iArr[i13][i14]);
                    int i15 = a2.f2187a;
                    boolean[] zArr = new boolean[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        m mVar = (m) b10.get(i16);
                        int a10 = mVar.a();
                        if (zArr[i16] || a10 == 0) {
                            i11 = i12;
                        } else {
                            if (a10 == 1) {
                                randomAccess = n0.y(mVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(mVar);
                                int i17 = i16 + 1;
                                while (i17 < i15) {
                                    m mVar2 = (m) b10.get(i17);
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
            iArr2[i19] = ((m) list.get(i19)).f52951c;
        }
        m mVar3 = (m) list.get(0);
        return Pair.create(new p(mVar3.f52950b, iArr2), Integer.valueOf(mVar3.f52949a));
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
                    t6.o("DefaultTrackSelector is accessed on the wrong thread.", z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.f52962i) != null) {
            dVar.e();
            this.f52962i = null;
        }
        this.f52971a = null;
        this.f52972b = null;
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
            jVar = this.f52961g;
        }
        return jVar;
    }

    public final void k() {
        boolean z10;
        s0 s0Var;
        z2.d dVar;
        synchronized (this.d) {
            try {
                if (this.f52961g.A0 && Build.VERSION.SDK_INT >= 32 && (dVar = this.f52962i) != null && dVar.f54568b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10 && (s0Var = this.f52971a) != null) {
            s0Var.f8064n.f(10);
        }
    }

    public final void m() {
        synchronized (this.d) {
            this.f52961g.getClass();
        }
    }

    public final void q(j jVar) {
        boolean equals;
        jVar.getClass();
        synchronized (this.d) {
            equals = this.f52961g.equals(jVar);
            this.f52961g = jVar;
        }
        if (!equals) {
            if (jVar.A0 && this.e == null) {
                e2.a.l("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            s0 s0Var = this.f52971a;
            if (s0Var != null) {
                s0Var.f8064n.f(10);
            }
        }
    }
}
