package w1;

import a6.d;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import b2.u;
public final class a extends z {
    public final d f47068l;
    public t f47069m;
    public u f47070n;

    public a(d dVar) {
        this.f47068l = dVar;
        if (dVar.f294a == null) {
            dVar.f294a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f47068l;
        dVar.f295b = true;
        dVar.d = false;
        dVar.f296c = false;
        dVar.f299i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f47068l.f295b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f47069m = null;
        this.f47070n = null;
    }

    public final void k() {
        t tVar = this.f47069m;
        u uVar = this.f47070n;
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
        Class<?> cls = this.f47068l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
