package wh;

import org.telegram.ui.Components.o6;
public final class e0 implements Runnable {
    public final int f44056a;
    public final k0 f44057b;

    public e0(k0 k0Var, int i10) {
        this.f44056a = i10;
        this.f44057b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f44056a) {
            case 0:
                k0 k0Var = this.f44057b;
                oh.i iVar = k0Var.h;
                gh.g gVar = k0Var.f44164f;
                if (gVar != null) {
                    gVar.d();
                }
                j0 j0Var = k0Var.H;
                if (j0Var != null) {
                    j0Var.setTranslationY(-iVar.c());
                }
                o6 o6Var = k0Var.f44168w;
                if (o6Var != null) {
                    o6Var.setTranslationY(-iVar.c());
                }
                k0Var.o();
                return;
            case 1:
                this.f44057b.H.performClick();
                return;
            default:
                this.f44057b.dismiss();
                return;
        }
    }
}
