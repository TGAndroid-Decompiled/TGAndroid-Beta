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
import org.telegram.ui.js0;
import u2.u;
public final class c implements y2.i {
    public static final js0 E = new js0(10);
    public final l2.h f39532a;
    public final s f39533b;
    public final rb.a f39534c;
    public a5.a f39535f;
    public y2.n h;
    public Handler f39536n;
    public o2.l f39537r;
    public o f39538s;
    public Uri v;
    public l f39539w;
    public boolean f39540x;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long f39541y = -9223372036854775807L;

    public c(l2.h hVar, rb.a aVar, s sVar) {
        this.f39532a = hVar;
        this.f39533b = sVar;
        this.f39534c = aVar;
    }

    @Override
    public final void C(y2.k kVar, long j3, long j10, boolean z10) {
        y2.q qVar = (y2.q) kVar;
        long j11 = qVar.f46448a;
        Uri uri = qVar.d.f8480c;
        u uVar = new u(j10);
        this.f39534c.getClass();
        this.f39535f.m(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final l a(Uri uri, boolean z10) {
        HashMap hashMap = this.d;
        l lVar = ((b) hashMap.get(uri)).d;
        if (lVar != null && z10) {
            if (!uri.equals(this.v)) {
                List list = this.f39538s.e;
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    } else if (uri.equals(((n) list.get(i10)).f39609a)) {
                        l lVar2 = this.f39539w;
                        if (lVar2 == null || !lVar2.f39598o) {
                            this.v = uri;
                            b bVar = (b) hashMap.get(uri);
                            l lVar3 = bVar.d;
                            if (lVar3 != null && lVar3.f39598o) {
                                this.f39539w = lVar3;
                                this.f39537r.v(lVar3);
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
                if (lVar4 != null && !lVar4.f39598o) {
                    bVar2.c(true);
                }
            }
        }
        return lVar;
    }

    public final Uri b(Uri uri) {
        h hVar;
        l lVar = this.f39539w;
        if (lVar != null && lVar.v.e && (hVar = (h) lVar.f39603t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(hVar.f39576b));
            int i10 = hVar.f39577c;
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
            long max = Math.max(30000L, d0.e0(bVar.d.f39604u));
            l lVar = bVar.d;
            if (lVar.f39598o || (i10 = lVar.d) == 2 || i10 == 1 || bVar.e + max > elapsedRealtime) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final k4.d k(y2.k r5, long r6, long r8, java.io.IOException r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: p2.c.k(y2.k, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void l(y2.k kVar, long j3, long j10, int i10) {
        u uVar;
        y2.q qVar = (y2.q) kVar;
        if (i10 == 0) {
            long j11 = qVar.f46448a;
            uVar = new u(qVar.f46449b);
        } else {
            long j12 = qVar.f46448a;
            Uri uri = qVar.d.f8480c;
            uVar = new u(j10);
        }
        this.f39535f.r(uVar, qVar.f46450c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void p(y2.k kVar, long j3, long j10) {
        o oVar;
        y2.q qVar = (y2.q) kVar;
        p pVar = (p) qVar.f46451f;
        boolean z10 = pVar instanceof l;
        if (z10) {
            String str = pVar.f39621a;
            o oVar2 = o.f39613n;
            Uri parse = Uri.parse(str);
            b2.r rVar = new b2.r();
            rVar.f1933a = "0";
            rVar.f1945p = r0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new n(parse, new b2.s(rVar), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            oVar = new o("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            oVar = (o) pVar;
        }
        this.f39538s = oVar;
        this.v = ((n) oVar.e.get(0)).f39609a;
        this.e.add(new a(this));
        List list2 = oVar.d;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list2.get(i10);
            this.d.put(uri, new b(this, uri));
        }
        Uri uri2 = qVar.d.f8480c;
        u uVar = new u(j10);
        b bVar = (b) this.d.get(this.v);
        if (z10) {
            bVar.f((l) pVar, uVar);
        } else {
            bVar.c(false);
        }
        this.f39534c.getClass();
        this.f39535f.o(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
