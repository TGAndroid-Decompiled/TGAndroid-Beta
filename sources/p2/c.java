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
import org.telegram.ui.v20;
public final class c implements y2.g {
    public static final v20 E = new v20(25);
    public final m2.t f45206a;
    public final s f45207b;
    public final rb.a f45208c;
    public a5.a f45210f;
    public y2.l h;
    public Handler f45211n;
    public o2.l f45212r;
    public o f45213s;
    public Uri v;
    public l f45214w;
    public boolean f45215x;
    public final CopyOnWriteArrayList f45209e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long f45216y = -9223372036854775807L;

    public c(m2.t tVar, rb.a aVar, s sVar) {
        this.f45206a = tVar;
        this.f45207b = sVar;
        this.f45208c = aVar;
    }

    @Override
    public final void C(y2.i iVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j11 = oVar.f51786a;
            tVar = new u2.t(oVar.f51787b);
        } else {
            long j12 = oVar.f51786a;
            Uri uri = oVar.d.f10234c;
            tVar = new u2.t(j10);
        }
        this.f45210f.u(tVar, oVar.f51788c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override
    public final void F(y2.i iVar, long j3, long j10) {
        o oVar;
        y2.o oVar2 = (y2.o) iVar;
        p pVar = (p) oVar2.f51790f;
        boolean z10 = pVar instanceof l;
        if (z10) {
            String str = pVar.f45303a;
            o oVar3 = o.f45294n;
            Uri parse = Uri.parse(str);
            b2.r rVar = new b2.r();
            rVar.f3571a = "0";
            rVar.f3584p = r0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new n(parse, new b2.s(rVar), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            oVar = new o("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            oVar = (o) pVar;
        }
        this.f45213s = oVar;
        this.v = ((n) oVar.f45295e.get(0)).f45289a;
        this.f45209e.add(new a(this));
        List list2 = oVar.d;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list2.get(i10);
            this.d.put(uri, new b(this, uri));
        }
        Uri uri2 = oVar2.d.f10234c;
        u2.t tVar = new u2.t(j10);
        b bVar = (b) this.d.get(this.v);
        if (z10) {
            bVar.f((l) pVar, tVar);
        } else {
            bVar.c(false);
        }
        this.f45208c.getClass();
        this.f45210f.q(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public final void O0(y2.i iVar, long j3, long j10, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j11 = oVar.f51786a;
        Uri uri = oVar.d.f10234c;
        u2.t tVar = new u2.t(j10);
        this.f45208c.getClass();
        this.f45210f.p(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final l a(Uri uri, boolean z10) {
        HashMap hashMap = this.d;
        l lVar = ((b) hashMap.get(uri)).d;
        if (lVar != null && z10) {
            if (!uri.equals(this.v)) {
                List list = this.f45213s.f45295e;
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    } else if (uri.equals(((n) list.get(i10)).f45289a)) {
                        l lVar2 = this.f45214w;
                        if (lVar2 == null || !lVar2.f45278o) {
                            this.v = uri;
                            b bVar = (b) hashMap.get(uri);
                            l lVar3 = bVar.d;
                            if (lVar3 != null && lVar3.f45278o) {
                                this.f45214w = lVar3;
                                this.f45212r.v(lVar3);
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
                if (lVar4 != null && !lVar4.f45278o) {
                    bVar2.c(true);
                }
            }
        }
        return lVar;
    }

    public final Uri b(Uri uri) {
        h hVar;
        l lVar = this.f45214w;
        if (lVar != null && lVar.v.f45268e && (hVar = (h) lVar.f45283t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(hVar.f45253b));
            int i10 = hVar.f45254c;
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
            long max = Math.max(30000L, d0.d0(bVar.d.f45284u));
            l lVar = bVar.d;
            if (lVar.f45278o || (i10 = lVar.d) == 2 || i10 == 1 || bVar.f45200e + max > elapsedRealtime) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final k4.d y(y2.i r5, long r6, long r8, java.io.IOException r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: p2.c.y(y2.i, long, long, java.io.IOException, int):k4.d");
    }
}
