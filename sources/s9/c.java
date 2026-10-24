package s9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f46555a;
    public final f f46556b;
    public final Runnable f46557c;
    public final long d;
    public final long e;
    public final TimeUnit f46558f;

    public c(f fVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.f46555a = i10;
        this.f46556b = fVar;
        this.f46557c = runnable;
        this.d = j10;
        this.e = j11;
        this.f46558f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(le.b bVar) {
        switch (this.f46555a) {
            case 0:
                f fVar = this.f46556b;
                return fVar.f46566b.scheduleAtFixedRate(new d(fVar, this.f46557c, bVar, 0), this.d, this.e, this.f46558f);
            default:
                f fVar2 = this.f46556b;
                return fVar2.f46566b.scheduleWithFixedDelay(new d(fVar2, this.f46557c, bVar, 2), this.d, this.e, this.f46558f);
        }
    }
}
