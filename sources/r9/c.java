package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f41372a;
    public final f f41373b;
    public final Runnable f41374c;
    public final long d;
    public final long e;
    public final TimeUnit f41375f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f41372a = i10;
        this.f41373b = fVar;
        this.f41374c = runnable;
        this.d = j3;
        this.e = j10;
        this.f41375f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(l2.h hVar) {
        switch (this.f41372a) {
            case 0:
                f fVar = this.f41373b;
                return fVar.f41383b.scheduleAtFixedRate(new d(fVar, this.f41374c, hVar, 0), this.d, this.e, this.f41375f);
            default:
                f fVar2 = this.f41373b;
                return fVar2.f41383b.scheduleWithFixedDelay(new d(fVar2, this.f41374c, hVar, 2), this.d, this.e, this.f41375f);
        }
    }
}
