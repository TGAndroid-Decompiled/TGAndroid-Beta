package p2;

import a8.ng;
import a8.yb;
import android.net.Uri;
import android.os.SystemClock;
import b2.x0;
import d5.z;
import e2.n0;
import f9.i0;
import g2.b0;
import g2.x;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.telegram.ui.Wallet.q6;
public final class b implements y2.g {
    public final Uri f46484a;
    public final String f46485b;
    public final y2.l f46486c = new y2.l("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h d;
    public m e;
    public long f46487f;
    public long h;
    public long f46488n;
    public long f46489r;
    public boolean f46490s;
    public IOException v;
    public boolean f46491w;
    public final d f46492x;

    public b(d dVar, Uri uri, String str) {
        this.f46492x = dVar;
        this.f46484a = uri;
        this.f46485b = str;
        this.d = ((g2.g) dVar.f46496a.f17210b).createDataSource();
    }

    @Override
    public final void B(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        q qVar = (q) oVar.f51967f;
        g2.m mVar = oVar.f51965b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f12231c, b0Var.d, j10, j11, b0Var.f12230b);
        if (qVar instanceof m) {
            d((m) qVar, uVar);
            this.f46492x.f46499f.q(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            x0 b10 = x0.b("Loaded playlist has unexpected type.", null);
            this.v = b10;
            this.f46492x.f46499f.s(uVar, 4, b10, true);
        }
        this.f46492x.f46498c.getClass();
    }

    public final Uri a() {
        String str;
        m mVar = this.e;
        Uri uri = this.f46484a;
        if (mVar != null) {
            l lVar = mVar.v;
            if (lVar.f46557a != -9223372036854775807L || lVar.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                m mVar2 = this.e;
                if (mVar2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(mVar2.f46564k + mVar2.f46571r.size()));
                    m mVar3 = this.e;
                    if (mVar3.f46567n != -9223372036854775807L) {
                        i0 i0Var = mVar3.f46572s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((h) f9.o.m(i0Var)).f46544x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                l lVar2 = this.e.v;
                if (lVar2.f46557a != -9223372036854775807L) {
                    if (lVar2.f46558b) {
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
        d dVar = this.f46492x;
        y2.n R = dVar.f46497b.R(dVar.f46502s, this.e);
        Map map = Collections.EMPTY_MAP;
        yb.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.d, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, R);
        this.f46486c.f(oVar, this, dVar.f46498c.B0(oVar.f51966c));
    }

    public final void c(Uri uri) {
        this.f46489r = 0L;
        if (!this.f46490s) {
            y2.l lVar = this.f46486c;
            if (!lVar.c() && !lVar.b()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = this.f46488n;
                if (elapsedRealtime < j10) {
                    this.f46490s = true;
                    this.f46492x.f46500n.postDelayed(new q6(20, this, uri), j10 - elapsedRealtime);
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
    public final void l0(y2.i iVar, long j10, long j11, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f51964a;
        g2.m mVar = oVar.f51965b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f12231c, b0Var.d, j10, j11, b0Var.f12230b);
        d dVar = this.f46492x;
        dVar.f46498c.getClass();
        dVar.f46499f.p(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        int i11;
        k4.d dVar;
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f51964a;
        int i12 = oVar.f51966c;
        g2.m mVar = oVar.f51965b;
        b0 b0Var = oVar.d;
        Uri uri = b0Var.f12231c;
        u2.u uVar = new u2.u(mVar, uri, b0Var.d, j10, j11, b0Var.f12230b);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof r;
        k4.d dVar2 = y2.l.e;
        Uri uri2 = this.f46484a;
        d dVar3 = this.f46492x;
        if (z10 || z11) {
            if (iOException instanceof x) {
                i11 = ((x) iOException).f12289c;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.f46488n = SystemClock.elapsedRealtime();
                c(uri2);
                ng ngVar = dVar3.f46499f;
                String str = n0.f9692a;
                ngVar.s(uVar, i12, iOException, true);
                return dVar2;
            }
        }
        z zVar = new z(iOException, i10, 17);
        Iterator it = dVar3.e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((u) it.next()).d(uri2, zVar, false);
        }
        u7.s sVar = dVar3.f46498c;
        if (z12) {
            sVar.getClass();
            long H0 = u7.s.H0(zVar);
            if (H0 != -9223372036854775807L) {
                dVar = new k4.d(0, H0, false);
            } else {
                dVar = y2.l.f51960f;
            }
            dVar2 = dVar;
        }
        boolean a2 = dVar2.a();
        dVar3.f46499f.s(uVar, i12, iOException, !a2);
        if (!a2) {
            sVar.getClass();
        }
        return dVar2;
    }

    @Override
    public final void z(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j12 = oVar.f51964a;
            uVar = new u2.u(oVar.f51965b, j10);
        } else {
            long j13 = oVar.f51964a;
            g2.m mVar = oVar.f51965b;
            b0 b0Var = oVar.d;
            uVar = new u2.u(mVar, b0Var.f12231c, b0Var.d, j10, j11, b0Var.f12230b);
        }
        this.f46492x.f46499f.u(uVar, oVar.f51966c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }
}
