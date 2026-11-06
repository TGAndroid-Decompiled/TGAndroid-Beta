package s2;

import h9.i0;
import h9.l0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long f54571e;
    public final boolean f54572f;
    public final boolean f54573g;
    public final long h;
    public final boolean f54574i;
    public final int f54575j;
    public final long f54576k;
    public final int f54577l;
    public final long f54578m;
    public final long f54579n;
    public final boolean f54580o;
    public final boolean f54581p;
    public final e2.r f54582q;
    public final i0 f54583r;
    public final i0 f54584s;
    public final l0 f54585t;
    public final long f54586u;
    public final l v;
    public final i0 f54587w;
    public final j f54588x;

    public m(int i7, String str, List list, long j3, boolean z9, long j10, boolean z10, int i10, long j11, int i11, long j12, long j13, boolean z11, boolean z12, boolean z13, e2.r rVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z11);
        this.d = i7;
        this.h = j10;
        this.f54573g = z9;
        this.f54574i = z10;
        this.f54575j = i10;
        this.f54576k = j11;
        this.f54577l = i11;
        this.f54578m = j12;
        this.f54579n = j13;
        this.f54580o = z12;
        this.f54581p = z13;
        this.f54582q = rVar;
        this.f54583r = i0.q(list2);
        this.f54584s = i0.q(list3);
        this.f54585t = l0.b(map);
        this.f54587w = i0.q(list4);
        this.f54588x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) h9.o.n(list3);
            this.f54586u = hVar.f54561e + hVar.f54560c;
        } else if (!list2.isEmpty()) {
            j jVar2 = (j) h9.o.n(list2);
            this.f54586u = jVar2.f54561e + jVar2.f54560c;
        } else {
            this.f54586u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f54586u, j3);
            } else {
                j14 = Math.max(0L, this.f54586u + j3);
            }
        }
        this.f54571e = j14;
        this.f54572f = j3 >= 0;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
