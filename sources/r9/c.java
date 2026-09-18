package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k2.u;
public final class c implements g {
    public final int f42182a;
    public final f f42183b;
    public final Runnable f42184c;
    public final long d;
    public final long e;
    public final TimeUnit f42185f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f42182a = i10;
        this.f42183b = fVar;
        this.f42184c = runnable;
        this.d = j3;
        this.e = j10;
        this.f42185f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(u uVar) {
        switch (this.f42182a) {
            case 0:
                f fVar = this.f42183b;
                return fVar.f42193b.scheduleAtFixedRate(new d(fVar, this.f42184c, uVar, 0), this.d, this.e, this.f42185f);
            default:
                f fVar2 = this.f42183b;
                return fVar2.f42193b.scheduleWithFixedDelay(new d(fVar2, this.f42184c, uVar, 2), this.d, this.e, this.f42185f);
        }
    }
}
