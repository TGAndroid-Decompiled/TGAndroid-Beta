package x3;

import c3.h0;
import c3.q;
import e2.v;
import n7.z0;
public abstract class i {
    public h0 f48802b;
    public q f48803c;
    public g d;
    public long f48804e;
    public long f48805f;
    public long f48806g;
    public int h;
    public int f48807i;
    public long f48809k;
    public boolean f48810l;
    public boolean f48811m;
    public final e f48801a = new e();
    public z0 f48808j = new z0(25, false);

    public void a(long j3) {
        this.f48806g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, z0 z0Var);

    public void d(boolean z10) {
        if (z10) {
            this.f48808j = new z0(25, false);
            this.f48805f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.f48804e = -1L;
        this.f48806g = 0L;
    }
}
