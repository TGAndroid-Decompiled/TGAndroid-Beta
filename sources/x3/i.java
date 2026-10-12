package x3;

import c3.h0;
import c3.q;
import e2.v;
import n6.k;
public abstract class i {
    public h0 f50806b;
    public q f50807c;
    public g d;
    public long f50808e;
    public long f50809f;
    public long f50810g;
    public int h;
    public int f50811i;
    public long f50813k;
    public boolean f50814l;
    public boolean f50815m;
    public final e f50805a = new e();
    public k f50812j = new k(27);

    public void a(long j3) {
        this.f50810g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, k kVar);

    public void d(boolean z10) {
        if (z10) {
            this.f50812j = new k(27);
            this.f50809f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.f50808e = -1L;
        this.f50810g = 0L;
    }
}
