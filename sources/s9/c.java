package s9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f46130a;
    public final f f46131b;
    public final Runnable f46132c;
    public final long d;
    public final long e;
    public final TimeUnit f46133f;

    public c(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f46130a = i10;
        this.f46131b = fVar;
        this.f46132c = runnable;
        this.d = j10;
        this.e = j11;
        this.f46133f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(le.b bVar) {
        switch (this.f46130a) {
            case 0:
                f fVar = this.f46131b;
                return fVar.f46141b.scheduleAtFixedRate(new d(fVar, this.f46132c, bVar, 0), this.d, this.e, this.f46133f);
            default:
                f fVar2 = this.f46131b;
                return fVar2.f46141b.scheduleWithFixedDelay(new d(fVar2, this.f46132c, bVar, 2), this.d, this.e, this.f46133f);
        }
    }
}
