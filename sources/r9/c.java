package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import m.f3;
public final class c implements g {
    public final int f47103a;
    public final f f47104b;
    public final Runnable f47105c;
    public final long d;
    public final long f47106e;
    public final TimeUnit f47107f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f47103a = i10;
        this.f47104b = fVar;
        this.f47105c = runnable;
        this.d = j3;
        this.f47106e = j10;
        this.f47107f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(f3 f3Var) {
        switch (this.f47103a) {
            case 0:
                f fVar = this.f47104b;
                return fVar.f47115b.scheduleAtFixedRate(new d(fVar, this.f47105c, f3Var, 0), this.d, this.f47106e, this.f47107f);
            default:
                f fVar2 = this.f47104b;
                return fVar2.f47115b.scheduleWithFixedDelay(new d(fVar2, this.f47105c, f3Var, 2), this.d, this.f47106e, this.f47107f);
        }
    }
}
