package xh;

import org.telegram.ui.Components.o6;
public final class d0 implements Runnable {
    public final int f46131a;
    public final j0 f46132b;

    public d0(j0 j0Var, int i10) {
        this.f46131a = i10;
        this.f46132b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f46131a) {
            case 0:
                j0 j0Var = this.f46132b;
                ph.i iVar = j0Var.h;
                hh.g gVar = j0Var.f46215f;
                if (gVar != null) {
                    gVar.d();
                }
                i0 i0Var = j0Var.H;
                if (i0Var != null) {
                    i0Var.setTranslationY(-iVar.c());
                }
                o6 o6Var = j0Var.f46219w;
                if (o6Var != null) {
                    o6Var.setTranslationY(-iVar.c());
                }
                j0Var.o();
                return;
            case 1:
                this.f46132b.H.performClick();
                return;
            default:
                this.f46132b.dismiss();
                return;
        }
    }
}
