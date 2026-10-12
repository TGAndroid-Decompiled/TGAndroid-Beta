package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import n4.l;
public final class c implements g {
    public final int f47327a;
    public final f f47328b;
    public final Runnable f47329c;
    public final long d;
    public final long f47330e;
    public final TimeUnit f47331f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f47327a = i10;
        this.f47328b = fVar;
        this.f47329c = runnable;
        this.d = j3;
        this.f47330e = j10;
        this.f47331f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(l lVar) {
        switch (this.f47327a) {
            case 0:
                f fVar = this.f47328b;
                return fVar.f47339b.scheduleAtFixedRate(new d(fVar, this.f47329c, lVar, 0), this.d, this.f47330e, this.f47331f);
            default:
                f fVar2 = this.f47328b;
                return fVar2.f47339b.scheduleWithFixedDelay(new d(fVar2, this.f47329c, lVar, 2), this.d, this.f47330e, this.f47331f);
        }
    }
}
