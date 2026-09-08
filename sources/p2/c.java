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
import ji.u4;
import org.telegram.ui.sw0;
public final class c implements y2.h {
    public static final sw0 E = new sw0(9);
    public final u4 f43677a;
    public final s f43678b;
    public final rb.a f43679c;
    public a5.a f43681f;
    public y2.m h;
    public Handler f43682n;
    public o2.l f43683r;
    public o f43684s;
    public Uri v;
    public l f43685w;
    public boolean f43686x;
    public final CopyOnWriteArrayList f43680e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long f43687y = -9223372036854775807L;

    public c(u4 u4Var, rb.a aVar, s sVar) {
        this.f43677a = u4Var;
        this.f43678b = sVar;
        this.f43679c = aVar;
    }

    public final l a(Uri uri, boolean z10) {
        HashMap hashMap = this.d;
        l lVar = ((b) hashMap.get(uri)).d;
        if (lVar != null && z10) {
            if (!uri.equals(this.v)) {
                List list = this.f43684s.f43766e;
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    } else if (uri.equals(((n) list.get(i10)).f43760a)) {
                        l lVar2 = this.f43685w;
                        if (lVar2 == null || !lVar2.f43749o) {
                            this.v = uri;
                            b bVar = (b) hashMap.get(uri);
                            l lVar3 = bVar.d;
                            if (lVar3 != null && lVar3.f43749o) {
                                this.f43685w = lVar3;
                                this.f43683r.v(lVar3);
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
                if (lVar4 != null && !lVar4.f43749o) {
                    bVar2.c(true);
                }
            }
        }
        return lVar;
    }

    public final Uri b(Uri uri) {
        h hVar;
        l lVar = this.f43685w;
        if (lVar != null && lVar.v.f43739e && (hVar = (h) lVar.f43754t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(hVar.f43724b));
            int i10 = hVar.f43725c;
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
            long max = Math.max(30000L, d0.e0(bVar.d.f43755u));
            l lVar = bVar.d;
            if (lVar.f43749o || (i10 = lVar.d) == 2 || i10 == 1 || bVar.f43671e + max > elapsedRealtime) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final k4.d g(y2.j r5, long r6, long r8, java.io.IOException r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: p2.c.g(y2.j, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void h(y2.j jVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.p pVar = (y2.p) jVar;
        if (i10 == 0) {
            long j11 = pVar.f49550a;
            tVar = new u2.t(pVar.f49551b);
        } else {
            long j12 = pVar.f49550a;
            Uri uri = pVar.d.f10326c;
            tVar = new u2.t(j10);
        }
        this.f43681f.r(tVar, pVar.f49552c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void i(y2.j jVar, long j3, long j10) {
        o oVar;
        y2.p pVar = (y2.p) jVar;
        p pVar2 = (p) pVar.f49554f;
        boolean z10 = pVar2 instanceof l;
        if (z10) {
            String str = pVar2.f43774a;
            o oVar2 = o.f43765n;
            Uri parse = Uri.parse(str);
            b2.r rVar = new b2.r();
            rVar.f2325a = "0";
            rVar.f2338p = r0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new n(parse, new b2.s(rVar), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            oVar = new o("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            oVar = (o) pVar2;
        }
        this.f43684s = oVar;
        this.v = ((n) oVar.f43766e.get(0)).f43760a;
        this.f43680e.add(new a(this));
        List list2 = oVar.d;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list2.get(i10);
            this.d.put(uri, new b(this, uri));
        }
        Uri uri2 = pVar.d.f10326c;
        u2.t tVar = new u2.t(j10);
        b bVar = (b) this.d.get(this.v);
        if (z10) {
            bVar.f((l) pVar2, tVar);
        } else {
            bVar.c(false);
        }
        this.f43679c.getClass();
        this.f43681f.o(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void w(y2.j jVar, long j3, long j10, boolean z10) {
        y2.p pVar = (y2.p) jVar;
        long j11 = pVar.f49550a;
        Uri uri = pVar.d.f10326c;
        u2.t tVar = new u2.t(j10);
        this.f43679c.getClass();
        this.f43681f.n(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
