package p2;

import e9.n0;
import e9.q0;
import java.util.List;
import java.util.Map;
public final class n extends r {
    public final int d;
    public final long e;
    public final boolean f44020f;
    public final boolean f44021g;
    public final long h;
    public final boolean f44022i;
    public final int f44023j;
    public final long f44024k;
    public final int f44025l;
    public final long f44026m;
    public final long f44027n;
    public final boolean f44028o;
    public final boolean f44029p;
    public final b2.s f44030q;
    public final n0 f44031r;
    public final n0 f44032s;
    public final q0 f44033t;
    public final long f44034u;
    public final m v;
    public final n0 f44035w;
    public final k f44036x;

    public n(int i10, String str, List list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, b2.s sVar, List list2, List list3, m mVar, Map map, List list4, k kVar) {
        super(str, list, z12);
        boolean z15;
        this.d = i10;
        this.h = j11;
        this.f44021g = z10;
        this.f44022i = z11;
        this.f44023j = i11;
        this.f44024k = j12;
        this.f44025l = i12;
        this.f44026m = j13;
        this.f44027n = j14;
        this.f44028o = z13;
        this.f44029p = z14;
        this.f44030q = sVar;
        this.f44031r = n0.u(list2);
        this.f44032s = n0.u(list3);
        this.f44033t = q0.a(map);
        this.f44035w = n0.u(list4);
        this.f44036x = kVar;
        if (!list3.isEmpty()) {
            i iVar = (i) e9.s.m(list3);
            this.f44034u = iVar.e + iVar.f44012c;
        } else if (!list2.isEmpty()) {
            k kVar2 = (k) e9.s.m(list2);
            this.f44034u = kVar2.e + kVar2.f44012c;
        } else {
            this.f44034u = 0L;
        }
        long j15 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (j10 >= 0) {
                j15 = Math.min(this.f44034u, j10);
            } else {
                j15 = Math.max(0L, this.f44034u + j10);
            }
        }
        this.e = j15;
        if (j10 >= 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f44020f = z15;
        this.v = mVar;
    }

    @Override
    public final Object a(List list) {
        return this;
    }
}
