package sg;

import org.telegram.ui.Components.uy;
public final class f0 implements Runnable {
    public final int f54956a;
    public final j0 f54957b;

    public f0(j0 j0Var, int i7) {
        this.f54956a = i7;
        this.f54957b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f54956a) {
            case 0:
                j0 j0Var = this.f54957b;
                j0Var.f54996c = null;
                uy uyVar = j0Var.f54994a;
                if (uyVar != null) {
                    uyVar.b();
                    return;
                }
                return;
            default:
                this.f54957b.b();
                return;
        }
    }
}
