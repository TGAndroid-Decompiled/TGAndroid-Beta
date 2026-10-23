package s9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f46134a;
    public final f f46135b;
    public final Runnable f46136c;
    public final long d;
    public final long e;
    public final TimeUnit f46137f;

    public c(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f46134a = i10;
        this.f46135b = fVar;
        this.f46136c = runnable;
        this.d = j10;
        this.e = j11;
        this.f46137f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(le.b bVar) {
        switch (this.f46134a) {
            case 0:
                f fVar = this.f46135b;
                return fVar.f46145b.scheduleAtFixedRate(new d(fVar, this.f46136c, bVar, 0), this.d, this.e, this.f46137f);
            default:
                f fVar2 = this.f46135b;
                return fVar2.f46145b.scheduleWithFixedDelay(new d(fVar2, this.f46136c, bVar, 2), this.d, this.e, this.f46137f);
        }
    }
}
