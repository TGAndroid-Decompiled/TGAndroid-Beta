package x3;

import c3.h0;
import c3.q;
import e2.v;
import n7.z0;
public abstract class i {
    public h0 f49299b;
    public q f49300c;
    public g d;
    public long f49301e;
    public long f49302f;
    public long f49303g;
    public int h;
    public int f49304i;
    public long f49306k;
    public boolean f49307l;
    public boolean f49308m;
    public final e f49298a = new e();
    public z0 f49305j = new z0(25);

    public void a(long j3) {
        this.f49303g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, z0 z0Var);

    public void d(boolean z10) {
        if (z10) {
            this.f49305j = new z0(25);
            this.f49302f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.f49301e = -1L;
        this.f49303g = 0L;
    }
}
