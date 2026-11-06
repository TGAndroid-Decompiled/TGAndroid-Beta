package z1;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import ca.i;
import d6.d;
public final class a extends z {
    public final d f59468l;
    public t f59469m;
    public i f59470n;

    public a(d dVar) {
        this.f59468l = dVar;
        if (dVar.f8195a == null) {
            dVar.f8195a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f59468l;
        dVar.f8196b = true;
        dVar.d = false;
        dVar.f8197c = false;
        dVar.f8201i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f59468l.f8196b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f59469m = null;
        this.f59470n = null;
    }

    public final void k() {
        t tVar = this.f59469m;
        i iVar = this.f59470n;
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
        Class<?> cls = this.f59468l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
