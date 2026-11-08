package sg;

import org.telegram.ui.Components.vy;
public final class f0 implements Runnable {
    public final int f55048a;
    public final j0 f55049b;

    public f0(j0 j0Var, int i7) {
        this.f55048a = i7;
        this.f55049b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f55048a) {
            case 0:
                j0 j0Var = this.f55049b;
                j0Var.f55088c = null;
                vy vyVar = j0Var.f55086a;
                if (vyVar != null) {
                    vyVar.b();
                    return;
                }
                return;
            default:
                this.f55049b.b();
                return;
        }
    }
}
