package rg;

import android.view.View;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.PremiumPreviewFragment;
public final class x implements org.telegram.ui.ActionBar.a2, gm0 {
    public final int f47506a;
    public final j0 f47507b;

    public x(j0 j0Var, int i10) {
        this.f47506a = i10;
        this.f47507b = j0Var;
    }

    @Override
    public boolean d(int i10, View view) {
        j0 j0Var = this.f47507b;
        j0Var.d.getOnItemClickListener().d(i10, view);
        if (j0Var.f47279h0 != 19) {
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f47506a) {
            case 0:
                j0 j0Var = this.f47507b;
                j0Var.K0.presentFragment(new PremiumPreviewFragment(0, null));
                j0Var.dismiss();
                b2Var.dismiss();
                return;
            case 1:
                b2Var.dismiss();
                this.f47507b.o1();
                return;
            default:
                this.f47507b.dismiss();
                tg.m1.f0(0, null);
                return;
        }
    }
}
