package p2;

import android.net.Uri;
import android.os.SystemClock;
import b2.w0;
import e2.m0;
import e9.n0;
import g2.b0;
import g2.x;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.telegram.ui.web.g2;
import v7.u6;
public final class b implements y2.g {
    public final Uri f43921a;
    public final String f43922b;
    public final y2.l f43923c = new y2.l("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h d;
    public m e;
    public long f43924f;
    public long h;
    public long f43925n;
    public long f43926r;
    public boolean f43927s;
    public IOException v;
    public boolean f43928w;
    public final d f43929x;

    public b(d dVar, Uri uri, String str) {
        this.f43929x = dVar;
        this.f43921a = uri;
        this.f43922b = str;
        this.d = ((g2.g) dVar.f43933a.f15842b).createDataSource();
    }

    @Override
    public final void I(y2.i iVar, long j10, long j11, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f49928a;
        g2.m mVar = oVar.f49929b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f10765c, b0Var.d, j10, j11, b0Var.f10764b);
        d dVar = this.f43929x;
        dVar.f43935c.getClass();
        dVar.f43936f.q(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri a() {
        String str;
        m mVar = this.e;
        Uri uri = this.f43921a;
        if (mVar != null) {
            l lVar = mVar.v;
            if (lVar.f43994a != -9223372036854775807L || lVar.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                m mVar2 = this.e;
                if (mVar2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(mVar2.f44001k + mVar2.f44008r.size()));
                    m mVar3 = this.e;
                    if (mVar3.f44004n != -9223372036854775807L) {
                        n0 n0Var = mVar3.f44009s;
                        int size = n0Var.size();
                        if (!n0Var.isEmpty() && ((h) e9.s.m(n0Var)).f43981x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                l lVar2 = this.e.v;
                if (lVar2.f43994a != -9223372036854775807L) {
                    if (lVar2.f43995b) {
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

    public final void b(Uri uri) {
        d dVar = this.f43929x;
        y2.n U = dVar.f43934b.U(dVar.f43939s, this.e);
        Map map = Collections.EMPTY_MAP;
        u6.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.d, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, U);
        this.f43923c.f(oVar, this, dVar.f43935c.y3(oVar.f49930c));
    }

    public final void c(Uri uri) {
        this.f43926r = 0L;
        if (!this.f43927s) {
            y2.l lVar = this.f43923c;
            if (!lVar.d() && !lVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = this.f43925n;
                if (elapsedRealtime < j10) {
                    this.f43927s = true;
                    this.f43929x.f43937n.postDelayed(new g2(1, this, uri), j10 - elapsedRealtime);
                    return;
                }
                b(uri);
            }
        }
    }

    public final void d(p2.m r75, u2.u r76) {
        throw new UnsupportedOperationException("Method not decompiled: p2.b.d(p2.m, u2.u):void");
    }

    @Override
    public final k4.d j(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        int i11;
        k4.d dVar;
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f49928a;
        int i12 = oVar.f49930c;
        g2.m mVar = oVar.f49929b;
        b0 b0Var = oVar.d;
        Uri uri = b0Var.f10765c;
        u2.u uVar = new u2.u(mVar, uri, b0Var.d, j10, j11, b0Var.f10764b);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof r;
        k4.d dVar2 = y2.l.e;
        Uri uri2 = this.f43921a;
        d dVar3 = this.f43929x;
        if (z10 || z11) {
            if (iOException instanceof x) {
                i11 = ((x) iOException).f10823c;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.f43925n = SystemClock.elapsedRealtime();
                c(uri2);
                a5.a aVar = dVar3.f43936f;
                String str = m0.f8253a;
                aVar.t(uVar, i12, iOException, true);
                return dVar2;
            }
        }
        c5.b0 b0Var2 = new c5.b0(iOException, i10, 17);
        Iterator it = dVar3.e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((u) it.next()).b(uri2, b0Var2, false);
        }
        oa.d dVar4 = dVar3.f43935c;
        if (z12) {
            dVar4.getClass();
            long z32 = oa.d.z3(b0Var2);
            if (z32 != -9223372036854775807L) {
                dVar = new k4.d(0, z32, false);
            } else {
                dVar = y2.l.f49924f;
            }
            dVar2 = dVar;
        }
        boolean a2 = dVar2.a();
        dVar3.f43936f.t(uVar, i12, iOException, !a2);
        if (!a2) {
            dVar4.getClass();
        }
        return dVar2;
    }

    @Override
    public final void l(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j12 = oVar.f49928a;
            uVar = new u2.u(oVar.f49929b, j10);
        } else {
            long j13 = oVar.f49928a;
            g2.m mVar = oVar.f49929b;
            b0 b0Var = oVar.d;
            uVar = new u2.u(mVar, b0Var.f10765c, b0Var.d, j10, j11, b0Var.f10764b);
        }
        this.f43929x.f43936f.v(uVar, oVar.f49930c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void n(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        q qVar = (q) oVar.f49931f;
        g2.m mVar = oVar.f49929b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f10765c, b0Var.d, j10, j11, b0Var.f10764b);
        if (qVar instanceof m) {
            d((m) qVar, uVar);
            this.f43929x.f43936f.r(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            w0 b10 = w0.b("Loaded playlist has unexpected type.", null);
            this.v = b10;
            this.f43929x.f43936f.t(uVar, 4, b10, true);
        }
        this.f43929x.f43935c.getClass();
    }
}
