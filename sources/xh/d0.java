package xh;

import org.telegram.ui.Components.n6;
public final class d0 implements Runnable {
    public final int f45854a;
    public final j0 f45855b;

    public d0(j0 j0Var, int i10) {
        this.f45854a = i10;
        this.f45855b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f45854a) {
            case 0:
                j0 j0Var = this.f45855b;
                ph.i iVar = j0Var.h;
                hh.g gVar = j0Var.f45962f;
                if (gVar != null) {
                    gVar.d();
                }
                i0 i0Var = j0Var.H;
                if (i0Var != null) {
                    i0Var.setTranslationY(-iVar.c());
                }
                n6 n6Var = j0Var.f45966w;
                if (n6Var != null) {
                    n6Var.setTranslationY(-iVar.c());
                }
                j0Var.o();
                return;
            case 1:
                this.f45855b.H.performClick();
                return;
            default:
                this.f45855b.dismiss();
                return;
        }
    }
}
