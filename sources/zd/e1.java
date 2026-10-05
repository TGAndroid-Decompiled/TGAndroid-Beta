package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class e1 extends h1 {
    public static final AtomicIntegerFieldUpdater f53242f = AtomicIntegerFieldUpdater.newUpdater(e1.class, "_invoked$volatile");
    private volatile int _invoked$volatile;
    public final d1 f53243e;

    public e1(d1 d1Var) {
        this.f53243e = d1Var;
    }

    @Override
    public final void a(Throwable th2) {
        if (f53242f.compareAndSet(this, 0, 1)) {
            this.f53243e.a(th2);
        }
    }
}
