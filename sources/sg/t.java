package sg;

import org.telegram.ui.Components.eb0;
public final class t implements Runnable {
    public final int f48475a;
    public final b0 f48476b;

    public t(b0 b0Var, int i10) {
        this.f48475a = i10;
        this.f48476b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f48475a) {
            case 0:
                this.f48476b.f48275a.invalidate();
                return;
            default:
                b0 b0Var = this.f48476b;
                ph.k kVar = b0Var.f48277c;
                if (kVar.getParent() != null) {
                    if (b0Var.d) {
                        org.telegram.messenger.i0.E2(kVar);
                    } else {
                        try {
                            b0Var.f48276b.removeView(kVar);
                        } catch (Exception unused) {
                        }
                    }
                    eb0 eb0Var = b0Var.f48287p;
                    if (eb0Var != null) {
                        eb0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
