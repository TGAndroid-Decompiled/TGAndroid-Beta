package x3;

import c3.h0;
import c3.q;
import e2.v;
import n7.a1;
public abstract class i {
    public h0 f44587b;
    public q f44588c;
    public g d;
    public long e;
    public long f44589f;
    public long f44590g;
    public int h;
    public int f44591i;
    public long f44593k;
    public boolean f44594l;
    public boolean f44595m;
    public final e f44586a = new e();
    public a1 f44592j = new a1(25, (byte) 0);

    public void a(long j3) {
        this.f44590g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, a1 a1Var);

    public void d(boolean z10) {
        if (z10) {
            this.f44592j = new a1(25, (byte) 0);
            this.f44589f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.f44590g = 0L;
    }
}
