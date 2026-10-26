package tg;

import android.view.View;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.PremiumPreviewFragment;
public final class x implements b2, bm0 {
    public final int f49112a;
    public final j0 f49113b;

    public x(j0 j0Var, int i10) {
        this.f49112a = i10;
        this.f49113b = j0Var;
    }

    @Override
    public boolean c(int i10, View view) {
        j0 j0Var = this.f49113b;
        j0Var.d.getOnItemClickListener().c(i10, view);
        if (j0Var.f48891h0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void h(e2 e2Var, int i10) {
        switch (this.f49112a) {
            case 0:
                j0 j0Var = this.f49113b;
                j0Var.K0.presentFragment(new PremiumPreviewFragment(0, null));
                j0Var.dismiss();
                e2Var.dismiss();
                return;
            case 1:
                e2Var.dismiss();
                this.f49113b.r1();
                return;
            default:
                this.f49113b.dismiss();
                vg.n1.e0(0, null);
                return;
        }
    }
}
