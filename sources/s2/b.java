package s2;

import a8.ma;
import a8.xa;
import android.net.Uri;
import android.os.SystemClock;
import e2.t0;
import h2.l0;
import h9.i0;
import j2.b0;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.telegram.ui.web.t1;
public final class b implements b3.k {
    public final Uri f56866a;
    public final String f56867b;
    public final b3.p f56868c = new b3.p("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final j2.h d;
    public n f56869e;
    public long f56870f;
    public long h;
    public long f56871n;
    public long f56872r;
    public boolean f56873s;
    public IOException f56874w;
    public boolean f56875x;
    public final d f56876y;

    public b(d dVar, Uri uri, String str) {
        this.f56876y = dVar;
        this.f56866a = uri;
        this.f56867b = str;
        this.d = ((j2.g) dVar.f56880a.f29095a).createDataSource();
    }

    public final Uri a() {
        String str;
        n nVar = this.f56869e;
        Uri uri = this.f56866a;
        if (nVar != null) {
            m mVar = nVar.v;
            if (mVar.f56949a != -9223372036854775807L || mVar.f56952e) {
                Uri.Builder buildUpon = uri.buildUpon();
                n nVar2 = this.f56869e;
                if (nVar2.v.f56952e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(nVar2.f56958k + nVar2.f56965r.size()));
                    n nVar3 = this.f56869e;
                    if (nVar3.f56961n != -9223372036854775807L) {
                        i0 i0Var = nVar3.f56966s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((i) h9.o.n(i0Var)).f56934y) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                m mVar2 = this.f56869e.v;
                if (mVar2.f56949a != -9223372036854775807L) {
                    if (mVar2.f56950b) {
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
        d dVar = this.f56876y;
        b3.r z10 = dVar.f56881b.z(dVar.f56887s, this.f56869e);
        Map map = Collections.EMPTY_MAP;
        ma.k(uri, "The uri must be set.");
        b3.s sVar = new b3.s(this.d, new j2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, z10);
        this.f56868c.f(sVar, this, dVar.f56882c.R4(sVar.f2890c));
    }

    public final void c(Uri uri) {
        this.f56872r = 0L;
        if (!this.f56873s) {
            b3.p pVar = this.f56868c;
            if (!pVar.d() && !pVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = this.f56871n;
                if (elapsedRealtime < j3) {
                    this.f56873s = true;
                    this.f56876y.f56885n.postDelayed(new t1(13, this, uri), j3 - elapsedRealtime);
                    return;
                }
                b(uri);
            }
        }
    }

    public final void d(s2.n r75, x2.u r76) {
        throw new UnsupportedOperationException("Method not decompiled: s2.b.d(s2.n, x2.u):void");
    }

    @Override
    public final b3.i k(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        boolean z10;
        int i10;
        b3.i iVar;
        b3.s sVar = (b3.s) mVar;
        long j11 = sVar.f2888a;
        int i11 = sVar.f2890c;
        j2.m mVar2 = sVar.f2889b;
        b0 b0Var = sVar.d;
        Uri uri = b0Var.f17244c;
        x2.u uVar = new x2.u(mVar2, uri, b0Var.d, j3, j10, b0Var.f17243b);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof s;
        b3.i iVar2 = b3.p.f2883e;
        Uri uri2 = this.f56866a;
        d dVar = this.f56876y;
        if (z10 || z11) {
            if (iOException instanceof j2.x) {
                i10 = ((j2.x) iOException).f17313c;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            if (z11 || i10 == 400 || i10 == 503) {
                this.f56871n = SystemClock.elapsedRealtime();
                c(uri2);
                xa xaVar = dVar.f56884f;
                String str = l0.f13778a;
                xaVar.q(uVar, i11, iOException, true);
                return iVar2;
            }
        }
        b3.j jVar = new b3.j(iOException, i7, 0);
        Iterator it = dVar.f56883e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((v) it.next()).b(uri2, jVar, false);
        }
        qb.a aVar = dVar.f56882c;
        if (z12) {
            aVar.getClass();
            long S4 = qb.a.S4(jVar);
            if (S4 != -9223372036854775807L) {
                iVar = new b3.i(0, S4, false);
            } else {
                iVar = b3.p.f2884f;
            }
            iVar2 = iVar;
        }
        boolean a10 = iVar2.a();
        dVar.f56884f.q(uVar, i11, iOException, !a10);
        if (!a10) {
            aVar.getClass();
        }
        return iVar2;
    }

    @Override
    public final void m(b3.m mVar, long j3, long j10, boolean z10) {
        b3.s sVar = (b3.s) mVar;
        long j11 = sVar.f2888a;
        j2.m mVar2 = sVar.f2889b;
        b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.f17244c, b0Var.d, j3, j10, b0Var.f17243b);
        d dVar = this.f56876y;
        dVar.f56882c.getClass();
        dVar.f56884f.n(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void t(b3.m mVar, long j3, long j10, int i7) {
        x2.u uVar;
        b3.s sVar = (b3.s) mVar;
        if (i7 == 0) {
            long j11 = sVar.f2888a;
            uVar = new x2.u(sVar.f2889b, j3);
        } else {
            long j12 = sVar.f2888a;
            j2.m mVar2 = sVar.f2889b;
            b0 b0Var = sVar.d;
            uVar = new x2.u(mVar2, b0Var.f17244c, b0Var.d, j3, j10, b0Var.f17243b);
        }
        this.f56876y.f56884f.s(uVar, sVar.f2890c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
    }

    @Override
    public final void x(b3.m mVar, long j3, long j10) {
        b3.s sVar = (b3.s) mVar;
        r rVar = (r) sVar.f2892f;
        j2.m mVar2 = sVar.f2889b;
        b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.f17244c, b0Var.d, j3, j10, b0Var.f17243b);
        if (rVar instanceof n) {
            d((n) rVar, uVar);
            this.f56876y.f56884f.o(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            t0 b10 = t0.b("Loaded playlist has unexpected type.", null);
            this.f56874w = b10;
            this.f56876y.f56884f.q(uVar, 4, b10, true);
        }
        this.f56876y.f56882c.getClass();
    }
}
