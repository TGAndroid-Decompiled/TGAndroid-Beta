package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
public final class c implements g {
    public final int f42454a;
    public final f f42455b;
    public final Runnable f42456c;
    public final long d;
    public final long e;
    public final TimeUnit f42457f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f42454a = i10;
        this.f42455b = fVar;
        this.f42456c = runnable;
        this.d = j3;
        this.e = j10;
        this.f42457f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(n2.e eVar) {
        switch (this.f42454a) {
            case 0:
                f fVar = this.f42455b;
                return fVar.f42465b.scheduleAtFixedRate(new d(fVar, this.f42456c, eVar, 0), this.d, this.e, this.f42457f);
            default:
                f fVar2 = this.f42455b;
                return fVar2.f42465b.scheduleWithFixedDelay(new d(fVar2, this.f42456c, eVar, 2), this.d, this.e, this.f42457f);
        }
    }
}
