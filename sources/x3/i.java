package x3;

import c3.h0;
import c3.q;
import e2.v;
import n7.z0;
public abstract class i {
    public h0 f49284b;
    public q f49285c;
    public g d;
    public long f49286e;
    public long f49287f;
    public long f49288g;
    public int h;
    public int f49289i;
    public long f49291k;
    public boolean f49292l;
    public boolean f49293m;
    public final e f49283a = new e();
    public z0 f49290j = new z0(25);

    public void a(long j3) {
        this.f49288g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, z0 z0Var);

    public void d(boolean z10) {
        if (z10) {
            this.f49290j = new z0(25);
            this.f49287f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.f49286e = -1L;
        this.f49288g = 0L;
    }
}
