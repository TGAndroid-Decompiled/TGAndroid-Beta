package qd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zc.l;
public final class b extends kotlin.jvm.internal.j implements l {
    public final int f46141b;
    public final d f46142c;

    public b(d dVar, c cVar, int i9) {
        super(1);
        this.f46141b = i9;
        this.f46142c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f46141b) {
            case 0:
                Throwable th = (Throwable) obj;
                this.f46142c.e(null);
                return oc.i.f19197a;
            default:
                Throwable th2 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f46145g;
                d dVar = this.f46142c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return oc.i.f19197a;
        }
    }
}
