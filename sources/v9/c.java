package v9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import v4.f0;
public final class c implements g {
    public final int f59350a;
    public final f f59351b;
    public final Runnable f59352c;
    public final long d;
    public final long f59353e;
    public final TimeUnit f59354f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i7) {
        this.f59350a = i7;
        this.f59351b = fVar;
        this.f59352c = runnable;
        this.d = j3;
        this.f59353e = j10;
        this.f59354f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(f0 f0Var) {
        switch (this.f59350a) {
            case 0:
                f fVar = this.f59351b;
                return fVar.f59362b.scheduleAtFixedRate(new d(fVar, this.f59352c, f0Var, 0), this.d, this.f59353e, this.f59354f);
            default:
                f fVar2 = this.f59351b;
                return fVar2.f59362b.scheduleWithFixedDelay(new d(fVar2, this.f59352c, f0Var, 2), this.d, this.f59353e, this.f59354f);
        }
    }
}
