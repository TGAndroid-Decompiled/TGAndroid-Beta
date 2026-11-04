package wd;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class h1 implements x0 {
    public static final AtomicIntegerFieldUpdater f57496b = AtomicIntegerFieldUpdater.newUpdater(h1.class, "_isCompleting$volatile");
    public static final AtomicReferenceFieldUpdater f57497c = AtomicReferenceFieldUpdater.newUpdater(h1.class, Object.class, "_rootCause$volatile");
    public static final AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(h1.class, Object.class, "_exceptionsHolder$volatile");
    private volatile Object _exceptionsHolder$volatile;
    private volatile int _isCompleting$volatile = 0;
    private volatile Object _rootCause$volatile;
    public final o1 f57498a;

    public h1(o1 o1Var, Throwable th2) {
        this.f57498a = o1Var;
        this._rootCause$volatile = th2;
    }

    public final void a(Throwable th2) {
        Throwable c2 = c();
        if (c2 == null) {
            f57497c.set(this, th2);
        } else if (th2 != c2) {
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
        return this.f57498a;
    }

    public final Throwable c() {
        return (Throwable) f57497c.get(this);
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
        Throwable c2 = c();
        if (c2 != null) {
            arrayList.add(0, c2);
        }
        if (th2 != null && !th2.equals(c2)) {
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
        boolean z10;
        StringBuilder sb2 = new StringBuilder("Finishing[cancelling=");
        sb2.append(d());
        sb2.append(", completing=");
        if (f57496b.get(this) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(", rootCause=");
        sb2.append(c());
        sb2.append(", exceptions=");
        sb2.append(d.get(this));
        sb2.append(", list=");
        sb2.append(this.f57498a);
        sb2.append(']');
        return sb2.toString();
    }
}
