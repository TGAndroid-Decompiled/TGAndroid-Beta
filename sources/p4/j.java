package p4;

import java.util.List;
import java.util.Map;
import o8.b0;
import o8.z;
public final class j extends n {
    public final int d;
    public final long f45393e;
    public final boolean f45394f;
    public final boolean f45395g;
    public final long h;
    public final boolean f45396i;
    public final int f45397j;
    public final long f45398k;
    public final int f45399l;
    public final long f45400m;
    public final long f45401n;
    public final boolean f45402o;
    public final boolean f45403p;
    public final l3.c f45404q;
    public final z f45405r;
    public final z f45406s;
    public final b0 f45407t;
    public final long f45408u;
    public final i v;

    public j(int i9, String str, List list, long j10, boolean z10, long j11, boolean z11, int i10, long j12, int i11, long j13, long j14, boolean z12, boolean z13, boolean z14, l3.c cVar, List list2, List list3, i iVar, Map map) {
        super(str, list, z12);
        boolean z15;
        this.d = i9;
        this.h = j11;
        this.f45395g = z10;
        this.f45396i = z11;
        this.f45397j = i10;
        this.f45398k = j12;
        this.f45399l = i11;
        this.f45400m = j13;
        this.f45401n = j14;
        this.f45402o = z13;
        this.f45403p = z14;
        this.f45404q = cVar;
        this.f45405r = z.u(list2);
        this.f45406s = z.u(list3);
        this.f45407t = b0.a(map);
        if (!list3.isEmpty()) {
            e eVar = (e) o8.l.g(list3);
            this.f45408u = eVar.f45384e + eVar.f45383c;
        } else if (!list2.isEmpty()) {
            g gVar = (g) o8.l.g(list2);
            this.f45408u = gVar.f45384e + gVar.f45383c;
        } else {
            this.f45408u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f45408u, j10);
            } else {
                j15 = Math.max(0L, this.f45408u + j10);
            }
        }
        this.f45393e = j15;
        if (j10 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f45394f = z15;
        this.v = iVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
