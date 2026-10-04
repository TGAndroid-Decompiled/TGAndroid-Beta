package x3;

import c3.h0;
import c3.q;
import e2.v;
import n7.z0;
public abstract class i {
    public h0 f49292b;
    public q f49293c;
    public g d;
    public long f49294e;
    public long f49295f;
    public long f49296g;
    public int h;
    public int f49297i;
    public long f49299k;
    public boolean f49300l;
    public boolean f49301m;
    public final e f49291a = new e();
    public z0 f49298j = new z0(25);

    public void a(long j3) {
        this.f49296g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, z0 z0Var);

    public void d(boolean z10) {
        if (z10) {
            this.f49298j = new z0(25);
            this.f49295f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.f49294e = -1L;
        this.f49296g = 0L;
    }
}
