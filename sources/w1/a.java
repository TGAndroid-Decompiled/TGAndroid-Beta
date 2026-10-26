package w1;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import b2.u;
import b6.d;
public final class a extends z {
    public final d f50648l;
    public t f50649m;
    public u f50650n;

    public a(d dVar) {
        this.f50648l = dVar;
        if (dVar.f3657a == null) {
            dVar.f3657a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f50648l;
        dVar.f3658b = true;
        dVar.d = false;
        dVar.f3659c = false;
        dVar.f3662i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f50648l.f3658b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f50649m = null;
        this.f50650n = null;
    }

    public final void k() {
        t tVar = this.f50649m;
        u uVar = this.f50650n;
        if (tVar != null && uVar != null) {
            super.i(uVar);
            d(tVar, uVar);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #0 : ");
        Class<?> cls = this.f50648l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
