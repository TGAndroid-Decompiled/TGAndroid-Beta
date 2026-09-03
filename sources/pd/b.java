package pd;

import od.m;
import od.o;
public abstract class b {
    public o[] f44385a;
    public int f44386b;
    public int f44387c;

    public final void a(o oVar) {
        synchronized (this) {
            try {
                int i10 = this.f44386b - 1;
                this.f44386b = i10;
                if (i10 == 0) {
                    this.f44387c = 0;
                }
                kotlin.jvm.internal.j.c(oVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                m mVar = (m) this;
                oVar.f16748a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
