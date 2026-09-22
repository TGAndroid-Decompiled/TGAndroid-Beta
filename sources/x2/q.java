package x2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import b2.l1;
import b2.m1;
import b2.o1;
import b2.q1;
import e2.d0;
import e9.a1;
import e9.i0;
import e9.y0;
import i2.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import org.telegram.ui.mb1;
import u2.p1;
public final class q extends v {
    public static final y0 f45520l = new e9.w(new mb1(11));
    public final Object d;
    public final Context e;
    public final qb.b f45521f;
    public j f45522g;
    public Thread h;
    public l f45523i;
    public b2.e f45524j;
    public Boolean f45525k;

    public q(Context context, qb.b bVar) {
        Context context2;
        j jVar = j.f45488x0;
        this.d = new Object();
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.e = context2;
        this.f45521f = bVar;
        if (jVar != null) {
            this.f45522g = jVar;
        } else {
            jVar.getClass();
            i iVar = new i(jVar);
            iVar.d(jVar);
            this.f45522g = new j(iVar);
        }
        this.f45524j = b2.e.h;
        if (this.f45522g.f45495s0 && context == null) {
            e2.a.n("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void c(p1 p1Var, j jVar, HashMap hashMap) {
        for (int i10 = 0; i10 < p1Var.f43786a; i10++) {
            m1 m1Var = (m1) jVar.D.get(p1Var.a(i10));
            if (m1Var != null) {
                l1 l1Var = m1Var.f3117a;
                m1 m1Var2 = (m1) hashMap.get(Integer.valueOf(l1Var.f3092c));
                if (m1Var2 == null || (m1Var2.f3118b.isEmpty() && !m1Var.f3118b.isEmpty())) {
                    hashMap.put(Integer.valueOf(l1Var.f3092c), m1Var);
                }
            }
        }
    }

    public static int d(b2.s sVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(sVar.d)) {
            return 4;
        }
        String g10 = g(str);
        String g11 = g(sVar.d);
        if (g11 != null && g10 != null) {
            if (!g11.startsWith(g10) && !g10.startsWith(g11)) {
                String str2 = d0.f7887a;
                if (!g11.split("-", 2)[0].equals(g10.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        } else if (!z10 || g11 != null) {
            return 0;
        } else {
            return 1;
        }
    }

    public static String g(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "und")) {
            return str;
        }
        return null;
    }

    public static boolean i(j jVar, int i10, b2.s sVar) {
        boolean z10;
        boolean z11;
        if ((i10 & 3584) == 0) {
            return false;
        }
        o1 o1Var = jVar.f3234u;
        if (o1Var.f3173c && (i10 & 2048) == 0) {
            return false;
        }
        if (o1Var.f3172b) {
            if (sVar.M == 0 && sVar.N == 0) {
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

    public static Pair j(int i10, u uVar, int[][][] iArr, n nVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccess;
        u uVar2 = uVar;
        ArrayList arrayList = new ArrayList();
        int i12 = uVar2.f45528a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == uVar2.f45529b[i13]) {
                p1 p1Var = uVar2.f45530c[i13];
                for (int i14 = 0; i14 < p1Var.f43786a; i14++) {
                    l1 a2 = p1Var.a(i14);
                    a1 b10 = nVar.b(i13, a2, iArr[i13][i14]);
                    int i15 = a2.f3090a;
                    boolean[] zArr = new boolean[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        o oVar = (o) b10.get(i16);
                        int a10 = oVar.a();
                        if (zArr[i16] || a10 == 0) {
                            i11 = i12;
                        } else {
                            if (a10 == 1) {
                                randomAccess = i0.z(oVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(oVar);
                                int i17 = i16 + 1;
                                while (i17 < i15) {
                                    o oVar2 = (o) b10.get(i17);
                                    int i18 = i12;
                                    if (oVar2.a() == 2 && oVar.b(oVar2)) {
                                        arrayList2.add(oVar2);
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
            uVar2 = uVar;
            i12 = i12;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((o) list.get(i19)).f45512c;
        }
        o oVar3 = (o) list.get(0);
        return Pair.create(new r(oVar3.f45511b, iArr2), Integer.valueOf(oVar3.f45510a));
    }

    @Override
    public final void a() {
        l lVar;
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
                    e2.d.f("DefaultTrackSelector is accessed on the wrong thread.", z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (lVar = this.f45523i) != null) {
            lVar.d();
            this.f45523i = null;
        }
        this.f45532a = null;
        this.f45533b = null;
    }

    @Override
    public final void b(q1 q1Var) {
        if (q1Var instanceof j) {
            k((j) q1Var);
        }
        i iVar = new i(e());
        iVar.d(q1Var);
        k(new j(iVar));
    }

    public final j e() {
        j jVar;
        synchronized (this.d) {
            jVar = this.f45522g;
        }
        return jVar;
    }

    public final void f() {
        boolean z10;
        o0 o0Var;
        l lVar;
        synchronized (this.d) {
            try {
                if (this.f45522g.f45495s0 && Build.VERSION.SDK_INT >= 32 && (lVar = this.f45523i) != null && lVar.f45502b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10 && (o0Var = this.f45532a) != null) {
            o0Var.f10823n.e(10);
        }
    }

    public final void h() {
        synchronized (this.d) {
            this.f45522g.getClass();
        }
    }

    public final void k(j jVar) {
        boolean equals;
        jVar.getClass();
        synchronized (this.d) {
            equals = this.f45522g.equals(jVar);
            this.f45522g = jVar;
        }
        if (!equals) {
            if (jVar.f45495s0 && this.e == null) {
                e2.a.n("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            o0 o0Var = this.f45532a;
            if (o0Var != null) {
                o0Var.f10823n.e(10);
            }
        }
    }
}
