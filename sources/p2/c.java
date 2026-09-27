package p2;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import b2.r0;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k2.u;
import org.telegram.ui.web.d0;
public final class c implements y2.g {
    public static final d0 E = new d0(2);
    public final u f40672a;
    public final s f40673b;
    public final qb.b f40674c;
    public a5.a f40675f;
    public y2.l h;
    public Handler f40676n;
    public o2.l f40677r;
    public o f40678s;
    public Uri v;
    public l f40679w;
    public boolean f40680x;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long f40681y = -9223372036854775807L;

    public c(u uVar, qb.b bVar, s sVar) {
        this.f40672a = uVar;
        this.f40673b = sVar;
        this.f40674c = bVar;
    }

    @Override
    public final void G(y2.i iVar, long j3, long j10, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j11 = oVar.f46622a;
        Uri uri = oVar.d.f9339c;
        u2.t tVar = new u2.t(j10);
        this.f40674c.getClass();
        this.f40675f.o(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final l a(Uri uri, boolean z10) {
        HashMap hashMap = this.d;
        l lVar = ((b) hashMap.get(uri)).d;
        if (lVar != null && z10) {
            if (!uri.equals(this.v)) {
                List list = this.f40678s.e;
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    } else if (uri.equals(((n) list.get(i10)).f40749a)) {
                        l lVar2 = this.f40679w;
                        if (lVar2 == null || !lVar2.f40738o) {
                            this.v = uri;
                            b bVar = (b) hashMap.get(uri);
                            l lVar3 = bVar.d;
                            if (lVar3 != null && lVar3.f40738o) {
                                this.f40679w = lVar3;
                                this.f40677r.v(lVar3);
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
                if (lVar4 != null && !lVar4.f40738o) {
                    bVar2.c(true);
                }
            }
        }
        return lVar;
    }

    public final Uri b(Uri uri) {
        h hVar;
        l lVar = this.f40679w;
        if (lVar != null && lVar.v.e && (hVar = (h) lVar.f40743t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(hVar.f40716b));
            int i10 = hVar.f40717c;
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
            long max = Math.max(30000L, e2.d0.e0(bVar.d.f40744u));
            l lVar = bVar.d;
            if (lVar.f40738o || (i10 = lVar.d) == 2 || i10 == 1 || bVar.e + max > elapsedRealtime) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final k4.d l(y2.i r5, long r6, long r8, java.io.IOException r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: p2.c.l(y2.i, long, long, java.io.IOException, int):k4.d");
    }

    @Override
    public final void m(y2.i iVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j11 = oVar.f46622a;
            tVar = new u2.t(oVar.f46623b);
        } else {
            long j12 = oVar.f46622a;
            Uri uri = oVar.d.f9339c;
            tVar = new u2.t(j10);
        }
        this.f40675f.s(tVar, oVar.f46624c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void q(y2.i iVar, long j3, long j10) {
        o oVar;
        y2.o oVar2 = (y2.o) iVar;
        p pVar = (p) oVar2.f46625f;
        boolean z10 = pVar instanceof l;
        if (z10) {
            String str = pVar.f40761a;
            o oVar3 = o.f40753n;
            Uri parse = Uri.parse(str);
            b2.r rVar = new b2.r();
            rVar.f3234a = "0";
            rVar.f3246p = r0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new n(parse, new b2.s(rVar), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            oVar = new o("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            oVar = (o) pVar;
        }
        this.f40678s = oVar;
        this.v = ((n) oVar.e.get(0)).f40749a;
        this.e.add(new a(this));
        List list2 = oVar.d;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list2.get(i10);
            this.d.put(uri, new b(this, uri));
        }
        Uri uri2 = oVar2.d.f9339c;
        u2.t tVar = new u2.t(j10);
        b bVar = (b) this.d.get(this.v);
        if (z10) {
            bVar.f((l) pVar, tVar);
        } else {
            bVar.c(false);
        }
        this.f40674c.getClass();
        this.f40675f.p(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
