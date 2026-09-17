package x3;

import c3.h0;
import c3.q;
import e2.v;
import n7.z0;
public abstract class i {
    public h0 f48803b;
    public q f48804c;
    public g d;
    public long f48805e;
    public long f48806f;
    public long f48807g;
    public int h;
    public int f48808i;
    public long f48810k;
    public boolean f48811l;
    public boolean f48812m;
    public final e f48802a = new e();
    public z0 f48809j = new z0(25, false);

    public void a(long j3) {
        this.f48807g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, z0 z0Var);

    public void d(boolean z10) {
        if (z10) {
            this.f48809j = new z0(25, false);
            this.f48806f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.f48805e = -1L;
        this.f48807g = 0L;
    }
}
