package p2;

import e9.n0;
import e9.q0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long e;
    public final boolean f44623f;
    public final boolean f44624g;
    public final long h;
    public final boolean f44625i;
    public final int f44626j;
    public final long f44627k;
    public final int f44628l;
    public final long f44629m;
    public final long f44630n;
    public final boolean f44631o;
    public final boolean f44632p;
    public final b2.t f44633q;
    public final n0 f44634r;
    public final n0 f44635s;
    public final q0 f44636t;
    public final long f44637u;
    public final l v;
    public final n0 f44638w;
    public final j f44639x;

    public m(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, b2.t tVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z12);
        this.d = i10;
        this.h = j11;
        this.f44624g = z10;
        this.f44625i = z11;
        this.f44626j = i11;
        this.f44627k = j12;
        this.f44628l = i12;
        this.f44629m = j13;
        this.f44630n = j14;
        this.f44631o = z13;
        this.f44632p = z14;
        this.f44633q = tVar;
        this.f44634r = n0.u(list2);
        this.f44635s = n0.u(list3);
        this.f44636t = q0.a(map);
        this.f44638w = n0.u(list4);
        this.f44639x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) e9.s.m(list3);
            this.f44637u = hVar.e + hVar.f44614c;
        } else if (!list2.isEmpty()) {
            j jVar2 = (j) e9.s.m(list2);
            this.f44637u = jVar2.e + jVar2.f44614c;
        } else {
            this.f44637u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f44637u, j10);
            } else {
                j15 = Math.max(0L, this.f44637u + j10);
            }
        }
        this.e = j15;
        this.f44623f = j10 >= 0;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
