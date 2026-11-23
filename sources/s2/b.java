package s2;

import a8.ma;
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
import p4.o0;
public final class b implements b3.k {
    public final Uri f56753a;
    public final String f56754b;
    public final b3.p f56755c = new b3.p("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final j2.h d;
    public m f56756e;
    public long f56757f;
    public long h;
    public long f56758n;
    public long f56759r;
    public boolean f56760s;
    public IOException f56761w;
    public boolean f56762x;
    public final d f56763y;

    public b(d dVar, Uri uri, String str) {
        this.f56763y = dVar;
        this.f56753a = uri;
        this.f56754b = str;
        this.d = ((j2.g) dVar.f56767a.f30474a).createDataSource();
    }

    public final Uri a() {
        String str;
        m mVar = this.f56756e;
        Uri uri = this.f56753a;
        if (mVar != null) {
            l lVar = mVar.v;
            if (lVar.f56833a != -9223372036854775807L || lVar.f56836e) {
                Uri.Builder buildUpon = uri.buildUpon();
                m mVar2 = this.f56756e;
                if (mVar2.v.f56836e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(mVar2.f56842k + mVar2.f56849r.size()));
                    m mVar3 = this.f56756e;
                    if (mVar3.f56845n != -9223372036854775807L) {
                        i0 i0Var = mVar3.f56850s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((h) h9.o.n(i0Var)).f56818y) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                l lVar2 = this.f56756e.v;
                if (lVar2.f56833a != -9223372036854775807L) {
                    if (lVar2.f56834b) {
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
        d dVar = this.f56763y;
        b3.r J = dVar.f56768b.J(dVar.f56774s, this.f56756e);
        Map map = Collections.EMPTY_MAP;
        ma.k(uri, "The uri must be set.");
        b3.s sVar = new b3.s(this.d, new j2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, J);
        this.f56755c.f(sVar, this, dVar.f56769c.R4(sVar.f2889c));
    }

    public final void c(Uri uri) {
        this.f56759r = 0L;
        if (!this.f56760s) {
            b3.p pVar = this.f56755c;
            if (!pVar.d() && !pVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = this.f56758n;
                if (elapsedRealtime < j3) {
                    this.f56760s = true;
                    this.f56763y.f56772n.postDelayed(new o0(7, this, uri), j3 - elapsedRealtime);
                    return;
                }
                b(uri);
            }
        }
    }

    public final void d(s2.m r75, x2.u r76) {
        throw new UnsupportedOperationException("Method not decompiled: s2.b.d(s2.m, x2.u):void");
    }

    @Override
    public final b3.i l(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        boolean z10;
        int i10;
        b3.i iVar;
        b3.s sVar = (b3.s) mVar;
        long j11 = sVar.f2887a;
        int i11 = sVar.f2889c;
        j2.m mVar2 = sVar.f2888b;
        b0 b0Var = sVar.d;
        Uri uri = b0Var.f17147c;
        x2.u uVar = new x2.u(mVar2, uri, b0Var.d, j3, j10, b0Var.f17146b);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof r;
        b3.i iVar2 = b3.p.f2882e;
        Uri uri2 = this.f56753a;
        d dVar = this.f56763y;
        if (z10 || z11) {
            if (iOException instanceof x) {
                i10 = ((x) iOException).f17216c;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            if (z11 || i10 == 400 || i10 == 503) {
                this.f56758n = SystemClock.elapsedRealtime();
                c(uri2);
                xa xaVar = dVar.f56771f;
                String str = l0.f13778a;
                xaVar.r(uVar, i11, iOException, true);
                return iVar2;
            }
        }
        b3.j jVar = new b3.j(iOException, i7, 0);
        Iterator it = dVar.f56770e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((u) it.next()).d(uri2, jVar, false);
        }
        qb.a aVar = dVar.f56769c;
        if (z12) {
            aVar.getClass();
            long S4 = qb.a.S4(jVar);
            if (S4 != -9223372036854775807L) {
                iVar = new b3.i(0, S4, false);
            } else {
                iVar = b3.p.f2883f;
            }
            iVar2 = iVar;
        }
        boolean a10 = iVar2.a();
        dVar.f56771f.r(uVar, i11, iOException, !a10);
        if (!a10) {
            aVar.getClass();
        }
        return iVar2;
    }

    @Override
    public final void p(b3.m mVar, long j3, long j10, boolean z10) {
        b3.s sVar = (b3.s) mVar;
        long j11 = sVar.f2887a;
        j2.m mVar2 = sVar.f2888b;
        b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.f17147c, b0Var.d, j3, j10, b0Var.f17146b);
        d dVar = this.f56763y;
        dVar.f56769c.getClass();
        dVar.f56771f.o(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void s(b3.m mVar, long j3, long j10, int i7) {
        x2.u uVar;
        b3.s sVar = (b3.s) mVar;
        if (i7 == 0) {
            long j11 = sVar.f2887a;
            uVar = new x2.u(sVar.f2888b, j3);
        } else {
            long j12 = sVar.f2887a;
            j2.m mVar2 = sVar.f2888b;
            b0 b0Var = sVar.d;
            uVar = new x2.u(mVar2, b0Var.f17147c, b0Var.d, j3, j10, b0Var.f17146b);
        }
        this.f56763y.f56771f.u(uVar, sVar.f2889c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
    }

    @Override
    public final void z(b3.m mVar, long j3, long j10) {
        b3.s sVar = (b3.s) mVar;
        q qVar = (q) sVar.f2891f;
        j2.m mVar2 = sVar.f2888b;
        b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.f17147c, b0Var.d, j3, j10, b0Var.f17146b);
        if (qVar instanceof m) {
            d((m) qVar, uVar);
            this.f56763y.f56771f.p(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            t0 b10 = t0.b("Loaded playlist has unexpected type.", null);
            this.f56761w = b10;
            this.f56763y.f56771f.r(uVar, 4, b10, true);
        }
        this.f56763y.f56769c.getClass();
    }
}
