package x3;

import c3.h0;
import c3.q;
import e2.v;
import n7.z0;
public abstract class i {
    public h0 f48831b;
    public q f48832c;
    public g d;
    public long f48833e;
    public long f48834f;
    public long f48835g;
    public int h;
    public int f48836i;
    public long f48838k;
    public boolean f48839l;
    public boolean f48840m;
    public final e f48830a = new e();
    public z0 f48837j = new z0(25, false);

    public void a(long j3) {
        this.f48835g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, z0 z0Var);

    public void d(boolean z10) {
        if (z10) {
            this.f48837j = new z0(25, false);
            this.f48834f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.f48833e = -1L;
        this.f48835g = 0L;
    }
}
