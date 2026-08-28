package z8;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import n5.a0;
public final class c implements g {
    public final int f50365a;
    public final f f50366b;
    public final Runnable f50367c;
    public final long d;
    public final long f50368e;
    public final TimeUnit f50369f;

    public c(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i9) {
        this.f50365a = i9;
        this.f50366b = fVar;
        this.f50367c = runnable;
        this.d = j10;
        this.f50368e = j11;
        this.f50369f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(a0 a0Var) {
        switch (this.f50365a) {
            case 0:
                f fVar = this.f50366b;
                return fVar.f50377b.scheduleAtFixedRate(new d(fVar, this.f50367c, a0Var, 0), this.d, this.f50368e, this.f50369f);
            default:
                f fVar2 = this.f50366b;
                return fVar2.f50377b.scheduleWithFixedDelay(new d(fVar2, this.f50367c, a0Var, 2), this.d, this.f50368e, this.f50369f);
        }
    }
}
