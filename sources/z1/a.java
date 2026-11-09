package z1;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import ca.i;
import d6.d;
public final class a extends z {
    public final d f59575l;
    public t f59576m;
    public i f59577n;

    public a(d dVar) {
        this.f59575l = dVar;
        if (dVar.f8193a == null) {
            dVar.f8193a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f59575l;
        dVar.f8194b = true;
        dVar.d = false;
        dVar.f8195c = false;
        dVar.f8199i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f59575l.f8194b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f59576m = null;
        this.f59577n = null;
    }

    public final void k() {
        t tVar = this.f59576m;
        i iVar = this.f59577n;
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
        Class<?> cls = this.f59575l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
