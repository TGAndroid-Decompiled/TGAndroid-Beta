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
    public final Uri f43668a;
    public final y2.m f43669b = new y2.m("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h f43670c;
    public l d;
    public long f43671e;
    public long f43672f;
    public long h;
    public long f43673n;
    public boolean f43674r;
    public IOException f43675s;
    public boolean v;
    public final c f43676w;

    public b(c cVar, Uri uri) {
        this.f43676w = cVar;
        this.f43668a = uri;
        this.f43670c = ((g2.g) cVar.f43677a.f14247b).createDataSource();
    }

    public static boolean a(b bVar, long j3) {
        bVar.f43673n = SystemClock.elapsedRealtime() + j3;
        Uri uri = bVar.f43668a;
        c cVar = bVar.f43676w;
        if (!uri.equals(cVar.v)) {
            return false;
        }
        List list = cVar.f43684s.f43766e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) cVar.d.get(((n) list.get(i10)).f43760a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.f43673n) {
                Uri uri2 = bVar2.f43668a;
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
        Uri uri = this.f43668a;
        if (lVar != null) {
            k kVar = lVar.v;
            if (kVar.f43736a != -9223372036854775807L || kVar.f43739e) {
                Uri.Builder buildUpon = uri.buildUpon();
                l lVar2 = this.d;
                if (lVar2.v.f43739e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(lVar2.f43745k + lVar2.f43752r.size()));
                    l lVar3 = this.d;
                    if (lVar3.f43748n != -9223372036854775807L) {
                        i0 i0Var = lVar3.f43753s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((g) e9.q.l(i0Var)).f43722x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                k kVar2 = this.d.v;
                if (kVar2.f43736a != -9223372036854775807L) {
                    if (kVar2.f43737b) {
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
            uri = this.f43668a;
        }
        e(uri);
    }

    public final void d(Uri uri) {
        c cVar = this.f43676w;
        y2.o i02 = cVar.f43678b.i0(cVar.f43684s, this.d);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.p pVar = new y2.p(this.f43670c, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, i02);
        this.f43669b.f(pVar, this, cVar.f43679c.L3(pVar.f49552c));
    }

    public final void e(Uri uri) {
        this.f43673n = 0L;
        if (!this.f43674r) {
            y2.m mVar = this.f43669b;
            if (!mVar.d() && !mVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = this.h;
                if (elapsedRealtime < j3) {
                    this.f43674r = true;
                    this.f43676w.f43682n.postDelayed(new g1(6, this, uri), j3 - elapsedRealtime);
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
        long j11 = pVar.f49550a;
        int i12 = pVar.f49552c;
        Uri uri = pVar.d.f10326c;
        u2.t tVar = new u2.t(j10);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof q;
        k4.d dVar2 = y2.m.f49545e;
        c cVar = this.f43676w;
        if (z10 || z11) {
            if (iOException instanceof x) {
                i11 = ((x) iOException).d;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.h = SystemClock.elapsedRealtime();
                c(false);
                a5.a aVar = cVar.f43681f;
                String str = d0.f8765a;
                aVar.q(tVar, i12, iOException, true);
                return dVar2;
            }
        }
        b0 b0Var = new b0(iOException, i10, 11);
        Iterator it = cVar.f43680e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((t) it.next()).b(this.f43668a, b0Var, false);
        }
        rb.a aVar2 = cVar.f43679c;
        if (z12) {
            aVar2.getClass();
            long M3 = rb.a.M3(b0Var);
            if (M3 != -9223372036854775807L) {
                dVar = new k4.d(0, M3, false);
            } else {
                dVar = y2.m.f49546f;
            }
            dVar2 = dVar;
        }
        boolean a2 = dVar2.a();
        cVar.f43681f.q(tVar, i12, iOException, !a2);
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
            long j11 = pVar.f49550a;
            tVar = new u2.t(pVar.f49551b);
        } else {
            long j12 = pVar.f49550a;
            Uri uri = pVar.d.f10326c;
            tVar = new u2.t(j10);
        }
        this.f43676w.f43681f.r(tVar, pVar.f49552c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void i(y2.j jVar, long j3, long j10) {
        y2.p pVar = (y2.p) jVar;
        p pVar2 = (p) pVar.f49554f;
        Uri uri = pVar.d.f10326c;
        u2.t tVar = new u2.t(j10);
        if (pVar2 instanceof l) {
            f((l) pVar2, tVar);
            this.f43676w.f43681f.o(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            s0 b10 = s0.b("Loaded playlist has unexpected type.", null);
            this.f43675s = b10;
            this.f43676w.f43681f.q(tVar, 4, b10, true);
        }
        this.f43676w.f43679c.getClass();
    }

    @Override
    public final void w(y2.j jVar, long j3, long j10, boolean z10) {
        y2.p pVar = (y2.p) jVar;
        long j11 = pVar.f49550a;
        Uri uri = pVar.d.f10326c;
        u2.t tVar = new u2.t(j10);
        c cVar = this.f43676w;
        cVar.f43679c.getClass();
        cVar.f43681f.n(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
