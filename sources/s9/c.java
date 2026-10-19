package s9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f46125a;
    public final f f46126b;
    public final Runnable f46127c;
    public final long d;
    public final long e;
    public final TimeUnit f46128f;

    public c(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f46125a = i10;
        this.f46126b = fVar;
        this.f46127c = runnable;
        this.d = j10;
        this.e = j11;
        this.f46128f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(le.b bVar) {
        switch (this.f46125a) {
            case 0:
                f fVar = this.f46126b;
                return fVar.f46136b.scheduleAtFixedRate(new d(fVar, this.f46127c, bVar, 0), this.d, this.e, this.f46128f);
            default:
                f fVar2 = this.f46126b;
                return fVar2.f46136b.scheduleWithFixedDelay(new d(fVar2, this.f46127c, bVar, 2), this.d, this.e, this.f46128f);
        }
    }
}
