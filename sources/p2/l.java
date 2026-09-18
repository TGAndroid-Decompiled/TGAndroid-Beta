package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long e;
    public final boolean f40718f;
    public final boolean f40719g;
    public final long h;
    public final boolean f40720i;
    public final int f40721j;
    public final long f40722k;
    public final int f40723l;
    public final long f40724m;
    public final long f40725n;
    public final boolean f40726o;
    public final boolean f40727p;
    public final b2.o f40728q;
    public final i0 f40729r;
    public final i0 f40730s;
    public final k0 f40731t;
    public final long f40732u;
    public final k v;
    public final i0 f40733w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f40719g = z10;
        this.f40720i = z11;
        this.f40721j = i11;
        this.f40722k = j11;
        this.f40723l = i12;
        this.f40724m = j12;
        this.f40725n = j13;
        this.f40726o = z13;
        this.f40727p = z14;
        this.f40728q = oVar;
        this.f40729r = i0.v(list2);
        this.f40730s = i0.v(list3);
        this.f40731t = k0.a(map);
        this.f40733w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f40732u = gVar.e + gVar.f40710c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f40732u = iVar.e + iVar.f40710c;
        } else {
            this.f40732u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f40732u, j3);
            } else {
                j14 = Math.max(0L, this.f40732u + j3);
            }
        }
        this.e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f40718f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
