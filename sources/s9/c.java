package s9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements h {
    public final int f48112a;
    public final f f48113b;
    public final Runnable f48114c;
    public final long d;
    public final long e;
    public final TimeUnit f48115f;

    public c(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f48112a = i10;
        this.f48113b = fVar;
        this.f48114c = runnable;
        this.d = j10;
        this.e = j11;
        this.f48115f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(g gVar) {
        switch (this.f48112a) {
            case 0:
                f fVar = this.f48113b;
                return fVar.f48123b.scheduleAtFixedRate(new d(fVar, this.f48114c, gVar, 0), this.d, this.e, this.f48115f);
            default:
                f fVar2 = this.f48113b;
                return fVar2.f48123b.scheduleWithFixedDelay(new d(fVar2, this.f48114c, gVar, 2), this.d, this.e, this.f48115f);
        }
    }
}
