package ud;

import dd.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.k;
public final class b extends k implements l {
    public final int f48481b;
    public final d f48482c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f48481b = i10;
        this.f48482c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f48481b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f48482c.e(null);
                return sc.i.f47243a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f48485g;
                d dVar = this.f48482c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return sc.i.f47243a;
        }
    }
}
