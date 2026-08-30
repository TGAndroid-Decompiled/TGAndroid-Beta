package qd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class b extends p {
    public static final AtomicReferenceFieldUpdater f43017a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile Object _consensus$volatile = a.f43013a;

    @Override
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43017a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        i5.c cVar = a.f43013a;
        if (obj2 == cVar) {
            i5.c c3 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == cVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, cVar, c3)) {
                        obj2 = c3;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != cVar) {
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

    public abstract i5.c c(Object obj);
}
