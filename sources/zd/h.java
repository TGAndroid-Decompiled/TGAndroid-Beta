package zd;

import java.util.concurrent.locks.LockSupport;
public final class h extends a {
    public final Thread d;
    public final w0 f51558e;

    public h(id.h hVar, Thread thread, w0 w0Var) {
        super(hVar, true);
        this.d = thread;
        this.f51558e = w0Var;
    }

    @Override
    public final void f(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.d;
        if (!kotlin.jvm.internal.i.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
