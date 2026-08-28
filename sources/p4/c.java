package p4;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import d5.f0;
import h3.s0;
import j4.h0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import n5.e0;
import org.telegram.ui.fk0;
public final class c implements l0 {
    public static final fk0 A = new fk0(14);
    public final e0 f45363a;
    public final q f45364b;
    public final v9.d f45365c;
    public h0 f45367f;
    public q0 h;
    public Handler f45368n;
    public o4.m f45369r;
    public m f45370s;
    public Uri v;
    public j f45371w;
    public boolean f45372x;
    public final CopyOnWriteArrayList f45366e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long f45373y = -9223372036854775807L;

    public c(e0 e0Var, v9.d dVar, q qVar) {
        this.f45363a = e0Var;
        this.f45364b = qVar;
        this.f45365c = dVar;
    }

    public final j a(Uri uri, boolean z10) {
        HashMap hashMap = this.d;
        j jVar = ((b) hashMap.get(uri)).d;
        if (jVar != null && z10 && !uri.equals(this.v)) {
            List list = this.f45370s.f45418e;
            int i9 = 0;
            while (true) {
                if (i9 >= list.size()) {
                    break;
                } else if (uri.equals(((l) list.get(i9)).f45412a)) {
                    j jVar2 = this.f45371w;
                    if (jVar2 == null || !jVar2.f45402o) {
                        this.v = uri;
                        b bVar = (b) hashMap.get(uri);
                        j jVar3 = bVar.d;
                        if (jVar3 != null && jVar3.f45402o) {
                            this.f45371w = jVar3;
                            this.f45369r.t(jVar3);
                            return jVar;
                        }
                        bVar.c(b(uri));
                        return jVar;
                    }
                } else {
                    i9++;
                }
            }
        }
        return jVar;
    }

    public final Uri b(Uri uri) {
        f fVar;
        j jVar = this.f45371w;
        if (jVar != null && jVar.v.f45392e && (fVar = (f) ((o8.q0) jVar.f45407t).get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fVar.f45377b));
            int i9 = fVar.f45378c;
            if (i9 != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i9));
            }
            return buildUpon.build();
        }
        return uri;
    }

    public final boolean c(Uri uri) {
        int i9;
        b bVar = (b) this.d.get(uri);
        if (bVar.d != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, f0.S(bVar.d.f45408u));
            j jVar = bVar.d;
            if (jVar.f45402o || (i9 = jVar.d) == 2 || i9 == 1 || bVar.f45358e + max > elapsedRealtime) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e(n0 n0Var, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) n0Var;
        long j12 = t0Var.f2606a;
        Uri uri = t0Var.d.f2653c;
        ?? obj = new Object();
        this.f45365c.getClass();
        this.f45367f.d(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final com.google.android.exoplayer2.upstream.k0 h(com.google.android.exoplayer2.upstream.n0 r8, java.io.IOException r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: p4.c.h(com.google.android.exoplayer2.upstream.n0, java.io.IOException, int):com.google.android.exoplayer2.upstream.k0");
    }

    @Override
    public final void m(n0 n0Var, long j10, long j11) {
        m mVar;
        t0 t0Var = (t0) n0Var;
        n nVar = (n) t0Var.f2610f;
        boolean z10 = nVar instanceof j;
        if (z10) {
            String str = nVar.f45426a;
            m mVar2 = m.f45417n;
            Uri parse = Uri.parse(str);
            s0 s0Var = new s0();
            s0Var.f9693a = "0";
            s0Var.f9704n = "application/x-mpegURL";
            List singletonList = Collections.singletonList(new l(parse, new h3.t0(s0Var), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            mVar = new m("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            mVar = (m) nVar;
        }
        this.f45370s = mVar;
        this.v = ((l) mVar.f45418e.get(0)).f45412a;
        this.f45366e.add(new a(this));
        List list2 = mVar.d;
        int size = list2.size();
        for (int i9 = 0; i9 < size; i9++) {
            Uri uri = (Uri) list2.get(i9);
            this.d.put(uri, new b(this, uri));
        }
        Uri uri2 = t0Var.d.f2653c;
        ?? obj = new Object();
        b bVar = (b) this.d.get(this.v);
        if (z10) {
            bVar.d((j) nVar);
        } else {
            bVar.c(bVar.f45355a);
        }
        this.f45365c.getClass();
        this.f45367f.f(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
