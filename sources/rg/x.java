package rg;

import android.view.View;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.PremiumPreviewFragment;
public final class x implements a2, cl0 {
    public final int f42486a;
    public final j0 f42487b;

    public x(j0 j0Var, int i10) {
        this.f42486a = i10;
        this.f42487b = j0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        j0 j0Var = this.f42487b;
        j0Var.d.getOnItemClickListener().d(i10, view);
        if (j0Var.f42268h0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f42486a) {
            case 0:
                j0 j0Var = this.f42487b;
                j0Var.K0.presentFragment(new PremiumPreviewFragment(0, null));
                j0Var.dismiss();
                b2Var.dismiss();
                return;
            case 1:
                b2Var.dismiss();
                this.f42487b.n1();
                return;
            default:
                this.f42487b.dismiss();
                tg.n1.e0(0, null);
                return;
        }
    }
}
