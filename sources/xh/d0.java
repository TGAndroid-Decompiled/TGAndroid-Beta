package xh;

import org.telegram.ui.Components.p6;
public final class d0 implements Runnable {
    public final int f49915a;
    public final j0 f49916b;

    public d0(j0 j0Var, int i10) {
        this.f49915a = i10;
        this.f49916b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f49915a) {
            case 0:
                j0 j0Var = this.f49916b;
                ph.i iVar = j0Var.h;
                hh.g gVar = j0Var.f50024f;
                if (gVar != null) {
                    gVar.d();
                }
                i0 i0Var = j0Var.H;
                if (i0Var != null) {
                    i0Var.setTranslationY(-iVar.c());
                }
                p6 p6Var = j0Var.f50028w;
                if (p6Var != null) {
                    p6Var.setTranslationY(-iVar.c());
                }
                j0Var.o();
                return;
            case 1:
                this.f49916b.H.performClick();
                return;
            default:
                this.f49916b.dismiss();
                return;
        }
    }
}
