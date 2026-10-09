package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import m.f3;
public final class c implements g {
    public final int f47105a;
    public final f f47106b;
    public final Runnable f47107c;
    public final long d;
    public final long f47108e;
    public final TimeUnit f47109f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f47105a = i10;
        this.f47106b = fVar;
        this.f47107c = runnable;
        this.d = j3;
        this.f47108e = j10;
        this.f47109f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(f3 f3Var) {
        switch (this.f47105a) {
            case 0:
                f fVar = this.f47106b;
                return fVar.f47117b.scheduleAtFixedRate(new d(fVar, this.f47107c, f3Var, 0), this.d, this.f47108e, this.f47109f);
            default:
                f fVar2 = this.f47106b;
                return fVar2.f47117b.scheduleWithFixedDelay(new d(fVar2, this.f47107c, f3Var, 2), this.d, this.f47108e, this.f47109f);
        }
    }
}
