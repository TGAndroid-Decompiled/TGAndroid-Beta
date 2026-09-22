package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f42475a;
    public final f f42476b;
    public final Runnable f42477c;
    public final long d;
    public final long e;
    public final TimeUnit f42478f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f42475a = i10;
        this.f42476b = fVar;
        this.f42477c = runnable;
        this.d = j3;
        this.e = j10;
        this.f42478f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(l.d dVar) {
        switch (this.f42475a) {
            case 0:
                f fVar = this.f42476b;
                return fVar.f42486b.scheduleAtFixedRate(new d(fVar, this.f42477c, dVar, 0), this.d, this.e, this.f42478f);
            default:
                f fVar2 = this.f42476b;
                return fVar2.f42486b.scheduleWithFixedDelay(new d(fVar2, this.f42477c, dVar, 2), this.d, this.e, this.f42478f);
        }
    }
}
