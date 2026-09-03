package w1;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import c2.u;
import o5.d;
public final class a extends z {
    public final d f49355l;
    public t f49356m;
    public u f49357n;

    public a(d dVar) {
        this.f49355l = dVar;
        if (dVar.f16603a == null) {
            dVar.f16603a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f49355l;
        dVar.f16604b = true;
        dVar.d = false;
        dVar.f16605c = false;
        dVar.f16609i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f49355l.f16604b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f49356m = null;
        this.f49357n = null;
    }

    public final void k() {
        t tVar = this.f49356m;
        u uVar = this.f49357n;
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
        Class<?> cls = this.f49355l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
