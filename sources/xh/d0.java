package xh;

import org.telegram.ui.Components.p6;
public final class d0 implements Runnable {
    public final int f49924a;
    public final j0 f49925b;

    public d0(j0 j0Var, int i10) {
        this.f49924a = i10;
        this.f49925b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f49924a) {
            case 0:
                j0 j0Var = this.f49925b;
                ph.i iVar = j0Var.h;
                hh.g gVar = j0Var.f50033f;
                if (gVar != null) {
                    gVar.d();
                }
                i0 i0Var = j0Var.H;
                if (i0Var != null) {
                    i0Var.setTranslationY(-iVar.c());
                }
                p6 p6Var = j0Var.f50037w;
                if (p6Var != null) {
                    p6Var.setTranslationY(-iVar.c());
                }
                j0Var.o();
                return;
            case 1:
                this.f49925b.H.performClick();
                return;
            default:
                this.f49925b.dismiss();
                return;
        }
    }
}
