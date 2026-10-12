package sg;

import android.view.View;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.PremiumPreviewFragment;
public final class x implements org.telegram.ui.ActionBar.z1, cm0 {
    public final int f45421a;
    public final j0 f45422b;

    public x(j0 j0Var, int i10) {
        this.f45421a = i10;
        this.f45422b = j0Var;
    }

    @Override
    public boolean a(int i10, View view) {
        j0 j0Var = this.f45422b;
        j0Var.d.getOnItemClickListener().a(i10, view);
        if (j0Var.f45210h0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f45421a) {
            case 0:
                j0 j0Var = this.f45422b;
                j0Var.K0.presentFragment(new PremiumPreviewFragment(0, null));
                j0Var.dismiss();
                a2Var.dismiss();
                return;
            case 1:
                a2Var.dismiss();
                this.f45422b.o1();
                return;
            default:
                this.f45422b.dismiss();
                ug.m1.f0(0, null);
                return;
        }
    }
}
