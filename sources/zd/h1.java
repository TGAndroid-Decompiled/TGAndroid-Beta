package zd;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class h1 implements x0 {
    public static final AtomicIntegerFieldUpdater f59983b = AtomicIntegerFieldUpdater.newUpdater(h1.class, "_isCompleting$volatile");
    public static final AtomicReferenceFieldUpdater f59984c = AtomicReferenceFieldUpdater.newUpdater(h1.class, Object.class, "_rootCause$volatile");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(h1.class, Object.class, "_exceptionsHolder$volatile");
    private volatile Object _exceptionsHolder$volatile;
    private volatile int _isCompleting$volatile = 0;
    private volatile Object _rootCause$volatile;
    public final o1 f59985a;

    public h1(o1 o1Var, Throwable th2) {
        this.f59985a = o1Var;
        this._rootCause$volatile = th2;
    }

    public final void a(Throwable th2) {
        Throwable c10 = c();
        if (c10 == null) {
            f59984c.set(this, th2);
        } else if (th2 != c10) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th2);
            } else if (obj instanceof Throwable) {
                if (th2 == obj) {
                    return;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(th2);
                atomicReferenceFieldUpdater.set(this, arrayList);
            } else if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th2);
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
    }

    @Override
    public final o1 b() {
        return this.f59985a;
    }

    public final Throwable c() {
        return (Throwable) f59984c.get(this);
    }

    public final boolean d() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public final ArrayList e(Throwable th2) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable c10 = c();
        if (c10 != null) {
            arrayList.add(0, c10);
        }
        if (th2 != null && !th2.equals(c10)) {
            arrayList.add(th2);
        }
        atomicReferenceFieldUpdater.set(this, b0.h);
        return arrayList;
    }

    @Override
    public final boolean isActive() {
        if (c() == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        boolean z9;
        StringBuilder sb2 = new StringBuilder("Finishing[cancelling=");
        sb2.append(d());
        sb2.append(", completing=");
        if (f59983b.get(this) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        sb2.append(z9);
        sb2.append(", rootCause=");
        sb2.append(c());
        sb2.append(", exceptions=");
        sb2.append(d.get(this));
        sb2.append(", list=");
        sb2.append(this.f59985a);
        sb2.append(']');
        return sb2.toString();
    }
}
