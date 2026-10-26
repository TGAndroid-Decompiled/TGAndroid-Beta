package p2;

import f9.i0;
import f9.l0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long e;
    public final boolean f46563f;
    public final boolean f46564g;
    public final long h;
    public final boolean f46565i;
    public final int f46566j;
    public final long f46567k;
    public final int f46568l;
    public final long f46569m;
    public final long f46570n;
    public final boolean f46571o;
    public final boolean f46572p;
    public final b2.t f46573q;
    public final i0 f46574r;
    public final i0 f46575s;
    public final l0 f46576t;
    public final long f46577u;
    public final l v;
    public final i0 f46578w;
    public final j f46579x;

    public m(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, b2.t tVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j11;
        this.f46564g = z10;
        this.f46565i = z11;
        this.f46566j = i11;
        this.f46567k = j12;
        this.f46568l = i12;
        this.f46569m = j13;
        this.f46570n = j14;
        this.f46571o = z13;
        this.f46572p = z14;
        this.f46573q = tVar;
        this.f46574r = i0.u(list2);
        this.f46575s = i0.u(list3);
        this.f46576t = l0.a(map);
        this.f46578w = i0.u(list4);
        this.f46579x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) f9.o.m(list3);
            this.f46577u = hVar.e + hVar.f46555c;
        } else if (!list2.isEmpty()) {
            j jVar2 = (j) f9.o.m(list2);
            this.f46577u = jVar2.e + jVar2.f46555c;
        } else {
            this.f46577u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f46577u, j10);
            } else {
                j15 = Math.max(0L, this.f46577u + j10);
            }
        }
        this.e = j15;
        if (j10 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f46563f = z15;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
