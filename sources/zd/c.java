package zd;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
public final class c extends k1 {
    public static final AtomicReferenceFieldUpdater f53202n = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile Object _disposer$volatile;
    public final m f53203e;
    public o0 f53204f;
    public final e h;

    public c(e eVar, m mVar) {
        this.h = eVar;
        this.f53203e = mVar;
    }

    @Override
    public final void a(Throwable th2) {
        m mVar = this.f53203e;
        if (th2 != null) {
            mVar.getClass();
            com.google.android.gms.internal.clearcut.e F = mVar.F(null, new v(th2, false));
            if (F != null) {
                mVar.e(F);
                d dVar = (d) f53202n.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f53211b;
        e eVar = this.h;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            h0[] h0VarArr = eVar.f53212a;
            ArrayList arrayList = new ArrayList(h0VarArr.length);
            for (h0 h0Var : h0VarArr) {
                arrayList.add(h0Var.getCompleted());
            }
            mVar.resumeWith(arrayList);
        }
    }
}
