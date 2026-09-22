package xh;

import org.telegram.ui.Components.o6;
public final class d0 implements Runnable {
    public final int f46152a;
    public final j0 f46153b;

    public d0(j0 j0Var, int i10) {
        this.f46152a = i10;
        this.f46153b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f46152a) {
            case 0:
                j0 j0Var = this.f46153b;
                ph.i iVar = j0Var.h;
                hh.g gVar = j0Var.f46236f;
                if (gVar != null) {
                    gVar.d();
                }
                i0 i0Var = j0Var.H;
                if (i0Var != null) {
                    i0Var.setTranslationY(-iVar.c());
                }
                o6 o6Var = j0Var.f46240w;
                if (o6Var != null) {
                    o6Var.setTranslationY(-iVar.c());
                }
                j0Var.o();
                return;
            case 1:
                this.f46153b.H.performClick();
                return;
            default:
                this.f46153b.dismiss();
                return;
        }
    }
}
