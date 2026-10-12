package x3;

import c3.h0;
import c3.q;
import e2.v;
import n6.k;
public abstract class i {
    public h0 f50814b;
    public q f50815c;
    public g d;
    public long f50816e;
    public long f50817f;
    public long f50818g;
    public int h;
    public int f50819i;
    public long f50821k;
    public boolean f50822l;
    public boolean f50823m;
    public final e f50813a = new e();
    public k f50820j = new k(27);

    public void a(long j3) {
        this.f50818g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, k kVar);

    public void d(boolean z10) {
        if (z10) {
            this.f50820j = new k(27);
            this.f50817f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.f50816e = -1L;
        this.f50818g = 0L;
    }
}
