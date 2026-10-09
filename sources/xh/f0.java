package xh;

import org.telegram.ui.Components.r6;
public final class f0 implements Runnable {
    public final int f51219a;
    public final l0 f51220b;

    public f0(l0 l0Var, int i10) {
        this.f51219a = i10;
        this.f51220b = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f51219a) {
            case 0:
                l0 l0Var = this.f51220b;
                ph.i iVar = l0Var.h;
                hh.f fVar = l0Var.f51333f;
                if (fVar != null) {
                    fVar.d();
                }
                k0 k0Var = l0Var.H;
                if (k0Var != null) {
                    k0Var.setTranslationY(-iVar.d());
                }
                r6 r6Var = l0Var.f51337w;
                if (r6Var != null) {
                    r6Var.setTranslationY(-iVar.d());
                }
                l0Var.q();
                return;
            case 1:
                this.f51220b.H.performClick();
                return;
            default:
                this.f51220b.dismiss();
                return;
        }
    }
}
