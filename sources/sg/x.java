package sg;

import android.view.View;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.PremiumPreviewFragment;
public final class x implements a2, yl0 {
    public final int f46523a;
    public final j0 f46524b;

    public x(j0 j0Var, int i10) {
        this.f46523a = i10;
        this.f46524b = j0Var;
    }

    @Override
    public boolean a(int i10, View view) {
        j0 j0Var = this.f46524b;
        j0Var.d.getOnItemClickListener().a(i10, view);
        if (j0Var.f46305h0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f46523a) {
            case 0:
                j0 j0Var = this.f46524b;
                j0Var.K0.presentFragment(new PremiumPreviewFragment(0, null));
                j0Var.dismiss();
                b2Var.dismiss();
                return;
            case 1:
                b2Var.dismiss();
                this.f46524b.o1();
                return;
            default:
                this.f46524b.dismiss();
                ug.m1.f0(0, null);
                return;
        }
    }
}
