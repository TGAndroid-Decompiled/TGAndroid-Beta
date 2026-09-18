package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f42410a;
    public final f f42411b;
    public final Runnable f42412c;
    public final long d;
    public final long e;
    public final TimeUnit f42413f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f42410a = i10;
        this.f42411b = fVar;
        this.f42412c = runnable;
        this.d = j3;
        this.e = j10;
        this.f42413f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(n2.e eVar) {
        switch (this.f42410a) {
            case 0:
                f fVar = this.f42411b;
                return fVar.f42421b.scheduleAtFixedRate(new d(fVar, this.f42412c, eVar, 0), this.d, this.e, this.f42413f);
            default:
                f fVar2 = this.f42411b;
                return fVar2.f42421b.scheduleWithFixedDelay(new d(fVar2, this.f42412c, eVar, 2), this.d, this.e, this.f42413f);
        }
    }
}
