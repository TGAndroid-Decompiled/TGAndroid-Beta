package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long e;
    public final boolean f40492f;
    public final boolean f40493g;
    public final long h;
    public final boolean f40494i;
    public final int f40495j;
    public final long f40496k;
    public final int f40497l;
    public final long f40498m;
    public final long f40499n;
    public final boolean f40500o;
    public final boolean f40501p;
    public final b2.o f40502q;
    public final i0 f40503r;
    public final i0 f40504s;
    public final k0 f40505t;
    public final long f40506u;
    public final l v;
    public final i0 f40507w;

    public m(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, l lVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f40493g = z10;
        this.f40494i = z11;
        this.f40495j = i11;
        this.f40496k = j11;
        this.f40497l = i12;
        this.f40498m = j12;
        this.f40499n = j13;
        this.f40500o = z13;
        this.f40501p = z14;
        this.f40502q = oVar;
        this.f40503r = i0.v(list2);
        this.f40504s = i0.v(list3);
        this.f40505t = k0.a(map);
        this.f40507w = i0.v(list4);
        if (!list3.isEmpty()) {
            h hVar = (h) e9.q.l(list3);
            this.f40506u = hVar.e + hVar.f40484c;
        } else if (!list2.isEmpty()) {
            j jVar = (j) e9.q.l(list2);
            this.f40506u = jVar.e + jVar.f40484c;
        } else {
            this.f40506u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f40506u, j3);
            } else {
                j14 = Math.max(0L, this.f40506u + j3);
            }
        }
        this.e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f40492f = z15;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
