package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f45938a;
    public final f f45939b;
    public final Runnable f45940c;
    public final long d;
    public final long f45941e;
    public final TimeUnit f45942f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f45938a = i10;
        this.f45939b = fVar;
        this.f45940c = runnable;
        this.d = j3;
        this.f45941e = j10;
        this.f45942f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(k2.e eVar) {
        switch (this.f45938a) {
            case 0:
                f fVar = this.f45939b;
                return fVar.f45950b.scheduleAtFixedRate(new d(fVar, this.f45940c, eVar, 0), this.d, this.f45941e, this.f45942f);
            default:
                f fVar2 = this.f45939b;
                return fVar2.f45950b.scheduleWithFixedDelay(new d(fVar2, this.f45940c, eVar, 2), this.d, this.f45941e, this.f45942f);
        }
    }
}
