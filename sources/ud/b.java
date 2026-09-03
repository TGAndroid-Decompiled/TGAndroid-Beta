package ud;

import dd.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.k;
public final class b extends k implements l {
    public final int f45282b;
    public final d f45283c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f45282b = i10;
        this.f45283c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f45282b) {
            case 0:
                Throwable th2 = (Throwable) obj;
                this.f45283c.e(null);
                return sc.i.f44318a;
            default:
                Throwable th3 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f45286g;
                d dVar = this.f45283c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return sc.i.f44318a;
        }
    }
}
