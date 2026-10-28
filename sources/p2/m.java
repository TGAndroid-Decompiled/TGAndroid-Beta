package p2;

import f9.i0;
import f9.l0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long e;
    public final boolean f46598f;
    public final boolean f46599g;
    public final long h;
    public final boolean f46600i;
    public final int f46601j;
    public final long f46602k;
    public final int f46603l;
    public final long f46604m;
    public final long f46605n;
    public final boolean f46606o;
    public final boolean f46607p;
    public final b2.t f46608q;
    public final i0 f46609r;
    public final i0 f46610s;
    public final l0 f46611t;
    public final long f46612u;
    public final l v;
    public final i0 f46613w;
    public final j f46614x;

    public m(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, b2.t tVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j11;
        this.f46599g = z10;
        this.f46600i = z11;
        this.f46601j = i11;
        this.f46602k = j12;
        this.f46603l = i12;
        this.f46604m = j13;
        this.f46605n = j14;
        this.f46606o = z13;
        this.f46607p = z14;
        this.f46608q = tVar;
        this.f46609r = i0.u(list2);
        this.f46610s = i0.u(list3);
        this.f46611t = l0.a(map);
        this.f46613w = i0.u(list4);
        this.f46614x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) f9.o.m(list3);
            this.f46612u = hVar.e + hVar.f46590c;
        } else if (!list2.isEmpty()) {
            j jVar2 = (j) f9.o.m(list2);
            this.f46612u = jVar2.e + jVar2.f46590c;
        } else {
            this.f46612u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f46612u, j10);
            } else {
                j15 = Math.max(0L, this.f46612u + j10);
            }
        }
        this.e = j15;
        if (j10 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f46598f = z15;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
