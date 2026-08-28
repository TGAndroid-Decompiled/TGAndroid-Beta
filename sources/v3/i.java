package v3;

import d5.y;
import m3.m;
import m3.w;
import org.telegram.ui.Cells.e3;
public abstract class i {
    public w f48341b;
    public m f48342c;
    public g d;
    public long f48343e;
    public long f48344f;
    public long f48345g;
    public int h;
    public int f48346i;
    public long f48348k;
    public boolean f48349l;
    public boolean f48350m;
    public final e f48340a = new e();
    public e3 f48347j = new e3(26);

    public void a(long j10) {
        this.f48345g = j10;
    }

    public abstract long b(y yVar);

    public abstract boolean c(y yVar, long j10, e3 e3Var);

    public void d(boolean z10) {
        if (z10) {
            this.f48347j = new e3(26);
            this.f48344f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.f48343e = -1L;
        this.f48345g = 0L;
    }
}
