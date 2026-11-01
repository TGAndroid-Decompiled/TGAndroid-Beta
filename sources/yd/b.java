package yd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class b extends p {
    public static final AtomicReferenceFieldUpdater f54416a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile Object _consensus$volatile = a.f54412a;

    @Override
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54416a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        ea.a aVar = a.f54412a;
        if (obj2 == aVar) {
            ea.a c10 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == aVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, aVar, c10)) {
                        obj2 = c10;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract ea.a c(Object obj);
}
