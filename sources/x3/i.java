package x3;

import c3.h0;
import c3.q;
import e2.v;
import n7.z0;
public abstract class i {
    public h0 f45524b;
    public q f45525c;
    public g d;
    public long e;
    public long f45526f;
    public long f45527g;
    public int h;
    public int f45528i;
    public long f45530k;
    public boolean f45531l;
    public boolean f45532m;
    public final e f45523a = new e();
    public z0 f45529j = new z0(25);

    public void a(long j3) {
        this.f45527g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, z0 z0Var);

    public void d(boolean z10) {
        if (z10) {
            this.f45529j = new z0(25);
            this.f45526f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.f45527g = 0L;
    }
}
