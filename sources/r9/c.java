package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f42440a;
    public final f f42441b;
    public final Runnable f42442c;
    public final long d;
    public final long e;
    public final TimeUnit f42443f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f42440a = i10;
        this.f42441b = fVar;
        this.f42442c = runnable;
        this.d = j3;
        this.e = j10;
        this.f42443f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(n2.e eVar) {
        switch (this.f42440a) {
            case 0:
                f fVar = this.f42441b;
                return fVar.f42451b.scheduleAtFixedRate(new d(fVar, this.f42442c, eVar, 0), this.d, this.e, this.f42443f);
            default:
                f fVar2 = this.f42441b;
                return fVar2.f42451b.scheduleWithFixedDelay(new d(fVar2, this.f42442c, eVar, 2), this.d, this.e, this.f42443f);
        }
    }
}
