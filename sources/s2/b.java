package s2;

import a8.ia;
import a8.wa;
import android.net.Uri;
import android.os.SystemClock;
import e2.t0;
import h2.m0;
import h9.i0;
import j2.c0;
import j2.y;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
public final class b implements b3.j {
    public final Uri f54512a;
    public final String f54513b;
    public final b3.o f54514c = new b3.o("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final j2.h d;
    public m f54515e;
    public long f54516f;
    public long h;
    public long f54517n;
    public long f54518r;
    public boolean f54519s;
    public IOException f54520w;
    public boolean f54521x;
    public final d f54522y;

    public b(d dVar, Uri uri, String str) {
        this.f54522y = dVar;
        this.f54512a = uri;
        this.f54513b = str;
        this.d = ((j2.g) dVar.f54526a.f36104a).createDataSource();
    }

    @Override
    public final void M0(b3.l lVar, long j3, long j10, int i7) {
        x2.u uVar;
        b3.r rVar = (b3.r) lVar;
        if (i7 == 0) {
            long j11 = rVar.f2965a;
            uVar = new x2.u(rVar.f2966b, j3);
        } else {
            long j12 = rVar.f2965a;
            j2.m mVar = rVar.f2966b;
            c0 c0Var = rVar.d;
            uVar = new x2.u(mVar, c0Var.f16414c, c0Var.d, j3, j10, c0Var.f16413b);
        }
        this.f54522y.f54530f.t(uVar, rVar.f2967c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
    }

    public final Uri a() {
        String str;
        m mVar = this.f54515e;
        Uri uri = this.f54512a;
        if (mVar != null) {
            l lVar = mVar.v;
            if (lVar.f54592a != -9223372036854775807L || lVar.f54595e) {
                Uri.Builder buildUpon = uri.buildUpon();
                m mVar2 = this.f54515e;
                if (mVar2.v.f54595e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(mVar2.f54601k + mVar2.f54608r.size()));
                    m mVar3 = this.f54515e;
                    if (mVar3.f54604n != -9223372036854775807L) {
                        i0 i0Var = mVar3.f54609s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((h) h9.o.n(i0Var)).f54577y) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                l lVar2 = this.f54515e.v;
                if (lVar2.f54592a != -9223372036854775807L) {
                    if (lVar2.f54593b) {
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
        d dVar = this.f54522y;
        b3.q I = dVar.f54527b.I(dVar.f54533s, this.f54515e);
        Map map = Collections.EMPTY_MAP;
        ia.k(uri, "The uri must be set.");
        b3.r rVar = new b3.r(this.d, new j2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, I);
        this.f54514c.f(rVar, this, dVar.f54528c.X0(rVar.f2967c));
    }

    public final void c(Uri uri) {
        this.f54518r = 0L;
        if (!this.f54519s) {
            b3.o oVar = this.f54514c;
            if (!oVar.d() && !oVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = this.f54517n;
                if (elapsedRealtime < j3) {
                    this.f54519s = true;
                    this.f54522y.f54531n.postDelayed(new org.telegram.ui.web.w(22, this, uri), j3 - elapsedRealtime);
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
    public final b3.i o0(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        boolean z9;
        int i10;
        b3.i iVar;
        b3.r rVar = (b3.r) lVar;
        long j11 = rVar.f2965a;
        int i11 = rVar.f2967c;
        j2.m mVar = rVar.f2966b;
        c0 c0Var = rVar.d;
        Uri uri = c0Var.f16414c;
        x2.u uVar = new x2.u(mVar, uri, c0Var.d, j3, j10, c0Var.f16413b);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z10 = iOException instanceof r;
        b3.i iVar2 = b3.o.f2960e;
        Uri uri2 = this.f54512a;
        d dVar = this.f54522y;
        if (z9 || z10) {
            if (iOException instanceof y) {
                i10 = ((y) iOException).f16486c;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            if (z10 || i10 == 400 || i10 == 503) {
                this.f54517n = SystemClock.elapsedRealtime();
                c(uri2);
                wa waVar = dVar.f54530f;
                String str = m0.f14112a;
                waVar.r(uVar, i11, iOException, true);
                return iVar2;
            }
        }
        f5.u uVar2 = new f5.u(iOException, i7, 2);
        Iterator it = dVar.f54529e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !((u) it.next()).d(uri2, uVar2, false);
        }
        pb.b bVar = dVar.f54528c;
        if (z11) {
            bVar.getClass();
            long a12 = pb.b.a1(uVar2);
            if (a12 != -9223372036854775807L) {
                iVar = new b3.i(0, a12, false);
            } else {
                iVar = b3.o.f2961f;
            }
            iVar2 = iVar;
        }
        boolean a10 = iVar2.a();
        dVar.f54530f.r(uVar, i11, iOException, !a10);
        if (!a10) {
            bVar.getClass();
        }
        return iVar2;
    }

    @Override
    public final void o1(b3.l lVar, long j3, long j10) {
        b3.r rVar = (b3.r) lVar;
        q qVar = (q) rVar.f2969f;
        j2.m mVar = rVar.f2966b;
        c0 c0Var = rVar.d;
        x2.u uVar = new x2.u(mVar, c0Var.f16414c, c0Var.d, j3, j10, c0Var.f16413b);
        if (qVar instanceof m) {
            d((m) qVar, uVar);
            this.f54522y.f54530f.p(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            t0 b10 = t0.b("Loaded playlist has unexpected type.", null);
            this.f54520w = b10;
            this.f54522y.f54530f.r(uVar, 4, b10, true);
        }
        this.f54522y.f54528c.getClass();
    }

    @Override
    public final void q0(b3.l lVar, long j3, long j10, boolean z9) {
        b3.r rVar = (b3.r) lVar;
        long j11 = rVar.f2965a;
        j2.m mVar = rVar.f2966b;
        c0 c0Var = rVar.d;
        x2.u uVar = new x2.u(mVar, c0Var.f16414c, c0Var.d, j3, j10, c0Var.f16413b);
        d dVar = this.f54522y;
        dVar.f54528c.getClass();
        dVar.f54530f.o(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
