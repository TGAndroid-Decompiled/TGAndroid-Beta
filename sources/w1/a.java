package w1;

import a6.d;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import b2.p;
public final class a extends z {
    public final d f44724l;
    public t f44725m;
    public p f44726n;

    public a(d dVar) {
        this.f44724l = dVar;
        if (dVar.f290a == null) {
            dVar.f290a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f44724l;
        dVar.f291b = true;
        dVar.d = false;
        dVar.f292c = false;
        dVar.f295i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f44724l.f291b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f44725m = null;
        this.f44726n = null;
    }

    public final void k() {
        t tVar = this.f44725m;
        p pVar = this.f44726n;
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
        Class<?> cls = this.f44724l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
