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
    public final Uri f54615a;
    public final String f54616b;
    public final b3.o f54617c = new b3.o("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final j2.h d;
    public m f54618e;
    public long f54619f;
    public long h;
    public long f54620n;
    public long f54621r;
    public boolean f54622s;
    public IOException f54623w;
    public boolean f54624x;
    public final d f54625y;

    public b(d dVar, Uri uri, String str) {
        this.f54625y = dVar;
        this.f54615a = uri;
        this.f54616b = str;
        this.d = ((j2.g) dVar.f54629a.f35778a).createDataSource();
    }

    @Override
    public final void M0(b3.l lVar, long j3, long j10, int i7) {
        x2.t tVar;
        b3.r rVar = (b3.r) lVar;
        if (i7 == 0) {
            long j11 = rVar.f2965a;
            tVar = new x2.t(rVar.f2966b, j3);
        } else {
            long j12 = rVar.f2965a;
            j2.m mVar = rVar.f2966b;
            c0 c0Var = rVar.d;
            tVar = new x2.t(mVar, c0Var.f16417c, c0Var.d, j3, j10, c0Var.f16416b);
        }
        this.f54625y.f54633f.t(tVar, rVar.f2967c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
    }

    public final Uri a() {
        String str;
        m mVar = this.f54618e;
        Uri uri = this.f54615a;
        if (mVar != null) {
            l lVar = mVar.v;
            if (lVar.f54695a != -9223372036854775807L || lVar.f54698e) {
                Uri.Builder buildUpon = uri.buildUpon();
                m mVar2 = this.f54618e;
                if (mVar2.v.f54698e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(mVar2.f54704k + mVar2.f54711r.size()));
                    m mVar3 = this.f54618e;
                    if (mVar3.f54707n != -9223372036854775807L) {
                        i0 i0Var = mVar3.f54712s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((h) h9.o.n(i0Var)).f54680y) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                l lVar2 = this.f54618e.v;
                if (lVar2.f54695a != -9223372036854775807L) {
                    if (lVar2.f54696b) {
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
        d dVar = this.f54625y;
        b3.q I = dVar.f54630b.I(dVar.f54636s, this.f54618e);
        Map map = Collections.EMPTY_MAP;
        ia.k(uri, "The uri must be set.");
        b3.r rVar = new b3.r(this.d, new j2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, I);
        this.f54617c.f(rVar, this, dVar.f54631c.X0(rVar.f2967c));
    }

    public final void c(Uri uri) {
        this.f54621r = 0L;
        if (!this.f54622s) {
            b3.o oVar = this.f54617c;
            if (!oVar.d() && !oVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = this.f54620n;
                if (elapsedRealtime < j3) {
                    this.f54622s = true;
                    this.f54625y.f54634n.postDelayed(new org.telegram.ui.web.s(18, this, uri), j3 - elapsedRealtime);
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
    public final b3.i o0(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        boolean z9;
        int i10;
        b3.i iVar;
        b3.r rVar = (b3.r) lVar;
        long j11 = rVar.f2965a;
        int i11 = rVar.f2967c;
        j2.m mVar = rVar.f2966b;
        c0 c0Var = rVar.d;
        Uri uri = c0Var.f16417c;
        x2.t tVar = new x2.t(mVar, uri, c0Var.d, j3, j10, c0Var.f16416b);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z10 = iOException instanceof r;
        b3.i iVar2 = b3.o.f2960e;
        Uri uri2 = this.f54615a;
        d dVar = this.f54625y;
        if (z9 || z10) {
            if (iOException instanceof y) {
                i10 = ((y) iOException).f16489c;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            if (z10 || i10 == 400 || i10 == 503) {
                this.f54620n = SystemClock.elapsedRealtime();
                c(uri2);
                wa waVar = dVar.f54633f;
                String str = m0.f14114a;
                waVar.r(tVar, i11, iOException, true);
                return iVar2;
            }
        }
        f5.u uVar = new f5.u(iOException, i7, 2);
        Iterator it = dVar.f54632e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !((u) it.next()).d(uri2, uVar, false);
        }
        pb.b bVar = dVar.f54631c;
        if (z11) {
            bVar.getClass();
            long a12 = pb.b.a1(uVar);
            if (a12 != -9223372036854775807L) {
                iVar = new b3.i(0, a12, false);
            } else {
                iVar = b3.o.f2961f;
            }
            iVar2 = iVar;
        }
        boolean a10 = iVar2.a();
        dVar.f54633f.r(tVar, i11, iOException, !a10);
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
        x2.t tVar = new x2.t(mVar, c0Var.f16417c, c0Var.d, j3, j10, c0Var.f16416b);
        if (qVar instanceof m) {
            d((m) qVar, tVar);
            this.f54625y.f54633f.p(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            t0 b10 = t0.b("Loaded playlist has unexpected type.", null);
            this.f54623w = b10;
            this.f54625y.f54633f.r(tVar, 4, b10, true);
        }
        this.f54625y.f54631c.getClass();
    }

    @Override
    public final void q0(b3.l lVar, long j3, long j10, boolean z9) {
        b3.r rVar = (b3.r) lVar;
        long j11 = rVar.f2965a;
        j2.m mVar = rVar.f2966b;
        c0 c0Var = rVar.d;
        x2.t tVar = new x2.t(mVar, c0Var.f16417c, c0Var.d, j3, j10, c0Var.f16416b);
        d dVar = this.f54625y;
        dVar.f54631c.getClass();
        dVar.f54633f.o(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
