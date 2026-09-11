package w1;

import a6.d;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import b2.p;
public final class a extends z {
    public final d f47907l;
    public t f47908m;
    public p f47909n;

    public a(d dVar) {
        this.f47907l = dVar;
        if (dVar.f298a == null) {
            dVar.f298a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f47907l;
        dVar.f299b = true;
        dVar.d = false;
        dVar.f300c = false;
        dVar.f304i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f47907l.f299b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f47908m = null;
        this.f47909n = null;
    }

    public final void k() {
        t tVar = this.f47908m;
        p pVar = this.f47909n;
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
        Class<?> cls = this.f47907l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
