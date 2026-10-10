package x3;

import c3.h0;
import c3.q;
import e2.v;
import n6.t;
public abstract class i {
    public h0 f50621b;
    public q f50622c;
    public g d;
    public long f50623e;
    public long f50624f;
    public long f50625g;
    public int h;
    public int f50626i;
    public long f50628k;
    public boolean f50629l;
    public boolean f50630m;
    public final e f50620a = new e();
    public t f50627j = new t(26);

    public void a(long j3) {
        this.f50625g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, t tVar);

    public void d(boolean z10) {
        if (z10) {
            this.f50627j = new t(26);
            this.f50624f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.f50623e = -1L;
        this.f50625g = 0L;
    }
}
