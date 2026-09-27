package x3;

import c3.h0;
import c3.q;
import e2.v;
import n7.z0;
public abstract class i {
    public h0 f45571b;
    public q f45572c;
    public g d;
    public long e;
    public long f45573f;
    public long f45574g;
    public int h;
    public int f45575i;
    public long f45577k;
    public boolean f45578l;
    public boolean f45579m;
    public final e f45570a = new e();
    public z0 f45576j = new z0(25);

    public void a(long j3) {
        this.f45574g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, z0 z0Var);

    public void d(boolean z10) {
        if (z10) {
            this.f45576j = new z0(25);
            this.f45573f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.f45574g = 0L;
    }
}
