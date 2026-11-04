package q2;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import b8.od;
import d2.o1;
import d2.v;
import g2.n0;
import g9.g0;
import g9.g2;
import g9.i0;
import g9.s1;
import g9.t0;
import i2.d0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.y00;
import r2.w;
public final class i {
    public final c f53683a;
    public final i2.h f53684b;
    public final i2.h f53685c;
    public final i9 d;
    public final w[] f53686e;
    public final v[] f53687f;
    public final r2.d f53688g;
    public final o1 h;
    public final List f53689i;
    public final l2.k f53691k;
    public boolean f53692l;
    public w2.b f53694n;
    public Uri f53695o;
    public Uri f53696p;
    public boolean f53697q;
    public z2.p f53698r;
    public final y00 f53690j = new y00(10);
    public byte[] f53693m = n0.f11874b;
    public long f53699s = -9223372036854775807L;

    public i(c cVar, r2.d dVar, w[] wVarArr, v[] vVarArr, i9 i9Var, d0 d0Var, i9 i9Var2, List list, l2.k kVar) {
        this.f53683a = cVar;
        this.f53688g = dVar;
        this.f53686e = wVarArr;
        this.f53687f = vVarArr;
        this.d = i9Var2;
        this.f53689i = list;
        this.f53691k = kVar;
        i2.h createDataSource = ((i2.g) i9Var.f34636b).createDataSource();
        this.f53684b = createDataSource;
        if (d0Var != null) {
            createDataSource.addTransferListener(d0Var);
        }
        this.f53685c = ((i2.g) i9Var.f34636b).createDataSource();
        this.h = new o1("", vVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < wVarArr.length; i3++) {
            if ((vVarArr[i3].f8477f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        o1 o1Var = this.h;
        int[] f10 = od.f(arrayList);
        ?? cVar2 = new z2.c(o1Var, f10);
        cVar2.f53679g = cVar2.e(o1Var.d[f10[0]]);
        this.f53698r = cVar2;
    }

    public static h f(r2.m mVar, long j10, int i3) {
        long j11 = mVar.f54158k;
        i0 i0Var = mVar.f54166s;
        int i10 = (int) (j10 - j11);
        i0 i0Var2 = mVar.f54165r;
        if (i10 == i0Var2.size()) {
            if (i3 == -1) {
                i3 = 0;
            }
            if (i3 < i0Var.size()) {
                return new h((r2.k) i0Var.get(i3), j10, i3);
            }
            return null;
        }
        r2.j jVar = (r2.j) i0Var2.get(i10);
        if (i3 == -1) {
            return new h(jVar, j10, -1);
        }
        if (i3 < jVar.f54139y.size()) {
            return new h((r2.k) jVar.f54139y.get(i3), j10, i3);
        }
        int i11 = i10 + 1;
        if (i11 < i0Var2.size()) {
            return new h((r2.k) i0Var2.get(i11), j10 + 1, -1);
        }
        if (!i0Var.isEmpty()) {
            return new h((r2.k) i0Var.get(0), j10 + 1, 0);
        }
        return null;
    }

    public final a3.h a(Uri uri) {
        w wVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        r2.d dVar = this.f53688g;
        r2.c cVar = (r2.c) dVar.d.get(uri);
        if (cVar != null) {
            wVar = cVar.f54080a;
        } else {
            wVar = null;
        }
        wVar.getClass();
        HashMap hashMap = wVar.f54232b;
        int size = hashMap.size();
        g2 it = t0.q(hashMap.values()).iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Uri uri2 = (Uri) it.next();
            r2.c cVar2 = (r2.c) dVar.d.get(uri2);
            if (cVar2 != null) {
                r2.b bVar = (r2.b) f1.p(cVar2.f54081b, uri2, uri2);
                bVar.getClass();
                if (elapsedRealtime <= bVar.f54075r) {
                    i3++;
                }
            }
        }
        return new a3.h(size, i3, this.f53698r.length(), d(elapsedRealtime));
    }

    public final x2.m[] b(j jVar, long j10) {
        int a10;
        boolean z10;
        List list;
        i iVar = this;
        j jVar2 = jVar;
        if (jVar2 == null) {
            a10 = -1;
        } else {
            a10 = iVar.h.a(jVar2.d);
        }
        int length = iVar.f53698r.length();
        x2.m[] mVarArr = new x2.m[length];
        boolean z11 = false;
        int i3 = 0;
        while (i3 < length) {
            int i10 = iVar.f53698r.i(i3);
            Uri c2 = iVar.f53686e[i10].c();
            r2.d dVar = iVar.f53688g;
            if (!dVar.f(c2)) {
                mVarArr[i3] = x2.m.B;
            } else {
                r2.m b10 = dVar.b(c2, z11);
                b10.getClass();
                long j11 = b10.h - dVar.J;
                if (i10 != a10) {
                    z10 = true;
                } else {
                    z10 = z11;
                }
                Pair e10 = iVar.e(jVar2, z10, b10, j11, j10);
                long longValue = ((Long) e10.first).longValue();
                int intValue = ((Integer) e10.second).intValue();
                long j12 = b10.f54158k;
                i0 i0Var = b10.f54166s;
                i0 i0Var2 = b10.f54165r;
                int i11 = (int) (longValue - j12);
                if (i11 >= 0 && i0Var2.size() >= i11) {
                    ArrayList arrayList = new ArrayList();
                    if (i11 < i0Var2.size()) {
                        if (intValue != -1) {
                            r2.j jVar3 = (r2.j) i0Var2.get(i11);
                            if (intValue == 0) {
                                arrayList.add(jVar3);
                            } else if (intValue < jVar3.f54139y.size()) {
                                i0 i0Var3 = jVar3.f54139y;
                                arrayList.addAll(i0Var3.subList(intValue, i0Var3.size()));
                            }
                            i11++;
                        }
                        arrayList.addAll(i0Var2.subList(i11, i0Var2.size()));
                        intValue = 0;
                    }
                    if (b10.f54161n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < i0Var.size()) {
                            arrayList.addAll(i0Var.subList(intValue, i0Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                } else {
                    g0 g0Var = i0.f12083b;
                    list = s1.f12146e;
                }
                mVarArr[i3] = new f(j11, list);
            }
            i3++;
            iVar = this;
            jVar2 = jVar;
            z11 = false;
        }
        return mVarArr;
    }

    public final int c(j jVar) {
        i0 i0Var;
        int i3 = jVar.F;
        if (i3 != -1) {
            r2.m b10 = this.f53688g.b(jVar.f53706y, false);
            b10.getClass();
            i0 i0Var2 = b10.f54165r;
            int i10 = (int) (jVar.f58174s - b10.f54158k);
            if (i10 >= 0) {
                if (i10 < i0Var2.size()) {
                    i0Var = ((r2.j) i0Var2.get(i10)).f54139y;
                } else {
                    i0Var = b10.f54166s;
                }
                if (i3 < i0Var.size()) {
                    r2.h hVar = (r2.h) i0Var.get(i3);
                    if (hVar.f54134y) {
                        return 0;
                    }
                    if (Objects.equals(Uri.parse(g2.f.f(b10.f54189a, hVar.f54140a)), jVar.f58149b.f14564a)) {
                        return 1;
                    }
                    return 2;
                }
                return 2;
            }
            return 1;
        }
        return 1;
    }

    public final int d(long j10) {
        z2.p pVar = this.f53698r;
        int length = pVar.length();
        int i3 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = pVar.i(i10);
            if (!pVar.a(i10, j10)) {
                if (!this.f53688g.e(this.f53686e[i11], j10)) {
                }
            }
            i3++;
        }
        return i3;
    }

    public final android.util.Pair e(q2.j r17, boolean r18, r2.m r19, long r20, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: q2.i.e(q2.j, boolean, r2.m, long, long):android.util.Pair");
    }

    public final e g(Uri uri, int i3, boolean z10) {
        if (uri == null) {
            return null;
        }
        y00 y00Var = this.f53690j;
        byte[] bArr = (byte[]) ((d) y00Var.f40562a).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((d) y00Var.f40562a).put(uri, bArr);
            return null;
        }
        i2.n nVar = new i2.n(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        v vVar = this.f53687f[i3];
        int o10 = this.f53698r.o();
        Object r5 = this.f53698r.r();
        byte[] bArr3 = this.f53693m;
        ?? fVar = new x2.f(this.f53685c, nVar, 3, vVar, o10, r5, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = n0.f11874b;
        }
        fVar.f53675s = bArr3;
        return fVar;
    }
}
