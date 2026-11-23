package z1;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import ca.i;
import d6.d;
public final class a extends z {
    public final d f61350l;
    public t f61351m;
    public i f61352n;

    public a(d dVar) {
        this.f61350l = dVar;
        if (dVar.f7859a == null) {
            dVar.f7859a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f61350l;
        dVar.f7860b = true;
        dVar.d = false;
        dVar.f7861c = false;
        dVar.f7865i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f61350l.f7860b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f61351m = null;
        this.f61352n = null;
    }

    public final void k() {
        t tVar = this.f61351m;
        i iVar = this.f61352n;
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
        Class<?> cls = this.f61350l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
