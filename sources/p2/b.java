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
import org.telegram.ui.Wallet.a6;
public final class b implements y2.g {
    public final Uri f46522a;
    public final String f46523b;
    public final y2.l f46524c = new y2.l("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h d;
    public m e;
    public long f46525f;
    public long h;
    public long f46526n;
    public long f46527r;
    public boolean f46528s;
    public IOException v;
    public boolean f46529w;
    public final d f46530x;

    public b(d dVar, Uri uri, String str) {
        this.f46530x = dVar;
        this.f46522a = uri;
        this.f46523b = str;
        this.d = ((g2.g) dVar.f46534a.f17209b).createDataSource();
    }

    @Override
    public final void B(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        q qVar = (q) oVar.f52028f;
        g2.m mVar = oVar.f52026b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f12230c, b0Var.d, j10, j11, b0Var.f12229b);
        if (qVar instanceof m) {
            d((m) qVar, uVar);
            this.f46530x.f46537f.q(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            x0 b10 = x0.b("Loaded playlist has unexpected type.", null);
            this.v = b10;
            this.f46530x.f46537f.s(uVar, 4, b10, true);
        }
        this.f46530x.f46536c.getClass();
    }

    public final Uri a() {
        String str;
        m mVar = this.e;
        Uri uri = this.f46522a;
        if (mVar != null) {
            l lVar = mVar.v;
            if (lVar.f46595a != -9223372036854775807L || lVar.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                m mVar2 = this.e;
                if (mVar2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(mVar2.f46602k + mVar2.f46609r.size()));
                    m mVar3 = this.e;
                    if (mVar3.f46605n != -9223372036854775807L) {
                        i0 i0Var = mVar3.f46610s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((h) f9.o.m(i0Var)).f46582x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                l lVar2 = this.e.v;
                if (lVar2.f46595a != -9223372036854775807L) {
                    if (lVar2.f46596b) {
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
        d dVar = this.f46530x;
        y2.n R = dVar.f46535b.R(dVar.f46540s, this.e);
        Map map = Collections.EMPTY_MAP;
        yb.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.d, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, R);
        this.f46524c.f(oVar, this, dVar.f46536c.B0(oVar.f52027c));
    }

    public final void c(Uri uri) {
        this.f46527r = 0L;
        if (!this.f46528s) {
            y2.l lVar = this.f46524c;
            if (!lVar.c() && !lVar.b()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = this.f46526n;
                if (elapsedRealtime < j10) {
                    this.f46528s = true;
                    this.f46530x.f46538n.postDelayed(new a6(21, this, uri), j10 - elapsedRealtime);
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
        long j12 = oVar.f52025a;
        g2.m mVar = oVar.f52026b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.f12230c, b0Var.d, j10, j11, b0Var.f12229b);
        d dVar = this.f46530x;
        dVar.f46536c.getClass();
        dVar.f46537f.p(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        int i11;
        k4.d dVar;
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f52025a;
        int i12 = oVar.f52027c;
        g2.m mVar = oVar.f52026b;
        b0 b0Var = oVar.d;
        Uri uri = b0Var.f12230c;
        u2.u uVar = new u2.u(mVar, uri, b0Var.d, j10, j11, b0Var.f12229b);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof r;
        k4.d dVar2 = y2.l.e;
        Uri uri2 = this.f46522a;
        d dVar3 = this.f46530x;
        if (z10 || z11) {
            if (iOException instanceof x) {
                i11 = ((x) iOException).f12288c;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.f46526n = SystemClock.elapsedRealtime();
                c(uri2);
                ng ngVar = dVar3.f46537f;
                String str = n0.f9691a;
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
        u7.s sVar = dVar3.f46536c;
        if (z12) {
            sVar.getClass();
            long H0 = u7.s.H0(zVar);
            if (H0 != -9223372036854775807L) {
                dVar = new k4.d(0, H0, false);
            } else {
                dVar = y2.l.f52021f;
            }
            dVar2 = dVar;
        }
        boolean a2 = dVar2.a();
        dVar3.f46537f.s(uVar, i12, iOException, !a2);
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
            long j12 = oVar.f52025a;
            uVar = new u2.u(oVar.f52026b, j10);
        } else {
            long j13 = oVar.f52025a;
            g2.m mVar = oVar.f52026b;
            b0 b0Var = oVar.d;
            uVar = new u2.u(mVar, b0Var.f12230c, b0Var.d, j10, j11, b0Var.f12229b);
        }
        this.f46530x.f46537f.u(uVar, oVar.f52027c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }
}
