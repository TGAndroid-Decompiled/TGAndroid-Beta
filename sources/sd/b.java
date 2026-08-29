package sd;

import bd.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.k;
public final class b extends k implements l {
    public final int f47712b;
    public final d f47713c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f47712b = i10;
        this.f47713c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f47712b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f47713c.e(null);
                return qc.i.f46603a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f47716g;
                d dVar = this.f47713c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return qc.i.f46603a;
        }
    }
}
