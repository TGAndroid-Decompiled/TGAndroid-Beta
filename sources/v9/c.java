package v9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Components.qt;
public final class c implements g {
    public final int f57168a;
    public final f f57169b;
    public final Runnable f57170c;
    public final long d;
    public final long f57171e;
    public final TimeUnit f57172f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i7) {
        this.f57168a = i7;
        this.f57169b = fVar;
        this.f57170c = runnable;
        this.d = j3;
        this.f57171e = j10;
        this.f57172f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(qt qtVar) {
        switch (this.f57168a) {
            case 0:
                f fVar = this.f57169b;
                return fVar.f57180b.scheduleAtFixedRate(new d(fVar, this.f57170c, qtVar, 0), this.d, this.f57171e, this.f57172f);
            default:
                f fVar2 = this.f57169b;
                return fVar2.f57180b.scheduleWithFixedDelay(new d(fVar2, this.f57170c, qtVar, 2), this.d, this.f57171e, this.f57172f);
        }
    }
}
