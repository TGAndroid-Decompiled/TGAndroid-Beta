package qg;

import j3.w;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class d implements a {
    public final f6 f43084a;
    public c f43085b;
    public c f43086c;
    public c d;
    public c e;
    public float f43087f;
    public float h;
    public float f43088n;
    public float f43089r;

    public d(f6 f6Var) {
        this.f43084a = f6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f43088n = dpf2;
        this.f43089r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f43087f = dpf23;
        this.h = dpf24;
    }

    @Override
    public final int D() {
        return a(this.d);
    }

    public final int a(c cVar) {
        boolean a2;
        if (cVar != null) {
            f6 f6Var = this.f43084a;
            if (!(f6Var instanceof nh.b) && f6Var == null) {
                a2 = j6.I.q();
            } else {
                a2 = f6Var.a();
            }
            return cVar.f(f6Var, a2);
        }
        return 0;
    }

    public final void b(int i10, int i11) {
        this.f43085b = new w(i11, i10, 2);
    }

    public final void c(int i10, int i11) {
        this.d = new w(i11, i10, 2);
    }

    public final void d(int i10, int i11) {
        this.f43086c = new w(i11, i10, 2);
    }

    @Override
    public final int e0() {
        return a(this.f43085b);
    }

    @Override
    public final int m0() {
        return a(this.e);
    }

    @Override
    public final int x() {
        return a(this.f43086c);
    }
}
