package x3;

import c3.h0;
import c3.q;
import e2.v;
import n7.z0;
public abstract class i {
    public h0 f49283b;
    public q f49284c;
    public g d;
    public long f49285e;
    public long f49286f;
    public long f49287g;
    public int h;
    public int f49288i;
    public long f49290k;
    public boolean f49291l;
    public boolean f49292m;
    public final e f49282a = new e();
    public z0 f49289j = new z0(25);

    public void a(long j3) {
        this.f49287g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, z0 z0Var);

    public void d(boolean z10) {
        if (z10) {
            this.f49289j = new z0(25);
            this.f49286f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.f49285e = -1L;
        this.f49287g = 0L;
    }
}
