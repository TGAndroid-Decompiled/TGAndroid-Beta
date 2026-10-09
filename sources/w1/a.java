package w1;

import a6.d;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import b2.p;
public final class a extends z {
    public final d f49749l;
    public t f49750m;
    public p f49751n;

    public a(d dVar) {
        this.f49749l = dVar;
        if (dVar.f312a == null) {
            dVar.f312a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f49749l;
        dVar.f313b = true;
        dVar.d = false;
        dVar.f314c = false;
        dVar.f318i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f49749l.f313b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f49750m = null;
        this.f49751n = null;
    }

    public final void k() {
        t tVar = this.f49750m;
        p pVar = this.f49751n;
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
        Class<?> cls = this.f49749l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
