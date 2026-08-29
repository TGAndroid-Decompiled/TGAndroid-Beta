package q4;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.upstream.y0;
import f5.d0;
import i7.p7;
import j$.util.DesugarCollections;
import j3.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l4.j1;
import nh.d6;
import q8.l0;
import q8.x;
import q8.z;
public final class i {
    public final j f46265a;
    public final com.google.android.exoplayer2.upstream.m f46266b;
    public final com.google.android.exoplayer2.upstream.m f46267c;
    public final d6 d;
    public final Uri[] f46268e;
    public final t0[] f46269f;
    public final r4.c f46270g;
    public final j1 h;
    public final List f46271i;
    public final k3.k f46273k;
    public boolean f46274l;
    public l4.b f46276n;
    public Uri f46277o;
    public boolean f46278p;
    public d5.r f46279q;
    public boolean f46281s;
    public final o4.g f46272j = new o4.g(12);
    public byte[] f46275m = d0.f6583f;
    public long f46280r = -9223372036854775807L;

    public i(j jVar, r4.c cVar, Uri[] uriArr, t0[] t0VarArr, o1.a aVar, y0 y0Var, d6 d6Var, List list, k3.k kVar) {
        this.f46265a = jVar;
        this.f46270g = cVar;
        this.f46268e = uriArr;
        this.f46269f = t0VarArr;
        this.d = d6Var;
        this.f46271i = list;
        this.f46273k = kVar;
        com.google.android.exoplayer2.upstream.m createDataSource = ((com.google.android.exoplayer2.upstream.l) aVar.f19014b).createDataSource();
        this.f46266b = createDataSource;
        if (y0Var != null) {
            createDataSource.addTransferListener(y0Var);
        }
        this.f46267c = ((com.google.android.exoplayer2.upstream.l) aVar.f19014b).createDataSource();
        this.h = new j1("", t0VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((t0VarArr[i10].f10800e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        j1 j1Var = this.h;
        int[] e10 = p7.e(arrayList);
        ?? cVar2 = new d5.c(j1Var, e10);
        cVar2.f46261g = cVar2.m(j1Var.d[e10[0]]);
        this.f46279q = cVar2;
    }

    public final n4.l[] a(k kVar, long j10) {
        int a2;
        boolean z10;
        List list;
        i iVar = this;
        k kVar2 = kVar;
        if (kVar2 == null) {
            a2 = -1;
        } else {
            a2 = iVar.h.a(kVar2.d);
        }
        int length = iVar.f46279q.length();
        n4.l[] lVarArr = new n4.l[length];
        boolean z11 = false;
        int i10 = 0;
        while (i10 < length) {
            int i11 = iVar.f46279q.i(i10);
            Uri uri = iVar.f46268e[i11];
            r4.c cVar = iVar.f46270g;
            if (!cVar.c(uri)) {
                lVarArr[i10] = n4.l.f17153p;
            } else {
                r4.j a10 = cVar.a(uri, z11);
                a10.getClass();
                long j11 = a10.h - cVar.f46954y;
                if (i11 != a2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Pair c3 = iVar.c(kVar2, z10, a10, j11, j10);
                long longValue = ((Long) c3.first).longValue();
                int intValue = ((Integer) c3.second).intValue();
                long j12 = a10.f46979k;
                z zVar = a10.f46987s;
                z zVar2 = a10.f46986r;
                int i12 = (int) (longValue - j12);
                if (i12 >= 0 && zVar2.size() >= i12) {
                    ArrayList arrayList = new ArrayList();
                    if (i12 < zVar2.size()) {
                        if (intValue != -1) {
                            r4.g gVar = (r4.g) zVar2.get(i12);
                            if (intValue == 0) {
                                arrayList.add(gVar);
                            } else if (intValue < gVar.f46961x.size()) {
                                z zVar3 = gVar.f46961x;
                                arrayList.addAll(zVar3.subList(intValue, zVar3.size()));
                            }
                            i12++;
                        }
                        arrayList.addAll(zVar2.subList(i12, zVar2.size()));
                        intValue = 0;
                    }
                    if (a10.f46982n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < zVar.size()) {
                            arrayList.addAll(zVar.subList(intValue, zVar.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                } else {
                    x xVar = z.f46511b;
                    list = l0.f46462e;
                }
                lVarArr[i10] = new f(j11, list);
            }
            i10++;
            iVar = this;
            kVar2 = kVar;
            z11 = false;
        }
        return lVarArr;
    }

    public final int b(k kVar) {
        z zVar;
        int i10 = kVar.A;
        if (i10 != -1) {
            r4.j a2 = this.f46270g.a(this.f46268e[this.h.a(kVar.d)], false);
            a2.getClass();
            z zVar2 = a2.f46986r;
            int i11 = (int) (kVar.f17152s - a2.f46979k);
            if (i11 >= 0) {
                if (i11 < zVar2.size()) {
                    zVar = ((r4.g) zVar2.get(i11)).f46961x;
                } else {
                    zVar = a2.f46987s;
                }
                if (i10 < zVar.size()) {
                    r4.e eVar = (r4.e) zVar.get(i10);
                    if (eVar.f46956x) {
                        return 0;
                    }
                    if (d0.a(Uri.parse(f5.a.G(a2.f47007a, eVar.f46962a)), kVar.f17128b.f3599a)) {
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

    public final Pair c(k kVar, boolean z10, r4.j jVar, long j10, long j11) {
        z zVar;
        long j12;
        boolean z11 = true;
        int i10 = -1;
        if (kVar != null) {
            long j13 = kVar.f17152s;
            int i11 = kVar.A;
            if (!z10) {
                if (kVar.T) {
                    if (i11 == -1) {
                        j13 = kVar.b();
                    }
                    Long valueOf = Long.valueOf(j13);
                    if (i11 != -1) {
                        i10 = i11 + 1;
                    }
                    return new Pair(valueOf, Integer.valueOf(i10));
                }
                return new Pair(Long.valueOf(j13), Integer.valueOf(i11));
            }
        }
        long j14 = jVar.f46989u;
        z zVar2 = jVar.f46987s;
        long j15 = jVar.f46979k;
        z zVar3 = jVar.f46986r;
        long j16 = j14 + j10;
        if (kVar != null && !this.f46278p) {
            j11 = kVar.h;
        }
        if (!jVar.f46983o && j11 >= j16) {
            return new Pair(Long.valueOf(j15 + zVar3.size()), -1);
        }
        long j17 = j11 - j10;
        Long valueOf2 = Long.valueOf(j17);
        int i12 = 0;
        if (this.f46270g.f46953x && kVar != null) {
            z11 = false;
        }
        int c3 = d0.c(zVar3, valueOf2, z11);
        long j18 = c3 + j15;
        if (c3 >= 0) {
            r4.g gVar = (r4.g) zVar3.get(c3);
            if (j17 < gVar.f46965e + gVar.f46964c) {
                zVar = gVar.f46961x;
            } else {
                zVar = zVar2;
            }
            while (true) {
                if (i12 >= zVar.size()) {
                    break;
                }
                r4.e eVar = (r4.e) zVar.get(i12);
                if (j17 < eVar.f46965e + eVar.f46964c) {
                    if (eVar.f46955w) {
                        if (zVar == zVar2) {
                            j12 = 1;
                        } else {
                            j12 = 0;
                        }
                        j18 += j12;
                        i10 = i12;
                    }
                } else {
                    i12++;
                }
            }
        }
        return new Pair(Long.valueOf(j18), Integer.valueOf(i10));
    }

    public final e d(Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        o4.g gVar = this.f46272j;
        byte[] bArr = (byte[]) ((d) gVar.f19159b).remove(uri);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((d) gVar.f19159b).put(uri, bArr);
            return null;
        }
        com.google.android.exoplayer2.upstream.q qVar = new com.google.android.exoplayer2.upstream.q(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        t0 t0Var = this.f46269f[i10];
        int o10 = this.f46279q.o();
        Object r6 = this.f46279q.r();
        byte[] bArr3 = this.f46275m;
        ?? eVar = new n4.e(this.f46267c, qVar, 3, t0Var, o10, r6, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = d0.f6583f;
        }
        eVar.f46258s = bArr3;
        return eVar;
    }
}
