package y1;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import ba.i;
import c6.d;
public final class a extends z {
    public final d f58891l;
    public t f58892m;
    public i f58893n;

    public a(d dVar) {
        this.f58891l = dVar;
        if (dVar.f4221a == null) {
            dVar.f4221a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f58891l;
        dVar.f4222b = true;
        dVar.d = false;
        dVar.f4223c = false;
        dVar.f4227i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f58891l.f4222b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f58892m = null;
        this.f58893n = null;
    }

    public final void k() {
        t tVar = this.f58892m;
        i iVar = this.f58893n;
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
        Class<?> cls = this.f58891l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
