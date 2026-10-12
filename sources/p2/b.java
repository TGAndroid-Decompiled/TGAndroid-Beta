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
import org.telegram.ui.web.f2;
public final class b implements y2.g {
    public final Uri f45051a;
    public final y2.l f45052b = new y2.l("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h f45053c;
    public l d;
    public long f45054e;
    public long f45055f;
    public long h;
    public long f45056n;
    public boolean f45057r;
    public IOException f45058s;
    public boolean v;
    public final c f45059w;

    public b(c cVar, Uri uri) {
        this.f45059w = cVar;
        this.f45051a = uri;
        this.f45053c = ((g2.g) cVar.f45060a.f16326a).createDataSource();
    }

    public static boolean a(b bVar, long j3) {
        bVar.f45056n = SystemClock.elapsedRealtime() + j3;
        Uri uri = bVar.f45051a;
        c cVar = bVar.f45059w;
        if (!uri.equals(cVar.v)) {
            return false;
        }
        List list = cVar.f45067s.f45149e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) cVar.d.get(((n) list.get(i10)).f45143a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.f45056n) {
                Uri uri2 = bVar2.f45051a;
                cVar.v = uri2;
                bVar2.e(cVar.b(uri2));
                return false;
            }
        }
        return true;
    }

    @Override
    public final void C(y2.i iVar, long j3, long j10) {
        y2.o oVar = (y2.o) iVar;
        p pVar = (p) oVar.f51935f;
        Uri uri = oVar.d.f10233c;
        u2.t tVar = new u2.t(j10);
        if (pVar instanceof l) {
            f((l) pVar, tVar);
            this.f45059w.f45064f.q(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            s0 b10 = s0.b("Loaded playlist has unexpected type.", null);
            this.f45058s = b10;
            this.f45059w.f45064f.s(tVar, 4, b10, true);
        }
        this.f45059w.f45062c.getClass();
    }

    @Override
    public final void H(y2.i iVar, long j3, long j10, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j11 = oVar.f51931a;
        Uri uri = oVar.d.f10233c;
        u2.t tVar = new u2.t(j10);
        c cVar = this.f45059w;
        cVar.f45062c.getClass();
        cVar.f45064f.p(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri b() {
        String str;
        l lVar = this.d;
        Uri uri = this.f45051a;
        if (lVar != null) {
            k kVar = lVar.v;
            if (kVar.f45119a != -9223372036854775807L || kVar.f45122e) {
                Uri.Builder buildUpon = uri.buildUpon();
                l lVar2 = this.d;
                if (lVar2.v.f45122e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(lVar2.f45128k + lVar2.f45135r.size()));
                    l lVar3 = this.d;
                    if (lVar3.f45131n != -9223372036854775807L) {
                        i0 i0Var = lVar3.f45136s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((g) e9.q.l(i0Var)).f45105x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                k kVar2 = this.d.v;
                if (kVar2.f45119a != -9223372036854775807L) {
                    if (kVar2.f45120b) {
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
            uri = this.f45051a;
        }
        e(uri);
    }

    public final void d(Uri uri) {
        c cVar = this.f45059w;
        y2.n D = cVar.f45061b.D(cVar.f45067s, this.d);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.f45053c, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, D);
        this.f45052b.f(oVar, this, cVar.f45062c.J(oVar.f51933c));
    }

    public final void e(Uri uri) {
        this.f45056n = 0L;
        if (!this.f45057r) {
            y2.l lVar = this.f45052b;
            if (!lVar.d() && !lVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = this.h;
                if (elapsedRealtime < j3) {
                    this.f45057r = true;
                    this.f45059w.f45065n.postDelayed(new f2(1, this, uri), j3 - elapsedRealtime);
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
    public final k4.d x(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        boolean z10;
        int i11;
        k4.d dVar;
        y2.o oVar = (y2.o) iVar;
        long j11 = oVar.f51931a;
        int i12 = oVar.f51933c;
        Uri uri = oVar.d.f10233c;
        u2.t tVar = new u2.t(j10);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof q;
        k4.d dVar2 = y2.l.f51926e;
        c cVar = this.f45059w;
        if (z10 || z11) {
            if (iOException instanceof x) {
                i11 = ((x) iOException).d;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.h = SystemClock.elapsedRealtime();
                c(false);
                a5.a aVar = cVar.f45064f;
                String str = d0.f8529a;
                aVar.s(tVar, i12, iOException, true);
                return dVar2;
            }
        }
        b0 b0Var = new b0(iOException, i10, 14);
        Iterator it = cVar.f45063e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((t) it.next()).b(this.f45051a, b0Var, false);
        }
        t7.t tVar2 = cVar.f45062c;
        if (z12) {
            tVar2.getClass();
            long K = t7.t.K(b0Var);
            if (K != -9223372036854775807L) {
                dVar = new k4.d(0, K, false);
            } else {
                dVar = y2.l.f51927f;
            }
            dVar2 = dVar;
        }
        boolean a2 = dVar2.a();
        cVar.f45064f.s(tVar, i12, iOException, !a2);
        if (!a2) {
            tVar2.getClass();
        }
        return dVar2;
    }

    @Override
    public final void y(y2.i iVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j11 = oVar.f51931a;
            tVar = new u2.t(oVar.f51932b);
        } else {
            long j12 = oVar.f51931a;
            Uri uri = oVar.d.f10233c;
            tVar = new u2.t(j10);
        }
        this.f45059w.f45064f.u(tVar, oVar.f51933c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }
}
