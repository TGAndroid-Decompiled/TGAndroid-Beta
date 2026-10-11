package p2;

import e9.i0;
import e9.k0;
import java.util.List;
import java.util.Map;
public final class l extends p {
    public final int d;
    public final long f45303e;
    public final boolean f45304f;
    public final boolean f45305g;
    public final long h;
    public final boolean f45306i;
    public final int f45307j;
    public final long f45308k;
    public final int f45309l;
    public final long f45310m;
    public final long f45311n;
    public final boolean f45312o;
    public final boolean f45313p;
    public final b2.o f45314q;
    public final i0 f45315r;
    public final i0 f45316s;
    public final k0 f45317t;
    public final long f45318u;
    public final k v;
    public final i0 f45319w;

    public l(int i10, String str, List list, long j3, boolean z10, long j10, boolean z11, int i11, long j11, int i12, long j12, long j13, boolean z12, boolean z13, boolean z14, b2.o oVar, List list2, List list3, k kVar, Map map, List list4) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j10;
        this.f45305g = z10;
        this.f45306i = z11;
        this.f45307j = i11;
        this.f45308k = j11;
        this.f45309l = i12;
        this.f45310m = j12;
        this.f45311n = j13;
        this.f45312o = z13;
        this.f45313p = z14;
        this.f45314q = oVar;
        this.f45315r = i0.v(list2);
        this.f45316s = i0.v(list3);
        this.f45317t = k0.a(map);
        this.f45319w = i0.v(list4);
        if (!list3.isEmpty()) {
            g gVar = (g) e9.q.l(list3);
            this.f45318u = gVar.f45294e + gVar.f45293c;
        } else if (!list2.isEmpty()) {
            i iVar = (i) e9.q.l(list2);
            this.f45318u = iVar.f45294e + iVar.f45293c;
        } else {
            this.f45318u = 0L;
        }
        long j14 = -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (j3 >= 0) {
                j14 = Math.min(this.f45318u, j3);
            } else {
                j14 = Math.max(0L, this.f45318u + j3);
            }
        }
        this.f45303e = j14;
        if (j3 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f45304f = z15;
        this.v = kVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
