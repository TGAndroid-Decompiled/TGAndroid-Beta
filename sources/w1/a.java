package w1;

import a6.d;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import b2.p;
public final class a extends z {
    public final d f44789l;
    public t f44790m;
    public p f44791n;

    public a(d dVar) {
        this.f44789l = dVar;
        if (dVar.f289a == null) {
            dVar.f289a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f44789l;
        dVar.f290b = true;
        dVar.d = false;
        dVar.f291c = false;
        dVar.f294i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f44789l.f290b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f44790m = null;
        this.f44791n = null;
    }

    public final void k() {
        t tVar = this.f44790m;
        p pVar = this.f44791n;
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
        Class<?> cls = this.f44789l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
