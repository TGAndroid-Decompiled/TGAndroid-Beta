package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long e;
    public final boolean f40780f;
    public final boolean f40781g;
    public final long h;
    public final boolean f40782i;
    public final int f40783j;
    public final long f40784k;
    public final int f40785l;
    public final long f40786m;
    public final long f40787n;
    public final boolean f40788o;
    public final boolean f40789p;
    public final b2.o f40790q;
    public final i0 f40791r;
    public final i0 f40792s;
    public final k0 f40793t;
    public final long f40794u;
    public final k v;
    public final i0 f40795w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f40781g = z10;
        this.f40782i = z11;
        this.f40783j = i11;
        this.f40784k = j11;
        this.f40785l = i12;
        this.f40786m = j12;
        this.f40787n = j13;
        this.f40788o = z13;
        this.f40789p = z14;
        this.f40790q = oVar;
        this.f40791r = i0.v(list2);
        this.f40792s = i0.v(list3);
        this.f40793t = k0.a(map);
        this.f40795w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f40794u = gVar.e + gVar.f40772c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f40794u = iVar.e + iVar.f40772c;
        } else {
            this.f40794u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f40794u, j3);
            } else {
                j14 = Math.max(0L, this.f40794u + j3);
            }
        }
        this.e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f40780f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
