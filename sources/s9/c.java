package s9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f46171a;
    public final f f46172b;
    public final Runnable f46173c;
    public final long d;
    public final long e;
    public final TimeUnit f46174f;

    public c(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f46171a = i10;
        this.f46172b = fVar;
        this.f46173c = runnable;
        this.d = j10;
        this.e = j11;
        this.f46174f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(k0.b bVar) {
        switch (this.f46171a) {
            case 0:
                f fVar = this.f46172b;
                return fVar.f46182b.scheduleAtFixedRate(new d(fVar, this.f46173c, bVar, 0), this.d, this.e, this.f46174f);
            default:
                f fVar2 = this.f46172b;
                return fVar2.f46182b.scheduleWithFixedDelay(new d(fVar2, this.f46173c, bVar, 2), this.d, this.e, this.f46174f);
        }
    }
}
