package x3;

import c3.h0;
import c3.q;
import e2.v;
import n6.k;
public abstract class i {
    public h0 f50699b;
    public q f50700c;
    public g d;
    public long f50701e;
    public long f50702f;
    public long f50703g;
    public int h;
    public int f50704i;
    public long f50706k;
    public boolean f50707l;
    public boolean f50708m;
    public final e f50698a = new e();
    public k f50705j = new k(27);

    public void a(long j3) {
        this.f50703g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, k kVar);

    public void d(boolean z10) {
        if (z10) {
            this.f50705j = new k(27);
            this.f50702f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.f50701e = -1L;
        this.f50703g = 0L;
    }
}
