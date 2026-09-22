package x3;

import c3.h0;
import c3.q;
import e2.v;
import org.telegram.ui.Cells.f3;
public abstract class i {
    public h0 f45564b;
    public q f45565c;
    public g d;
    public long e;
    public long f45566f;
    public long f45567g;
    public int h;
    public int f45568i;
    public long f45570k;
    public boolean f45571l;
    public boolean f45572m;
    public final e f45563a = new e();
    public f3 f45569j = new f3(22);

    public void a(long j3) {
        this.f45567g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, f3 f3Var);

    public void d(boolean z10) {
        if (z10) {
            this.f45569j = new f3(22);
            this.f45566f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.f45567g = 0L;
    }
}
