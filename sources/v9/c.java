package v9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import v4.e0;
public final class c implements g {
    public final int f59317a;
    public final f f59318b;
    public final Runnable f59319c;
    public final long d;
    public final long f59320e;
    public final TimeUnit f59321f;

    public c(f fVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i7) {
        this.f59317a = i7;
        this.f59318b = fVar;
        this.f59319c = runnable;
        this.d = j3;
        this.f59320e = j10;
        this.f59321f = timeUnit;
    }

    @Override
    public final ScheduledFuture a(e0 e0Var) {
        switch (this.f59317a) {
            case 0:
                f fVar = this.f59318b;
                return fVar.f59329b.scheduleAtFixedRate(new d(fVar, this.f59319c, e0Var, 0), this.d, this.f59320e, this.f59321f);
            default:
                f fVar2 = this.f59318b;
                return fVar2.f59329b.scheduleWithFixedDelay(new d(fVar2, this.f59319c, e0Var, 2), this.d, this.f59320e, this.f59321f);
        }
    }
}
