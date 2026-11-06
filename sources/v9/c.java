package v9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Components.qt;
public final class c implements g {
    public final int f57169a;
    public final f f57170b;
    public final Runnable f57171c;
    public final long d;
    public final long f57172e;
    public final TimeUnit f57173f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i7) {
        this.f57169a = i7;
        this.f57170b = fVar;
        this.f57171c = runnable;
        this.d = j3;
        this.f57172e = j10;
        this.f57173f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(qt qtVar) {
        switch (this.f57169a) {
            case 0:
                f fVar = this.f57170b;
                return fVar.f57181b.scheduleAtFixedRate(new d(fVar, this.f57171c, qtVar, 0), this.d, this.f57172e, this.f57173f);
            default:
                f fVar2 = this.f57170b;
                return fVar2.f57181b.scheduleWithFixedDelay(new d(fVar2, this.f57171c, qtVar, 2), this.d, this.f57172e, this.f57173f);
        }
    }
}
