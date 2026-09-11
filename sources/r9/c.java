package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f45038a;
    public final f f45039b;
    public final Runnable f45040c;
    public final long d;
    public final long f45041e;
    public final TimeUnit f45042f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f45038a = i10;
        this.f45039b = fVar;
        this.f45040c = runnable;
        this.d = j3;
        this.f45041e = j10;
        this.f45042f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(l.d dVar) {
        switch (this.f45038a) {
            case 0:
                f fVar = this.f45039b;
                return fVar.f45050b.scheduleAtFixedRate(new d(fVar, this.f45040c, dVar, 0), this.d, this.f45041e, this.f45042f);
            default:
                f fVar2 = this.f45039b;
                return fVar2.f45050b.scheduleWithFixedDelay(new d(fVar2, this.f45040c, dVar, 2), this.d, this.f45041e, this.f45042f);
        }
    }
}
