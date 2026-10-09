package x3;

import c3.h0;
import c3.q;
import e2.v;
import n6.t;
public abstract class i {
    public h0 f50577b;
    public q f50578c;
    public g d;
    public long f50579e;
    public long f50580f;
    public long f50581g;
    public int h;
    public int f50582i;
    public long f50584k;
    public boolean f50585l;
    public boolean f50586m;
    public final e f50576a = new e();
    public t f50583j = new t(26);

    public void a(long j3) {
        this.f50581g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, t tVar);

    public void d(boolean z10) {
        if (z10) {
            this.f50583j = new t(26);
            this.f50580f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.f50579e = -1L;
        this.f50581g = 0L;
    }
}
