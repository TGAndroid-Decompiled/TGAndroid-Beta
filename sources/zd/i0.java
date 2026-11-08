package zd;

import java.util.concurrent.CancellationException;
public abstract class i0 extends ge.i {
    public int f60081c;

    public i0(int i7) {
        super(0L, false);
        this.f60081c = i7;
    }

    public abstract id.c c();

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
        return vVar.f60121a;
    }

    public final void i(Throwable th2) {
        b0.m(c().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object j();

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: zd.i0.run():void");
    }

    public void b(CancellationException cancellationException) {
    }

    public Object h(Object obj) {
        return obj;
    }
}
