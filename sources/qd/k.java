package qd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ld.e0;
public class k {
    public static final AtomicReferenceFieldUpdater f43029a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next$volatile");
    public static final AtomicReferenceFieldUpdater f43030b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev$volatile");
    public static final AtomicReferenceFieldUpdater f43031c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef$volatile");
    private volatile Object _next$volatile = this;
    private volatile Object _prev$volatile = this;
    private volatile Object _removedRef$volatile;

    public final qd.k d() {
        throw new UnsupportedOperationException("Method not decompiled: qd.k.d():qd.k");
    }

    public final void e(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43030b;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (f() == kVar) {
                while (!atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                    if (atomicReferenceFieldUpdater.get(kVar) != kVar2) {
                        break;
                    }
                }
                if (h()) {
                    kVar.d();
                    return;
                }
                return;
            }
            return;
        }
    }

    public final Object f() {
        while (true) {
            Object obj = f43029a.get(this);
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).a(this);
        }
    }

    public final k g() {
        q qVar;
        k kVar;
        Object f10 = f();
        if (f10 instanceof q) {
            qVar = (q) f10;
        } else {
            qVar = null;
        }
        if (qVar != null && (kVar = qVar.f43040a) != null) {
            return kVar;
        }
        kotlin.jvm.internal.j.c(f10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (k) f10;
    }

    public boolean h() {
        return f() instanceof q;
    }

    public String toString() {
        return new kotlin.jvm.internal.n(this, e0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + e0.k(this);
    }
}
