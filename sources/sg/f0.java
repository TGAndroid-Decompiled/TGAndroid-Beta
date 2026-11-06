package sg;

import org.telegram.ui.Components.uy;
public final class f0 implements Runnable {
    public final int f54955a;
    public final j0 f54956b;

    public f0(j0 j0Var, int i7) {
        this.f54955a = i7;
        this.f54956b = j0Var;
    }

    @Override
    public final void run() {
        switch (this.f54955a) {
            case 0:
                j0 j0Var = this.f54956b;
                j0Var.f54995c = null;
                uy uyVar = j0Var.f54993a;
                if (uyVar != null) {
                    uyVar.b();
                    return;
                }
                return;
            default:
                this.f54956b.b();
                return;
        }
    }
}
