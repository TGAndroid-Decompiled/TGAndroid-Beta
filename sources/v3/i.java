package v3;

import d5.z;
import m3.m;
import m3.w;
import org.telegram.ui.i6;

public abstract class i {

    public w f48768b;

    public m f48769c;
    public g d;

    public long f48770e;

    public long f48771f;

    public long f48772g;
    public int h;

    public int f48773i;

    public long f48775k;

    public boolean f48776l;

    public boolean f48777m;

    public final e f48767a = new e();

    public i6 f48774j = new i6(27);

    public void a(long j10) {
        this.f48772g = j10;
    }

    public abstract long b(z zVar);

    public abstract boolean c(z zVar, long j10, i6 i6Var);

    public void d(boolean z10) {
        if (z10) {
            this.f48774j = new i6(27);
            this.f48771f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.f48770e = -1L;
        this.f48772g = 0L;
    }
}
