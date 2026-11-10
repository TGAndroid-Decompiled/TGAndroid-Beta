package v9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Components.qt;
public final class c implements g {
    public final int f57269a;
    public final f f57270b;
    public final Runnable f57271c;
    public final long d;
    public final long f57272e;
    public final TimeUnit f57273f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i7) {
        this.f57269a = i7;
        this.f57270b = fVar;
        this.f57271c = runnable;
        this.d = j3;
        this.f57272e = j10;
        this.f57273f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(qt qtVar) {
        switch (this.f57269a) {
            case 0:
                f fVar = this.f57270b;
                return fVar.f57281b.scheduleAtFixedRate(new d(fVar, this.f57271c, qtVar, 0), this.d, this.f57272e, this.f57273f);
            default:
                f fVar2 = this.f57270b;
                return fVar2.f57281b.scheduleWithFixedDelay(new d(fVar2, this.f57271c, qtVar, 2), this.d, this.f57272e, this.f57273f);
        }
    }
}
