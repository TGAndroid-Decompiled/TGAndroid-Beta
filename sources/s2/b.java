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
import p4.o0;
public final class b implements b3.k {
    public final Uri f56743a;
    public final String f56744b;
    public final b3.p f56745c = new b3.p("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final j2.h d;
    public m f56746e;
    public long f56747f;
    public long h;
    public long f56748n;
    public long f56749r;
    public boolean f56750s;
    public IOException f56751w;
    public boolean f56752x;
    public final d f56753y;

    public b(d dVar, Uri uri, String str) {
        this.f56753y = dVar;
        this.f56743a = uri;
        this.f56744b = str;
        this.d = ((j2.g) dVar.f56757a.f30431a).createDataSource();
    }

    public final Uri a() {
        String str;
        m mVar = this.f56746e;
        Uri uri = this.f56743a;
        if (mVar != null) {
            l lVar = mVar.v;
            if (lVar.f56823a != -9223372036854775807L || lVar.f56826e) {
                Uri.Builder buildUpon = uri.buildUpon();
                m mVar2 = this.f56746e;
                if (mVar2.v.f56826e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(mVar2.f56832k + mVar2.f56839r.size()));
                    m mVar3 = this.f56746e;
                    if (mVar3.f56835n != -9223372036854775807L) {
                        i0 i0Var = mVar3.f56840s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((h) h9.o.n(i0Var)).f56808y) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                l lVar2 = this.f56746e.v;
                if (lVar2.f56823a != -9223372036854775807L) {
                    if (lVar2.f56824b) {
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
        d dVar = this.f56753y;
        b3.r J = dVar.f56758b.J(dVar.f56764s, this.f56746e);
        Map map = Collections.EMPTY_MAP;
        la.k(uri, "The uri must be set.");
        b3.s sVar = new b3.s(this.d, new j2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, J);
        this.f56745c.f(sVar, this, dVar.f56759c.R4(sVar.f2918c));
    }

    public final void c(Uri uri) {
        this.f56749r = 0L;
        if (!this.f56750s) {
            b3.p pVar = this.f56745c;
            if (!pVar.d() && !pVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = this.f56748n;
                if (elapsedRealtime < j3) {
                    this.f56750s = true;
                    this.f56753y.f56762n.postDelayed(new o0(7, this, uri), j3 - elapsedRealtime);
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
        long j11 = sVar.f2916a;
        int i11 = sVar.f2918c;
        j2.m mVar2 = sVar.f2917b;
        b0 b0Var = sVar.d;
        Uri uri = b0Var.f17156c;
        x2.u uVar = new x2.u(mVar2, uri, b0Var.d, j3, j10, b0Var.f17155b);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof r;
        b3.i iVar2 = b3.p.f2911e;
        Uri uri2 = this.f56743a;
        d dVar = this.f56753y;
        if (z10 || z11) {
            if (iOException instanceof x) {
                i10 = ((x) iOException).f17225c;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            if (z11 || i10 == 400 || i10 == 503) {
                this.f56748n = SystemClock.elapsedRealtime();
                c(uri2);
                xa xaVar = dVar.f56761f;
                String str = l0.f13786a;
                xaVar.r(uVar, i11, iOException, true);
                return iVar2;
            }
        }
        b3.j jVar = new b3.j(iOException, i7, 0);
        Iterator it = dVar.f56760e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((u) it.next()).d(uri2, jVar, false);
        }
        qb.a aVar = dVar.f56759c;
        if (z12) {
            aVar.getClass();
            long S4 = qb.a.S4(jVar);
            if (S4 != -9223372036854775807L) {
                iVar = new b3.i(0, S4, false);
            } else {
                iVar = b3.p.f2912f;
            }
            iVar2 = iVar;
        }
        boolean a10 = iVar2.a();
        dVar.f56761f.r(uVar, i11, iOException, !a10);
        if (!a10) {
            aVar.getClass();
        }
        return iVar2;
    }

    @Override
    public final void p(b3.m mVar, long j3, long j10, boolean z10) {
        b3.s sVar = (b3.s) mVar;
        long j11 = sVar.f2916a;
        j2.m mVar2 = sVar.f2917b;
        b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.f17156c, b0Var.d, j3, j10, b0Var.f17155b);
        d dVar = this.f56753y;
        dVar.f56759c.getClass();
        dVar.f56761f.o(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void s(b3.m mVar, long j3, long j10, int i7) {
        x2.u uVar;
        b3.s sVar = (b3.s) mVar;
        if (i7 == 0) {
            long j11 = sVar.f2916a;
            uVar = new x2.u(sVar.f2917b, j3);
        } else {
            long j12 = sVar.f2916a;
            j2.m mVar2 = sVar.f2917b;
            b0 b0Var = sVar.d;
            uVar = new x2.u(mVar2, b0Var.f17156c, b0Var.d, j3, j10, b0Var.f17155b);
        }
        this.f56753y.f56761f.u(uVar, sVar.f2918c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
    }

    @Override
    public final void z(b3.m mVar, long j3, long j10) {
        b3.s sVar = (b3.s) mVar;
        q qVar = (q) sVar.f2920f;
        j2.m mVar2 = sVar.f2917b;
        b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.f17156c, b0Var.d, j3, j10, b0Var.f17155b);
        if (qVar instanceof m) {
            d((m) qVar, uVar);
            this.f56753y.f56761f.p(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            t0 b10 = t0.b("Loaded playlist has unexpected type.", null);
            this.f56751w = b10;
            this.f56753y.f56761f.r(uVar, 4, b10, true);
        }
        this.f56753y.f56759c.getClass();
    }
}
