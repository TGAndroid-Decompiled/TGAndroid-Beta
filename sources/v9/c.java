package v9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Components.rt;
public final class c implements g {
    public final int f57261a;
    public final f f57262b;
    public final Runnable f57263c;
    public final long d;
    public final long f57264e;
    public final TimeUnit f57265f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i7) {
        this.f57261a = i7;
        this.f57262b = fVar;
        this.f57263c = runnable;
        this.d = j3;
        this.f57264e = j10;
        this.f57265f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(rt rtVar) {
        switch (this.f57261a) {
            case 0:
                f fVar = this.f57262b;
                return fVar.f57273b.scheduleAtFixedRate(new d(fVar, this.f57263c, rtVar, 0), this.d, this.f57264e, this.f57265f);
            default:
                f fVar2 = this.f57262b;
                return fVar2.f57273b.scheduleWithFixedDelay(new d(fVar2, this.f57263c, rtVar, 2), this.d, this.f57264e, this.f57265f);
        }
    }
}
