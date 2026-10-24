package p2;

import android.net.Uri;
import android.os.SystemClock;
import b2.w0;
import c5.c0;
import e2.m0;
import e9.n0;
import g2.b0;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import v7.u6;
public final class c implements y2.g {
    public final Uri f44344a;
    public final String f44345b;
    public final y2.l f44346c = new y2.l("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h d;
    public n e;
    public long f44347f;
    public long h;
    public long f44348n;
    public long f44349r;
    public boolean f44350s;
    public IOException v;
    public boolean f44351w;
    public final e f44352x;

    public c(e eVar, Uri uri, String str) {
        this.f44352x = eVar;
        this.f44344a = uri;
        this.f44345b = str;
        this.d = ((g2.g) eVar.f44356a.f15906b).createDataSource();
    }

    public final Uri a() {
        String str;
        n nVar = this.e;
        Uri uri = this.f44344a;
        if (nVar != null) {
            m mVar = nVar.v;
            if (mVar.f44417a != -9223372036854775807L || mVar.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                n nVar2 = this.e;
                if (nVar2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(nVar2.f44424k + nVar2.f44431r.size()));
                    n nVar3 = this.e;
                    if (nVar3.f44427n != -9223372036854775807L) {
                        n0 n0Var = nVar3.f44432s;
                        int size = n0Var.size();
                        if (!n0Var.isEmpty() && ((i) e9.s.m(n0Var)).f44404x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                m mVar2 = this.e.v;
                if (mVar2.f44417a != -9223372036854775807L) {
                    if (mVar2.f44418b) {
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
        e eVar = this.f44352x;
        y2.n U = eVar.f44357b.U(eVar.f44362s, this.e);
        Map map = Collections.EMPTY_MAP;
        u6.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.d, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, U);
        this.f44346c.f(oVar, this, eVar.f44358c.y3(oVar.f50379c));
    }

    public final void c(Uri uri) {
        this.f44349r = 0L;
        if (!this.f44350s) {
            y2.l lVar = this.f44346c;
            if (!lVar.d() && !lVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = this.f44348n;
                if (elapsedRealtime < j10) {
                    this.f44350s = true;
                    this.f44352x.f44360n.postDelayed(new b(0, this, uri), j10 - elapsedRealtime);
                    return;
                }
                b(uri);
            }
        }
    }

    public final void d(p2.n r75, u2.v r76) {
        throw new UnsupportedOperationException("Method not decompiled: p2.c.d(p2.n, u2.v):void");
    }

    @Override
    public final k4.d e(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        int i11;
        k4.d dVar;
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f50377a;
        int i12 = oVar.f50379c;
        g2.m mVar = oVar.f50378b;
        b0 b0Var = oVar.d;
        Uri uri = b0Var.f10783c;
        u2.v vVar = new u2.v(mVar, uri, b0Var.d, j10, j11, b0Var.f10782b);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof s;
        k4.d dVar2 = y2.l.e;
        Uri uri2 = this.f44344a;
        e eVar = this.f44352x;
        if (z10 || z11) {
            if (iOException instanceof g2.x) {
                i11 = ((g2.x) iOException).f10841c;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.f44348n = SystemClock.elapsedRealtime();
                c(uri2);
                a5.a aVar = eVar.f44359f;
                String str = m0.f8259a;
                aVar.t(vVar, i12, iOException, true);
                return dVar2;
            }
        }
        c0 c0Var = new c0(iOException, i10, 17);
        Iterator it = eVar.e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((v) it.next()).b(uri2, c0Var, false);
        }
        oa.d dVar3 = eVar.f44358c;
        if (z12) {
            dVar3.getClass();
            long z32 = oa.d.z3(c0Var);
            if (z32 != -9223372036854775807L) {
                dVar = new k4.d(0, z32, false);
            } else {
                dVar = y2.l.f50373f;
            }
            dVar2 = dVar;
        }
        boolean a2 = dVar2.a();
        eVar.f44359f.t(vVar, i12, iOException, !a2);
        if (!a2) {
            dVar3.getClass();
        }
        return dVar2;
    }

    @Override
    public final void j(y2.i iVar, long j10, long j11, int i10) {
        u2.v vVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j12 = oVar.f50377a;
            vVar = new u2.v(oVar.f50378b, j10);
        } else {
            long j13 = oVar.f50377a;
            g2.m mVar = oVar.f50378b;
            b0 b0Var = oVar.d;
            vVar = new u2.v(mVar, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b);
        }
        this.f44352x.f44359f.v(vVar, oVar.f50379c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void k(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        r rVar = (r) oVar.f50380f;
        g2.m mVar = oVar.f50378b;
        b0 b0Var = oVar.d;
        u2.v vVar = new u2.v(mVar, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b);
        if (rVar instanceof n) {
            d((n) rVar, vVar);
            this.f44352x.f44359f.r(vVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            w0 b10 = w0.b("Loaded playlist has unexpected type.", null);
            this.v = b10;
            this.f44352x.f44359f.t(vVar, 4, b10, true);
        }
        this.f44352x.f44358c.getClass();
    }

    @Override
    public final void z(y2.i iVar, long j10, long j11, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.f50377a;
        g2.m mVar = oVar.f50378b;
        b0 b0Var = oVar.d;
        u2.v vVar = new u2.v(mVar, b0Var.f10783c, b0Var.d, j10, j11, b0Var.f10782b);
        e eVar = this.f44352x;
        eVar.f44358c.getClass();
        eVar.f44359f.q(vVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
