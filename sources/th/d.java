package th;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f48873a;
    public final m f48874b;

    public d(m mVar, int i10) {
        this.f48873a = i10;
        this.f48874b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f48873a) {
            case 0:
                this.f48874b.p(true, false);
                return;
            case 1:
                m mVar = this.f48874b;
                vh.p2 p2Var = mVar.J;
                if (p2Var != null) {
                    p2Var.e(true);
                }
                mVar.f49216e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f48874b.c();
                return;
        }
    }
}
