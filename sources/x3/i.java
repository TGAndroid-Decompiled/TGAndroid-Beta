package x3;

import c3.h0;
import c3.q;
import e2.v;
import n7.z0;
public abstract class i {
    public h0 f45525b;
    public q f45526c;
    public g d;
    public long e;
    public long f45527f;
    public long f45528g;
    public int h;
    public int f45529i;
    public long f45531k;
    public boolean f45532l;
    public boolean f45533m;
    public final e f45524a = new e();
    public z0 f45530j = new z0(25);

    public void a(long j3) {
        this.f45528g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, z0 z0Var);

    public void d(boolean z10) {
        if (z10) {
            this.f45530j = new z0(25);
            this.f45527f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.f45528g = 0L;
    }
}
