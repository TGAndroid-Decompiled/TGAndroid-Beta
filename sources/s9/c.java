package s9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f46133a;
    public final f f46134b;
    public final Runnable f46135c;
    public final long d;
    public final long e;
    public final TimeUnit f46136f;

    public c(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f46133a = i10;
        this.f46134b = fVar;
        this.f46135c = runnable;
        this.d = j10;
        this.e = j11;
        this.f46136f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(le.b bVar) {
        switch (this.f46133a) {
            case 0:
                f fVar = this.f46134b;
                return fVar.f46144b.scheduleAtFixedRate(new d(fVar, this.f46135c, bVar, 0), this.d, this.e, this.f46136f);
            default:
                f fVar2 = this.f46134b;
                return fVar2.f46144b.scheduleWithFixedDelay(new d(fVar2, this.f46135c, bVar, 2), this.d, this.e, this.f46136f);
        }
    }
}
