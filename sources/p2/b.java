package p2;

import android.net.Uri;
import android.os.SystemClock;
import b2.s0;
import c5.b0;
import e2.d0;
import e9.i0;
import g2.x;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.ui.web.g1;
public final class b implements y2.h {
    public final Uri f40693a;
    public final y2.m f40694b = new y2.m("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h f40695c;
    public l d;
    public long e;
    public long f40696f;
    public long h;
    public long f40697n;
    public boolean f40698r;
    public IOException f40699s;
    public boolean v;
    public final c f40700w;

    public b(c cVar, Uri uri) {
        this.f40700w = cVar;
        this.f40693a = uri;
        this.f40695c = ((g2.g) cVar.f40701a.f13898a).createDataSource();
    }

    public static boolean a(b bVar, long j3) {
        bVar.f40697n = SystemClock.elapsedRealtime() + j3;
        Uri uri = bVar.f40693a;
        c cVar = bVar.f40700w;
        if (!uri.equals(cVar.v)) {
            return false;
        }
        List list = cVar.f40707s.e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) cVar.d.get(((n) list.get(i10)).f40778a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.f40697n) {
                Uri uri2 = bVar2.f40693a;
                cVar.v = uri2;
                bVar2.e(cVar.b(uri2));
                return false;
            }
        }
        return true;
    }

    @Override
    public final void F(y2.j jVar, long j3, long j10, boolean z10) {
        y2.p pVar = (y2.p) jVar;
        long j11 = pVar.f46600a;
        Uri uri = pVar.d.f9352c;
        u2.t tVar = new u2.t(j10);
        c cVar = this.f40700w;
        cVar.f40703c.getClass();
        cVar.f40704f.o(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri b() {
        String str;
        l lVar = this.d;
        Uri uri = this.f40693a;
        if (lVar != null) {
            k kVar = lVar.v;
            if (kVar.f40756a != -9223372036854775807L || kVar.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                l lVar2 = this.d;
                if (lVar2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(lVar2.f40763k + lVar2.f40770r.size()));
                    l lVar3 = this.d;
                    if (lVar3.f40766n != -9223372036854775807L) {
                        i0 i0Var = lVar3.f40771s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((g) e9.q.l(i0Var)).f40743x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                k kVar2 = this.d.v;
                if (kVar2.f40756a != -9223372036854775807L) {
                    if (kVar2.f40757b) {
                        str = "v2";
                    } else {
                        str = "YES";
                    }
                    buildUpon.appendQueryParameter("_HLS_skip", str);
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z10) {
        Uri uri;
        if (z10) {
            uri = b();
        } else {
            uri = this.f40693a;
        }
        e(uri);
    }

    public final void d(Uri uri) {
        c cVar = this.f40700w;
        y2.o K = cVar.f40702b.K(cVar.f40707s, this.d);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.p pVar = new y2.p(this.f40695c, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, K);
        this.f40694b.f(pVar, this, cVar.f40703c.L3(pVar.f46602c));
    }

    public final void e(Uri uri) {
        this.f40697n = 0L;
        if (!this.f40698r) {
            y2.m mVar = this.f40694b;
            if (!mVar.d() && !mVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = this.h;
                if (elapsedRealtime < j3) {
                    this.f40698r = true;
                    this.f40700w.f40705n.postDelayed(new g1(6, this, uri), j3 - elapsedRealtime);
                    return;
                }
                d(uri);
            }
        }
    }

    public final void f(p2.l r73, u2.t r74) {
        throw new UnsupportedOperationException("Method not decompiled: p2.b.f(p2.l, u2.t):void");
    }

    @Override
    public final k4.d m(y2.j jVar, long j3, long j10, IOException iOException, int i10) {
        boolean z10;
        int i11;
        k4.d dVar;
        y2.p pVar = (y2.p) jVar;
        long j11 = pVar.f46600a;
        int i12 = pVar.f46602c;
        Uri uri = pVar.d.f9352c;
        u2.t tVar = new u2.t(j10);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof q;
        k4.d dVar2 = y2.m.e;
        c cVar = this.f40700w;
        if (z10 || z11) {
            if (iOException instanceof x) {
                i11 = ((x) iOException).d;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.h = SystemClock.elapsedRealtime();
                c(false);
                a5.a aVar = cVar.f40704f;
                String str = d0.f7888a;
                aVar.r(tVar, i12, iOException, true);
                return dVar2;
            }
        }
        b0 b0Var = new b0(iOException, i10, 11);
        Iterator it = cVar.e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((t) it.next()).b(this.f40693a, b0Var, false);
        }
        qb.b bVar = cVar.f40703c;
        if (z12) {
            bVar.getClass();
            long M3 = qb.b.M3(b0Var);
            if (M3 != -9223372036854775807L) {
                dVar = new k4.d(0, M3, false);
            } else {
                dVar = y2.m.f46596f;
            }
            dVar2 = dVar;
        }
        boolean a2 = dVar2.a();
        cVar.f40704f.r(tVar, i12, iOException, !a2);
        if (!a2) {
            bVar.getClass();
        }
        return dVar2;
    }

    @Override
    public final void n(y2.j jVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.p pVar = (y2.p) jVar;
        if (i10 == 0) {
            long j11 = pVar.f46600a;
            tVar = new u2.t(pVar.f46601b);
        } else {
            long j12 = pVar.f46600a;
            Uri uri = pVar.d.f9352c;
            tVar = new u2.t(j10);
        }
        this.f40700w.f40704f.s(tVar, pVar.f46602c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void o(y2.j jVar, long j3, long j10) {
        y2.p pVar = (y2.p) jVar;
        p pVar2 = (p) pVar.f46603f;
        Uri uri = pVar.d.f9352c;
        u2.t tVar = new u2.t(j10);
        if (pVar2 instanceof l) {
            f((l) pVar2, tVar);
            this.f40700w.f40704f.p(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            s0 b10 = s0.b("Loaded playlist has unexpected type.", null);
            this.f40699s = b10;
            this.f40700w.f40704f.r(tVar, 4, b10, true);
        }
        this.f40700w.f40703c.getClass();
    }
}
