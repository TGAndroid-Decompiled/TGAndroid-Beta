package w1;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import c2.u;
import o5.d;
public final class a extends z {
    public final d f46354l;
    public t f46355m;
    public u f46356n;

    public a(d dVar) {
        this.f46354l = dVar;
        if (dVar.f16444a == null) {
            dVar.f16444a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f46354l;
        dVar.f16445b = true;
        dVar.d = false;
        dVar.f16446c = false;
        dVar.f16449i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f46354l.f16445b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f46355m = null;
        this.f46356n = null;
    }

    public final void k() {
        t tVar = this.f46355m;
        u uVar = this.f46356n;
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
        Class<?> cls = this.f46354l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
