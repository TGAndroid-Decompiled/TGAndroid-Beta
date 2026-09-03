package pd;

import od.m;
import od.o;
public abstract class b {
    public o[] f41210a;
    public int f41211b;
    public int f41212c;

    public final void a(o oVar) {
        synchronized (this) {
            try {
                int i10 = this.f41211b - 1;
                this.f41211b = i10;
                if (i10 == 0) {
                    this.f41212c = 0;
                }
                kotlin.jvm.internal.j.c(oVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                m mVar = (m) this;
                oVar.f16556a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
