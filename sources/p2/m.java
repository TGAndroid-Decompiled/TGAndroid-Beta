package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long e;
    public final boolean f40465f;
    public final boolean f40466g;
    public final long h;
    public final boolean f40467i;
    public final int f40468j;
    public final long f40469k;
    public final int f40470l;
    public final long f40471m;
    public final long f40472n;
    public final boolean f40473o;
    public final boolean f40474p;
    public final b2.o f40475q;
    public final i0 f40476r;
    public final i0 f40477s;
    public final k0 f40478t;
    public final long f40479u;
    public final l v;
    public final i0 f40480w;

    public m(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, l lVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f40466g = z10;
        this.f40467i = z11;
        this.f40468j = i11;
        this.f40469k = j11;
        this.f40470l = i12;
        this.f40471m = j12;
        this.f40472n = j13;
        this.f40473o = z13;
        this.f40474p = z14;
        this.f40475q = oVar;
        this.f40476r = i0.v(list2);
        this.f40477s = i0.v(list3);
        this.f40478t = k0.a(map);
        this.f40480w = i0.v(list4);
        if (!list3.isEmpty()) {
            h hVar = (h) e9.q.l(list3);
            this.f40479u = hVar.e + hVar.f40457c;
        } else if (!list2.isEmpty()) {
            j jVar = (j) e9.q.l(list2);
            this.f40479u = jVar.e + jVar.f40457c;
        } else {
            this.f40479u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f40479u, j3);
            } else {
                j14 = Math.max(0L, this.f40479u + j3);
            }
        }
        this.e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f40465f = z15;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
