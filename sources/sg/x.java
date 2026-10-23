package sg;

import android.view.View;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.PremiumPreviewFragment;
public final class x implements org.telegram.ui.ActionBar.z1, cm0 {
    public final int f46932a;
    public final j0 f46933b;

    public x(j0 j0Var, int i10) {
        this.f46932a = i10;
        this.f46933b = j0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        j0 j0Var = this.f46933b;
        j0Var.d.getOnItemClickListener().d(i10, view);
        if (j0Var.f46713h0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void g(c2 c2Var, int i10) {
        switch (this.f46932a) {
            case 0:
                j0 j0Var = this.f46933b;
                j0Var.K0.presentFragment(new PremiumPreviewFragment(0, null));
                j0Var.dismiss();
                c2Var.dismiss();
                return;
            case 1:
                c2Var.dismiss();
                this.f46933b.r1();
                return;
            default:
                this.f46933b.dismiss();
                ug.l1.e0(0, null);
                return;
        }
    }
}
