package ph;

import org.telegram.ui.Components.f6;
public final class e0 implements Runnable {
    public final int f45024a;
    public final k0 f45025b;

    public e0(k0 k0Var, int i10) {
        this.f45024a = i10;
        this.f45025b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f45024a) {
            case 0:
                k0 k0Var = this.f45025b;
                hh.i iVar = k0Var.f45148n1;
                zg.e eVar = k0Var.f45147m1;
                if (eVar != null) {
                    eVar.d();
                }
                j0 j0Var = k0Var.f45159y1;
                if (j0Var != null) {
                    j0Var.setTranslationY(-iVar.d());
                }
                f6 f6Var = k0Var.f45153s1;
                if (f6Var != null) {
                    f6Var.setTranslationY(-iVar.d());
                }
                k0Var.I0();
                return;
            case 1:
                this.f45025b.f45159y1.performClick();
                return;
            case 2:
                this.f45025b.f45149o1.G0();
                return;
            default:
                this.f45025b.dismiss();
                return;
        }
    }
}
