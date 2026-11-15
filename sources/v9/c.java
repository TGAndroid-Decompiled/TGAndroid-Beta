package v9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Components.cf;
public final class c implements g {
    public final int f58742a;
    public final f f58743b;
    public final Runnable f58744c;
    public final long d;
    public final long f58745e;
    public final TimeUnit f58746f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i7) {
        this.f58742a = i7;
        this.f58743b = fVar;
        this.f58744c = runnable;
        this.d = j3;
        this.f58745e = j10;
        this.f58746f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(cf cfVar) {
        switch (this.f58742a) {
            case 0:
                f fVar = this.f58743b;
                return fVar.f58754b.scheduleAtFixedRate(new d(fVar, this.f58744c, cfVar, 0), this.d, this.f58745e, this.f58746f);
            default:
                f fVar2 = this.f58743b;
                return fVar2.f58754b.scheduleWithFixedDelay(new d(fVar2, this.f58744c, cfVar, 2), this.d, this.f58745e, this.f58746f);
        }
    }
}
