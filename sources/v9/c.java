package v9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import v4.f0;
public final class c implements g {
    public final int f59354a;
    public final f f59355b;
    public final Runnable f59356c;
    public final long d;
    public final long f59357e;
    public final TimeUnit f59358f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i7) {
        this.f59354a = i7;
        this.f59355b = fVar;
        this.f59356c = runnable;
        this.d = j3;
        this.f59357e = j10;
        this.f59358f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(f0 f0Var) {
        switch (this.f59354a) {
            case 0:
                f fVar = this.f59355b;
                return fVar.f59366b.scheduleAtFixedRate(new d(fVar, this.f59356c, f0Var, 0), this.d, this.f59357e, this.f59358f);
            default:
                f fVar2 = this.f59355b;
                return fVar2.f59366b.scheduleWithFixedDelay(new d(fVar2, this.f59356c, f0Var, 2), this.d, this.f59357e, this.f59358f);
        }
    }
}
