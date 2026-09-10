package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class e1 extends h1 {
    public static final AtomicIntegerFieldUpdater f48007f = AtomicIntegerFieldUpdater.newUpdater(e1.class, "_invoked$volatile");
    private volatile int _invoked$volatile;
    public final d1 e;

    public e1(d1 d1Var) {
        this.e = d1Var;
    }

    @Override
    public final void a(Throwable th2) {
        if (f48007f.compareAndSet(this, 0, 1)) {
            this.e.a(th2);
        }
    }
}
