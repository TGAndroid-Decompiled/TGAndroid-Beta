package qg;

import j3.w;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public final class d implements a {
    public final f6 f43060a;
    public c f43061b;
    public c f43062c;
    public c d;
    public c e;
    public float f43063f;
    public float h;
    public float f43064n;
    public float f43065r;

    public d(f6 f6Var) {
        this.f43060a = f6Var;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        this.f43064n = dpf2;
        this.f43065r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(1.0f);
        float dpf24 = AndroidUtilities.dpf2(0.6666667f);
        this.f43063f = dpf23;
        this.h = dpf24;
    }

    @Override
    public final int D2() {
        return a(this.e);
    }

    @Override
    public final int W1() {
        return a(this.f43061b);
    }

    @Override
    public final int X0() {
        return a(this.d);
    }

    public final int a(c cVar) {
        boolean a2;
        if (cVar != null) {
            f6 f6Var = this.f43060a;
            if (!(f6Var instanceof nh.b) && f6Var == null) {
                a2 = j6.I.q();
            } else {
                a2 = f6Var.a();
            }
            return cVar.g(f6Var, a2);
        }
        return 0;
    }

    public final void b(int i10, int i11) {
        this.f43061b = new w(i11, i10, 2);
    }

    public final void c(int i10, int i11) {
        this.d = new w(i11, i10, 2);
    }

    public final void d(int i10, int i11) {
        this.f43062c = new w(i11, i10, 2);
    }

    @Override
    public final int x0() {
        return a(this.f43062c);
    }
}
