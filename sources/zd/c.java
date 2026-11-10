package zd;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class c extends e1 {
    public static final AtomicReferenceFieldUpdater f60061n = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile Object _disposer$volatile;
    public final m f60062e;
    public l0 f60063f;
    public final e h;

    public c(e eVar, m mVar) {
        this.h = eVar;
        this.f60062e = mVar;
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final void j(Throwable th2) {
        m mVar = this.f60062e;
        if (th2 != null) {
            mVar.getClass();
            com.google.android.gms.internal.clearcut.e F = mVar.F(new v(th2, false), null);
            if (F != null) {
                mVar.f(F);
                d dVar = (d) f60061n.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f60069b;
        e eVar = this.h;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            e0[] e0VarArr = eVar.f60070a;
            ArrayList arrayList = new ArrayList(e0VarArr.length);
            for (e0 e0Var : e0VarArr) {
                arrayList.add(e0Var.getCompleted());
            }
            mVar.resumeWith(arrayList);
        }
    }
}
