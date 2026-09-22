package x2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import b2.l1;
import b2.m1;
import b2.q1;
import e2.d0;
import e9.a1;
import e9.i0;
import e9.w;
import e9.y0;
import i2.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import org.telegram.ui.kb1;
import u2.o1;
public final class p extends u {
    public static final y0 f45199l = new w(new kb1(11));
    public final Object d;
    public final Context e;
    public final qb.b f45200f;
    public i f45201g;
    public Thread h;
    public k f45202i;
    public b2.e f45203j;
    public Boolean f45204k;

    public p(Context context, qb.b bVar) {
        Context context2;
        i iVar = i.f45167x0;
        this.d = new Object();
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.e = context2;
        this.f45200f = bVar;
        if (iVar != null) {
            this.f45201g = iVar;
        } else {
            iVar.getClass();
            h hVar = new h(iVar);
            hVar.d(iVar);
            this.f45201g = new i(hVar);
        }
        this.f45203j = b2.e.h;
        if (this.f45201g.f45174s0 && context == null) {
            e2.a.n("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void c(o1 o1Var, i iVar, HashMap hashMap) {
        for (int i10 = 0; i10 < o1Var.f43453a; i10++) {
            m1 m1Var = (m1) iVar.D.get(o1Var.a(i10));
            if (m1Var != null) {
                l1 l1Var = m1Var.f3115a;
                m1 m1Var2 = (m1) hashMap.get(Integer.valueOf(l1Var.f3090c));
                if (m1Var2 == null || (m1Var2.f3116b.isEmpty() && !m1Var.f3116b.isEmpty())) {
                    hashMap.put(Integer.valueOf(l1Var.f3090c), m1Var);
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
                String str2 = d0.f7885a;
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
        b2.o1 o1Var = iVar.f3232u;
        if (o1Var.f3171c && (i10 & 2048) == 0) {
            return false;
        }
        if (o1Var.f3170b) {
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
        int i12 = tVar2.f45207a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == tVar2.f45208b[i13]) {
                o1 o1Var = tVar2.f45209c[i13];
                for (int i14 = 0; i14 < o1Var.f43453a; i14++) {
                    l1 a2 = o1Var.a(i14);
                    a1 b10 = mVar.b(i13, a2, iArr[i13][i14]);
                    int i15 = a2.f3088a;
                    boolean[] zArr = new boolean[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        n nVar = (n) b10.get(i16);
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
                                    n nVar2 = (n) b10.get(i17);
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
            iArr2[i19] = ((n) list.get(i19)).f45191c;
        }
        n nVar3 = (n) list.get(0);
        return Pair.create(new q(nVar3.f45190b, iArr2), Integer.valueOf(nVar3.f45189a));
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
        if (Build.VERSION.SDK_INT >= 32 && (kVar = this.f45202i) != null) {
            kVar.d();
            this.f45202i = null;
        }
        this.f45211a = null;
        this.f45212b = null;
    }

    @Override
    public final void b(q1 q1Var) {
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
            iVar = this.f45201g;
        }
        return iVar;
    }

    public final void f() {
        boolean z10;
        o0 o0Var;
        k kVar;
        synchronized (this.d) {
            try {
                if (this.f45201g.f45174s0 && Build.VERSION.SDK_INT >= 32 && (kVar = this.f45202i) != null && kVar.f45181b) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10 && (o0Var = this.f45211a) != null) {
            o0Var.f10821n.e(10);
        }
    }

    public final void h() {
        synchronized (this.d) {
            this.f45201g.getClass();
        }
    }

    public final void k(i iVar) {
        boolean equals;
        iVar.getClass();
        synchronized (this.d) {
            equals = this.f45201g.equals(iVar);
            this.f45201g = iVar;
        }
        if (!equals) {
            if (iVar.f45174s0 && this.e == null) {
                e2.a.n("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            o0 o0Var = this.f45211a;
            if (o0Var != null) {
                o0Var.f10821n.e(10);
            }
        }
    }
}
