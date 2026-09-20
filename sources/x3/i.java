package x3;

import c3.h0;
import c3.q;
import e2.v;
import org.telegram.ui.Cells.f3;
public abstract class i {
    public h0 f45543b;
    public q f45544c;
    public g d;
    public long e;
    public long f45545f;
    public long f45546g;
    public int h;
    public int f45547i;
    public long f45549k;
    public boolean f45550l;
    public boolean f45551m;
    public final e f45542a = new e();
    public f3 f45548j = new f3(22);

    public void a(long j3) {
        this.f45546g = j3;
    }

    public abstract long b(v vVar);

    public abstract boolean c(v vVar, long j3, f3 f3Var);

    public void d(boolean z10) {
        if (z10) {
            this.f45548j = new f3(22);
            this.f45545f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.f45546g = 0L;
    }
}
