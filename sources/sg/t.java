package sg;

import org.telegram.ui.Components.eb0;
public final class t implements Runnable {
    public final int f48486a;
    public final b0 f48487b;

    public t(b0 b0Var, int i10) {
        this.f48486a = i10;
        this.f48487b = b0Var;
    }

    @Override
    public final void run() {
        switch (this.f48486a) {
            case 0:
                this.f48487b.f48286a.invalidate();
                return;
            default:
                b0 b0Var = this.f48487b;
                ph.k kVar = b0Var.f48288c;
                if (kVar.getParent() != null) {
                    if (b0Var.d) {
                        org.telegram.messenger.i0.E2(kVar);
                    } else {
                        try {
                            b0Var.f48287b.removeView(kVar);
                        } catch (Exception unused) {
                        }
                    }
                    eb0 eb0Var = b0Var.f48298p;
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
