package xh;

import org.telegram.ui.Components.n6;
public final class d0 implements Runnable {
    public final int f45822a;
    public final j0 f45823b;

    public d0(j0 j0Var, int i10) {
        this.f45822a = i10;
        this.f45823b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f45822a) {
            case 0:
                j0 j0Var = this.f45823b;
                ph.i iVar = j0Var.h;
                hh.g gVar = j0Var.f45930f;
                if (gVar != null) {
                    gVar.d();
                }
                i0 i0Var = j0Var.H;
                if (i0Var != null) {
                    i0Var.setTranslationY(-iVar.c());
                }
                n6 n6Var = j0Var.f45934w;
                if (n6Var != null) {
                    n6Var.setTranslationY(-iVar.c());
                }
                j0Var.o();
                return;
            case 1:
                this.f45823b.H.performClick();
                return;
            default:
                this.f45823b.dismiss();
                return;
        }
    }
}
