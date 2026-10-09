package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long f45235e;
    public final boolean f45236f;
    public final boolean f45237g;
    public final long h;
    public final boolean f45238i;
    public final int f45239j;
    public final long f45240k;
    public final int f45241l;
    public final long f45242m;
    public final long f45243n;
    public final boolean f45244o;
    public final boolean f45245p;
    public final b2.o f45246q;
    public final i0 f45247r;
    public final i0 f45248s;
    public final k0 f45249t;
    public final long f45250u;
    public final k v;
    public final i0 f45251w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f45237g = z10;
        this.f45238i = z11;
        this.f45239j = i11;
        this.f45240k = j11;
        this.f45241l = i12;
        this.f45242m = j12;
        this.f45243n = j13;
        this.f45244o = z13;
        this.f45245p = z14;
        this.f45246q = oVar;
        this.f45247r = i0.v(list2);
        this.f45248s = i0.v(list3);
        this.f45249t = k0.a(map);
        this.f45251w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f45250u = gVar.f45226e + gVar.f45225c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f45250u = iVar.f45226e + iVar.f45225c;
        } else {
            this.f45250u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f45250u, j3);
            } else {
                j14 = Math.max(0L, this.f45250u + j3);
            }
        }
        this.f45235e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f45236f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
