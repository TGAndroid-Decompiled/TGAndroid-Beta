package ud;

import dd.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.k;
public final class b extends k implements l {
    public final int f45220b;
    public final d f45221c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f45220b = i10;
        this.f45221c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f45220b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f45221c.e(null);
                return sc.i.f44253a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f45224g;
                d dVar = this.f45221c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return sc.i.f44253a;
        }
    }
}
