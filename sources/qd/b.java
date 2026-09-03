package qd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class b extends p {
    public static final AtomicReferenceFieldUpdater f44824a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile Object _consensus$volatile = a.f44819a;

    @Override
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f44824a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        com.google.android.gms.internal.clearcut.e eVar = a.f44819a;
        if (obj2 == eVar) {
            com.google.android.gms.internal.clearcut.e c3 = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == eVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, eVar, c3)) {
                        obj2 = c3;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != eVar) {
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

    public abstract com.google.android.gms.internal.clearcut.e c(Object obj);
}
