package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import m.f3;
public final class c implements g {
    public final int f47195a;
    public final f f47196b;
    public final Runnable f47197c;
    public final long d;
    public final long f47198e;
    public final TimeUnit f47199f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f47195a = i10;
        this.f47196b = fVar;
        this.f47197c = runnable;
        this.d = j3;
        this.f47198e = j10;
        this.f47199f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(f3 f3Var) {
        switch (this.f47195a) {
            case 0:
                f fVar = this.f47196b;
                return fVar.f47207b.scheduleAtFixedRate(new d(fVar, this.f47197c, f3Var, 0), this.d, this.f47198e, this.f47199f);
            default:
                f fVar2 = this.f47196b;
                return fVar2.f47207b.scheduleWithFixedDelay(new d(fVar2, this.f47197c, f3Var, 2), this.d, this.f47198e, this.f47199f);
        }
    }
}
