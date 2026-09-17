package w1;

import a6.d;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import b2.p;
public final class a extends z {
    public final d f47936l;
    public t f47937m;
    public p f47938n;

    public a(d dVar) {
        this.f47936l = dVar;
        if (dVar.f310a == null) {
            dVar.f310a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f47936l;
        dVar.f311b = true;
        dVar.d = false;
        dVar.f312c = false;
        dVar.f316i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f47936l.f311b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f47937m = null;
        this.f47938n = null;
    }

    public final void k() {
        t tVar = this.f47937m;
        p pVar = this.f47938n;
        if (tVar != null && pVar != null) {
            super.i(pVar);
            d(tVar, pVar);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #0 : ");
        Class<?> cls = this.f47936l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
