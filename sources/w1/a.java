package w1;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import c2.u;
import o5.d;
public final class a extends z {
    public final d f46436l;
    public t f46437m;
    public u f46438n;

    public a(d dVar) {
        this.f46436l = dVar;
        if (dVar.f16426a == null) {
            dVar.f16426a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f46436l;
        dVar.f16427b = true;
        dVar.d = false;
        dVar.f16428c = false;
        dVar.f16431i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f46436l.f16427b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f46437m = null;
        this.f46438n = null;
    }

    public final void k() {
        t tVar = this.f46437m;
        u uVar = this.f46438n;
        if (tVar != null && uVar != null) {
            super.i(uVar);
            d(tVar, uVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        Class<?> cls = this.f46436l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
