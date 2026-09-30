package rg;

import android.view.View;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.PremiumPreviewFragment;
public final class x implements org.telegram.ui.ActionBar.z1, ol0 {
    public final int f42821a;
    public final j0 f42822b;

    public x(j0 j0Var, int i10) {
        this.f42821a = i10;
        this.f42822b = j0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        j0 j0Var = this.f42822b;
        j0Var.d.getOnItemClickListener().d(i10, view);
        if (j0Var.f42603h0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void f(a2 a2Var, int i10) {
        switch (this.f42821a) {
            case 0:
                j0 j0Var = this.f42822b;
                j0Var.K0.presentFragment(new PremiumPreviewFragment(0, null));
                j0Var.dismiss();
                a2Var.dismiss();
                return;
            case 1:
                a2Var.dismiss();
                this.f42822b.n1();
                return;
            default:
                this.f42822b.dismiss();
                tg.m1.e0(0, null);
                return;
        }
    }
}
