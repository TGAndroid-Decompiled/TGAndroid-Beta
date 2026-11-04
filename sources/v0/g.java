package v0;

import android.os.CancellationSignal;
public final class g implements od.l {
    public final int f56426a;
    public final Object f56427b;

    public g(Object obj, int i3) {
        this.f56426a = i3;
        this.f56427b = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f56426a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                ((CancellationSignal) this.f56427b).cancel();
                return dd.k.f8801a;
            default:
                Throwable th3 = (Throwable) obj;
                dd.k kVar = dd.k.f8801a;
                ((wd.m) this.f56427b).resumeWith(kVar);
                return kVar;
        }
    }
}
