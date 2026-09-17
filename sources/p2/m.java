package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long e;
    public final boolean f40487f;
    public final boolean f40488g;
    public final long h;
    public final boolean f40489i;
    public final int f40490j;
    public final long f40491k;
    public final int f40492l;
    public final long f40493m;
    public final long f40494n;
    public final boolean f40495o;
    public final boolean f40496p;
    public final b2.o f40497q;
    public final i0 f40498r;
    public final i0 f40499s;
    public final k0 f40500t;
    public final long f40501u;
    public final l v;
    public final i0 f40502w;

    public m(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, l lVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f40488g = z10;
        this.f40489i = z11;
        this.f40490j = i11;
        this.f40491k = j11;
        this.f40492l = i12;
        this.f40493m = j12;
        this.f40494n = j13;
        this.f40495o = z13;
        this.f40496p = z14;
        this.f40497q = oVar;
        this.f40498r = i0.v(list2);
        this.f40499s = i0.v(list3);
        this.f40500t = k0.a(map);
        this.f40502w = i0.v(list4);
        if (!list3.isEmpty()) {
            h hVar = (h) e9.q.l(list3);
            this.f40501u = hVar.e + hVar.f40479c;
        } else if (!list2.isEmpty()) {
            j jVar = (j) e9.q.l(list2);
            this.f40501u = jVar.e + jVar.f40479c;
        } else {
            this.f40501u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f40501u, j3);
            } else {
                j14 = Math.max(0L, this.f40501u + j3);
            }
        }
        this.e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f40487f = z15;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
