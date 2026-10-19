package w1;

import a6.d;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
public final class a extends z {
    public final d f48455l;
    public t f48456m;
    public b2.t f48457n;

    public a(d dVar) {
        this.f48455l = dVar;
        if (dVar.f294a == null) {
            dVar.f294a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f48455l;
        dVar.f295b = true;
        dVar.d = false;
        dVar.f296c = false;
        dVar.f299i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f48455l.f295b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f48456m = null;
        this.f48457n = null;
    }

    public final void k() {
        t tVar = this.f48456m;
        b2.t tVar2 = this.f48457n;
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
        Class<?> cls = this.f48455l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
