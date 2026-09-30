package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long e;
    public final boolean f40734f;
    public final boolean f40735g;
    public final long h;
    public final boolean f40736i;
    public final int f40737j;
    public final long f40738k;
    public final int f40739l;
    public final long f40740m;
    public final long f40741n;
    public final boolean f40742o;
    public final boolean f40743p;
    public final b2.o f40744q;
    public final i0 f40745r;
    public final i0 f40746s;
    public final k0 f40747t;
    public final long f40748u;
    public final k v;
    public final i0 f40749w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f40735g = z10;
        this.f40736i = z11;
        this.f40737j = i11;
        this.f40738k = j11;
        this.f40739l = i12;
        this.f40740m = j12;
        this.f40741n = j13;
        this.f40742o = z13;
        this.f40743p = z14;
        this.f40744q = oVar;
        this.f40745r = i0.v(list2);
        this.f40746s = i0.v(list3);
        this.f40747t = k0.a(map);
        this.f40749w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f40748u = gVar.e + gVar.f40726c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f40748u = iVar.e + iVar.f40726c;
        } else {
            this.f40748u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f40748u, j3);
            } else {
                j14 = Math.max(0L, this.f40748u + j3);
            }
        }
        this.e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f40734f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
