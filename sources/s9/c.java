package s9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f46151a;
    public final f f46152b;
    public final Runnable f46153c;
    public final long d;
    public final long e;
    public final TimeUnit f46154f;

    public c(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f46151a = i10;
        this.f46152b = fVar;
        this.f46153c = runnable;
        this.d = j10;
        this.e = j11;
        this.f46154f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(k0.b bVar) {
        switch (this.f46151a) {
            case 0:
                f fVar = this.f46152b;
                return fVar.f46162b.scheduleAtFixedRate(new d(fVar, this.f46153c, bVar, 0), this.d, this.e, this.f46154f);
            default:
                f fVar2 = this.f46152b;
                return fVar2.f46162b.scheduleWithFixedDelay(new d(fVar2, this.f46153c, bVar, 2), this.d, this.e, this.f46154f);
        }
    }
}
