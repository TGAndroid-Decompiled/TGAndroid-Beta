package yd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import td.e0;
public class k {
    public static final AtomicReferenceFieldUpdater f54428a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next$volatile");
    public static final AtomicReferenceFieldUpdater f54429b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev$volatile");
    public static final AtomicReferenceFieldUpdater f54430c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef$volatile");
    private volatile Object _next$volatile = this;
    private volatile Object _prev$volatile = this;
    private volatile Object _removedRef$volatile;

    public final yd.k d() {
        throw new UnsupportedOperationException("Method not decompiled: yd.k.d():yd.k");
    }

    public final void e(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f54429b;
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
            Object obj = f54428a.get(this);
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).a(this);
        }
    }

    public final k g() {
        q qVar;
        k kVar;
        Object f7 = f();
        if (f7 instanceof q) {
            qVar = (q) f7;
        } else {
            qVar = null;
        }
        if (qVar != null && (kVar = qVar.f54439a) != null) {
            return kVar;
        }
        kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (k) f7;
    }

    public boolean h() {
        return f() instanceof q;
    }

    public String toString() {
        return new kotlin.jvm.internal.m(this, e0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + e0.k(this);
    }
}
