package xh;

import org.telegram.ui.Components.p6;
public final class d0 implements Runnable {
    public final int f46112a;
    public final j0 f46113b;

    public d0(j0 j0Var, int i10) {
        this.f46112a = i10;
        this.f46113b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f46112a) {
            case 0:
                j0 j0Var = this.f46113b;
                ph.i iVar = j0Var.h;
                hh.g gVar = j0Var.f46196f;
                if (gVar != null) {
                    gVar.d();
                }
                i0 i0Var = j0Var.H;
                if (i0Var != null) {
                    i0Var.setTranslationY(-iVar.c());
                }
                p6 p6Var = j0Var.f46200w;
                if (p6Var != null) {
                    p6Var.setTranslationY(-iVar.c());
                }
                j0Var.o();
                return;
            case 1:
                this.f46113b.H.performClick();
                return;
            default:
                this.f46113b.dismiss();
                return;
        }
    }
}
