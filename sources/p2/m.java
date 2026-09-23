package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long e;
    public final boolean f40416f;
    public final boolean f40417g;
    public final long h;
    public final boolean f40418i;
    public final int f40419j;
    public final long f40420k;
    public final int f40421l;
    public final long f40422m;
    public final long f40423n;
    public final boolean f40424o;
    public final boolean f40425p;
    public final b2.o f40426q;
    public final i0 f40427r;
    public final i0 f40428s;
    public final k0 f40429t;
    public final long f40430u;
    public final l v;
    public final i0 f40431w;

    public m(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, l lVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f40417g = z10;
        this.f40418i = z11;
        this.f40419j = i11;
        this.f40420k = j11;
        this.f40421l = i12;
        this.f40422m = j12;
        this.f40423n = j13;
        this.f40424o = z13;
        this.f40425p = z14;
        this.f40426q = oVar;
        this.f40427r = i0.v(list2);
        this.f40428s = i0.v(list3);
        this.f40429t = k0.a(map);
        this.f40431w = i0.v(list4);
        if (!list3.isEmpty()) {
            h hVar = (h) e9.q.l(list3);
            this.f40430u = hVar.e + hVar.f40408c;
        } else if (!list2.isEmpty()) {
            j jVar = (j) e9.q.l(list2);
            this.f40430u = jVar.e + jVar.f40408c;
        } else {
            this.f40430u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f40430u, j3);
            } else {
                j14 = Math.max(0L, this.f40430u + j3);
            }
        }
        this.e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f40416f = z15;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
