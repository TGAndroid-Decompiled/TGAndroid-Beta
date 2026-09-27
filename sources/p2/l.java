package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long e;
    public final boolean f40730f;
    public final boolean f40731g;
    public final long h;
    public final boolean f40732i;
    public final int f40733j;
    public final long f40734k;
    public final int f40735l;
    public final long f40736m;
    public final long f40737n;
    public final boolean f40738o;
    public final boolean f40739p;
    public final b2.o f40740q;
    public final i0 f40741r;
    public final i0 f40742s;
    public final k0 f40743t;
    public final long f40744u;
    public final k v;
    public final i0 f40745w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f40731g = z10;
        this.f40732i = z11;
        this.f40733j = i11;
        this.f40734k = j11;
        this.f40735l = i12;
        this.f40736m = j12;
        this.f40737n = j13;
        this.f40738o = z13;
        this.f40739p = z14;
        this.f40740q = oVar;
        this.f40741r = i0.v(list2);
        this.f40742s = i0.v(list3);
        this.f40743t = k0.a(map);
        this.f40745w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f40744u = gVar.e + gVar.f40722c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f40744u = iVar.e + iVar.f40722c;
        } else {
            this.f40744u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f40744u, j3);
            } else {
                j14 = Math.max(0L, this.f40744u + j3);
            }
        }
        this.e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f40730f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
