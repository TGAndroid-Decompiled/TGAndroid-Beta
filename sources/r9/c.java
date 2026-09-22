package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k2.u;
public final class c implements g {
    public final int f42151a;
    public final f f42152b;
    public final Runnable f42153c;
    public final long d;
    public final long e;
    public final TimeUnit f42154f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f42151a = i10;
        this.f42152b = fVar;
        this.f42153c = runnable;
        this.d = j3;
        this.e = j10;
        this.f42154f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(u uVar) {
        switch (this.f42151a) {
            case 0:
                f fVar = this.f42152b;
                return fVar.f42162b.scheduleAtFixedRate(new d(fVar, this.f42153c, uVar, 0), this.d, this.e, this.f42154f);
            default:
                f fVar2 = this.f42152b;
                return fVar2.f42162b.scheduleWithFixedDelay(new d(fVar2, this.f42153c, uVar, 2), this.d, this.e, this.f42154f);
        }
    }
}
