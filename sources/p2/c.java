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
public final class c implements y2.g {
    public final Uri f45046a;
    public final y2.l f45047b = new y2.l("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h f45048c;
    public m d;
    public long f45049e;
    public long f45050f;
    public long h;
    public long f45051n;
    public boolean f45052r;
    public IOException f45053s;
    public boolean v;
    public final d f45054w;

    public c(d dVar, Uri uri) {
        this.f45054w = dVar;
        this.f45046a = uri;
        this.f45048c = ((g2.g) dVar.f45055a.f16325a).createDataSource();
    }

    public static boolean a(c cVar, long j3) {
        cVar.f45051n = SystemClock.elapsedRealtime() + j3;
        Uri uri = cVar.f45046a;
        d dVar = cVar.f45054w;
        if (!uri.equals(dVar.v)) {
            return false;
        }
        List list = dVar.f45062s.f45144e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar2 = (c) dVar.d.get(((o) list.get(i10)).f45138a);
            cVar2.getClass();
            if (elapsedRealtime > cVar2.f45051n) {
                Uri uri2 = cVar2.f45046a;
                dVar.v = uri2;
                cVar2.e(dVar.b(uri2));
                return false;
            }
        }
        return true;
    }

    @Override
    public final void C(y2.i iVar, long j3, long j10) {
        y2.o oVar = (y2.o) iVar;
        q qVar = (q) oVar.f51927f;
        Uri uri = oVar.d.f10233c;
        u2.t tVar = new u2.t(j10);
        if (qVar instanceof m) {
            f((m) qVar, tVar);
            this.f45054w.f45059f.q(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            s0 b10 = s0.b("Loaded playlist has unexpected type.", null);
            this.f45053s = b10;
            this.f45054w.f45059f.s(tVar, 4, b10, true);
        }
        this.f45054w.f45057c.getClass();
    }

    @Override
    public final void H(y2.i iVar, long j3, long j10, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j11 = oVar.f51923a;
        Uri uri = oVar.d.f10233c;
        u2.t tVar = new u2.t(j10);
        d dVar = this.f45054w;
        dVar.f45057c.getClass();
        dVar.f45059f.p(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri b() {
        String str;
        m mVar = this.d;
        Uri uri = this.f45046a;
        if (mVar != null) {
            l lVar = mVar.v;
            if (lVar.f45114a != -9223372036854775807L || lVar.f45117e) {
                Uri.Builder buildUpon = uri.buildUpon();
                m mVar2 = this.d;
                if (mVar2.v.f45117e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(mVar2.f45123k + mVar2.f45130r.size()));
                    m mVar3 = this.d;
                    if (mVar3.f45126n != -9223372036854775807L) {
                        i0 i0Var = mVar3.f45131s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((h) e9.q.l(i0Var)).f45100x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                l lVar2 = this.d.v;
                if (lVar2.f45114a != -9223372036854775807L) {
                    if (lVar2.f45115b) {
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
            uri = this.f45046a;
        }
        e(uri);
    }

    public final void d(Uri uri) {
        d dVar = this.f45054w;
        y2.n D = dVar.f45056b.D(dVar.f45062s, this.d);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.f45048c, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, D);
        this.f45047b.f(oVar, this, dVar.f45057c.J(oVar.f51925c));
    }

    public final void e(Uri uri) {
        this.f45051n = 0L;
        if (!this.f45052r) {
            y2.l lVar = this.f45047b;
            if (!lVar.d() && !lVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = this.h;
                if (elapsedRealtime < j3) {
                    this.f45052r = true;
                    this.f45054w.f45060n.postDelayed(new b(0, this, uri), j3 - elapsedRealtime);
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
    public final k4.d x(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        boolean z10;
        int i11;
        k4.d dVar;
        y2.o oVar = (y2.o) iVar;
        long j11 = oVar.f51923a;
        int i12 = oVar.f51925c;
        Uri uri = oVar.d.f10233c;
        u2.t tVar = new u2.t(j10);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof r;
        k4.d dVar2 = y2.l.f51918e;
        d dVar3 = this.f45054w;
        if (z10 || z11) {
            if (iOException instanceof x) {
                i11 = ((x) iOException).d;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.h = SystemClock.elapsedRealtime();
                c(false);
                a5.a aVar = dVar3.f45059f;
                String str = d0.f8529a;
                aVar.s(tVar, i12, iOException, true);
                return dVar2;
            }
        }
        b0 b0Var = new b0(iOException, i10, 14);
        Iterator it = dVar3.f45058e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((u) it.next()).b(this.f45046a, b0Var, false);
        }
        t7.t tVar2 = dVar3.f45057c;
        if (z12) {
            tVar2.getClass();
            long K = t7.t.K(b0Var);
            if (K != -9223372036854775807L) {
                dVar = new k4.d(0, K, false);
            } else {
                dVar = y2.l.f51919f;
            }
            dVar2 = dVar;
        }
        boolean a2 = dVar2.a();
        dVar3.f45059f.s(tVar, i12, iOException, !a2);
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
            long j11 = oVar.f51923a;
            tVar = new u2.t(oVar.f51924b);
        } else {
            long j12 = oVar.f51923a;
            Uri uri = oVar.d.f10233c;
            tVar = new u2.t(j10);
        }
        this.f45054w.f45059f.u(tVar, oVar.f51925c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }
}
