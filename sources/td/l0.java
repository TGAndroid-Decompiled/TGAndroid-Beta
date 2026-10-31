package td;

import java.util.concurrent.CancellationException;
public abstract class l0 extends ae.i {
    public int f48637c;

    public l0(int i10) {
        super(0L, ae.l.f431g);
        this.f48637c = i10;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract cd.c c();

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
        return vVar.f48671a;
    }

    public final void i(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            i8.d.a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        kotlin.jvm.internal.i.b(th2);
        e0.m(c().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object j();

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: td.l0.run():void");
    }

    public Object h(Object obj) {
        return obj;
    }
}
