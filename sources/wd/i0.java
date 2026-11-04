package wd;

import java.util.concurrent.CancellationException;
public abstract class i0 extends de.i {
    public int f57500c;

    public i0(int i3) {
        super(0L, false);
        this.f57500c = i3;
    }

    public abstract fd.c c();

    public Throwable g(Object obj) {
        v vVar;
        if (obj instanceof v) {
            vVar = (v) obj;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            return null;
        }
        return vVar.f57540a;
    }

    public final void i(Throwable th2) {
        b0.m(c().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object j();

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: wd.i0.run():void");
    }

    public void b(CancellationException cancellationException) {
    }

    public Object h(Object obj) {
        return obj;
    }
}
