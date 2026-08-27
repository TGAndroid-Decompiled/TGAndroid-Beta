package p4;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.e0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.p0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import h3.s0;
import h3.t1;
import j4.g0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.j70;

public final class c implements l0 {
    public static final j70 A = new j70(19);

    public final m5.o f45369a;

    public final q f45370b;

    public final ab.a f45371c;

    public g0 f45373f;
    public q0 h;

    public Handler f45374n;

    public o4.m f45375r;

    public m f45376s;
    public Uri v;

    public j f45377w;

    public boolean f45378x;

    public final CopyOnWriteArrayList f45372e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();

    public long f45379y = -9223372036854775807L;

    public c(m5.o oVar, ab.a aVar, q qVar) {
        this.f45369a = oVar;
        this.f45370b = qVar;
        this.f45371c = aVar;
    }

    public final j a(Uri uri, boolean z10) {
        HashMap map = this.d;
        j jVar = ((b) map.get(uri)).d;
        if (jVar != null && z10 && !uri.equals(this.v)) {
            List list = this.f45376s.f45424e;
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (uri.equals(((l) list.get(i10)).f45418a)) {
                    j jVar2 = this.f45377w;
                    if (jVar2 != null && jVar2.f45408o) {
                        break;
                    }
                    this.v = uri;
                    b bVar = (b) map.get(uri);
                    j jVar3 = bVar.d;
                    if (jVar3 == null || !jVar3.f45408o) {
                        bVar.c(b(uri));
                        return jVar;
                    }
                    this.f45377w = jVar3;
                    this.f45375r.t(jVar3);
                    return jVar;
                }
            }
        }
        return jVar;
    }

    public final Uri b(Uri uri) {
        f fVar;
        j jVar = this.f45377w;
        if (jVar == null || !jVar.v.f45398e || (fVar = (f) ((p8.q0) jVar.f45413t).get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fVar.f45383b));
        int i10 = fVar.f45384c;
        if (i10 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return builderBuildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i10;
        b bVar = (b) this.d.get(uri);
        if (bVar.d == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, d5.g0.S(bVar.d.f45414u));
        j jVar = bVar.d;
        return jVar.f45408o || (i10 = jVar.d) == 2 || i10 == 1 || bVar.f45364e + jMax > jElapsedRealtime;
    }

    @Override
    public final void d(n0 n0Var, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) n0Var;
        long j12 = t0Var.f3043a;
        Uri uri = t0Var.d.f3090c;
        j4.p pVar = new j4.p();
        this.f45371c.getClass();
        this.f45373f.d(pVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final k0 h(n0 n0Var, IOException iOException, int i10) {
        long jMin;
        t0 t0Var = (t0) n0Var;
        long j10 = t0Var.f3043a;
        Uri uri = t0Var.d.f3090c;
        j4.p pVar = new j4.p();
        int i11 = t0Var.f3045c;
        this.f45371c.getClass();
        if (!(iOException instanceof t1) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof e0) && !(iOException instanceof p0)) {
            int i12 = com.google.android.exoplayer2.upstream.n.f3009b;
            Throwable cause = iOException;
            while (true) {
                if (cause == null) {
                    jMin = Math.min((i10 - 1) * 1000, 5000);
                    break;
                }
                if ((cause instanceof com.google.android.exoplayer2.upstream.n) && ((com.google.android.exoplayer2.upstream.n) cause).f3010a == 2008) {
                    jMin = -9223372036854775807L;
                    break;
                }
                cause = cause.getCause();
            }
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        boolean z10 = jMin == -9223372036854775807L;
        this.f45373f.i(pVar, i11, iOException, z10);
        return z10 ? q0.f3029f : new k0(0, jMin, false);
    }

    @Override
    public final void l(n0 n0Var, long j10, long j11) {
        m mVar;
        t0 t0Var = (t0) n0Var;
        n nVar = (n) t0Var.f3047f;
        boolean z10 = nVar instanceof j;
        if (z10) {
            String str = nVar.f45432a;
            m mVar2 = m.f45423n;
            Uri uri = Uri.parse(str);
            s0 s0Var = new s0();
            s0Var.f8123a = "0";
            s0Var.f8134n = "application/x-mpegURL";
            List listSingletonList = Collections.singletonList(new l(uri, new h3.t0(s0Var), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            mVar = new m("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            mVar = (m) nVar;
        }
        this.f45376s = mVar;
        this.v = ((l) mVar.f45424e.get(0)).f45418a;
        this.f45372e.add(new a(this));
        List list2 = mVar.d;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri2 = (Uri) list2.get(i10);
            this.d.put(uri2, new b(this, uri2));
        }
        Uri uri3 = t0Var.d.f3090c;
        j4.p pVar = new j4.p();
        b bVar = (b) this.d.get(this.v);
        if (z10) {
            bVar.e((j) nVar);
        } else {
            bVar.c(bVar.f45361a);
        }
        this.f45371c.getClass();
        this.f45373f.f(pVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
