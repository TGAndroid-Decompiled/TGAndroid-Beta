package s2;

import h9.i0;
import h9.l0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long f54596e;
    public final boolean f54597f;
    public final boolean f54598g;
    public final long h;
    public final boolean f54599i;
    public final int f54600j;
    public final long f54601k;
    public final int f54602l;
    public final long f54603m;
    public final long f54604n;
    public final boolean f54605o;
    public final boolean f54606p;
    public final e2.r f54607q;
    public final i0 f54608r;
    public final i0 f54609s;
    public final l0 f54610t;
    public final long f54611u;
    public final l v;
    public final i0 f54612w;
    public final j f54613x;

    public m(int i7, String str, List list, long j3, boolean z9, long j10, boolean z10, int i10, long j11, int i11, long j12, long j13, boolean z11, boolean z12, boolean z13, e2.r rVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z11);
        this.d = i7;
        this.h = j10;
        this.f54598g = z9;
        this.f54599i = z10;
        this.f54600j = i10;
        this.f54601k = j11;
        this.f54602l = i11;
        this.f54603m = j12;
        this.f54604n = j13;
        this.f54605o = z12;
        this.f54606p = z13;
        this.f54607q = rVar;
        this.f54608r = i0.q(list2);
        this.f54609s = i0.q(list3);
        this.f54610t = l0.b(map);
        this.f54612w = i0.q(list4);
        this.f54613x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) h9.o.n(list3);
            this.f54611u = hVar.f54586e + hVar.f54585c;
        } else if (!list2.isEmpty()) {
            j jVar2 = (j) h9.o.n(list2);
            this.f54611u = jVar2.f54586e + jVar2.f54585c;
        } else {
            this.f54611u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f54611u, j3);
            } else {
                j14 = Math.max(0L, this.f54611u + j3);
            }
        }
        this.f54596e = j14;
        this.f54597f = j3 >= 0;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
