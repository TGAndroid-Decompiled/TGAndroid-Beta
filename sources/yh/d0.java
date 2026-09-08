package yh;

import org.telegram.ui.Components.q6;
public final class d0 implements Runnable {
    public final int f50258a;
    public final j0 f50259b;

    public d0(j0 j0Var, int i10) {
        this.f50258a = i10;
        this.f50259b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f50258a) {
            case 0:
                j0 j0Var = this.f50259b;
                qh.i iVar = j0Var.h;
                ih.g gVar = j0Var.f50369f;
                if (gVar != null) {
                    gVar.d();
                }
                i0 i0Var = j0Var.H;
                if (i0Var != null) {
                    i0Var.setTranslationY(-iVar.c());
                }
                q6 q6Var = j0Var.f50373w;
                if (q6Var != null) {
                    q6Var.setTranslationY(-iVar.c());
                }
                j0Var.o();
                return;
            case 1:
                this.f50259b.H.performClick();
                return;
            default:
                this.f50259b.dismiss();
                return;
        }
    }
}
