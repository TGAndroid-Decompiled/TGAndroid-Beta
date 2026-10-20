package p2;

import android.net.Uri;
import android.os.SystemClock;
import b2.w0;
import c5.c0;
import e2.m0;
import e9.n0;
import g2.b0;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import v7.u6;
public final class c implements y2.g {
    public final Uri f43926a;
    public final String f43927b;
    public final y2.l f43928c = new y2.l("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h d;
    public n e;
    public long f43929f;
    public long h;
    public long f43930n;
    public long f43931r;
    public boolean f43932s;
    public IOException v;
    public boolean f43933w;
    public final e f43934x;

    public c(e eVar, Uri uri, String str) {
        this.f43934x = eVar;
        this.f43926a = uri;
        this.f43927b = str;
        this.d = ((g2.g) eVar.f43938a.f15843b).createDataSource();
    }

    @Override
    public final void J(y2.i iVar, long j10, long j11, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f49934a;
        g2.m mVar = oVar.f49935b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f10764c, b0Var.d, j10, j11, b0Var.f10763b);
        e eVar = this.f43934x;
        eVar.f43940c.getClass();
        eVar.f43941f.q(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri a() {
        String str;
        n nVar = this.e;
        Uri uri = this.f43926a;
        if (nVar != null) {
            m mVar = nVar.v;
            if (mVar.f43999a != -9223372036854775807L || mVar.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                n nVar2 = this.e;
                if (nVar2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(nVar2.f44006k + nVar2.f44013r.size()));
                    n nVar3 = this.e;
                    if (nVar3.f44009n != -9223372036854775807L) {
                        n0 n0Var = nVar3.f44014s;
                        int size = n0Var.size();
                        if (!n0Var.isEmpty() && ((i) e9.s.m(n0Var)).f43986x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                m mVar2 = this.e.v;
                if (mVar2.f43999a != -9223372036854775807L) {
                    if (mVar2.f44000b) {
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
        e eVar = this.f43934x;
        y2.n U = eVar.f43939b.U(eVar.f43944s, this.e);
        Map map = Collections.EMPTY_MAP;
        u6.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.d, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, U);
        this.f43928c.f(oVar, this, eVar.f43940c.y3(oVar.f49936c));
    }

    public final void c(Uri uri) {
        this.f43931r = 0L;
        if (!this.f43932s) {
            y2.l lVar = this.f43928c;
            if (!lVar.d() && !lVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = this.f43930n;
                if (elapsedRealtime < j10) {
                    this.f43932s = true;
                    this.f43934x.f43942n.postDelayed(new b(0, this, uri), j10 - elapsedRealtime);
                    return;
                }
                b(uri);
            }
        }
    }

    public final void d(p2.n r75, u2.u r76) {
        throw new UnsupportedOperationException("Method not decompiled: p2.c.d(p2.n, u2.u):void");
    }

    @Override
    public final k4.d e(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        int i11;
        k4.d dVar;
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f49934a;
        int i12 = oVar.f49936c;
        g2.m mVar = oVar.f49935b;
        b0 b0Var = oVar.d;
        Uri uri = b0Var.f10764c;
        u2.u uVar = new u2.u(mVar, uri, b0Var.d, j10, j11, b0Var.f10763b);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof s;
        k4.d dVar2 = y2.l.e;
        Uri uri2 = this.f43926a;
        e eVar = this.f43934x;
        if (z10 || z11) {
            if (iOException instanceof g2.x) {
                i11 = ((g2.x) iOException).f10822c;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.f43930n = SystemClock.elapsedRealtime();
                c(uri2);
                a5.a aVar = eVar.f43941f;
                String str = m0.f8252a;
                aVar.t(uVar, i12, iOException, true);
                return dVar2;
            }
        }
        c0 c0Var = new c0(iOException, i10, 17);
        Iterator it = eVar.e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((v) it.next()).b(uri2, c0Var, false);
        }
        oa.d dVar3 = eVar.f43940c;
        if (z12) {
            dVar3.getClass();
            long z32 = oa.d.z3(c0Var);
            if (z32 != -9223372036854775807L) {
                dVar = new k4.d(0, z32, false);
            } else {
                dVar = y2.l.f49930f;
            }
            dVar2 = dVar;
        }
        boolean a2 = dVar2.a();
        eVar.f43941f.t(uVar, i12, iOException, !a2);
        if (!a2) {
            dVar3.getClass();
        }
        return dVar2;
    }

    @Override
    public final void h(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j12 = oVar.f49934a;
            uVar = new u2.u(oVar.f49935b, j10);
        } else {
            long j13 = oVar.f49934a;
            g2.m mVar = oVar.f49935b;
            b0 b0Var = oVar.d;
            uVar = new u2.u(mVar, b0Var.f10764c, b0Var.d, j10, j11, b0Var.f10763b);
        }
        this.f43934x.f43941f.v(uVar, oVar.f49936c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void k(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        r rVar = (r) oVar.f49937f;
        g2.m mVar = oVar.f49935b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f10764c, b0Var.d, j10, j11, b0Var.f10763b);
        if (rVar instanceof n) {
            d((n) rVar, uVar);
            this.f43934x.f43941f.r(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            w0 b10 = w0.b("Loaded playlist has unexpected type.", null);
            this.v = b10;
            this.f43934x.f43941f.t(uVar, 4, b10, true);
        }
        this.f43934x.f43940c.getClass();
    }
}
