package v9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import v4.f0;
public final class c implements g {
    public final int f59311a;
    public final f f59312b;
    public final Runnable f59313c;
    public final long d;
    public final long f59314e;
    public final TimeUnit f59315f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i7) {
        this.f59311a = i7;
        this.f59312b = fVar;
        this.f59313c = runnable;
        this.d = j3;
        this.f59314e = j10;
        this.f59315f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(f0 f0Var) {
        switch (this.f59311a) {
            case 0:
                f fVar = this.f59312b;
                return fVar.f59323b.scheduleAtFixedRate(new d(fVar, this.f59313c, f0Var, 0), this.d, this.f59314e, this.f59315f);
            default:
                f fVar2 = this.f59312b;
                return fVar2.f59323b.scheduleWithFixedDelay(new d(fVar2, this.f59313c, f0Var, 2), this.d, this.f59314e, this.f59315f);
        }
    }
}
