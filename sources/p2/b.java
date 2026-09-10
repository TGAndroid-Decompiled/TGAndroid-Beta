package p2;

import android.net.Uri;
import android.os.SystemClock;
import b2.s0;
import c5.b0;
import e2.d0;
import e9.i0;
import g2.x;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.ui.web.x1;
import u2.u;
public final class b implements y2.i {
    public final Uri f39524a;
    public final y2.n f39525b = new y2.n("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h f39526c;
    public l d;
    public long e;
    public long f39527f;
    public long h;
    public long f39528n;
    public boolean f39529r;
    public IOException f39530s;
    public boolean v;
    public final c f39531w;

    public b(c cVar, Uri uri) {
        this.f39531w = cVar;
        this.f39524a = uri;
        this.f39526c = ((g2.g) cVar.f39532a.f12721b).createDataSource();
    }

    public static boolean a(b bVar, long j3) {
        bVar.f39528n = SystemClock.elapsedRealtime() + j3;
        Uri uri = bVar.f39524a;
        c cVar = bVar.f39531w;
        if (!uri.equals(cVar.v)) {
            return false;
        }
        List list = cVar.f39538s.e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) cVar.d.get(((n) list.get(i10)).f39609a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.f39528n) {
                Uri uri2 = bVar2.f39524a;
                cVar.v = uri2;
                bVar2.e(cVar.b(uri2));
                return false;
            }
        }
        return true;
    }

    @Override
    public final void C(y2.k kVar, long j3, long j10, boolean z10) {
        y2.q qVar = (y2.q) kVar;
        long j11 = qVar.f46448a;
        Uri uri = qVar.d.f8480c;
        u uVar = new u(j10);
        c cVar = this.f39531w;
        cVar.f39534c.getClass();
        cVar.f39535f.m(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri b() {
        String str;
        l lVar = this.d;
        Uri uri = this.f39524a;
        if (lVar != null) {
            k kVar = lVar.v;
            if (kVar.f39587a != -9223372036854775807L || kVar.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                l lVar2 = this.d;
                if (lVar2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(lVar2.f39594k + lVar2.f39601r.size()));
                    l lVar3 = this.d;
                    if (lVar3.f39597n != -9223372036854775807L) {
                        i0 i0Var = lVar3.f39602s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((g) e9.q.l(i0Var)).f39574x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                k kVar2 = this.d.v;
                if (kVar2.f39587a != -9223372036854775807L) {
                    if (kVar2.f39588b) {
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

    public final void c(boolean z10) {
        Uri uri;
        if (z10) {
            uri = b();
        } else {
            uri = this.f39524a;
        }
        e(uri);
    }

    public final void d(Uri uri) {
        c cVar = this.f39531w;
        y2.p T = cVar.f39533b.T(cVar.f39538s, this.d);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.q qVar = new y2.q(this.f39526c, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, T);
        this.f39525b.f(qVar, this, cVar.f39534c.o3(qVar.f46450c));
    }

    public final void e(Uri uri) {
        this.f39528n = 0L;
        if (!this.f39529r) {
            y2.n nVar = this.f39525b;
            if (!nVar.d() && !nVar.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = this.h;
                if (elapsedRealtime < j3) {
                    this.f39529r = true;
                    this.f39531w.f39536n.postDelayed(new x1(3, this, uri), j3 - elapsedRealtime);
                    return;
                }
                d(uri);
            }
        }
    }

    public final void f(p2.l r73, u2.u r74) {
        throw new UnsupportedOperationException("Method not decompiled: p2.b.f(p2.l, u2.u):void");
    }

    @Override
    public final k4.d k(y2.k kVar, long j3, long j10, IOException iOException, int i10) {
        boolean z10;
        int i11;
        k4.d dVar;
        y2.q qVar = (y2.q) kVar;
        long j11 = qVar.f46448a;
        int i12 = qVar.f46450c;
        Uri uri = qVar.d.f8480c;
        u uVar = new u(j10);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof q;
        k4.d dVar2 = y2.n.e;
        c cVar = this.f39531w;
        if (z10 || z11) {
            if (iOException instanceof x) {
                i11 = ((x) iOException).d;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.h = SystemClock.elapsedRealtime();
                c(false);
                a5.a aVar = cVar.f39535f;
                String str = d0.f7188a;
                aVar.q(uVar, i12, iOException, true);
                return dVar2;
            }
        }
        b0 b0Var = new b0(iOException, i10, 11);
        Iterator it = cVar.e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((t) it.next()).b(this.f39524a, b0Var, false);
        }
        rb.a aVar2 = cVar.f39534c;
        if (z12) {
            aVar2.getClass();
            long p32 = rb.a.p3(b0Var);
            if (p32 != -9223372036854775807L) {
                dVar = new k4.d(0, p32, false);
            } else {
                dVar = y2.n.f46444f;
            }
            dVar2 = dVar;
        }
        boolean a2 = dVar2.a();
        cVar.f39535f.q(uVar, i12, iOException, !a2);
        if (!a2) {
            aVar2.getClass();
        }
        return dVar2;
    }

    @Override
    public final void l(y2.k kVar, long j3, long j10, int i10) {
        u uVar;
        y2.q qVar = (y2.q) kVar;
        if (i10 == 0) {
            long j11 = qVar.f46448a;
            uVar = new u(qVar.f46449b);
        } else {
            long j12 = qVar.f46448a;
            Uri uri = qVar.d.f8480c;
            uVar = new u(j10);
        }
        this.f39531w.f39535f.r(uVar, qVar.f46450c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void p(y2.k kVar, long j3, long j10) {
        y2.q qVar = (y2.q) kVar;
        p pVar = (p) qVar.f46451f;
        Uri uri = qVar.d.f8480c;
        u uVar = new u(j10);
        if (pVar instanceof l) {
            f((l) pVar, uVar);
            this.f39531w.f39535f.o(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            s0 b10 = s0.b("Loaded playlist has unexpected type.", null);
            this.f39530s = b10;
            this.f39531w.f39535f.q(uVar, 4, b10, true);
        }
        this.f39531w.f39534c.getClass();
    }
}
