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
import j3.n0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Components.qk0;
public final class c implements h0 {
    public static final s0.b B = new s0.b(11);
    public final qk0 f45007a;
    public final p f45008b;
    public final ab.a f45009c;
    public e0 f45010f;
    public m0 h;
    public Handler f45011n;
    public t4.m f45012r;
    public l f45013s;
    public Uri v;
    public i f45014w;
    public boolean f45015x;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long f45016y = -9223372036854775807L;

    public c(qk0 qk0Var, ab.a aVar, p pVar) {
        this.f45007a = qk0Var;
        this.f45008b = pVar;
        this.f45009c = aVar;
    }

    @Override
    public final void A(j0 j0Var, long j10, long j11) {
        l lVar;
        p0 p0Var = (p0) j0Var;
        m mVar = (m) p0Var.f6409f;
        boolean z4 = mVar instanceof i;
        if (z4) {
            String str = mVar.f45064a;
            l lVar2 = l.f45056n;
            Uri parse = Uri.parse(str);
            j3.m0 m0Var = new j3.m0();
            m0Var.f8673a = "0";
            m0Var.f8683n = "application/x-mpegURL";
            List singletonList = Collections.singletonList(new k(parse, new n0(m0Var), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            lVar = new l("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            lVar = (l) mVar;
        }
        this.f45013s = lVar;
        this.v = ((k) lVar.e.get(0)).f45052a;
        this.e.add(new a(this));
        List list2 = lVar.d;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list2.get(i10);
            this.d.put(uri, new b(this, uri));
        }
        Uri uri2 = p0Var.d.f6458c;
        ?? obj = new Object();
        b bVar = (b) this.d.get(this.v);
        if (z4) {
            bVar.d((i) mVar);
        } else {
            bVar.c(bVar.f45000a);
        }
        this.f45009c.getClass();
        this.f45010f.n(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final i a(Uri uri, boolean z4) {
        HashMap hashMap = this.d;
        i iVar = ((b) hashMap.get(uri)).d;
        if (iVar != null && z4 && !uri.equals(this.v)) {
            List list = this.f45013s.e;
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                } else if (uri.equals(((k) list.get(i10)).f45052a)) {
                    i iVar2 = this.f45014w;
                    if (iVar2 == null || !iVar2.f45042o) {
                        this.v = uri;
                        b bVar = (b) hashMap.get(uri);
                        i iVar3 = bVar.d;
                        if (iVar3 != null && iVar3.f45042o) {
                            this.f45014w = iVar3;
                            this.f45012r.t(iVar3);
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
        i iVar = this.f45014w;
        if (iVar != null && iVar.v.e && (eVar = (e) ((s8.n0) iVar.f45047t).get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(eVar.f45020b));
            int i10 = eVar.f45021c;
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
            long max = Math.max(30000L, d0.S(bVar.d.f45048u));
            i iVar = bVar.d;
            if (iVar.f45042o || (i10 = iVar.d) == 2 || i10 == 1 || bVar.e + max > elapsedRealtime) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final c4.e m(g5.j0 r8, java.io.IOException r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: u4.c.m(g5.j0, java.io.IOException, int):c4.e");
    }

    @Override
    public final void s(j0 j0Var, long j10, long j11, boolean z4) {
        p0 p0Var = (p0) j0Var;
        long j12 = p0Var.f6406a;
        Uri uri = p0Var.d.f6458c;
        ?? obj = new Object();
        this.f45009c.getClass();
        this.f45010f.l(obj, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
