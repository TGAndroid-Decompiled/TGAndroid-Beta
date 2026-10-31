package xd;

import wd.m;
import wd.o;
public abstract class b {
    public o[] f53659a;
    public int f53660b;
    public int f53661c;

    public final void a(o oVar) {
        synchronized (this) {
            try {
                int i10 = this.f53660b - 1;
                this.f53660b = i10;
                if (i10 == 0) {
                    this.f53661c = 0;
                }
                kotlin.jvm.internal.i.c(oVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                m mVar = (m) this;
                oVar.f52833a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
