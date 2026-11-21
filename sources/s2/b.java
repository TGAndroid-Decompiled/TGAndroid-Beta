package s2;

import a8.la;
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
import p4.z;
public final class b implements b3.k {
    public final Uri f56784a;
    public final String f56785b;
    public final b3.p f56786c = new b3.p("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final j2.h d;
    public m f56787e;
    public long f56788f;
    public long h;
    public long f56789n;
    public long f56790r;
    public boolean f56791s;
    public IOException f56792w;
    public boolean f56793x;
    public final d f56794y;

    public b(d dVar, Uri uri, String str) {
        this.f56794y = dVar;
        this.f56784a = uri;
        this.f56785b = str;
        this.d = ((j2.g) dVar.f56798a.f30505a).createDataSource();
    }

    public final Uri a() {
        String str;
        m mVar = this.f56787e;
        Uri uri = this.f56784a;
        if (mVar != null) {
            l lVar = mVar.v;
            if (lVar.f56864a != -9223372036854775807L || lVar.f56867e) {
                Uri.Builder buildUpon = uri.buildUpon();
                m mVar2 = this.f56787e;
                if (mVar2.v.f56867e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(mVar2.f56873k + mVar2.f56880r.size()));
                    m mVar3 = this.f56787e;
                    if (mVar3.f56876n != -9223372036854775807L) {
                        i0 i0Var = mVar3.f56881s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((h) h9.o.n(i0Var)).f56849y) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                l lVar2 = this.f56787e.v;
                if (lVar2.f56864a != -9223372036854775807L) {
                    if (lVar2.f56865b) {
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
        d dVar = this.f56794y;
        b3.r J = dVar.f56799b.J(dVar.f56805s, this.f56787e);
        Map map = Collections.EMPTY_MAP;
        la.k(uri, "The uri must be set.");
        b3.s sVar = new b3.s(this.d, new j2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, J);
        this.f56786c.f(sVar, this, dVar.f56800c.R4(sVar.f2931c));
    }

    public final void c(Uri uri) {
        this.f56790r = 0L;
        if (!this.f56791s) {
            b3.p pVar = this.f56786c;
            if (!pVar.d() && !pVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = this.f56789n;
                if (elapsedRealtime < j3) {
                    this.f56791s = true;
                    this.f56794y.f56803n.postDelayed(new z(9, this, uri), j3 - elapsedRealtime);
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
        long j11 = sVar.f2929a;
        int i11 = sVar.f2931c;
        j2.m mVar2 = sVar.f2930b;
        b0 b0Var = sVar.d;
        Uri uri = b0Var.f17178c;
        x2.u uVar = new x2.u(mVar2, uri, b0Var.d, j3, j10, b0Var.f17177b);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof r;
        b3.i iVar2 = b3.p.f2924e;
        Uri uri2 = this.f56784a;
        d dVar = this.f56794y;
        if (z10 || z11) {
            if (iOException instanceof x) {
                i10 = ((x) iOException).f17247c;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            if (z11 || i10 == 400 || i10 == 503) {
                this.f56789n = SystemClock.elapsedRealtime();
                c(uri2);
                xa xaVar = dVar.f56802f;
                String str = l0.f13812a;
                xaVar.r(uVar, i11, iOException, true);
                return iVar2;
            }
        }
        b3.j jVar = new b3.j(iOException, i7, 0);
        Iterator it = dVar.f56801e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((u) it.next()).d(uri2, jVar, false);
        }
        qb.a aVar = dVar.f56800c;
        if (z12) {
            aVar.getClass();
            long S4 = qb.a.S4(jVar);
            if (S4 != -9223372036854775807L) {
                iVar = new b3.i(0, S4, false);
            } else {
                iVar = b3.p.f2925f;
            }
            iVar2 = iVar;
        }
        boolean a10 = iVar2.a();
        dVar.f56802f.r(uVar, i11, iOException, !a10);
        if (!a10) {
            aVar.getClass();
        }
        return iVar2;
    }

    @Override
    public final void p(b3.m mVar, long j3, long j10, boolean z10) {
        b3.s sVar = (b3.s) mVar;
        long j11 = sVar.f2929a;
        j2.m mVar2 = sVar.f2930b;
        b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.f17178c, b0Var.d, j3, j10, b0Var.f17177b);
        d dVar = this.f56794y;
        dVar.f56800c.getClass();
        dVar.f56802f.o(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void s(b3.m mVar, long j3, long j10, int i7) {
        x2.u uVar;
        b3.s sVar = (b3.s) mVar;
        if (i7 == 0) {
            long j11 = sVar.f2929a;
            uVar = new x2.u(sVar.f2930b, j3);
        } else {
            long j12 = sVar.f2929a;
            j2.m mVar2 = sVar.f2930b;
            b0 b0Var = sVar.d;
            uVar = new x2.u(mVar2, b0Var.f17178c, b0Var.d, j3, j10, b0Var.f17177b);
        }
        this.f56794y.f56802f.u(uVar, sVar.f2931c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
    }

    @Override
    public final void z(b3.m mVar, long j3, long j10) {
        b3.s sVar = (b3.s) mVar;
        q qVar = (q) sVar.f2933f;
        j2.m mVar2 = sVar.f2930b;
        b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.f17178c, b0Var.d, j3, j10, b0Var.f17177b);
        if (qVar instanceof m) {
            d((m) qVar, uVar);
            this.f56794y.f56802f.p(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            t0 b10 = t0.b("Loaded playlist has unexpected type.", null);
            this.f56792w = b10;
            this.f56794y.f56802f.r(uVar, 4, b10, true);
        }
        this.f56794y.f56800c.getClass();
    }
}
