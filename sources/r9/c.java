package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f42545a;
    public final f f42546b;
    public final Runnable f42547c;
    public final long d;
    public final long e;
    public final TimeUnit f42548f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f42545a = i10;
        this.f42546b = fVar;
        this.f42547c = runnable;
        this.d = j3;
        this.e = j10;
        this.f42548f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(n2.e eVar) {
        switch (this.f42545a) {
            case 0:
                f fVar = this.f42546b;
                return fVar.f42556b.scheduleAtFixedRate(new d(fVar, this.f42547c, eVar, 0), this.d, this.e, this.f42548f);
            default:
                f fVar2 = this.f42546b;
                return fVar2.f42556b.scheduleWithFixedDelay(new d(fVar2, this.f42547c, eVar, 2), this.d, this.e, this.f42548f);
        }
    }
}
