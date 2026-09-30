package x3;

import c3.h0;
import c3.q;
import e2.v;
import n7.z0;
public abstract class i {
    public h0 f45633b;
    public q f45634c;
    public g d;
    public long e;
    public long f45635f;
    public long f45636g;
    public int h;
    public int f45637i;
    public long f45639k;
    public boolean f45640l;
    public boolean f45641m;
    public final e f45632a = new e();
    public z0 f45638j = new z0(25);

    public void a(long j3) {
        this.f45636g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, z0 z0Var);

    public void d(boolean z10) {
        if (z10) {
            this.f45638j = new z0(25);
            this.f45635f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.f45636g = 0L;
    }
}
