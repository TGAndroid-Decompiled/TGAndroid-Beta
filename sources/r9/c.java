package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f45066a;
    public final f f45067b;
    public final Runnable f45068c;
    public final long d;
    public final long f45069e;
    public final TimeUnit f45070f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f45066a = i10;
        this.f45067b = fVar;
        this.f45068c = runnable;
        this.d = j3;
        this.f45069e = j10;
        this.f45070f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(l.d dVar) {
        switch (this.f45066a) {
            case 0:
                f fVar = this.f45067b;
                return fVar.f45078b.scheduleAtFixedRate(new d(fVar, this.f45068c, dVar, 0), this.d, this.f45069e, this.f45070f);
            default:
                f fVar2 = this.f45067b;
                return fVar2.f45078b.scheduleWithFixedDelay(new d(fVar2, this.f45068c, dVar, 2), this.d, this.f45069e, this.f45070f);
        }
    }
}
