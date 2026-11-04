package tg;

import org.telegram.ui.Components.nh;
public final class f0 implements Runnable {
    public final int f55158a;
    public final i0 f55159b;

    public f0(i0 i0Var, int i3) {
        this.f55158a = i3;
        this.f55159b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f55158a) {
            case 0:
                i0 i0Var = this.f55159b;
                i0Var.f55191c = null;
                nh nhVar = i0Var.f55189a;
                if (nhVar != null) {
                    nhVar.x();
                    return;
                }
                return;
            default:
                this.f55159b.b();
                return;
        }
    }
}
