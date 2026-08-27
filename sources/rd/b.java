package rd;

import ad.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.k;

public final class b extends k implements l {

    public final int f46900b;

    public final d f46901c;

    public b(d dVar, c cVar, int i10) {
        super(1);
        this.f46900b = i10;
        this.f46901c = dVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f46900b) {
            case 0:
                this.f46901c.e(null);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f46904g;
                d dVar = this.f46901c;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                break;
        }
        return pc.i.f45696a;
    }
}
