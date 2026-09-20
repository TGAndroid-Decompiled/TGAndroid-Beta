package zd;

import java.util.concurrent.CancellationException;
import v7.s7;
public abstract class l0 extends ge.i {
    public int f49204c;

    public l0(int i10) {
        super(0L, ge.k.f9649g);
        this.f49204c = i10;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract id.c f();

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
        return vVar.f49238a;
    }

    public final void i(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            s7.a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        kotlin.jvm.internal.i.b(th2);
        e0.m(f().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object j();

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: zd.l0.run():void");
    }

    public Object h(Object obj) {
        return obj;
    }
}
