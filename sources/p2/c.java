package p2;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import b2.r0;
import e2.d0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.ja0;
public final class c implements y2.h {
    public static final ja0 E = new ja0(20);
    public final l.d f40722a;
    public final s f40723b;
    public final qb.b f40724c;
    public a5.a f40725f;
    public y2.m h;
    public Handler f40726n;
    public o2.l f40727r;
    public o f40728s;
    public Uri v;
    public l f40729w;
    public boolean f40730x;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long f40731y = -9223372036854775807L;

    public c(l.d dVar, qb.b bVar, s sVar) {
        this.f40722a = dVar;
        this.f40723b = sVar;
        this.f40724c = bVar;
    }

    @Override
    public final void S(y2.j jVar, long j3, long j10, boolean z10) {
        y2.p pVar = (y2.p) jVar;
        long j11 = pVar.f46621a;
        Uri uri = pVar.d.f9352c;
        u2.t tVar = new u2.t(j10);
        this.f40724c.getClass();
        this.f40725f.o(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final l a(Uri uri, boolean z10) {
        HashMap hashMap = this.d;
        l lVar = ((b) hashMap.get(uri)).d;
        if (lVar != null && z10) {
            if (!uri.equals(this.v)) {
                List list = this.f40728s.e;
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    } else if (uri.equals(((n) list.get(i10)).f40799a)) {
                        l lVar2 = this.f40729w;
                        if (lVar2 == null || !lVar2.f40788o) {
                            this.v = uri;
                            b bVar = (b) hashMap.get(uri);
                            l lVar3 = bVar.d;
                            if (lVar3 != null && lVar3.f40788o) {
                                this.f40729w = lVar3;
                                this.f40727r.v(lVar3);
                            } else {
                                bVar.e(b(uri));
                            }
                        }
                    } else {
                        i10++;
                    }
                }
            }
            b bVar2 = (b) hashMap.get(uri);
            l lVar4 = bVar2.d;
            if (!bVar2.v) {
                bVar2.v = true;
                if (lVar4 != null && !lVar4.f40788o) {
                    bVar2.c(true);
                }
            }
        }
        return lVar;
    }

    public final Uri b(Uri uri) {
        h hVar;
        l lVar = this.f40729w;
        if (lVar != null && lVar.v.e && (hVar = (h) lVar.f40793t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(hVar.f40766b));
            int i10 = hVar.f40767c;
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
            long max = Math.max(30000L, d0.e0(bVar.d.f40794u));
            l lVar = bVar.d;
            if (lVar.f40788o || (i10 = lVar.d) == 2 || i10 == 1 || bVar.e + max > elapsedRealtime) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final k4.d n(y2.j r5, long r6, long r8, java.io.IOException r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: p2.c.n(y2.j, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void o(y2.j jVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.p pVar = (y2.p) jVar;
        if (i10 == 0) {
            long j11 = pVar.f46621a;
            tVar = new u2.t(pVar.f46622b);
        } else {
            long j12 = pVar.f46621a;
            Uri uri = pVar.d.f9352c;
            tVar = new u2.t(j10);
        }
        this.f40725f.s(tVar, pVar.f46623c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void p(y2.j jVar, long j3, long j10) {
        o oVar;
        y2.p pVar = (y2.p) jVar;
        p pVar2 = (p) pVar.f46624f;
        boolean z10 = pVar2 instanceof l;
        if (z10) {
            String str = pVar2.f40811a;
            o oVar2 = o.f40803n;
            Uri parse = Uri.parse(str);
            b2.r rVar = new b2.r();
            rVar.f3239a = "0";
            rVar.f3251p = r0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new n(parse, new b2.s(rVar), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            oVar = new o("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            oVar = (o) pVar2;
        }
        this.f40728s = oVar;
        this.v = ((n) oVar.e.get(0)).f40799a;
        this.e.add(new a(this));
        List list2 = oVar.d;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list2.get(i10);
            this.d.put(uri, new b(this, uri));
        }
        Uri uri2 = pVar.d.f9352c;
        u2.t tVar = new u2.t(j10);
        b bVar = (b) this.d.get(this.v);
        if (z10) {
            bVar.f((l) pVar2, tVar);
        } else {
            bVar.c(false);
        }
        this.f40724c.getClass();
        this.f40725f.p(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
