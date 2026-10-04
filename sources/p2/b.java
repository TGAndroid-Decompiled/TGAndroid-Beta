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
    public final Uri f43990a;
    public final y2.l f43991b = new y2.l("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h f43992c;
    public l d;
    public long f43993e;
    public long f43994f;
    public long h;
    public long f43995n;
    public boolean f43996r;
    public IOException f43997s;
    public boolean v;
    public final c f43998w;

    public b(c cVar, Uri uri) {
        this.f43998w = cVar;
        this.f43990a = uri;
        this.f43992c = ((g2.g) cVar.f43999a.f12544b).createDataSource();
    }

    public static boolean a(b bVar, long j3) {
        bVar.f43995n = SystemClock.elapsedRealtime() + j3;
        Uri uri = bVar.f43990a;
        c cVar = bVar.f43998w;
        if (!uri.equals(cVar.v)) {
            return false;
        }
        List list = cVar.f44006s.f44088e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) cVar.d.get(((n) list.get(i10)).f44082a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.f43995n) {
                Uri uri2 = bVar2.f43990a;
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
        Uri uri = this.f43990a;
        if (lVar != null) {
            k kVar = lVar.v;
            if (kVar.f44058a != -9223372036854775807L || kVar.f44061e) {
                Uri.Builder buildUpon = uri.buildUpon();
                l lVar2 = this.d;
                if (lVar2.v.f44061e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(lVar2.f44067k + lVar2.f44074r.size()));
                    l lVar3 = this.d;
                    if (lVar3.f44070n != -9223372036854775807L) {
                        i0 i0Var = lVar3.f44075s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((g) e9.q.l(i0Var)).f44044x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                k kVar2 = this.d.v;
                if (kVar2.f44058a != -9223372036854775807L) {
                    if (kVar2.f44059b) {
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
            uri = this.f43990a;
        }
        e(uri);
    }

    public final void d(Uri uri) {
        c cVar = this.f43998w;
        y2.n V = cVar.f44000b.V(cVar.f44006s, this.d);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.f43992c, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, V);
        this.f43991b.f(oVar, this, cVar.f44001c.L3(oVar.f50413c));
    }

    public final void e(Uri uri) {
        this.f43995n = 0L;
        if (!this.f43996r) {
            y2.l lVar = this.f43991b;
            if (!lVar.d() && !lVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = this.h;
                if (elapsedRealtime < j3) {
                    this.f43996r = true;
                    this.f43998w.f44004n.postDelayed(new x1(3, this, uri), j3 - elapsedRealtime);
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
        long j11 = oVar.f50411a;
        int i12 = oVar.f50413c;
        Uri uri = oVar.d.f10162c;
        u2.t tVar = new u2.t(j10);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof q;
        k4.d dVar2 = y2.l.f50406e;
        c cVar = this.f43998w;
        if (z10 || z11) {
            if (iOException instanceof x) {
                i11 = ((x) iOException).d;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.h = SystemClock.elapsedRealtime();
                c(false);
                a5.a aVar = cVar.f44003f;
                String str = d0.f8538a;
                aVar.r(tVar, i12, iOException, true);
                return dVar2;
            }
        }
        b0 b0Var = new b0(iOException, i10, 11);
        Iterator it = cVar.f44002e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((t) it.next()).b(this.f43990a, b0Var, false);
        }
        qb.b bVar = cVar.f44001c;
        if (z12) {
            bVar.getClass();
            long M3 = qb.b.M3(b0Var);
            if (M3 != -9223372036854775807L) {
                dVar = new k4.d(0, M3, false);
            } else {
                dVar = y2.l.f50407f;
            }
            dVar2 = dVar;
        }
        boolean a2 = dVar2.a();
        cVar.f44003f.r(tVar, i12, iOException, !a2);
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
            long j11 = oVar.f50411a;
            tVar = new u2.t(oVar.f50412b);
        } else {
            long j12 = oVar.f50411a;
            Uri uri = oVar.d.f10162c;
            tVar = new u2.t(j10);
        }
        this.f43998w.f44003f.s(tVar, oVar.f50413c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void v(y2.i iVar, long j3, long j10) {
        y2.o oVar = (y2.o) iVar;
        p pVar = (p) oVar.f50415f;
        Uri uri = oVar.d.f10162c;
        u2.t tVar = new u2.t(j10);
        if (pVar instanceof l) {
            f((l) pVar, tVar);
            this.f43998w.f44003f.p(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            s0 b10 = s0.b("Loaded playlist has unexpected type.", null);
            this.f43997s = b10;
            this.f43998w.f44003f.r(tVar, 4, b10, true);
        }
        this.f43998w.f44001c.getClass();
    }

    @Override
    public final void x0(y2.i iVar, long j3, long j10, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j11 = oVar.f50411a;
        Uri uri = oVar.d.f10162c;
        u2.t tVar = new u2.t(j10);
        c cVar = this.f43998w;
        cVar.f44001c.getClass();
        cVar.f44003f.o(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
