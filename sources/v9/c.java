package v9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Components.qt;
public final class c implements g {
    public final int f57144a;
    public final f f57145b;
    public final Runnable f57146c;
    public final long d;
    public final long f57147e;
    public final TimeUnit f57148f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i7) {
        this.f57144a = i7;
        this.f57145b = fVar;
        this.f57146c = runnable;
        this.d = j3;
        this.f57147e = j10;
        this.f57148f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(qt qtVar) {
        switch (this.f57144a) {
            case 0:
                f fVar = this.f57145b;
                return fVar.f57156b.scheduleAtFixedRate(new d(fVar, this.f57146c, qtVar, 0), this.d, this.f57147e, this.f57148f);
            default:
                f fVar2 = this.f57145b;
                return fVar2.f57156b.scheduleWithFixedDelay(new d(fVar2, this.f57146c, qtVar, 2), this.d, this.f57147e, this.f57148f);
        }
    }
}
