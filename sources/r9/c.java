package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f45946a;
    public final f f45947b;
    public final Runnable f45948c;
    public final long d;
    public final long f45949e;
    public final TimeUnit f45950f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f45946a = i10;
        this.f45947b = fVar;
        this.f45948c = runnable;
        this.d = j3;
        this.f45949e = j10;
        this.f45950f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(k2.e eVar) {
        switch (this.f45946a) {
            case 0:
                f fVar = this.f45947b;
                return fVar.f45958b.scheduleAtFixedRate(new d(fVar, this.f45948c, eVar, 0), this.d, this.f45949e, this.f45950f);
            default:
                f fVar2 = this.f45947b;
                return fVar2.f45958b.scheduleWithFixedDelay(new d(fVar2, this.f45948c, eVar, 2), this.d, this.f45949e, this.f45950f);
        }
    }
}
