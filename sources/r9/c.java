package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import n4.l;
public final class c implements g {
    public final int f47319a;
    public final f f47320b;
    public final Runnable f47321c;
    public final long d;
    public final long f47322e;
    public final TimeUnit f47323f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f47319a = i10;
        this.f47320b = fVar;
        this.f47321c = runnable;
        this.d = j3;
        this.f47322e = j10;
        this.f47323f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(l lVar) {
        switch (this.f47319a) {
            case 0:
                f fVar = this.f47320b;
                return fVar.f47331b.scheduleAtFixedRate(new d(fVar, this.f47321c, lVar, 0), this.d, this.f47322e, this.f47323f);
            default:
                f fVar2 = this.f47320b;
                return fVar2.f47331b.scheduleWithFixedDelay(new d(fVar2, this.f47321c, lVar, 2), this.d, this.f47322e, this.f47323f);
        }
    }
}
