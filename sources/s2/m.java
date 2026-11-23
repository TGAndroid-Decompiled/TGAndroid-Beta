package s2;

import h9.i0;
import h9.l0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long f56837e;
    public final boolean f56838f;
    public final boolean f56839g;
    public final long h;
    public final boolean f56840i;
    public final int f56841j;
    public final long f56842k;
    public final int f56843l;
    public final long f56844m;
    public final long f56845n;
    public final boolean f56846o;
    public final boolean f56847p;
    public final e2.r f56848q;
    public final i0 f56849r;
    public final i0 f56850s;
    public final l0 f56851t;
    public final long f56852u;
    public final l v;
    public final i0 f56853w;
    public final j f56854x;

    public m(int i7, String str, List list, long j3, boolean z10, long j10, boolean z11, int i10, long j11, int i11, long j12, long j13, boolean z12, boolean z13, boolean z14, e2.r rVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z12);
        this.d = i7;
        this.h = j10;
        this.f56839g = z10;
        this.f56840i = z11;
        this.f56841j = i10;
        this.f56842k = j11;
        this.f56843l = i11;
        this.f56844m = j12;
        this.f56845n = j13;
        this.f56846o = z13;
        this.f56847p = z14;
        this.f56848q = rVar;
        this.f56849r = i0.q(list2);
        this.f56850s = i0.q(list3);
        this.f56851t = l0.b(map);
        this.f56853w = i0.q(list4);
        this.f56854x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) h9.o.n(list3);
            this.f56852u = hVar.f56827e + hVar.f56826c;
        } else if (!list2.isEmpty()) {
            j jVar2 = (j) h9.o.n(list2);
            this.f56852u = jVar2.f56827e + jVar2.f56826c;
        } else {
            this.f56852u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f56852u, j3);
            } else {
                j14 = Math.max(0L, this.f56852u + j3);
            }
        }
        this.f56837e = j14;
        this.f56838f = j3 >= 0;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
