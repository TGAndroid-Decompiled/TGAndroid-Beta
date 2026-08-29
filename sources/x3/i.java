package x3;

import o3.m;
import o3.w;
import v5.n;
public abstract class i {
    public w f50079b;
    public m f50080c;
    public g d;
    public long f50081e;
    public long f50082f;
    public long f50083g;
    public int h;
    public int f50084i;
    public long f50086k;
    public boolean f50087l;
    public boolean f50088m;
    public final e f50078a = new e();
    public n f50085j = new n();

    public void a(long j10) {
        this.f50083g = j10;
    }

    public abstract long b(f5.w wVar);

    public abstract boolean c(f5.w wVar, long j10, n nVar);

    public void d(boolean z10) {
        if (z10) {
            this.f50085j = new n();
            this.f50082f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.f50081e = -1L;
        this.f50083g = 0L;
    }
}
