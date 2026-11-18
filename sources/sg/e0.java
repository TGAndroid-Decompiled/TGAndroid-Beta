package sg;

import org.telegram.ui.Components.hn;
public final class e0 implements Runnable {
    public final int f57184a;
    public final i0 f57185b;

    public e0(i0 i0Var, int i7) {
        this.f57184a = i7;
        this.f57185b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f57184a) {
            case 0:
                i0 i0Var = this.f57185b;
                i0Var.f57223c = null;
                hn hnVar = i0Var.f57221a;
                if (hnVar != null) {
                    hnVar.l();
                    return;
                }
                return;
            default:
                this.f57185b.b();
                return;
        }
    }
}
