package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import m.f3;
public final class c implements g {
    public final int f47149a;
    public final f f47150b;
    public final Runnable f47151c;
    public final long d;
    public final long f47152e;
    public final TimeUnit f47153f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f47149a = i10;
        this.f47150b = fVar;
        this.f47151c = runnable;
        this.d = j3;
        this.f47152e = j10;
        this.f47153f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(f3 f3Var) {
        switch (this.f47149a) {
            case 0:
                f fVar = this.f47150b;
                return fVar.f47161b.scheduleAtFixedRate(new d(fVar, this.f47151c, f3Var, 0), this.d, this.f47152e, this.f47153f);
            default:
                f fVar2 = this.f47150b;
                return fVar2.f47161b.scheduleWithFixedDelay(new d(fVar2, this.f47151c, f3Var, 2), this.d, this.f47152e, this.f47153f);
        }
    }
}
