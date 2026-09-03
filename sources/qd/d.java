package qd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public abstract class d {
    public static final AtomicReferenceFieldUpdater f43049a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next$volatile");
    public static final AtomicReferenceFieldUpdater f43050b = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev$volatile");
    private volatile Object _next$volatile;
    private volatile Object _prev$volatile;

    public d(t tVar) {
        this._prev$volatile = tVar;
    }

    public final void b() {
        f43050b.set(this, null);
    }

    public final d c() {
        Object obj = f43049a.get(this);
        if (obj == a.f43044b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean d();

    public final void e() {
        d dVar;
        d c3;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43050b;
            d dVar2 = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar2 != null && dVar2.d()) {
                dVar2 = (d) atomicReferenceFieldUpdater.get(dVar2);
            }
            d c10 = c();
            kotlin.jvm.internal.j.b(c10);
            while (c10.d() && (c3 = c10.c()) != null) {
                c10 = c3;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c10);
                if (((d) obj) == null) {
                    dVar = null;
                } else {
                    dVar = dVar2;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(c10, obj, dVar)) {
                    if (atomicReferenceFieldUpdater.get(c10) != obj) {
                        break;
                    }
                }
            }
            if (dVar2 != null) {
                f43049a.set(dVar2, c10);
            }
            if (!c10.d() || c10.c() == null) {
                if (dVar2 == null || !dVar2.d()) {
                    return;
                }
            }
        }
    }
}
