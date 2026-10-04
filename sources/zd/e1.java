package zd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class e1 extends h1 {
    public static final AtomicIntegerFieldUpdater f53215f = AtomicIntegerFieldUpdater.newUpdater(e1.class, "_invoked$volatile");
    private volatile int _invoked$volatile;
    public final d1 f53216e;

    public e1(d1 d1Var) {
        this.f53216e = d1Var;
    }

    @Override
    public final void a(Throwable th2) {
        if (f53215f.compareAndSet(this, 0, 1)) {
            this.f53216e.a(th2);
        }
    }
}
