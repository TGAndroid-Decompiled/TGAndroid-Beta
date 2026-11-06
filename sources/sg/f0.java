package sg;

import org.telegram.ui.Components.uy;
public final class f0 implements Runnable {
    public final int f54931a;
    public final j0 f54932b;

    public f0(j0 j0Var, int i7) {
        this.f54931a = i7;
        this.f54932b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f54931a) {
            case 0:
                j0 j0Var = this.f54932b;
                j0Var.f54971c = null;
                uy uyVar = j0Var.f54969a;
                if (uyVar != null) {
                    uyVar.b();
                    return;
                }
                return;
            default:
                this.f54932b.b();
                return;
        }
    }
}
