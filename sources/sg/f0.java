package sg;

import org.telegram.ui.Components.vy;
public final class f0 implements Runnable {
    public final int f55060a;
    public final j0 f55061b;

    public f0(j0 j0Var, int i7) {
        this.f55060a = i7;
        this.f55061b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f55060a) {
            case 0:
                j0 j0Var = this.f55061b;
                j0Var.f55101c = null;
                vy vyVar = j0Var.f55099a;
                if (vyVar != null) {
                    vyVar.b();
                    return;
                }
                return;
            default:
                this.f55061b.b();
                return;
        }
    }
}
