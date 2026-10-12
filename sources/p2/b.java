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
import org.telegram.ui.Wallet.t8;
import v7.u6;
public final class b implements y2.g {
    public final Uri f42834a;
    public final String f42835b;
    public final y2.l f42836c = new y2.l("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h d;
    public m e;
    public long f42837f;
    public long h;
    public long f42838n;
    public long f42839r;
    public boolean f42840s;
    public IOException v;
    public boolean f42841w;
    public final d f42842x;

    public b(d dVar, Uri uri, String str) {
        this.f42842x = dVar;
        this.f42834a = uri;
        this.f42835b = str;
        this.d = ((g2.g) dVar.f42846a.f14503b).createDataSource();
    }

    @Override
    public final void B(y2.i iVar, long j10, long j11, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f48546a;
        g2.m mVar = oVar.f48547b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f9856c, b0Var.d, j10, j11, b0Var.f9855b);
        d dVar = this.f42842x;
        dVar.f42848c.getClass();
        dVar.f42849f.q(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri a() {
        String str;
        m mVar = this.e;
        Uri uri = this.f42834a;
        if (mVar != null) {
            l lVar = mVar.v;
            if (lVar.f42907a != -9223372036854775807L || lVar.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                m mVar2 = this.e;
                if (mVar2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(mVar2.f42914k + mVar2.f42921r.size()));
                    m mVar3 = this.e;
                    if (mVar3.f42917n != -9223372036854775807L) {
                        n0 n0Var = mVar3.f42922s;
                        int size = n0Var.size();
                        if (!n0Var.isEmpty() && ((h) e9.s.m(n0Var)).f42894x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                l lVar2 = this.e.v;
                if (lVar2.f42907a != -9223372036854775807L) {
                    if (lVar2.f42908b) {
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
        d dVar = this.f42842x;
        y2.n U = dVar.f42847b.U(dVar.f42852s, this.e);
        Map map = Collections.EMPTY_MAP;
        u6.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.d, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, U);
        this.f42836c.f(oVar, this, dVar.f42848c.y3(oVar.f48548c));
    }

    public final void c(Uri uri) {
        this.f42839r = 0L;
        if (!this.f42840s) {
            y2.l lVar = this.f42836c;
            if (!lVar.c() && !lVar.b()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = this.f42838n;
                if (elapsedRealtime < j10) {
                    this.f42840s = true;
                    this.f42842x.f42850n.postDelayed(new t8(14, this, uri), j10 - elapsedRealtime);
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
        long j12 = oVar.f48546a;
        int i12 = oVar.f48548c;
        g2.m mVar = oVar.f48547b;
        b0 b0Var = oVar.d;
        Uri uri = b0Var.f9856c;
        u2.u uVar = new u2.u(mVar, uri, b0Var.d, j10, j11, b0Var.f9855b);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof r;
        k4.d dVar2 = y2.l.e;
        Uri uri2 = this.f42834a;
        d dVar3 = this.f42842x;
        if (z10 || z11) {
            if (iOException instanceof x) {
                i11 = ((x) iOException).f9914c;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.f42838n = SystemClock.elapsedRealtime();
                c(uri2);
                a5.a aVar = dVar3.f42849f;
                String str = m0.f8372a;
                aVar.t(uVar, i12, iOException, true);
                return dVar2;
            }
        }
        c0 c0Var = new c0(iOException, i10, 16);
        Iterator it = dVar3.e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((u) it.next()).d(uri2, c0Var, false);
        }
        oa.d dVar4 = dVar3.f42848c;
        if (z12) {
            dVar4.getClass();
            long z32 = oa.d.z3(c0Var);
            if (z32 != -9223372036854775807L) {
                dVar = new k4.d(0, z32, false);
            } else {
                dVar = y2.l.f48542f;
            }
            dVar2 = dVar;
        }
        boolean a2 = dVar2.a();
        dVar3.f42849f.t(uVar, i12, iOException, !a2);
        if (!a2) {
            dVar4.getClass();
        }
        return dVar2;
    }

    @Override
    public final void k(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j12 = oVar.f48546a;
            uVar = new u2.u(oVar.f48547b, j10);
        } else {
            long j13 = oVar.f48546a;
            g2.m mVar = oVar.f48547b;
            b0 b0Var = oVar.d;
            uVar = new u2.u(mVar, b0Var.f9856c, b0Var.d, j10, j11, b0Var.f9855b);
        }
        this.f42842x.f42849f.v(uVar, oVar.f48548c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void l(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        q qVar = (q) oVar.f48549f;
        g2.m mVar = oVar.f48547b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f9856c, b0Var.d, j10, j11, b0Var.f9855b);
        if (qVar instanceof m) {
            d((m) qVar, uVar);
            this.f42842x.f42849f.r(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            x0 b10 = x0.b("Loaded playlist has unexpected type.", null);
            this.v = b10;
            this.f42842x.f42849f.t(uVar, 4, b10, true);
        }
        this.f42842x.f42848c.getClass();
    }
}
