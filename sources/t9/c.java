package t9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import li.e3;
public final class c implements g {
    public final int f48770a;
    public final f f48771b;
    public final Runnable f48772c;
    public final long d;
    public final long e;
    public final TimeUnit f48773f;

    public c(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f48770a = i10;
        this.f48771b = fVar;
        this.f48772c = runnable;
        this.d = j10;
        this.e = j11;
        this.f48773f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(e3 e3Var) {
        switch (this.f48770a) {
            case 0:
                f fVar = this.f48771b;
                return fVar.f48781b.scheduleAtFixedRate(new d(fVar, this.f48772c, e3Var, 0), this.d, this.e, this.f48773f);
            default:
                f fVar2 = this.f48771b;
                return fVar2.f48781b.scheduleWithFixedDelay(new d(fVar2, this.f48772c, e3Var, 2), this.d, this.e, this.f48773f);
        }
    }
}
