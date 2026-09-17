package x3;

import c3.h0;
import c3.q;
import e2.v;
import n7.z0;
public abstract class i {
    public h0 f48832b;
    public q f48833c;
    public g d;
    public long f48834e;
    public long f48835f;
    public long f48836g;
    public int h;
    public int f48837i;
    public long f48839k;
    public boolean f48840l;
    public boolean f48841m;
    public final e f48831a = new e();
    public z0 f48838j = new z0(25, false);

    public void a(long j3) {
        this.f48836g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, z0 z0Var);

    public void d(boolean z10) {
        if (z10) {
            this.f48838j = new z0(25, false);
            this.f48835f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.f48834e = -1L;
        this.f48836g = 0L;
    }
}
