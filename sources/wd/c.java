package wd;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class c extends e1 {
    public static final AtomicReferenceFieldUpdater f57473n = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile Object _disposer$volatile;
    public final m f57474e;
    public l0 f57475f;
    public final e h;

    public c(e eVar, m mVar) {
        this.h = eVar;
        this.f57474e = mVar;
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final void j(Throwable th2) {
        m mVar = this.f57474e;
        if (th2 != null) {
            mVar.getClass();
            be.t F = mVar.F(new v(th2, false), null);
            if (F != null) {
                mVar.e(F);
                d dVar = (d) f57473n.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f57481b;
        e eVar = this.h;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            e0[] e0VarArr = eVar.f57482a;
            ArrayList arrayList = new ArrayList(e0VarArr.length);
            for (e0 e0Var : e0VarArr) {
                arrayList.add(e0Var.getCompleted());
            }
            mVar.resumeWith(arrayList);
        }
    }
}
