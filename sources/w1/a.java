package w1;

import a6.d;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import b2.u;
public final class a extends z {
    public final d f52345l;
    public t f52346m;
    public u f52347n;

    public a(d dVar) {
        this.f52345l = dVar;
        if (dVar.f294a == null) {
            dVar.f294a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f52345l;
        dVar.f295b = true;
        dVar.d = false;
        dVar.f296c = false;
        dVar.f299i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f52345l.f295b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f52346m = null;
        this.f52347n = null;
    }

    public final void k() {
        t tVar = this.f52346m;
        u uVar = this.f52347n;
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
        Class<?> cls = this.f52345l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
