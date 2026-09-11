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
    public final Uri f43641a;
    public final y2.m f43642b = new y2.m("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h f43643c;
    public l d;
    public long f43644e;
    public long f43645f;
    public long h;
    public long f43646n;
    public boolean f43647r;
    public IOException f43648s;
    public boolean v;
    public final c f43649w;

    public b(c cVar, Uri uri) {
        this.f43649w = cVar;
        this.f43641a = uri;
        this.f43643c = ((g2.g) cVar.f43650a.f14221b).createDataSource();
    }

    public static boolean a(b bVar, long j3) {
        bVar.f43646n = SystemClock.elapsedRealtime() + j3;
        Uri uri = bVar.f43641a;
        c cVar = bVar.f43649w;
        if (!uri.equals(cVar.v)) {
            return false;
        }
        List list = cVar.f43657s.f43739e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) cVar.d.get(((n) list.get(i10)).f43733a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.f43646n) {
                Uri uri2 = bVar2.f43641a;
                cVar.v = uri2;
                bVar2.e(cVar.b(uri2));
                return false;
            }
        }
        return true;
    }

    public final Uri b() {
        String str;
        l lVar = this.d;
        Uri uri = this.f43641a;
        if (lVar != null) {
            k kVar = lVar.v;
            if (kVar.f43709a != -9223372036854775807L || kVar.f43712e) {
                Uri.Builder buildUpon = uri.buildUpon();
                l lVar2 = this.d;
                if (lVar2.v.f43712e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(lVar2.f43718k + lVar2.f43725r.size()));
                    l lVar3 = this.d;
                    if (lVar3.f43721n != -9223372036854775807L) {
                        i0 i0Var = lVar3.f43726s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((g) e9.q.l(i0Var)).f43695x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                k kVar2 = this.d.v;
                if (kVar2.f43709a != -9223372036854775807L) {
                    if (kVar2.f43710b) {
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
            uri = this.f43641a;
        }
        e(uri);
    }

    public final void d(Uri uri) {
        c cVar = this.f43649w;
        y2.o i02 = cVar.f43651b.i0(cVar.f43657s, this.d);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.p pVar = new y2.p(this.f43643c, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, i02);
        this.f43642b.f(pVar, this, cVar.f43652c.L3(pVar.f49523c));
    }

    public final void e(Uri uri) {
        this.f43646n = 0L;
        if (!this.f43647r) {
            y2.m mVar = this.f43642b;
            if (!mVar.d() && !mVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = this.h;
                if (elapsedRealtime < j3) {
                    this.f43647r = true;
                    this.f43649w.f43655n.postDelayed(new g1(6, this, uri), j3 - elapsedRealtime);
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
    public final k4.d g(y2.j jVar, long j3, long j10, IOException iOException, int i10) {
        boolean z10;
        int i11;
        k4.d dVar;
        y2.p pVar = (y2.p) jVar;
        long j11 = pVar.f49521a;
        int i12 = pVar.f49523c;
        Uri uri = pVar.d.f10298c;
        u2.t tVar = new u2.t(j10);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof q;
        k4.d dVar2 = y2.m.f49516e;
        c cVar = this.f43649w;
        if (z10 || z11) {
            if (iOException instanceof x) {
                i11 = ((x) iOException).d;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.h = SystemClock.elapsedRealtime();
                c(false);
                a5.a aVar = cVar.f43654f;
                String str = d0.f8737a;
                aVar.q(tVar, i12, iOException, true);
                return dVar2;
            }
        }
        b0 b0Var = new b0(iOException, i10, 11);
        Iterator it = cVar.f43653e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((t) it.next()).b(this.f43641a, b0Var, false);
        }
        rb.a aVar2 = cVar.f43652c;
        if (z12) {
            aVar2.getClass();
            long M3 = rb.a.M3(b0Var);
            if (M3 != -9223372036854775807L) {
                dVar = new k4.d(0, M3, false);
            } else {
                dVar = y2.m.f49517f;
            }
            dVar2 = dVar;
        }
        boolean a2 = dVar2.a();
        cVar.f43654f.q(tVar, i12, iOException, !a2);
        if (!a2) {
            aVar2.getClass();
        }
        return dVar2;
    }

    @Override
    public final void h(y2.j jVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.p pVar = (y2.p) jVar;
        if (i10 == 0) {
            long j11 = pVar.f49521a;
            tVar = new u2.t(pVar.f49522b);
        } else {
            long j12 = pVar.f49521a;
            Uri uri = pVar.d.f10298c;
            tVar = new u2.t(j10);
        }
        this.f43649w.f43654f.r(tVar, pVar.f49523c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void i(y2.j jVar, long j3, long j10) {
        y2.p pVar = (y2.p) jVar;
        p pVar2 = (p) pVar.f49525f;
        Uri uri = pVar.d.f10298c;
        u2.t tVar = new u2.t(j10);
        if (pVar2 instanceof l) {
            f((l) pVar2, tVar);
            this.f43649w.f43654f.o(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            s0 b10 = s0.b("Loaded playlist has unexpected type.", null);
            this.f43648s = b10;
            this.f43649w.f43654f.q(tVar, 4, b10, true);
        }
        this.f43649w.f43652c.getClass();
    }

    @Override
    public final void w(y2.j jVar, long j3, long j10, boolean z10) {
        y2.p pVar = (y2.p) jVar;
        long j11 = pVar.f49521a;
        Uri uri = pVar.d.f10298c;
        u2.t tVar = new u2.t(j10);
        c cVar = this.f43649w;
        cVar.f43652c.getClass();
        cVar.f43654f.n(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
