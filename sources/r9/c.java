package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k2.u;
public final class c implements g {
    public final int f42155a;
    public final f f42156b;
    public final Runnable f42157c;
    public final long d;
    public final long e;
    public final TimeUnit f42158f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f42155a = i10;
        this.f42156b = fVar;
        this.f42157c = runnable;
        this.d = j3;
        this.e = j10;
        this.f42158f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(u uVar) {
        switch (this.f42155a) {
            case 0:
                f fVar = this.f42156b;
                return fVar.f42166b.scheduleAtFixedRate(new d(fVar, this.f42157c, uVar, 0), this.d, this.e, this.f42158f);
            default:
                f fVar2 = this.f42156b;
                return fVar2.f42166b.scheduleWithFixedDelay(new d(fVar2, this.f42157c, uVar, 2), this.d, this.e, this.f42158f);
        }
    }
}
