package z1;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import ca.i;
import d6.d;
public final class a extends z {
    public final d f59573l;
    public t f59574m;
    public i f59575n;

    public a(d dVar) {
        this.f59573l = dVar;
        if (dVar.f8198a == null) {
            dVar.f8198a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f59573l;
        dVar.f8199b = true;
        dVar.d = false;
        dVar.f8200c = false;
        dVar.f8204i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f59573l.f8199b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f59574m = null;
        this.f59575n = null;
    }

    public final void k() {
        t tVar = this.f59574m;
        i iVar = this.f59575n;
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
        Class<?> cls = this.f59573l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
