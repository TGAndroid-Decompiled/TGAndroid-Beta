package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f42439a;
    public final f f42440b;
    public final Runnable f42441c;
    public final long d;
    public final long e;
    public final TimeUnit f42442f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f42439a = i10;
        this.f42440b = fVar;
        this.f42441c = runnable;
        this.d = j3;
        this.e = j10;
        this.f42442f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(n2.e eVar) {
        switch (this.f42439a) {
            case 0:
                f fVar = this.f42440b;
                return fVar.f42450b.scheduleAtFixedRate(new d(fVar, this.f42441c, eVar, 0), this.d, this.e, this.f42442f);
            default:
                f fVar2 = this.f42440b;
                return fVar2.f42450b.scheduleWithFixedDelay(new d(fVar2, this.f42441c, eVar, 2), this.d, this.e, this.f42442f);
        }
    }
}
