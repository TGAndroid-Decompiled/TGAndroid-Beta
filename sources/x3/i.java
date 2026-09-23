package x3;

import c3.h0;
import c3.q;
import e2.v;
import n7.a1;
public abstract class i {
    public h0 f45197b;
    public q f45198c;
    public g d;
    public long e;
    public long f45199f;
    public long f45200g;
    public int h;
    public int f45201i;
    public long f45203k;
    public boolean f45204l;
    public boolean f45205m;
    public final e f45196a = new e();
    public a1 f45202j = new a1(25);

    public void a(long j3) {
        this.f45200g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, a1 a1Var);

    public void d(boolean z10) {
        if (z10) {
            this.f45202j = new a1(25);
            this.f45199f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.f45200g = 0L;
    }
}
