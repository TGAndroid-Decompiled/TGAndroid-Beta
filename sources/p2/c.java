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
public final class c implements y2.h {
    public final Uri f40421a;
    public final y2.m f40422b = new y2.m("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h f40423c;
    public m d;
    public long e;
    public long f40424f;
    public long h;
    public long f40425n;
    public boolean f40426r;
    public IOException f40427s;
    public boolean v;
    public final d f40428w;

    public c(d dVar, Uri uri) {
        this.f40428w = dVar;
        this.f40421a = uri;
        this.f40423c = ((g2.g) dVar.f40429a.f13385b).createDataSource();
    }

    public static boolean a(c cVar, long j3) {
        cVar.f40425n = SystemClock.elapsedRealtime() + j3;
        Uri uri = cVar.f40421a;
        d dVar = cVar.f40428w;
        if (!uri.equals(dVar.v)) {
            return false;
        }
        List list = dVar.f40435s.e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar2 = (c) dVar.d.get(((o) list.get(i10)).f40506a);
            cVar2.getClass();
            if (elapsedRealtime > cVar2.f40425n) {
                Uri uri2 = cVar2.f40421a;
                dVar.v = uri2;
                cVar2.e(dVar.b(uri2));
                return false;
            }
        }
        return true;
    }

    @Override
    public final void V(y2.j jVar, long j3, long j10, boolean z10) {
        y2.p pVar = (y2.p) jVar;
        long j11 = pVar.f46321a;
        Uri uri = pVar.d.f9352c;
        u2.t tVar = new u2.t(j10);
        d dVar = this.f40428w;
        dVar.f40431c.getClass();
        dVar.f40432f.o(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri b() {
        String str;
        m mVar = this.d;
        Uri uri = this.f40421a;
        if (mVar != null) {
            l lVar = mVar.v;
            if (lVar.f40484a != -9223372036854775807L || lVar.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                m mVar2 = this.d;
                if (mVar2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(mVar2.f40491k + mVar2.f40498r.size()));
                    m mVar3 = this.d;
                    if (mVar3.f40494n != -9223372036854775807L) {
                        i0 i0Var = mVar3.f40499s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((h) e9.q.l(i0Var)).f40471x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                l lVar2 = this.d.v;
                if (lVar2.f40484a != -9223372036854775807L) {
                    if (lVar2.f40485b) {
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
            uri = this.f40421a;
        }
        e(uri);
    }

    public final void d(Uri uri) {
        d dVar = this.f40428w;
        y2.o K = dVar.f40430b.K(dVar.f40435s, this.d);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.p pVar = new y2.p(this.f40423c, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, K);
        this.f40422b.f(pVar, this, dVar.f40431c.L3(pVar.f46323c));
    }

    public final void e(Uri uri) {
        this.f40425n = 0L;
        if (!this.f40426r) {
            y2.m mVar = this.f40422b;
            if (!mVar.d() && !mVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = this.h;
                if (elapsedRealtime < j3) {
                    this.f40426r = true;
                    this.f40428w.f40433n.postDelayed(new b(0, this, uri), j3 - elapsedRealtime);
                    return;
                }
                d(uri);
            }
        }
    }

    public final void f(p2.m r73, u2.t r74) {
        throw new UnsupportedOperationException("Method not decompiled: p2.c.f(p2.m, u2.t):void");
    }

    @Override
    public final k4.d n(y2.j jVar, long j3, long j10, IOException iOException, int i10) {
        boolean z10;
        int i11;
        k4.d dVar;
        y2.p pVar = (y2.p) jVar;
        long j11 = pVar.f46321a;
        int i12 = pVar.f46323c;
        Uri uri = pVar.d.f9352c;
        u2.t tVar = new u2.t(j10);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof r;
        k4.d dVar2 = y2.m.e;
        d dVar3 = this.f40428w;
        if (z10 || z11) {
            if (iOException instanceof x) {
                i11 = ((x) iOException).d;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.h = SystemClock.elapsedRealtime();
                c(false);
                a5.a aVar = dVar3.f40432f;
                String str = d0.f7888a;
                aVar.r(tVar, i12, iOException, true);
                return dVar2;
            }
        }
        b0 b0Var = new b0(iOException, i10, 11);
        Iterator it = dVar3.e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((u) it.next()).b(this.f40421a, b0Var, false);
        }
        qb.b bVar = dVar3.f40431c;
        if (z12) {
            bVar.getClass();
            long M3 = qb.b.M3(b0Var);
            if (M3 != -9223372036854775807L) {
                dVar = new k4.d(0, M3, false);
            } else {
                dVar = y2.m.f46317f;
            }
            dVar2 = dVar;
        }
        boolean a2 = dVar2.a();
        dVar3.f40432f.r(tVar, i12, iOException, !a2);
        if (!a2) {
            bVar.getClass();
        }
        return dVar2;
    }

    @Override
    public final void o(y2.j jVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.p pVar = (y2.p) jVar;
        if (i10 == 0) {
            long j11 = pVar.f46321a;
            tVar = new u2.t(pVar.f46322b);
        } else {
            long j12 = pVar.f46321a;
            Uri uri = pVar.d.f9352c;
            tVar = new u2.t(j10);
        }
        this.f40428w.f40432f.s(tVar, pVar.f46323c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void q(y2.j jVar, long j3, long j10) {
        y2.p pVar = (y2.p) jVar;
        q qVar = (q) pVar.f46324f;
        Uri uri = pVar.d.f9352c;
        u2.t tVar = new u2.t(j10);
        if (qVar instanceof m) {
            f((m) qVar, tVar);
            this.f40428w.f40432f.p(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            s0 b10 = s0.b("Loaded playlist has unexpected type.", null);
            this.f40427s = b10;
            this.f40428w.f40432f.r(tVar, 4, b10, true);
        }
        this.f40428w.f40431c.getClass();
    }
}
