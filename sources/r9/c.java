package r9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import m.f3;
public final class c implements g {
    public final int f47229a;
    public final f f47230b;
    public final Runnable f47231c;
    public final long d;
    public final long f47232e;
    public final TimeUnit f47233f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f47229a = i10;
        this.f47230b = fVar;
        this.f47231c = runnable;
        this.d = j3;
        this.f47232e = j10;
        this.f47233f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(f3 f3Var) {
        switch (this.f47229a) {
            case 0:
                f fVar = this.f47230b;
                return fVar.f47241b.scheduleAtFixedRate(new d(fVar, this.f47231c, f3Var, 0), this.d, this.f47232e, this.f47233f);
            default:
                f fVar2 = this.f47230b;
                return fVar2.f47241b.scheduleWithFixedDelay(new d(fVar2, this.f47231c, f3Var, 2), this.d, this.f47232e, this.f47233f);
        }
    }
}
