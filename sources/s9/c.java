package s9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f46556a;
    public final f f46557b;
    public final Runnable f46558c;
    public final long d;
    public final long e;
    public final TimeUnit f46559f;

    public c(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f46556a = i10;
        this.f46557b = fVar;
        this.f46558c = runnable;
        this.d = j10;
        this.e = j11;
        this.f46559f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(le.b bVar) {
        switch (this.f46556a) {
            case 0:
                f fVar = this.f46557b;
                return fVar.f46567b.scheduleAtFixedRate(new d(fVar, this.f46558c, bVar, 0), this.d, this.e, this.f46559f);
            default:
                f fVar2 = this.f46557b;
                return fVar2.f46567b.scheduleWithFixedDelay(new d(fVar2, this.f46558c, bVar, 2), this.d, this.e, this.f46559f);
        }
    }
}
