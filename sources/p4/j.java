package p4;

import java.util.List;
import java.util.Map;
import p8.b0;
import p8.z;

public final class j extends n {
    public final int d;

    public final long f45399e;

    public final boolean f45400f;

    public final boolean f45401g;
    public final long h;

    public final boolean f45402i;

    public final int f45403j;

    public final long f45404k;

    public final int f45405l;

    public final long f45406m;

    public final long f45407n;

    public final boolean f45408o;

    public final boolean f45409p;

    public final l3.d f45410q;

    public final z f45411r;

    public final z f45412s;

    public final b0 f45413t;

    public final long f45414u;
    public final i v;

    public j(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, l3.d dVar, List list2, List list3, i iVar, Map map) {
        super(str, list, z12);
        this.d = i10;
        this.h = j11;
        this.f45401g = z10;
        this.f45402i = z11;
        this.f45403j = i11;
        this.f45404k = j12;
        this.f45405l = i12;
        this.f45406m = j13;
        this.f45407n = j14;
        this.f45408o = z13;
        this.f45409p = z14;
        this.f45410q = dVar;
        this.f45411r = z.u(list2);
        this.f45412s = z.u(list3);
        this.f45413t = b0.a(map);
        if (!list3.isEmpty()) {
            e eVar = (e) p8.l.g(list3);
            this.f45414u = eVar.f45390e + eVar.f45389c;
        } else if (list2.isEmpty()) {
            this.f45414u = 0L;
        } else {
            g gVar = (g) p8.l.g(list2);
            this.f45414u = gVar.f45390e + gVar.f45389c;
        }
        this.f45399e = j10 != -9223372036854775807L ? j10 >= 0 ? Math.min(this.f45414u, j10) : Math.max(0L, this.f45414u + j10) : -9223372036854775807L;
        this.f45400f = j10 >= 0;
        this.v = iVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
