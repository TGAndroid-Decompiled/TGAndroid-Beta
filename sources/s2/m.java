package s2;

import h9.i0;
import h9.l0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long f56827e;
    public final boolean f56828f;
    public final boolean f56829g;
    public final long h;
    public final boolean f56830i;
    public final int f56831j;
    public final long f56832k;
    public final int f56833l;
    public final long f56834m;
    public final long f56835n;
    public final boolean f56836o;
    public final boolean f56837p;
    public final e2.r f56838q;
    public final i0 f56839r;
    public final i0 f56840s;
    public final l0 f56841t;
    public final long f56842u;
    public final l v;
    public final i0 f56843w;
    public final j f56844x;

    public m(int i7, String str, List list, long j3, boolean z10, long j10, boolean z11, int i10, long j11, int i11, long j12, long j13, boolean z12, boolean z13, boolean z14, e2.r rVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z12);
        this.d = i7;
        this.h = j10;
        this.f56829g = z10;
        this.f56830i = z11;
        this.f56831j = i10;
        this.f56832k = j11;
        this.f56833l = i11;
        this.f56834m = j12;
        this.f56835n = j13;
        this.f56836o = z13;
        this.f56837p = z14;
        this.f56838q = rVar;
        this.f56839r = i0.q(list2);
        this.f56840s = i0.q(list3);
        this.f56841t = l0.b(map);
        this.f56843w = i0.q(list4);
        this.f56844x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) h9.o.n(list3);
            this.f56842u = hVar.f56817e + hVar.f56816c;
        } else if (!list2.isEmpty()) {
            j jVar2 = (j) h9.o.n(list2);
            this.f56842u = jVar2.f56817e + jVar2.f56816c;
        } else {
            this.f56842u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f56842u, j3);
            } else {
                j14 = Math.max(0L, this.f56842u + j3);
            }
        }
        this.f56827e = j14;
        this.f56828f = j3 >= 0;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
