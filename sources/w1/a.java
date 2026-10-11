package w1;

import a6.d;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import b2.p;
public final class a extends z {
    public final d f49838l;
    public t f49839m;
    public p f49840n;

    public a(d dVar) {
        this.f49838l = dVar;
        if (dVar.f312a == null) {
            dVar.f312a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f49838l;
        dVar.f313b = true;
        dVar.d = false;
        dVar.f314c = false;
        dVar.f318i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f49838l.f313b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f49839m = null;
        this.f49840n = null;
    }

    public final void k() {
        t tVar = this.f49839m;
        p pVar = this.f49840n;
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
        Class<?> cls = this.f49838l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
