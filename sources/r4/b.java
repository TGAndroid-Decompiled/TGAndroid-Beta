package r4;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import f5.d0;
import f7.v;
import j3.t1;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import l4.g0;
import org.telegram.ui.web.y;
import p2.u;
public final class b implements l0 {
    public final Uri f46936a;
    public final q0 f46937b = new q0("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final com.google.android.exoplayer2.upstream.m f46938c;
    public j d;
    public long f46939e;
    public long f46940f;
    public long h;
    public long f46941n;
    public boolean f46942r;
    public IOException f46943s;
    public final c v;

    public b(c cVar, Uri uri) {
        this.v = cVar;
        this.f46936a = uri;
        this.f46938c = ((com.google.android.exoplayer2.upstream.l) cVar.f46944a.f19014b).createDataSource();
    }

    public static boolean a(b bVar, long j10) {
        bVar.f46941n = SystemClock.elapsedRealtime() + j10;
        Uri uri = bVar.f46936a;
        c cVar = bVar.v;
        if (!uri.equals(cVar.v)) {
            return false;
        }
        List list = cVar.f46951s.f46999e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) cVar.d.get(((l) list.get(i10)).f46993a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.f46941n) {
                Uri uri2 = bVar2.f46936a;
                cVar.v = uri2;
                bVar2.c(cVar.b(uri2));
                return false;
            }
        }
        return true;
    }

    public final void b(Uri uri) {
        c cVar = this.v;
        t0 t0Var = new t0(this.f46938c, uri, 4, cVar.f46945b.q0(cVar.f46951s, this.d));
        v vVar = cVar.f46946c;
        int i10 = t0Var.f3622c;
        this.f46937b.f(t0Var, this, vVar.B(i10));
        cVar.f46948f.k(new l4.p(t0Var.f3621b), i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void c(Uri uri) {
        this.f46941n = 0L;
        if (!this.f46942r) {
            q0 q0Var = this.f46937b;
            if (!q0Var.d() && !q0Var.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = this.h;
                if (elapsedRealtime < j10) {
                    this.f46942r = true;
                    this.v.f46949n.postDelayed(new y(19, this, uri), j10 - elapsedRealtime);
                    return;
                }
                b(uri);
            }
        }
    }

    public final void d(r4.j r71) {
        throw new UnsupportedOperationException("Method not decompiled: r4.b.d(r4.j):void");
    }

    @Override
    public final void g(n0 n0Var, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) n0Var;
        long j12 = t0Var.f3620a;
        Uri uri = t0Var.d.f3667c;
        ?? obj = new Object();
        c cVar = this.v;
        cVar.f46946c.getClass();
        cVar.f46948f.d(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final k0 j(n0 n0Var, IOException iOException, int i10) {
        boolean z10;
        int i11;
        k0 k0Var;
        t0 t0Var = (t0) n0Var;
        long j10 = t0Var.f3620a;
        int i12 = t0Var.f3622c;
        Uri uri = t0Var.d.f3667c;
        ?? obj = new Object();
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof o;
        k0 k0Var2 = q0.f3605e;
        Uri uri2 = this.f46936a;
        c cVar = this.v;
        if (z10 || z11) {
            if (iOException instanceof h0) {
                i11 = ((h0) iOException).d;
            } else {
                i11 = Integer.MAX_VALUE;
            }
            if (z11 || i11 == 400 || i11 == 503) {
                this.h = SystemClock.elapsedRealtime();
                c(uri2);
                g0 g0Var = cVar.f46948f;
                int i13 = d0.f6579a;
                g0Var.i(obj, i12, iOException, true);
                return k0Var2;
            }
        }
        u uVar = new u(iOException, i10, 2);
        Iterator it = cVar.f46947e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((r) it.next()).c(uri2, uVar, false);
        }
        v vVar = cVar.f46946c;
        if (z12) {
            vVar.getClass();
            long D = v.D(uVar);
            if (D != -9223372036854775807L) {
                k0Var = new k0(0, D, false);
            } else {
                k0Var = q0.f3606f;
            }
            k0Var2 = k0Var;
        }
        boolean a2 = k0Var2.a();
        cVar.f46948f.i(obj, i12, iOException, !a2);
        if (!a2) {
            vVar.getClass();
        }
        return k0Var2;
    }

    @Override
    public final void m(n0 n0Var, long j10, long j11) {
        t0 t0Var = (t0) n0Var;
        n nVar = (n) t0Var.f3624f;
        Uri uri = t0Var.d.f3667c;
        ?? obj = new Object();
        if (nVar instanceof j) {
            d((j) nVar);
            this.v.f46948f.f(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            t1 b10 = t1.b("Loaded playlist has unexpected type.", null);
            this.f46943s = b10;
            this.v.f46948f.i(obj, 4, b10, true);
        }
        this.v.f46946c.getClass();
    }
}
