package pd;

import od.m;
import od.o;
public abstract class b {
    public o[] f41187a;
    public int f41188b;
    public int f41189c;

    public final void a(o oVar) {
        synchronized (this) {
            try {
                int i10 = this.f41188b - 1;
                this.f41188b = i10;
                if (i10 == 0) {
                    this.f41189c = 0;
                }
                kotlin.jvm.internal.j.c(oVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                m mVar = (m) this;
                oVar.f16574a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
