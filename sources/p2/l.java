package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long e;
    public final boolean f40733f;
    public final boolean f40734g;
    public final long h;
    public final boolean f40735i;
    public final int f40736j;
    public final long f40737k;
    public final int f40738l;
    public final long f40739m;
    public final long f40740n;
    public final boolean f40741o;
    public final boolean f40742p;
    public final b2.o f40743q;
    public final i0 f40744r;
    public final i0 f40745s;
    public final k0 f40746t;
    public final long f40747u;
    public final k v;
    public final i0 f40748w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f40734g = z10;
        this.f40735i = z11;
        this.f40736j = i11;
        this.f40737k = j11;
        this.f40738l = i12;
        this.f40739m = j12;
        this.f40740n = j13;
        this.f40741o = z13;
        this.f40742p = z14;
        this.f40743q = oVar;
        this.f40744r = i0.v(list2);
        this.f40745s = i0.v(list3);
        this.f40746t = k0.a(map);
        this.f40748w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f40747u = gVar.e + gVar.f40725c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f40747u = iVar.e + iVar.f40725c;
        } else {
            this.f40747u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f40747u, j3);
            } else {
                j14 = Math.max(0L, this.f40747u + j3);
            }
        }
        this.e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f40733f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
