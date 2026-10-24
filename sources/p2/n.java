package p2;

import e9.n0;
import e9.q0;
import java.util.List;
import java.util.Map;
public final class n extends r {
    public final int d;
    public final long e;
    public final boolean f44420f;
    public final boolean f44421g;
    public final long h;
    public final boolean f44422i;
    public final int f44423j;
    public final long f44424k;
    public final int f44425l;
    public final long f44426m;
    public final long f44427n;
    public final boolean f44428o;
    public final boolean f44429p;
    public final b2.s f44430q;
    public final n0 f44431r;
    public final n0 f44432s;
    public final q0 f44433t;
    public final long f44434u;
    public final m v;
    public final n0 f44435w;
    public final k f44436x;

    public n(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, b2.s sVar, List list2, List list3, m mVar, Map map, List list4, k kVar) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j11;
        this.f44421g = z10;
        this.f44422i = z11;
        this.f44423j = i11;
        this.f44424k = j12;
        this.f44425l = i12;
        this.f44426m = j13;
        this.f44427n = j14;
        this.f44428o = z13;
        this.f44429p = z14;
        this.f44430q = sVar;
        this.f44431r = n0.u(list2);
        this.f44432s = n0.u(list3);
        this.f44433t = q0.a(map);
        this.f44435w = n0.u(list4);
        this.f44436x = kVar;
        if (!list3.isEmpty()) {
            i iVar = (i) e9.s.m(list3);
            this.f44434u = iVar.e + iVar.f44412c;
        } else if (!list2.isEmpty()) {
            k kVar2 = (k) e9.s.m(list2);
            this.f44434u = kVar2.e + kVar2.f44412c;
        } else {
            this.f44434u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f44434u, j10);
            } else {
                j15 = Math.max(0L, this.f44434u + j10);
            }
        }
        this.e = j15;
        if (j10 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f44420f = z15;
        this.v = mVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
