package p4;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import d5.f0;
import h3.t1;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import n2.w;
import org.telegram.ui.ai1;
public final class b implements l0 {
    public final Uri f45355a;
    public final q0 f45356b = new q0("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final com.google.android.exoplayer2.upstream.m f45357c;
    public j d;
    public long f45358e;
    public long f45359f;
    public long h;
    public long f45360n;
    public boolean f45361r;
    public IOException f45362s;
    public final c v;

    public b(c cVar, Uri uri) {
        this.v = cVar;
        this.f45355a = uri;
        this.f45357c = ((com.google.android.exoplayer2.upstream.l) cVar.f45363a.f18488b).createDataSource();
    }

    public static boolean a(b bVar, long j10) {
        bVar.f45360n = SystemClock.elapsedRealtime() + j10;
        Uri uri = bVar.f45355a;
        c cVar = bVar.v;
        if (!uri.equals(cVar.v)) {
            return false;
        }
        List list = cVar.f45370s.f45418e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i9 = 0; i9 < size; i9++) {
            b bVar2 = (b) cVar.d.get(((l) list.get(i9)).f45412a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.f45360n) {
                Uri uri2 = bVar2.f45355a;
                cVar.v = uri2;
                bVar2.c(cVar.b(uri2));
                return false;
            }
        }
        return true;
    }

    public final void b(Uri uri) {
        c cVar = this.v;
        t0 t0Var = new t0(this.f45357c, uri, 4, cVar.f45364b.x0(cVar.f45370s, this.d));
        v9.d dVar = cVar.f45365c;
        int i9 = t0Var.f2608c;
        this.f45356b.f(t0Var, this, dVar.l3(i9));
        cVar.f45367f.k(new j4.q(t0Var.f2607b), i9, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void c(Uri uri) {
        this.f45360n = 0L;
        if (!this.f45361r) {
            q0 q0Var = this.f45356b;
            if (!q0Var.d() && !q0Var.c()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = this.h;
                if (elapsedRealtime < j10) {
                    this.f45361r = true;
                    this.v.f45368n.postDelayed(new ai1(11, this, uri), j10 - elapsedRealtime);
                    return;
                }
                b(uri);
            }
        }
    }

    public final void d(p4.j r71) {
        throw new UnsupportedOperationException("Method not decompiled: p4.b.d(p4.j):void");
    }

    @Override
    public final void e(n0 n0Var, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) n0Var;
        long j12 = t0Var.f2606a;
        Uri uri = t0Var.d.f2653c;
        ?? obj = new Object();
        c cVar = this.v;
        cVar.f45365c.getClass();
        cVar.f45367f.d(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final k0 h(n0 n0Var, IOException iOException, int i9) {
        boolean z10;
        int i10;
        k0 k0Var;
        t0 t0Var = (t0) n0Var;
        long j10 = t0Var.f2606a;
        int i11 = t0Var.f2608c;
        Uri uri = t0Var.d.f2653c;
        ?? obj = new Object();
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = iOException instanceof o;
        k0 k0Var2 = q0.f2591e;
        Uri uri2 = this.f45355a;
        c cVar = this.v;
        if (z10 || z11) {
            if (iOException instanceof h0) {
                i10 = ((h0) iOException).d;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            if (z11 || i10 == 400 || i10 == 503) {
                this.h = SystemClock.elapsedRealtime();
                c(uri2);
                j4.h0 h0Var = cVar.f45367f;
                int i12 = f0.f4349a;
                h0Var.i(obj, i11, iOException, true);
                return k0Var2;
            }
        }
        w wVar = new w(iOException, i9, 1);
        Iterator it = cVar.f45366e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((r) it.next()).c(uri2, wVar, false);
        }
        v9.d dVar = cVar.f45365c;
        if (z12) {
            dVar.getClass();
            long m32 = v9.d.m3(wVar);
            if (m32 != -9223372036854775807L) {
                k0Var = new k0(0, m32, false);
            } else {
                k0Var = q0.f2592f;
            }
            k0Var2 = k0Var;
        }
        boolean a2 = k0Var2.a();
        cVar.f45367f.i(obj, i11, iOException, !a2);
        if (!a2) {
            dVar.getClass();
        }
        return k0Var2;
    }

    @Override
    public final void m(n0 n0Var, long j10, long j11) {
        t0 t0Var = (t0) n0Var;
        n nVar = (n) t0Var.f2610f;
        Uri uri = t0Var.d.f2653c;
        ?? obj = new Object();
        if (nVar instanceof j) {
            d((j) nVar);
            this.v.f45367f.f(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            t1 b10 = t1.b("Loaded playlist has unexpected type.", null);
            this.f45362s = b10;
            this.v.f45367f.i(obj, 4, b10, true);
        }
        this.v.f45365c.getClass();
    }
}
