package w1;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import k5.d;
public final class a extends z {
    public final d f48425l;
    public t f48426m;
    public c2.t f48427n;

    public a(d dVar) {
        this.f48425l = dVar;
        if (dVar.f14645a == null) {
            dVar.f14645a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f48425l;
        dVar.f14646b = true;
        dVar.d = false;
        dVar.f14647c = false;
        dVar.f14651i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f48425l.f14646b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f48426m = null;
        this.f48427n = null;
    }

    public final void k() {
        t tVar = this.f48426m;
        c2.t tVar2 = this.f48427n;
        if (tVar != null && tVar2 != null) {
            super.i(tVar2);
            d(tVar, tVar2);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #0 : ");
        Class<?> cls = this.f48425l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
