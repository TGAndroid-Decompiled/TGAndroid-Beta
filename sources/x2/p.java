package x2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import b2.l1;
import b2.m1;
import b2.o1;
import e2.d0;
import e9.a1;
import e9.i0;
import e9.w;
import e9.y0;
import i2.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import u2.q1;
public final class p extends u {
    public static final y0 f44543l = new w(new sg.p(4));
    public final Object d;
    public final Context e;
    public final t7.u f44544f;
    public i f44545g;
    public Thread h;
    public k f44546i;
    public b2.e f44547j;
    public Boolean f44548k;

    public p(Context context, t7.u uVar) {
        Context context2;
        i iVar = i.f44511x0;
        this.d = new Object();
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.e = context2;
        this.f44544f = uVar;
        if (iVar != null) {
            this.f44545g = iVar;
        } else {
            iVar.getClass();
            h hVar = new h(iVar);
            hVar.d(iVar);
            this.f44545g = new i(hVar);
        }
        this.f44547j = b2.e.h;
        if (this.f44545g.f44518s0 && context == null) {
            e2.a.n("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void c(q1 q1Var, i iVar, HashMap hashMap) {
        for (int i10 = 0; i10 < q1Var.f42436a; i10++) {
            m1 m1Var = (m1) iVar.D.get(q1Var.a(i10));
            if (m1Var != null) {
                l1 l1Var = m1Var.f1811a;
                m1 m1Var2 = (m1) hashMap.get(Integer.valueOf(l1Var.f1786c));
                if (m1Var2 == null || (m1Var2.f1812b.isEmpty() && !m1Var.f1812b.isEmpty())) {
                    hashMap.put(Integer.valueOf(l1Var.f1786c), m1Var);
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
                String str2 = d0.f7188a;
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

    public static boolean i(i iVar, int i10, b2.s sVar) {
        boolean z10;
        boolean z11;
        if ((i10 & 3584) == 0) {
            return false;
        }
        o1 o1Var = iVar.f1928u;
        if (o1Var.f1867c && (i10 & 2048) == 0) {
            return false;
        }
        if (o1Var.f1866b) {
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

    public static Pair j(int i10, t tVar, int[][][] iArr, m mVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccess;
        t tVar2 = tVar;
        ArrayList arrayList = new ArrayList();
        int i12 = tVar2.f44551a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == tVar2.f44552b[i13]) {
                q1 q1Var = tVar2.f44553c[i13];
                for (int i14 = 0; i14 < q1Var.f42436a; i14++) {
                    l1 a2 = q1Var.a(i14);
                    a1 e = mVar.e(i13, a2, iArr[i13][i14]);
                    int i15 = a2.f1784a;
                    boolean[] zArr = new boolean[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        n nVar = (n) e.get(i16);
                        int a10 = nVar.a();
                        if (zArr[i16] || a10 == 0) {
                            i11 = i12;
                        } else {
                            if (a10 == 1) {
                                randomAccess = i0.z(nVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nVar);
                                int i17 = i16 + 1;
                                while (i17 < i15) {
                                    n nVar2 = (n) e.get(i17);
                                    int i18 = i12;
                                    if (nVar2.a() == 2 && nVar.b(nVar2)) {
                                        arrayList2.add(nVar2);
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
            tVar2 = tVar;
            i12 = i12;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((n) list.get(i19)).f44535c;
        }
        n nVar3 = (n) list.get(0);
        return Pair.create(new q(nVar3.f44534b, iArr2), Integer.valueOf(nVar3.f44533a));
    }

    @Override
    public final void a() {
        k kVar;
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
        if (Build.VERSION.SDK_INT >= 32 && (kVar = this.f44546i) != null) {
            kVar.d();
            this.f44546i = null;
        }
        this.f44555a = null;
        this.f44556b = null;
    }

    @Override
    public final void b(b2.q1 q1Var) {
        if (q1Var instanceof i) {
            k((i) q1Var);
        }
        h hVar = new h(e());
        hVar.d(q1Var);
        k(new i(hVar));
    }

    public final i e() {
        i iVar;
        synchronized (this.d) {
            iVar = this.f44545g;
        }
        return iVar;
    }

    public final void f() {
        boolean z10;
        n0 n0Var;
        k kVar;
        synchronized (this.d) {
            try {
                if (this.f44545g.f44518s0 && Build.VERSION.SDK_INT >= 32 && (kVar = this.f44546i) != null && kVar.f44525b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10 && (n0Var = this.f44555a) != null) {
            n0Var.f10298n.e(10);
        }
    }

    public final void h() {
        synchronized (this.d) {
            this.f44545g.getClass();
        }
    }

    public final void k(i iVar) {
        boolean equals;
        iVar.getClass();
        synchronized (this.d) {
            equals = this.f44545g.equals(iVar);
            this.f44545g = iVar;
        }
        if (!equals) {
            if (iVar.f44518s0 && this.e == null) {
                e2.a.n("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            n0 n0Var = this.f44555a;
            if (n0Var != null) {
                n0Var.f10298n.e(10);
            }
        }
    }
}
