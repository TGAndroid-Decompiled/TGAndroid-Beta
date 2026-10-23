package w1;

import a6.d;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
public final class a extends z {
    public final d f48902l;
    public t f48903m;
    public b2.t f48904n;

    public a(d dVar) {
        this.f48902l = dVar;
        if (dVar.f294a == null) {
            dVar.f294a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f48902l;
        dVar.f295b = true;
        dVar.d = false;
        dVar.f296c = false;
        dVar.f299i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f48902l.f295b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f48903m = null;
        this.f48904n = null;
    }

    public final void k() {
        t tVar = this.f48903m;
        b2.t tVar2 = this.f48904n;
        if (tVar != null && tVar2 != null) {
            super.i(tVar2);
            d(tVar, tVar2);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #0 : ");
        Class<?> cls = this.f48902l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
