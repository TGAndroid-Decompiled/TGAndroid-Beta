package xh;

import org.telegram.ui.Components.r6;
public final class f0 implements Runnable {
    public final int f51439a;
    public final l0 f51440b;

    public f0(l0 l0Var, int i10) {
        this.f51439a = i10;
        this.f51440b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f51439a) {
            case 0:
                l0 l0Var = this.f51440b;
                ph.i iVar = l0Var.h;
                hh.f fVar = l0Var.f51554f;
                if (fVar != null) {
                    fVar.d();
                }
                k0 k0Var = l0Var.H;
                if (k0Var != null) {
                    k0Var.setTranslationY(-iVar.d());
                }
                r6 r6Var = l0Var.f51558w;
                if (r6Var != null) {
                    r6Var.setTranslationY(-iVar.d());
                }
                l0Var.q();
                return;
            case 1:
                this.f51440b.H.performClick();
                return;
            default:
                this.f51440b.dismiss();
                return;
        }
    }
}
