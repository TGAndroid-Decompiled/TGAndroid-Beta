package yh;

import org.telegram.ui.Components.s6;
public final class e0 implements Runnable {
    public final int f48821a;
    public final k0 f48822b;

    public e0(k0 k0Var, int i10) {
        this.f48821a = i10;
        this.f48822b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f48821a) {
            case 0:
                k0 k0Var = this.f48822b;
                qh.i iVar = k0Var.h;
                ih.f fVar = k0Var.f48928f;
                if (fVar != null) {
                    fVar.d();
                }
                j0 j0Var = k0Var.H;
                if (j0Var != null) {
                    j0Var.setTranslationY(-iVar.d());
                }
                s6 s6Var = k0Var.f48932w;
                if (s6Var != null) {
                    s6Var.setTranslationY(-iVar.d());
                }
                k0Var.q();
                return;
            case 1:
                this.f48822b.H.performClick();
                return;
            default:
                this.f48822b.dismiss();
                return;
        }
    }
}
