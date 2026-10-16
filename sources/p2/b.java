package p2;

import android.net.Uri;
import android.os.SystemClock;
import b2.x0;
import c5.c0;
import e2.m0;
import e9.n0;
import g2.b0;
import g2.x;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import v7.u6;
public final class b implements y2.g {
    public final Uri f42534a;
    public final String f42535b;
    public final y2.l f42536c = new y2.l("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h d;
    public m e;
    public long f42537f;
    public long h;
    public long f42538n;
    public long f42539r;
    public boolean f42540s;
    public IOException v;
    public boolean f42541w;
    public final d f42542x;

    public b(d dVar, Uri uri, String str) {
        this.f42542x = dVar;
        this.f42534a = uri;
        this.f42535b = str;
        this.d = ((g2.g) dVar.f42546a.f14848b).createDataSource();
    }

    @Override
    public final void A(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        q qVar = (q) oVar.f48548f;
        g2.m mVar = oVar.f48546b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b);
        if (qVar instanceof m) {
            d((m) qVar, uVar);
            this.f42542x.f42549f.r(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            x0 b10 = x0.b("Loaded playlist has unexpected type.", null);
            this.v = b10;
            this.f42542x.f42549f.t(uVar, 4, b10, true);
        }
        this.f42542x.f42548c.getClass();
    }

    @Override
    public final void X0(y2.i iVar, long j10, long j11, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f48545a;
        g2.m mVar = oVar.f48546b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b);
        d dVar = this.f42542x;
        dVar.f42548c.getClass();
        dVar.f42549f.q(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri a() {
        String str;
        m mVar = this.e;
        Uri uri = this.f42534a;
        if (mVar != null) {
            l lVar = mVar.v;
            if (lVar.f42607a != -9223372036854775807L || lVar.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                m mVar2 = this.e;
                if (mVar2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(mVar2.f42614k + mVar2.f42621r.size()));
                    m mVar3 = this.e;
                    if (mVar3.f42617n != -9223372036854775807L) {
                        n0 n0Var = mVar3.f42622s;
                        int size = n0Var.size();
                        if (!n0Var.isEmpty() && ((h) e9.s.m(n0Var)).f42594x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                l lVar2 = this.e.v;
                if (lVar2.f42607a != -9223372036854775807L) {
                    if (lVar2.f42608b) {
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
        d dVar = this.f42542x;
        y2.n b02 = dVar.f42547b.b0(dVar.f42552s, this.e);
        Map map = Collections.EMPTY_MAP;
        u6.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.d, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, b02);
        this.f42536c.f(oVar, this, dVar.f42548c.y3(oVar.f48547c));
    }

    public final void c(Uri uri) {
        this.f42539r = 0L;
        if (!this.f42540s) {
            y2.l lVar = this.f42536c;
            if (!lVar.d() && !lVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = this.f42538n;
                if (elapsedRealtime < j10) {
                    this.f42540s = true;
                    this.f42542x.f42550n.postDelayed(new org.telegram.ui.web.v(9, this, uri), j10 - elapsedRealtime);
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
    public final k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        int i11;
        k4.d dVar;
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f48545a;
        int i12 = oVar.f48547c;
        g2.m mVar = oVar.f48546b;
        b0 b0Var = oVar.d;
        Uri uri = b0Var.f9859c;
        u2.u uVar = new u2.u(mVar, uri, b0Var.d, j10, j11, b0Var.f9858b);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof r;
        k4.d dVar2 = y2.l.e;
        Uri uri2 = this.f42534a;
        d dVar3 = this.f42542x;
        if (z10 || z11) {
            if (iOException instanceof x) {
                i11 = ((x) iOException).f9917c;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.f42538n = SystemClock.elapsedRealtime();
                c(uri2);
                a5.a aVar = dVar3.f42549f;
                String str = m0.f8375a;
                aVar.t(uVar, i12, iOException, true);
                return dVar2;
            }
        }
        c0 c0Var = new c0(iOException, i10, 16);
        Iterator it = dVar3.e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((u) it.next()).b(uri2, c0Var, false);
        }
        oa.d dVar4 = dVar3.f42548c;
        if (z12) {
            dVar4.getClass();
            long z32 = oa.d.z3(c0Var);
            if (z32 != -9223372036854775807L) {
                dVar = new k4.d(0, z32, false);
            } else {
                dVar = y2.l.f48541f;
            }
            dVar2 = dVar;
        }
        boolean a2 = dVar2.a();
        dVar3.f42549f.t(uVar, i12, iOException, !a2);
        if (!a2) {
            dVar4.getClass();
        }
        return dVar2;
    }

    @Override
    public final void y(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j12 = oVar.f48545a;
            uVar = new u2.u(oVar.f48546b, j10);
        } else {
            long j13 = oVar.f48545a;
            g2.m mVar = oVar.f48546b;
            b0 b0Var = oVar.d;
            uVar = new u2.u(mVar, b0Var.f9859c, b0Var.d, j10, j11, b0Var.f9858b);
        }
        this.f42542x.f42549f.v(uVar, oVar.f48547c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }
}
