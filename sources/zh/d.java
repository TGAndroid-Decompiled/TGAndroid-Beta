package zh;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f48335a;
    public final l f48336b;

    public d(l lVar, int i10) {
        this.f48335a = i10;
        this.f48336b = lVar;
    }

    @Override
    public final void run() {
        switch (this.f48335a) {
            case 0:
                this.f48336b.p(true, false);
                return;
            case 1:
                l lVar = this.f48336b;
                bi.x4 x4Var = lVar.J;
                if (x4Var != null) {
                    x4Var.e(true);
                }
                lVar.f48603e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f48336b.c();
                return;
        }
    }
}
