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
    public final Uri f43930a;
    public final String f43931b;
    public final y2.l f43932c = new y2.l("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h d;
    public n e;
    public long f43933f;
    public long h;
    public long f43934n;
    public long f43935r;
    public boolean f43936s;
    public IOException v;
    public boolean f43937w;
    public final e f43938x;

    public c(e eVar, Uri uri, String str) {
        this.f43938x = eVar;
        this.f43930a = uri;
        this.f43931b = str;
        this.d = ((g2.g) eVar.f43942a.f15843b).createDataSource();
    }

    @Override
    public final void J(y2.i iVar, long j10, long j11, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f49938a;
        g2.m mVar = oVar.f49939b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f10764c, b0Var.d, j10, j11, b0Var.f10763b);
        e eVar = this.f43938x;
        eVar.f43944c.getClass();
        eVar.f43945f.q(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri a() {
        String str;
        n nVar = this.e;
        Uri uri = this.f43930a;
        if (nVar != null) {
            m mVar = nVar.v;
            if (mVar.f44003a != -9223372036854775807L || mVar.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                n nVar2 = this.e;
                if (nVar2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(nVar2.f44010k + nVar2.f44017r.size()));
                    n nVar3 = this.e;
                    if (nVar3.f44013n != -9223372036854775807L) {
                        n0 n0Var = nVar3.f44018s;
                        int size = n0Var.size();
                        if (!n0Var.isEmpty() && ((i) e9.s.m(n0Var)).f43990x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                m mVar2 = this.e.v;
                if (mVar2.f44003a != -9223372036854775807L) {
                    if (mVar2.f44004b) {
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
        e eVar = this.f43938x;
        y2.n U = eVar.f43943b.U(eVar.f43948s, this.e);
        Map map = Collections.EMPTY_MAP;
        u6.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.d, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, U);
        this.f43932c.f(oVar, this, eVar.f43944c.y3(oVar.f49940c));
    }

    public final void c(Uri uri) {
        this.f43935r = 0L;
        if (!this.f43936s) {
            y2.l lVar = this.f43932c;
            if (!lVar.d() && !lVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = this.f43934n;
                if (elapsedRealtime < j10) {
                    this.f43936s = true;
                    this.f43938x.f43946n.postDelayed(new b(0, this, uri), j10 - elapsedRealtime);
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
        long j12 = oVar.f49938a;
        int i12 = oVar.f49940c;
        g2.m mVar = oVar.f49939b;
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
        Uri uri2 = this.f43930a;
        e eVar = this.f43938x;
        if (z10 || z11) {
            if (iOException instanceof g2.x) {
                i11 = ((g2.x) iOException).f10822c;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.f43934n = SystemClock.elapsedRealtime();
                c(uri2);
                a5.a aVar = eVar.f43945f;
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
        oa.d dVar3 = eVar.f43944c;
        if (z12) {
            dVar3.getClass();
            long z32 = oa.d.z3(c0Var);
            if (z32 != -9223372036854775807L) {
                dVar = new k4.d(0, z32, false);
            } else {
                dVar = y2.l.f49934f;
            }
            dVar2 = dVar;
        }
        boolean a2 = dVar2.a();
        eVar.f43945f.t(uVar, i12, iOException, !a2);
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
            long j12 = oVar.f49938a;
            uVar = new u2.u(oVar.f49939b, j10);
        } else {
            long j13 = oVar.f49938a;
            g2.m mVar = oVar.f49939b;
            b0 b0Var = oVar.d;
            uVar = new u2.u(mVar, b0Var.f10764c, b0Var.d, j10, j11, b0Var.f10763b);
        }
        this.f43938x.f43945f.v(uVar, oVar.f49940c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void k(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        r rVar = (r) oVar.f49941f;
        g2.m mVar = oVar.f49939b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f10764c, b0Var.d, j10, j11, b0Var.f10763b);
        if (rVar instanceof n) {
            d((n) rVar, uVar);
            this.f43938x.f43945f.r(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            w0 b10 = w0.b("Loaded playlist has unexpected type.", null);
            this.v = b10;
            this.f43938x.f43945f.t(uVar, 4, b10, true);
        }
        this.f43938x.f43944c.getClass();
    }
}
