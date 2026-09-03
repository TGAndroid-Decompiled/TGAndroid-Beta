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
import p2.w;
import ph.e6;
public final class b implements h0 {
    public final Uri f45062a;
    public final m0 f45063b = new m0("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g5.m f45064c;
    public i d;
    public long e;
    public long f45065f;
    public long h;
    public long f45066n;
    public boolean f45067r;
    public IOException f45068s;
    public final c v;

    public b(c cVar, Uri uri) {
        this.v = cVar;
        this.f45062a = uri;
        this.f45064c = ((g5.l) cVar.f45069a.f16228b).createDataSource();
    }

    public static boolean a(b bVar, long j10) {
        bVar.f45066n = SystemClock.elapsedRealtime() + j10;
        Uri uri = bVar.f45062a;
        c cVar = bVar.v;
        if (!uri.equals(cVar.v)) {
            return false;
        }
        List list = cVar.f45075s.e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) cVar.d.get(((k) list.get(i10)).f45114a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.f45066n) {
                Uri uri2 = bVar2.f45062a;
                cVar.v = uri2;
                bVar2.c(cVar.b(uri2));
                return false;
            }
        }
        return true;
    }

    @Override
    public final c4.e X(j0 j0Var, IOException iOException, int i10) {
        boolean z4;
        int i11;
        c4.e eVar;
        p0 p0Var = (p0) j0Var;
        long j10 = p0Var.f6406a;
        int i12 = p0Var.f6408c;
        Uri uri = p0Var.d.f6458c;
        ?? obj = new Object();
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z10 = iOException instanceof n;
        c4.e eVar2 = m0.e;
        Uri uri2 = this.f45062a;
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
                b4.e0 e0Var = cVar.f45072f;
                int i13 = d0.f6924a;
                e0Var.s(obj, i12, iOException, true);
                return eVar2;
            }
        }
        w wVar = new w(iOException, i10, 4);
        Iterator it = cVar.e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !((q) it.next()).c(uri2, wVar, false);
        }
        z9.d dVar = cVar.f45071c;
        if (z11) {
            dVar.getClass();
            long v = z9.d.v(wVar);
            if (v != -9223372036854775807L) {
                eVar = new c4.e(0, v, false);
            } else {
                eVar = m0.f6391f;
            }
            eVar2 = eVar;
        }
        boolean a2 = eVar2.a();
        cVar.f45072f.s(obj, i12, iOException, !a2);
        if (!a2) {
            dVar.getClass();
        }
        return eVar2;
    }

    public final void b(Uri uri) {
        c cVar = this.v;
        p0 p0Var = new p0(this.f45064c, uri, 4, cVar.f45070b.k(cVar.f45075s, this.d));
        z9.d dVar = cVar.f45071c;
        int i10 = p0Var.f6408c;
        this.f45063b.f(p0Var, this, dVar.p(i10));
        cVar.f45072f.u(new o4.j(p0Var.f6407b), i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void c(Uri uri) {
        this.f45066n = 0L;
        if (!this.f45067r) {
            m0 m0Var = this.f45063b;
            if (!m0Var.d() && !m0Var.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = this.h;
                if (elapsedRealtime < j10) {
                    this.f45067r = true;
                    this.v.f45073n.postDelayed(new e6(28, this, uri), j10 - elapsedRealtime);
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
    public final void k1(j0 j0Var, long j10, long j11) {
        p0 p0Var = (p0) j0Var;
        m mVar = (m) p0Var.f6409f;
        Uri uri = p0Var.d.f6458c;
        ?? obj = new Object();
        if (mVar instanceof i) {
            d((i) mVar);
            this.v.f45072f.p(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            r1 b10 = r1.b("Loaded playlist has unexpected type.", null);
            this.f45068s = b10;
            this.v.f45072f.s(obj, 4, b10, true);
        }
        this.v.f45071c.getClass();
    }

    @Override
    public final void x0(j0 j0Var, long j10, long j11, boolean z4) {
        p0 p0Var = (p0) j0Var;
        long j12 = p0Var.f6406a;
        Uri uri = p0Var.d.f6458c;
        ?? obj = new Object();
        c cVar = this.v;
        cVar.f45071c.getClass();
        cVar.f45072f.m(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
