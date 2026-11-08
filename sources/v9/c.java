package v9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Components.rt;
public final class c implements g {
    public final int f57260a;
    public final f f57261b;
    public final Runnable f57262c;
    public final long d;
    public final long f57263e;
    public final TimeUnit f57264f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i7) {
        this.f57260a = i7;
        this.f57261b = fVar;
        this.f57262c = runnable;
        this.d = j3;
        this.f57263e = j10;
        this.f57264f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(rt rtVar) {
        switch (this.f57260a) {
            case 0:
                f fVar = this.f57261b;
                return fVar.f57272b.scheduleAtFixedRate(new d(fVar, this.f57262c, rtVar, 0), this.d, this.f57263e, this.f57264f);
            default:
                f fVar2 = this.f57261b;
                return fVar2.f57272b.scheduleWithFixedDelay(new d(fVar2, this.f57262c, rtVar, 2), this.d, this.f57263e, this.f57264f);
        }
    }
}
