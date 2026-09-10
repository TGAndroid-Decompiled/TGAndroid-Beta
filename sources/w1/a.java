package w1;

import a6.d;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import b2.p;
public final class a extends z {
    public final d f43430l;
    public t f43431m;
    public p f43432n;

    public a(d dVar) {
        this.f43430l = dVar;
        if (dVar.f288a == null) {
            dVar.f288a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f43430l;
        dVar.f289b = true;
        dVar.d = false;
        dVar.f290c = false;
        dVar.f293i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f43430l.f289b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f43431m = null;
        this.f43432n = null;
    }

    public final void k() {
        t tVar = this.f43431m;
        p pVar = this.f43432n;
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
        Class<?> cls = this.f43430l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
