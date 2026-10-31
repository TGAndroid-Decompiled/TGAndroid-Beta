package th;

import org.telegram.ui.PremiumPreviewFragment;
public final class d implements Runnable {
    public final int f48859a;
    public final m f48860b;

    public d(m mVar, int i10) {
        this.f48859a = i10;
        this.f48860b = mVar;
    }

    @Override
    public final void run() {
        switch (this.f48859a) {
            case 0:
                this.f48860b.p(true, false);
                return;
            case 1:
                m mVar = this.f48860b;
                vh.p2 p2Var = mVar.J;
                if (p2Var != null) {
                    p2Var.e(true);
                }
                mVar.f49202e0.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            default:
                this.f48860b.c();
                return;
        }
    }
}
