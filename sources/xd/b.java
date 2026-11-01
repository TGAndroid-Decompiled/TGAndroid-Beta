package xd;

import wd.m;
import wd.o;
public abstract class b {
    public o[] f53677a;
    public int f53678b;
    public int f53679c;

    public final void a(o oVar) {
        synchronized (this) {
            try {
                int i10 = this.f53678b - 1;
                this.f53678b = i10;
                if (i10 == 0) {
                    this.f53679c = 0;
                }
                kotlin.jvm.internal.i.c(oVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                m mVar = (m) this;
                oVar.f52851a.set(null);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
