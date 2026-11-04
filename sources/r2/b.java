package r2;

import android.net.Uri;
import android.os.SystemClock;
import b8.kg;
import b8.zb;
import d2.v0;
import g2.n0;
import g9.i0;
import i2.c0;
import i2.y;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.telegram.ui.hc1;
public final class b implements a3.k {
    public final Uri f54069a;
    public final String f54070b;
    public final a3.q f54071c = new a3.q("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final i2.h d;
    public m f54072e;
    public long f54073f;
    public long h;
    public long f54074n;
    public long f54075r;
    public boolean f54076s;
    public IOException f54077w;
    public boolean f54078x;
    public final d f54079y;

    public b(d dVar, Uri uri, String str) {
        this.f54079y = dVar;
        this.f54069a = uri;
        this.f54070b = str;
        this.d = ((i2.g) dVar.f54083a.f34636b).createDataSource();
    }

    @Override
    public final void M(a3.m mVar, long j10, long j11, int i3) {
        w2.u uVar;
        a3.t tVar = (a3.t) mVar;
        if (i3 == 0) {
            long j12 = tVar.f110a;
            uVar = new w2.u(tVar.f111b, j10);
        } else {
            long j13 = tVar.f110a;
            i2.n nVar = tVar.f111b;
            c0 c0Var = tVar.d;
            uVar = new w2.u(nVar, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        }
        this.f54079y.f54087f.u(uVar, tVar.f112c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i3);
    }

    public final Uri a() {
        String str;
        m mVar = this.f54072e;
        Uri uri = this.f54069a;
        if (mVar != null) {
            l lVar = mVar.v;
            if (lVar.f54149a != -9223372036854775807L || lVar.f54152e) {
                Uri.Builder buildUpon = uri.buildUpon();
                m mVar2 = this.f54072e;
                if (mVar2.v.f54152e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(mVar2.f54158k + mVar2.f54165r.size()));
                    m mVar3 = this.f54072e;
                    if (mVar3.f54161n != -9223372036854775807L) {
                        i0 i0Var = mVar3.f54166s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((h) g9.o.n(i0Var)).f54134y) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                l lVar2 = this.f54072e.v;
                if (lVar2.f54149a != -9223372036854775807L) {
                    if (lVar2.f54150b) {
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
        d dVar = this.f54079y;
        a3.s j22 = dVar.f54084b.j2(dVar.f54090s, this.f54072e);
        Map map = Collections.EMPTY_MAP;
        zb.k(uri, "The uri must be set.");
        a3.t tVar = new a3.t(this.d, new i2.n(uri, 1, null, map, 0L, -1L, null, 1), 4, j22);
        this.f54071c.f(tVar, this, dVar.f54085c.F4(tVar.f112c));
    }

    public final void c(Uri uri) {
        this.f54075r = 0L;
        if (!this.f54076s) {
            a3.q qVar = this.f54071c;
            if (!qVar.d() && !qVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = this.f54074n;
                if (elapsedRealtime < j10) {
                    this.f54076s = true;
                    this.f54079y.f54088n.postDelayed(new hc1(21, this, uri), j10 - elapsedRealtime);
                    return;
                }
                b(uri);
            }
        }
    }

    public final void d(r2.m r75, w2.u r76) {
        throw new UnsupportedOperationException("Method not decompiled: r2.b.d(r2.m, w2.u):void");
    }

    @Override
    public final void h(a3.m mVar, long j10, long j11) {
        a3.t tVar = (a3.t) mVar;
        q qVar = (q) tVar.f114f;
        i2.n nVar = tVar.f111b;
        c0 c0Var = tVar.d;
        w2.u uVar = new w2.u(nVar, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        if (qVar instanceof m) {
            d((m) qVar, uVar);
            this.f54079y.f54087f.q(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            v0 b10 = v0.b("Loaded playlist has unexpected type.", null);
            this.f54077w = b10;
            this.f54079y.f54087f.s(uVar, 4, b10, true);
        }
        this.f54079y.f54085c.getClass();
    }

    @Override
    public final a3.i k(a3.m mVar, long j10, long j11, IOException iOException, int i3) {
        boolean z10;
        int i10;
        a3.i iVar;
        a3.t tVar = (a3.t) mVar;
        long j12 = tVar.f110a;
        int i11 = tVar.f112c;
        i2.n nVar = tVar.f111b;
        c0 c0Var = tVar.d;
        Uri uri = c0Var.f14529c;
        w2.u uVar = new w2.u(nVar, uri, c0Var.d, j10, j11, c0Var.f14528b);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof r;
        a3.i iVar2 = a3.q.f105e;
        Uri uri2 = this.f54069a;
        d dVar = this.f54079y;
        if (z10 || z11) {
            if (iOException instanceof y) {
                i10 = ((y) iOException).f14601c;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            if (z11 || i10 == 400 || i10 == 503) {
                this.f54074n = SystemClock.elapsedRealtime();
                c(uri2);
                kg kgVar = dVar.f54087f;
                String str = n0.f11873a;
                kgVar.s(uVar, i11, iOException, true);
                return iVar2;
            }
        }
        e5.u uVar2 = new e5.u(iOException, i3, 1);
        Iterator it = dVar.f54086e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((u) it.next()).b(uri2, uVar2, false);
        }
        kb.a aVar = dVar.f54085c;
        if (z12) {
            aVar.getClass();
            long G4 = kb.a.G4(uVar2);
            if (G4 != -9223372036854775807L) {
                iVar = new a3.i(0, G4, false);
            } else {
                iVar = a3.q.f106f;
            }
            iVar2 = iVar;
        }
        boolean a10 = iVar2.a();
        dVar.f54087f.s(uVar, i11, iOException, !a10);
        if (!a10) {
            aVar.getClass();
        }
        return iVar2;
    }

    @Override
    public final void q0(a3.m mVar, long j10, long j11, boolean z10) {
        a3.t tVar = (a3.t) mVar;
        long j12 = tVar.f110a;
        i2.n nVar = tVar.f111b;
        c0 c0Var = tVar.d;
        w2.u uVar = new w2.u(nVar, c0Var.f14529c, c0Var.d, j10, j11, c0Var.f14528b);
        d dVar = this.f54079y;
        dVar.f54085c.getClass();
        dVar.f54087f.p(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
