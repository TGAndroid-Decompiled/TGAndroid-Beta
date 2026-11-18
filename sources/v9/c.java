package v9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import v4.f0;
public final class c implements g {
    public final int f59312a;
    public final f f59313b;
    public final Runnable f59314c;
    public final long d;
    public final long f59315e;
    public final TimeUnit f59316f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i7) {
        this.f59312a = i7;
        this.f59313b = fVar;
        this.f59314c = runnable;
        this.d = j3;
        this.f59315e = j10;
        this.f59316f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(f0 f0Var) {
        switch (this.f59312a) {
            case 0:
                f fVar = this.f59313b;
                return fVar.f59324b.scheduleAtFixedRate(new d(fVar, this.f59314c, f0Var, 0), this.d, this.f59315e, this.f59316f);
            default:
                f fVar2 = this.f59313b;
                return fVar2.f59324b.scheduleWithFixedDelay(new d(fVar2, this.f59314c, f0Var, 2), this.d, this.f59315e, this.f59316f);
        }
    }
}
