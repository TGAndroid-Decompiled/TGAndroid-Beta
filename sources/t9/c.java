package t9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import li.e3;
public final class c implements g {
    public final int f48732a;
    public final f f48733b;
    public final Runnable f48734c;
    public final long d;
    public final long e;
    public final TimeUnit f48735f;

    public c(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f48732a = i10;
        this.f48733b = fVar;
        this.f48734c = runnable;
        this.d = j10;
        this.e = j11;
        this.f48735f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(e3 e3Var) {
        switch (this.f48732a) {
            case 0:
                f fVar = this.f48733b;
                return fVar.f48743b.scheduleAtFixedRate(new d(fVar, this.f48734c, e3Var, 0), this.d, this.e, this.f48735f);
            default:
                f fVar2 = this.f48733b;
                return fVar2.f48743b.scheduleWithFixedDelay(new d(fVar2, this.f48734c, e3Var, 2), this.d, this.e, this.f48735f);
        }
    }
}
