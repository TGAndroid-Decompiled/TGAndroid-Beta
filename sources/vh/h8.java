package vh;

import org.telegram.ui.ix0;
public final class h8 extends j8 {
    public final int f51276g;
    public final Object h;

    public h8(Object obj, int i10) {
        this.f51276g = i10;
        this.h = obj;
    }

    @Override
    public final void e() {
        switch (this.f51276g) {
            case 0:
                ix0 ix0Var = (ix0) this.h;
                ix0Var.Q = false;
                ix0Var.invalidate();
                return;
            case 1:
                th.z2 H = ((th.o7) this.h).H();
                if (H != null) {
                    H.k0(true);
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.g9 g9Var = (org.telegram.ui.Components.g9) this.h;
                g9Var.post(new d0(g9Var, 19));
                return;
        }
    }

    @Override
    public final void f(boolean z10) {
        switch (this.f51276g) {
            case 0:
                ix0 ix0Var = (ix0) this.h;
                ix0Var.Q = true;
                ix0Var.invalidate();
                return;
            case 1:
                th.z2 H = ((th.o7) this.h).H();
                if (H != null) {
                    H.k0(false);
                }
                th.g2 g2Var = this.f51343f;
                if (g2Var != null) {
                    g2Var.setTranslationX(0.0f);
                    this.f51343f.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                ((org.telegram.ui.Components.g9) this.h).setVisibility(0);
                return;
        }
    }
}
