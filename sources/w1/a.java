package w1;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import c2.u;
import o5.d;
public final class a extends z {
    public final d f49319l;
    public t f49320m;
    public u f49321n;

    public a(d dVar) {
        this.f49319l = dVar;
        if (dVar.f16601a == null) {
            dVar.f16601a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f49319l;
        dVar.f16602b = true;
        dVar.d = false;
        dVar.f16603c = false;
        dVar.f16607i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f49319l.f16602b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f49320m = null;
        this.f49321n = null;
    }

    public final void k() {
        t tVar = this.f49320m;
        u uVar = this.f49321n;
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
        Class<?> cls = this.f49319l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
