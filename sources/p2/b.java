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
import org.telegram.ui.web.w1;
public final class b implements y2.g {
    public final Uri f45163a;
    public final y2.l f45164b = new y2.l("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h f45165c;
    public l d;
    public long f45166e;
    public long f45167f;
    public long h;
    public long f45168n;
    public boolean f45169r;
    public IOException f45170s;
    public boolean v;
    public final c f45171w;

    public b(c cVar, Uri uri) {
        this.f45171w = cVar;
        this.f45163a = uri;
        this.f45165c = ((g2.g) cVar.f45172a.f15972b).createDataSource();
    }

    public static boolean a(b bVar, long j3) {
        bVar.f45168n = SystemClock.elapsedRealtime() + j3;
        Uri uri = bVar.f45163a;
        c cVar = bVar.f45171w;
        if (!uri.equals(cVar.v)) {
            return false;
        }
        List list = cVar.f45179s.f45261e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) cVar.d.get(((n) list.get(i10)).f45255a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.f45168n) {
                Uri uri2 = bVar2.f45163a;
                cVar.v = uri2;
                bVar2.e(cVar.b(uri2));
                return false;
            }
        }
        return true;
    }

    @Override
    public final void C(y2.i iVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j11 = oVar.f51699a;
            tVar = new u2.t(oVar.f51700b);
        } else {
            long j12 = oVar.f51699a;
            Uri uri = oVar.d.f10235c;
            tVar = new u2.t(j10);
        }
        this.f45171w.f45176f.u(tVar, oVar.f51701c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void F(y2.i iVar, long j3, long j10) {
        y2.o oVar = (y2.o) iVar;
        p pVar = (p) oVar.f51703f;
        Uri uri = oVar.d.f10235c;
        u2.t tVar = new u2.t(j10);
        if (pVar instanceof l) {
            f((l) pVar, tVar);
            this.f45171w.f45176f.q(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            s0 b10 = s0.b("Loaded playlist has unexpected type.", null);
            this.f45170s = b10;
            this.f45171w.f45176f.s(tVar, 4, b10, true);
        }
        this.f45171w.f45174c.getClass();
    }

    @Override
    public final void O0(y2.i iVar, long j3, long j10, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j11 = oVar.f51699a;
        Uri uri = oVar.d.f10235c;
        u2.t tVar = new u2.t(j10);
        c cVar = this.f45171w;
        cVar.f45174c.getClass();
        cVar.f45176f.p(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri b() {
        String str;
        l lVar = this.d;
        Uri uri = this.f45163a;
        if (lVar != null) {
            k kVar = lVar.v;
            if (kVar.f45231a != -9223372036854775807L || kVar.f45234e) {
                Uri.Builder buildUpon = uri.buildUpon();
                l lVar2 = this.d;
                if (lVar2.v.f45234e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(lVar2.f45240k + lVar2.f45247r.size()));
                    l lVar3 = this.d;
                    if (lVar3.f45243n != -9223372036854775807L) {
                        i0 i0Var = lVar3.f45248s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((g) e9.q.l(i0Var)).f45217x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                k kVar2 = this.d.v;
                if (kVar2.f45231a != -9223372036854775807L) {
                    if (kVar2.f45232b) {
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
            uri = this.f45163a;
        }
        e(uri);
    }

    public final void d(Uri uri) {
        c cVar = this.f45171w;
        y2.n y3 = cVar.f45173b.y(cVar.f45179s, this.d);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.f45165c, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, y3);
        this.f45164b.f(oVar, this, cVar.f45174c.m3(oVar.f51701c));
    }

    public final void e(Uri uri) {
        this.f45168n = 0L;
        if (!this.f45169r) {
            y2.l lVar = this.f45164b;
            if (!lVar.d() && !lVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = this.h;
                if (elapsedRealtime < j3) {
                    this.f45169r = true;
                    this.f45171w.f45177n.postDelayed(new w1(3, this, uri), j3 - elapsedRealtime);
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
    public final k4.d y(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        boolean z10;
        int i11;
        k4.d dVar;
        y2.o oVar = (y2.o) iVar;
        long j11 = oVar.f51699a;
        int i12 = oVar.f51701c;
        Uri uri = oVar.d.f10235c;
        u2.t tVar = new u2.t(j10);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof q;
        k4.d dVar2 = y2.l.f51694e;
        c cVar = this.f45171w;
        if (z10 || z11) {
            if (iOException instanceof x) {
                i11 = ((x) iOException).d;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.h = SystemClock.elapsedRealtime();
                c(false);
                a5.a aVar = cVar.f45176f;
                String str = d0.f8532a;
                aVar.s(tVar, i12, iOException, true);
                return dVar2;
            }
        }
        b0 b0Var = new b0(iOException, i10, 15);
        Iterator it = cVar.f45175e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((t) it.next()).b(this.f45163a, b0Var, false);
        }
        rb.a aVar2 = cVar.f45174c;
        if (z12) {
            aVar2.getClass();
            long n32 = rb.a.n3(b0Var);
            if (n32 != -9223372036854775807L) {
                dVar = new k4.d(0, n32, false);
            } else {
                dVar = y2.l.f51695f;
            }
            dVar2 = dVar;
        }
        boolean a2 = dVar2.a();
        cVar.f45176f.s(tVar, i12, iOException, !a2);
        if (!a2) {
            aVar2.getClass();
        }
        return dVar2;
    }
}
