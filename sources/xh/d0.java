package xh;

import org.telegram.ui.Components.p6;
public final class d0 implements Runnable {
    public final int f45783a;
    public final j0 f45784b;

    public d0(j0 j0Var, int i10) {
        this.f45783a = i10;
        this.f45784b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f45783a) {
            case 0:
                j0 j0Var = this.f45784b;
                ph.i iVar = j0Var.h;
                hh.g gVar = j0Var.f45867f;
                if (gVar != null) {
                    gVar.d();
                }
                i0 i0Var = j0Var.H;
                if (i0Var != null) {
                    i0Var.setTranslationY(-iVar.c());
                }
                p6 p6Var = j0Var.f45871w;
                if (p6Var != null) {
                    p6Var.setTranslationY(-iVar.c());
                }
                j0Var.o();
                return;
            case 1:
                this.f45784b.H.performClick();
                return;
            default:
                this.f45784b.dismiss();
                return;
        }
    }
}
