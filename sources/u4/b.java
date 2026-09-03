package u4;

import android.net.Uri;
import android.os.SystemClock;
import g5.e0;
import g5.h0;
import g5.j0;
import g5.m0;
import g5.p0;
import h5.d0;
import j3.r1;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import p2.v;
import qh.l6;
public final class b implements h0 {
    public final Uri f48279a;
    public final m0 f48280b = new m0("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g5.m f48281c;
    public i d;
    public long f48282e;
    public long f48283f;
    public long h;
    public long f48284n;
    public boolean f48285r;
    public IOException f48286s;
    public final c v;

    public b(c cVar, Uri uri) {
        this.v = cVar;
        this.f48279a = uri;
        this.f48281c = ((g5.l) cVar.f48287a.f17182b).createDataSource();
    }

    public static boolean a(b bVar, long j10) {
        bVar.f48284n = SystemClock.elapsedRealtime() + j10;
        Uri uri = bVar.f48279a;
        c cVar = bVar.v;
        if (!uri.equals(cVar.v)) {
            return false;
        }
        List list = cVar.f48294s.f48342e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) cVar.d.get(((k) list.get(i10)).f48336a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.f48284n) {
                Uri uri2 = bVar2.f48279a;
                cVar.v = uri2;
                bVar2.c(cVar.b(uri2));
                return false;
            }
        }
        return true;
    }

    public final void b(Uri uri) {
        c cVar = this.v;
        p0 p0Var = new p0(this.f48281c, uri, 4, cVar.f48288b.B(cVar.f48294s, this.d));
        ab.a aVar = cVar.f48289c;
        int i10 = p0Var.f6893c;
        this.f48280b.f(p0Var, this, aVar.n3(i10));
        cVar.f48291f.u(new o4.j(p0Var.f6892b), i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void c(Uri uri) {
        this.f48284n = 0L;
        if (!this.f48285r) {
            m0 m0Var = this.f48280b;
            if (!m0Var.d() && !m0Var.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = this.h;
                if (elapsedRealtime < j10) {
                    this.f48285r = true;
                    this.v.f48292n.postDelayed(new l6(21, this, uri), j10 - elapsedRealtime);
                    return;
                }
                b(uri);
            }
        }
    }

    public final void d(u4.i r71) {
        throw new UnsupportedOperationException("Method not decompiled: u4.b.d(u4.i):void");
    }

    @Override
    public final c4.e q(j0 j0Var, IOException iOException, int i10) {
        boolean z4;
        int i11;
        c4.e eVar;
        p0 p0Var = (p0) j0Var;
        long j10 = p0Var.f6891a;
        int i12 = p0Var.f6893c;
        Uri uri = p0Var.d.f6950c;
        ?? obj = new Object();
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z10 = iOException instanceof n;
        c4.e eVar2 = m0.f6873e;
        Uri uri2 = this.f48279a;
        c cVar = this.v;
        if (z4 || z10) {
            if (iOException instanceof e0) {
                i11 = ((e0) iOException).d;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z10 || i11 == 400 || i11 == 503) {
                this.h = SystemClock.elapsedRealtime();
                c(uri2);
                b4.e0 e0Var = cVar.f48291f;
                int i13 = d0.f7237a;
                e0Var.s(obj, i12, iOException, true);
                return eVar2;
            }
        }
        v vVar = new v(iOException, i10, 4);
        Iterator it = cVar.f48290e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !((q) it.next()).c(uri2, vVar, false);
        }
        ab.a aVar = cVar.f48289c;
        if (z11) {
            aVar.getClass();
            long o32 = ab.a.o3(vVar);
            if (o32 != -9223372036854775807L) {
                eVar = new c4.e(0, o32, false);
            } else {
                eVar = m0.f6874f;
            }
            eVar2 = eVar;
        }
        boolean a2 = eVar2.a();
        cVar.f48291f.s(obj, i12, iOException, !a2);
        if (!a2) {
            aVar.getClass();
        }
        return eVar2;
    }

    @Override
    public final void u(j0 j0Var, long j10, long j11, boolean z4) {
        p0 p0Var = (p0) j0Var;
        long j12 = p0Var.f6891a;
        Uri uri = p0Var.d.f6950c;
        ?? obj = new Object();
        c cVar = this.v;
        cVar.f48289c.getClass();
        cVar.f48291f.m(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void x(j0 j0Var, long j10, long j11) {
        p0 p0Var = (p0) j0Var;
        m mVar = (m) p0Var.f6895f;
        Uri uri = p0Var.d.f6950c;
        ?? obj = new Object();
        if (mVar instanceof i) {
            d((i) mVar);
            this.v.f48291f.p(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            r1 b10 = r1.b("Loaded playlist has unexpected type.", null);
            this.f48286s = b10;
            this.v.f48291f.s(obj, 4, b10, true);
        }
        this.v.f48289c.getClass();
    }
}
