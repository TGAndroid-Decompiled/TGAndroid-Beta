package z1;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import ca.i;
import d6.d;
public final class a extends z {
    public final d f60775l;
    public t f60776m;
    public i f60777n;

    public a(d dVar) {
        this.f60775l = dVar;
        if (dVar.f7584a == null) {
            dVar.f7584a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f60775l;
        dVar.f7585b = true;
        dVar.d = false;
        dVar.f7586c = false;
        dVar.f7590i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f60775l.f7585b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f60776m = null;
        this.f60777n = null;
    }

    public final void k() {
        t tVar = this.f60776m;
        i iVar = this.f60777n;
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
        Class<?> cls = this.f60775l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
