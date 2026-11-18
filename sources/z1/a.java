package z1;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import ca.i;
import d6.d;
public final class a extends z {
    public final d f61340l;
    public t f61341m;
    public i f61342n;

    public a(d dVar) {
        this.f61340l = dVar;
        if (dVar.f7864a == null) {
            dVar.f7864a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f61340l;
        dVar.f7865b = true;
        dVar.d = false;
        dVar.f7866c = false;
        dVar.f7870i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f61340l.f7865b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f61341m = null;
        this.f61342n = null;
    }

    public final void k() {
        t tVar = this.f61341m;
        i iVar = this.f61342n;
        if (tVar != null && iVar != null) {
            super.i(iVar);
            d(tVar, iVar);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #0 : ");
        Class<?> cls = this.f61340l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
