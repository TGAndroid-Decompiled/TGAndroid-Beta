package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f42485a;
    public final f f42486b;
    public final Runnable f42487c;
    public final long d;
    public final long e;
    public final TimeUnit f42488f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f42485a = i10;
        this.f42486b = fVar;
        this.f42487c = runnable;
        this.d = j3;
        this.e = j10;
        this.f42488f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(o0.c cVar) {
        switch (this.f42485a) {
            case 0:
                f fVar = this.f42486b;
                return fVar.f42496b.scheduleAtFixedRate(new d(fVar, this.f42487c, cVar, 0), this.d, this.e, this.f42488f);
            default:
                f fVar2 = this.f42486b;
                return fVar2.f42496b.scheduleWithFixedDelay(new d(fVar2, this.f42487c, cVar, 2), this.d, this.e, this.f42488f);
        }
    }
}
