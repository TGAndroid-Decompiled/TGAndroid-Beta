package x3;

import c3.h0;
import c3.q;
import e2.v;
import n7.z0;
public abstract class i {
    public h0 f45498b;
    public q f45499c;
    public g d;
    public long e;
    public long f45500f;
    public long f45501g;
    public int h;
    public int f45502i;
    public long f45504k;
    public boolean f45505l;
    public boolean f45506m;
    public final e f45497a = new e();
    public z0 f45503j = new z0(25);

    public void a(long j3) {
        this.f45501g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, z0 z0Var);

    public void d(boolean z10) {
        if (z10) {
            this.f45503j = new z0(25);
            this.f45500f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.f45501g = 0L;
    }
}
