package w1;

import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import c2.u;
import m5.d;
public final class a extends z {
    public final d f49616l;
    public t f49617m;
    public u f49618n;

    public a(d dVar) {
        this.f49616l = dVar;
        if (dVar.f16866a == null) {
            dVar.f16866a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @Override
    public final void f() {
        d dVar = this.f49616l;
        dVar.f16867b = true;
        dVar.d = false;
        dVar.f16868c = false;
        dVar.f16872i.drainPermits();
        dVar.c();
    }

    @Override
    public final void g() {
        this.f49616l.f16867b = false;
    }

    @Override
    public final void i(a0 a0Var) {
        super.i(a0Var);
        this.f49617m = null;
        this.f49618n = null;
    }

    public final void k() {
        t tVar = this.f49617m;
        u uVar = this.f49618n;
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
        Class<?> cls = this.f49616l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
