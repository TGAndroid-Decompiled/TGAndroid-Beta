package p2;

import e9.n0;
import e9.q0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long e;
    public final boolean f43997f;
    public final boolean f43998g;
    public final long h;
    public final boolean f43999i;
    public final int f44000j;
    public final long f44001k;
    public final int f44002l;
    public final long f44003m;
    public final long f44004n;
    public final boolean f44005o;
    public final boolean f44006p;
    public final b2.s f44007q;
    public final n0 f44008r;
    public final n0 f44009s;
    public final q0 f44010t;
    public final long f44011u;
    public final l v;
    public final n0 f44012w;
    public final j f44013x;

    public m(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, b2.s sVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j11;
        this.f43998g = z10;
        this.f43999i = z11;
        this.f44000j = i11;
        this.f44001k = j12;
        this.f44002l = i12;
        this.f44003m = j13;
        this.f44004n = j14;
        this.f44005o = z13;
        this.f44006p = z14;
        this.f44007q = sVar;
        this.f44008r = n0.u(list2);
        this.f44009s = n0.u(list3);
        this.f44010t = q0.a(map);
        this.f44012w = n0.u(list4);
        this.f44013x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) e9.s.m(list3);
            this.f44011u = hVar.e + hVar.f43989c;
        } else if (!list2.isEmpty()) {
            j jVar2 = (j) e9.s.m(list2);
            this.f44011u = jVar2.e + jVar2.f43989c;
        } else {
            this.f44011u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f44011u, j10);
            } else {
                j15 = Math.max(0L, this.f44011u + j10);
            }
        }
        this.e = j15;
        if (j10 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f43997f = z15;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
