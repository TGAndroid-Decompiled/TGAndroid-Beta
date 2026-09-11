package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long f43713e;
    public final boolean f43714f;
    public final boolean f43715g;
    public final long h;
    public final boolean f43716i;
    public final int f43717j;
    public final long f43718k;
    public final int f43719l;
    public final long f43720m;
    public final long f43721n;
    public final boolean f43722o;
    public final boolean f43723p;
    public final b2.o f43724q;
    public final i0 f43725r;
    public final i0 f43726s;
    public final k0 f43727t;
    public final long f43728u;
    public final k v;
    public final i0 f43729w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f43715g = z10;
        this.f43716i = z11;
        this.f43717j = i11;
        this.f43718k = j11;
        this.f43719l = i12;
        this.f43720m = j12;
        this.f43721n = j13;
        this.f43722o = z13;
        this.f43723p = z14;
        this.f43724q = oVar;
        this.f43725r = i0.v(list2);
        this.f43726s = i0.v(list3);
        this.f43727t = k0.a(map);
        this.f43729w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f43728u = gVar.f43704e + gVar.f43703c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f43728u = iVar.f43704e + iVar.f43703c;
        } else {
            this.f43728u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f43728u, j3);
            } else {
                j14 = Math.max(0L, this.f43728u + j3);
            }
        }
        this.f43713e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f43714f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
