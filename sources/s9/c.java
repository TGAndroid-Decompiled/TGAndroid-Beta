package s9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements h {
    public final int f48101a;
    public final f f48102b;
    public final Runnable f48103c;
    public final long d;
    public final long e;
    public final TimeUnit f48104f;

    public c(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f48101a = i10;
        this.f48102b = fVar;
        this.f48103c = runnable;
        this.d = j10;
        this.e = j11;
        this.f48104f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(g gVar) {
        switch (this.f48101a) {
            case 0:
                f fVar = this.f48102b;
                return fVar.f48112b.scheduleAtFixedRate(new d(fVar, this.f48103c, gVar, 0), this.d, this.e, this.f48104f);
            default:
                f fVar2 = this.f48102b;
                return fVar2.f48112b.scheduleWithFixedDelay(new d(fVar2, this.f48103c, gVar, 2), this.d, this.e, this.f48104f);
        }
    }
}
