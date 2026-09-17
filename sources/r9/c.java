package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k2.u;
public final class c implements g {
    public final int f42177a;
    public final f f42178b;
    public final Runnable f42179c;
    public final long d;
    public final long e;
    public final TimeUnit f42180f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f42177a = i10;
        this.f42178b = fVar;
        this.f42179c = runnable;
        this.d = j3;
        this.e = j10;
        this.f42180f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(u uVar) {
        switch (this.f42177a) {
            case 0:
                f fVar = this.f42178b;
                return fVar.f42188b.scheduleAtFixedRate(new d(fVar, this.f42179c, uVar, 0), this.d, this.e, this.f42180f);
            default:
                f fVar2 = this.f42178b;
                return fVar2.f42188b.scheduleWithFixedDelay(new d(fVar2, this.f42179c, uVar, 2), this.d, this.e, this.f42180f);
        }
    }
}
