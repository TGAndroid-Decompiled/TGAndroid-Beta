package v9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Components.rt;
public final class c implements g {
    public final int f57273a;
    public final f f57274b;
    public final Runnable f57275c;
    public final long d;
    public final long f57276e;
    public final TimeUnit f57277f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i7) {
        this.f57273a = i7;
        this.f57274b = fVar;
        this.f57275c = runnable;
        this.d = j3;
        this.f57276e = j10;
        this.f57277f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(rt rtVar) {
        switch (this.f57273a) {
            case 0:
                f fVar = this.f57274b;
                return fVar.f57285b.scheduleAtFixedRate(new d(fVar, this.f57275c, rtVar, 0), this.d, this.f57276e, this.f57277f);
            default:
                f fVar2 = this.f57274b;
                return fVar2.f57285b.scheduleWithFixedDelay(new d(fVar2, this.f57275c, rtVar, 2), this.d, this.f57276e, this.f57277f);
        }
    }
}
