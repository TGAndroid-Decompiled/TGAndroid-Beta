package p2;

import android.net.Uri;
import android.os.SystemClock;
import b2.w0;
import c5.x;
import e2.l0;
import e9.n0;
import g2.c0;
import g2.y;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.telegram.ui.web.v1;
import v7.t6;
public final class b implements y2.g {
    public final Uri f44534a;
    public final String f44535b;
    public final y2.l f44536c = new y2.l("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h d;
    public m e;
    public long f44537f;
    public long h;
    public long f44538n;
    public long f44539r;
    public boolean f44540s;
    public IOException f44541w;
    public boolean f44542x;
    public final d f44543y;

    public b(d dVar, Uri uri, String str) {
        this.f44543y = dVar;
        this.f44534a = uri;
        this.f44535b = str;
        this.d = ((g2.g) dVar.f44547a.f11587b).createDataSource();
    }

    @Override
    public final void M(y2.i iVar, long j10, long j11, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f54167a;
        g2.n nVar = oVar.f54168b;
        c0 c0Var = oVar.d;
        u2.u uVar = new u2.u(nVar, c0Var.f7284c, c0Var.d, j10, j11, c0Var.f7283b);
        d dVar = this.f44543y;
        dVar.f44549c.getClass();
        dVar.f44550f.p(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri a() {
        String str;
        m mVar = this.e;
        Uri uri = this.f44534a;
        if (mVar != null) {
            l lVar = mVar.v;
            if (lVar.f44609a != -9223372036854775807L || lVar.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                m mVar2 = this.e;
                if (mVar2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(mVar2.f44616k + mVar2.f44623r.size()));
                    m mVar3 = this.e;
                    if (mVar3.f44619n != -9223372036854775807L) {
                        n0 n0Var = mVar3.f44624s;
                        int size = n0Var.size();
                        if (!n0Var.isEmpty() && ((h) e9.s.m(n0Var)).f44595y) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                l lVar2 = this.e.v;
                if (lVar2.f44609a != -9223372036854775807L) {
                    if (lVar2.f44610b) {
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
        d dVar = this.f44543y;
        y2.n a2 = dVar.f44548b.a2(dVar.f44553s, this.e);
        Map map = Collections.EMPTY_MAP;
        t6.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.d, new g2.n(uri, 1, null, map, 0L, -1L, null, 1), 4, a2);
        this.f44536c.f(oVar, this, dVar.f44549c.q0(oVar.f54169c));
    }

    public final void c(Uri uri) {
        this.f44539r = 0L;
        if (!this.f44540s) {
            y2.l lVar = this.f44536c;
            if (!lVar.d() && !lVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = this.f44538n;
                if (elapsedRealtime < j10) {
                    this.f44540s = true;
                    this.f44543y.f44551n.postDelayed(new v1(6, this, uri), j10 - elapsedRealtime);
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
    public final k4.d l(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        int i11;
        k4.d dVar;
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f54167a;
        int i12 = oVar.f54169c;
        g2.n nVar = oVar.f54168b;
        c0 c0Var = oVar.d;
        Uri uri = c0Var.f7284c;
        u2.u uVar = new u2.u(nVar, uri, c0Var.d, j10, j11, c0Var.f7283b);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof r;
        k4.d dVar2 = y2.l.e;
        Uri uri2 = this.f44534a;
        d dVar3 = this.f44543y;
        if (z10 || z11) {
            if (iOException instanceof y) {
                i11 = ((y) iOException).f7347c;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.f44538n = SystemClock.elapsedRealtime();
                c(uri2);
                a5.a aVar = dVar3.f44550f;
                String str = l0.f6165a;
                aVar.s(uVar, i12, iOException, true);
                return dVar2;
            }
        }
        x xVar = new x(iOException, i10, 20);
        Iterator it = dVar3.e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((u) it.next()).b(uri2, xVar, false);
        }
        hb.a aVar2 = dVar3.f44549c;
        if (z12) {
            aVar2.getClass();
            long t02 = hb.a.t0(xVar);
            if (t02 != -9223372036854775807L) {
                dVar = new k4.d(0, t02, false);
            } else {
                dVar = y2.l.f54163f;
            }
            dVar2 = dVar;
        }
        boolean a2 = dVar2.a();
        dVar3.f44550f.s(uVar, i12, iOException, !a2);
        if (!a2) {
            aVar2.getClass();
        }
        return dVar2;
    }

    @Override
    public final void n(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j12 = oVar.f54167a;
            uVar = new u2.u(oVar.f54168b, j10);
        } else {
            long j13 = oVar.f54167a;
            g2.n nVar = oVar.f54168b;
            c0 c0Var = oVar.d;
            uVar = new u2.u(nVar, c0Var.f7284c, c0Var.d, j10, j11, c0Var.f7283b);
        }
        this.f44543y.f44550f.u(uVar, oVar.f54169c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void o(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        q qVar = (q) oVar.f54170f;
        g2.n nVar = oVar.f54168b;
        c0 c0Var = oVar.d;
        u2.u uVar = new u2.u(nVar, c0Var.f7284c, c0Var.d, j10, j11, c0Var.f7283b);
        if (qVar instanceof m) {
            d((m) qVar, uVar);
            this.f44543y.f44550f.q(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            w0 b10 = w0.b("Loaded playlist has unexpected type.", null);
            this.f44541w = b10;
            this.f44543y.f44550f.s(uVar, 4, b10, true);
        }
        this.f44543y.f44549c.getClass();
    }
}
