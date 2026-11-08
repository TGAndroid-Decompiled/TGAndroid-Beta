package sg;

import org.telegram.ui.Components.vy;
public final class f0 implements Runnable {
    public final int f55047a;
    public final j0 f55048b;

    public f0(j0 j0Var, int i7) {
        this.f55047a = i7;
        this.f55048b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f55047a) {
            case 0:
                j0 j0Var = this.f55048b;
                j0Var.f55087c = null;
                vy vyVar = j0Var.f55085a;
                if (vyVar != null) {
                    vyVar.b();
                    return;
                }
                return;
            default:
                this.f55048b.b();
                return;
        }
    }
}
