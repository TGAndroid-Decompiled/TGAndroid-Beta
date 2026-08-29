package r4;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import f5.d0;
import f7.v;
import j3.s0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l4.g0;
public final class c implements l0 {
    public static final r.a A = new r.a(5);
    public final o1.a f46944a;
    public final q f46945b;
    public final v f46946c;
    public g0 f46948f;
    public q0 h;
    public Handler f46949n;
    public q4.m f46950r;
    public m f46951s;
    public Uri v;
    public j f46952w;
    public boolean f46953x;
    public final CopyOnWriteArrayList f46947e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long f46954y = -9223372036854775807L;

    public c(o1.a aVar, v vVar, q qVar) {
        this.f46944a = aVar;
        this.f46945b = qVar;
        this.f46946c = vVar;
    }

    public final j a(Uri uri, boolean z10) {
        HashMap hashMap = this.d;
        j jVar = ((b) hashMap.get(uri)).d;
        if (jVar != null && z10 && !uri.equals(this.v)) {
            List list = this.f46951s.f46999e;
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                } else if (uri.equals(((l) list.get(i10)).f46993a)) {
                    j jVar2 = this.f46952w;
                    if (jVar2 == null || !jVar2.f46983o) {
                        this.v = uri;
                        b bVar = (b) hashMap.get(uri);
                        j jVar3 = bVar.d;
                        if (jVar3 != null && jVar3.f46983o) {
                            this.f46952w = jVar3;
                            this.f46950r.t(jVar3);
                            return jVar;
                        }
                        bVar.c(b(uri));
                        return jVar;
                    }
                } else {
                    i10++;
                }
            }
        }
        return jVar;
    }

    public final Uri b(Uri uri) {
        f fVar;
        j jVar = this.f46952w;
        if (jVar != null && jVar.v.f46973e && (fVar = (f) ((q8.q0) jVar.f46988t).get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fVar.f46958b));
            int i10 = fVar.f46959c;
            if (i10 != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
            }
            return buildUpon.build();
        }
        return uri;
    }

    public final boolean c(Uri uri) {
        int i10;
        b bVar = (b) this.d.get(uri);
        if (bVar.d != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, d0.S(bVar.d.f46989u));
            j jVar = bVar.d;
            if (jVar.f46983o || (i10 = jVar.d) == 2 || i10 == 1 || bVar.f46939e + max > elapsedRealtime) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void g(n0 n0Var, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) n0Var;
        long j12 = t0Var.f3620a;
        Uri uri = t0Var.d.f3667c;
        ?? obj = new Object();
        this.f46946c.getClass();
        this.f46948f.d(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final com.google.android.exoplayer2.upstream.k0 j(com.google.android.exoplayer2.upstream.n0 r8, java.io.IOException r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: r4.c.j(com.google.android.exoplayer2.upstream.n0, java.io.IOException, int):com.google.android.exoplayer2.upstream.k0");
    }

    @Override
    public final void m(n0 n0Var, long j10, long j11) {
        m mVar;
        t0 t0Var = (t0) n0Var;
        n nVar = (n) t0Var.f3624f;
        boolean z10 = nVar instanceof j;
        if (z10) {
            String str = nVar.f47007a;
            m mVar2 = m.f46998n;
            Uri parse = Uri.parse(str);
            s0 s0Var = new s0();
            s0Var.f10730a = "0";
            s0Var.f10741n = "application/x-mpegURL";
            List singletonList = Collections.singletonList(new l(parse, new j3.t0(s0Var), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            mVar = new m("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            mVar = (m) nVar;
        }
        this.f46951s = mVar;
        this.v = ((l) mVar.f46999e.get(0)).f46993a;
        this.f46947e.add(new a(this));
        List list2 = mVar.d;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list2.get(i10);
            this.d.put(uri, new b(this, uri));
        }
        Uri uri2 = t0Var.d.f3667c;
        ?? obj = new Object();
        b bVar = (b) this.d.get(this.v);
        if (z10) {
            bVar.d((j) nVar);
        } else {
            bVar.c(bVar.f46936a);
        }
        this.f46946c.getClass();
        this.f46948f.f(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
