package qh;

import org.telegram.ui.vz0;
public final class u9 extends x9 {
    public final int f46166g;
    public final Object h;

    public u9(Object obj, int i10) {
        this.f46166g = i10;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f46166g) {
            case 0:
                vz0 vz0Var = (vz0) this.h;
                vz0Var.N = false;
                vz0Var.invalidate();
                return;
            case 1:
                oh.f4 t6 = ((oh.i9) this.h).t();
                if (t6 != null) {
                    t6.m0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.p9 p9Var = (org.telegram.ui.Components.p9) this.h;
                p9Var.post(new v9(p9Var, 0));
                return;
        }
    }

    @Override
    public final void f(boolean z4) {
        switch (this.f46166g) {
            case 0:
                vz0 vz0Var = (vz0) this.h;
                vz0Var.N = true;
                vz0Var.invalidate();
                return;
            case 1:
                oh.f4 t6 = ((oh.i9) this.h).t();
                if (t6 != null) {
                    t6.m0(false);
                }
                oh.j3 j3Var = this.f46307f;
                if (j3Var != null) {
                    j3Var.setTranslationX(0.0f);
                    this.f46307f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.p9) this.h).setVisibility(0);
                return;
        }
    }
}
