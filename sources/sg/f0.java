package sg;

import org.telegram.ui.Components.uy;
public final class f0 implements Runnable {
    public final int f55059a;
    public final j0 f55060b;

    public f0(j0 j0Var, int i7) {
        this.f55059a = i7;
        this.f55060b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f55059a) {
            case 0:
                j0 j0Var = this.f55060b;
                j0Var.f55100c = null;
                uy uyVar = j0Var.f55098a;
                if (uyVar != null) {
                    uyVar.b();
                    return;
                }
                return;
            default:
                this.f55060b.b();
                return;
        }
    }
}
