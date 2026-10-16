package p2;

import e9.n0;
import e9.q0;
import java.util.List;
import java.util.Map;
public final class m extends q {
    public final int d;
    public final long e;
    public final boolean f42610f;
    public final boolean f42611g;
    public final long h;
    public final boolean f42612i;
    public final int f42613j;
    public final long f42614k;
    public final int f42615l;
    public final long f42616m;
    public final long f42617n;
    public final boolean f42618o;
    public final boolean f42619p;
    public final b2.t f42620q;
    public final n0 f42621r;
    public final n0 f42622s;
    public final q0 f42623t;
    public final long f42624u;
    public final l v;
    public final n0 f42625w;
    public final j f42626x;

    public m(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, b2.t tVar, List list2, List list3, l lVar, Map map, List list4, j jVar) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j11;
        this.f42611g = z10;
        this.f42612i = z11;
        this.f42613j = i11;
        this.f42614k = j12;
        this.f42615l = i12;
        this.f42616m = j13;
        this.f42617n = j14;
        this.f42618o = z13;
        this.f42619p = z14;
        this.f42620q = tVar;
        this.f42621r = n0.u(list2);
        this.f42622s = n0.u(list3);
        this.f42623t = q0.a(map);
        this.f42625w = n0.u(list4);
        this.f42626x = jVar;
        if (!list3.isEmpty()) {
            h hVar = (h) e9.s.m(list3);
            this.f42624u = hVar.e + hVar.f42602c;
        } else if (!list2.isEmpty()) {
            j jVar2 = (j) e9.s.m(list2);
            this.f42624u = jVar2.e + jVar2.f42602c;
        } else {
            this.f42624u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f42624u, j10);
            } else {
                j15 = Math.max(0L, this.f42624u + j10);
            }
        }
        this.e = j15;
        if (j10 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f42610f = z15;
        this.v = lVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
