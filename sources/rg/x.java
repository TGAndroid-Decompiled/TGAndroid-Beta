package rg;

import android.view.View;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.PremiumPreviewFragment;
public final class x implements b2, cl0 {
    public final int f42557a;
    public final j0 f42558b;

    public x(j0 j0Var, int i10) {
        this.f42557a = i10;
        this.f42558b = j0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        j0 j0Var = this.f42558b;
        j0Var.d.getOnItemClickListener().d(i10, view);
        if (j0Var.f42339h0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void f(c2 c2Var, int i10) {
        switch (this.f42557a) {
            case 0:
                j0 j0Var = this.f42558b;
                j0Var.K0.presentFragment(new PremiumPreviewFragment(0, null));
                j0Var.dismiss();
                c2Var.dismiss();
                return;
            case 1:
                c2Var.dismiss();
                this.f42558b.n1();
                return;
            default:
                this.f42558b.dismiss();
                tg.n1.e0(0, null);
                return;
        }
    }
}
