package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f45939a;
    public final f f45940b;
    public final Runnable f45941c;
    public final long d;
    public final long f45942e;
    public final TimeUnit f45943f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f45939a = i10;
        this.f45940b = fVar;
        this.f45941c = runnable;
        this.d = j3;
        this.f45942e = j10;
        this.f45943f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(k2.e eVar) {
        switch (this.f45939a) {
            case 0:
                f fVar = this.f45940b;
                return fVar.f45951b.scheduleAtFixedRate(new d(fVar, this.f45941c, eVar, 0), this.d, this.f45942e, this.f45943f);
            default:
                f fVar2 = this.f45940b;
                return fVar2.f45951b.scheduleWithFixedDelay(new d(fVar2, this.f45941c, eVar, 2), this.d, this.f45942e, this.f45943f);
        }
    }
}
