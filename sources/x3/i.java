package x3;

import c3.h0;
import c3.q;
import e2.v;
import n7.a1;
public abstract class i {
    public h0 f45270b;
    public q f45271c;
    public g d;
    public long e;
    public long f45272f;
    public long f45273g;
    public int h;
    public int f45274i;
    public long f45276k;
    public boolean f45277l;
    public boolean f45278m;
    public final e f45269a = new e();
    public a1 f45275j = new a1(25);

    public void a(long j3) {
        this.f45273g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, a1 a1Var);

    public void d(boolean z10) {
        if (z10) {
            this.f45275j = new a1(25);
            this.f45272f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.f45273g = 0L;
    }
}
