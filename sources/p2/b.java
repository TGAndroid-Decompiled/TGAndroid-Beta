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
    public final Uri f45197a;
    public final y2.l f45198b = new y2.l("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h f45199c;
    public l d;
    public long f45200e;
    public long f45201f;
    public long h;
    public long f45202n;
    public boolean f45203r;
    public IOException f45204s;
    public boolean v;
    public final c f45205w;

    public b(c cVar, Uri uri) {
        this.f45205w = cVar;
        this.f45197a = uri;
        this.f45199c = ((g2.g) cVar.f45206a.f15997b).createDataSource();
    }

    public static boolean a(b bVar, long j3) {
        bVar.f45202n = SystemClock.elapsedRealtime() + j3;
        Uri uri = bVar.f45197a;
        c cVar = bVar.f45205w;
        if (!uri.equals(cVar.v)) {
            return false;
        }
        List list = cVar.f45213s.f45295e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) cVar.d.get(((n) list.get(i10)).f45289a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.f45202n) {
                Uri uri2 = bVar2.f45197a;
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
            long j11 = oVar.f51786a;
            tVar = new u2.t(oVar.f51787b);
        } else {
            long j12 = oVar.f51786a;
            Uri uri = oVar.d.f10234c;
            tVar = new u2.t(j10);
        }
        this.f45205w.f45210f.u(tVar, oVar.f51788c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void F(y2.i iVar, long j3, long j10) {
        y2.o oVar = (y2.o) iVar;
        p pVar = (p) oVar.f51790f;
        Uri uri = oVar.d.f10234c;
        u2.t tVar = new u2.t(j10);
        if (pVar instanceof l) {
            f((l) pVar, tVar);
            this.f45205w.f45210f.q(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            s0 b10 = s0.b("Loaded playlist has unexpected type.", null);
            this.f45204s = b10;
            this.f45205w.f45210f.s(tVar, 4, b10, true);
        }
        this.f45205w.f45208c.getClass();
    }

    @Override
    public final void O0(y2.i iVar, long j3, long j10, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j11 = oVar.f51786a;
        Uri uri = oVar.d.f10234c;
        u2.t tVar = new u2.t(j10);
        c cVar = this.f45205w;
        cVar.f45208c.getClass();
        cVar.f45210f.p(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri b() {
        String str;
        l lVar = this.d;
        Uri uri = this.f45197a;
        if (lVar != null) {
            k kVar = lVar.v;
            if (kVar.f45265a != -9223372036854775807L || kVar.f45268e) {
                Uri.Builder buildUpon = uri.buildUpon();
                l lVar2 = this.d;
                if (lVar2.v.f45268e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(lVar2.f45274k + lVar2.f45281r.size()));
                    l lVar3 = this.d;
                    if (lVar3.f45277n != -9223372036854775807L) {
                        i0 i0Var = lVar3.f45282s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((g) e9.q.l(i0Var)).f45251x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                k kVar2 = this.d.v;
                if (kVar2.f45265a != -9223372036854775807L) {
                    if (kVar2.f45266b) {
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
            uri = this.f45197a;
        }
        e(uri);
    }

    public final void d(Uri uri) {
        c cVar = this.f45205w;
        y2.n y3 = cVar.f45207b.y(cVar.f45213s, this.d);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.f45199c, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, y3);
        this.f45198b.f(oVar, this, cVar.f45208c.m3(oVar.f51788c));
    }

    public final void e(Uri uri) {
        this.f45202n = 0L;
        if (!this.f45203r) {
            y2.l lVar = this.f45198b;
            if (!lVar.d() && !lVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = this.h;
                if (elapsedRealtime < j3) {
                    this.f45203r = true;
                    this.f45205w.f45211n.postDelayed(new f2(2, this, uri), j3 - elapsedRealtime);
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
        long j11 = oVar.f51786a;
        int i12 = oVar.f51788c;
        Uri uri = oVar.d.f10234c;
        u2.t tVar = new u2.t(j10);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof q;
        k4.d dVar2 = y2.l.f51781e;
        c cVar = this.f45205w;
        if (z10 || z11) {
            if (iOException instanceof x) {
                i11 = ((x) iOException).d;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.h = SystemClock.elapsedRealtime();
                c(false);
                a5.a aVar = cVar.f45210f;
                String str = d0.f8531a;
                aVar.s(tVar, i12, iOException, true);
                return dVar2;
            }
        }
        b0 b0Var = new b0(iOException, i10, 14);
        Iterator it = cVar.f45209e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((t) it.next()).b(this.f45197a, b0Var, false);
        }
        rb.a aVar2 = cVar.f45208c;
        if (z12) {
            aVar2.getClass();
            long n32 = rb.a.n3(b0Var);
            if (n32 != -9223372036854775807L) {
                dVar = new k4.d(0, n32, false);
            } else {
                dVar = y2.l.f51782f;
            }
            dVar2 = dVar;
        }
        boolean a2 = dVar2.a();
        cVar.f45210f.s(tVar, i12, iOException, !a2);
        if (!a2) {
            aVar2.getClass();
        }
        return dVar2;
    }
}
