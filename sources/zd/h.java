package zd;

import java.util.concurrent.locks.LockSupport;
public final class h extends a {
    public final Thread d;
    public final t0 f60082e;

    public h(id.h hVar, Thread thread, t0 t0Var) {
        super(hVar, true);
        this.d = thread;
        this.f60082e = t0Var;
    }

    @Override
    public final void g(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.d;
        if (!kotlin.jvm.internal.j.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
