package x3;

import c3.h0;
import c3.q;
import e2.v;
import n7.z0;
public abstract class i {
    public h0 f45527b;
    public q f45528c;
    public g d;
    public long e;
    public long f45529f;
    public long f45530g;
    public int h;
    public int f45531i;
    public long f45533k;
    public boolean f45534l;
    public boolean f45535m;
    public final e f45526a = new e();
    public z0 f45532j = new z0(25);

    public void a(long j3) {
        this.f45530g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, z0 z0Var);

    public void d(boolean z10) {
        if (z10) {
            this.f45532j = new z0(25);
            this.f45529f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.f45530g = 0L;
    }
}
