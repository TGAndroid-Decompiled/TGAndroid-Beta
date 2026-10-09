package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long f45233e;
    public final boolean f45234f;
    public final boolean f45235g;
    public final long h;
    public final boolean f45236i;
    public final int f45237j;
    public final long f45238k;
    public final int f45239l;
    public final long f45240m;
    public final long f45241n;
    public final boolean f45242o;
    public final boolean f45243p;
    public final b2.o f45244q;
    public final i0 f45245r;
    public final i0 f45246s;
    public final k0 f45247t;
    public final long f45248u;
    public final k v;
    public final i0 f45249w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f45235g = z10;
        this.f45236i = z11;
        this.f45237j = i11;
        this.f45238k = j11;
        this.f45239l = i12;
        this.f45240m = j12;
        this.f45241n = j13;
        this.f45242o = z13;
        this.f45243p = z14;
        this.f45244q = oVar;
        this.f45245r = i0.v(list2);
        this.f45246s = i0.v(list3);
        this.f45247t = k0.a(map);
        this.f45249w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f45248u = gVar.f45224e + gVar.f45223c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f45248u = iVar.f45224e + iVar.f45223c;
        } else {
            this.f45248u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f45248u, j3);
            } else {
                j14 = Math.max(0L, this.f45248u + j3);
            }
        }
        this.f45233e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f45234f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
