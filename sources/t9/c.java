package t9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import li.e3;
public final class c implements g {
    public final int f48735a;
    public final f f48736b;
    public final Runnable f48737c;
    public final long d;
    public final long e;
    public final TimeUnit f48738f;

    public c(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f48735a = i10;
        this.f48736b = fVar;
        this.f48737c = runnable;
        this.d = j10;
        this.e = j11;
        this.f48738f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(e3 e3Var) {
        switch (this.f48735a) {
            case 0:
                f fVar = this.f48736b;
                return fVar.f48746b.scheduleAtFixedRate(new d(fVar, this.f48737c, e3Var, 0), this.d, this.e, this.f48738f);
            default:
                f fVar2 = this.f48736b;
                return fVar2.f48746b.scheduleWithFixedDelay(new d(fVar2, this.f48737c, e3Var, 2), this.d, this.e, this.f48738f);
        }
    }
}
