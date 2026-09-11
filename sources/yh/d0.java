package yh;

import org.telegram.ui.Components.q6;
public final class d0 implements Runnable {
    public final int f50229a;
    public final j0 f50230b;

    public d0(j0 j0Var, int i10) {
        this.f50229a = i10;
        this.f50230b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f50229a) {
            case 0:
                j0 j0Var = this.f50230b;
                qh.i iVar = j0Var.h;
                ih.g gVar = j0Var.f50340f;
                if (gVar != null) {
                    gVar.d();
                }
                i0 i0Var = j0Var.H;
                if (i0Var != null) {
                    i0Var.setTranslationY(-iVar.c());
                }
                q6 q6Var = j0Var.f50344w;
                if (q6Var != null) {
                    q6Var.setTranslationY(-iVar.c());
                }
                j0Var.o();
                return;
            case 1:
                this.f50230b.H.performClick();
                return;
            default:
                this.f50230b.dismiss();
                return;
        }
    }
}
