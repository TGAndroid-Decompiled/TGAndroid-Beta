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
    public final Uri f43997a;
    public final y2.l f43998b = new y2.l("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h f43999c;
    public l d;
    public long f44000e;
    public long f44001f;
    public long h;
    public long f44002n;
    public boolean f44003r;
    public IOException f44004s;
    public boolean v;
    public final c f44005w;

    public b(c cVar, Uri uri) {
        this.f44005w = cVar;
        this.f43997a = uri;
        this.f43999c = ((g2.g) cVar.f44006a.f12544b).createDataSource();
    }

    public static boolean a(b bVar, long j3) {
        bVar.f44002n = SystemClock.elapsedRealtime() + j3;
        Uri uri = bVar.f43997a;
        c cVar = bVar.f44005w;
        if (!uri.equals(cVar.v)) {
            return false;
        }
        List list = cVar.f44013s.f44095e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) cVar.d.get(((n) list.get(i10)).f44089a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.f44002n) {
                Uri uri2 = bVar2.f43997a;
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
        Uri uri = this.f43997a;
        if (lVar != null) {
            k kVar = lVar.v;
            if (kVar.f44065a != -9223372036854775807L || kVar.f44068e) {
                Uri.Builder buildUpon = uri.buildUpon();
                l lVar2 = this.d;
                if (lVar2.v.f44068e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(lVar2.f44074k + lVar2.f44081r.size()));
                    l lVar3 = this.d;
                    if (lVar3.f44077n != -9223372036854775807L) {
                        i0 i0Var = lVar3.f44082s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((g) e9.q.l(i0Var)).f44051x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                k kVar2 = this.d.v;
                if (kVar2.f44065a != -9223372036854775807L) {
                    if (kVar2.f44066b) {
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
            uri = this.f43997a;
        }
        e(uri);
    }

    public final void d(Uri uri) {
        c cVar = this.f44005w;
        y2.n V = cVar.f44007b.V(cVar.f44013s, this.d);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.f43999c, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, V);
        this.f43998b.f(oVar, this, cVar.f44008c.L3(oVar.f50420c));
    }

    public final void e(Uri uri) {
        this.f44002n = 0L;
        if (!this.f44003r) {
            y2.l lVar = this.f43998b;
            if (!lVar.d() && !lVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = this.h;
                if (elapsedRealtime < j3) {
                    this.f44003r = true;
                    this.f44005w.f44011n.postDelayed(new x1(3, this, uri), j3 - elapsedRealtime);
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
    public final k4.d v(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        boolean z10;
        int i11;
        k4.d dVar;
        y2.o oVar = (y2.o) iVar;
        long j11 = oVar.f50418a;
        int i12 = oVar.f50420c;
        Uri uri = oVar.d.f10162c;
        u2.t tVar = new u2.t(j10);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof q;
        k4.d dVar2 = y2.l.f50413e;
        c cVar = this.f44005w;
        if (z10 || z11) {
            if (iOException instanceof x) {
                i11 = ((x) iOException).d;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.h = SystemClock.elapsedRealtime();
                c(false);
                a5.a aVar = cVar.f44010f;
                String str = d0.f8538a;
                aVar.r(tVar, i12, iOException, true);
                return dVar2;
            }
        }
        b0 b0Var = new b0(iOException, i10, 11);
        Iterator it = cVar.f44009e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((t) it.next()).b(this.f43997a, b0Var, false);
        }
        qb.b bVar = cVar.f44008c;
        if (z12) {
            bVar.getClass();
            long M3 = qb.b.M3(b0Var);
            if (M3 != -9223372036854775807L) {
                dVar = new k4.d(0, M3, false);
            } else {
                dVar = y2.l.f50414f;
            }
            dVar2 = dVar;
        }
        boolean a2 = dVar2.a();
        cVar.f44010f.r(tVar, i12, iOException, !a2);
        if (!a2) {
            bVar.getClass();
        }
        return dVar2;
    }

    @Override
    public final void x(y2.i iVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j11 = oVar.f50418a;
            tVar = new u2.t(oVar.f50419b);
        } else {
            long j12 = oVar.f50418a;
            Uri uri = oVar.d.f10162c;
            tVar = new u2.t(j10);
        }
        this.f44005w.f44010f.s(tVar, oVar.f50420c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void x0(y2.i iVar, long j3, long j10, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j11 = oVar.f50418a;
        Uri uri = oVar.d.f10162c;
        u2.t tVar = new u2.t(j10);
        c cVar = this.f44005w;
        cVar.f44008c.getClass();
        cVar.f44010f.o(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void y(y2.i iVar, long j3, long j10) {
        y2.o oVar = (y2.o) iVar;
        p pVar = (p) oVar.f50422f;
        Uri uri = oVar.d.f10162c;
        u2.t tVar = new u2.t(j10);
        if (pVar instanceof l) {
            f((l) pVar, tVar);
            this.f44005w.f44010f.p(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            s0 b10 = s0.b("Loaded playlist has unexpected type.", null);
            this.f44004s = b10;
            this.f44005w.f44010f.r(tVar, 4, b10, true);
        }
        this.f44005w.f44008c.getClass();
    }
}
