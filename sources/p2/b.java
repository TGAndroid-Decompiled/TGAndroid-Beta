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
import org.telegram.ui.web.x1;
public final class b implements y2.g {
    public final Uri f43982a;
    public final y2.l f43983b = new y2.l("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h f43984c;
    public l d;
    public long f43985e;
    public long f43986f;
    public long h;
    public long f43987n;
    public boolean f43988r;
    public IOException f43989s;
    public boolean v;
    public final c f43990w;

    public b(c cVar, Uri uri) {
        this.f43990w = cVar;
        this.f43982a = uri;
        this.f43984c = ((g2.g) cVar.f43991a.f12543b).createDataSource();
    }

    public static boolean a(b bVar, long j3) {
        bVar.f43987n = SystemClock.elapsedRealtime() + j3;
        Uri uri = bVar.f43982a;
        c cVar = bVar.f43990w;
        if (!uri.equals(cVar.v)) {
            return false;
        }
        List list = cVar.f43998s.f44080e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) cVar.d.get(((n) list.get(i10)).f44074a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.f43987n) {
                Uri uri2 = bVar2.f43982a;
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
        Uri uri = this.f43982a;
        if (lVar != null) {
            k kVar = lVar.v;
            if (kVar.f44050a != -9223372036854775807L || kVar.f44053e) {
                Uri.Builder buildUpon = uri.buildUpon();
                l lVar2 = this.d;
                if (lVar2.v.f44053e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(lVar2.f44059k + lVar2.f44066r.size()));
                    l lVar3 = this.d;
                    if (lVar3.f44062n != -9223372036854775807L) {
                        i0 i0Var = lVar3.f44067s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((g) e9.q.l(i0Var)).f44036x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                k kVar2 = this.d.v;
                if (kVar2.f44050a != -9223372036854775807L) {
                    if (kVar2.f44051b) {
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
            uri = this.f43982a;
        }
        e(uri);
    }

    public final void d(Uri uri) {
        c cVar = this.f43990w;
        y2.n V = cVar.f43992b.V(cVar.f43998s, this.d);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.f43984c, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, V);
        this.f43983b.f(oVar, this, cVar.f43993c.L3(oVar.f50404c));
    }

    public final void e(Uri uri) {
        this.f43987n = 0L;
        if (!this.f43988r) {
            y2.l lVar = this.f43983b;
            if (!lVar.d() && !lVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = this.h;
                if (elapsedRealtime < j3) {
                    this.f43988r = true;
                    this.f43990w.f43996n.postDelayed(new x1(3, this, uri), j3 - elapsedRealtime);
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
    public final k4.d s(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        boolean z10;
        int i11;
        k4.d dVar;
        y2.o oVar = (y2.o) iVar;
        long j11 = oVar.f50402a;
        int i12 = oVar.f50404c;
        Uri uri = oVar.d.f10161c;
        u2.t tVar = new u2.t(j10);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof q;
        k4.d dVar2 = y2.l.f50397e;
        c cVar = this.f43990w;
        if (z10 || z11) {
            if (iOException instanceof x) {
                i11 = ((x) iOException).d;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.h = SystemClock.elapsedRealtime();
                c(false);
                a5.a aVar = cVar.f43995f;
                String str = d0.f8537a;
                aVar.r(tVar, i12, iOException, true);
                return dVar2;
            }
        }
        b0 b0Var = new b0(iOException, i10, 11);
        Iterator it = cVar.f43994e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((t) it.next()).b(this.f43982a, b0Var, false);
        }
        qb.b bVar = cVar.f43993c;
        if (z12) {
            bVar.getClass();
            long M3 = qb.b.M3(b0Var);
            if (M3 != -9223372036854775807L) {
                dVar = new k4.d(0, M3, false);
            } else {
                dVar = y2.l.f50398f;
            }
            dVar2 = dVar;
        }
        boolean a2 = dVar2.a();
        cVar.f43995f.r(tVar, i12, iOException, !a2);
        if (!a2) {
            bVar.getClass();
        }
        return dVar2;
    }

    @Override
    public final void t(y2.i iVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j11 = oVar.f50402a;
            tVar = new u2.t(oVar.f50403b);
        } else {
            long j12 = oVar.f50402a;
            Uri uri = oVar.d.f10161c;
            tVar = new u2.t(j10);
        }
        this.f43990w.f43995f.s(tVar, oVar.f50404c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void v(y2.i iVar, long j3, long j10) {
        y2.o oVar = (y2.o) iVar;
        p pVar = (p) oVar.f50406f;
        Uri uri = oVar.d.f10161c;
        u2.t tVar = new u2.t(j10);
        if (pVar instanceof l) {
            f((l) pVar, tVar);
            this.f43990w.f43995f.p(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            s0 b10 = s0.b("Loaded playlist has unexpected type.", null);
            this.f43989s = b10;
            this.f43990w.f43995f.r(tVar, 4, b10, true);
        }
        this.f43990w.f43993c.getClass();
    }

    @Override
    public final void x0(y2.i iVar, long j3, long j10, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j11 = oVar.f50402a;
        Uri uri = oVar.d.f10161c;
        u2.t tVar = new u2.t(j10);
        c cVar = this.f43990w;
        cVar.f43993c.getClass();
        cVar.f43995f.o(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
