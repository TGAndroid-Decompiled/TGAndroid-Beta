package s9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f46123a;
    public final f f46124b;
    public final Runnable f46125c;
    public final long d;
    public final long e;
    public final TimeUnit f46126f;

    public c(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f46123a = i10;
        this.f46124b = fVar;
        this.f46125c = runnable;
        this.d = j10;
        this.e = j11;
        this.f46126f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(le.b bVar) {
        switch (this.f46123a) {
            case 0:
                f fVar = this.f46124b;
                return fVar.f46134b.scheduleAtFixedRate(new d(fVar, this.f46125c, bVar, 0), this.d, this.e, this.f46126f);
            default:
                f fVar2 = this.f46124b;
                return fVar2.f46134b.scheduleWithFixedDelay(new d(fVar2, this.f46125c, bVar, 2), this.d, this.e, this.f46126f);
        }
    }
}
