package u4;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import b4.e0;
import g5.h0;
import g5.j0;
import g5.m0;
import g5.p0;
import h5.d0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import oh.h4;
import s8.n0;
public final class c implements h0 {
    public static final sg.a B = new sg.a(12);
    public final h4 f48287a;
    public final p f48288b;
    public final ab.a f48289c;
    public e0 f48291f;
    public m0 h;
    public Handler f48292n;
    public t4.m f48293r;
    public l f48294s;
    public Uri v;
    public i f48295w;
    public boolean f48296x;
    public final CopyOnWriteArrayList f48290e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long f48297y = -9223372036854775807L;

    public c(h4 h4Var, ab.a aVar, p pVar) {
        this.f48287a = h4Var;
        this.f48288b = pVar;
        this.f48289c = aVar;
    }

    public final i a(Uri uri, boolean z4) {
        HashMap hashMap = this.d;
        i iVar = ((b) hashMap.get(uri)).d;
        if (iVar != null && z4 && !uri.equals(this.v)) {
            List list = this.f48294s.f48342e;
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                } else if (uri.equals(((k) list.get(i10)).f48336a)) {
                    i iVar2 = this.f48295w;
                    if (iVar2 == null || !iVar2.f48326o) {
                        this.v = uri;
                        b bVar = (b) hashMap.get(uri);
                        i iVar3 = bVar.d;
                        if (iVar3 != null && iVar3.f48326o) {
                            this.f48295w = iVar3;
                            this.f48293r.t(iVar3);
                            return iVar;
                        }
                        bVar.c(b(uri));
                        return iVar;
                    }
                } else {
                    i10++;
                }
            }
        }
        return iVar;
    }

    public final Uri b(Uri uri) {
        e eVar;
        i iVar = this.f48295w;
        if (iVar != null && iVar.v.f48316e && (eVar = (e) ((n0) iVar.f48331t).get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(eVar.f48301b));
            int i10 = eVar.f48302c;
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
            long max = Math.max(30000L, d0.S(bVar.d.f48332u));
            i iVar = bVar.d;
            if (iVar.f48326o || (i10 = iVar.d) == 2 || i10 == 1 || bVar.f48282e + max > elapsedRealtime) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final c4.e q(g5.j0 r8, java.io.IOException r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: u4.c.q(g5.j0, java.io.IOException, int):c4.e");
    }

    @Override
    public final void u(j0 j0Var, long j10, long j11, boolean z4) {
        p0 p0Var = (p0) j0Var;
        long j12 = p0Var.f6891a;
        Uri uri = p0Var.d.f6950c;
        ?? obj = new Object();
        this.f48289c.getClass();
        this.f48291f.m(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void x(j0 j0Var, long j10, long j11) {
        l lVar;
        p0 p0Var = (p0) j0Var;
        m mVar = (m) p0Var.f6895f;
        boolean z4 = mVar instanceof i;
        if (z4) {
            String str = mVar.f48350a;
            l lVar2 = l.f48341n;
            Uri parse = Uri.parse(str);
            j3.m0 m0Var = new j3.m0();
            m0Var.f9253a = "0";
            m0Var.f9264n = "application/x-mpegURL";
            List singletonList = Collections.singletonList(new k(parse, new j3.n0(m0Var), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            lVar = new l("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            lVar = (l) mVar;
        }
        this.f48294s = lVar;
        this.v = ((k) lVar.f48342e.get(0)).f48336a;
        this.f48290e.add(new a(this));
        List list2 = lVar.d;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list2.get(i10);
            this.d.put(uri, new b(this, uri));
        }
        Uri uri2 = p0Var.d.f6950c;
        ?? obj = new Object();
        b bVar = (b) this.d.get(this.v);
        if (z4) {
            bVar.d((i) mVar);
        } else {
            bVar.c(bVar.f48279a);
        }
        this.f48289c.getClass();
        this.f48291f.p(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
