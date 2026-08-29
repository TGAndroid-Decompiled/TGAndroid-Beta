package r4;

import java.util.List;
import java.util.Map;
import q8.b0;
import q8.z;
public final class j extends n {
    public final int d;
    public final long f46974e;
    public final boolean f46975f;
    public final boolean f46976g;
    public final long h;
    public final boolean f46977i;
    public final int f46978j;
    public final long f46979k;
    public final int f46980l;
    public final long f46981m;
    public final long f46982n;
    public final boolean f46983o;
    public final boolean f46984p;
    public final n3.c f46985q;
    public final z f46986r;
    public final z f46987s;
    public final b0 f46988t;
    public final long f46989u;
    public final i v;

    public j(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, n3.c cVar, List list2, List list3, i iVar, Map map) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j11;
        this.f46976g = z10;
        this.f46977i = z11;
        this.f46978j = i11;
        this.f46979k = j12;
        this.f46980l = i12;
        this.f46981m = j13;
        this.f46982n = j14;
        this.f46983o = z13;
        this.f46984p = z14;
        this.f46985q = cVar;
        this.f46986r = z.u(list2);
        this.f46987s = z.u(list3);
        this.f46988t = b0.a(map);
        if (!list3.isEmpty()) {
            e eVar = (e) q8.l.g(list3);
            this.f46989u = eVar.f46965e + eVar.f46964c;
        } else if (!list2.isEmpty()) {
            g gVar = (g) q8.l.g(list2);
            this.f46989u = gVar.f46965e + gVar.f46964c;
        } else {
            this.f46989u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f46989u, j10);
            } else {
                j15 = Math.max(0L, this.f46989u + j10);
            }
        }
        this.f46974e = j15;
        if (j10 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f46975f = z15;
        this.v = iVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
