package x3;

import c3.h0;
import c3.q;
import e2.v;
import n6.t;
public abstract class i {
    public h0 f50575b;
    public q f50576c;
    public g d;
    public long f50577e;
    public long f50578f;
    public long f50579g;
    public int h;
    public int f50580i;
    public long f50582k;
    public boolean f50583l;
    public boolean f50584m;
    public final e f50574a = new e();
    public t f50581j = new t(26);

    public void a(long j3) {
        this.f50579g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, t tVar);

    public void d(boolean z10) {
        if (z10) {
            this.f50581j = new t(26);
            this.f50578f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.f50577e = -1L;
        this.f50579g = 0L;
    }
}
