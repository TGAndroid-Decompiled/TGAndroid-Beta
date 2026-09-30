package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f42442a;
    public final f f42443b;
    public final Runnable f42444c;
    public final long d;
    public final long e;
    public final TimeUnit f42445f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f42442a = i10;
        this.f42443b = fVar;
        this.f42444c = runnable;
        this.d = j3;
        this.e = j10;
        this.f42445f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(n2.e eVar) {
        switch (this.f42442a) {
            case 0:
                f fVar = this.f42443b;
                return fVar.f42453b.scheduleAtFixedRate(new d(fVar, this.f42444c, eVar, 0), this.d, this.e, this.f42445f);
            default:
                f fVar2 = this.f42443b;
                return fVar2.f42453b.scheduleWithFixedDelay(new d(fVar2, this.f42444c, eVar, 2), this.d, this.e, this.f42445f);
        }
    }
}
