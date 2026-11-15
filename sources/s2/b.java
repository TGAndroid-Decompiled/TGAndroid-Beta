package s2;

import a8.ja;
import a8.xa;
import android.net.Uri;
import android.os.SystemClock;
import e2.t0;
import h2.l0;
import h9.i0;
import j2.b0;
import j2.x;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.telegram.ui.web.e1;
public final class b implements b3.j {
    public final Uri f56169a;
    public final String f56170b;
    public final b3.o f56171c = new b3.o("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final j2.h d;
    public m f56172e;
    public long f56173f;
    public long h;
    public long f56174n;
    public long f56175r;
    public boolean f56176s;
    public IOException f56177w;
    public boolean f56178x;
    public final d f56179y;

    public b(d dVar, Uri uri, String str) {
        this.f56179y = dVar;
        this.f56169a = uri;
        this.f56170b = str;
        this.d = ((j2.g) dVar.f56183a.f33545a).createDataSource();
    }

    public final Uri a() {
        String str;
        m mVar = this.f56172e;
        Uri uri = this.f56169a;
        if (mVar != null) {
            l lVar = mVar.v;
            if (lVar.f56249a != -9223372036854775807L || lVar.f56252e) {
                Uri.Builder buildUpon = uri.buildUpon();
                m mVar2 = this.f56172e;
                if (mVar2.v.f56252e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(mVar2.f56258k + mVar2.f56265r.size()));
                    m mVar3 = this.f56172e;
                    if (mVar3.f56261n != -9223372036854775807L) {
                        i0 i0Var = mVar3.f56266s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((h) h9.o.n(i0Var)).f56234y) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                l lVar2 = this.f56172e.v;
                if (lVar2.f56249a != -9223372036854775807L) {
                    if (lVar2.f56250b) {
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
        d dVar = this.f56179y;
        b3.q e10 = dVar.f56184b.e(dVar.f56190s, this.f56172e);
        Map map = Collections.EMPTY_MAP;
        ja.k(uri, "The uri must be set.");
        b3.r rVar = new b3.r(this.d, new j2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, e10);
        this.f56171c.f(rVar, this, dVar.f56185c.R4(rVar.f2924c));
    }

    public final void c(Uri uri) {
        this.f56175r = 0L;
        if (!this.f56176s) {
            b3.o oVar = this.f56171c;
            if (!oVar.d() && !oVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = this.f56174n;
                if (elapsedRealtime < j3) {
                    this.f56176s = true;
                    this.f56179y.f56188n.postDelayed(new e1(15, this, uri), j3 - elapsedRealtime);
                    return;
                }
                b(uri);
            }
        }
    }

    public final void d(s2.m r75, x2.t r76) {
        throw new UnsupportedOperationException("Method not decompiled: s2.b.d(s2.m, x2.t):void");
    }

    @Override
    public final b3.i k(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        boolean z10;
        int i10;
        b3.i iVar;
        b3.r rVar = (b3.r) lVar;
        long j11 = rVar.f2922a;
        int i11 = rVar.f2924c;
        j2.m mVar = rVar.f2923b;
        b0 b0Var = rVar.d;
        Uri uri = b0Var.f16771c;
        x2.t tVar = new x2.t(mVar, uri, b0Var.d, j3, j10, b0Var.f16770b);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof r;
        b3.i iVar2 = b3.o.f2917e;
        Uri uri2 = this.f56169a;
        d dVar = this.f56179y;
        if (z10 || z11) {
            if (iOException instanceof x) {
                i10 = ((x) iOException).f16840c;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            if (z11 || i10 == 400 || i10 == 503) {
                this.f56174n = SystemClock.elapsedRealtime();
                c(uri2);
                xa xaVar = dVar.f56187f;
                String str = l0.f13471a;
                xaVar.q(tVar, i11, iOException, true);
                return iVar2;
            }
        }
        f5.v vVar = new f5.v(iOException, i7, 1);
        Iterator it = dVar.f56186e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((u) it.next()).d(uri2, vVar, false);
        }
        qb.a aVar = dVar.f56185c;
        if (z12) {
            aVar.getClass();
            long S4 = qb.a.S4(vVar);
            if (S4 != -9223372036854775807L) {
                iVar = new b3.i(0, S4, false);
            } else {
                iVar = b3.o.f2918f;
            }
            iVar2 = iVar;
        }
        boolean a10 = iVar2.a();
        dVar.f56187f.q(tVar, i11, iOException, !a10);
        if (!a10) {
            aVar.getClass();
        }
        return iVar2;
    }

    @Override
    public final void m(b3.l lVar, long j3, long j10, boolean z10) {
        b3.r rVar = (b3.r) lVar;
        long j11 = rVar.f2922a;
        j2.m mVar = rVar.f2923b;
        b0 b0Var = rVar.d;
        x2.t tVar = new x2.t(mVar, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        d dVar = this.f56179y;
        dVar.f56185c.getClass();
        dVar.f56187f.n(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void r(b3.l lVar, long j3, long j10, int i7) {
        x2.t tVar;
        b3.r rVar = (b3.r) lVar;
        if (i7 == 0) {
            long j11 = rVar.f2922a;
            tVar = new x2.t(rVar.f2923b, j3);
        } else {
            long j12 = rVar.f2922a;
            j2.m mVar = rVar.f2923b;
            b0 b0Var = rVar.d;
            tVar = new x2.t(mVar, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        }
        this.f56179y.f56187f.s(tVar, rVar.f2924c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
    }

    @Override
    public final void w(b3.l lVar, long j3, long j10) {
        b3.r rVar = (b3.r) lVar;
        q qVar = (q) rVar.f2926f;
        j2.m mVar = rVar.f2923b;
        b0 b0Var = rVar.d;
        x2.t tVar = new x2.t(mVar, b0Var.f16771c, b0Var.d, j3, j10, b0Var.f16770b);
        if (qVar instanceof m) {
            d((m) qVar, tVar);
            this.f56179y.f56187f.o(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            t0 b10 = t0.b("Loaded playlist has unexpected type.", null);
            this.f56177w = b10;
            this.f56179y.f56187f.q(tVar, 4, b10, true);
        }
        this.f56179y.f56185c.getClass();
    }
}
