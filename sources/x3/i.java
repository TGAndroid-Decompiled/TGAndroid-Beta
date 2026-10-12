package x3;

import c3.i0;
import c3.q;
import e2.x;
import n6.o;
public abstract class i {
    public i0 f47821b;
    public q f47822c;
    public g d;
    public long e;
    public long f47823f;
    public long f47824g;
    public int h;
    public int f47825i;
    public long f47827k;
    public boolean f47828l;
    public boolean f47829m;
    public final e f47820a = new e();
    public o f47826j = new o(22, false);

    public void a(long j10) {
        this.f47824g = j10;
    }

    public abstract long b(x xVar);

    public abstract boolean c(x xVar, long j10, o oVar);

    public void d(boolean z10) {
        if (z10) {
            this.f47826j = new o(22, false);
            this.f47823f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.f47824g = 0L;
    }
}
