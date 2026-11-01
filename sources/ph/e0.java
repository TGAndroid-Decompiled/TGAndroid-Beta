package ph;

import org.telegram.ui.Components.f6;
public final class e0 implements Runnable {
    public final int f45035a;
    public final k0 f45036b;

    public e0(k0 k0Var, int i10) {
        this.f45035a = i10;
        this.f45036b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f45035a) {
            case 0:
                k0 k0Var = this.f45036b;
                hh.i iVar = k0Var.f45159n1;
                zg.e eVar = k0Var.f45158m1;
                if (eVar != null) {
                    eVar.d();
                }
                j0 j0Var = k0Var.f45170y1;
                if (j0Var != null) {
                    j0Var.setTranslationY(-iVar.d());
                }
                f6 f6Var = k0Var.f45164s1;
                if (f6Var != null) {
                    f6Var.setTranslationY(-iVar.d());
                }
                k0Var.I0();
                return;
            case 1:
                this.f45036b.f45170y1.performClick();
                return;
            case 2:
                this.f45036b.f45160o1.G0();
                return;
            default:
                this.f45036b.dismiss();
                return;
        }
    }
}
