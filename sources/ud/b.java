package ud;

import dd.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.k;
public final class b extends k implements l {
    public final int f48517b;
    public final d f48518c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f48517b = i10;
        this.f48518c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f48517b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f48518c.e(null);
                return sc.i.f47274a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f48521g;
                d dVar = this.f48518c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return sc.i.f47274a;
        }
    }
}
