package p2;

import f9.i0;
import f9.l0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long e;
    public final boolean f46560f;
    public final boolean f46561g;
    public final long h;
    public final boolean f46562i;
    public final int f46563j;
    public final long f46564k;
    public final int f46565l;
    public final long f46566m;
    public final long f46567n;
    public final boolean f46568o;
    public final boolean f46569p;
    public final b2.t f46570q;
    public final i0 f46571r;
    public final i0 f46572s;
    public final l0 f46573t;
    public final long f46574u;
    public final l v;
    public final i0 f46575w;
    public final j f46576x;

    public m(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, b2.t tVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j11;
        this.f46561g = z10;
        this.f46562i = z11;
        this.f46563j = i11;
        this.f46564k = j12;
        this.f46565l = i12;
        this.f46566m = j13;
        this.f46567n = j14;
        this.f46568o = z13;
        this.f46569p = z14;
        this.f46570q = tVar;
        this.f46571r = i0.u(list2);
        this.f46572s = i0.u(list3);
        this.f46573t = l0.a(map);
        this.f46575w = i0.u(list4);
        this.f46576x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) f9.o.m(list3);
            this.f46574u = hVar.e + hVar.f46552c;
        } else if (!list2.isEmpty()) {
            j jVar2 = (j) f9.o.m(list2);
            this.f46574u = jVar2.e + jVar2.f46552c;
        } else {
            this.f46574u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f46574u, j10);
            } else {
                j15 = Math.max(0L, this.f46574u + j10);
            }
        }
        this.e = j15;
        if (j10 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f46560f = z15;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
