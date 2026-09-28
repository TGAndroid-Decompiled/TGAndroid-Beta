package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long e;
    public final boolean f40732f;
    public final boolean f40733g;
    public final long h;
    public final boolean f40734i;
    public final int f40735j;
    public final long f40736k;
    public final int f40737l;
    public final long f40738m;
    public final long f40739n;
    public final boolean f40740o;
    public final boolean f40741p;
    public final b2.o f40742q;
    public final i0 f40743r;
    public final i0 f40744s;
    public final k0 f40745t;
    public final long f40746u;
    public final k v;
    public final i0 f40747w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f40733g = z10;
        this.f40734i = z11;
        this.f40735j = i11;
        this.f40736k = j11;
        this.f40737l = i12;
        this.f40738m = j12;
        this.f40739n = j13;
        this.f40740o = z13;
        this.f40741p = z14;
        this.f40742q = oVar;
        this.f40743r = i0.v(list2);
        this.f40744s = i0.v(list3);
        this.f40745t = k0.a(map);
        this.f40747w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f40746u = gVar.e + gVar.f40724c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f40746u = iVar.e + iVar.f40724c;
        } else {
            this.f40746u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f40746u, j3);
            } else {
                j14 = Math.max(0L, this.f40746u + j3);
            }
        }
        this.e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f40732f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
