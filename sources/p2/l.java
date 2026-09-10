package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long e;
    public final boolean f39590f;
    public final boolean f39591g;
    public final long h;
    public final boolean f39592i;
    public final int f39593j;
    public final long f39594k;
    public final int f39595l;
    public final long f39596m;
    public final long f39597n;
    public final boolean f39598o;
    public final boolean f39599p;
    public final b2.o f39600q;
    public final i0 f39601r;
    public final i0 f39602s;
    public final k0 f39603t;
    public final long f39604u;
    public final k v;
    public final i0 f39605w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f39591g = z10;
        this.f39592i = z11;
        this.f39593j = i11;
        this.f39594k = j11;
        this.f39595l = i12;
        this.f39596m = j12;
        this.f39597n = j13;
        this.f39598o = z13;
        this.f39599p = z14;
        this.f39600q = oVar;
        this.f39601r = i0.v(list2);
        this.f39602s = i0.v(list3);
        this.f39603t = k0.a(map);
        this.f39605w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f39604u = gVar.e + gVar.f39582c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f39604u = iVar.e + iVar.f39582c;
        } else {
            this.f39604u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f39604u, j3);
            } else {
                j14 = Math.max(0L, this.f39604u + j3);
            }
        }
        this.e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f39590f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
