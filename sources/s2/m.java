package s2;

import h9.i0;
import h9.l0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long f56253e;
    public final boolean f56254f;
    public final boolean f56255g;
    public final long h;
    public final boolean f56256i;
    public final int f56257j;
    public final long f56258k;
    public final int f56259l;
    public final long f56260m;
    public final long f56261n;
    public final boolean f56262o;
    public final boolean f56263p;
    public final e2.r f56264q;
    public final i0 f56265r;
    public final i0 f56266s;
    public final l0 f56267t;
    public final long f56268u;
    public final l v;
    public final i0 f56269w;
    public final j f56270x;

    public m(int i7, String str, List list, long j3, boolean z10, long j10, boolean z11, int i10, long j11, int i11, long j12, long j13, boolean z12, boolean z13, boolean z14, e2.r rVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z12);
        this.d = i7;
        this.h = j10;
        this.f56255g = z10;
        this.f56256i = z11;
        this.f56257j = i10;
        this.f56258k = j11;
        this.f56259l = i11;
        this.f56260m = j12;
        this.f56261n = j13;
        this.f56262o = z13;
        this.f56263p = z14;
        this.f56264q = rVar;
        this.f56265r = i0.q(list2);
        this.f56266s = i0.q(list3);
        this.f56267t = l0.b(map);
        this.f56269w = i0.q(list4);
        this.f56270x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) h9.o.n(list3);
            this.f56268u = hVar.f56243e + hVar.f56242c;
        } else if (!list2.isEmpty()) {
            j jVar2 = (j) h9.o.n(list2);
            this.f56268u = jVar2.f56243e + jVar2.f56242c;
        } else {
            this.f56268u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f56268u, j3);
            } else {
                j14 = Math.max(0L, this.f56268u + j3);
            }
        }
        this.f56253e = j14;
        this.f56254f = j3 >= 0;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
