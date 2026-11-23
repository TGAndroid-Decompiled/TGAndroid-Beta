package z1;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import ca.i;
import d6.d;
public final class a extends z {
    public final d f61469l;
    public t f61470m;
    public i f61471n;

    public a(d dVar) {
        this.f61469l = dVar;
        if (dVar.f7858a == null) {
            dVar.f7858a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f61469l;
        dVar.f7859b = true;
        dVar.d = false;
        dVar.f7860c = false;
        dVar.f7864i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f61469l.f7859b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f61470m = null;
        this.f61471n = null;
    }

    public final void k() {
        t tVar = this.f61470m;
        i iVar = this.f61471n;
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
        Class<?> cls = this.f61469l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
