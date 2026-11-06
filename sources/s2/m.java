package s2;

import h9.i0;
import h9.l0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long f54595e;
    public final boolean f54596f;
    public final boolean f54597g;
    public final long h;
    public final boolean f54598i;
    public final int f54599j;
    public final long f54600k;
    public final int f54601l;
    public final long f54602m;
    public final long f54603n;
    public final boolean f54604o;
    public final boolean f54605p;
    public final e2.r f54606q;
    public final i0 f54607r;
    public final i0 f54608s;
    public final l0 f54609t;
    public final long f54610u;
    public final l v;
    public final i0 f54611w;
    public final j f54612x;

    public m(int i7, String str, List list, long j3, boolean z9, long j10, boolean z10, int i10, long j11, int i11, long j12, long j13, boolean z11, boolean z12, boolean z13, e2.r rVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z11);
        this.d = i7;
        this.h = j10;
        this.f54597g = z9;
        this.f54598i = z10;
        this.f54599j = i10;
        this.f54600k = j11;
        this.f54601l = i11;
        this.f54602m = j12;
        this.f54603n = j13;
        this.f54604o = z12;
        this.f54605p = z13;
        this.f54606q = rVar;
        this.f54607r = i0.q(list2);
        this.f54608s = i0.q(list3);
        this.f54609t = l0.b(map);
        this.f54611w = i0.q(list4);
        this.f54612x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) h9.o.n(list3);
            this.f54610u = hVar.f54585e + hVar.f54584c;
        } else if (!list2.isEmpty()) {
            j jVar2 = (j) h9.o.n(list2);
            this.f54610u = jVar2.f54585e + jVar2.f54584c;
        } else {
            this.f54610u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f54610u, j3);
            } else {
                j14 = Math.max(0L, this.f54610u + j3);
            }
        }
        this.f54595e = j14;
        this.f54596f = j3 >= 0;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
