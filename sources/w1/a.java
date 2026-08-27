package w1;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import k5.d;

public final class a extends z {

    public final d f48928l;

    public t f48929m;

    public c2.t f48930n;

    public a(d dVar) {
        this.f48928l = dVar;
        if (dVar.f14466a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        dVar.f14466a = this;
    }

    @Override
    public final void f() {
        d dVar = this.f48928l;
        dVar.f14467b = true;
        dVar.d = false;
        dVar.f14468c = false;
        dVar.f14472i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f48928l.f14467b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f48929m = null;
        this.f48930n = null;
    }

    public final void k() {
        t tVar = this.f48929m;
        c2.t tVar2 = this.f48930n;
        if (tVar == null || tVar2 == null) {
            return;
        }
        super.i(tVar2);
        d(tVar, tVar2);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #0 : ");
        Class<?> cls = this.f48928l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
