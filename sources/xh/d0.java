package xh;

import org.telegram.ui.Components.p6;
public final class d0 implements Runnable {
    public final int f46113a;
    public final j0 f46114b;

    public d0(j0 j0Var, int i10) {
        this.f46113a = i10;
        this.f46114b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f46113a) {
            case 0:
                j0 j0Var = this.f46114b;
                ph.i iVar = j0Var.h;
                hh.g gVar = j0Var.f46197f;
                if (gVar != null) {
                    gVar.d();
                }
                i0 i0Var = j0Var.H;
                if (i0Var != null) {
                    i0Var.setTranslationY(-iVar.c());
                }
                p6 p6Var = j0Var.f46201w;
                if (p6Var != null) {
                    p6Var.setTranslationY(-iVar.c());
                }
                j0Var.o();
                return;
            case 1:
                this.f46114b.H.performClick();
                return;
            default:
                this.f46114b.dismiss();
                return;
        }
    }
}
