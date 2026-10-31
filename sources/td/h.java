package td;

import java.util.concurrent.locks.LockSupport;
public final class h extends a {
    public final Thread d;
    public final w0 e;

    public h(cd.h hVar, Thread thread, w0 w0Var) {
        super(hVar, true);
        this.d = thread;
        this.e = w0Var;
    }

    @Override
    public final void b(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.d;
        if (!kotlin.jvm.internal.i.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
